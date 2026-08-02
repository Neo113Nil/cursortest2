package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes.dex */
public final class DepositPreferenceData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DepositPreferenceData((String) obj, m, arrayList, (DepositPreference) obj2, (DepositFeeData) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(DepositPreferenceOption.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                arrayList.add(DepositPreferenceOption.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                try {
                    obj2 = DepositPreference.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 5) {
                obj3 = TransactorKt.decodeMessageOrMerge(DepositFeeData.ADAPTER, protoReader, obj3);
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DepositPreferenceData depositPreferenceData = (DepositPreferenceData) obj;
        reverseProtoWriter.getClass();
        depositPreferenceData.getClass();
        reverseProtoWriter.writeBytes(depositPreferenceData.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, depositPreferenceData.display_auto_cash_out_toggle);
        DepositFeeData.ADAPTER.encodeWithTag(reverseProtoWriter, 5, depositPreferenceData.deposit_fee_data);
        DepositPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 4, depositPreferenceData.default_preference_option);
        ProtoAdapter protoAdapter = DepositPreferenceOption.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, depositPreferenceData.cash_out_options);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, depositPreferenceData.account_setting_options);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, depositPreferenceData.cash_out_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DepositPreferenceData depositPreferenceData = (DepositPreferenceData) obj;
        depositPreferenceData.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, depositPreferenceData.cash_out_title) + depositPreferenceData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = DepositPreferenceOption.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(7, depositPreferenceData.display_auto_cash_out_toggle) + DepositFeeData.ADAPTER.encodedSizeWithTag(5, depositPreferenceData.deposit_fee_data) + DepositPreference.ADAPTER.encodedSizeWithTag(4, depositPreferenceData.default_preference_option) + protoAdapter.asRepeated().encodedSizeWithTag(3, depositPreferenceData.cash_out_options) + protoAdapter.asRepeated().encodedSizeWithTag(2, depositPreferenceData.account_setting_options) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DepositPreferenceData depositPreferenceData = (DepositPreferenceData) obj;
        depositPreferenceData.getClass();
        List list = depositPreferenceData.account_setting_options;
        ProtoAdapter protoAdapter = DepositPreferenceOption.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(depositPreferenceData.cash_out_options, protoAdapter);
        DepositFeeData depositFeeData = depositPreferenceData.deposit_fee_data;
        DepositFeeData depositFeeData2 = depositFeeData != null ? (DepositFeeData) DepositFeeData.ADAPTER.redact(depositFeeData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = depositPreferenceData.cash_out_title;
        DepositPreference depositPreference = depositPreferenceData.default_preference_option;
        Boolean bool = depositPreferenceData.display_auto_cash_out_toggle;
        byteString.getClass();
        return new DepositPreferenceData(str, m1169redactElements, m1169redactElements2, depositPreference, depositFeeData2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DepositPreferenceData depositPreferenceData = (DepositPreferenceData) obj;
        depositPreferenceData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, depositPreferenceData.cash_out_title);
        ProtoAdapter protoAdapter = DepositPreferenceOption.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, depositPreferenceData.account_setting_options);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, depositPreferenceData.cash_out_options);
        DepositPreference.ADAPTER.encodeWithTag(protoWriter, 4, depositPreferenceData.default_preference_option);
        DepositFeeData.ADAPTER.encodeWithTag(protoWriter, 5, depositPreferenceData.deposit_fee_data);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, depositPreferenceData.display_auto_cash_out_toggle);
        protoWriter.writeBytes(depositPreferenceData.unknownFields());
    }
}
