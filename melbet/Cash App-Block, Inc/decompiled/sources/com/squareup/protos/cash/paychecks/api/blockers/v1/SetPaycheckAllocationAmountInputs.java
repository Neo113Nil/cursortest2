package com.squareup.protos.cash.paychecks.api.blockers.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.paychecks.AllocationDestination;
import squareup.cash.paychecks.AllocationDistribution;

/* loaded from: classes7.dex */
public final class SetPaycheckAllocationAmountInputs extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetPaycheckAllocationAmountInputs> CREATOR;
    public final AllocationDestination selected_destination;
    public final SubmissionInteraction submission_interaction;
    public final AllocationDistribution updated_distribution;

    public enum SubmissionInteraction implements WireEnum {
        SUBMISSION_INTERACTION_UNSPECIFIED(0),
        SUBMISSION_INTERACTION_CANCEL(1),
        SUBMISSION_INTERACTION_BUTTON_TAP_CONFIRM(2),
        SUBMISSION_INTERACTION_BUTTON_TAP_DISABLE(3),
        SUBMISSION_INTERACTION_CONFIGURATION_ROW_TAP(4),
        SUBMISSION_INTERACTION_DESTINATION_SELECTION_CHANGE(5);

        public static final SetPaycheckAllocationAmountInputs$SubmissionInteraction$Companion$ADAPTER$1 ADAPTER;
        public static final ContactAliasType.Companion Companion;
        public final int value;

        static {
            SubmissionInteraction submissionInteraction = SUBMISSION_INTERACTION_UNSPECIFIED;
            Companion = new ContactAliasType.Companion();
            ADAPTER = new SetPaycheckAllocationAmountInputs$SubmissionInteraction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SubmissionInteraction.class), Syntax.PROTO_2, submissionInteraction);
        }

        SubmissionInteraction(int i) {
            this.value = i;
        }

        public static final SubmissionInteraction fromValue(int i) {
            Companion.getClass();
            return ContactAliasType.Companion.m3899fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SetPaycheckAllocationAmountInputs$Companion$ADAPTER$1 setPaycheckAllocationAmountInputs$Companion$ADAPTER$1 = new SetPaycheckAllocationAmountInputs$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetPaycheckAllocationAmountInputs.class), "type.googleapis.com/squareup.cash.paychecks.api.blockers.v1.SetPaycheckAllocationAmountInputs", Syntax.PROTO_2, null, "squareup/cash/paychecks/api/blockers/v1/set_paycheck_allocation_amount.proto");
        ADAPTER = setPaycheckAllocationAmountInputs$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setPaycheckAllocationAmountInputs$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPaycheckAllocationAmountInputs(SubmissionInteraction submissionInteraction, AllocationDistribution allocationDistribution, AllocationDestination allocationDestination, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.submission_interaction = submissionInteraction;
        this.updated_distribution = allocationDistribution;
        this.selected_destination = allocationDestination;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetPaycheckAllocationAmountInputs)) {
            return false;
        }
        SetPaycheckAllocationAmountInputs setPaycheckAllocationAmountInputs = (SetPaycheckAllocationAmountInputs) obj;
        return Intrinsics.areEqual(unknownFields(), setPaycheckAllocationAmountInputs.unknownFields()) && this.submission_interaction == setPaycheckAllocationAmountInputs.submission_interaction && Intrinsics.areEqual(this.updated_distribution, setPaycheckAllocationAmountInputs.updated_distribution) && Intrinsics.areEqual(this.selected_destination, setPaycheckAllocationAmountInputs.selected_destination);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SubmissionInteraction submissionInteraction = this.submission_interaction;
        int hashCode2 = (hashCode + (submissionInteraction != null ? submissionInteraction.hashCode() : 0)) * 37;
        AllocationDistribution allocationDistribution = this.updated_distribution;
        int hashCode3 = (hashCode2 + (allocationDistribution != null ? allocationDistribution.hashCode() : 0)) * 37;
        AllocationDestination allocationDestination = this.selected_destination;
        int hashCode4 = hashCode3 + (allocationDestination != null ? allocationDestination.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(22, false);
        builder.advertisement_data = this.submission_interaction;
        builder.transmission_level = this.updated_distribution;
        builder.frequency = this.selected_destination;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SubmissionInteraction submissionInteraction = this.submission_interaction;
        if (submissionInteraction != null) {
            arrayList.add("submission_interaction=" + submissionInteraction);
        }
        AllocationDistribution allocationDistribution = this.updated_distribution;
        if (allocationDistribution != null) {
            arrayList.add("updated_distribution=" + allocationDistribution);
        }
        AllocationDestination allocationDestination = this.selected_destination;
        if (allocationDestination != null) {
            arrayList.add("selected_destination=" + allocationDestination);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetPaycheckAllocationAmountInputs{", "}", 0, null, null, 56);
    }
}
