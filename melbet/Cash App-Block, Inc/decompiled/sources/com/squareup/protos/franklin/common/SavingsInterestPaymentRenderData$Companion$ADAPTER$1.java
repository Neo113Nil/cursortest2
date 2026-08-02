package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.SavingsInterestPaymentRenderData;
import com.squareup.protos.franklin.common.SavingsTransferRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SavingsInterestPaymentRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsInterestPaymentRenderData((SavingsInterestPaymentRenderData.SavingsInterestPaymentState) obj, (Long) obj2, (String) obj3, (SavingsTransferRenderData.SavingsFolderMetadata) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SavingsInterestPaymentRenderData.SavingsInterestPaymentState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsInterestPaymentRenderData savingsInterestPaymentRenderData = (SavingsInterestPaymentRenderData) obj;
        reverseProtoWriter.getClass();
        savingsInterestPaymentRenderData.getClass();
        reverseProtoWriter.writeBytes(savingsInterestPaymentRenderData.unknownFields());
        SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 4, savingsInterestPaymentRenderData.target_savings_folder_metadata);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, savingsInterestPaymentRenderData.balance_token);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, savingsInterestPaymentRenderData.interest_apy_bips);
        SavingsInterestPaymentRenderData.SavingsInterestPaymentState.ADAPTER.encodeWithTag(reverseProtoWriter, 1, savingsInterestPaymentRenderData.savings_interest_payment_state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsInterestPaymentRenderData savingsInterestPaymentRenderData = (SavingsInterestPaymentRenderData) obj;
        savingsInterestPaymentRenderData.getClass();
        return SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER.encodedSizeWithTag(4, savingsInterestPaymentRenderData.target_savings_folder_metadata) + ProtoAdapter.STRING.encodedSizeWithTag(3, savingsInterestPaymentRenderData.balance_token) + ProtoAdapter.INT64.encodedSizeWithTag(2, savingsInterestPaymentRenderData.interest_apy_bips) + SavingsInterestPaymentRenderData.SavingsInterestPaymentState.ADAPTER.encodedSizeWithTag(1, savingsInterestPaymentRenderData.savings_interest_payment_state) + savingsInterestPaymentRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsInterestPaymentRenderData savingsInterestPaymentRenderData = (SavingsInterestPaymentRenderData) obj;
        savingsInterestPaymentRenderData.getClass();
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata = savingsInterestPaymentRenderData.target_savings_folder_metadata;
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata2 = savingsFolderMetadata != null ? (SavingsTransferRenderData.SavingsFolderMetadata) SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER.redact(savingsFolderMetadata) : null;
        ByteString byteString = ByteString.EMPTY;
        SavingsInterestPaymentRenderData.SavingsInterestPaymentState savingsInterestPaymentState = savingsInterestPaymentRenderData.savings_interest_payment_state;
        Long l = savingsInterestPaymentRenderData.interest_apy_bips;
        String str = savingsInterestPaymentRenderData.balance_token;
        byteString.getClass();
        return new SavingsInterestPaymentRenderData(savingsInterestPaymentState, l, str, savingsFolderMetadata2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsInterestPaymentRenderData savingsInterestPaymentRenderData = (SavingsInterestPaymentRenderData) obj;
        savingsInterestPaymentRenderData.getClass();
        SavingsInterestPaymentRenderData.SavingsInterestPaymentState.ADAPTER.encodeWithTag(protoWriter, 1, savingsInterestPaymentRenderData.savings_interest_payment_state);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, savingsInterestPaymentRenderData.interest_apy_bips);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, savingsInterestPaymentRenderData.balance_token);
        SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER.encodeWithTag(protoWriter, 4, savingsInterestPaymentRenderData.target_savings_folder_metadata);
        protoWriter.writeBytes(savingsInterestPaymentRenderData.unknownFields());
    }
}
