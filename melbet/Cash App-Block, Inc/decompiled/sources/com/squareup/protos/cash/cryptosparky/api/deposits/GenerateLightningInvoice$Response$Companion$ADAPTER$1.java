package com.squareup.protos.cash.cryptosparky.api.deposits;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenerateLightningInvoice$Response$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GenerateLightningInvoice$Response((String) obj, (String) obj2, (String) obj3, (Money) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenerateLightningInvoice$Response generateLightningInvoice$Response = (GenerateLightningInvoice$Response) obj;
        reverseProtoWriter.getClass();
        generateLightningInvoice$Response.getClass();
        reverseProtoWriter.writeBytes(generateLightningInvoice$Response.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, generateLightningInvoice$Response.share_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, generateLightningInvoice$Response.qr_code_url);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, generateLightningInvoice$Response.fiat_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, generateLightningInvoice$Response.deposit_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, generateLightningInvoice$Response.unified_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, generateLightningInvoice$Response.payment_request);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenerateLightningInvoice$Response generateLightningInvoice$Response = (GenerateLightningInvoice$Response) obj;
        generateLightningInvoice$Response.getClass();
        int size$okio = generateLightningInvoice$Response.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, generateLightningInvoice$Response.share_url) + protoAdapter.encodedSizeWithTag(5, generateLightningInvoice$Response.qr_code_url) + Money.ADAPTER.encodedSizeWithTag(4, generateLightningInvoice$Response.fiat_amount) + protoAdapter.encodedSizeWithTag(3, generateLightningInvoice$Response.deposit_address) + protoAdapter.encodedSizeWithTag(2, generateLightningInvoice$Response.unified_address) + protoAdapter.encodedSizeWithTag(1, generateLightningInvoice$Response.payment_request) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenerateLightningInvoice$Response generateLightningInvoice$Response = (GenerateLightningInvoice$Response) obj;
        generateLightningInvoice$Response.getClass();
        Money money = generateLightningInvoice$Response.fiat_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GenerateLightningInvoice$Response(null, null, null, money2, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenerateLightningInvoice$Response generateLightningInvoice$Response = (GenerateLightningInvoice$Response) obj;
        generateLightningInvoice$Response.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, generateLightningInvoice$Response.payment_request);
        protoAdapter.encodeWithTag(protoWriter, 2, generateLightningInvoice$Response.unified_address);
        protoAdapter.encodeWithTag(protoWriter, 3, generateLightningInvoice$Response.deposit_address);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, generateLightningInvoice$Response.fiat_amount);
        protoAdapter.encodeWithTag(protoWriter, 5, generateLightningInvoice$Response.qr_code_url);
        protoAdapter.encodeWithTag(protoWriter, 6, generateLightningInvoice$Response.share_url);
        protoWriter.writeBytes(generateLightningInvoice$Response.unknownFields());
    }
}
