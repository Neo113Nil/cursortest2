package com.squareup.protos.timecards;

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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Binding;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/timecards/StartTimecardBreakResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lxyz/block/protos/genie/Binding$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StartTimecardBreakResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StartTimecardBreakResponse> CREATOR;
    public final Boolean break_definition_outdated;
    public final List break_definitions;
    public final Timecard timecard;
    public final TimecardBreak timecard_break;
    public final Boolean valid;

    static {
        StartTimecardBreakResponse$Companion$ADAPTER$1 startTimecardBreakResponse$Companion$ADAPTER$1 = new StartTimecardBreakResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StartTimecardBreakResponse.class), "type.googleapis.com/squareup.timecards.StartTimecardBreakResponse", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = startTimecardBreakResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(startTimecardBreakResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartTimecardBreakResponse(Timecard timecard, TimecardBreak timecardBreak, List list, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.timecard = timecard;
        this.timecard_break = timecardBreak;
        this.valid = bool;
        this.break_definition_outdated = bool2;
        this.break_definitions = TransactorKt.immutableCopyOf("break_definitions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartTimecardBreakResponse)) {
            return false;
        }
        StartTimecardBreakResponse startTimecardBreakResponse = (StartTimecardBreakResponse) obj;
        return Intrinsics.areEqual(unknownFields(), startTimecardBreakResponse.unknownFields()) && Intrinsics.areEqual(this.timecard, startTimecardBreakResponse.timecard) && Intrinsics.areEqual(this.timecard_break, startTimecardBreakResponse.timecard_break) && Intrinsics.areEqual(this.break_definitions, startTimecardBreakResponse.break_definitions) && Intrinsics.areEqual(this.valid, startTimecardBreakResponse.valid) && Intrinsics.areEqual(this.break_definition_outdated, startTimecardBreakResponse.break_definition_outdated);
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
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (timecardBreak != null ? timecardBreak.hashCode() : 0)) * 37, 37, this.break_definitions);
        Boolean bool = this.valid;
        int hashCode3 = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.break_definition_outdated;
        int hashCode4 = hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(8);
        builder.key_path = this.timecard;
        builder.get_transform = this.timecard_break;
        builder.set_transform = this.break_definitions;
        builder.validation = this.valid;
        builder.on_invalid = this.break_definition_outdated;
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
        List list = this.break_definitions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("break_definitions=", arrayList, list);
        }
        Boolean bool = this.valid;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("valid=", bool, arrayList);
        }
        Boolean bool2 = this.break_definition_outdated;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("break_definition_outdated=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StartTimecardBreakResponse{", "}", 0, null, null, 56);
    }
}
