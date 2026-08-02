package com.squareup.protos.cash.cashlimitsxp.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.cashlimitsxp.api.v1.Empty;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetInlineMessageRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetInlineMessageRequest> CREATOR;

    static {
        GetInlineMessageRequest$Companion$ADAPTER$1 getInlineMessageRequest$Companion$ADAPTER$1 = new GetInlineMessageRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetInlineMessageRequest.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetInlineMessageRequest", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/inline_message.proto");
        ADAPTER = getInlineMessageRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getInlineMessageRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInlineMessageRequest(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetInlineMessageRequest) && Intrinsics.areEqual(unknownFields(), ((GetInlineMessageRequest) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Empty.Builder builder = new Empty.Builder(9);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "GetInlineMessageRequest{}";
    }
}
