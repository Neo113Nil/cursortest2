package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TotalBalanceSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TotalBalanceSection((LocalizedString) obj, (TappableIcon) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(TappableIcon.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TotalBalanceSection totalBalanceSection = (TotalBalanceSection) obj;
        reverseProtoWriter.getClass();
        totalBalanceSection.getClass();
        reverseProtoWriter.writeBytes(totalBalanceSection.unknownFields());
        TappableIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 2, totalBalanceSection.icon);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, totalBalanceSection.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TotalBalanceSection totalBalanceSection = (TotalBalanceSection) obj;
        totalBalanceSection.getClass();
        return TappableIcon.ADAPTER.encodedSizeWithTag(2, totalBalanceSection.icon) + LocalizedString.ADAPTER.encodedSizeWithTag(1, totalBalanceSection.text) + totalBalanceSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TotalBalanceSection totalBalanceSection = (TotalBalanceSection) obj;
        totalBalanceSection.getClass();
        LocalizedString localizedString = totalBalanceSection.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        TappableIcon tappableIcon = totalBalanceSection.icon;
        TappableIcon tappableIcon2 = tappableIcon != null ? (TappableIcon) TappableIcon.ADAPTER.redact(tappableIcon) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TotalBalanceSection(localizedString2, tappableIcon2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TotalBalanceSection totalBalanceSection = (TotalBalanceSection) obj;
        totalBalanceSection.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, totalBalanceSection.text);
        TappableIcon.ADAPTER.encodeWithTag(protoWriter, 2, totalBalanceSection.icon);
        protoWriter.writeBytes(totalBalanceSection.unknownFields());
    }
}
