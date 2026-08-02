package com.squareup.protos.timecards;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsConfig;

/* loaded from: classes8.dex */
public final class TimecardAndBreaks extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TimecardAndBreaks> CREATOR;
    public final List breaks;
    public final Timecard timecard;

    static {
        TimecardAndBreaks$Companion$ADAPTER$1 timecardAndBreaks$Companion$ADAPTER$1 = new TimecardAndBreaks$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TimecardAndBreaks.class), "type.googleapis.com/squareup.timecards.TimecardAndBreaks", Syntax.PROTO_2, null, "squareup/timecards/data.proto");
        ADAPTER = timecardAndBreaks$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(timecardAndBreaks$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimecardAndBreaks(Timecard timecard, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.timecard = timecard;
        this.breaks = TransactorKt.immutableCopyOf("breaks", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimecardAndBreaks)) {
            return false;
        }
        TimecardAndBreaks timecardAndBreaks = (TimecardAndBreaks) obj;
        return Intrinsics.areEqual(unknownFields(), timecardAndBreaks.unknownFields()) && Intrinsics.areEqual(this.timecard, timecardAndBreaks.timecard) && Intrinsics.areEqual(this.breaks, timecardAndBreaks.breaks);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Timecard timecard = this.timecard;
        int hashCode2 = this.breaks.hashCode() + ((hashCode + (timecard != null ? timecard.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsConfig.Builder builder = new BillsConfig.Builder(1);
        builder.bills_applet_default_action = this.timecard;
        builder.half_applet_content = this.breaks;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Timecard timecard = this.timecard;
        if (timecard != null) {
            arrayList.add("timecard=" + timecard);
        }
        List list = this.breaks;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("breaks=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimecardAndBreaks{", "}", 0, null, null, 56);
    }
}
