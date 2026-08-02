package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.GenericNonPaymentRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GenericNonPaymentRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.squareup.wire.ProtoAdapter
    public final java.lang.Object decode(com.squareup.wire.ProtoReader r34) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.protos.franklin.common.GenericNonPaymentRenderData$Companion$ADAPTER$1.decode(com.squareup.wire.ProtoReader):java.lang.Object");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericNonPaymentRenderData genericNonPaymentRenderData = (GenericNonPaymentRenderData) obj;
        reverseProtoWriter.getClass();
        genericNonPaymentRenderData.getClass();
        reverseProtoWriter.writeBytes(genericNonPaymentRenderData.unknownFields());
        ProtoAdapter protoAdapter = GenericNonPaymentRenderData.Avatar.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, genericNonPaymentRenderData.second_avatar);
        GenericNonPaymentRenderData.TertiaryLabelSuffix.ADAPTER.encodeWithTag(reverseProtoWriter, 12, genericNonPaymentRenderData.tertiary_label_suffix);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 11, genericNonPaymentRenderData.url_to_open);
        GenericNonPaymentRenderData.HelpCenterLinkType.ADAPTER.encodeWithTag(reverseProtoWriter, 10, genericNonPaymentRenderData.help_center_link_type);
        GenericNonPaymentRenderData.ThreadedView.ADAPTER.encodeWithTag(reverseProtoWriter, 9, genericNonPaymentRenderData.threaded_view);
        GenericNonPaymentRenderData.MoreInfoSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 8, genericNonPaymentRenderData.more_info_sheet);
        ProtoAdapter protoAdapter2 = GenericNonPaymentRenderData.Button.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, genericNonPaymentRenderData.secondary_button);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, genericNonPaymentRenderData.primary_button);
        GenericNonPaymentRenderData.InlineButton.ADAPTER.encodeWithTag(reverseProtoWriter, 5, genericNonPaymentRenderData.inline_button);
        GenericNonPaymentRenderData.Header.ADAPTER.encodeWithTag(reverseProtoWriter, 4, genericNonPaymentRenderData.header);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, genericNonPaymentRenderData.avatar);
        GenericNonPaymentRenderData.Subtitle.ADAPTER.encodeWithTag(reverseProtoWriter, 2, genericNonPaymentRenderData.subtitle);
        GenericNonPaymentRenderData.Title.ADAPTER.encodeWithTag(reverseProtoWriter, 1, genericNonPaymentRenderData.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericNonPaymentRenderData genericNonPaymentRenderData = (GenericNonPaymentRenderData) obj;
        genericNonPaymentRenderData.getClass();
        int encodedSizeWithTag = GenericNonPaymentRenderData.Subtitle.ADAPTER.encodedSizeWithTag(2, genericNonPaymentRenderData.subtitle) + GenericNonPaymentRenderData.Title.ADAPTER.encodedSizeWithTag(1, genericNonPaymentRenderData.title) + genericNonPaymentRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = GenericNonPaymentRenderData.Avatar.ADAPTER;
        int encodedSizeWithTag2 = GenericNonPaymentRenderData.InlineButton.ADAPTER.encodedSizeWithTag(5, genericNonPaymentRenderData.inline_button) + GenericNonPaymentRenderData.Header.ADAPTER.encodedSizeWithTag(4, genericNonPaymentRenderData.header) + protoAdapter.encodedSizeWithTag(3, genericNonPaymentRenderData.avatar) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = GenericNonPaymentRenderData.Button.ADAPTER;
        return protoAdapter.encodedSizeWithTag(13, genericNonPaymentRenderData.second_avatar) + GenericNonPaymentRenderData.TertiaryLabelSuffix.ADAPTER.encodedSizeWithTag(12, genericNonPaymentRenderData.tertiary_label_suffix) + ProtoAdapter.STRING.encodedSizeWithTag(11, genericNonPaymentRenderData.url_to_open) + GenericNonPaymentRenderData.HelpCenterLinkType.ADAPTER.encodedSizeWithTag(10, genericNonPaymentRenderData.help_center_link_type) + GenericNonPaymentRenderData.ThreadedView.ADAPTER.encodedSizeWithTag(9, genericNonPaymentRenderData.threaded_view) + GenericNonPaymentRenderData.MoreInfoSheet.ADAPTER.encodedSizeWithTag(8, genericNonPaymentRenderData.more_info_sheet) + protoAdapter2.encodedSizeWithTag(7, genericNonPaymentRenderData.secondary_button) + protoAdapter2.encodedSizeWithTag(6, genericNonPaymentRenderData.primary_button) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericNonPaymentRenderData genericNonPaymentRenderData = (GenericNonPaymentRenderData) obj;
        genericNonPaymentRenderData.getClass();
        GenericNonPaymentRenderData.Title title = genericNonPaymentRenderData.title;
        GenericNonPaymentRenderData.Title title2 = title != null ? (GenericNonPaymentRenderData.Title) GenericNonPaymentRenderData.Title.ADAPTER.redact(title) : null;
        GenericNonPaymentRenderData.Subtitle subtitle = genericNonPaymentRenderData.subtitle;
        GenericNonPaymentRenderData.Subtitle subtitle2 = subtitle != null ? (GenericNonPaymentRenderData.Subtitle) GenericNonPaymentRenderData.Subtitle.ADAPTER.redact(subtitle) : null;
        GenericNonPaymentRenderData.Avatar avatar = genericNonPaymentRenderData.avatar;
        GenericNonPaymentRenderData.Avatar avatar2 = avatar != null ? (GenericNonPaymentRenderData.Avatar) GenericNonPaymentRenderData.Avatar.ADAPTER.redact(avatar) : null;
        GenericNonPaymentRenderData.Header header = genericNonPaymentRenderData.header;
        GenericNonPaymentRenderData.Header header2 = header != null ? (GenericNonPaymentRenderData.Header) GenericNonPaymentRenderData.Header.ADAPTER.redact(header) : null;
        GenericNonPaymentRenderData.InlineButton inlineButton = genericNonPaymentRenderData.inline_button;
        GenericNonPaymentRenderData.InlineButton inlineButton2 = inlineButton != null ? (GenericNonPaymentRenderData.InlineButton) GenericNonPaymentRenderData.InlineButton.ADAPTER.redact(inlineButton) : null;
        GenericNonPaymentRenderData.Button button = genericNonPaymentRenderData.primary_button;
        GenericNonPaymentRenderData.Button button2 = button != null ? (GenericNonPaymentRenderData.Button) GenericNonPaymentRenderData.Button.ADAPTER.redact(button) : null;
        GenericNonPaymentRenderData.Button button3 = genericNonPaymentRenderData.secondary_button;
        GenericNonPaymentRenderData.Button button4 = button3 != null ? (GenericNonPaymentRenderData.Button) GenericNonPaymentRenderData.Button.ADAPTER.redact(button3) : null;
        GenericNonPaymentRenderData.MoreInfoSheet moreInfoSheet = genericNonPaymentRenderData.more_info_sheet;
        GenericNonPaymentRenderData.MoreInfoSheet moreInfoSheet2 = moreInfoSheet != null ? (GenericNonPaymentRenderData.MoreInfoSheet) GenericNonPaymentRenderData.MoreInfoSheet.ADAPTER.redact(moreInfoSheet) : null;
        GenericNonPaymentRenderData.ThreadedView threadedView = genericNonPaymentRenderData.threaded_view;
        GenericNonPaymentRenderData.ThreadedView threadedView2 = threadedView != null ? (GenericNonPaymentRenderData.ThreadedView) GenericNonPaymentRenderData.ThreadedView.ADAPTER.redact(threadedView) : null;
        GenericNonPaymentRenderData.TertiaryLabelSuffix tertiaryLabelSuffix = genericNonPaymentRenderData.tertiary_label_suffix;
        GenericNonPaymentRenderData.TertiaryLabelSuffix tertiaryLabelSuffix2 = tertiaryLabelSuffix != null ? (GenericNonPaymentRenderData.TertiaryLabelSuffix) GenericNonPaymentRenderData.TertiaryLabelSuffix.ADAPTER.redact(tertiaryLabelSuffix) : null;
        GenericNonPaymentRenderData.Avatar avatar3 = genericNonPaymentRenderData.second_avatar;
        GenericNonPaymentRenderData.Avatar avatar4 = avatar3 != null ? (GenericNonPaymentRenderData.Avatar) GenericNonPaymentRenderData.Avatar.ADAPTER.redact(avatar3) : null;
        ByteString byteString = ByteString.EMPTY;
        GenericNonPaymentRenderData.HelpCenterLinkType helpCenterLinkType = genericNonPaymentRenderData.help_center_link_type;
        String str = genericNonPaymentRenderData.url_to_open;
        byteString.getClass();
        return new GenericNonPaymentRenderData(title2, subtitle2, avatar2, header2, inlineButton2, button2, button4, moreInfoSheet2, threadedView2, helpCenterLinkType, str, tertiaryLabelSuffix2, avatar4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericNonPaymentRenderData genericNonPaymentRenderData = (GenericNonPaymentRenderData) obj;
        genericNonPaymentRenderData.getClass();
        GenericNonPaymentRenderData.Title.ADAPTER.encodeWithTag(protoWriter, 1, genericNonPaymentRenderData.title);
        GenericNonPaymentRenderData.Subtitle.ADAPTER.encodeWithTag(protoWriter, 2, genericNonPaymentRenderData.subtitle);
        ProtoAdapter protoAdapter = GenericNonPaymentRenderData.Avatar.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, genericNonPaymentRenderData.avatar);
        GenericNonPaymentRenderData.Header.ADAPTER.encodeWithTag(protoWriter, 4, genericNonPaymentRenderData.header);
        GenericNonPaymentRenderData.InlineButton.ADAPTER.encodeWithTag(protoWriter, 5, genericNonPaymentRenderData.inline_button);
        ProtoAdapter protoAdapter2 = GenericNonPaymentRenderData.Button.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, genericNonPaymentRenderData.primary_button);
        protoAdapter2.encodeWithTag(protoWriter, 7, genericNonPaymentRenderData.secondary_button);
        GenericNonPaymentRenderData.MoreInfoSheet.ADAPTER.encodeWithTag(protoWriter, 8, genericNonPaymentRenderData.more_info_sheet);
        GenericNonPaymentRenderData.ThreadedView.ADAPTER.encodeWithTag(protoWriter, 9, genericNonPaymentRenderData.threaded_view);
        GenericNonPaymentRenderData.HelpCenterLinkType.ADAPTER.encodeWithTag(protoWriter, 10, genericNonPaymentRenderData.help_center_link_type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, genericNonPaymentRenderData.url_to_open);
        GenericNonPaymentRenderData.TertiaryLabelSuffix.ADAPTER.encodeWithTag(protoWriter, 12, genericNonPaymentRenderData.tertiary_label_suffix);
        protoAdapter.encodeWithTag(protoWriter, 13, genericNonPaymentRenderData.second_avatar);
        protoWriter.writeBytes(genericNonPaymentRenderData.unknownFields());
    }
}
