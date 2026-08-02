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
public final class SubmitSetPaycheckMultiAllocationRequest$Disable$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitSetPaycheckMultiAllocationRequest.Disable((AllocationDistribution) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AllocationDistribution.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitSetPaycheckMultiAllocationRequest.Disable disable = (SubmitSetPaycheckMultiAllocationRequest.Disable) obj;
        reverseProtoWriter.getClass();
        disable.getClass();
        reverseProtoWriter.writeBytes(disable.unknownFields());
        AllocationDistribution.ADAPTER.encodeWithTag(reverseProtoWriter, 1, disable.allocation_distribution);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitSetPaycheckMultiAllocationRequest.Disable disable = (SubmitSetPaycheckMultiAllocationRequest.Disable) obj;
        disable.getClass();
        return AllocationDistribution.ADAPTER.encodedSizeWithTag(1, disable.allocation_distribution) + disable.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitSetPaycheckMultiAllocationRequest.Disable disable = (SubmitSetPaycheckMultiAllocationRequest.Disable) obj;
        disable.getClass();
        AllocationDistribution allocationDistribution = disable.allocation_distribution;
        AllocationDistribution allocationDistribution2 = allocationDistribution != null ? (AllocationDistribution) AllocationDistribution.ADAPTER.redact(allocationDistribution) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitSetPaycheckMultiAllocationRequest.Disable(allocationDistribution2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitSetPaycheckMultiAllocationRequest.Disable disable = (SubmitSetPaycheckMultiAllocationRequest.Disable) obj;
        disable.getClass();
        AllocationDistribution.ADAPTER.encodeWithTag(protoWriter, 1, disable.allocation_distribution);
        protoWriter.writeBytes(disable.unknownFields());
    }
}
