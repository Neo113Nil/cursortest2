package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class CashLiteConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashLiteConfig((BitcoinAppletConfig) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BitcoinAppletConfig.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(CashLiteClientRoute.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashLiteConfig cashLiteConfig = (CashLiteConfig) obj;
        reverseProtoWriter.getClass();
        cashLiteConfig.getClass();
        reverseProtoWriter.writeBytes(cashLiteConfig.unknownFields());
        CashLiteClientRoute.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, cashLiteConfig.client_routes_allowlist);
        BitcoinAppletConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cashLiteConfig.bitcoin_applet);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashLiteConfig cashLiteConfig = (CashLiteConfig) obj;
        cashLiteConfig.getClass();
        return CashLiteClientRoute.ADAPTER.asRepeated().encodedSizeWithTag(2, cashLiteConfig.client_routes_allowlist) + BitcoinAppletConfig.ADAPTER.encodedSizeWithTag(1, cashLiteConfig.bitcoin_applet) + cashLiteConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashLiteConfig cashLiteConfig = (CashLiteConfig) obj;
        cashLiteConfig.getClass();
        BitcoinAppletConfig bitcoinAppletConfig = cashLiteConfig.bitcoin_applet;
        BitcoinAppletConfig bitcoinAppletConfig2 = bitcoinAppletConfig != null ? (BitcoinAppletConfig) BitcoinAppletConfig.ADAPTER.redact(bitcoinAppletConfig) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cashLiteConfig.client_routes_allowlist, CashLiteClientRoute.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashLiteConfig(bitcoinAppletConfig2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashLiteConfig cashLiteConfig = (CashLiteConfig) obj;
        cashLiteConfig.getClass();
        BitcoinAppletConfig.ADAPTER.encodeWithTag(protoWriter, 1, cashLiteConfig.bitcoin_applet);
        CashLiteClientRoute.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, cashLiteConfig.client_routes_allowlist);
        protoWriter.writeBytes(cashLiteConfig.unknownFields());
    }
}
