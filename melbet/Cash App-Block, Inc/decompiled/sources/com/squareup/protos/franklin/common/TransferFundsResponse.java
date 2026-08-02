package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.lynx.api.v1_0.CompleteStripeLinkResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/common/TransferFundsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/TransferFundsResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransferFundsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TransferFundsResponse> CREATOR;
    public final String passcode_token;
    public final ResponseContext response_context;
    public final String status_text;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String passcode_token;
        public ResponseContext response_context;
        public String status_text;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new TransferFundsResponse(this.response_context, this.passcode_token, this.status_text, buildUnknownFields());
                default:
                    return new CompleteStripeLinkResponse(this.response_context, this.passcode_token, this.status_text, buildUnknownFields());
            }
        }
    }

    static {
        TransferFundsResponse$Companion$ADAPTER$1 transferFundsResponse$Companion$ADAPTER$1 = new TransferFundsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransferFundsResponse.class), "type.googleapis.com/squareup.franklin.common.TransferFundsResponse", Syntax.PROTO_2, null, "squareup/franklin/TransferFundsResponseProto.proto");
        ADAPTER = transferFundsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(transferFundsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferFundsResponse(ResponseContext responseContext, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.passcode_token = str;
        this.status_text = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransferFundsResponse)) {
            return false;
        }
        TransferFundsResponse transferFundsResponse = (TransferFundsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), transferFundsResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, transferFundsResponse.response_context) && Intrinsics.areEqual(this.passcode_token, transferFundsResponse.passcode_token) && Intrinsics.areEqual(this.status_text, transferFundsResponse.status_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        String str = this.passcode_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.status_text;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.response_context = this.response_context;
        builder.passcode_token = this.passcode_token;
        builder.status_text = this.status_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        String str = this.status_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "status_text=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TransferFundsResponse{", "}", 0, null, null, 56);
    }
}
