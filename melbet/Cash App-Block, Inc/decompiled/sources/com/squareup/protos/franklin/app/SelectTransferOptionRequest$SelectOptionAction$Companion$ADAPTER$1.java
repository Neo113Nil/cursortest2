package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SelectTransferOptionRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SelectTransferOptionRequest$SelectOptionAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectTransferOptionRequest.SelectOptionAction((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SelectTransferOptionRequest.SelectOptionAction selectOptionAction = (SelectTransferOptionRequest.SelectOptionAction) obj;
        reverseProtoWriter.getClass();
        selectOptionAction.getClass();
        reverseProtoWriter.writeBytes(selectOptionAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, selectOptionAction.selected_option_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectTransferOptionRequest.SelectOptionAction selectOptionAction = (SelectTransferOptionRequest.SelectOptionAction) obj;
        selectOptionAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, selectOptionAction.selected_option_id) + selectOptionAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectTransferOptionRequest.SelectOptionAction selectOptionAction = (SelectTransferOptionRequest.SelectOptionAction) obj;
        selectOptionAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = selectOptionAction.selected_option_id;
        byteString.getClass();
        return new SelectTransferOptionRequest.SelectOptionAction(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectTransferOptionRequest.SelectOptionAction selectOptionAction = (SelectTransferOptionRequest.SelectOptionAction) obj;
        selectOptionAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, selectOptionAction.selected_option_id);
        protoWriter.writeBytes(selectOptionAction.unknownFields());
    }
}
