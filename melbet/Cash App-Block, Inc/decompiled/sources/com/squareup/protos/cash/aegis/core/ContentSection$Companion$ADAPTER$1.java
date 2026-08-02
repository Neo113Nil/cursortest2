package com.squareup.protos.cash.aegis.core;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ContentSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ContentSection((LocalizedString) obj, m, (Image) obj2, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(LocalizedString.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(Subsection.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ContentSection contentSection = (ContentSection) obj;
        reverseProtoWriter.getClass();
        contentSection.getClass();
        reverseProtoWriter.writeBytes(contentSection.unknownFields());
        Subsection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, contentSection.subsections);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, contentSection.image);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, contentSection.paragraphs);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, contentSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ContentSection contentSection = (ContentSection) obj;
        contentSection.getClass();
        int size$okio = contentSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return Subsection.ADAPTER.asRepeated().encodedSizeWithTag(4, contentSection.subsections) + Image.ADAPTER.encodedSizeWithTag(3, contentSection.image) + protoAdapter.asRepeated().encodedSizeWithTag(2, contentSection.paragraphs) + protoAdapter.encodedSizeWithTag(1, contentSection.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ContentSection contentSection = (ContentSection) obj;
        contentSection.getClass();
        LocalizedString localizedString = contentSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(contentSection.paragraphs, LocalizedString.ADAPTER);
        Image image = contentSection.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(contentSection.subsections, Subsection.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ContentSection(localizedString2, m1169redactElements, image2, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ContentSection contentSection = (ContentSection) obj;
        contentSection.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, contentSection.title);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, contentSection.paragraphs);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, contentSection.image);
        Subsection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, contentSection.subsections);
        protoWriter.writeBytes(contentSection.unknownFields());
    }
}
