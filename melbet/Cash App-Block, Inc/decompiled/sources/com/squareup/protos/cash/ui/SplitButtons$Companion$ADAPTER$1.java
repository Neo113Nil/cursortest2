package com.squareup.protos.cash.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SplitButtons$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SplitButtons((SplitButtons.Button) obj, (SplitButtons.Button) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SplitButtons.Button.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(SplitButtons.Button.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SplitButtons splitButtons = (SplitButtons) obj;
        reverseProtoWriter.getClass();
        splitButtons.getClass();
        reverseProtoWriter.writeBytes(splitButtons.unknownFields());
        ProtoAdapter protoAdapter = SplitButtons.Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, splitButtons.secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, splitButtons.primary_button);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SplitButtons splitButtons = (SplitButtons) obj;
        splitButtons.getClass();
        int size$okio = splitButtons.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = SplitButtons.Button.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, splitButtons.secondary_button) + protoAdapter.encodedSizeWithTag(1, splitButtons.primary_button) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SplitButtons splitButtons = (SplitButtons) obj;
        splitButtons.getClass();
        SplitButtons.Button button = splitButtons.primary_button;
        SplitButtons.Button button2 = button != null ? (SplitButtons.Button) SplitButtons.Button.ADAPTER.redact(button) : null;
        SplitButtons.Button button3 = splitButtons.secondary_button;
        SplitButtons.Button button4 = button3 != null ? (SplitButtons.Button) SplitButtons.Button.ADAPTER.redact(button3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SplitButtons(button2, button4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SplitButtons splitButtons = (SplitButtons) obj;
        splitButtons.getClass();
        ProtoAdapter protoAdapter = SplitButtons.Button.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, splitButtons.primary_button);
        protoAdapter.encodeWithTag(protoWriter, 2, splitButtons.secondary_button);
        protoWriter.writeBytes(splitButtons.unknownFields());
    }
}
