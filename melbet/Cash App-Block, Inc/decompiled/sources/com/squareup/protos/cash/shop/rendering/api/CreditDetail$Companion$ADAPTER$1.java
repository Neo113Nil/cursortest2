package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreditDetail$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreditDetail((StyledText) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditDetail creditDetail = (CreditDetail) obj;
        reverseProtoWriter.getClass();
        creditDetail.getClass();
        reverseProtoWriter.writeBytes(creditDetail.unknownFields());
        StyledText.ADAPTER.encodeWithTag(reverseProtoWriter, 1, creditDetail.detail_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreditDetail creditDetail = (CreditDetail) obj;
        creditDetail.getClass();
        return StyledText.ADAPTER.encodedSizeWithTag(1, creditDetail.detail_text) + creditDetail.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditDetail creditDetail = (CreditDetail) obj;
        creditDetail.getClass();
        StyledText styledText = creditDetail.detail_text;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreditDetail(styledText2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditDetail creditDetail = (CreditDetail) obj;
        creditDetail.getClass();
        StyledText.ADAPTER.encodeWithTag(protoWriter, 1, creditDetail.detail_text);
        protoWriter.writeBytes(creditDetail.unknownFields());
    }
}
