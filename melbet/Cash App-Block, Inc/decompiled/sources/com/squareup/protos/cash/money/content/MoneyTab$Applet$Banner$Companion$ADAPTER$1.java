package com.squareup.protos.cash.money.content;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MoneyTab$Applet$Banner$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new MoneyTab.Applet.Banner((LocalizedString) obj, (LocalizedString) obj2, (Image) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneyTab.Applet.Banner banner = (MoneyTab.Applet.Banner) obj;
        reverseProtoWriter.getClass();
        banner.getClass();
        reverseProtoWriter.writeBytes(banner.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, banner.image);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, banner.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, banner.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneyTab.Applet.Banner banner = (MoneyTab.Applet.Banner) obj;
        banner.getClass();
        int size$okio = banner.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return Image.ADAPTER.encodedSizeWithTag(3, banner.image) + protoAdapter.encodedSizeWithTag(2, banner.body) + protoAdapter.encodedSizeWithTag(1, banner.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneyTab.Applet.Banner banner = (MoneyTab.Applet.Banner) obj;
        banner.getClass();
        LocalizedString localizedString = banner.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = banner.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Image image = banner.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new MoneyTab.Applet.Banner(localizedString2, localizedString4, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneyTab.Applet.Banner banner = (MoneyTab.Applet.Banner) obj;
        banner.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, banner.title);
        protoAdapter.encodeWithTag(protoWriter, 2, banner.body);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, banner.image);
        protoWriter.writeBytes(banner.unknownFields());
    }
}
