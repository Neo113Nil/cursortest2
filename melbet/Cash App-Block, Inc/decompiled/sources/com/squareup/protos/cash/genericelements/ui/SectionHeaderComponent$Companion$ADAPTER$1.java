package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SectionHeaderComponent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SectionHeaderComponent((String) obj, (String) obj2, (BaseElement) obj3, (Action) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(BaseElement.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SectionHeaderComponent sectionHeaderComponent = (SectionHeaderComponent) obj;
        reverseProtoWriter.getClass();
        sectionHeaderComponent.getClass();
        reverseProtoWriter.writeBytes(sectionHeaderComponent.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, sectionHeaderComponent.body);
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 4, sectionHeaderComponent.onActionClick);
        BaseElement.ADAPTER.encodeWithTag(reverseProtoWriter, 3, sectionHeaderComponent.action);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, sectionHeaderComponent.actionText);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, sectionHeaderComponent.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SectionHeaderComponent sectionHeaderComponent = (SectionHeaderComponent) obj;
        sectionHeaderComponent.getClass();
        int size$okio = sectionHeaderComponent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, sectionHeaderComponent.body) + Action.ADAPTER.encodedSizeWithTag(4, sectionHeaderComponent.onActionClick) + BaseElement.ADAPTER.encodedSizeWithTag(3, sectionHeaderComponent.action) + protoAdapter.encodedSizeWithTag(2, sectionHeaderComponent.actionText) + protoAdapter.encodedSizeWithTag(1, sectionHeaderComponent.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SectionHeaderComponent sectionHeaderComponent = (SectionHeaderComponent) obj;
        sectionHeaderComponent.getClass();
        BaseElement baseElement = sectionHeaderComponent.action;
        BaseElement baseElement2 = baseElement != null ? (BaseElement) BaseElement.ADAPTER.redact(baseElement) : null;
        Action action = sectionHeaderComponent.onActionClick;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = sectionHeaderComponent.title;
        String str2 = sectionHeaderComponent.actionText;
        String str3 = sectionHeaderComponent.body;
        byteString.getClass();
        return new SectionHeaderComponent(str, str2, baseElement2, action2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SectionHeaderComponent sectionHeaderComponent = (SectionHeaderComponent) obj;
        sectionHeaderComponent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, sectionHeaderComponent.title);
        protoAdapter.encodeWithTag(protoWriter, 2, sectionHeaderComponent.actionText);
        BaseElement.ADAPTER.encodeWithTag(protoWriter, 3, sectionHeaderComponent.action);
        Action.ADAPTER.encodeWithTag(protoWriter, 4, sectionHeaderComponent.onActionClick);
        protoAdapter.encodeWithTag(protoWriter, 5, sectionHeaderComponent.body);
        protoWriter.writeBytes(sectionHeaderComponent.unknownFields());
    }
}
