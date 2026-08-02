package com.squareup.protos.cash.money.content;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MoneyTab$Applet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MoneyTab.Applet((MoneyTab.Applet.Id) obj, (MoneyTab.Applet.Banner) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = MoneyTab.Applet.Id.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(MoneyTab.Applet.Banner.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneyTab.Applet applet = (MoneyTab.Applet) obj;
        reverseProtoWriter.getClass();
        applet.getClass();
        reverseProtoWriter.writeBytes(applet.unknownFields());
        MoneyTab.Applet.Banner.ADAPTER.encodeWithTag(reverseProtoWriter, 2, applet.banner);
        MoneyTab.Applet.Id.ADAPTER.encodeWithTag(reverseProtoWriter, 1, applet.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneyTab.Applet applet = (MoneyTab.Applet) obj;
        applet.getClass();
        return MoneyTab.Applet.Banner.ADAPTER.encodedSizeWithTag(2, applet.banner) + MoneyTab.Applet.Id.ADAPTER.encodedSizeWithTag(1, applet.id) + applet.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneyTab.Applet applet = (MoneyTab.Applet) obj;
        applet.getClass();
        MoneyTab.Applet.Banner banner = applet.banner;
        MoneyTab.Applet.Banner banner2 = banner != null ? (MoneyTab.Applet.Banner) MoneyTab.Applet.Banner.ADAPTER.redact(banner) : null;
        ByteString byteString = ByteString.EMPTY;
        MoneyTab.Applet.Id id = applet.id;
        byteString.getClass();
        return new MoneyTab.Applet(id, banner2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneyTab.Applet applet = (MoneyTab.Applet) obj;
        applet.getClass();
        MoneyTab.Applet.Id.ADAPTER.encodeWithTag(protoWriter, 1, applet.id);
        MoneyTab.Applet.Banner.ADAPTER.encodeWithTag(protoWriter, 2, applet.banner);
        protoWriter.writeBytes(applet.unknownFields());
    }
}
