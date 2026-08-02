package com.squareup.lending;

import androidx.room.TransactorKt;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData$Graphic$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreHomeData.Graphic((Image) obj, (CashCreditScoreHomeData.Graphic.Card) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.Graphic.Card.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreHomeData.Graphic graphic = (CashCreditScoreHomeData.Graphic) obj;
        reverseProtoWriter.getClass();
        graphic.getClass();
        reverseProtoWriter.writeBytes(graphic.unknownFields());
        CashCreditScoreHomeData.Graphic.Card.ADAPTER.encodeWithTag(reverseProtoWriter, 2, graphic.card);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, graphic.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreHomeData.Graphic graphic = (CashCreditScoreHomeData.Graphic) obj;
        graphic.getClass();
        return CashCreditScoreHomeData.Graphic.Card.ADAPTER.encodedSizeWithTag(2, graphic.card) + Image.ADAPTER.encodedSizeWithTag(1, graphic.image) + graphic.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreHomeData.Graphic graphic = (CashCreditScoreHomeData.Graphic) obj;
        graphic.getClass();
        Image image = graphic.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        CashCreditScoreHomeData.Graphic.Card card = graphic.card;
        CashCreditScoreHomeData.Graphic.Card card2 = card != null ? (CashCreditScoreHomeData.Graphic.Card) CashCreditScoreHomeData.Graphic.Card.ADAPTER.redact(card) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashCreditScoreHomeData.Graphic(image2, card2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreHomeData.Graphic graphic = (CashCreditScoreHomeData.Graphic) obj;
        graphic.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, graphic.image);
        CashCreditScoreHomeData.Graphic.Card.ADAPTER.encodeWithTag(protoWriter, 2, graphic.card);
        protoWriter.writeBytes(graphic.unknownFields());
    }
}
