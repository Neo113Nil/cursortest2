package com.squareup.protos.cash.discover.api.app.v2.model;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v2.model.Section;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Section$Modal$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Section.Modal((Text) obj, (Button) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Section.Modal modal = (Section.Modal) obj;
        reverseProtoWriter.getClass();
        modal.getClass();
        reverseProtoWriter.writeBytes(modal.unknownFields());
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 2, modal.button);
        Text.ADAPTER.encodeWithTag(reverseProtoWriter, 1, modal.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Section.Modal modal = (Section.Modal) obj;
        modal.getClass();
        return Button.ADAPTER.encodedSizeWithTag(2, modal.button) + Text.ADAPTER.encodedSizeWithTag(1, modal.text) + modal.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Section.Modal modal = (Section.Modal) obj;
        modal.getClass();
        Text text = modal.text;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Button button = modal.button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Section.Modal(text2, button2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Section.Modal modal = (Section.Modal) obj;
        modal.getClass();
        Text.ADAPTER.encodeWithTag(protoWriter, 1, modal.text);
        Button.ADAPTER.encodeWithTag(protoWriter, 2, modal.button);
        protoWriter.writeBytes(modal.unknownFields());
    }
}
