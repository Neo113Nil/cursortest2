package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.InsightChart;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/InsightChart$Chart;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InsightChart$Chart$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        InsightChart.Chart.AbstractC0070Chart barChart;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        InsightChart.Chart.AbstractC0070Chart abstractC0070Chart = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InsightChart.Chart((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (LocalizedString) obj5, (Icon) obj6, (InsightChart.Chart.ChartType) obj7, abstractC0070Chart, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    continue;
                case 2:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    continue;
                case 3:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    continue;
                case 4:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    continue;
                case 5:
                    obj6 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj6);
                    continue;
                case 6:
                    try {
                        obj7 = InsightChart.Chart.ChartType.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 7:
                    barChart = new InsightChart.Chart.AbstractC0070Chart.BarChart((VerticalStackedBarGraph) VerticalStackedBarGraph.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    barChart = new InsightChart.Chart.AbstractC0070Chart.LineChart((com.squareup.protos.cash.ui.graphs.LineGraph) com.squareup.protos.cash.ui.graphs.LineGraph.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            abstractC0070Chart = barChart;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InsightChart.Chart chart = (InsightChart.Chart) obj;
        reverseProtoWriter.getClass();
        chart.getClass();
        reverseProtoWriter.writeBytes(chart.unknownFields());
        InsightChart.Chart.AbstractC0070Chart abstractC0070Chart = chart.chart;
        if (abstractC0070Chart instanceof InsightChart.Chart.AbstractC0070Chart.BarChart) {
            VerticalStackedBarGraph.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((InsightChart.Chart.AbstractC0070Chart.BarChart) abstractC0070Chart).getValue());
        } else if (abstractC0070Chart instanceof InsightChart.Chart.AbstractC0070Chart.LineChart) {
            com.squareup.protos.cash.ui.graphs.LineGraph.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((InsightChart.Chart.AbstractC0070Chart.LineChart) abstractC0070Chart).getValue());
        } else if (abstractC0070Chart != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        InsightChart.Chart.ChartType.ADAPTER.encodeWithTag(reverseProtoWriter, 6, chart.chart_type);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 5, chart.description_icon);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, chart.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, chart.headline);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, chart.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, chart.name_accessibility_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, chart.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InsightChart.Chart chart = (InsightChart.Chart) obj;
        chart.getClass();
        int size$okio = chart.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = InsightChart.Chart.ChartType.ADAPTER.encodedSizeWithTag(6, chart.chart_type) + Icon.ADAPTER.encodedSizeWithTag(5, chart.description_icon) + protoAdapter.encodedSizeWithTag(4, chart.description) + protoAdapter.encodedSizeWithTag(3, chart.headline) + protoAdapter.encodedSizeWithTag(2, chart.title) + protoAdapter.encodedSizeWithTag(9, chart.name_accessibility_text) + protoAdapter.encodedSizeWithTag(1, chart.name) + size$okio;
        InsightChart.Chart.AbstractC0070Chart abstractC0070Chart = chart.chart;
        if (abstractC0070Chart instanceof InsightChart.Chart.AbstractC0070Chart.BarChart) {
            return VerticalStackedBarGraph.ADAPTER.encodedSizeWithTag(7, ((InsightChart.Chart.AbstractC0070Chart.BarChart) abstractC0070Chart).getValue()) + encodedSizeWithTag;
        }
        if (abstractC0070Chart instanceof InsightChart.Chart.AbstractC0070Chart.LineChart) {
            return com.squareup.protos.cash.ui.graphs.LineGraph.ADAPTER.encodedSizeWithTag(8, ((InsightChart.Chart.AbstractC0070Chart.LineChart) abstractC0070Chart).getValue()) + encodedSizeWithTag;
        }
        if (abstractC0070Chart == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InsightChart.Chart chart = (InsightChart.Chart) obj;
        chart.getClass();
        LocalizedString localizedString = chart.name;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = chart.name_accessibility_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = chart.title;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = chart.headline;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        LocalizedString localizedString9 = chart.description;
        LocalizedString localizedString10 = localizedString9 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString9) : null;
        Icon icon = chart.description_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        ByteString byteString = ByteString.EMPTY;
        InsightChart.Chart.ChartType chartType = chart.chart_type;
        InsightChart.Chart.AbstractC0070Chart abstractC0070Chart = chart.chart;
        byteString.getClass();
        return new InsightChart.Chart(localizedString2, localizedString4, localizedString6, localizedString8, localizedString10, icon2, chartType, abstractC0070Chart, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InsightChart.Chart chart = (InsightChart.Chart) obj;
        chart.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, chart.name);
        protoAdapter.encodeWithTag(protoWriter, 9, chart.name_accessibility_text);
        protoAdapter.encodeWithTag(protoWriter, 2, chart.title);
        protoAdapter.encodeWithTag(protoWriter, 3, chart.headline);
        protoAdapter.encodeWithTag(protoWriter, 4, chart.description);
        Icon.ADAPTER.encodeWithTag(protoWriter, 5, chart.description_icon);
        InsightChart.Chart.ChartType.ADAPTER.encodeWithTag(protoWriter, 6, chart.chart_type);
        InsightChart.Chart.AbstractC0070Chart abstractC0070Chart = chart.chart;
        if (abstractC0070Chart instanceof InsightChart.Chart.AbstractC0070Chart.BarChart) {
            VerticalStackedBarGraph.ADAPTER.encodeWithTag(protoWriter, 7, ((InsightChart.Chart.AbstractC0070Chart.BarChart) abstractC0070Chart).getValue());
        } else if (abstractC0070Chart instanceof InsightChart.Chart.AbstractC0070Chart.LineChart) {
            com.squareup.protos.cash.ui.graphs.LineGraph.ADAPTER.encodeWithTag(protoWriter, 8, ((InsightChart.Chart.AbstractC0070Chart.LineChart) abstractC0070Chart).getValue());
        } else if (abstractC0070Chart != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(chart.unknownFields());
    }
}
