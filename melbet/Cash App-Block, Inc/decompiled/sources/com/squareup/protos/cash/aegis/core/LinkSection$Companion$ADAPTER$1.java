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
public final class LinkSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LinkSection((LocalizedString) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(LinkElement.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LinkSection linkSection = (LinkSection) obj;
        reverseProtoWriter.getClass();
        linkSection.getClass();
        reverseProtoWriter.writeBytes(linkSection.unknownFields());
        LinkElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, linkSection.elements);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, linkSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LinkSection linkSection = (LinkSection) obj;
        linkSection.getClass();
        return LinkElement.ADAPTER.asRepeated().encodedSizeWithTag(2, linkSection.elements) + LocalizedString.ADAPTER.encodedSizeWithTag(1, linkSection.title) + linkSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LinkSection linkSection = (LinkSection) obj;
        linkSection.getClass();
        LocalizedString localizedString = linkSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(linkSection.elements, LinkElement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LinkSection(localizedString2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LinkSection linkSection = (LinkSection) obj;
        linkSection.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, linkSection.title);
        LinkElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, linkSection.elements);
        protoWriter.writeBytes(linkSection.unknownFields());
    }
}
