package com.squareup.protos.cash.ui.graphs;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.protos.common.Headers;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.api.UiAlias;
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
public final class VerticalStackedBarGraph extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerticalStackedBarGraph> CREATOR;
    public final List bars;
    public final GraphLegend legend;
    public final List y_axis_labels;

    public final class Bar extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Bar> CREATOR;
        public final LocalizedString accessibility_text;
        public final List bar_items;
        public final LocalizedString category_focus_label;
        public final LocalizedString category_text;
        public final CategoryTextValue category_text_and_value;
        public final LocalizedString category_value;
        public final LocalizedString header_text;
        public final LocalizedString subtitle_text;

        public final class BarItem extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<BarItem> CREATOR;
            public final Color color;
            public final Long value;

            static {
                VerticalStackedBarGraph$Bar$BarItem$Companion$ADAPTER$1 verticalStackedBarGraph$Bar$BarItem$Companion$ADAPTER$1 = new VerticalStackedBarGraph$Bar$BarItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BarItem.class), "type.googleapis.com/squareup.cash.ui.graphs.VerticalStackedBarGraph.Bar.BarItem", Syntax.PROTO_2, null, "squareup/cash/ui/graphs/graph.proto");
                ADAPTER = verticalStackedBarGraph$Bar$BarItem$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(verticalStackedBarGraph$Bar$BarItem$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BarItem(Color color, Long l, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.color = color;
                this.value = l;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof BarItem)) {
                    return false;
                }
                BarItem barItem = (BarItem) obj;
                return Intrinsics.areEqual(unknownFields(), barItem.unknownFields()) && Intrinsics.areEqual(this.color, barItem.color) && Intrinsics.areEqual(this.value, barItem.value);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Color color = this.color;
                int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
                Long l = this.value;
                int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                SplitButtons.Builder builder = new SplitButtons.Builder(20);
                builder.primary_button = this.color;
                builder.secondary_button = this.value;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Color color = this.color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
                }
                Long l = this.value;
                if (l != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("value=", l, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "BarItem{", "}", 0, null, null, 56);
            }
        }

        public final class CategoryTextValue extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CategoryTextValue> CREATOR;
            public final Color color;
            public final LocalizedString text;
            public final LocalizedString value;

            static {
                VerticalStackedBarGraph$Bar$CategoryTextValue$Companion$ADAPTER$1 verticalStackedBarGraph$Bar$CategoryTextValue$Companion$ADAPTER$1 = new VerticalStackedBarGraph$Bar$CategoryTextValue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CategoryTextValue.class), "type.googleapis.com/squareup.cash.ui.graphs.VerticalStackedBarGraph.Bar.CategoryTextValue", Syntax.PROTO_2, null, "squareup/cash/ui/graphs/graph.proto");
                ADAPTER = verticalStackedBarGraph$Bar$CategoryTextValue$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(verticalStackedBarGraph$Bar$CategoryTextValue$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CategoryTextValue(Color color, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.color = color;
                this.text = localizedString;
                this.value = localizedString2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CategoryTextValue)) {
                    return false;
                }
                CategoryTextValue categoryTextValue = (CategoryTextValue) obj;
                return Intrinsics.areEqual(unknownFields(), categoryTextValue.unknownFields()) && Intrinsics.areEqual(this.color, categoryTextValue.color) && Intrinsics.areEqual(this.text, categoryTextValue.text) && Intrinsics.areEqual(this.value, categoryTextValue.value);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Color color = this.color;
                int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
                LocalizedString localizedString = this.text;
                int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.value;
                int hashCode4 = hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                UiAlias.Builder builder = new UiAlias.Builder(1);
                builder.f1364type = this.color;
                builder.canonical_text = this.text;
                builder.formatted = this.value;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Color color = this.color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
                }
                LocalizedString localizedString = this.text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.value;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("value=", localizedString2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CategoryTextValue{", "}", 0, null, null, 56);
            }
        }

        static {
            VerticalStackedBarGraph$Bar$Companion$ADAPTER$1 verticalStackedBarGraph$Bar$Companion$ADAPTER$1 = new VerticalStackedBarGraph$Bar$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Bar.class), "type.googleapis.com/squareup.cash.ui.graphs.VerticalStackedBarGraph.Bar", Syntax.PROTO_2, null, "squareup/cash/ui/graphs/graph.proto");
            ADAPTER = verticalStackedBarGraph$Bar$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(verticalStackedBarGraph$Bar$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bar(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, List list, CategoryTextValue categoryTextValue, LocalizedString localizedString4, LocalizedString localizedString5, LocalizedString localizedString6, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.header_text = localizedString;
            this.subtitle_text = localizedString2;
            this.accessibility_text = localizedString3;
            this.category_text_and_value = categoryTextValue;
            this.category_text = localizedString4;
            this.category_value = localizedString5;
            this.category_focus_label = localizedString6;
            this.bar_items = TransactorKt.immutableCopyOf("bar_items", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Bar)) {
                return false;
            }
            Bar bar = (Bar) obj;
            return Intrinsics.areEqual(unknownFields(), bar.unknownFields()) && Intrinsics.areEqual(this.header_text, bar.header_text) && Intrinsics.areEqual(this.subtitle_text, bar.subtitle_text) && Intrinsics.areEqual(this.accessibility_text, bar.accessibility_text) && Intrinsics.areEqual(this.bar_items, bar.bar_items) && Intrinsics.areEqual(this.category_text_and_value, bar.category_text_and_value) && Intrinsics.areEqual(this.category_text, bar.category_text) && Intrinsics.areEqual(this.category_value, bar.category_value) && Intrinsics.areEqual(this.category_focus_label, bar.category_focus_label);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.header_text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle_text;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.accessibility_text;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37, 37, this.bar_items);
            CategoryTextValue categoryTextValue = this.category_text_and_value;
            int hashCode4 = (m + (categoryTextValue != null ? categoryTextValue.hashCode() : 0)) * 37;
            LocalizedString localizedString4 = this.category_text;
            int hashCode5 = (hashCode4 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
            LocalizedString localizedString5 = this.category_value;
            int hashCode6 = (hashCode5 + (localizedString5 != null ? localizedString5.hashCode() : 0)) * 37;
            LocalizedString localizedString6 = this.category_focus_label;
            int hashCode7 = hashCode6 + (localizedString6 != null ? localizedString6.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            DocumentEntity.Builder builder = new DocumentEntity.Builder(21, false);
            builder.category = this.header_text;
            builder.token = this.subtitle_text;
            builder.title = this.accessibility_text;
            builder.client_route = this.bar_items;
            builder.url = this.category_text_and_value;
            builder.owner_token = this.category_text;
            builder.version_data = this.category_value;
            builder.localizable_title = this.category_focus_label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.header_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("header_text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle_text=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.accessibility_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("accessibility_text=", localizedString3, arrayList);
            }
            List list = this.bar_items;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("bar_items=", arrayList, list);
            }
            CategoryTextValue categoryTextValue = this.category_text_and_value;
            if (categoryTextValue != null) {
                arrayList.add("category_text_and_value=" + categoryTextValue);
            }
            LocalizedString localizedString4 = this.category_text;
            if (localizedString4 != null) {
                Matcher$$ExternalSyntheticOutline0.m("category_text=", localizedString4, arrayList);
            }
            LocalizedString localizedString5 = this.category_value;
            if (localizedString5 != null) {
                Matcher$$ExternalSyntheticOutline0.m("category_value=", localizedString5, arrayList);
            }
            LocalizedString localizedString6 = this.category_focus_label;
            if (localizedString6 != null) {
                Matcher$$ExternalSyntheticOutline0.m("category_focus_label=", localizedString6, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Bar{", "}", 0, null, null, 56);
        }
    }

    public final class GraphLegend extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GraphLegend> CREATOR;
        public final List categories;

        static {
            VerticalStackedBarGraph$GraphLegend$Companion$ADAPTER$1 verticalStackedBarGraph$GraphLegend$Companion$ADAPTER$1 = new VerticalStackedBarGraph$GraphLegend$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GraphLegend.class), "type.googleapis.com/squareup.cash.ui.graphs.VerticalStackedBarGraph.GraphLegend", Syntax.PROTO_2, null, "squareup/cash/ui/graphs/graph.proto");
            ADAPTER = verticalStackedBarGraph$GraphLegend$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(verticalStackedBarGraph$GraphLegend$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GraphLegend(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.categories = TransactorKt.immutableCopyOf("categories", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GraphLegend)) {
                return false;
            }
            GraphLegend graphLegend = (GraphLegend) obj;
            return Intrinsics.areEqual(unknownFields(), graphLegend.unknownFields()) && Intrinsics.areEqual(this.categories, graphLegend.categories);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.categories.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Headers.Builder builder = new Headers.Builder(7, false);
            builder.header = this.categories;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.categories;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("categories=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GraphLegend{", "}", 0, null, null, 56);
        }
    }

    static {
        VerticalStackedBarGraph$Companion$ADAPTER$1 verticalStackedBarGraph$Companion$ADAPTER$1 = new VerticalStackedBarGraph$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VerticalStackedBarGraph.class), "type.googleapis.com/squareup.cash.ui.graphs.VerticalStackedBarGraph", Syntax.PROTO_2, null, "squareup/cash/ui/graphs/graph.proto");
        ADAPTER = verticalStackedBarGraph$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(verticalStackedBarGraph$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalStackedBarGraph(List list, GraphLegend graphLegend, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.legend = graphLegend;
        this.bars = TransactorKt.immutableCopyOf("bars", list);
        this.y_axis_labels = TransactorKt.immutableCopyOf("y_axis_labels", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerticalStackedBarGraph)) {
            return false;
        }
        VerticalStackedBarGraph verticalStackedBarGraph = (VerticalStackedBarGraph) obj;
        return Intrinsics.areEqual(unknownFields(), verticalStackedBarGraph.unknownFields()) && Intrinsics.areEqual(this.bars, verticalStackedBarGraph.bars) && Intrinsics.areEqual(this.legend, verticalStackedBarGraph.legend) && Intrinsics.areEqual(this.y_axis_labels, verticalStackedBarGraph.y_axis_labels);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.bars);
        GraphLegend graphLegend = this.legend;
        int hashCode = this.y_axis_labels.hashCode() + ((m + (graphLegend != null ? graphLegend.hashCode() : 0)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(2);
        builder.f1364type = this.bars;
        builder.canonical_text = this.legend;
        builder.formatted = this.y_axis_labels;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.bars;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("bars=", arrayList, list);
        }
        GraphLegend graphLegend = this.legend;
        if (graphLegend != null) {
            arrayList.add("legend=" + graphLegend);
        }
        List list2 = this.y_axis_labels;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("y_axis_labels=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerticalStackedBarGraph{", "}", 0, null, null, 56);
    }
}
