package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DepositPreferenceOption$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new DepositPreferenceOption((DepositPreference) obj, (FeeData) obj2, (String) obj3, (String) obj4, (ConfirmationSheetData) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = DepositPreference.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj5 = TransactorKt.decodeMessageOrMerge(ConfirmationSheetData.ADAPTER, protoReader, obj5);
                    break;
                case 4:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj2 = TransactorKt.decodeMessageOrMerge(FeeData.ADAPTER, protoReader, obj2);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DepositPreferenceOption depositPreferenceOption = (DepositPreferenceOption) obj;
        reverseProtoWriter.getClass();
        depositPreferenceOption.getClass();
        reverseProtoWriter.writeBytes(depositPreferenceOption.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, depositPreferenceOption.suppress_fee);
        ConfirmationSheetData.ADAPTER.encodeWithTag(reverseProtoWriter, 3, depositPreferenceOption.confirmation_sheet_data);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, depositPreferenceOption.options_description_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, depositPreferenceOption.options_text);
        FeeData.ADAPTER.encodeWithTag(reverseProtoWriter, 6, depositPreferenceOption.fee_data);
        DepositPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 1, depositPreferenceOption.deposit_preference);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DepositPreferenceOption depositPreferenceOption = (DepositPreferenceOption) obj;
        depositPreferenceOption.getClass();
        int encodedSizeWithTag = FeeData.ADAPTER.encodedSizeWithTag(6, depositPreferenceOption.fee_data) + DepositPreference.ADAPTER.encodedSizeWithTag(1, depositPreferenceOption.deposit_preference) + depositPreferenceOption.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(4, depositPreferenceOption.suppress_fee) + ConfirmationSheetData.ADAPTER.encodedSizeWithTag(3, depositPreferenceOption.confirmation_sheet_data) + protoAdapter.encodedSizeWithTag(5, depositPreferenceOption.options_description_text) + protoAdapter.encodedSizeWithTag(2, depositPreferenceOption.options_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DepositPreferenceOption depositPreferenceOption = (DepositPreferenceOption) obj;
        depositPreferenceOption.getClass();
        FeeData feeData = depositPreferenceOption.fee_data;
        FeeData feeData2 = feeData != null ? (FeeData) FeeData.ADAPTER.redact(feeData) : null;
        ConfirmationSheetData confirmationSheetData = depositPreferenceOption.confirmation_sheet_data;
        ConfirmationSheetData confirmationSheetData2 = confirmationSheetData != null ? (ConfirmationSheetData) ConfirmationSheetData.ADAPTER.redact(confirmationSheetData) : null;
        ByteString byteString = ByteString.EMPTY;
        DepositPreference depositPreference = depositPreferenceOption.deposit_preference;
        String str = depositPreferenceOption.options_text;
        String str2 = depositPreferenceOption.options_description_text;
        Boolean bool = depositPreferenceOption.suppress_fee;
        byteString.getClass();
        return new DepositPreferenceOption(depositPreference, feeData2, str, str2, confirmationSheetData2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DepositPreferenceOption depositPreferenceOption = (DepositPreferenceOption) obj;
        depositPreferenceOption.getClass();
        DepositPreference.ADAPTER.encodeWithTag(protoWriter, 1, depositPreferenceOption.deposit_preference);
        FeeData.ADAPTER.encodeWithTag(protoWriter, 6, depositPreferenceOption.fee_data);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, depositPreferenceOption.options_text);
        protoAdapter.encodeWithTag(protoWriter, 5, depositPreferenceOption.options_description_text);
        ConfirmationSheetData.ADAPTER.encodeWithTag(protoWriter, 3, depositPreferenceOption.confirmation_sheet_data);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, depositPreferenceOption.suppress_fee);
        protoWriter.writeBytes(depositPreferenceOption.unknownFields());
    }
}
