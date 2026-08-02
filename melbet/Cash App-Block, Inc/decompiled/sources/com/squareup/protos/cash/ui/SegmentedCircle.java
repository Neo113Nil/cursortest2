package com.squareup.protos.cash.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
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
import squareup.cash.bills.BillsApplet;

/* loaded from: classes8.dex */
public final class SegmentedCircle extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SegmentedCircle> CREATOR;
    public final LocalizedString accessibility_description;
    public final List segments;

    static {
        SegmentedCircle$Companion$ADAPTER$1 segmentedCircle$Companion$ADAPTER$1 = new SegmentedCircle$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SegmentedCircle.class), "type.googleapis.com/squareup.cash.ui.SegmentedCircle", Syntax.PROTO_2, null, "squareup/cash/ui/SegmentedCircle.proto");
        ADAPTER = segmentedCircle$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(segmentedCircle$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedCircle(LocalizedString localizedString, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.accessibility_description = localizedString;
        this.segments = TransactorKt.immutableCopyOf("segments", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SegmentedCircle)) {
            return false;
        }
        SegmentedCircle segmentedCircle = (SegmentedCircle) obj;
        return Intrinsics.areEqual(unknownFields(), segmentedCircle.unknownFields()) && Intrinsics.areEqual(this.segments, segmentedCircle.segments) && Intrinsics.areEqual(this.accessibility_description, segmentedCircle.accessibility_description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.segments);
        LocalizedString localizedString = this.accessibility_description;
        int hashCode = m + (localizedString != null ? localizedString.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.FullApplet.Builder builder = new BillsApplet.FullApplet.Builder(7);
        builder.lines = this.segments;
        builder.title = this.accessibility_description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.segments;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("segments=", arrayList, list);
        }
        LocalizedString localizedString = this.accessibility_description;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("accessibility_description=", localizedString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SegmentedCircle{", "}", 0, null, null, 56);
    }

    public final class Segment extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Segment> CREATOR;
        public final Color color;
        public final Float percent;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public Color color;
            public Float percent;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Segment(this.color, this.percent, buildUnknownFields());
                    case 1:
                        return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation(this.color, this.percent, buildUnknownFields());
                    default:
                        return new BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar.Segment(this.color, this.percent, buildUnknownFields());
                }
            }
        }

        static {
            SegmentedCircle$Segment$Companion$ADAPTER$1 segmentedCircle$Segment$Companion$ADAPTER$1 = new SegmentedCircle$Segment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Segment.class), "type.googleapis.com/squareup.cash.ui.SegmentedCircle.Segment", Syntax.PROTO_2, null, "squareup/cash/ui/SegmentedCircle.proto");
            ADAPTER = segmentedCircle$Segment$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(segmentedCircle$Segment$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Segment(Color color, Float f, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.color = color;
            this.percent = f;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Segment)) {
                return false;
            }
            Segment segment = (Segment) obj;
            return Intrinsics.areEqual(unknownFields(), segment.unknownFields()) && Intrinsics.areEqual(this.color, segment.color) && Intrinsics.areEqual(this.percent, segment.percent);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Color color = this.color;
            int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
            Float f = this.percent;
            int hashCode3 = hashCode2 + (f != null ? Float.hashCode(f.floatValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.color = this.color;
            builder.percent = this.percent;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Color color = this.color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
            }
            Float f = this.percent;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("percent=", f, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Segment{", "}", 0, null, null, 56);
        }

        public /* synthetic */ Segment(Color color) {
            this(color, Float.valueOf(0.5f), ByteString.EMPTY);
        }
    }
}
