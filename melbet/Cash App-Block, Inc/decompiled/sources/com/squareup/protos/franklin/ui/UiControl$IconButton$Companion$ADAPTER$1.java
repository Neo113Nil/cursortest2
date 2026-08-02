package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiControl$IconButton$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiControl.IconButton((UiControl.Icon) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 3) {
                try {
                    obj = UiControl.Icon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiControl.IconButton iconButton = (UiControl.IconButton) obj;
        reverseProtoWriter.getClass();
        iconButton.getClass();
        reverseProtoWriter.writeBytes(iconButton.unknownFields());
        UiControl.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, iconButton.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiControl.IconButton iconButton = (UiControl.IconButton) obj;
        iconButton.getClass();
        return UiControl.Icon.ADAPTER.encodedSizeWithTag(3, iconButton.icon) + iconButton.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiControl.IconButton iconButton = (UiControl.IconButton) obj;
        iconButton.getClass();
        ByteString byteString = ByteString.EMPTY;
        UiControl.Icon icon = iconButton.icon;
        byteString.getClass();
        return new UiControl.IconButton(icon, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiControl.IconButton iconButton = (UiControl.IconButton) obj;
        iconButton.getClass();
        UiControl.Icon.ADAPTER.encodeWithTag(protoWriter, 3, iconButton.icon);
        protoWriter.writeBytes(iconButton.unknownFields());
    }
}
