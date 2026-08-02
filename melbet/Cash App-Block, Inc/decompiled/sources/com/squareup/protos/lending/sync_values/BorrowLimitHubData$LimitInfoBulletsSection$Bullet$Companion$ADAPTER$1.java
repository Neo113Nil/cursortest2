package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowLimitHubData$LimitInfoBulletsSection$Bullet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowLimitHubData.LimitInfoBulletsSection.Bullet((Icon) obj, (LocalizedString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowLimitHubData.LimitInfoBulletsSection.Bullet bullet = (BorrowLimitHubData.LimitInfoBulletsSection.Bullet) obj;
        reverseProtoWriter.getClass();
        bullet.getClass();
        reverseProtoWriter.writeBytes(bullet.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, bullet.text);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bullet.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowLimitHubData.LimitInfoBulletsSection.Bullet bullet = (BorrowLimitHubData.LimitInfoBulletsSection.Bullet) obj;
        bullet.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(2, bullet.text) + Icon.ADAPTER.encodedSizeWithTag(1, bullet.icon) + bullet.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowLimitHubData.LimitInfoBulletsSection.Bullet bullet = (BorrowLimitHubData.LimitInfoBulletsSection.Bullet) obj;
        bullet.getClass();
        Icon icon = bullet.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        LocalizedString localizedString = bullet.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowLimitHubData.LimitInfoBulletsSection.Bullet(icon2, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowLimitHubData.LimitInfoBulletsSection.Bullet bullet = (BorrowLimitHubData.LimitInfoBulletsSection.Bullet) obj;
        bullet.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 1, bullet.icon);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, bullet.text);
        protoWriter.writeBytes(bullet.unknownFields());
    }
}
