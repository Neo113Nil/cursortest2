package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/TemplateCardFooterSection$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardFooterSection;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCardFooterSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TemplateCardFooterSection((LocalizedString) obj, (LocalizedString) obj2, m, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                m.add(InlineContent.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TemplateCardFooterSection templateCardFooterSection = (TemplateCardFooterSection) obj;
        reverseProtoWriter.getClass();
        templateCardFooterSection.getClass();
        reverseProtoWriter.writeBytes(templateCardFooterSection.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, templateCardFooterSection.description);
        InlineContent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, templateCardFooterSection.inline_content);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, templateCardFooterSection.display_template);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, templateCardFooterSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TemplateCardFooterSection templateCardFooterSection = (TemplateCardFooterSection) obj;
        templateCardFooterSection.getClass();
        int size$okio = templateCardFooterSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, templateCardFooterSection.description) + InlineContent.ADAPTER.asRepeated().encodedSizeWithTag(3, templateCardFooterSection.inline_content) + protoAdapter.encodedSizeWithTag(2, templateCardFooterSection.display_template) + protoAdapter.encodedSizeWithTag(1, templateCardFooterSection.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TemplateCardFooterSection templateCardFooterSection = (TemplateCardFooterSection) obj;
        templateCardFooterSection.getClass();
        LocalizedString localizedString = templateCardFooterSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = templateCardFooterSection.display_template;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(templateCardFooterSection.inline_content, InlineContent.ADAPTER);
        LocalizedString localizedString5 = templateCardFooterSection.description;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TemplateCardFooterSection(localizedString2, localizedString4, m1169redactElements, localizedString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TemplateCardFooterSection templateCardFooterSection = (TemplateCardFooterSection) obj;
        templateCardFooterSection.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, templateCardFooterSection.title);
        protoAdapter.encodeWithTag(protoWriter, 2, templateCardFooterSection.display_template);
        InlineContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, templateCardFooterSection.inline_content);
        protoAdapter.encodeWithTag(protoWriter, 4, templateCardFooterSection.description);
        protoWriter.writeBytes(templateCardFooterSection.unknownFields());
    }
}
