package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.franklin.data.BrowserInteraction;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RiskSignals$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new RiskSignals((BrowserInteraction) obj, (ClientInfo) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BrowserInteraction.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ClientInfo.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RiskSignals riskSignals = (RiskSignals) obj;
        reverseProtoWriter.getClass();
        riskSignals.getClass();
        reverseProtoWriter.writeBytes(riskSignals.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, riskSignals.app_token);
        ClientInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 2, riskSignals.client_info);
        BrowserInteraction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, riskSignals.browser_interaction);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RiskSignals riskSignals = (RiskSignals) obj;
        riskSignals.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, riskSignals.app_token) + ClientInfo.ADAPTER.encodedSizeWithTag(2, riskSignals.client_info) + BrowserInteraction.ADAPTER.encodedSizeWithTag(1, riskSignals.browser_interaction) + riskSignals.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RiskSignals riskSignals = (RiskSignals) obj;
        riskSignals.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = riskSignals.app_token;
        byteString.getClass();
        return new RiskSignals(null, null, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RiskSignals riskSignals = (RiskSignals) obj;
        riskSignals.getClass();
        BrowserInteraction.ADAPTER.encodeWithTag(protoWriter, 1, riskSignals.browser_interaction);
        ClientInfo.ADAPTER.encodeWithTag(protoWriter, 2, riskSignals.client_info);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, riskSignals.app_token);
        protoWriter.writeBytes(riskSignals.unknownFields());
    }
}
