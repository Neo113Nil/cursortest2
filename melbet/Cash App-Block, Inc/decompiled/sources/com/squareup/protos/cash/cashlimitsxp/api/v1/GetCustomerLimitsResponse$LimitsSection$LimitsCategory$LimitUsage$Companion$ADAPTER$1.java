package com.squareup.protos.cash.cashlimitsxp.api.v1;

import com.google.android.gms.internal.mlkit_vision_barcode.zzuh;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzuh getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        zzuh zzuhVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage((Long) obj, (Long) obj2, (Long) obj3, (Double) obj4, (String) obj5, (String) obj6, (String) obj7, zzuhVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 11) {
                getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit = new GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit((GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit) GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit.ADAPTER.decode(protoReader));
            } else if (nextTag != 12) {
                switch (nextTag) {
                    case 1:
                        obj = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        obj2 = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        obj4 = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 4:
                        obj5 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        obj6 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        obj3 = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        obj7 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        break;
                }
            } else {
                getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit = new GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit((GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.CountLimit) GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.CountLimit.ADAPTER.decode(protoReader));
            }
            zzuhVar = getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage limitUsage = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage) obj;
        reverseProtoWriter.getClass();
        limitUsage.getClass();
        reverseProtoWriter.writeBytes(limitUsage.unknownFields());
        zzuh zzuhVar = limitUsage.limit_value;
        if (zzuhVar instanceof GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit) {
            GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit) zzuhVar).value);
        } else if (zzuhVar instanceof GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit) {
            GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.CountLimit.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit) zzuhVar).value);
        } else if (zzuhVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, limitUsage.limit_threshold_type_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, limitUsage.header_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, limitUsage.limit_threshold_text);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 3, limitUsage.consumed_proportion);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, limitUsage.limit_threshold_amount_in_cents);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, limitUsage.amount_remaining_in_cents);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, limitUsage.amount_used_in_cents);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage limitUsage = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage) obj;
        limitUsage.getClass();
        int size$okio = limitUsage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = ProtoAdapter.DOUBLE.encodedSizeWithTag(3, limitUsage.consumed_proportion) + protoAdapter.encodedSizeWithTag(6, limitUsage.limit_threshold_amount_in_cents) + protoAdapter.encodedSizeWithTag(2, limitUsage.amount_remaining_in_cents) + protoAdapter.encodedSizeWithTag(1, limitUsage.amount_used_in_cents) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(7, limitUsage.limit_threshold_type_text) + protoAdapter2.encodedSizeWithTag(5, limitUsage.header_text) + protoAdapter2.encodedSizeWithTag(4, limitUsage.limit_threshold_text) + encodedSizeWithTag;
        zzuh zzuhVar = limitUsage.limit_value;
        if (zzuhVar instanceof GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit) {
            return GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit.ADAPTER.encodedSizeWithTag(11, ((GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit) zzuhVar).value) + encodedSizeWithTag2;
        }
        if (zzuhVar instanceof GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit) {
            return GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.CountLimit.ADAPTER.encodedSizeWithTag(12, ((GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit) zzuhVar).value) + encodedSizeWithTag2;
        }
        if (zzuhVar == null) {
            return encodedSizeWithTag2;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage limitUsage = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage) obj;
        limitUsage.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = limitUsage.amount_used_in_cents;
        Long l2 = limitUsage.amount_remaining_in_cents;
        Long l3 = limitUsage.limit_threshold_amount_in_cents;
        Double d = limitUsage.consumed_proportion;
        String str = limitUsage.limit_threshold_text;
        String str2 = limitUsage.header_text;
        String str3 = limitUsage.limit_threshold_type_text;
        zzuh zzuhVar = limitUsage.limit_value;
        byteString.getClass();
        return new GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage(l, l2, l3, d, str, str2, str3, zzuhVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage limitUsage = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage) obj;
        limitUsage.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, limitUsage.amount_used_in_cents);
        protoAdapter.encodeWithTag(protoWriter, 2, limitUsage.amount_remaining_in_cents);
        protoAdapter.encodeWithTag(protoWriter, 6, limitUsage.limit_threshold_amount_in_cents);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, limitUsage.consumed_proportion);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, limitUsage.limit_threshold_text);
        protoAdapter2.encodeWithTag(protoWriter, 5, limitUsage.header_text);
        protoAdapter2.encodeWithTag(protoWriter, 7, limitUsage.limit_threshold_type_text);
        zzuh zzuhVar = limitUsage.limit_value;
        if (zzuhVar instanceof GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit) {
            GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit.ADAPTER.encodeWithTag(protoWriter, 11, ((GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit) zzuhVar).value);
        } else if (zzuhVar instanceof GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit) {
            GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.CountLimit.ADAPTER.encodeWithTag(protoWriter, 12, ((GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit) zzuhVar).value);
        } else if (zzuhVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(limitUsage.unknownFields());
    }
}
