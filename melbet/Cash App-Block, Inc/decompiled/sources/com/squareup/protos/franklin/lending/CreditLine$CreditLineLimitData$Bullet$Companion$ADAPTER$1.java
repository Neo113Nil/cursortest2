package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreditLine$CreditLineLimitData$Bullet$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CreditLine.CreditLineLimitData.Bullet((String) obj, (CreditLine.CreditLineLimitData.Bullet.Icon) obj2, (LocalizableString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = CreditLine.CreditLineLimitData.Bullet.Icon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditLine.CreditLineLimitData.Bullet bullet = (CreditLine.CreditLineLimitData.Bullet) obj;
        reverseProtoWriter.getClass();
        bullet.getClass();
        reverseProtoWriter.writeBytes(bullet.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, bullet.localizable_text);
        CreditLine.CreditLineLimitData.Bullet.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 2, bullet.icon);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, bullet.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreditLine.CreditLineLimitData.Bullet bullet = (CreditLine.CreditLineLimitData.Bullet) obj;
        bullet.getClass();
        return LocalizableString.ADAPTER.encodedSizeWithTag(3, bullet.localizable_text) + CreditLine.CreditLineLimitData.Bullet.Icon.ADAPTER.encodedSizeWithTag(2, bullet.icon) + ProtoAdapter.STRING.encodedSizeWithTag(1, bullet.text) + bullet.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditLine.CreditLineLimitData.Bullet bullet = (CreditLine.CreditLineLimitData.Bullet) obj;
        bullet.getClass();
        LocalizableString localizableString = bullet.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = bullet.text;
        CreditLine.CreditLineLimitData.Bullet.Icon icon = bullet.icon;
        byteString.getClass();
        return new CreditLine.CreditLineLimitData.Bullet(str, icon, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditLine.CreditLineLimitData.Bullet bullet = (CreditLine.CreditLineLimitData.Bullet) obj;
        bullet.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bullet.text);
        CreditLine.CreditLineLimitData.Bullet.Icon.ADAPTER.encodeWithTag(protoWriter, 2, bullet.icon);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 3, bullet.localizable_text);
        protoWriter.writeBytes(bullet.unknownFields());
    }
}
