package com.squareup.protos.cash.cryptoinvestflow.api.blockers.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.Channel;
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

/* loaded from: classes7.dex */
public final class BitcoinP2pConversionPercentageInputs extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BitcoinP2pConversionPercentageInputs> CREATOR;
    public final Long selected_percentage_bps;
    public final SubmissionInteraction submission_interaction;

    public enum SubmissionInteraction implements WireEnum {
        SUBMISSION_INTERACTION_UNSPECIFIED(0),
        SUBMISSION_INTERACTION_CANCEL(1),
        SUBMISSION_INTERACTION_CONFIRM(2),
        SUBMISSION_INTERACTION_DISABLE(3);

        public static final BitcoinP2pConversionPercentageInputs$SubmissionInteraction$Companion$ADAPTER$1 ADAPTER;
        public static final Channel.Companion Companion;
        public final int value;

        static {
            SubmissionInteraction submissionInteraction = SUBMISSION_INTERACTION_UNSPECIFIED;
            Companion = new Channel.Companion();
            ADAPTER = new BitcoinP2pConversionPercentageInputs$SubmissionInteraction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SubmissionInteraction.class), Syntax.PROTO_2, submissionInteraction);
        }

        SubmissionInteraction(int i) {
            this.value = i;
        }

        public static final SubmissionInteraction fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return SUBMISSION_INTERACTION_UNSPECIFIED;
            }
            if (i == 1) {
                return SUBMISSION_INTERACTION_CANCEL;
            }
            if (i == 2) {
                return SUBMISSION_INTERACTION_CONFIRM;
            }
            if (i != 3) {
                return null;
            }
            return SUBMISSION_INTERACTION_DISABLE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        BitcoinP2pConversionPercentageInputs$Companion$ADAPTER$1 bitcoinP2pConversionPercentageInputs$Companion$ADAPTER$1 = new BitcoinP2pConversionPercentageInputs$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BitcoinP2pConversionPercentageInputs.class), "type.googleapis.com/squareup.cash.cryptoinvestflow.api.blockers.v1.BitcoinP2pConversionPercentageInputs", Syntax.PROTO_2, null, "squareup/cash/cryptoinvestflow/api/blockers/v1/bitcoin_p2p_conversion_percentage.proto");
        ADAPTER = bitcoinP2pConversionPercentageInputs$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bitcoinP2pConversionPercentageInputs$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinP2pConversionPercentageInputs(SubmissionInteraction submissionInteraction, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.submission_interaction = submissionInteraction;
        this.selected_percentage_bps = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitcoinP2pConversionPercentageInputs)) {
            return false;
        }
        BitcoinP2pConversionPercentageInputs bitcoinP2pConversionPercentageInputs = (BitcoinP2pConversionPercentageInputs) obj;
        return Intrinsics.areEqual(unknownFields(), bitcoinP2pConversionPercentageInputs.unknownFields()) && this.submission_interaction == bitcoinP2pConversionPercentageInputs.submission_interaction && Intrinsics.areEqual(this.selected_percentage_bps, bitcoinP2pConversionPercentageInputs.selected_percentage_bps);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SubmissionInteraction submissionInteraction = this.submission_interaction;
        int hashCode2 = (hashCode + (submissionInteraction != null ? submissionInteraction.hashCode() : 0)) * 37;
        Long l = this.selected_percentage_bps;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(1);
        builder.f1268type = this.submission_interaction;
        builder.details = this.selected_percentage_bps;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SubmissionInteraction submissionInteraction = this.submission_interaction;
        if (submissionInteraction != null) {
            arrayList.add("submission_interaction=" + submissionInteraction);
        }
        Long l = this.selected_percentage_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("selected_percentage_bps=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BitcoinP2pConversionPercentageInputs{", "}", 0, null, null, 56);
    }
}
