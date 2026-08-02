package com.squareup.protos.timecards;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.rewardly.ui.AppLinks;
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

/* loaded from: classes8.dex */
public final class OvertimeRule extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OvertimeRule> CREATOR;
    public final Reason reason;
    public final Integer trigger_seconds;

    /* loaded from: classes9.dex */
    public enum Reason implements WireEnum {
        WEEKLY_OVERTIME(1),
        DAILY_OVERTIME(2),
        DAILY_DOUBLETIME(3),
        SEVENTH_DAY_OVERTIME(4),
        SEVENTH_DAY_DOUBLETIME(5);

        public final int value;
        public static final Plane Companion = new Plane(5);
        public static final OvertimeRule$Reason$Companion$ADAPTER$1 ADAPTER = new OvertimeRule$Reason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Reason.class), Syntax.PROTO_2, null);

        Reason(int i) {
            this.value = i;
        }

        public static final Reason fromValue(int i) {
            Companion.getClass();
            return Plane.m4214fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        OvertimeRule$Companion$ADAPTER$1 overtimeRule$Companion$ADAPTER$1 = new OvertimeRule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OvertimeRule.class), "type.googleapis.com/squareup.timecards.OvertimeRule", Syntax.PROTO_2, null, "squareup/timecards/time_calculation.proto");
        ADAPTER = overtimeRule$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(overtimeRule$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OvertimeRule(Reason reason, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.reason = reason;
        this.trigger_seconds = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OvertimeRule)) {
            return false;
        }
        OvertimeRule overtimeRule = (OvertimeRule) obj;
        return Intrinsics.areEqual(unknownFields(), overtimeRule.unknownFields()) && this.reason == overtimeRule.reason && Intrinsics.areEqual(this.trigger_seconds, overtimeRule.trigger_seconds);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Reason reason = this.reason;
        int hashCode2 = (hashCode + (reason != null ? reason.hashCode() : 0)) * 37;
        Integer num = this.trigger_seconds;
        int hashCode3 = hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(28);
        builder.f1411android = this.reason;
        builder.ios = this.trigger_seconds;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Reason reason = this.reason;
        if (reason != null) {
            arrayList.add("reason=" + reason);
        }
        Integer num = this.trigger_seconds;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("trigger_seconds=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OvertimeRule{", "}", 0, null, null, 56);
    }
}
