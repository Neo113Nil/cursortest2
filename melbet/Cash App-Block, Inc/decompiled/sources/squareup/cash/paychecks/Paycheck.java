package squareup.cash.paychecks;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;
import okio.ByteString;
import squareup.cash.bills.BillsConfig;
import xyz.block.protos.genie.Action;

/* loaded from: classes10.dex */
public final class Paycheck extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Paycheck> CREATOR;
    public final AllocationDistribution allocation_distribution;
    public final List deductions;
    public final Employer employer;
    public final String paycheck_token;
    public final List realized_allocation_amounts;
    public final SettlementDate settlement_date;

    public final class SettlementDate extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SettlementDate> CREATOR;
        public final Long date;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1639type;

        public enum Type implements WireEnum {
            EXPECTED(0),
            PENDING(1),
            COMPLETED(2);

            public static final Paycheck$SettlementDate$Type$Companion$ADAPTER$1 ADAPTER;
            public static final KClasses$$Lambda$1 Companion;
            public final int value;

            static {
                Type type2 = EXPECTED;
                Companion = new KClasses$$Lambda$1(26);
                ADAPTER = new Paycheck$SettlementDate$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
            }

            Type(int i) {
                this.value = i;
            }

            public static final Type fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return EXPECTED;
                }
                if (i == 1) {
                    return PENDING;
                }
                if (i != 2) {
                    return null;
                }
                return COMPLETED;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            Paycheck$SettlementDate$Companion$ADAPTER$1 paycheck$SettlementDate$Companion$ADAPTER$1 = new Paycheck$SettlementDate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SettlementDate.class), "type.googleapis.com/squareup.cash.paychecks.Paycheck.SettlementDate", Syntax.PROTO_2, null, "squareup/cash/paychecks/Paycheck.proto");
            ADAPTER = paycheck$SettlementDate$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(paycheck$SettlementDate$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SettlementDate(Type type2, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.f1639type = type2;
            this.date = l;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SettlementDate)) {
                return false;
            }
            SettlementDate settlementDate = (SettlementDate) obj;
            return Intrinsics.areEqual(unknownFields(), settlementDate.unknownFields()) && this.f1639type == settlementDate.f1639type && Intrinsics.areEqual(this.date, settlementDate.date);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Type type2 = this.f1639type;
            int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
            Long l = this.date;
            int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsConfig.Builder builder = new BillsConfig.Builder(18);
            builder.bills_applet_default_action = this.f1639type;
            builder.half_applet_content = this.date;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Type type2 = this.f1639type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            Long l = this.date;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("date=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SettlementDate{", "}", 0, null, null, 56);
        }
    }

    static {
        Paycheck$Companion$ADAPTER$1 paycheck$Companion$ADAPTER$1 = new Paycheck$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Paycheck.class), "type.googleapis.com/squareup.cash.paychecks.Paycheck", Syntax.PROTO_2, null, "squareup/cash/paychecks/Paycheck.proto");
        ADAPTER = paycheck$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paycheck$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Paycheck(String str, SettlementDate settlementDate, Employer employer, AllocationDistribution allocationDistribution, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.paycheck_token = str;
        this.settlement_date = settlementDate;
        this.employer = employer;
        this.allocation_distribution = allocationDistribution;
        this.deductions = TransactorKt.immutableCopyOf("deductions", list);
        this.realized_allocation_amounts = TransactorKt.immutableCopyOf("realized_allocation_amounts", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Paycheck)) {
            return false;
        }
        Paycheck paycheck = (Paycheck) obj;
        return Intrinsics.areEqual(unknownFields(), paycheck.unknownFields()) && Intrinsics.areEqual(this.paycheck_token, paycheck.paycheck_token) && Intrinsics.areEqual(this.settlement_date, paycheck.settlement_date) && Intrinsics.areEqual(this.employer, paycheck.employer) && Intrinsics.areEqual(this.allocation_distribution, paycheck.allocation_distribution) && Intrinsics.areEqual(this.deductions, paycheck.deductions) && Intrinsics.areEqual(this.realized_allocation_amounts, paycheck.realized_allocation_amounts);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.paycheck_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        SettlementDate settlementDate = this.settlement_date;
        int hashCode3 = (hashCode2 + (settlementDate != null ? settlementDate.hashCode() : 0)) * 37;
        Employer employer = this.employer;
        int hashCode4 = (hashCode3 + (employer != null ? employer.hashCode() : 0)) * 37;
        AllocationDistribution allocationDistribution = this.allocation_distribution;
        int hashCode5 = this.realized_allocation_amounts.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (allocationDistribution != null ? allocationDistribution.hashCode() : 0)) * 37, 37, this.deductions);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(7);
        builder.navigate = this.paycheck_token;
        builder.set_view_state_value = this.settlement_date;
        builder.open_url = this.employer;
        builder.compound_action = this.allocation_distribution;
        builder.submit = this.deductions;
        builder.collection_mutation = this.realized_allocation_amounts;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.paycheck_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "paycheck_token=", arrayList);
        }
        SettlementDate settlementDate = this.settlement_date;
        if (settlementDate != null) {
            arrayList.add("settlement_date=" + settlementDate);
        }
        Employer employer = this.employer;
        if (employer != null) {
            arrayList.add("employer=" + employer);
        }
        AllocationDistribution allocationDistribution = this.allocation_distribution;
        if (allocationDistribution != null) {
            arrayList.add("allocation_distribution=" + allocationDistribution);
        }
        List list = this.deductions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("deductions=", arrayList, list);
        }
        List list2 = this.realized_allocation_amounts;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("realized_allocation_amounts=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Paycheck{", "}", 0, null, null, 56);
    }
}
