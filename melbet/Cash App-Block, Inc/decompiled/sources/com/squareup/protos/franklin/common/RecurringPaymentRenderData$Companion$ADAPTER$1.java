package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.RecurringPaymentRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RecurringPaymentRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecurringPaymentRenderData((String) obj3, (String) obj4, (String) obj5, (RecurringPaymentRenderData.State) obj6, (Long) obj7, (String) obj8, (String) obj9, (Boolean) obj10, (String) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    try {
                        obj6 = RecurringPaymentRenderData.State.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj3;
                        obj2 = obj4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj7 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                case 6:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 7:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 8:
                    obj10 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 9:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj2 = obj4;
                    break;
            }
            obj3 = obj;
            obj4 = obj2;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecurringPaymentRenderData recurringPaymentRenderData = (RecurringPaymentRenderData) obj;
        reverseProtoWriter.getClass();
        recurringPaymentRenderData.getClass();
        reverseProtoWriter.writeBytes(recurringPaymentRenderData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, recurringPaymentRenderData.schedule_description);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 8, recurringPaymentRenderData.is_managed_account);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, recurringPaymentRenderData.icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, recurringPaymentRenderData.time_zone);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 5, recurringPaymentRenderData.payment_datetime);
        RecurringPaymentRenderData.State.ADAPTER.encodeWithTag(reverseProtoWriter, 4, recurringPaymentRenderData.state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, recurringPaymentRenderData.skip_payment_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, recurringPaymentRenderData.cancel_recurring_payment_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, recurringPaymentRenderData.edit_recurring_payment_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecurringPaymentRenderData recurringPaymentRenderData = (RecurringPaymentRenderData) obj;
        recurringPaymentRenderData.getClass();
        int size$okio = recurringPaymentRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(9, recurringPaymentRenderData.schedule_description) + ProtoAdapter.BOOL.encodedSizeWithTag(8, recurringPaymentRenderData.is_managed_account) + protoAdapter.encodedSizeWithTag(7, recurringPaymentRenderData.icon_url) + protoAdapter.encodedSizeWithTag(6, recurringPaymentRenderData.time_zone) + ProtoAdapter.INT64.encodedSizeWithTag(5, recurringPaymentRenderData.payment_datetime) + RecurringPaymentRenderData.State.ADAPTER.encodedSizeWithTag(4, recurringPaymentRenderData.state) + protoAdapter.encodedSizeWithTag(3, recurringPaymentRenderData.skip_payment_url) + protoAdapter.encodedSizeWithTag(2, recurringPaymentRenderData.cancel_recurring_payment_url) + protoAdapter.encodedSizeWithTag(1, recurringPaymentRenderData.edit_recurring_payment_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecurringPaymentRenderData recurringPaymentRenderData = (RecurringPaymentRenderData) obj;
        recurringPaymentRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = recurringPaymentRenderData.edit_recurring_payment_url;
        String str2 = recurringPaymentRenderData.cancel_recurring_payment_url;
        String str3 = recurringPaymentRenderData.skip_payment_url;
        RecurringPaymentRenderData.State state = recurringPaymentRenderData.state;
        Long l = recurringPaymentRenderData.payment_datetime;
        String str4 = recurringPaymentRenderData.time_zone;
        String str5 = recurringPaymentRenderData.icon_url;
        Boolean bool = recurringPaymentRenderData.is_managed_account;
        String str6 = recurringPaymentRenderData.schedule_description;
        byteString.getClass();
        return new RecurringPaymentRenderData(str, str2, str3, state, l, str4, str5, bool, str6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecurringPaymentRenderData recurringPaymentRenderData = (RecurringPaymentRenderData) obj;
        recurringPaymentRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, recurringPaymentRenderData.edit_recurring_payment_url);
        protoAdapter.encodeWithTag(protoWriter, 2, recurringPaymentRenderData.cancel_recurring_payment_url);
        protoAdapter.encodeWithTag(protoWriter, 3, recurringPaymentRenderData.skip_payment_url);
        RecurringPaymentRenderData.State.ADAPTER.encodeWithTag(protoWriter, 4, recurringPaymentRenderData.state);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, recurringPaymentRenderData.payment_datetime);
        protoAdapter.encodeWithTag(protoWriter, 6, recurringPaymentRenderData.time_zone);
        protoAdapter.encodeWithTag(protoWriter, 7, recurringPaymentRenderData.icon_url);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, recurringPaymentRenderData.is_managed_account);
        protoAdapter.encodeWithTag(protoWriter, 9, recurringPaymentRenderData.schedule_description);
        protoWriter.writeBytes(recurringPaymentRenderData.unknownFields());
    }
}
