package com.squareup.protos.cash.investcustomer.api.v1.drip;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetCustomerDividendSettingsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetCustomerDividendSettingsResponse((DividendSetting) obj, (ResponseContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = DividendSetting.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetCustomerDividendSettingsResponse setCustomerDividendSettingsResponse = (SetCustomerDividendSettingsResponse) obj;
        reverseProtoWriter.getClass();
        setCustomerDividendSettingsResponse.getClass();
        reverseProtoWriter.writeBytes(setCustomerDividendSettingsResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setCustomerDividendSettingsResponse.response_context);
        DividendSetting.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setCustomerDividendSettingsResponse.setting);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetCustomerDividendSettingsResponse setCustomerDividendSettingsResponse = (SetCustomerDividendSettingsResponse) obj;
        setCustomerDividendSettingsResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, setCustomerDividendSettingsResponse.response_context) + DividendSetting.ADAPTER.encodedSizeWithTag(1, setCustomerDividendSettingsResponse.setting) + setCustomerDividendSettingsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetCustomerDividendSettingsResponse setCustomerDividendSettingsResponse = (SetCustomerDividendSettingsResponse) obj;
        setCustomerDividendSettingsResponse.getClass();
        ResponseContext responseContext = setCustomerDividendSettingsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        DividendSetting dividendSetting = setCustomerDividendSettingsResponse.setting;
        byteString.getClass();
        return new SetCustomerDividendSettingsResponse(dividendSetting, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetCustomerDividendSettingsResponse setCustomerDividendSettingsResponse = (SetCustomerDividendSettingsResponse) obj;
        setCustomerDividendSettingsResponse.getClass();
        DividendSetting.ADAPTER.encodeWithTag(protoWriter, 1, setCustomerDividendSettingsResponse.setting);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, setCustomerDividendSettingsResponse.response_context);
        protoWriter.writeBytes(setCustomerDividendSettingsResponse.unknownFields());
    }
}
