package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes8.dex */
public final class AutomaticClockoutDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AutomaticClockoutDetails> CREATOR;
    public final String automatically_clocked_out_at;
    public final String scheduled_clockout_at;
    public final Timecard timecard;

    static {
        AutomaticClockoutDetails$Companion$ADAPTER$1 automaticClockoutDetails$Companion$ADAPTER$1 = new AutomaticClockoutDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AutomaticClockoutDetails.class), "type.googleapis.com/squareup.timecards.AutomaticClockoutDetails", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = automaticClockoutDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(automaticClockoutDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutomaticClockoutDetails(Timecard timecard, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.timecard = timecard;
        this.automatically_clocked_out_at = str;
        this.scheduled_clockout_at = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutomaticClockoutDetails)) {
            return false;
        }
        AutomaticClockoutDetails automaticClockoutDetails = (AutomaticClockoutDetails) obj;
        return Intrinsics.areEqual(unknownFields(), automaticClockoutDetails.unknownFields()) && Intrinsics.areEqual(this.timecard, automaticClockoutDetails.timecard) && Intrinsics.areEqual(this.automatically_clocked_out_at, automaticClockoutDetails.automatically_clocked_out_at) && Intrinsics.areEqual(this.scheduled_clockout_at, automaticClockoutDetails.scheduled_clockout_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Timecard timecard = this.timecard;
        int hashCode2 = (hashCode + (timecard != null ? timecard.hashCode() : 0)) * 37;
        String str = this.automatically_clocked_out_at;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.scheduled_clockout_at;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(9);
        builder.action = this.timecard;
        builder.full_applet = this.automatically_clocked_out_at;
        builder.half_applet = this.scheduled_clockout_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Timecard timecard = this.timecard;
        if (timecard != null) {
            arrayList.add("timecard=" + timecard);
        }
        String str = this.automatically_clocked_out_at;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "automatically_clocked_out_at=", arrayList);
        }
        String str2 = this.scheduled_clockout_at;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "scheduled_clockout_at=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AutomaticClockoutDetails{", "}", 0, null, null, 56);
    }
}
