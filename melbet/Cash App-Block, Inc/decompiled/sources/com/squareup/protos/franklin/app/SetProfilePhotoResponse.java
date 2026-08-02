package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ActionType;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/SetProfilePhotoResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/bankbook/Institution$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SetProfilePhotoResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetProfilePhotoResponse> CREATOR;
    public final String image_url;
    public final ResponseContext response_context;
    public final Status status;

    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1);

        public static final SetProfilePhotoResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final ActionType.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new ActionType.Companion();
            ADAPTER = new SetProfilePhotoResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVALID;
            }
            if (i != 1) {
                return null;
            }
            return SUCCESS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SetProfilePhotoResponse$Companion$ADAPTER$1 setProfilePhotoResponse$Companion$ADAPTER$1 = new SetProfilePhotoResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetProfilePhotoResponse.class), "type.googleapis.com/squareup.franklin.app.SetProfilePhotoResponse", Syntax.PROTO_2, null, "squareup/franklin/app/profile_photo.proto");
        ADAPTER = setProfilePhotoResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setProfilePhotoResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetProfilePhotoResponse(Status status, String str, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = status;
        this.image_url = str;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetProfilePhotoResponse)) {
            return false;
        }
        SetProfilePhotoResponse setProfilePhotoResponse = (SetProfilePhotoResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setProfilePhotoResponse.unknownFields()) && this.status == setProfilePhotoResponse.status && Intrinsics.areEqual(this.image_url, setProfilePhotoResponse.image_url) && Intrinsics.areEqual(this.response_context, setProfilePhotoResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        String str = this.image_url;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode4 = hashCode3 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(3, false);
        builder.display_info = this.status;
        builder.institution_token = this.image_url;
        builder.help_menu_items = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        String str = this.image_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "image_url=", arrayList);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetProfilePhotoResponse{", "}", 0, null, null, 56);
    }
}
