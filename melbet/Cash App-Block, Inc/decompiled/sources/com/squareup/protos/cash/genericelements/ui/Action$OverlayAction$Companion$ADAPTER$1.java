package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OverlayAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OverlayAction(m, (String) obj, (ContainerElement) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ContainerElement.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ContainerElement.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.OverlayAction overlayAction = (Action.OverlayAction) obj;
        reverseProtoWriter.getClass();
        overlayAction.getClass();
        reverseProtoWriter.writeBytes(overlayAction.unknownFields());
        ProtoAdapter protoAdapter = ContainerElement.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, overlayAction.error_element_tree);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, overlayAction.get_elements_context);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, overlayAction.overlay_element_tree);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OverlayAction overlayAction = (Action.OverlayAction) obj;
        overlayAction.getClass();
        int size$okio = overlayAction.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ContainerElement.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, overlayAction.error_element_tree) + ProtoAdapter.STRING.encodedSizeWithTag(2, overlayAction.get_elements_context) + protoAdapter.asRepeated().encodedSizeWithTag(1, overlayAction.overlay_element_tree) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.OverlayAction overlayAction = (Action.OverlayAction) obj;
        overlayAction.getClass();
        List list = overlayAction.overlay_element_tree;
        ProtoAdapter protoAdapter = ContainerElement.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ContainerElement containerElement = overlayAction.error_element_tree;
        ContainerElement containerElement2 = containerElement != null ? (ContainerElement) protoAdapter.redact(containerElement) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = overlayAction.get_elements_context;
        byteString.getClass();
        return new Action.OverlayAction(m1169redactElements, str, containerElement2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OverlayAction overlayAction = (Action.OverlayAction) obj;
        overlayAction.getClass();
        ProtoAdapter protoAdapter = ContainerElement.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, overlayAction.overlay_element_tree);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, overlayAction.get_elements_context);
        protoAdapter.encodeWithTag(protoWriter, 3, overlayAction.error_element_tree);
        protoWriter.writeBytes(overlayAction.unknownFields());
    }
}
