package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/timecards/StopTimecardBreakResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/bills/BillsApplet$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StopTimecardBreakResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StopTimecardBreakResponse> CREATOR;
    public final Timecard timecard;
    public final TimecardBreak timecard_break;
    public final Boolean valid;

    static {
        StopTimecardBreakResponse$Companion$ADAPTER$1 stopTimecardBreakResponse$Companion$ADAPTER$1 = new StopTimecardBreakResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StopTimecardBreakResponse.class), "type.googleapis.com/squareup.timecards.StopTimecardBreakResponse", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = stopTimecardBreakResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(stopTimecardBreakResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopTimecardBreakResponse(Timecard timecard, TimecardBreak timecardBreak, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.timecard = timecard;
        this.timecard_break = timecardBreak;
        this.valid = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StopTimecardBreakResponse)) {
            return false;
        }
        StopTimecardBreakResponse stopTimecardBreakResponse = (StopTimecardBreakResponse) obj;
        return Intrinsics.areEqual(unknownFields(), stopTimecardBreakResponse.unknownFields()) && Intrinsics.areEqual(this.timecard, stopTimecardBreakResponse.timecard) && Intrinsics.areEqual(this.timecard_break, stopTimecardBreakResponse.timecard_break) && Intrinsics.areEqual(this.valid, stopTimecardBreakResponse.valid);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Timecard timecard = this.timecard;
        int hashCode2 = (hashCode + (timecard != null ? timecard.hashCode() : 0)) * 37;
        TimecardBreak timecardBreak = this.timecard_break;
        int hashCode3 = (hashCode2 + (timecardBreak != null ? timecardBreak.hashCode() : 0)) * 37;
        Boolean bool = this.valid;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(11);
        builder.action = this.timecard;
        builder.full_applet = this.timecard_break;
        builder.half_applet = this.valid;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Timecard timecard = this.timecard;
        if (timecard != null) {
            arrayList.add("timecard=" + timecard);
        }
        TimecardBreak timecardBreak = this.timecard_break;
        if (timecardBreak != null) {
            arrayList.add("timecard_break=" + timecardBreak);
        }
        Boolean bool = this.valid;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("valid=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StopTimecardBreakResponse{", "}", 0, null, null, 56);
    }
}
