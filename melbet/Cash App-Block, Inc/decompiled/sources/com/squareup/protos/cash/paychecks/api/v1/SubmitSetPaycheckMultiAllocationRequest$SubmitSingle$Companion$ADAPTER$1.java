package com.squareup.protos.cash.paychecks.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.AllocationDistribution;

/* loaded from: classes7.dex */
public final class SubmitSetPaycheckMultiAllocationRequest$SubmitSingle$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitSetPaycheckMultiAllocationRequest.SubmitSingle((AllocationDistribution) obj, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AllocationDistribution.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.UINT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitSetPaycheckMultiAllocationRequest.SubmitSingle submitSingle = (SubmitSetPaycheckMultiAllocationRequest.SubmitSingle) obj;
        reverseProtoWriter.getClass();
        submitSingle.getClass();
        reverseProtoWriter.writeBytes(submitSingle.unknownFields());
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 2, submitSingle.selected_destination_index);
        AllocationDistribution.ADAPTER.encodeWithTag(reverseProtoWriter, 1, submitSingle.allocation_distribution);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitSetPaycheckMultiAllocationRequest.SubmitSingle submitSingle = (SubmitSetPaycheckMultiAllocationRequest.SubmitSingle) obj;
        submitSingle.getClass();
        return ProtoAdapter.UINT32.encodedSizeWithTag(2, submitSingle.selected_destination_index) + AllocationDistribution.ADAPTER.encodedSizeWithTag(1, submitSingle.allocation_distribution) + submitSingle.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitSetPaycheckMultiAllocationRequest.SubmitSingle submitSingle = (SubmitSetPaycheckMultiAllocationRequest.SubmitSingle) obj;
        submitSingle.getClass();
        AllocationDistribution allocationDistribution = submitSingle.allocation_distribution;
        AllocationDistribution allocationDistribution2 = allocationDistribution != null ? (AllocationDistribution) AllocationDistribution.ADAPTER.redact(allocationDistribution) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = submitSingle.selected_destination_index;
        byteString.getClass();
        return new SubmitSetPaycheckMultiAllocationRequest.SubmitSingle(allocationDistribution2, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitSetPaycheckMultiAllocationRequest.SubmitSingle submitSingle = (SubmitSetPaycheckMultiAllocationRequest.SubmitSingle) obj;
        submitSingle.getClass();
        AllocationDistribution.ADAPTER.encodeWithTag(protoWriter, 1, submitSingle.allocation_distribution);
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, submitSingle.selected_destination_index);
        protoWriter.writeBytes(submitSingle.unknownFields());
    }
}
