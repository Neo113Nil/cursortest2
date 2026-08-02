package squareup.cash.paychecks;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
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
import net.idrnd.face.iad.capture.Plane;
import okio.ByteString;
import squareup.cash.paychecks.Deduction;

/* loaded from: classes10.dex */
public final class RealizedAllocationAmount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RealizedAllocationAmount> CREATOR;
    public final AllocationDestination destination;
    public final LocalizedString note;
    public final Money realized_amount;
    public final State state;

    public enum State implements WireEnum {
        PENDING(1),
        COMPLETED(2),
        ERRORED(3);

        public final int value;
        public static final Plane Companion = new Plane(27);
        public static final RealizedAllocationAmount$State$Companion$ADAPTER$1 ADAPTER = new RealizedAllocationAmount$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, null);

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return PENDING;
            }
            if (i == 2) {
                return COMPLETED;
            }
            if (i != 3) {
                return null;
            }
            return ERRORED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        RealizedAllocationAmount$Companion$ADAPTER$1 realizedAllocationAmount$Companion$ADAPTER$1 = new RealizedAllocationAmount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RealizedAllocationAmount.class), "type.googleapis.com/squareup.cash.paychecks.RealizedAllocationAmount", Syntax.PROTO_2, null, "squareup/cash/paychecks/common.proto");
        ADAPTER = realizedAllocationAmount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(realizedAllocationAmount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealizedAllocationAmount(AllocationDestination allocationDestination, Money money, State state, LocalizedString localizedString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.destination = allocationDestination;
        this.realized_amount = money;
        this.state = state;
        this.note = localizedString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RealizedAllocationAmount)) {
            return false;
        }
        RealizedAllocationAmount realizedAllocationAmount = (RealizedAllocationAmount) obj;
        return Intrinsics.areEqual(unknownFields(), realizedAllocationAmount.unknownFields()) && Intrinsics.areEqual(this.destination, realizedAllocationAmount.destination) && Intrinsics.areEqual(this.realized_amount, realizedAllocationAmount.realized_amount) && this.state == realizedAllocationAmount.state && Intrinsics.areEqual(this.note, realizedAllocationAmount.note);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AllocationDestination allocationDestination = this.destination;
        int hashCode2 = (hashCode + (allocationDestination != null ? allocationDestination.hashCode() : 0)) * 37;
        Money money = this.realized_amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode4 = (hashCode3 + (state != null ? state.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.note;
        int hashCode5 = hashCode4 + (localizedString != null ? localizedString.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Deduction.Builder builder = new Deduction.Builder(18);
        builder.note = this.destination;
        builder.amount = this.realized_amount;
        builder.tint_color = this.state;
        builder.description = this.note;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AllocationDestination allocationDestination = this.destination;
        if (allocationDestination != null) {
            arrayList.add("destination=" + allocationDestination);
        }
        Money money = this.realized_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("realized_amount=", money, arrayList);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        LocalizedString localizedString = this.note;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("note=", localizedString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RealizedAllocationAmount{", "}", 0, null, null, 56);
    }
}
