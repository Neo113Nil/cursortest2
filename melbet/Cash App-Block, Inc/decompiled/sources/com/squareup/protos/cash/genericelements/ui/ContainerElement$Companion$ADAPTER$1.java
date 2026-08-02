package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import coil3.util.BitmapsKt;
import com.squareup.protos.cash.genericelements.ui.ContainerElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ContainerElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        BitmapsKt bitmapsKt = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ContainerElement(bitmapsKt, (ContainerElement.Margin) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                bitmapsKt = new ContainerElement$Container$Single((ComponentElement) ComponentElement.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                bitmapsKt = new ContainerElement$Container$Series((SeriesContainer) SeriesContainer.ADAPTER.decode(protoReader));
            } else if (nextTag == 5) {
                bitmapsKt = new ContainerElement$Container$Placeholder((PlaceholderContainer) PlaceholderContainer.ADAPTER.decode(protoReader));
            } else if (nextTag == 6) {
                bitmapsKt = new ContainerElement$Container$Card((CardSeriesContainer) CardSeriesContainer.ADAPTER.decode(protoReader));
            } else if (nextTag == 102) {
                bitmapsKt = new ContainerElement$Container$Boosts((BoostCarouselContainer) BoostCarouselContainer.ADAPTER.decode(protoReader));
            } else if (nextTag != 200) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ContainerElement.Margin.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ContainerElement containerElement = (ContainerElement) obj;
        reverseProtoWriter.getClass();
        containerElement.getClass();
        reverseProtoWriter.writeBytes(containerElement.unknownFields());
        BitmapsKt bitmapsKt = containerElement.container;
        if (bitmapsKt instanceof ContainerElement$Container$Single) {
            ComponentElement.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ContainerElement$Container$Single) bitmapsKt).value);
        } else if (bitmapsKt instanceof ContainerElement$Container$Series) {
            SeriesContainer.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ContainerElement$Container$Series) bitmapsKt).value);
        } else if (bitmapsKt instanceof ContainerElement$Container$Placeholder) {
            PlaceholderContainer.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((ContainerElement$Container$Placeholder) bitmapsKt).value);
        } else if (bitmapsKt instanceof ContainerElement$Container$Card) {
            CardSeriesContainer.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((ContainerElement$Container$Card) bitmapsKt).value);
        } else if (bitmapsKt instanceof ContainerElement$Container$Boosts) {
            BoostCarouselContainer.ADAPTER.encodeWithTag(reverseProtoWriter, 102, ((ContainerElement$Container$Boosts) bitmapsKt).value);
        } else if (bitmapsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ContainerElement.Margin.ADAPTER.encodeWithTag(reverseProtoWriter, 200, containerElement.margin);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ContainerElement containerElement = (ContainerElement) obj;
        containerElement.getClass();
        int size$okio = containerElement.unknownFields().getSize$okio();
        BitmapsKt bitmapsKt = containerElement.container;
        if (bitmapsKt instanceof ContainerElement$Container$Single) {
            encodedSizeWithTag = ComponentElement.ADAPTER.encodedSizeWithTag(2, ((ContainerElement$Container$Single) bitmapsKt).value);
        } else if (bitmapsKt instanceof ContainerElement$Container$Series) {
            encodedSizeWithTag = SeriesContainer.ADAPTER.encodedSizeWithTag(3, ((ContainerElement$Container$Series) bitmapsKt).value);
        } else if (bitmapsKt instanceof ContainerElement$Container$Placeholder) {
            encodedSizeWithTag = PlaceholderContainer.ADAPTER.encodedSizeWithTag(5, ((ContainerElement$Container$Placeholder) bitmapsKt).value);
        } else if (bitmapsKt instanceof ContainerElement$Container$Card) {
            encodedSizeWithTag = CardSeriesContainer.ADAPTER.encodedSizeWithTag(6, ((ContainerElement$Container$Card) bitmapsKt).value);
        } else {
            if (!(bitmapsKt instanceof ContainerElement$Container$Boosts)) {
                if (bitmapsKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ContainerElement.Margin.ADAPTER.encodedSizeWithTag(200, containerElement.margin) + size$okio;
            }
            encodedSizeWithTag = BoostCarouselContainer.ADAPTER.encodedSizeWithTag(102, ((ContainerElement$Container$Boosts) bitmapsKt).value);
        }
        size$okio += encodedSizeWithTag;
        return ContainerElement.Margin.ADAPTER.encodedSizeWithTag(200, containerElement.margin) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ContainerElement containerElement = (ContainerElement) obj;
        containerElement.getClass();
        ContainerElement.Margin margin = containerElement.margin;
        ContainerElement.Margin margin2 = margin != null ? (ContainerElement.Margin) ContainerElement.Margin.ADAPTER.redact(margin) : null;
        ByteString byteString = ByteString.EMPTY;
        BitmapsKt bitmapsKt = containerElement.container;
        byteString.getClass();
        return new ContainerElement(bitmapsKt, margin2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ContainerElement containerElement = (ContainerElement) obj;
        containerElement.getClass();
        ContainerElement.Margin.ADAPTER.encodeWithTag(protoWriter, 200, containerElement.margin);
        BitmapsKt bitmapsKt = containerElement.container;
        if (bitmapsKt instanceof ContainerElement$Container$Single) {
            ComponentElement.ADAPTER.encodeWithTag(protoWriter, 2, ((ContainerElement$Container$Single) bitmapsKt).value);
        } else if (bitmapsKt instanceof ContainerElement$Container$Series) {
            SeriesContainer.ADAPTER.encodeWithTag(protoWriter, 3, ((ContainerElement$Container$Series) bitmapsKt).value);
        } else if (bitmapsKt instanceof ContainerElement$Container$Placeholder) {
            PlaceholderContainer.ADAPTER.encodeWithTag(protoWriter, 5, ((ContainerElement$Container$Placeholder) bitmapsKt).value);
        } else if (bitmapsKt instanceof ContainerElement$Container$Card) {
            CardSeriesContainer.ADAPTER.encodeWithTag(protoWriter, 6, ((ContainerElement$Container$Card) bitmapsKt).value);
        } else if (bitmapsKt instanceof ContainerElement$Container$Boosts) {
            BoostCarouselContainer.ADAPTER.encodeWithTag(protoWriter, 102, ((ContainerElement$Container$Boosts) bitmapsKt).value);
        } else if (bitmapsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(containerElement.unknownFields());
    }
}
