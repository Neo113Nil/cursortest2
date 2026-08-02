package com.squareup.protos.franklin.experiments.bouncer;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardScanResult$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ?? r3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ByteString byteString = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Boolean bool = null;
        String str9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            String str10 = r3;
            if (nextTag == -1) {
                return new CardScanResult(str10, str, str2, str3, str4, str5, byteString, str6, str7, str8, bool, str9, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    r3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    byteString = ProtoAdapter.BYTES.decode(protoReader);
                    break;
                case 8:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 12:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
            r3 = str10;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardScanResult cardScanResult = (CardScanResult) obj;
        reverseProtoWriter.getClass();
        cardScanResult.getClass();
        reverseProtoWriter.writeBytes(cardScanResult.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, cardScanResult.mobile_validation_failure_reason);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 11, cardScanResult.mobile_is_card_valid);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, cardScanResult.postal_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, cardScanResult.payload_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, cardScanResult.encrypted_bouncer_payload);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 7, cardScanResult.scanned_image);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, cardScanResult.cardholder_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cardScanResult.cvv);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cardScanResult.expiry_year);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cardScanResult.expiry_month);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cardScanResult.expiry_day);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cardScanResult.pan);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardScanResult cardScanResult = (CardScanResult) obj;
        cardScanResult.getClass();
        int size$okio = cardScanResult.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(12, cardScanResult.mobile_validation_failure_reason) + ProtoAdapter.BOOL.encodedSizeWithTag(11, cardScanResult.mobile_is_card_valid) + protoAdapter.encodedSizeWithTag(10, cardScanResult.postal_code) + protoAdapter.encodedSizeWithTag(9, cardScanResult.payload_version) + protoAdapter.encodedSizeWithTag(8, cardScanResult.encrypted_bouncer_payload) + ProtoAdapter.BYTES.encodedSizeWithTag(7, cardScanResult.scanned_image) + protoAdapter.encodedSizeWithTag(6, cardScanResult.cardholder_name) + protoAdapter.encodedSizeWithTag(5, cardScanResult.cvv) + protoAdapter.encodedSizeWithTag(4, cardScanResult.expiry_year) + protoAdapter.encodedSizeWithTag(3, cardScanResult.expiry_month) + protoAdapter.encodedSizeWithTag(2, cardScanResult.expiry_day) + protoAdapter.encodedSizeWithTag(1, cardScanResult.pan) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardScanResult cardScanResult = (CardScanResult) obj;
        cardScanResult.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cardScanResult.payload_version;
        Boolean bool = cardScanResult.mobile_is_card_valid;
        String str2 = cardScanResult.mobile_validation_failure_reason;
        byteString.getClass();
        return new CardScanResult(null, null, null, null, null, null, null, null, str, null, bool, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardScanResult cardScanResult = (CardScanResult) obj;
        cardScanResult.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cardScanResult.pan);
        protoAdapter.encodeWithTag(protoWriter, 2, cardScanResult.expiry_day);
        protoAdapter.encodeWithTag(protoWriter, 3, cardScanResult.expiry_month);
        protoAdapter.encodeWithTag(protoWriter, 4, cardScanResult.expiry_year);
        protoAdapter.encodeWithTag(protoWriter, 5, cardScanResult.cvv);
        protoAdapter.encodeWithTag(protoWriter, 6, cardScanResult.cardholder_name);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 7, cardScanResult.scanned_image);
        protoAdapter.encodeWithTag(protoWriter, 8, cardScanResult.encrypted_bouncer_payload);
        protoAdapter.encodeWithTag(protoWriter, 9, cardScanResult.payload_version);
        protoAdapter.encodeWithTag(protoWriter, 10, cardScanResult.postal_code);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, cardScanResult.mobile_is_card_valid);
        protoAdapter.encodeWithTag(protoWriter, 12, cardScanResult.mobile_validation_failure_reason);
        protoWriter.writeBytes(cardScanResult.unknownFields());
    }
}
