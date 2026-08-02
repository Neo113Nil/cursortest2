package com.squareup.protos.cash.cashface.ui;

import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ButtonElement$ViewChangeAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.ButtonElement.ViewChangeAction((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.ButtonElement.ViewChangeAction viewChangeAction = (GenericProfileElement.ButtonElement.ViewChangeAction) obj;
        reverseProtoWriter.getClass();
        viewChangeAction.getClass();
        reverseProtoWriter.writeBytes(viewChangeAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, viewChangeAction.client_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.ButtonElement.ViewChangeAction viewChangeAction = (GenericProfileElement.ButtonElement.ViewChangeAction) obj;
        viewChangeAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, viewChangeAction.client_route) + viewChangeAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.ButtonElement.ViewChangeAction viewChangeAction = (GenericProfileElement.ButtonElement.ViewChangeAction) obj;
        viewChangeAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = viewChangeAction.client_route;
        byteString.getClass();
        return new GenericProfileElement.ButtonElement.ViewChangeAction(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.ButtonElement.ViewChangeAction viewChangeAction = (GenericProfileElement.ButtonElement.ViewChangeAction) obj;
        viewChangeAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, viewChangeAction.client_route);
        protoWriter.writeBytes(viewChangeAction.unknownFields());
    }
}
