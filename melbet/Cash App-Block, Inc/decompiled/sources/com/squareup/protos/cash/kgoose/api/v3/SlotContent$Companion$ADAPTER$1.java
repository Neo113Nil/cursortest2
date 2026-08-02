package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.SlotContent;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/SlotContent$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlotContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SlotContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        SlotContent.Component component = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SlotContent((SlotContentType) obj, (LocalizedString) obj2, component, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = SlotContentType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    component = new SlotContent.Component.Metric((Metric) Metric.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 4:
                    component = new SlotContent.Component.LineGraph((LineGraph) LineGraph.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    component = new SlotContent.Component.ItemizedTable((ItemizedTable) ItemizedTable.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    component = new SlotContent.Component.CompositionChart((CompositionChart) CompositionChart.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    component = new SlotContent.Component.StackedImage((StackedImage) StackedImage.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    component = new SlotContent.Component.ProgressRing((ProgressRing) ProgressRing.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SlotContent slotContent = (SlotContent) obj;
        reverseProtoWriter.getClass();
        slotContent.getClass();
        reverseProtoWriter.writeBytes(slotContent.unknownFields());
        SlotContent.Component component = slotContent.component;
        if (component instanceof SlotContent.Component.Metric) {
            Metric.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SlotContent.Component.Metric) component).getValue());
        } else if (component instanceof SlotContent.Component.LineGraph) {
            LineGraph.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((SlotContent.Component.LineGraph) component).getValue());
        } else if (component instanceof SlotContent.Component.ItemizedTable) {
            ItemizedTable.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((SlotContent.Component.ItemizedTable) component).getValue());
        } else if (component instanceof SlotContent.Component.CompositionChart) {
            CompositionChart.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((SlotContent.Component.CompositionChart) component).getValue());
        } else if (component instanceof SlotContent.Component.StackedImage) {
            StackedImage.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((SlotContent.Component.StackedImage) component).getValue());
        } else if (component instanceof SlotContent.Component.ProgressRing) {
            ProgressRing.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((SlotContent.Component.ProgressRing) component).getValue());
        } else if (component != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, slotContent.accessibility_label);
        SlotContentType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, slotContent.type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SlotContent slotContent = (SlotContent) obj;
        slotContent.getClass();
        int encodedSizeWithTag2 = LocalizedString.ADAPTER.encodedSizeWithTag(3, slotContent.accessibility_label) + SlotContentType.ADAPTER.encodedSizeWithTag(1, slotContent.type) + slotContent.unknownFields().getSize$okio();
        SlotContent.Component component = slotContent.component;
        if (component instanceof SlotContent.Component.Metric) {
            encodedSizeWithTag = Metric.ADAPTER.encodedSizeWithTag(2, ((SlotContent.Component.Metric) component).getValue());
        } else if (component instanceof SlotContent.Component.LineGraph) {
            encodedSizeWithTag = LineGraph.ADAPTER.encodedSizeWithTag(4, ((SlotContent.Component.LineGraph) component).getValue());
        } else if (component instanceof SlotContent.Component.ItemizedTable) {
            encodedSizeWithTag = ItemizedTable.ADAPTER.encodedSizeWithTag(5, ((SlotContent.Component.ItemizedTable) component).getValue());
        } else if (component instanceof SlotContent.Component.CompositionChart) {
            encodedSizeWithTag = CompositionChart.ADAPTER.encodedSizeWithTag(6, ((SlotContent.Component.CompositionChart) component).getValue());
        } else if (component instanceof SlotContent.Component.StackedImage) {
            encodedSizeWithTag = StackedImage.ADAPTER.encodedSizeWithTag(7, ((SlotContent.Component.StackedImage) component).getValue());
        } else {
            if (!(component instanceof SlotContent.Component.ProgressRing)) {
                if (component == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = ProgressRing.ADAPTER.encodedSizeWithTag(8, ((SlotContent.Component.ProgressRing) component).getValue());
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SlotContent slotContent = (SlotContent) obj;
        slotContent.getClass();
        LocalizedString localizedString = slotContent.accessibility_label;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        SlotContentType slotContentType = slotContent.type;
        SlotContent.Component component = slotContent.component;
        byteString.getClass();
        return new SlotContent(slotContentType, localizedString2, component, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SlotContent slotContent = (SlotContent) obj;
        slotContent.getClass();
        SlotContentType.ADAPTER.encodeWithTag(protoWriter, 1, slotContent.type);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, slotContent.accessibility_label);
        SlotContent.Component component = slotContent.component;
        if (component instanceof SlotContent.Component.Metric) {
            Metric.ADAPTER.encodeWithTag(protoWriter, 2, ((SlotContent.Component.Metric) component).getValue());
        } else if (component instanceof SlotContent.Component.LineGraph) {
            LineGraph.ADAPTER.encodeWithTag(protoWriter, 4, ((SlotContent.Component.LineGraph) component).getValue());
        } else if (component instanceof SlotContent.Component.ItemizedTable) {
            ItemizedTable.ADAPTER.encodeWithTag(protoWriter, 5, ((SlotContent.Component.ItemizedTable) component).getValue());
        } else if (component instanceof SlotContent.Component.CompositionChart) {
            CompositionChart.ADAPTER.encodeWithTag(protoWriter, 6, ((SlotContent.Component.CompositionChart) component).getValue());
        } else if (component instanceof SlotContent.Component.StackedImage) {
            StackedImage.ADAPTER.encodeWithTag(protoWriter, 7, ((SlotContent.Component.StackedImage) component).getValue());
        } else if (component instanceof SlotContent.Component.ProgressRing) {
            ProgressRing.ADAPTER.encodeWithTag(protoWriter, 8, ((SlotContent.Component.ProgressRing) component).getValue());
        } else if (component != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(slotContent.unknownFields());
    }
}
