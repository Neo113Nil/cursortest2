package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.SectionHeader;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SectionHeader$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SectionHeader((LocalizedString) obj, (LocalizedString) obj2, (Button) obj3, (TapAction) obj4, (SectionHeader.DisplayEffect) obj5, (StyledText) obj6, (StyledText) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj6 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj6);
                    break;
                case 2:
                    obj7 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj7);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 6:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 7:
                    try {
                        obj5 = SectionHeader.DisplayEffect.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SectionHeader sectionHeader = (SectionHeader) obj;
        reverseProtoWriter.getClass();
        sectionHeader.getClass();
        reverseProtoWriter.writeBytes(sectionHeader.unknownFields());
        ProtoAdapter protoAdapter = StyledText.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, sectionHeader.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, sectionHeader.title);
        SectionHeader.DisplayEffect.ADAPTER.encodeWithTag(reverseProtoWriter, 7, sectionHeader.display_effect);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, sectionHeader.tap_action);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 3, sectionHeader.cta_button);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, sectionHeader.l_subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, sectionHeader.l_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SectionHeader sectionHeader = (SectionHeader) obj;
        sectionHeader.getClass();
        int size$okio = sectionHeader.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = SectionHeader.DisplayEffect.ADAPTER.encodedSizeWithTag(7, sectionHeader.display_effect) + TapAction.ADAPTER.encodedSizeWithTag(4, sectionHeader.tap_action) + Button.ADAPTER.encodedSizeWithTag(3, sectionHeader.cta_button) + protoAdapter.encodedSizeWithTag(6, sectionHeader.l_subtitle) + protoAdapter.encodedSizeWithTag(5, sectionHeader.l_title) + size$okio;
        ProtoAdapter protoAdapter2 = StyledText.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(2, sectionHeader.subtitle) + protoAdapter2.encodedSizeWithTag(1, sectionHeader.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SectionHeader sectionHeader = (SectionHeader) obj;
        sectionHeader.getClass();
        LocalizedString localizedString = sectionHeader.l_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = sectionHeader.l_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Button button = sectionHeader.cta_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        TapAction tapAction = sectionHeader.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        StyledText styledText = sectionHeader.title;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        StyledText styledText3 = sectionHeader.subtitle;
        StyledText styledText4 = styledText3 != null ? (StyledText) StyledText.ADAPTER.redact(styledText3) : null;
        ByteString byteString = ByteString.EMPTY;
        SectionHeader.DisplayEffect displayEffect = sectionHeader.display_effect;
        byteString.getClass();
        return new SectionHeader(localizedString2, localizedString4, button2, tapAction2, displayEffect, styledText2, styledText4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SectionHeader sectionHeader = (SectionHeader) obj;
        sectionHeader.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 5, sectionHeader.l_title);
        protoAdapter.encodeWithTag(protoWriter, 6, sectionHeader.l_subtitle);
        Button.ADAPTER.encodeWithTag(protoWriter, 3, sectionHeader.cta_button);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 4, sectionHeader.tap_action);
        SectionHeader.DisplayEffect.ADAPTER.encodeWithTag(protoWriter, 7, sectionHeader.display_effect);
        ProtoAdapter protoAdapter2 = StyledText.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 1, sectionHeader.title);
        protoAdapter2.encodeWithTag(protoWriter, 2, sectionHeader.subtitle);
        protoWriter.writeBytes(sectionHeader.unknownFields());
    }
}
