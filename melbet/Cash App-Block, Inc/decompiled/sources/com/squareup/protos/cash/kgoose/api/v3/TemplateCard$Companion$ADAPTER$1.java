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

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/TemplateCard$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCard$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TemplateCard((LocalizedString) obj, m, (TemplateCardBottomPicker) obj2, (TemplateCardTapBehavior) obj3, (LocalizedString) obj4, (Boolean) obj5, (TemplateCardFooterSection) obj6, (String) obj7, (String) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    m.add(InlineContent.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    obj2 = TransactorKt.decodeMessageOrMerge(TemplateCardBottomPicker.ADAPTER, protoReader, obj2);
                    break;
                case 4:
                    obj3 = TransactorKt.decodeMessageOrMerge(TemplateCardTapBehavior.ADAPTER, protoReader, obj3);
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(TemplateCardFooterSection.ADAPTER, protoReader, obj6);
                    break;
                case 8:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TemplateCard templateCard = (TemplateCard) obj;
        reverseProtoWriter.getClass();
        templateCard.getClass();
        reverseProtoWriter.writeBytes(templateCard.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, templateCard.target_placeholder_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, templateCard.source_placeholder_key);
        TemplateCardFooterSection.ADAPTER.encodeWithTag(reverseProtoWriter, 7, templateCard.footer_section);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, templateCard.non_editable);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, templateCard.description);
        TemplateCardTapBehavior.ADAPTER.encodeWithTag(reverseProtoWriter, 4, templateCard.tap_behavior);
        TemplateCardBottomPicker.ADAPTER.encodeWithTag(reverseProtoWriter, 3, templateCard.bottom_picker);
        InlineContent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, templateCard.inline_content);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, templateCard.display_template);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TemplateCard templateCard = (TemplateCard) obj;
        templateCard.getClass();
        int size$okio = templateCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = TemplateCardFooterSection.ADAPTER.encodedSizeWithTag(7, templateCard.footer_section) + ProtoAdapter.BOOL.encodedSizeWithTag(6, templateCard.non_editable) + protoAdapter.encodedSizeWithTag(5, templateCard.description) + TemplateCardTapBehavior.ADAPTER.encodedSizeWithTag(4, templateCard.tap_behavior) + TemplateCardBottomPicker.ADAPTER.encodedSizeWithTag(3, templateCard.bottom_picker) + InlineContent.ADAPTER.asRepeated().encodedSizeWithTag(2, templateCard.inline_content) + protoAdapter.encodedSizeWithTag(1, templateCard.display_template) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter2.encodedSizeWithTag(9, templateCard.target_placeholder_key) + protoAdapter2.encodedSizeWithTag(8, templateCard.source_placeholder_key) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TemplateCard templateCard = (TemplateCard) obj;
        templateCard.getClass();
        LocalizedString localizedString = templateCard.display_template;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(templateCard.inline_content, InlineContent.ADAPTER);
        TemplateCardBottomPicker templateCardBottomPicker = templateCard.bottom_picker;
        TemplateCardBottomPicker templateCardBottomPicker2 = templateCardBottomPicker != null ? (TemplateCardBottomPicker) TemplateCardBottomPicker.ADAPTER.redact(templateCardBottomPicker) : null;
        TemplateCardTapBehavior templateCardTapBehavior = templateCard.tap_behavior;
        TemplateCardTapBehavior templateCardTapBehavior2 = templateCardTapBehavior != null ? (TemplateCardTapBehavior) TemplateCardTapBehavior.ADAPTER.redact(templateCardTapBehavior) : null;
        LocalizedString localizedString3 = templateCard.description;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        TemplateCardFooterSection templateCardFooterSection = templateCard.footer_section;
        TemplateCardFooterSection templateCardFooterSection2 = templateCardFooterSection != null ? (TemplateCardFooterSection) TemplateCardFooterSection.ADAPTER.redact(templateCardFooterSection) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = templateCard.non_editable;
        String str = templateCard.source_placeholder_key;
        String str2 = templateCard.target_placeholder_key;
        byteString.getClass();
        return new TemplateCard(localizedString2, m1169redactElements, templateCardBottomPicker2, templateCardTapBehavior2, localizedString4, bool, templateCardFooterSection2, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TemplateCard templateCard = (TemplateCard) obj;
        templateCard.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, templateCard.display_template);
        InlineContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, templateCard.inline_content);
        TemplateCardBottomPicker.ADAPTER.encodeWithTag(protoWriter, 3, templateCard.bottom_picker);
        TemplateCardTapBehavior.ADAPTER.encodeWithTag(protoWriter, 4, templateCard.tap_behavior);
        protoAdapter.encodeWithTag(protoWriter, 5, templateCard.description);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, templateCard.non_editable);
        TemplateCardFooterSection.ADAPTER.encodeWithTag(protoWriter, 7, templateCard.footer_section);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 8, templateCard.source_placeholder_key);
        protoAdapter2.encodeWithTag(protoWriter, 9, templateCard.target_placeholder_key);
        protoWriter.writeBytes(templateCard.unknownFields());
    }
}
