package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ToggleScreen$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ToggleScreen((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(Section.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ToggleScreen toggleScreen = (ToggleScreen) obj;
        reverseProtoWriter.getClass();
        toggleScreen.getClass();
        reverseProtoWriter.writeBytes(toggleScreen.unknownFields());
        Section.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, toggleScreen.sections);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, toggleScreen.toggle_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ToggleScreen toggleScreen = (ToggleScreen) obj;
        toggleScreen.getClass();
        return Section.ADAPTER.asRepeated().encodedSizeWithTag(2, toggleScreen.sections) + ProtoAdapter.STRING.encodedSizeWithTag(1, toggleScreen.toggle_title) + toggleScreen.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ToggleScreen toggleScreen = (ToggleScreen) obj;
        toggleScreen.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(toggleScreen.sections, Section.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = toggleScreen.toggle_title;
        byteString.getClass();
        return new ToggleScreen(str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ToggleScreen toggleScreen = (ToggleScreen) obj;
        toggleScreen.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, toggleScreen.toggle_title);
        Section.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, toggleScreen.sections);
        protoWriter.writeBytes(toggleScreen.unknownFields());
    }
}
