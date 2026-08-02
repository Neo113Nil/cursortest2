package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$OrderingReorderingData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalProfileWidget.OrderingReorderingData(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalProfileWidget.OrderingReorderingData orderingReorderingData = (LocalProfileWidget.OrderingReorderingData) obj;
        reverseProtoWriter.getClass();
        orderingReorderingData.getClass();
        reverseProtoWriter.writeBytes(orderingReorderingData.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalProfileWidget.OrderingReorderingData orderingReorderingData = (LocalProfileWidget.OrderingReorderingData) obj;
        orderingReorderingData.getClass();
        return orderingReorderingData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((LocalProfileWidget.OrderingReorderingData) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalProfileWidget.OrderingReorderingData(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalProfileWidget.OrderingReorderingData orderingReorderingData = (LocalProfileWidget.OrderingReorderingData) obj;
        orderingReorderingData.getClass();
        protoWriter.writeBytes(orderingReorderingData.unknownFields());
    }
}
