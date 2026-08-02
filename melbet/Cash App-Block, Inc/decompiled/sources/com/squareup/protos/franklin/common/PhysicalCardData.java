package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.protos.invest.ui.ClientDriven;
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

/* loaded from: classes8.dex */
public final class PhysicalCardData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PhysicalCardData> CREATOR;
    public final State physical_card_state;

    public enum State implements WireEnum {
        REQUESTED(1),
        READY_TO_ACTIVATE(2),
        ACTIVATED(3);

        public final int value;
        public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
        public static final PhysicalCardData$State$Companion$ADAPTER$1 ADAPTER = new PhysicalCardData$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, null);

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return REQUESTED;
            }
            if (i == 2) {
                return READY_TO_ACTIVATE;
            }
            if (i != 3) {
                return null;
            }
            return ACTIVATED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        PhysicalCardData$Companion$ADAPTER$1 physicalCardData$Companion$ADAPTER$1 = new PhysicalCardData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PhysicalCardData.class), "type.googleapis.com/squareup.franklin.common.PhysicalCardData", Syntax.PROTO_2, null, "squareup/franklin/common/cards.proto");
        ADAPTER = physicalCardData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(physicalCardData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhysicalCardData(State state, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.physical_card_state = state;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhysicalCardData)) {
            return false;
        }
        PhysicalCardData physicalCardData = (PhysicalCardData) obj;
        return Intrinsics.areEqual(unknownFields(), physicalCardData.unknownFields()) && this.physical_card_state == physicalCardData.physical_card_state;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        State state = this.physical_card_state;
        int hashCode2 = hashCode + (state != null ? state.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(2);
        builder.cash_limit_group = this.physical_card_state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        State state = this.physical_card_state;
        if (state != null) {
            arrayList.add("physical_card_state=" + state);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PhysicalCardData{", "}", 0, null, null, 56);
    }
}
