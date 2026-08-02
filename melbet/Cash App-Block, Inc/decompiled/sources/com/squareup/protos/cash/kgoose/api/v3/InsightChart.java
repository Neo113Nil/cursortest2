package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\f\u000b\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Builder;", "", "default_chart", "Ljava/lang/Integer;", "version", "", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart;", "charts", "Ljava/util/List;", "Companion", "Builder", "Chart", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InsightChart extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InsightChart> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.InsightChart$Chart#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<Chart> charts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
    public final Integer default_chart;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 2, tag = 3)
    public final Integer version;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\fJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart;", "<init>", "()V", "charts", "", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart;", "default_chart", "", "Ljava/lang/Integer;", "version", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<Chart> charts = EmptyList.INSTANCE;
        public Integer default_chart;
        public Integer version;

        @Override // com.squareup.wire.Message.Builder
        public InsightChart build() {
            return new InsightChart(this.charts, this.default_chart, this.version, buildUnknownFields());
        }

        public final Builder charts(List<Chart> charts) {
            charts.getClass();
            TransactorKt.checkElementsNotNull(charts);
            this.charts = charts;
            return this;
        }

        public final Builder default_chart(Integer default_chart) {
            this.default_chart = default_chart;
            return this;
        }

        public final Builder version(Integer version) {
            this.version = version;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0014\u0015\u0013\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$Builder;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "name", "Lcom/squareup/protos/cash/localization/LocalizedString;", "name_accessibility_text", "title", "headline", "description", "Lcom/squareup/protos/cash/ui/Icon;", "description_icon", "Lcom/squareup/protos/cash/ui/Icon;", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$ChartType;", "chart_type", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$ChartType;", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$Chart;", "chart", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$Chart;", "Companion", "Builder", "Chart", "ChartType", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Chart extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Chart> CREATOR;
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 7)
        public final AbstractC0070Chart chart;

        @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.InsightChart$Chart$ChartType#ADAPTER", schemaIndex = 6, tag = 6)
        public final ChartType chart_type;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 4, tag = 4)
        public final LocalizedString description;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 5, tag = 5)
        public final Icon description_icon;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 3)
        public final LocalizedString headline;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
        public final LocalizedString name;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 9)
        public final LocalizedString name_accessibility_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 2)
        public final LocalizedString title;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart;", "<init>", "()V", "name", "Lcom/squareup/protos/cash/localization/LocalizedString;", "name_accessibility_text", "title", "headline", "description", "description_icon", "Lcom/squareup/protos/cash/ui/Icon;", "chart_type", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$ChartType;", "chart", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$Chart;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public AbstractC0070Chart chart;
            public ChartType chart_type;
            public LocalizedString description;
            public Icon description_icon;
            public LocalizedString headline;
            public LocalizedString name;
            public LocalizedString name_accessibility_text;
            public LocalizedString title;

            @Override // com.squareup.wire.Message.Builder
            public Chart build() {
                return new Chart(this.name, this.name_accessibility_text, this.title, this.headline, this.description, this.description_icon, this.chart_type, this.chart, buildUnknownFields());
            }

            public final Builder chart(AbstractC0070Chart chart) {
                this.chart = chart;
                return this;
            }

            public final Builder chart_type(ChartType chart_type) {
                this.chart_type = chart_type;
                return this;
            }

            public final Builder description(LocalizedString description) {
                this.description = description;
                return this;
            }

            public final Builder description_icon(Icon description_icon) {
                this.description_icon = description_icon;
                return this;
            }

            public final Builder headline(LocalizedString headline) {
                this.headline = headline;
                return this;
            }

            public final Builder name(LocalizedString name) {
                this.name = name;
                return this;
            }

            public final Builder name_accessibility_text(LocalizedString name_accessibility_text) {
                this.name_accessibility_text = name_accessibility_text;
                return this;
            }

            public final Builder title(LocalizedString title) {
                this.title = title;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$Chart;", "", "BarChart", "LineChart", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$Chart$BarChart;", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$Chart$LineChart;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.squareup.protos.cash.kgoose.api.v3.InsightChart$Chart$Chart, reason: collision with other inner class name */
        public static abstract class AbstractC0070Chart {

            @WireOneofField(adapter = "com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph#ADAPTER", declaredName = "bar_chart", tag = 7)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$Chart$BarChart;", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$Chart;", "Lcom/squareup/protos/cash/ui/graphs/VerticalStackedBarGraph;", "value", "Lcom/squareup/protos/cash/ui/graphs/VerticalStackedBarGraph;", "getValue", "()Lcom/squareup/protos/cash/ui/graphs/VerticalStackedBarGraph;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.squareup.protos.cash.kgoose.api.v3.InsightChart$Chart$Chart$BarChart */
            public static final /* data */ class BarChart extends AbstractC0070Chart {
                private final VerticalStackedBarGraph value;

                public BarChart(VerticalStackedBarGraph verticalStackedBarGraph) {
                    verticalStackedBarGraph.getClass();
                    this.value = verticalStackedBarGraph;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof BarChart) && Intrinsics.areEqual(this.value, ((BarChart) obj).value);
                }

                public final VerticalStackedBarGraph getValue() {
                    return this.value;
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }

                public final String toString() {
                    return "BarChart(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.cash.ui.graphs.LineGraph#ADAPTER", declaredName = "line_chart", tag = 8)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$Chart$LineChart;", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$Chart;", "Lcom/squareup/protos/cash/ui/graphs/LineGraph;", "value", "Lcom/squareup/protos/cash/ui/graphs/LineGraph;", "getValue", "()Lcom/squareup/protos/cash/ui/graphs/LineGraph;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.squareup.protos.cash.kgoose.api.v3.InsightChart$Chart$Chart$LineChart */
            public static final /* data */ class LineChart extends AbstractC0070Chart {
                private final com.squareup.protos.cash.ui.graphs.LineGraph value;

                public LineChart(com.squareup.protos.cash.ui.graphs.LineGraph lineGraph) {
                    lineGraph.getClass();
                    this.value = lineGraph;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof LineChart) && Intrinsics.areEqual(this.value, ((LineChart) obj).value);
                }

                public final com.squareup.protos.cash.ui.graphs.LineGraph getValue() {
                    return this.value;
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }

                public final String toString() {
                    return "LineChart(value=" + this.value + ")";
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$ChartType;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "CHART_TYPE_UNSPECIFIED", "CHART_TYPE_BAR", "CHART_TYPE_LINE", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ChartType implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ChartType[] $VALUES;
            public static final ProtoAdapter ADAPTER;
            public static final ChartType CHART_TYPE_BAR;
            public static final ChartType CHART_TYPE_LINE;
            public static final ChartType CHART_TYPE_UNSPECIFIED;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int value;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$ChartType$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$ChartType;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
            }

            static {
                ChartType chartType = new ChartType("CHART_TYPE_UNSPECIFIED", 0, 0);
                CHART_TYPE_UNSPECIFIED = chartType;
                ChartType chartType2 = new ChartType("CHART_TYPE_BAR", 1, 1);
                CHART_TYPE_BAR = chartType2;
                ChartType chartType3 = new ChartType("CHART_TYPE_LINE", 2, 2);
                CHART_TYPE_LINE = chartType3;
                ChartType[] chartTypeArr = {chartType, chartType2, chartType3};
                $VALUES = chartTypeArr;
                $ENTRIES = new EnumEntriesList(chartTypeArr);
                INSTANCE = new Companion();
                ADAPTER = new InsightChart$Chart$ChartType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ChartType.class), Syntax.PROTO_2, chartType);
            }

            public ChartType(String str, int i, int i2) {
                this.value = i2;
            }

            public static final ChartType fromValue(int i) {
                INSTANCE.getClass();
                if (i == 0) {
                    return CHART_TYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return CHART_TYPE_BAR;
                }
                if (i != 2) {
                    return null;
                }
                return CHART_TYPE_LINE;
            }

            public static ChartType valueOf(String str) {
                return (ChartType) Enum.valueOf(ChartType.class, str);
            }

            public static ChartType[] values() {
                return (ChartType[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            InsightChart$Chart$Companion$ADAPTER$1 insightChart$Chart$Companion$ADAPTER$1 = new InsightChart$Chart$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Chart.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.InsightChart.Chart", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
            ADAPTER = insightChart$Chart$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(insightChart$Chart$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Chart(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, LocalizedString localizedString5, Icon icon, ChartType chartType, AbstractC0070Chart abstractC0070Chart, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.name = localizedString;
            this.name_accessibility_text = localizedString2;
            this.title = localizedString3;
            this.headline = localizedString4;
            this.description = localizedString5;
            this.description_icon = icon;
            this.chart_type = chartType;
            this.chart = abstractC0070Chart;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Chart)) {
                return false;
            }
            Chart chart = (Chart) obj;
            return Intrinsics.areEqual(unknownFields(), chart.unknownFields()) && Intrinsics.areEqual(this.name, chart.name) && Intrinsics.areEqual(this.name_accessibility_text, chart.name_accessibility_text) && Intrinsics.areEqual(this.title, chart.title) && Intrinsics.areEqual(this.headline, chart.headline) && Intrinsics.areEqual(this.description, chart.description) && Intrinsics.areEqual(this.description_icon, chart.description_icon) && this.chart_type == chart.chart_type && Intrinsics.areEqual(this.chart, chart.chart);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.name;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.name_accessibility_text;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.title;
            int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            LocalizedString localizedString4 = this.headline;
            int hashCode5 = (hashCode4 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
            LocalizedString localizedString5 = this.description;
            int hashCode6 = (hashCode5 + (localizedString5 != null ? localizedString5.hashCode() : 0)) * 37;
            Icon icon = this.description_icon;
            int hashCode7 = (hashCode6 + (icon != null ? icon.hashCode() : 0)) * 37;
            ChartType chartType = this.chart_type;
            int hashCode8 = (hashCode7 + (chartType != null ? chartType.hashCode() : 0)) * 37;
            AbstractC0070Chart abstractC0070Chart = this.chart;
            int hashCode9 = hashCode8 + (abstractC0070Chart != null ? abstractC0070Chart.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.name = this.name;
            builder.name_accessibility_text = this.name_accessibility_text;
            builder.title = this.title;
            builder.headline = this.headline;
            builder.description = this.description;
            builder.description_icon = this.description_icon;
            builder.chart_type = this.chart_type;
            builder.chart = this.chart;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.name;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("name=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.name_accessibility_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("name_accessibility_text=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.title;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString3, arrayList);
            }
            LocalizedString localizedString4 = this.headline;
            if (localizedString4 != null) {
                Matcher$$ExternalSyntheticOutline0.m("headline=", localizedString4, arrayList);
            }
            LocalizedString localizedString5 = this.description;
            if (localizedString5 != null) {
                Matcher$$ExternalSyntheticOutline0.m("description=", localizedString5, arrayList);
            }
            Icon icon = this.description_icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("description_icon=", icon, arrayList);
            }
            ChartType chartType = this.chart_type;
            if (chartType != null) {
                arrayList.add("chart_type=" + chartType);
            }
            AbstractC0070Chart abstractC0070Chart = this.chart;
            if (abstractC0070Chart != null) {
                arrayList.add("chart=" + abstractC0070Chart);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Chart{", "}", 0, null, null, 56);
        }
    }

    static {
        InsightChart$Companion$ADAPTER$1 insightChart$Companion$ADAPTER$1 = new InsightChart$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InsightChart.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.InsightChart", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
        ADAPTER = insightChart$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(insightChart$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightChart(List list, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.default_chart = num;
        this.version = num2;
        this.charts = TransactorKt.immutableCopyOf("charts", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InsightChart)) {
            return false;
        }
        InsightChart insightChart = (InsightChart) obj;
        return Intrinsics.areEqual(unknownFields(), insightChart.unknownFields()) && Intrinsics.areEqual(this.charts, insightChart.charts) && Intrinsics.areEqual(this.default_chart, insightChart.default_chart) && Intrinsics.areEqual(this.version, insightChart.version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.charts);
        Integer num = this.default_chart;
        int hashCode = (m + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.version;
        int hashCode2 = hashCode + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.charts = this.charts;
        builder.default_chart = this.default_chart;
        builder.version = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.charts.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("charts=", arrayList, this.charts);
        }
        Integer num = this.default_chart;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("default_chart=", num, arrayList);
        }
        Integer num2 = this.version;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("version=", num2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InsightChart{", "}", 0, null, null, 56);
    }
}
