package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LightningReceiveArtifact$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LightningReceiveArtifact((String) obj, (String) obj2, (Long) obj3, (String) obj4, (LightningInvoiceState) obj5, (Long) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.UINT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    try {
                        obj5 = LightningInvoiceState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    obj6 = ProtoAdapter.UINT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LightningReceiveArtifact lightningReceiveArtifact = (LightningReceiveArtifact) obj;
        reverseProtoWriter.getClass();
        lightningReceiveArtifact.getClass();
        reverseProtoWriter.writeBytes(lightningReceiveArtifact.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.UINT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, lightningReceiveArtifact.amount_sats);
        LightningInvoiceState.ADAPTER.encodeWithTag(reverseProtoWriter, 5, lightningReceiveArtifact.state);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, lightningReceiveArtifact.expires_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, lightningReceiveArtifact.amount_milli_sats);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, lightningReceiveArtifact.bolt11_invoice);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, lightningReceiveArtifact.payment_hash);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LightningReceiveArtifact lightningReceiveArtifact = (LightningReceiveArtifact) obj;
        lightningReceiveArtifact.getClass();
        int size$okio = lightningReceiveArtifact.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, lightningReceiveArtifact.bolt11_invoice) + protoAdapter.encodedSizeWithTag(1, lightningReceiveArtifact.payment_hash) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT64;
        return protoAdapter2.encodedSizeWithTag(6, lightningReceiveArtifact.amount_sats) + LightningInvoiceState.ADAPTER.encodedSizeWithTag(5, lightningReceiveArtifact.state) + protoAdapter.encodedSizeWithTag(4, lightningReceiveArtifact.expires_at) + protoAdapter2.encodedSizeWithTag(3, lightningReceiveArtifact.amount_milli_sats) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LightningReceiveArtifact lightningReceiveArtifact = (LightningReceiveArtifact) obj;
        lightningReceiveArtifact.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = lightningReceiveArtifact.payment_hash;
        String str2 = lightningReceiveArtifact.bolt11_invoice;
        Long l = lightningReceiveArtifact.amount_milli_sats;
        String str3 = lightningReceiveArtifact.expires_at;
        LightningInvoiceState lightningInvoiceState = lightningReceiveArtifact.state;
        Long l2 = lightningReceiveArtifact.amount_sats;
        byteString.getClass();
        return new LightningReceiveArtifact(str, str2, l, str3, lightningInvoiceState, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LightningReceiveArtifact lightningReceiveArtifact = (LightningReceiveArtifact) obj;
        lightningReceiveArtifact.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, lightningReceiveArtifact.payment_hash);
        protoAdapter.encodeWithTag(protoWriter, 2, lightningReceiveArtifact.bolt11_invoice);
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, lightningReceiveArtifact.amount_milli_sats);
        protoAdapter.encodeWithTag(protoWriter, 4, lightningReceiveArtifact.expires_at);
        LightningInvoiceState.ADAPTER.encodeWithTag(protoWriter, 5, lightningReceiveArtifact.state);
        protoAdapter2.encodeWithTag(protoWriter, 6, lightningReceiveArtifact.amount_sats);
        protoWriter.writeBytes(lightningReceiveArtifact.unknownFields());
    }
}
