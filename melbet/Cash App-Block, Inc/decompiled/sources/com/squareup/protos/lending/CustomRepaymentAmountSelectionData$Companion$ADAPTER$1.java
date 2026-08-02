package com.squareup.protos.lending;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CustomRepaymentAmountSelectionData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CustomRepaymentAmountSelectionData((String) obj, (CustomAmountPickerData) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(CustomAmountPickerData.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomRepaymentAmountSelectionData customRepaymentAmountSelectionData = (CustomRepaymentAmountSelectionData) obj;
        reverseProtoWriter.getClass();
        customRepaymentAmountSelectionData.getClass();
        reverseProtoWriter.writeBytes(customRepaymentAmountSelectionData.unknownFields());
        CustomAmountPickerData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, customRepaymentAmountSelectionData.custom_amount_picker_data);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, customRepaymentAmountSelectionData.reference_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomRepaymentAmountSelectionData customRepaymentAmountSelectionData = (CustomRepaymentAmountSelectionData) obj;
        customRepaymentAmountSelectionData.getClass();
        return CustomAmountPickerData.ADAPTER.encodedSizeWithTag(2, customRepaymentAmountSelectionData.custom_amount_picker_data) + ProtoAdapter.STRING.encodedSizeWithTag(1, customRepaymentAmountSelectionData.reference_token) + customRepaymentAmountSelectionData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomRepaymentAmountSelectionData customRepaymentAmountSelectionData = (CustomRepaymentAmountSelectionData) obj;
        customRepaymentAmountSelectionData.getClass();
        CustomAmountPickerData customAmountPickerData = customRepaymentAmountSelectionData.custom_amount_picker_data;
        CustomAmountPickerData customAmountPickerData2 = customAmountPickerData != null ? (CustomAmountPickerData) CustomAmountPickerData.ADAPTER.redact(customAmountPickerData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = customRepaymentAmountSelectionData.reference_token;
        byteString.getClass();
        return new CustomRepaymentAmountSelectionData(str, customAmountPickerData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomRepaymentAmountSelectionData customRepaymentAmountSelectionData = (CustomRepaymentAmountSelectionData) obj;
        customRepaymentAmountSelectionData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, customRepaymentAmountSelectionData.reference_token);
        CustomAmountPickerData.ADAPTER.encodeWithTag(protoWriter, 2, customRepaymentAmountSelectionData.custom_amount_picker_data);
        protoWriter.writeBytes(customRepaymentAmountSelectionData.unknownFields());
    }
}
