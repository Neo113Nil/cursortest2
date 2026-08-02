package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.franklin.app.SetAmountRequest;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/VerifyContactsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/SetAmountRequest$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VerifyContactsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifyContactsResponse> CREATOR;
    public final ResponseContext response_context;
    public final Status status;

    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1),
        FAILURE(2),
        TOO_MANY_ATTEMPTS(3),
        CONCURRENT_MODIFICATION(4);

        public static final VerifyContactsResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final PoolVisibility.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new PoolVisibility.Companion();
            ADAPTER = new VerifyContactsResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            return PoolVisibility.Companion.m3915fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        VerifyContactsResponse$Companion$ADAPTER$1 verifyContactsResponse$Companion$ADAPTER$1 = new VerifyContactsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VerifyContactsResponse.class), "type.googleapis.com/squareup.franklin.app.VerifyContactsResponse", Syntax.PROTO_2, null, "squareup/franklin/app/contacts.proto");
        ADAPTER = verifyContactsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(verifyContactsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyContactsResponse(ResponseContext responseContext, Status status, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.status = status;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyContactsResponse)) {
            return false;
        }
        VerifyContactsResponse verifyContactsResponse = (VerifyContactsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), verifyContactsResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, verifyContactsResponse.response_context) && this.status == verifyContactsResponse.status;
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
        int hashCode3 = hashCode2 + (status != null ? status.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetAmountRequest.Builder builder = new SetAmountRequest.Builder(25);
        builder.request_context = this.response_context;
        builder.result = this.status;
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifyContactsResponse{", "}", 0, null, null, 56);
    }
}
