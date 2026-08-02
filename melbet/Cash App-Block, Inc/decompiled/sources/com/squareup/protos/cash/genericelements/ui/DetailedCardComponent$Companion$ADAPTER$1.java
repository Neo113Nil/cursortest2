package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DetailedCardComponent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DetailedCardComponent((TwoColumnComponent) obj, (BaseElement) obj2, (BaseElement) obj3, (Action) obj4, (StyleAttributes) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(TwoColumnComponent.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(BaseElement.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(BaseElement.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj4);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(StyleAttributes.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DetailedCardComponent detailedCardComponent = (DetailedCardComponent) obj;
        reverseProtoWriter.getClass();
        detailedCardComponent.getClass();
        reverseProtoWriter.writeBytes(detailedCardComponent.unknownFields());
        StyleAttributes.ADAPTER.encodeWithTag(reverseProtoWriter, 6, detailedCardComponent.style_attributes);
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 4, detailedCardComponent.tap);
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, detailedCardComponent.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, detailedCardComponent.title);
        TwoColumnComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, detailedCardComponent.header);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DetailedCardComponent detailedCardComponent = (DetailedCardComponent) obj;
        detailedCardComponent.getClass();
        int encodedSizeWithTag = TwoColumnComponent.ADAPTER.encodedSizeWithTag(1, detailedCardComponent.header) + detailedCardComponent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        return StyleAttributes.ADAPTER.encodedSizeWithTag(6, detailedCardComponent.style_attributes) + Action.ADAPTER.encodedSizeWithTag(4, detailedCardComponent.tap) + protoAdapter.encodedSizeWithTag(3, detailedCardComponent.body) + protoAdapter.encodedSizeWithTag(2, detailedCardComponent.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DetailedCardComponent detailedCardComponent = (DetailedCardComponent) obj;
        detailedCardComponent.getClass();
        TwoColumnComponent twoColumnComponent = detailedCardComponent.header;
        TwoColumnComponent twoColumnComponent2 = twoColumnComponent != null ? (TwoColumnComponent) TwoColumnComponent.ADAPTER.redact(twoColumnComponent) : null;
        BaseElement baseElement = detailedCardComponent.title;
        BaseElement baseElement2 = baseElement != null ? (BaseElement) BaseElement.ADAPTER.redact(baseElement) : null;
        BaseElement baseElement3 = detailedCardComponent.body;
        BaseElement baseElement4 = baseElement3 != null ? (BaseElement) BaseElement.ADAPTER.redact(baseElement3) : null;
        Action action = detailedCardComponent.tap;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        StyleAttributes styleAttributes = detailedCardComponent.style_attributes;
        StyleAttributes styleAttributes2 = styleAttributes != null ? (StyleAttributes) StyleAttributes.ADAPTER.redact(styleAttributes) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DetailedCardComponent(twoColumnComponent2, baseElement2, baseElement4, action2, styleAttributes2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DetailedCardComponent detailedCardComponent = (DetailedCardComponent) obj;
        detailedCardComponent.getClass();
        TwoColumnComponent.ADAPTER.encodeWithTag(protoWriter, 1, detailedCardComponent.header);
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, detailedCardComponent.title);
        protoAdapter.encodeWithTag(protoWriter, 3, detailedCardComponent.body);
        Action.ADAPTER.encodeWithTag(protoWriter, 4, detailedCardComponent.tap);
        StyleAttributes.ADAPTER.encodeWithTag(protoWriter, 6, detailedCardComponent.style_attributes);
        protoWriter.writeBytes(detailedCardComponent.unknownFields());
    }
}
