package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.genericelements.ui.SeriesContainer;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SeriesContainer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SeriesContainer(m, (SeriesContainer.Scroll) obj, (Boolean) obj2, (StyleAttributes) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ComponentElement.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                try {
                    obj = SeriesContainer.Scroll.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(StyleAttributes.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SeriesContainer seriesContainer = (SeriesContainer) obj;
        reverseProtoWriter.getClass();
        seriesContainer.getClass();
        reverseProtoWriter.writeBytes(seriesContainer.unknownFields());
        StyleAttributes.ADAPTER.encodeWithTag(reverseProtoWriter, 4, seriesContainer.attributes);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, seriesContainer.ignoreVerticalSpacing);
        SeriesContainer.Scroll.ADAPTER.encodeWithTag(reverseProtoWriter, 2, seriesContainer.scroll);
        ComponentElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, seriesContainer.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SeriesContainer seriesContainer = (SeriesContainer) obj;
        seriesContainer.getClass();
        return StyleAttributes.ADAPTER.encodedSizeWithTag(4, seriesContainer.attributes) + ProtoAdapter.BOOL.encodedSizeWithTag(3, seriesContainer.ignoreVerticalSpacing) + SeriesContainer.Scroll.ADAPTER.encodedSizeWithTag(2, seriesContainer.scroll) + ComponentElement.ADAPTER.asRepeated().encodedSizeWithTag(1, seriesContainer.items) + seriesContainer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SeriesContainer seriesContainer = (SeriesContainer) obj;
        seriesContainer.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(seriesContainer.items, ComponentElement.ADAPTER);
        StyleAttributes styleAttributes = seriesContainer.attributes;
        StyleAttributes styleAttributes2 = styleAttributes != null ? (StyleAttributes) StyleAttributes.ADAPTER.redact(styleAttributes) : null;
        ByteString byteString = ByteString.EMPTY;
        SeriesContainer.Scroll scroll = seriesContainer.scroll;
        Boolean bool = seriesContainer.ignoreVerticalSpacing;
        byteString.getClass();
        return new SeriesContainer(m1169redactElements, scroll, bool, styleAttributes2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SeriesContainer seriesContainer = (SeriesContainer) obj;
        seriesContainer.getClass();
        ComponentElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, seriesContainer.items);
        SeriesContainer.Scroll.ADAPTER.encodeWithTag(protoWriter, 2, seriesContainer.scroll);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, seriesContainer.ignoreVerticalSpacing);
        StyleAttributes.ADAPTER.encodeWithTag(protoWriter, 4, seriesContainer.attributes);
        protoWriter.writeBytes(seriesContainer.unknownFields());
    }
}
