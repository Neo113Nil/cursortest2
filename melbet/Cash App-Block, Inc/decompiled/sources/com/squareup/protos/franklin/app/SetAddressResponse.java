package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import okio.Path;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/SetAddressResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/bankbook/Institution$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SetAddressResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetAddressResponse> CREATOR;
    public final GlobalAddress postal_address;
    public final ResponseContext response_context;
    public final Status status;

    /* loaded from: classes.dex */
    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1),
        CONCURRENT_MODIFICATION(2),
        FAILURE(3);

        public static final SetAddressResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final Path.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new Path.Companion();
            ADAPTER = new SetAddressResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVALID;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return CONCURRENT_MODIFICATION;
            }
            if (i != 3) {
                return null;
            }
            return FAILURE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SetAddressResponse$Companion$ADAPTER$1 setAddressResponse$Companion$ADAPTER$1 = new SetAddressResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetAddressResponse.class), "type.googleapis.com/squareup.franklin.app.SetAddressResponse", Syntax.PROTO_2, null, "squareup/franklin/app/address.proto");
        ADAPTER = setAddressResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setAddressResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetAddressResponse(ResponseContext responseContext, Status status, GlobalAddress globalAddress, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.status = status;
        this.postal_address = globalAddress;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetAddressResponse)) {
            return false;
        }
        SetAddressResponse setAddressResponse = (SetAddressResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setAddressResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, setAddressResponse.response_context) && this.status == setAddressResponse.status && Intrinsics.areEqual(this.postal_address, setAddressResponse.postal_address);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode3 = (hashCode2 + (status != null ? status.hashCode() : 0)) * 37;
        GlobalAddress globalAddress = this.postal_address;
        int hashCode4 = hashCode3 + (globalAddress != null ? globalAddress.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(1, false);
        builder.institution_token = this.response_context;
        builder.display_info = this.status;
        builder.help_menu_items = this.postal_address;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        if (this.postal_address != null) {
            arrayList.add("postal_address=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetAddressResponse{", "}", 0, null, null, 56);
    }
}
