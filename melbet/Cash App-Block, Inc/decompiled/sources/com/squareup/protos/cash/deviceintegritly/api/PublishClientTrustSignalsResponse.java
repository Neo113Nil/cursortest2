package com.squareup.protos.cash.deviceintegritly.api;

import android.os.Parcelable;
import com.squareup.protos.cash.cashlimitsxp.api.v1.Empty;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/deviceintegritly/api/PublishClientTrustSignalsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashlimitsxp/api/v1/Empty$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PublishClientTrustSignalsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PublishClientTrustSignalsResponse> CREATOR;

    static {
        PublishClientTrustSignalsResponse$Companion$ADAPTER$1 publishClientTrustSignalsResponse$Companion$ADAPTER$1 = new PublishClientTrustSignalsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PublishClientTrustSignalsResponse.class), "type.googleapis.com/squareup.cash.deviceintegritly.api.PublishClientTrustSignalsResponse", Syntax.PROTO_2, null, "squareup/cash/deviceintegritly/api/client_trust_signals.proto");
        ADAPTER = publishClientTrustSignalsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(publishClientTrustSignalsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishClientTrustSignalsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PublishClientTrustSignalsResponse) && Intrinsics.areEqual(unknownFields(), ((PublishClientTrustSignalsResponse) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Empty.Builder builder = new Empty.Builder(23);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "PublishClientTrustSignalsResponse{}";
    }
}
