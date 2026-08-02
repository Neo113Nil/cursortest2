package com.squareup.protos.cash.cashliteflow.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenerateLightningInvoiceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GenerateLightningInvoiceResponse((String) obj, (String) obj2, (String) obj3, (Money) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GenerateLightningInvoiceResponse generateLightningInvoiceResponse = (GenerateLightningInvoiceResponse) obj;
        reverseProtoWriter.getClass();
        generateLightningInvoiceResponse.getClass();
        reverseProtoWriter.writeBytes(generateLightningInvoiceResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, generateLightningInvoiceResponse.share_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, generateLightningInvoiceResponse.qr_code_url);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, generateLightningInvoiceResponse.fiat_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, generateLightningInvoiceResponse.deposit_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, generateLightningInvoiceResponse.unified_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, generateLightningInvoiceResponse.payment_request);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenerateLightningInvoiceResponse generateLightningInvoiceResponse = (GenerateLightningInvoiceResponse) obj;
        generateLightningInvoiceResponse.getClass();
        int size$okio = generateLightningInvoiceResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, generateLightningInvoiceResponse.share_url) + protoAdapter.encodedSizeWithTag(5, generateLightningInvoiceResponse.qr_code_url) + Money.ADAPTER.encodedSizeWithTag(4, generateLightningInvoiceResponse.fiat_amount) + protoAdapter.encodedSizeWithTag(3, generateLightningInvoiceResponse.deposit_address) + protoAdapter.encodedSizeWithTag(2, generateLightningInvoiceResponse.unified_address) + protoAdapter.encodedSizeWithTag(1, generateLightningInvoiceResponse.payment_request) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenerateLightningInvoiceResponse generateLightningInvoiceResponse = (GenerateLightningInvoiceResponse) obj;
        generateLightningInvoiceResponse.getClass();
        Money money = generateLightningInvoiceResponse.fiat_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GenerateLightningInvoiceResponse(null, null, null, money2, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenerateLightningInvoiceResponse generateLightningInvoiceResponse = (GenerateLightningInvoiceResponse) obj;
        generateLightningInvoiceResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, generateLightningInvoiceResponse.payment_request);
        protoAdapter.encodeWithTag(protoWriter, 2, generateLightningInvoiceResponse.unified_address);
        protoAdapter.encodeWithTag(protoWriter, 3, generateLightningInvoiceResponse.deposit_address);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, generateLightningInvoiceResponse.fiat_amount);
        protoAdapter.encodeWithTag(protoWriter, 5, generateLightningInvoiceResponse.qr_code_url);
        protoAdapter.encodeWithTag(protoWriter, 6, generateLightningInvoiceResponse.share_url);
        protoWriter.writeBytes(generateLightningInvoiceResponse.unknownFields());
    }
}
