package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.RemittancePaymentRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RemittancePaymentRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        RemittancePaymentRenderData.DeliveryType deliveryType;
        String str;
        String str2;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str3 = null;
        RemittancePaymentRenderData.DeliveryType deliveryType2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Long l = null;
        String str8 = null;
        Long l2 = null;
        Object obj = null;
        String str9 = null;
        String str10 = null;
        RemittancePaymentRenderData.ScamReportStatus scamReportStatus = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RemittancePaymentRenderData(str3, m, deliveryType2, str4, str5, str6, str7, l, str8, l2, (RemittancePaymentRenderData.RecipientPaymentRenderData) obj, str9, str10, scamReportStatus, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    deliveryType = deliveryType2;
                    str = str4;
                    str2 = str5;
                    m.add(FeeRenderData.ADAPTER.decode(protoReader));
                    decode = str3;
                    deliveryType2 = deliveryType;
                    str4 = str;
                    str5 = str2;
                    break;
                case 3:
                    deliveryType = deliveryType2;
                    str = str4;
                    str2 = str5;
                    try {
                        deliveryType2 = RemittancePaymentRenderData.DeliveryType.ADAPTER.decode(protoReader);
                        str4 = str;
                        str5 = str2;
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 5:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 6:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 7:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 8:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 9:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 10:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 11:
                    obj = TransactorKt.decodeMessageOrMerge(RemittancePaymentRenderData.RecipientPaymentRenderData.ADAPTER, protoReader, obj);
                    decode = str3;
                    break;
                case 12:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 13:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 14:
                    try {
                        scamReportStatus = RemittancePaymentRenderData.ScamReportStatus.ADAPTER.decode(protoReader);
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        deliveryType = deliveryType2;
                        str = str4;
                        str2 = str5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    deliveryType = deliveryType2;
                    str = str4;
                    str2 = str5;
                    decode = str3;
                    deliveryType2 = deliveryType;
                    str4 = str;
                    str5 = str2;
                    break;
            }
            str3 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RemittancePaymentRenderData remittancePaymentRenderData = (RemittancePaymentRenderData) obj;
        reverseProtoWriter.getClass();
        remittancePaymentRenderData.getClass();
        reverseProtoWriter.writeBytes(remittancePaymentRenderData.unknownFields());
        RemittancePaymentRenderData.ScamReportStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 14, remittancePaymentRenderData.scam_report_status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, remittancePaymentRenderData.scam_flow_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, remittancePaymentRenderData.cancel_payment_url);
        RemittancePaymentRenderData.RecipientPaymentRenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 11, remittancePaymentRenderData.recipient_details);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, remittancePaymentRenderData.delivery_date);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, remittancePaymentRenderData.repeat_payment_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, remittancePaymentRenderData.action_required_by);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, remittancePaymentRenderData.bank_account_number);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, remittancePaymentRenderData.recipient_reference_issuer);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, remittancePaymentRenderData.recipient_reference_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, remittancePaymentRenderData.delivery_location);
        RemittancePaymentRenderData.DeliveryType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, remittancePaymentRenderData.delivery_type);
        FeeRenderData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, remittancePaymentRenderData.fee_render_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, remittancePaymentRenderData.exchange_rate);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RemittancePaymentRenderData remittancePaymentRenderData = (RemittancePaymentRenderData) obj;
        remittancePaymentRenderData.getClass();
        int size$okio = remittancePaymentRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(7, remittancePaymentRenderData.bank_account_number) + protoAdapter.encodedSizeWithTag(6, remittancePaymentRenderData.recipient_reference_issuer) + protoAdapter.encodedSizeWithTag(5, remittancePaymentRenderData.recipient_reference_code) + protoAdapter.encodedSizeWithTag(4, remittancePaymentRenderData.delivery_location) + RemittancePaymentRenderData.DeliveryType.ADAPTER.encodedSizeWithTag(3, remittancePaymentRenderData.delivery_type) + FeeRenderData.ADAPTER.asRepeated().encodedSizeWithTag(2, remittancePaymentRenderData.fee_render_data) + protoAdapter.encodedSizeWithTag(1, remittancePaymentRenderData.exchange_rate) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return RemittancePaymentRenderData.ScamReportStatus.ADAPTER.encodedSizeWithTag(14, remittancePaymentRenderData.scam_report_status) + protoAdapter.encodedSizeWithTag(13, remittancePaymentRenderData.scam_flow_url) + protoAdapter.encodedSizeWithTag(12, remittancePaymentRenderData.cancel_payment_url) + RemittancePaymentRenderData.RecipientPaymentRenderData.ADAPTER.encodedSizeWithTag(11, remittancePaymentRenderData.recipient_details) + protoAdapter2.encodedSizeWithTag(10, remittancePaymentRenderData.delivery_date) + protoAdapter.encodedSizeWithTag(9, remittancePaymentRenderData.repeat_payment_url) + protoAdapter2.encodedSizeWithTag(8, remittancePaymentRenderData.action_required_by) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RemittancePaymentRenderData remittancePaymentRenderData = (RemittancePaymentRenderData) obj;
        remittancePaymentRenderData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(remittancePaymentRenderData.fee_render_data, FeeRenderData.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = remittancePaymentRenderData.exchange_rate;
        RemittancePaymentRenderData.DeliveryType deliveryType = remittancePaymentRenderData.delivery_type;
        String str2 = remittancePaymentRenderData.delivery_location;
        String str3 = remittancePaymentRenderData.recipient_reference_code;
        String str4 = remittancePaymentRenderData.recipient_reference_issuer;
        Long l = remittancePaymentRenderData.action_required_by;
        String str5 = remittancePaymentRenderData.repeat_payment_url;
        Long l2 = remittancePaymentRenderData.delivery_date;
        String str6 = remittancePaymentRenderData.cancel_payment_url;
        String str7 = remittancePaymentRenderData.scam_flow_url;
        RemittancePaymentRenderData.ScamReportStatus scamReportStatus = remittancePaymentRenderData.scam_report_status;
        byteString.getClass();
        return new RemittancePaymentRenderData(str, m1169redactElements, deliveryType, str2, str3, str4, null, l, str5, l2, null, str6, str7, scamReportStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RemittancePaymentRenderData remittancePaymentRenderData = (RemittancePaymentRenderData) obj;
        remittancePaymentRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, remittancePaymentRenderData.exchange_rate);
        FeeRenderData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, remittancePaymentRenderData.fee_render_data);
        RemittancePaymentRenderData.DeliveryType.ADAPTER.encodeWithTag(protoWriter, 3, remittancePaymentRenderData.delivery_type);
        protoAdapter.encodeWithTag(protoWriter, 4, remittancePaymentRenderData.delivery_location);
        protoAdapter.encodeWithTag(protoWriter, 5, remittancePaymentRenderData.recipient_reference_code);
        protoAdapter.encodeWithTag(protoWriter, 6, remittancePaymentRenderData.recipient_reference_issuer);
        protoAdapter.encodeWithTag(protoWriter, 7, remittancePaymentRenderData.bank_account_number);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 8, remittancePaymentRenderData.action_required_by);
        protoAdapter.encodeWithTag(protoWriter, 9, remittancePaymentRenderData.repeat_payment_url);
        protoAdapter2.encodeWithTag(protoWriter, 10, remittancePaymentRenderData.delivery_date);
        RemittancePaymentRenderData.RecipientPaymentRenderData.ADAPTER.encodeWithTag(protoWriter, 11, remittancePaymentRenderData.recipient_details);
        protoAdapter.encodeWithTag(protoWriter, 12, remittancePaymentRenderData.cancel_payment_url);
        protoAdapter.encodeWithTag(protoWriter, 13, remittancePaymentRenderData.scam_flow_url);
        RemittancePaymentRenderData.ScamReportStatus.ADAPTER.encodeWithTag(protoWriter, 14, remittancePaymentRenderData.scam_report_status);
        protoWriter.writeBytes(remittancePaymentRenderData.unknownFields());
    }
}
