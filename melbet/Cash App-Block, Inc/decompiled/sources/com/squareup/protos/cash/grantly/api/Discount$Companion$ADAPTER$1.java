package com.squareup.protos.cash.grantly.api;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Discount;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Discount$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Integer num;
        Integer num2;
        String str;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str3 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        String str4 = null;
        Integer num9 = null;
        Boolean bool = null;
        Integer num10 = null;
        Discount.PaymentMethodTarget paymentMethodTarget = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Discount(str2, num3, num4, str3, num5, num6, num7, num8, str4, m, num9, arrayList, bool, num10, paymentMethodTarget, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    num3 = ProtoAdapter.UINT32.decode(protoReader);
                    decode = str2;
                    break;
                case 3:
                    num4 = ProtoAdapter.UINT32.decode(protoReader);
                    decode = str2;
                    break;
                case 4:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 5:
                    num5 = ProtoAdapter.UINT32.decode(protoReader);
                    decode = str2;
                    break;
                case 6:
                    num6 = ProtoAdapter.UINT32.decode(protoReader);
                    decode = str2;
                    break;
                case 7:
                    num7 = ProtoAdapter.UINT32.decode(protoReader);
                    decode = str2;
                    break;
                case 8:
                    num8 = ProtoAdapter.UINT32.decode(protoReader);
                    decode = str2;
                    break;
                case 9:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 10:
                    num = num3;
                    num2 = num4;
                    str = str3;
                    try {
                        Discount.AuthorizationChannel.ADAPTER.tryDecode(protoReader, m);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                    decode = str2;
                    num3 = num;
                    num4 = num2;
                    str3 = str;
                    break;
                case 11:
                    num9 = ProtoAdapter.UINT32.decode(protoReader);
                    decode = str2;
                    break;
                case 12:
                    num = num3;
                    num2 = num4;
                    str = str3;
                    arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    decode = str2;
                    num3 = num;
                    num4 = num2;
                    str3 = str;
                    break;
                case 13:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str2;
                    break;
                case 14:
                    num10 = ProtoAdapter.UINT32.decode(protoReader);
                    decode = str2;
                    break;
                case 15:
                    try {
                        paymentMethodTarget = Discount.PaymentMethodTarget.ADAPTER.decode(protoReader);
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        num = num3;
                        num2 = num4;
                        str = str3;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    num = num3;
                    num2 = num4;
                    str = str3;
                    decode = str2;
                    num3 = num;
                    num4 = num2;
                    str3 = str;
                    break;
            }
            str2 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Discount discount = (Discount) obj;
        reverseProtoWriter.getClass();
        discount.getClass();
        reverseProtoWriter.writeBytes(discount.unknownFields());
        Discount.PaymentMethodTarget.ADAPTER.encodeWithTag(reverseProtoWriter, 15, discount.payment_method_target);
        ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, discount.min_transaction_amount);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 13, discount.in_app_only);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 12, discount.targeted_customers);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, discount.max_campaign_discount);
        Discount.AuthorizationChannel.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 10, discount.allowed_authorization_channels);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, discount.discount_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, discount.total_discount_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, discount.max_usage_count);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, discount.max_daily_discount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, discount.max_one_time_discount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, discount.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, discount.bps);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, discount.flat_discount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, discount.discount_key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Discount discount = (Discount) obj;
        discount.getClass();
        int size$okio = discount.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, discount.discount_key) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT32;
        return Discount.PaymentMethodTarget.ADAPTER.encodedSizeWithTag(15, discount.payment_method_target) + protoAdapter2.encodedSizeWithTag(14, discount.min_transaction_amount) + ProtoAdapter.BOOL.encodedSizeWithTag(13, discount.in_app_only) + protoAdapter.asRepeated().encodedSizeWithTag(12, discount.targeted_customers) + protoAdapter2.encodedSizeWithTag(11, discount.max_campaign_discount) + Discount.AuthorizationChannel.ADAPTER.asRepeated().encodedSizeWithTag(10, discount.allowed_authorization_channels) + protoAdapter.encodedSizeWithTag(9, discount.discount_token) + protoAdapter2.encodedSizeWithTag(8, discount.total_discount_amount) + protoAdapter2.encodedSizeWithTag(7, discount.max_usage_count) + protoAdapter2.encodedSizeWithTag(6, discount.max_daily_discount) + protoAdapter2.encodedSizeWithTag(5, discount.max_one_time_discount) + protoAdapter.encodedSizeWithTag(4, discount.description) + protoAdapter2.encodedSizeWithTag(3, discount.bps) + protoAdapter2.encodedSizeWithTag(2, discount.flat_discount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Discount discount = (Discount) obj;
        discount.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = discount.discount_key;
        Integer num = discount.flat_discount;
        Integer num2 = discount.bps;
        String str2 = discount.description;
        Integer num3 = discount.max_one_time_discount;
        Integer num4 = discount.max_daily_discount;
        Integer num5 = discount.max_usage_count;
        Integer num6 = discount.total_discount_amount;
        String str3 = discount.discount_token;
        List list = discount.allowed_authorization_channels;
        Integer num7 = discount.max_campaign_discount;
        List list2 = discount.targeted_customers;
        Boolean bool = discount.in_app_only;
        Integer num8 = discount.min_transaction_amount;
        Discount.PaymentMethodTarget paymentMethodTarget = discount.payment_method_target;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new Discount(str, num, num2, str2, num3, num4, num5, num6, str3, list, num7, list2, bool, num8, paymentMethodTarget, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Discount discount = (Discount) obj;
        discount.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, discount.discount_key);
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT32;
        protoAdapter2.encodeWithTag(protoWriter, 2, discount.flat_discount);
        protoAdapter2.encodeWithTag(protoWriter, 3, discount.bps);
        protoAdapter.encodeWithTag(protoWriter, 4, discount.description);
        protoAdapter2.encodeWithTag(protoWriter, 5, discount.max_one_time_discount);
        protoAdapter2.encodeWithTag(protoWriter, 6, discount.max_daily_discount);
        protoAdapter2.encodeWithTag(protoWriter, 7, discount.max_usage_count);
        protoAdapter2.encodeWithTag(protoWriter, 8, discount.total_discount_amount);
        protoAdapter.encodeWithTag(protoWriter, 9, discount.discount_token);
        Discount.AuthorizationChannel.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, discount.allowed_authorization_channels);
        protoAdapter2.encodeWithTag(protoWriter, 11, discount.max_campaign_discount);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 12, discount.targeted_customers);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, discount.in_app_only);
        protoAdapter2.encodeWithTag(protoWriter, 14, discount.min_transaction_amount);
        Discount.PaymentMethodTarget.ADAPTER.encodeWithTag(protoWriter, 15, discount.payment_method_target);
        protoWriter.writeBytes(discount.unknownFields());
    }
}
