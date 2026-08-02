package com.squareup.protos.cash.cashlimitsxp.api.v1;

import app.cash.local.viewmodels.MenuItemAvailability;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$FlatLimits$LimitUsage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        MenuItemAvailability menuItemAvailability = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCustomerLimitsResponse.FlatLimits.LimitUsage((Double) obj, (String) obj2, menuItemAvailability, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                menuItemAvailability = new GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit((GetCustomerLimitsResponse.FlatLimits.LimitUsage.MoneyLimit) GetCustomerLimitsResponse.FlatLimits.LimitUsage.MoneyLimit.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                menuItemAvailability = new GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit((GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit) GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomerLimitsResponse.FlatLimits.LimitUsage limitUsage = (GetCustomerLimitsResponse.FlatLimits.LimitUsage) obj;
        reverseProtoWriter.getClass();
        limitUsage.getClass();
        reverseProtoWriter.writeBytes(limitUsage.unknownFields());
        MenuItemAvailability menuItemAvailability = limitUsage.limit_value;
        if (menuItemAvailability instanceof GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit) {
            GetCustomerLimitsResponse.FlatLimits.LimitUsage.MoneyLimit.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit) menuItemAvailability).value);
        } else if (menuItemAvailability instanceof GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit) {
            GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit) menuItemAvailability).value);
        } else if (menuItemAvailability != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, limitUsage.limit_threshold_type_text);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 1, limitUsage.consumed_proportion);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetCustomerLimitsResponse.FlatLimits.LimitUsage limitUsage = (GetCustomerLimitsResponse.FlatLimits.LimitUsage) obj;
        limitUsage.getClass();
        int encodedSizeWithTag2 = ProtoAdapter.STRING.encodedSizeWithTag(2, limitUsage.limit_threshold_type_text) + ProtoAdapter.DOUBLE.encodedSizeWithTag(1, limitUsage.consumed_proportion) + limitUsage.unknownFields().getSize$okio();
        MenuItemAvailability menuItemAvailability = limitUsage.limit_value;
        if (menuItemAvailability instanceof GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit) {
            encodedSizeWithTag = GetCustomerLimitsResponse.FlatLimits.LimitUsage.MoneyLimit.ADAPTER.encodedSizeWithTag(3, ((GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit) menuItemAvailability).value);
        } else {
            if (!(menuItemAvailability instanceof GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit)) {
                if (menuItemAvailability == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit.ADAPTER.encodedSizeWithTag(4, ((GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit) menuItemAvailability).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomerLimitsResponse.FlatLimits.LimitUsage limitUsage = (GetCustomerLimitsResponse.FlatLimits.LimitUsage) obj;
        limitUsage.getClass();
        ByteString byteString = ByteString.EMPTY;
        Double d = limitUsage.consumed_proportion;
        String str = limitUsage.limit_threshold_type_text;
        MenuItemAvailability menuItemAvailability = limitUsage.limit_value;
        byteString.getClass();
        return new GetCustomerLimitsResponse.FlatLimits.LimitUsage(d, str, menuItemAvailability, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomerLimitsResponse.FlatLimits.LimitUsage limitUsage = (GetCustomerLimitsResponse.FlatLimits.LimitUsage) obj;
        limitUsage.getClass();
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, limitUsage.consumed_proportion);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, limitUsage.limit_threshold_type_text);
        MenuItemAvailability menuItemAvailability = limitUsage.limit_value;
        if (menuItemAvailability instanceof GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit) {
            GetCustomerLimitsResponse.FlatLimits.LimitUsage.MoneyLimit.ADAPTER.encodeWithTag(protoWriter, 3, ((GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit) menuItemAvailability).value);
        } else if (menuItemAvailability instanceof GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit) {
            GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit.ADAPTER.encodeWithTag(protoWriter, 4, ((GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit) menuItemAvailability).value);
        } else if (menuItemAvailability != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(limitUsage.unknownFields());
    }
}
