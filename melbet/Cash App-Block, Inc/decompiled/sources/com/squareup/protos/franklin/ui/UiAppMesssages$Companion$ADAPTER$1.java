package com.squareup.protos.franklin.ui;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiAppMesssages$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiAppMesssages((Boolean) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiAppMesssages uiAppMesssages = (UiAppMesssages) obj;
        reverseProtoWriter.getClass();
        uiAppMesssages.getClass();
        reverseProtoWriter.writeBytes(uiAppMesssages.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 2, uiAppMesssages.app_message_tokens);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, uiAppMesssages.app_message_notifications_enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiAppMesssages uiAppMesssages = (UiAppMesssages) obj;
        uiAppMesssages.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, uiAppMesssages.app_message_tokens) + ProtoAdapter.BOOL.encodedSizeWithTag(1, uiAppMesssages.app_message_notifications_enabled) + uiAppMesssages.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiAppMesssages uiAppMesssages = (UiAppMesssages) obj;
        uiAppMesssages.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = uiAppMesssages.app_message_notifications_enabled;
        List list = uiAppMesssages.app_message_tokens;
        list.getClass();
        byteString.getClass();
        return new UiAppMesssages(bool, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiAppMesssages uiAppMesssages = (UiAppMesssages) obj;
        uiAppMesssages.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, uiAppMesssages.app_message_notifications_enabled);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, uiAppMesssages.app_message_tokens);
        protoWriter.writeBytes(uiAppMesssages.unknownFields());
    }
}
