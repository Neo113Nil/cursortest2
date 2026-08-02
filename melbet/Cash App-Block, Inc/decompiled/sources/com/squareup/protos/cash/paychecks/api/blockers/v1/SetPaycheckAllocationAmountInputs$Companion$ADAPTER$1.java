package com.squareup.protos.cash.paychecks.api.blockers.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.paychecks.api.blockers.v1.SetPaycheckAllocationAmountInputs;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.AllocationDestination;
import squareup.cash.paychecks.AllocationDistribution;

/* loaded from: classes7.dex */
public final class SetPaycheckAllocationAmountInputs$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetPaycheckAllocationAmountInputs((SetPaycheckAllocationAmountInputs.SubmissionInteraction) obj, (AllocationDistribution) obj2, (AllocationDestination) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SetPaycheckAllocationAmountInputs.SubmissionInteraction.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(AllocationDistribution.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(AllocationDestination.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetPaycheckAllocationAmountInputs setPaycheckAllocationAmountInputs = (SetPaycheckAllocationAmountInputs) obj;
        reverseProtoWriter.getClass();
        setPaycheckAllocationAmountInputs.getClass();
        reverseProtoWriter.writeBytes(setPaycheckAllocationAmountInputs.unknownFields());
        AllocationDestination.ADAPTER.encodeWithTag(reverseProtoWriter, 3, setPaycheckAllocationAmountInputs.selected_destination);
        AllocationDistribution.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setPaycheckAllocationAmountInputs.updated_distribution);
        SetPaycheckAllocationAmountInputs.SubmissionInteraction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setPaycheckAllocationAmountInputs.submission_interaction);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetPaycheckAllocationAmountInputs setPaycheckAllocationAmountInputs = (SetPaycheckAllocationAmountInputs) obj;
        setPaycheckAllocationAmountInputs.getClass();
        return AllocationDestination.ADAPTER.encodedSizeWithTag(3, setPaycheckAllocationAmountInputs.selected_destination) + AllocationDistribution.ADAPTER.encodedSizeWithTag(2, setPaycheckAllocationAmountInputs.updated_distribution) + SetPaycheckAllocationAmountInputs.SubmissionInteraction.ADAPTER.encodedSizeWithTag(1, setPaycheckAllocationAmountInputs.submission_interaction) + setPaycheckAllocationAmountInputs.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetPaycheckAllocationAmountInputs setPaycheckAllocationAmountInputs = (SetPaycheckAllocationAmountInputs) obj;
        setPaycheckAllocationAmountInputs.getClass();
        AllocationDistribution allocationDistribution = setPaycheckAllocationAmountInputs.updated_distribution;
        AllocationDistribution allocationDistribution2 = allocationDistribution != null ? (AllocationDistribution) AllocationDistribution.ADAPTER.redact(allocationDistribution) : null;
        AllocationDestination allocationDestination = setPaycheckAllocationAmountInputs.selected_destination;
        AllocationDestination allocationDestination2 = allocationDestination != null ? (AllocationDestination) AllocationDestination.ADAPTER.redact(allocationDestination) : null;
        ByteString byteString = ByteString.EMPTY;
        SetPaycheckAllocationAmountInputs.SubmissionInteraction submissionInteraction = setPaycheckAllocationAmountInputs.submission_interaction;
        byteString.getClass();
        return new SetPaycheckAllocationAmountInputs(submissionInteraction, allocationDistribution2, allocationDestination2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetPaycheckAllocationAmountInputs setPaycheckAllocationAmountInputs = (SetPaycheckAllocationAmountInputs) obj;
        setPaycheckAllocationAmountInputs.getClass();
        SetPaycheckAllocationAmountInputs.SubmissionInteraction.ADAPTER.encodeWithTag(protoWriter, 1, setPaycheckAllocationAmountInputs.submission_interaction);
        AllocationDistribution.ADAPTER.encodeWithTag(protoWriter, 2, setPaycheckAllocationAmountInputs.updated_distribution);
        AllocationDestination.ADAPTER.encodeWithTag(protoWriter, 3, setPaycheckAllocationAmountInputs.selected_destination);
        protoWriter.writeBytes(setPaycheckAllocationAmountInputs.unknownFields());
    }
}
