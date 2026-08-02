package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContentType;", "type", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContentType;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "accessibility_label", "Lcom/squareup/protos/cash/localization/LocalizedString;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component;", "component", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component;", "Companion", "Builder", "Component", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SlotContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SlotContent> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 3)
    public final LocalizedString accessibility_label;

    @WireSealedOneof(schemaIndex = 2)
    public final Component component;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.SlotContentType#ADAPTER", schemaIndex = 0, tag = 1)
    public final SlotContentType type;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent;", "<init>", "()V", "type", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContentType;", "accessibility_label", "Lcom/squareup/protos/cash/localization/LocalizedString;", "component", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public LocalizedString accessibility_label;
        public Component component;
        public SlotContentType type;

        public final Builder accessibility_label(LocalizedString accessibility_label) {
            this.accessibility_label = accessibility_label;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SlotContent build() {
            return new SlotContent(this.type, this.accessibility_label, this.component, buildUnknownFields());
        }

        public final Builder component(Component component) {
            this.component = component;
            return this;
        }

        public final Builder type(SlotContentType type2) {
            this.type = type2;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component;", "", "Metric", "LineGraph", "ItemizedTable", "CompositionChart", "StackedImage", "ProgressRing", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component$CompositionChart;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component$ItemizedTable;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component$LineGraph;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component$Metric;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component$ProgressRing;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component$StackedImage;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Component {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.CompositionChart#ADAPTER", declaredName = "composition_chart", tag = 6)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component$CompositionChart;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/CompositionChart;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/CompositionChart;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/CompositionChart;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CompositionChart extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.CompositionChart value;

            public CompositionChart(com.squareup.protos.cash.kgoose.api.v3.CompositionChart compositionChart) {
                compositionChart.getClass();
                this.value = compositionChart;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CompositionChart) && Intrinsics.areEqual(this.value, ((CompositionChart) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.CompositionChart getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CompositionChart(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ItemizedTable#ADAPTER", declaredName = "itemized_table", tag = 5)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component$ItemizedTable;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/ItemizedTable;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ItemizedTable;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ItemizedTable;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ItemizedTable extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.ItemizedTable value;

            public ItemizedTable(com.squareup.protos.cash.kgoose.api.v3.ItemizedTable itemizedTable) {
                itemizedTable.getClass();
                this.value = itemizedTable;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ItemizedTable) && Intrinsics.areEqual(this.value, ((ItemizedTable) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.ItemizedTable getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ItemizedTable(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.LineGraph#ADAPTER", declaredName = "line_graph", tag = 4)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component$LineGraph;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/LineGraph;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/LineGraph;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/LineGraph;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LineGraph extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.LineGraph value;

            public LineGraph(com.squareup.protos.cash.kgoose.api.v3.LineGraph lineGraph) {
                lineGraph.getClass();
                this.value = lineGraph;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LineGraph) && Intrinsics.areEqual(this.value, ((LineGraph) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.LineGraph getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "LineGraph(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Metric#ADAPTER", declaredName = "metric", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component$Metric;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/Metric;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/Metric;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Metric extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.Metric value;

            public Metric(com.squareup.protos.cash.kgoose.api.v3.Metric metric) {
                metric.getClass();
                this.value = metric;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Metric) && Intrinsics.areEqual(this.value, ((Metric) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.Metric getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Metric(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ProgressRing#ADAPTER", declaredName = "progress_ring", tag = 8)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component$ProgressRing;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ProgressRing extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.ProgressRing value;

            public ProgressRing(com.squareup.protos.cash.kgoose.api.v3.ProgressRing progressRing) {
                progressRing.getClass();
                this.value = progressRing;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProgressRing) && Intrinsics.areEqual(this.value, ((ProgressRing) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.ProgressRing getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ProgressRing(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.StackedImage#ADAPTER", declaredName = "stacked_image", tag = 7)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component$StackedImage;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/StackedImage;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/StackedImage;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/StackedImage;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class StackedImage extends Component {
            private final com.squareup.protos.cash.kgoose.api.v3.StackedImage value;

            public StackedImage(com.squareup.protos.cash.kgoose.api.v3.StackedImage stackedImage) {
                stackedImage.getClass();
                this.value = stackedImage;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StackedImage) && Intrinsics.areEqual(this.value, ((StackedImage) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.StackedImage getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "StackedImage(value=" + this.value + ")";
            }
        }
    }

    static {
        SlotContent$Companion$ADAPTER$1 slotContent$Companion$ADAPTER$1 = new SlotContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SlotContent.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.SlotContent", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/slot_content.proto");
        ADAPTER = slotContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(slotContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotContent(SlotContentType slotContentType, LocalizedString localizedString, Component component, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.type = slotContentType;
        this.accessibility_label = localizedString;
        this.component = component;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SlotContent)) {
            return false;
        }
        SlotContent slotContent = (SlotContent) obj;
        return Intrinsics.areEqual(unknownFields(), slotContent.unknownFields()) && this.type == slotContent.type && Intrinsics.areEqual(this.accessibility_label, slotContent.accessibility_label) && Intrinsics.areEqual(this.component, slotContent.component);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SlotContentType slotContentType = this.type;
        int hashCode2 = (hashCode + (slotContentType != null ? slotContentType.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.accessibility_label;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Component component = this.component;
        int hashCode4 = hashCode3 + (component != null ? component.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.accessibility_label = this.accessibility_label;
        builder.component = this.component;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SlotContentType slotContentType = this.type;
        if (slotContentType != null) {
            arrayList.add("type=" + slotContentType);
        }
        LocalizedString localizedString = this.accessibility_label;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("accessibility_label=", localizedString, arrayList);
        }
        Component component = this.component;
        if (component != null) {
            arrayList.add("component=" + component);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SlotContent{", "}", 0, null, null, 56);
    }
}
