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
public final class DropDownSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DropDownSection((LocalizedString) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(DropDownElement.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DropDownSection dropDownSection = (DropDownSection) obj;
        reverseProtoWriter.getClass();
        dropDownSection.getClass();
        reverseProtoWriter.writeBytes(dropDownSection.unknownFields());
        DropDownElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, dropDownSection.elements);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, dropDownSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DropDownSection dropDownSection = (DropDownSection) obj;
        dropDownSection.getClass();
        return DropDownElement.ADAPTER.asRepeated().encodedSizeWithTag(2, dropDownSection.elements) + LocalizedString.ADAPTER.encodedSizeWithTag(1, dropDownSection.title) + dropDownSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DropDownSection dropDownSection = (DropDownSection) obj;
        dropDownSection.getClass();
        LocalizedString localizedString = dropDownSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(dropDownSection.elements, DropDownElement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DropDownSection(localizedString2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DropDownSection dropDownSection = (DropDownSection) obj;
        dropDownSection.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, dropDownSection.title);
        DropDownElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, dropDownSection.elements);
        protoWriter.writeBytes(dropDownSection.unknownFields());
    }
}
