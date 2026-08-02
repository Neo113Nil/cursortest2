package com.squareup.protos.franklin.app;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.BitcoinAppletConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BitcoinAppletConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BitcoinAppletConfig(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    BitcoinAppletConfig.BitcoinWidgetId.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BitcoinAppletConfig bitcoinAppletConfig = (BitcoinAppletConfig) obj;
        reverseProtoWriter.getClass();
        bitcoinAppletConfig.getClass();
        reverseProtoWriter.writeBytes(bitcoinAppletConfig.unknownFields());
        BitcoinAppletConfig.BitcoinWidgetId.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, bitcoinAppletConfig.home_widget_allowlist);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BitcoinAppletConfig bitcoinAppletConfig = (BitcoinAppletConfig) obj;
        bitcoinAppletConfig.getClass();
        return BitcoinAppletConfig.BitcoinWidgetId.ADAPTER.asRepeated().encodedSizeWithTag(1, bitcoinAppletConfig.home_widget_allowlist) + bitcoinAppletConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BitcoinAppletConfig bitcoinAppletConfig = (BitcoinAppletConfig) obj;
        bitcoinAppletConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = bitcoinAppletConfig.home_widget_allowlist;
        list.getClass();
        byteString.getClass();
        return new BitcoinAppletConfig(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BitcoinAppletConfig bitcoinAppletConfig = (BitcoinAppletConfig) obj;
        bitcoinAppletConfig.getClass();
        BitcoinAppletConfig.BitcoinWidgetId.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, bitcoinAppletConfig.home_widget_allowlist);
        protoWriter.writeBytes(bitcoinAppletConfig.unknownFields());
    }
}
