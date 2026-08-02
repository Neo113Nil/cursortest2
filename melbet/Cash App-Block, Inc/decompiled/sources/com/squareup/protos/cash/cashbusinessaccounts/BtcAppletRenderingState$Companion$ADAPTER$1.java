package com.squareup.protos.cash.cashbusinessaccounts;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BtcAppletRenderingState$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BtcAppletRenderingState((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BtcAppletRenderingState btcAppletRenderingState = (BtcAppletRenderingState) obj;
        reverseProtoWriter.getClass();
        btcAppletRenderingState.getClass();
        reverseProtoWriter.writeBytes(btcAppletRenderingState.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, btcAppletRenderingState.hide_moneytab_btc_applet);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BtcAppletRenderingState btcAppletRenderingState = (BtcAppletRenderingState) obj;
        btcAppletRenderingState.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, btcAppletRenderingState.hide_moneytab_btc_applet) + btcAppletRenderingState.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BtcAppletRenderingState btcAppletRenderingState = (BtcAppletRenderingState) obj;
        btcAppletRenderingState.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = btcAppletRenderingState.hide_moneytab_btc_applet;
        byteString.getClass();
        return new BtcAppletRenderingState(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BtcAppletRenderingState btcAppletRenderingState = (BtcAppletRenderingState) obj;
        btcAppletRenderingState.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, btcAppletRenderingState.hide_moneytab_btc_applet);
        protoWriter.writeBytes(btcAppletRenderingState.unknownFields());
    }
}
