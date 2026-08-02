package com.squareup.protos.cash.ui.graphs;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.protos.common.Headers;
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

/* loaded from: classes8.dex */
public final class LineGraph extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LineGraph> CREATOR;
    public final GraphLegend legend;
    public final List lines;
    public final List x_axis_labels;
    public final List y_axis_labels;

    public final class GraphLegend extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GraphLegend> CREATOR;
        public final List items;

        public final class LegendItem extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<LegendItem> CREATOR;
            public final Color color;
            public final LocalizedString label;
            public final Integer line_index;
            public final LocalizedString summary;

            static {
                LineGraph$GraphLegend$LegendItem$Companion$ADAPTER$1 lineGraph$GraphLegend$LegendItem$Companion$ADAPTER$1 = new LineGraph$GraphLegend$LegendItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LegendItem.class), "type.googleapis.com/squareup.cash.ui.graphs.LineGraph.GraphLegend.LegendItem", Syntax.PROTO_2, null, "squareup/cash/ui/graphs/graph.proto");
                ADAPTER = lineGraph$GraphLegend$LegendItem$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(lineGraph$GraphLegend$LegendItem$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LegendItem(LocalizedString localizedString, Color color, LocalizedString localizedString2, Integer num, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.label = localizedString;
                this.color = color;
                this.summary = localizedString2;
                this.line_index = num;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LegendItem)) {
                    return false;
                }
                LegendItem legendItem = (LegendItem) obj;
                return Intrinsics.areEqual(unknownFields(), legendItem.unknownFields()) && Intrinsics.areEqual(this.label, legendItem.label) && Intrinsics.areEqual(this.color, legendItem.color) && Intrinsics.areEqual(this.summary, legendItem.summary) && Intrinsics.areEqual(this.line_index, legendItem.line_index);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.label;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                Color color = this.color;
                int hashCode3 = (hashCode2 + (color != null ? color.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.summary;
                int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                Integer num = this.line_index;
                int hashCode5 = hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ColoredButton.Builder builder = new ColoredButton.Builder(4);
                builder.text = this.label;
                builder.button_color = this.color;
                builder.text_color = this.summary;
                builder.action = this.line_index;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.label;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("label=", localizedString, arrayList);
                }
                Color color = this.color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
                }
                LocalizedString localizedString2 = this.summary;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("summary=", localizedString2, arrayList);
                }
                Integer num = this.line_index;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("line_index=", num, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "LegendItem{", "}", 0, null, null, 56);
            }
        }

        static {
            LineGraph$GraphLegend$Companion$ADAPTER$1 lineGraph$GraphLegend$Companion$ADAPTER$1 = new LineGraph$GraphLegend$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GraphLegend.class), "type.googleapis.com/squareup.cash.ui.graphs.LineGraph.GraphLegend", Syntax.PROTO_2, null, "squareup/cash/ui/graphs/graph.proto");
            ADAPTER = lineGraph$GraphLegend$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(lineGraph$GraphLegend$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GraphLegend(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.items = TransactorKt.immutableCopyOf("items", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GraphLegend)) {
                return false;
            }
            GraphLegend graphLegend = (GraphLegend) obj;
            return Intrinsics.areEqual(unknownFields(), graphLegend.unknownFields()) && Intrinsics.areEqual(this.items, graphLegend.items);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.items.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Headers.Builder builder = new Headers.Builder(6, false);
            builder.header = this.items;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.items;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GraphLegend{", "}", 0, null, null, 56);
        }
    }

    public final class Line extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Line> CREATOR;
        public final Color color;
        public final List data_points;

        public final class DataPoint extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DataPoint> CREATOR;
            public final LocalizedString description;
            public final LocalizedString headline;
            public final Icon icon;
            public final Color icon_tint_color;
            public final LocalizedString label;
            public final Long x_value;
            public final Long y_value;

            static {
                LineGraph$Line$DataPoint$Companion$ADAPTER$1 lineGraph$Line$DataPoint$Companion$ADAPTER$1 = new LineGraph$Line$DataPoint$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DataPoint.class), "type.googleapis.com/squareup.cash.ui.graphs.LineGraph.Line.DataPoint", Syntax.PROTO_2, null, "squareup/cash/ui/graphs/graph.proto");
                ADAPTER = lineGraph$Line$DataPoint$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(lineGraph$Line$DataPoint$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DataPoint(Long l, Long l2, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, Icon icon, Color color, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.x_value = l;
                this.y_value = l2;
                this.label = localizedString;
                this.headline = localizedString2;
                this.description = localizedString3;
                this.icon = icon;
                this.icon_tint_color = color;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DataPoint)) {
                    return false;
                }
                DataPoint dataPoint = (DataPoint) obj;
                return Intrinsics.areEqual(unknownFields(), dataPoint.unknownFields()) && Intrinsics.areEqual(this.x_value, dataPoint.x_value) && Intrinsics.areEqual(this.y_value, dataPoint.y_value) && Intrinsics.areEqual(this.label, dataPoint.label) && Intrinsics.areEqual(this.headline, dataPoint.headline) && Intrinsics.areEqual(this.description, dataPoint.description) && Intrinsics.areEqual(this.icon, dataPoint.icon) && Intrinsics.areEqual(this.icon_tint_color, dataPoint.icon_tint_color);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Long l = this.x_value;
                int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
                Long l2 = this.y_value;
                int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
                LocalizedString localizedString = this.label;
                int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.headline;
                int hashCode5 = (hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                LocalizedString localizedString3 = this.description;
                int hashCode6 = (hashCode5 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                Icon icon = this.icon;
                int hashCode7 = (hashCode6 + (icon != null ? icon.hashCode() : 0)) * 37;
                Color color = this.icon_tint_color;
                int hashCode8 = hashCode7 + (color != null ? color.hashCode() : 0);
                this.hashCode = hashCode8;
                return hashCode8;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                PoolParticipant.Builder builder = new PoolParticipant.Builder(28);
                builder.added_at = this.x_value;
                builder.customer_identifier = this.y_value;
                builder.full_name = this.label;
                builder.profile_photo_url = this.headline;
                builder.cashtag = this.description;
                builder.participant_type = this.icon;
                builder.aggregated_contribution_amount = this.icon_tint_color;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Long l = this.x_value;
                if (l != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("x_value=", l, arrayList);
                }
                Long l2 = this.y_value;
                if (l2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("y_value=", l2, arrayList);
                }
                LocalizedString localizedString = this.label;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("label=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.headline;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("headline=", localizedString2, arrayList);
                }
                LocalizedString localizedString3 = this.description;
                if (localizedString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("description=", localizedString3, arrayList);
                }
                Icon icon = this.icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
                }
                Color color = this.icon_tint_color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("icon_tint_color=", color, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DataPoint{", "}", 0, null, null, 56);
            }
        }

        static {
            LineGraph$Line$Companion$ADAPTER$1 lineGraph$Line$Companion$ADAPTER$1 = new LineGraph$Line$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Line.class), "type.googleapis.com/squareup.cash.ui.graphs.LineGraph.Line", Syntax.PROTO_2, null, "squareup/cash/ui/graphs/graph.proto");
            ADAPTER = lineGraph$Line$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(lineGraph$Line$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Line(List list, Color color, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.color = color;
            this.data_points = TransactorKt.immutableCopyOf("data_points", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Line)) {
                return false;
            }
            Line line = (Line) obj;
            return Intrinsics.areEqual(unknownFields(), line.unknownFields()) && Intrinsics.areEqual(this.data_points, line.data_points) && Intrinsics.areEqual(this.color, line.color);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.data_points);
            Color color = this.color;
            int hashCode = m + (color != null ? color.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SplitButtons.Builder builder = new SplitButtons.Builder(19);
            builder.primary_button = this.data_points;
            builder.secondary_button = this.color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.data_points;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("data_points=", arrayList, list);
            }
            Color color = this.color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Line{", "}", 0, null, null, 56);
        }
    }

    static {
        LineGraph$Companion$ADAPTER$1 lineGraph$Companion$ADAPTER$1 = new LineGraph$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LineGraph.class), "type.googleapis.com/squareup.cash.ui.graphs.LineGraph", Syntax.PROTO_2, null, "squareup/cash/ui/graphs/graph.proto");
        ADAPTER = lineGraph$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(lineGraph$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineGraph(List list, List list2, List list3, GraphLegend graphLegend, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.legend = graphLegend;
        this.lines = TransactorKt.immutableCopyOf("lines", list);
        this.y_axis_labels = TransactorKt.immutableCopyOf("y_axis_labels", list2);
        this.x_axis_labels = TransactorKt.immutableCopyOf("x_axis_labels", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LineGraph)) {
            return false;
        }
        LineGraph lineGraph = (LineGraph) obj;
        return Intrinsics.areEqual(unknownFields(), lineGraph.unknownFields()) && Intrinsics.areEqual(this.lines, lineGraph.lines) && Intrinsics.areEqual(this.y_axis_labels, lineGraph.y_axis_labels) && Intrinsics.areEqual(this.x_axis_labels, lineGraph.x_axis_labels) && Intrinsics.areEqual(this.legend, lineGraph.legend);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.lines), 37, this.y_axis_labels), 37, this.x_axis_labels);
        GraphLegend graphLegend = this.legend;
        int hashCode = m + (graphLegend != null ? graphLegend.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(3);
        builder.button_color = this.lines;
        builder.text_color = this.y_axis_labels;
        builder.text = this.x_axis_labels;
        builder.action = this.legend;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.lines;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("lines=", arrayList, list);
        }
        List list2 = this.y_axis_labels;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("y_axis_labels=", arrayList, list2);
        }
        List list3 = this.x_axis_labels;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("x_axis_labels=", arrayList, list3);
        }
        GraphLegend graphLegend = this.legend;
        if (graphLegend != null) {
            arrayList.add("legend=" + graphLegend);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LineGraph{", "}", 0, null, null, 56);
    }
}
