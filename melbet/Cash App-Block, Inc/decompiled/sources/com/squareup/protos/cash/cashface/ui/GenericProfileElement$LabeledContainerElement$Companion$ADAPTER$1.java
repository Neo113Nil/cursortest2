package com.squareup.protos.cash.cashface.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$LabeledContainerElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.LabeledContainerElement((String) obj, (GenericProfileElement) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(GenericProfileElement.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(GenericProfileElement.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.LabeledContainerElement labeledContainerElement = (GenericProfileElement.LabeledContainerElement) obj;
        reverseProtoWriter.getClass();
        labeledContainerElement.getClass();
        reverseProtoWriter.writeBytes(labeledContainerElement.unknownFields());
        ProtoAdapter protoAdapter = GenericProfileElement.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, labeledContainerElement.elements);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, labeledContainerElement.call_to_action);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, labeledContainerElement.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.LabeledContainerElement labeledContainerElement = (GenericProfileElement.LabeledContainerElement) obj;
        labeledContainerElement.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, labeledContainerElement.title) + labeledContainerElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = GenericProfileElement.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(3, labeledContainerElement.elements) + protoAdapter.encodedSizeWithTag(2, labeledContainerElement.call_to_action) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.LabeledContainerElement labeledContainerElement = (GenericProfileElement.LabeledContainerElement) obj;
        labeledContainerElement.getClass();
        GenericProfileElement genericProfileElement = labeledContainerElement.call_to_action;
        GenericProfileElement genericProfileElement2 = genericProfileElement != null ? (GenericProfileElement) GenericProfileElement.ADAPTER.redact(genericProfileElement) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(labeledContainerElement.elements, GenericProfileElement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = labeledContainerElement.title;
        byteString.getClass();
        return new GenericProfileElement.LabeledContainerElement(str, genericProfileElement2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.LabeledContainerElement labeledContainerElement = (GenericProfileElement.LabeledContainerElement) obj;
        labeledContainerElement.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, labeledContainerElement.title);
        ProtoAdapter protoAdapter = GenericProfileElement.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, labeledContainerElement.call_to_action);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, labeledContainerElement.elements);
        protoWriter.writeBytes(labeledContainerElement.unknownFields());
    }
}
