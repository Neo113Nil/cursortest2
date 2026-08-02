package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Illustration;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletBulletinsTile$Data$UpsellCard$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowAppletBulletinsTile.Data.UpsellCard((LocalizedString) obj, (LocalizedString) obj2, (Illustration) obj3, (LocalizedString) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Illustration.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletBulletinsTile.Data.UpsellCard upsellCard = (BorrowAppletBulletinsTile.Data.UpsellCard) obj;
        reverseProtoWriter.getClass();
        upsellCard.getClass();
        reverseProtoWriter.writeBytes(upsellCard.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, upsellCard.identifier);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, upsellCard.action_url);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, upsellCard.button_text);
        Illustration.ADAPTER.encodeWithTag(reverseProtoWriter, 3, upsellCard.illustration);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, upsellCard.body_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, upsellCard.title_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletBulletinsTile.Data.UpsellCard upsellCard = (BorrowAppletBulletinsTile.Data.UpsellCard) obj;
        upsellCard.getClass();
        int size$okio = upsellCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, upsellCard.button_text) + Illustration.ADAPTER.encodedSizeWithTag(3, upsellCard.illustration) + protoAdapter.encodedSizeWithTag(2, upsellCard.body_text) + protoAdapter.encodedSizeWithTag(1, upsellCard.title_text) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter2.encodedSizeWithTag(6, upsellCard.identifier) + protoAdapter2.encodedSizeWithTag(5, upsellCard.action_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletBulletinsTile.Data.UpsellCard upsellCard = (BorrowAppletBulletinsTile.Data.UpsellCard) obj;
        upsellCard.getClass();
        LocalizedString localizedString = upsellCard.title_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = upsellCard.body_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Illustration illustration = upsellCard.illustration;
        Illustration illustration2 = illustration != null ? (Illustration) Illustration.ADAPTER.redact(illustration) : null;
        LocalizedString localizedString5 = upsellCard.button_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = upsellCard.action_url;
        String str2 = upsellCard.identifier;
        byteString.getClass();
        return new BorrowAppletBulletinsTile.Data.UpsellCard(localizedString2, localizedString4, illustration2, localizedString6, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletBulletinsTile.Data.UpsellCard upsellCard = (BorrowAppletBulletinsTile.Data.UpsellCard) obj;
        upsellCard.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, upsellCard.title_text);
        protoAdapter.encodeWithTag(protoWriter, 2, upsellCard.body_text);
        Illustration.ADAPTER.encodeWithTag(protoWriter, 3, upsellCard.illustration);
        protoAdapter.encodeWithTag(protoWriter, 4, upsellCard.button_text);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 5, upsellCard.action_url);
        protoAdapter2.encodeWithTag(protoWriter, 6, upsellCard.identifier);
        protoWriter.writeBytes(upsellCard.unknownFields());
    }
}
