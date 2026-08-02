package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.franklin.ui.UiCashLimits;
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

/* loaded from: classes8.dex */
public final class TimelineRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TimelineRenderData> CREATOR;
    public final Timeline timeline;

    static {
        TimelineRenderData$Companion$ADAPTER$1 timelineRenderData$Companion$ADAPTER$1 = new TimelineRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TimelineRenderData.class), "type.googleapis.com/squareup.franklin.TimelineRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = timelineRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(timelineRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineRenderData(Timeline timeline, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.timeline = timeline;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimelineRenderData)) {
            return false;
        }
        TimelineRenderData timelineRenderData = (TimelineRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), timelineRenderData.unknownFields()) && Intrinsics.areEqual(this.timeline, timelineRenderData.timeline);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Timeline timeline = this.timeline;
        int hashCode2 = hashCode + (timeline != null ? timeline.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(17);
        builder.cash_limit_group = this.timeline;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Timeline timeline = this.timeline;
        if (timeline != null) {
            arrayList.add("timeline=" + timeline);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimelineRenderData{", "}", 0, null, null, 56);
    }
}
