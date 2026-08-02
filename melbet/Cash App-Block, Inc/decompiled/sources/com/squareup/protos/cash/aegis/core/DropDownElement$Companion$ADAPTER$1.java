package com.squareup.protos.cash.aegis.core;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DropDownElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DropDownElement((LocalizedString) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(LocalizedString.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DropDownElement dropDownElement = (DropDownElement) obj;
        reverseProtoWriter.getClass();
        dropDownElement.getClass();
        reverseProtoWriter.writeBytes(dropDownElement.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, dropDownElement.paragraphs);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, dropDownElement.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DropDownElement dropDownElement = (DropDownElement) obj;
        dropDownElement.getClass();
        int size$okio = dropDownElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(2, dropDownElement.paragraphs) + protoAdapter.encodedSizeWithTag(1, dropDownElement.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DropDownElement dropDownElement = (DropDownElement) obj;
        dropDownElement.getClass();
        LocalizedString localizedString = dropDownElement.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(dropDownElement.paragraphs, LocalizedString.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DropDownElement(localizedString2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DropDownElement dropDownElement = (DropDownElement) obj;
        dropDownElement.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, dropDownElement.title);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, dropDownElement.paragraphs);
        protoWriter.writeBytes(dropDownElement.unknownFields());
    }
}
