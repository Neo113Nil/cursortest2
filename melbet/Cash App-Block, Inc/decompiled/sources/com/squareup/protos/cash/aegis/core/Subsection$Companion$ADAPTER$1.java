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
public final class Subsection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Subsection((LocalizedString) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(SubsectionBlock.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Subsection subsection = (Subsection) obj;
        reverseProtoWriter.getClass();
        subsection.getClass();
        reverseProtoWriter.writeBytes(subsection.unknownFields());
        SubsectionBlock.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, subsection.blocks);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, subsection.pill_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Subsection subsection = (Subsection) obj;
        subsection.getClass();
        return SubsectionBlock.ADAPTER.asRepeated().encodedSizeWithTag(2, subsection.blocks) + LocalizedString.ADAPTER.encodedSizeWithTag(1, subsection.pill_text) + subsection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Subsection subsection = (Subsection) obj;
        subsection.getClass();
        LocalizedString localizedString = subsection.pill_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(subsection.blocks, SubsectionBlock.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Subsection(localizedString2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Subsection subsection = (Subsection) obj;
        subsection.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, subsection.pill_text);
        SubsectionBlock.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, subsection.blocks);
        protoWriter.writeBytes(subsection.unknownFields());
    }
}
