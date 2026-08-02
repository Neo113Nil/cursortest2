package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BaseCardComponent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BaseCardComponent(m, (StyleAttributes) obj, (Action) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BaseElement.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(StyleAttributes.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BaseCardComponent baseCardComponent = (BaseCardComponent) obj;
        reverseProtoWriter.getClass();
        baseCardComponent.getClass();
        reverseProtoWriter.writeBytes(baseCardComponent.unknownFields());
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 3, baseCardComponent.tap);
        StyleAttributes.ADAPTER.encodeWithTag(reverseProtoWriter, 2, baseCardComponent.style_attributes);
        BaseElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, baseCardComponent.elements);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BaseCardComponent baseCardComponent = (BaseCardComponent) obj;
        baseCardComponent.getClass();
        return Action.ADAPTER.encodedSizeWithTag(3, baseCardComponent.tap) + StyleAttributes.ADAPTER.encodedSizeWithTag(2, baseCardComponent.style_attributes) + BaseElement.ADAPTER.asRepeated().encodedSizeWithTag(1, baseCardComponent.elements) + baseCardComponent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BaseCardComponent baseCardComponent = (BaseCardComponent) obj;
        baseCardComponent.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(baseCardComponent.elements, BaseElement.ADAPTER);
        StyleAttributes styleAttributes = baseCardComponent.style_attributes;
        StyleAttributes styleAttributes2 = styleAttributes != null ? (StyleAttributes) StyleAttributes.ADAPTER.redact(styleAttributes) : null;
        Action action = baseCardComponent.tap;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BaseCardComponent(m1169redactElements, styleAttributes2, action2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BaseCardComponent baseCardComponent = (BaseCardComponent) obj;
        baseCardComponent.getClass();
        BaseElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, baseCardComponent.elements);
        StyleAttributes.ADAPTER.encodeWithTag(protoWriter, 2, baseCardComponent.style_attributes);
        Action.ADAPTER.encodeWithTag(protoWriter, 3, baseCardComponent.tap);
        protoWriter.writeBytes(baseCardComponent.unknownFields());
    }
}
