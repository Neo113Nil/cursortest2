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
public final class SafetyEducationPage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SafetyEducationPage((String) obj, (LocalizedString) obj2, m, (ContentSection) obj3, (DropDownSection) obj4, (LinkSection) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    m.add(ColoredString.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj3 = TransactorKt.decodeMessageOrMerge(ContentSection.ADAPTER, protoReader, obj3);
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(DropDownSection.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(LinkSection.ADAPTER, protoReader, obj5);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SafetyEducationPage safetyEducationPage = (SafetyEducationPage) obj;
        reverseProtoWriter.getClass();
        safetyEducationPage.getClass();
        reverseProtoWriter.writeBytes(safetyEducationPage.unknownFields());
        LinkSection.ADAPTER.encodeWithTag(reverseProtoWriter, 6, safetyEducationPage.link_section);
        DropDownSection.ADAPTER.encodeWithTag(reverseProtoWriter, 5, safetyEducationPage.drop_down_section);
        ContentSection.ADAPTER.encodeWithTag(reverseProtoWriter, 4, safetyEducationPage.content_section);
        ColoredString.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, safetyEducationPage.colored_title);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, safetyEducationPage.navigation_title);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, safetyEducationPage.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SafetyEducationPage safetyEducationPage = (SafetyEducationPage) obj;
        safetyEducationPage.getClass();
        return LinkSection.ADAPTER.encodedSizeWithTag(6, safetyEducationPage.link_section) + DropDownSection.ADAPTER.encodedSizeWithTag(5, safetyEducationPage.drop_down_section) + ContentSection.ADAPTER.encodedSizeWithTag(4, safetyEducationPage.content_section) + ColoredString.ADAPTER.asRepeated().encodedSizeWithTag(3, safetyEducationPage.colored_title) + LocalizedString.ADAPTER.encodedSizeWithTag(2, safetyEducationPage.navigation_title) + ProtoAdapter.STRING.encodedSizeWithTag(1, safetyEducationPage.id) + safetyEducationPage.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SafetyEducationPage safetyEducationPage = (SafetyEducationPage) obj;
        safetyEducationPage.getClass();
        LocalizedString localizedString = safetyEducationPage.navigation_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(safetyEducationPage.colored_title, ColoredString.ADAPTER);
        ContentSection contentSection = safetyEducationPage.content_section;
        ContentSection contentSection2 = contentSection != null ? (ContentSection) ContentSection.ADAPTER.redact(contentSection) : null;
        DropDownSection dropDownSection = safetyEducationPage.drop_down_section;
        DropDownSection dropDownSection2 = dropDownSection != null ? (DropDownSection) DropDownSection.ADAPTER.redact(dropDownSection) : null;
        LinkSection linkSection = safetyEducationPage.link_section;
        LinkSection linkSection2 = linkSection != null ? (LinkSection) LinkSection.ADAPTER.redact(linkSection) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = safetyEducationPage.id;
        byteString.getClass();
        return new SafetyEducationPage(str, localizedString2, m1169redactElements, contentSection2, dropDownSection2, linkSection2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SafetyEducationPage safetyEducationPage = (SafetyEducationPage) obj;
        safetyEducationPage.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, safetyEducationPage.id);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, safetyEducationPage.navigation_title);
        ColoredString.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, safetyEducationPage.colored_title);
        ContentSection.ADAPTER.encodeWithTag(protoWriter, 4, safetyEducationPage.content_section);
        DropDownSection.ADAPTER.encodeWithTag(protoWriter, 5, safetyEducationPage.drop_down_section);
        LinkSection.ADAPTER.encodeWithTag(protoWriter, 6, safetyEducationPage.link_section);
        protoWriter.writeBytes(safetyEducationPage.unknownFields());
    }
}
