package com.squareup.protos.cash.whimsicard.syncentity;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardSkinAssets$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardSkinAssets(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CardSkinAsset.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardSkinAssets cardSkinAssets = (CardSkinAssets) obj;
        reverseProtoWriter.getClass();
        cardSkinAssets.getClass();
        reverseProtoWriter.writeBytes(cardSkinAssets.unknownFields());
        CardSkinAsset.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, cardSkinAssets.skins);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardSkinAssets cardSkinAssets = (CardSkinAssets) obj;
        cardSkinAssets.getClass();
        return CardSkinAsset.ADAPTER.asRepeated().encodedSizeWithTag(1, cardSkinAssets.skins) + cardSkinAssets.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardSkinAssets cardSkinAssets = (CardSkinAssets) obj;
        cardSkinAssets.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cardSkinAssets.skins, CardSkinAsset.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardSkinAssets(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardSkinAssets cardSkinAssets = (CardSkinAssets) obj;
        cardSkinAssets.getClass();
        CardSkinAsset.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, cardSkinAssets.skins);
        protoWriter.writeBytes(cardSkinAssets.unknownFields());
    }
}
