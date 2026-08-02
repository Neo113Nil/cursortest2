package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletBulletinsTile$Data$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowAppletBulletinsTile.Data(m, (BorrowAppletBulletinsTile.Data.UpsellCard) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BorrowAppletBulletinsTile.Data.Bulletin.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(BorrowAppletBulletinsTile.Data.UpsellCard.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletBulletinsTile.Data data = (BorrowAppletBulletinsTile.Data) obj;
        reverseProtoWriter.getClass();
        data.getClass();
        reverseProtoWriter.writeBytes(data.unknownFields());
        BorrowAppletBulletinsTile.Data.UpsellCard.ADAPTER.encodeWithTag(reverseProtoWriter, 2, data.upsell_card);
        BorrowAppletBulletinsTile.Data.Bulletin.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, data.bulletins);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletBulletinsTile.Data data = (BorrowAppletBulletinsTile.Data) obj;
        data.getClass();
        return BorrowAppletBulletinsTile.Data.UpsellCard.ADAPTER.encodedSizeWithTag(2, data.upsell_card) + BorrowAppletBulletinsTile.Data.Bulletin.ADAPTER.asRepeated().encodedSizeWithTag(1, data.bulletins) + data.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletBulletinsTile.Data data = (BorrowAppletBulletinsTile.Data) obj;
        data.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(data.bulletins, BorrowAppletBulletinsTile.Data.Bulletin.ADAPTER);
        BorrowAppletBulletinsTile.Data.UpsellCard upsellCard = data.upsell_card;
        BorrowAppletBulletinsTile.Data.UpsellCard upsellCard2 = upsellCard != null ? (BorrowAppletBulletinsTile.Data.UpsellCard) BorrowAppletBulletinsTile.Data.UpsellCard.ADAPTER.redact(upsellCard) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowAppletBulletinsTile.Data(m1169redactElements, upsellCard2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletBulletinsTile.Data data = (BorrowAppletBulletinsTile.Data) obj;
        data.getClass();
        BorrowAppletBulletinsTile.Data.Bulletin.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, data.bulletins);
        BorrowAppletBulletinsTile.Data.UpsellCard.ADAPTER.encodeWithTag(protoWriter, 2, data.upsell_card);
        protoWriter.writeBytes(data.unknownFields());
    }
}
