package com.squareup.protos.timecards;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.rewardly.ui.AppLinks;
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
import net.idrnd.face.iad.capture.Plane;
import okio.ByteString;
import xyz.block.protos.genie.Binding;

/* loaded from: classes8.dex */
public final class CalculationTotal extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CalculationTotal> CREATOR;
    public final Integer doubletime_seconds;
    public final Integer overtime_seconds;
    public final Integer regular_seconds;
    public final List seconds_worked_for_pay_state;
    public final Integer total_paid_seconds;

    public final class MapEntry extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MapEntry> CREATOR;
        public final PayState pay_state;
        public final Integer seconds;

        static {
            CalculationTotal$MapEntry$Companion$ADAPTER$1 calculationTotal$MapEntry$Companion$ADAPTER$1 = new CalculationTotal$MapEntry$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MapEntry.class), "type.googleapis.com/squareup.timecards.CalculationTotal.MapEntry", Syntax.PROTO_2, null, "squareup/timecards/time_calculation.proto");
            ADAPTER = calculationTotal$MapEntry$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(calculationTotal$MapEntry$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MapEntry(PayState payState, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.pay_state = payState;
            this.seconds = num;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapEntry)) {
                return false;
            }
            MapEntry mapEntry = (MapEntry) obj;
            return Intrinsics.areEqual(unknownFields(), mapEntry.unknownFields()) && this.pay_state == mapEntry.pay_state && Intrinsics.areEqual(this.seconds, mapEntry.seconds);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            PayState payState = this.pay_state;
            int hashCode2 = (hashCode + (payState != null ? payState.hashCode() : 0)) * 37;
            Integer num = this.seconds;
            int hashCode3 = hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AppLinks.Builder builder = new AppLinks.Builder(24);
            builder.f1411android = this.pay_state;
            builder.ios = this.seconds;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            PayState payState = this.pay_state;
            if (payState != null) {
                arrayList.add("pay_state=" + payState);
            }
            Integer num = this.seconds;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("seconds=", num, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MapEntry{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes9.dex */
    public enum PayState implements WireEnum {
        REGULAR(1),
        REGULAR_PAID_BREAK(2),
        REGULAR_UNPAID_BREAK(3),
        OVERTIME(4),
        OVERTIME_PAID_BREAK(5),
        OVERTIME_UNPAID_BREAK(6),
        DOUBLETIME(7),
        DOUBLETIME_PAID_BREAK(8),
        DOUBLETIME_UNPAID_BREAK(9);

        public final int value;
        public static final Plane Companion = new Plane(4);
        public static final CalculationTotal$PayState$Companion$ADAPTER$1 ADAPTER = new CalculationTotal$PayState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PayState.class), Syntax.PROTO_2, null);

        PayState(int i) {
            this.value = i;
        }

        public static final PayState fromValue(int i) {
            Companion.getClass();
            return Plane.m4213fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CalculationTotal$Companion$ADAPTER$1 calculationTotal$Companion$ADAPTER$1 = new CalculationTotal$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CalculationTotal.class), "type.googleapis.com/squareup.timecards.CalculationTotal", Syntax.PROTO_2, null, "squareup/timecards/time_calculation.proto");
        ADAPTER = calculationTotal$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(calculationTotal$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculationTotal(Integer num, Integer num2, Integer num3, List list, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.regular_seconds = num;
        this.overtime_seconds = num2;
        this.doubletime_seconds = num3;
        this.total_paid_seconds = num4;
        this.seconds_worked_for_pay_state = TransactorKt.immutableCopyOf("seconds_worked_for_pay_state", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CalculationTotal)) {
            return false;
        }
        CalculationTotal calculationTotal = (CalculationTotal) obj;
        return Intrinsics.areEqual(unknownFields(), calculationTotal.unknownFields()) && Intrinsics.areEqual(this.regular_seconds, calculationTotal.regular_seconds) && Intrinsics.areEqual(this.overtime_seconds, calculationTotal.overtime_seconds) && Intrinsics.areEqual(this.doubletime_seconds, calculationTotal.doubletime_seconds) && Intrinsics.areEqual(this.seconds_worked_for_pay_state, calculationTotal.seconds_worked_for_pay_state) && Intrinsics.areEqual(this.total_paid_seconds, calculationTotal.total_paid_seconds);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.regular_seconds;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.overtime_seconds;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Integer num3 = this.doubletime_seconds;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37, 37, this.seconds_worked_for_pay_state);
        Integer num4 = this.total_paid_seconds;
        int hashCode4 = m + (num4 != null ? Integer.hashCode(num4.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(5);
        builder.key_path = this.regular_seconds;
        builder.get_transform = this.overtime_seconds;
        builder.set_transform = this.doubletime_seconds;
        builder.validation = this.seconds_worked_for_pay_state;
        builder.on_invalid = this.total_paid_seconds;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.regular_seconds;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("regular_seconds=", num, arrayList);
        }
        Integer num2 = this.overtime_seconds;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("overtime_seconds=", num2, arrayList);
        }
        Integer num3 = this.doubletime_seconds;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("doubletime_seconds=", num3, arrayList);
        }
        List list = this.seconds_worked_for_pay_state;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("seconds_worked_for_pay_state=", arrayList, list);
        }
        Integer num4 = this.total_paid_seconds;
        if (num4 != null) {
            re$$ExternalSyntheticOutline0.m("total_paid_seconds=", num4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CalculationTotal{", "}", 0, null, null, 56);
    }
}
