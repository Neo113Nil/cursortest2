package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.transform.TransformationsKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ComponentElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        TransformationsKt transformationsKt = null;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ComponentElement(transformationsKt, (AnalyticsData) obj, (AnalyticsEvent) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    transformationsKt = new ComponentElement$Element$CompactCard((CompactCardComponent) CompactCardComponent.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    transformationsKt = new ComponentElement$Element$BlankDivider((BlankDividerComponent) BlankDividerComponent.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    transformationsKt = new ComponentElement$Element$LineDivider((LineDividerComponent) LineDividerComponent.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    transformationsKt = new ComponentElement$Element$ValueUnit((ValueUnitComponent) ValueUnitComponent.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    transformationsKt = new ComponentElement$Element$DetailedCard((DetailedCardComponent) DetailedCardComponent.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    transformationsKt = new ComponentElement$Element$ColumnedRow((TwoColumnComponent) TwoColumnComponent.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    transformationsKt = new ComponentElement$Element$FullWidth((FullWidthComponent) FullWidthComponent.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    transformationsKt = new ComponentElement$Element$BaseCard((BaseCardComponent) BaseCardComponent.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    transformationsKt = new ComponentElement$Element$CompactInfo((CompactInfoComponent) CompactInfoComponent.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    transformationsKt = new ComponentElement$Element$TwoColumnCard((TwoColumnCardComponent) TwoColumnCardComponent.ADAPTER.decode(protoReader));
                    break;
                case 11:
                    transformationsKt = new ComponentElement$Element$TwoColumnRow((TwoColumnRowComponent) TwoColumnRowComponent.ADAPTER.decode(protoReader));
                    break;
                case 12:
                    transformationsKt = new ComponentElement$Element$SectionHeader((SectionHeaderComponent) SectionHeaderComponent.ADAPTER.decode(protoReader));
                    break;
                case 13:
                    transformationsKt = new ComponentElement$Element$CellActivity((CellActivityComponent) CellActivityComponent.ADAPTER.decode(protoReader));
                    break;
                case 14:
                    transformationsKt = new ComponentElement$Element$ListUnordered((ListUnorderedComponent) ListUnorderedComponent.ADAPTER.decode(protoReader));
                    break;
                case 15:
                    transformationsKt = new ComponentElement$Element$CellDefault((CellDefaultComponent) CellDefaultComponent.ADAPTER.decode(protoReader));
                    break;
                case 16:
                    transformationsKt = new ComponentElement$Element$ButtonCtaGroup((ButtonCtaGroupComponent) ButtonCtaGroupComponent.ADAPTER.decode(protoReader));
                    break;
                default:
                    switch (nextTag) {
                        case 100:
                            obj = TransactorKt.decodeMessageOrMerge(AnalyticsData.ADAPTER, protoReader, obj);
                            break;
                        case 101:
                            obj2 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj2);
                            break;
                        case 102:
                            m.add(RefreshTrigger.ADAPTER.decode(protoReader));
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComponentElement componentElement = (ComponentElement) obj;
        reverseProtoWriter.getClass();
        componentElement.getClass();
        reverseProtoWriter.writeBytes(componentElement.unknownFields());
        TransformationsKt transformationsKt = componentElement.element;
        if (transformationsKt instanceof ComponentElement$Element$CompactCard) {
            CompactCardComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ComponentElement$Element$CompactCard) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$BlankDivider) {
            BlankDividerComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ComponentElement$Element$BlankDivider) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$LineDivider) {
            LineDividerComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ComponentElement$Element$LineDivider) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$ValueUnit) {
            ValueUnitComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((ComponentElement$Element$ValueUnit) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$DetailedCard) {
            DetailedCardComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((ComponentElement$Element$DetailedCard) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$ColumnedRow) {
            TwoColumnComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((ComponentElement$Element$ColumnedRow) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$FullWidth) {
            FullWidthComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((ComponentElement$Element$FullWidth) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$BaseCard) {
            BaseCardComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((ComponentElement$Element$BaseCard) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$CompactInfo) {
            CompactInfoComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((ComponentElement$Element$CompactInfo) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$TwoColumnCard) {
            TwoColumnCardComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((ComponentElement$Element$TwoColumnCard) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$TwoColumnRow) {
            TwoColumnRowComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((ComponentElement$Element$TwoColumnRow) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$SectionHeader) {
            SectionHeaderComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((ComponentElement$Element$SectionHeader) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$CellActivity) {
            CellActivityComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 13, ((ComponentElement$Element$CellActivity) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$ListUnordered) {
            ListUnorderedComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 14, ((ComponentElement$Element$ListUnordered) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$CellDefault) {
            CellDefaultComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 15, ((ComponentElement$Element$CellDefault) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$ButtonCtaGroup) {
            ButtonCtaGroupComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 16, ((ComponentElement$Element$ButtonCtaGroup) transformationsKt).value);
        } else if (transformationsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        RefreshTrigger.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 102, componentElement.refresh_triggers);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 101, componentElement.view_event);
        AnalyticsData.ADAPTER.encodeWithTag(reverseProtoWriter, 100, componentElement.analytics_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ComponentElement componentElement = (ComponentElement) obj;
        componentElement.getClass();
        int size$okio = componentElement.unknownFields().getSize$okio();
        TransformationsKt transformationsKt = componentElement.element;
        if (transformationsKt instanceof ComponentElement$Element$CompactCard) {
            encodedSizeWithTag = CompactCardComponent.ADAPTER.encodedSizeWithTag(1, ((ComponentElement$Element$CompactCard) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$BlankDivider) {
            encodedSizeWithTag = BlankDividerComponent.ADAPTER.encodedSizeWithTag(2, ((ComponentElement$Element$BlankDivider) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$LineDivider) {
            encodedSizeWithTag = LineDividerComponent.ADAPTER.encodedSizeWithTag(3, ((ComponentElement$Element$LineDivider) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$ValueUnit) {
            encodedSizeWithTag = ValueUnitComponent.ADAPTER.encodedSizeWithTag(4, ((ComponentElement$Element$ValueUnit) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$DetailedCard) {
            encodedSizeWithTag = DetailedCardComponent.ADAPTER.encodedSizeWithTag(5, ((ComponentElement$Element$DetailedCard) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$ColumnedRow) {
            encodedSizeWithTag = TwoColumnComponent.ADAPTER.encodedSizeWithTag(6, ((ComponentElement$Element$ColumnedRow) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$FullWidth) {
            encodedSizeWithTag = FullWidthComponent.ADAPTER.encodedSizeWithTag(7, ((ComponentElement$Element$FullWidth) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$BaseCard) {
            encodedSizeWithTag = BaseCardComponent.ADAPTER.encodedSizeWithTag(8, ((ComponentElement$Element$BaseCard) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$CompactInfo) {
            encodedSizeWithTag = CompactInfoComponent.ADAPTER.encodedSizeWithTag(9, ((ComponentElement$Element$CompactInfo) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$TwoColumnCard) {
            encodedSizeWithTag = TwoColumnCardComponent.ADAPTER.encodedSizeWithTag(10, ((ComponentElement$Element$TwoColumnCard) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$TwoColumnRow) {
            encodedSizeWithTag = TwoColumnRowComponent.ADAPTER.encodedSizeWithTag(11, ((ComponentElement$Element$TwoColumnRow) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$SectionHeader) {
            encodedSizeWithTag = SectionHeaderComponent.ADAPTER.encodedSizeWithTag(12, ((ComponentElement$Element$SectionHeader) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$CellActivity) {
            encodedSizeWithTag = CellActivityComponent.ADAPTER.encodedSizeWithTag(13, ((ComponentElement$Element$CellActivity) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$ListUnordered) {
            encodedSizeWithTag = ListUnorderedComponent.ADAPTER.encodedSizeWithTag(14, ((ComponentElement$Element$ListUnordered) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$CellDefault) {
            encodedSizeWithTag = CellDefaultComponent.ADAPTER.encodedSizeWithTag(15, ((ComponentElement$Element$CellDefault) transformationsKt).value);
        } else {
            if (!(transformationsKt instanceof ComponentElement$Element$ButtonCtaGroup)) {
                if (transformationsKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return RefreshTrigger.ADAPTER.asRepeated().encodedSizeWithTag(102, componentElement.refresh_triggers) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(101, componentElement.view_event) + AnalyticsData.ADAPTER.encodedSizeWithTag(100, componentElement.analytics_data) + size$okio;
            }
            encodedSizeWithTag = ButtonCtaGroupComponent.ADAPTER.encodedSizeWithTag(16, ((ComponentElement$Element$ButtonCtaGroup) transformationsKt).value);
        }
        size$okio += encodedSizeWithTag;
        return RefreshTrigger.ADAPTER.asRepeated().encodedSizeWithTag(102, componentElement.refresh_triggers) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(101, componentElement.view_event) + AnalyticsData.ADAPTER.encodedSizeWithTag(100, componentElement.analytics_data) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComponentElement componentElement = (ComponentElement) obj;
        componentElement.getClass();
        AnalyticsData analyticsData = componentElement.analytics_data;
        AnalyticsData analyticsData2 = analyticsData != null ? (AnalyticsData) AnalyticsData.ADAPTER.redact(analyticsData) : null;
        AnalyticsEvent analyticsEvent = componentElement.view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(componentElement.refresh_triggers, RefreshTrigger.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        TransformationsKt transformationsKt = componentElement.element;
        byteString.getClass();
        return new ComponentElement(transformationsKt, analyticsData2, analyticsEvent2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComponentElement componentElement = (ComponentElement) obj;
        componentElement.getClass();
        AnalyticsData.ADAPTER.encodeWithTag(protoWriter, 100, componentElement.analytics_data);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 101, componentElement.view_event);
        RefreshTrigger.ADAPTER.asRepeated().encodeWithTag(protoWriter, 102, componentElement.refresh_triggers);
        TransformationsKt transformationsKt = componentElement.element;
        if (transformationsKt instanceof ComponentElement$Element$CompactCard) {
            CompactCardComponent.ADAPTER.encodeWithTag(protoWriter, 1, ((ComponentElement$Element$CompactCard) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$BlankDivider) {
            BlankDividerComponent.ADAPTER.encodeWithTag(protoWriter, 2, ((ComponentElement$Element$BlankDivider) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$LineDivider) {
            LineDividerComponent.ADAPTER.encodeWithTag(protoWriter, 3, ((ComponentElement$Element$LineDivider) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$ValueUnit) {
            ValueUnitComponent.ADAPTER.encodeWithTag(protoWriter, 4, ((ComponentElement$Element$ValueUnit) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$DetailedCard) {
            DetailedCardComponent.ADAPTER.encodeWithTag(protoWriter, 5, ((ComponentElement$Element$DetailedCard) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$ColumnedRow) {
            TwoColumnComponent.ADAPTER.encodeWithTag(protoWriter, 6, ((ComponentElement$Element$ColumnedRow) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$FullWidth) {
            FullWidthComponent.ADAPTER.encodeWithTag(protoWriter, 7, ((ComponentElement$Element$FullWidth) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$BaseCard) {
            BaseCardComponent.ADAPTER.encodeWithTag(protoWriter, 8, ((ComponentElement$Element$BaseCard) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$CompactInfo) {
            CompactInfoComponent.ADAPTER.encodeWithTag(protoWriter, 9, ((ComponentElement$Element$CompactInfo) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$TwoColumnCard) {
            TwoColumnCardComponent.ADAPTER.encodeWithTag(protoWriter, 10, ((ComponentElement$Element$TwoColumnCard) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$TwoColumnRow) {
            TwoColumnRowComponent.ADAPTER.encodeWithTag(protoWriter, 11, ((ComponentElement$Element$TwoColumnRow) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$SectionHeader) {
            SectionHeaderComponent.ADAPTER.encodeWithTag(protoWriter, 12, ((ComponentElement$Element$SectionHeader) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$CellActivity) {
            CellActivityComponent.ADAPTER.encodeWithTag(protoWriter, 13, ((ComponentElement$Element$CellActivity) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$ListUnordered) {
            ListUnorderedComponent.ADAPTER.encodeWithTag(protoWriter, 14, ((ComponentElement$Element$ListUnordered) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$CellDefault) {
            CellDefaultComponent.ADAPTER.encodeWithTag(protoWriter, 15, ((ComponentElement$Element$CellDefault) transformationsKt).value);
        } else if (transformationsKt instanceof ComponentElement$Element$ButtonCtaGroup) {
            ButtonCtaGroupComponent.ADAPTER.encodeWithTag(protoWriter, 16, ((ComponentElement$Element$ButtonCtaGroup) transformationsKt).value);
        } else if (transformationsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(componentElement.unknownFields());
    }
}
