package com.squareup.protos.teamapp.ui;

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
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes8.dex */
public final class Duration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Duration> CREATOR;
    public final List allowed_units;
    public final String duration;
    public final Integer maximum_unit_count;

    /* loaded from: classes9.dex */
    public enum Unit implements WireEnum {
        SECOND(0),
        MINUTE(1),
        HOUR(2),
        DAY(3),
        MONTH(4),
        YEAR(5);

        public static final Duration$Unit$Companion$ADAPTER$1 ADAPTER;
        public static final KClasses$$Lambda$1 Companion;
        public final int value;

        static {
            Unit unit = SECOND;
            Companion = new KClasses$$Lambda$1(3);
            ADAPTER = new Duration$Unit$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Unit.class), Syntax.PROTO_2, unit);
        }

        Unit(int i) {
            this.value = i;
        }

        public static final Unit fromValue(int i) {
            Companion.getClass();
            return KClasses$$Lambda$1.m4136fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Duration$Companion$ADAPTER$1 duration$Companion$ADAPTER$1 = new Duration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Duration.class), "type.googleapis.com/squareup.teamapp.ui.Duration", Syntax.PROTO_2, null, "squareup/teamapp/ui/models.proto");
        ADAPTER = duration$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(duration$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Duration(String str, List list, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        list.getClass();
        byteString.getClass();
        this.duration = str;
        this.maximum_unit_count = num;
        this.allowed_units = TransactorKt.immutableCopyOf("allowed_units", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return Intrinsics.areEqual(unknownFields(), duration.unknownFields()) && Intrinsics.areEqual(this.duration, duration.duration) && Intrinsics.areEqual(this.allowed_units, duration.allowed_units) && Intrinsics.areEqual(this.maximum_unit_count, duration.maximum_unit_count);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.duration), 37, this.allowed_units);
        Integer num = this.maximum_unit_count;
        int hashCode = m + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(5);
        builder.action = this.duration;
        builder.full_applet = this.allowed_units;
        builder.half_applet = this.maximum_unit_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.duration, "duration=", arrayList);
        List list = this.allowed_units;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("allowed_units=", arrayList, list);
        }
        Integer num = this.maximum_unit_count;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("maximum_unit_count=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Duration{", "}", 0, null, null, 56);
    }
}
