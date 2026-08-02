package com.squareup.lending;

import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$UnknownContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseCashCardAppletData.UnknownContent(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseCashCardAppletData.UnknownContent unknownContent = (PrepurchaseCashCardAppletData.UnknownContent) obj;
        reverseProtoWriter.getClass();
        unknownContent.getClass();
        reverseProtoWriter.writeBytes(unknownContent.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseCashCardAppletData.UnknownContent unknownContent = (PrepurchaseCashCardAppletData.UnknownContent) obj;
        unknownContent.getClass();
        return unknownContent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((PrepurchaseCashCardAppletData.UnknownContent) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PrepurchaseCashCardAppletData.UnknownContent(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseCashCardAppletData.UnknownContent unknownContent = (PrepurchaseCashCardAppletData.UnknownContent) obj;
        unknownContent.getClass();
        protoWriter.writeBytes(unknownContent.unknownFields());
    }
}
