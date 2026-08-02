package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletBulletinsTile$Data$Bulletin$InfoSheet$Bullet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet((BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet.Icon) obj, (LocalizedString) obj2, (Icon) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet.Icon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet bullet = (BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet) obj;
        reverseProtoWriter.getClass();
        bullet.getClass();
        reverseProtoWriter.writeBytes(bullet.unknownFields());
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, bullet.arcade_icon);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, bullet.text);
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bullet.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet bullet = (BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet) obj;
        bullet.getClass();
        return Icon.ADAPTER.encodedSizeWithTag(3, bullet.arcade_icon) + LocalizedString.ADAPTER.encodedSizeWithTag(2, bullet.text) + BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet.Icon.ADAPTER.encodedSizeWithTag(1, bullet.icon) + bullet.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet bullet = (BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet) obj;
        bullet.getClass();
        LocalizedString localizedString = bullet.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Icon icon = bullet.arcade_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        ByteString byteString = ByteString.EMPTY;
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet.Icon icon3 = bullet.icon;
        byteString.getClass();
        return new BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet(icon3, localizedString2, icon2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet bullet = (BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet) obj;
        bullet.getClass();
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet.Icon.ADAPTER.encodeWithTag(protoWriter, 1, bullet.icon);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, bullet.text);
        Icon.ADAPTER.encodeWithTag(protoWriter, 3, bullet.arcade_icon);
        protoWriter.writeBytes(bullet.unknownFields());
    }
}
