package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetFeedResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetFeedResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Operation.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetFeedResponse getFeedResponse = (GetFeedResponse) obj;
        reverseProtoWriter.getClass();
        getFeedResponse.getClass();
        reverseProtoWriter.writeBytes(getFeedResponse.unknownFields());
        Operation.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getFeedResponse.f1251operations);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetFeedResponse getFeedResponse = (GetFeedResponse) obj;
        getFeedResponse.getClass();
        return Operation.ADAPTER.asRepeated().encodedSizeWithTag(1, getFeedResponse.f1251operations) + getFeedResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetFeedResponse getFeedResponse = (GetFeedResponse) obj;
        getFeedResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getFeedResponse.f1251operations, Operation.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetFeedResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetFeedResponse getFeedResponse = (GetFeedResponse) obj;
        getFeedResponse.getClass();
        Operation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getFeedResponse.f1251operations);
        protoWriter.writeBytes(getFeedResponse.unknownFields());
    }
}
