package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.protos.timecards.scheduling.TimeOff;
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
import squareup.cash.earnings.EarningTool;

/* loaded from: classes8.dex */
public final class ProposedTimeOff extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProposedTimeOff> CREATOR;
    public final TimeOff time_off;

    static {
        ProposedTimeOff$Companion$ADAPTER$1 proposedTimeOff$Companion$ADAPTER$1 = new ProposedTimeOff$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProposedTimeOff.class), "type.googleapis.com/squareup.timecards.ProposedTimeOff", Syntax.PROTO_2, null, "squareup/timecards/change_proposal.proto");
        ADAPTER = proposedTimeOff$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(proposedTimeOff$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProposedTimeOff(TimeOff timeOff, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.time_off = timeOff;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProposedTimeOff)) {
            return false;
        }
        ProposedTimeOff proposedTimeOff = (ProposedTimeOff) obj;
        return Intrinsics.areEqual(unknownFields(), proposedTimeOff.unknownFields()) && Intrinsics.areEqual(this.time_off, proposedTimeOff.time_off);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TimeOff timeOff = this.time_off;
        int hashCode2 = hashCode + (timeOff != null ? timeOff.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(3);
        builder.tool = this.time_off;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TimeOff timeOff = this.time_off;
        if (timeOff != null) {
            arrayList.add("time_off=" + timeOff);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProposedTimeOff{", "}", 0, null, null, 56);
    }
}
