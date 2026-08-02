package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.SavingsTransferRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RecurringTransferRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecurringTransferRenderData((String) obj, (Long) obj2, (Long) obj3, (String) obj4, (String) obj5, (String) obj6, (SavingsTransferRenderData.SavingsFolderMetadata) obj7, (Integer) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecurringTransferRenderData recurringTransferRenderData = (RecurringTransferRenderData) obj;
        reverseProtoWriter.getClass();
        recurringTransferRenderData.getClass();
        reverseProtoWriter.writeBytes(recurringTransferRenderData.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 8, recurringTransferRenderData.number_of_upcoming_transfers);
        SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 7, recurringTransferRenderData.target_savings_folder_metadata);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, recurringTransferRenderData.schedule_preference_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, recurringTransferRenderData.goal_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, recurringTransferRenderData.client_route);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, recurringTransferRenderData.expected_execution_date_ms);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, recurringTransferRenderData.transfer_amount_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, recurringTransferRenderData.savings_subbalance_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecurringTransferRenderData recurringTransferRenderData = (RecurringTransferRenderData) obj;
        recurringTransferRenderData.getClass();
        int size$okio = recurringTransferRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, recurringTransferRenderData.savings_subbalance_name) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return ProtoAdapter.INT32.encodedSizeWithTag(8, recurringTransferRenderData.number_of_upcoming_transfers) + SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER.encodedSizeWithTag(7, recurringTransferRenderData.target_savings_folder_metadata) + protoAdapter.encodedSizeWithTag(6, recurringTransferRenderData.schedule_preference_token) + protoAdapter.encodedSizeWithTag(5, recurringTransferRenderData.goal_token) + protoAdapter.encodedSizeWithTag(4, recurringTransferRenderData.client_route) + protoAdapter2.encodedSizeWithTag(3, recurringTransferRenderData.expected_execution_date_ms) + protoAdapter2.encodedSizeWithTag(2, recurringTransferRenderData.transfer_amount_cents) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecurringTransferRenderData recurringTransferRenderData = (RecurringTransferRenderData) obj;
        recurringTransferRenderData.getClass();
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata = recurringTransferRenderData.target_savings_folder_metadata;
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata2 = savingsFolderMetadata != null ? (SavingsTransferRenderData.SavingsFolderMetadata) SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER.redact(savingsFolderMetadata) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = recurringTransferRenderData.savings_subbalance_name;
        Long l = recurringTransferRenderData.transfer_amount_cents;
        Long l2 = recurringTransferRenderData.expected_execution_date_ms;
        String str2 = recurringTransferRenderData.client_route;
        String str3 = recurringTransferRenderData.goal_token;
        String str4 = recurringTransferRenderData.schedule_preference_token;
        Integer num = recurringTransferRenderData.number_of_upcoming_transfers;
        byteString.getClass();
        return new RecurringTransferRenderData(str, l, l2, str2, str3, str4, savingsFolderMetadata2, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecurringTransferRenderData recurringTransferRenderData = (RecurringTransferRenderData) obj;
        recurringTransferRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, recurringTransferRenderData.savings_subbalance_name);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, recurringTransferRenderData.transfer_amount_cents);
        protoAdapter2.encodeWithTag(protoWriter, 3, recurringTransferRenderData.expected_execution_date_ms);
        protoAdapter.encodeWithTag(protoWriter, 4, recurringTransferRenderData.client_route);
        protoAdapter.encodeWithTag(protoWriter, 5, recurringTransferRenderData.goal_token);
        protoAdapter.encodeWithTag(protoWriter, 6, recurringTransferRenderData.schedule_preference_token);
        SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER.encodeWithTag(protoWriter, 7, recurringTransferRenderData.target_savings_folder_metadata);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, recurringTransferRenderData.number_of_upcoming_transfers);
        protoWriter.writeBytes(recurringTransferRenderData.unknownFields());
    }
}
