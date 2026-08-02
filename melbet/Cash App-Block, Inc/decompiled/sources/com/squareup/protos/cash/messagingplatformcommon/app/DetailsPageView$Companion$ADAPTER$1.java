package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzjq;
import com.squareup.protos.cash.messagingplatformcommon.app.DetailsPageView;
import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageComponent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes7.dex */
public final class DetailsPageView$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        ?? r0;
        Object obj4;
        zzjq detailsPageView$PrimaryContent$EmptyContent;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        String str2 = null;
        Object obj13 = null;
        DetailsPageView.TextPlacement textPlacement = null;
        zzjq zzjqVar = null;
        String str3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DetailsPageView(str, (Text) obj6, (Text) obj7, (Text) obj8, textPlacement, (AppMessageAction) obj10, (AppMessageAction) obj11, (ShareSheet) obj12, str3, str2, (NavigationIcon) obj13, (AppMessageAction) obj5, (AppMessageAction) obj9, m, zzjqVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag != 15) {
                if (nextTag == 1001) {
                    obj4 = obj5;
                    detailsPageView$PrimaryContent$EmptyContent = new DetailsPageView$PrimaryContent$EmptyContent((EmptyPrimaryContent) EmptyPrimaryContent.ADAPTER.decode(protoReader));
                } else if (nextTag != 1002) {
                    switch (nextTag) {
                        case 1:
                            r0 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            obj6 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj6);
                            r0 = str;
                            break;
                        case 3:
                            obj7 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj7);
                            r0 = str;
                            break;
                        case 4:
                            obj8 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj8);
                            r0 = str;
                            break;
                        case 5:
                            try {
                                textPlacement = DetailsPageView.TextPlacement.ADAPTER.decode(protoReader);
                                r0 = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj5;
                                obj2 = obj9;
                                obj3 = obj10;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 6:
                            obj10 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj10);
                            r0 = str;
                            break;
                        case 7:
                            obj11 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj11);
                            r0 = str;
                            break;
                        case 8:
                            obj12 = TransactorKt.decodeMessageOrMerge(ShareSheet.ADAPTER, protoReader, obj12);
                            r0 = str;
                            break;
                        case 9:
                            str3 = ProtoAdapter.STRING.decode(protoReader);
                            r0 = str;
                            break;
                        case 10:
                            str2 = ProtoAdapter.STRING.decode(protoReader);
                            r0 = str;
                            break;
                        case 11:
                            obj13 = TransactorKt.decodeMessageOrMerge(NavigationIcon.ADAPTER, protoReader, obj13);
                            r0 = str;
                            break;
                        case 12:
                            obj5 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj5);
                            r0 = str;
                            break;
                        case 13:
                            obj9 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj9);
                            r0 = str;
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            obj = obj5;
                            obj2 = obj9;
                            obj3 = obj10;
                            break;
                    }
                    str = r0;
                } else {
                    obj4 = obj5;
                    detailsPageView$PrimaryContent$EmptyContent = new DetailsPageView$PrimaryContent$HeroImage((HeroImage) HeroImage.ADAPTER.decode(protoReader));
                }
                zzjqVar = detailsPageView$PrimaryContent$EmptyContent;
                obj5 = obj4;
                r0 = str;
                str = r0;
            } else {
                obj = obj5;
                obj2 = obj9;
                obj3 = obj10;
                m.add(DetailsPageComponent.ADAPTER.decode(protoReader));
            }
            r0 = str;
            obj5 = obj;
            obj9 = obj2;
            obj10 = obj3;
            str = r0;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DetailsPageView detailsPageView = (DetailsPageView) obj;
        reverseProtoWriter.getClass();
        detailsPageView.getClass();
        reverseProtoWriter.writeBytes(detailsPageView.unknownFields());
        zzjq zzjqVar = detailsPageView.primary_content;
        if (zzjqVar instanceof DetailsPageView$PrimaryContent$EmptyContent) {
            EmptyPrimaryContent.ADAPTER.encodeWithTag(reverseProtoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, ((DetailsPageView$PrimaryContent$EmptyContent) zzjqVar).value);
        } else if (zzjqVar instanceof DetailsPageView$PrimaryContent$HeroImage) {
            HeroImage.ADAPTER.encodeWithTag(reverseProtoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, ((DetailsPageView$PrimaryContent$HeroImage) zzjqVar).value);
        } else if (zzjqVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        DetailsPageComponent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 15, detailsPageView.details_page_components);
        ProtoAdapter protoAdapter = AppMessageAction.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, detailsPageView.secondary_button_footer);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, detailsPageView.primary_button_footer);
        NavigationIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 11, detailsPageView.navigation_icon);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, detailsPageView.token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, detailsPageView.header_bar_title);
        ShareSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 8, detailsPageView.share_sheet);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, detailsPageView.secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, detailsPageView.primary_button);
        DetailsPageView.TextPlacement.ADAPTER.encodeWithTag(reverseProtoWriter, 5, detailsPageView.text_placement);
        ProtoAdapter protoAdapter3 = Text.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, detailsPageView.subheadline);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, detailsPageView.headline);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, detailsPageView.eyebrow);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, detailsPageView.treehouse_path);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DetailsPageView detailsPageView = (DetailsPageView) obj;
        detailsPageView.getClass();
        int size$okio = detailsPageView.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, detailsPageView.treehouse_path) + size$okio;
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        int encodedSizeWithTag2 = DetailsPageView.TextPlacement.ADAPTER.encodedSizeWithTag(5, detailsPageView.text_placement) + protoAdapter2.encodedSizeWithTag(4, detailsPageView.subheadline) + protoAdapter2.encodedSizeWithTag(3, detailsPageView.headline) + protoAdapter2.encodedSizeWithTag(2, detailsPageView.eyebrow) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = AppMessageAction.ADAPTER;
        int encodedSizeWithTag3 = DetailsPageComponent.ADAPTER.asRepeated().encodedSizeWithTag(15, detailsPageView.details_page_components) + protoAdapter3.encodedSizeWithTag(13, detailsPageView.secondary_button_footer) + protoAdapter3.encodedSizeWithTag(12, detailsPageView.primary_button_footer) + NavigationIcon.ADAPTER.encodedSizeWithTag(11, detailsPageView.navigation_icon) + protoAdapter.encodedSizeWithTag(10, detailsPageView.token) + protoAdapter.encodedSizeWithTag(9, detailsPageView.header_bar_title) + ShareSheet.ADAPTER.encodedSizeWithTag(8, detailsPageView.share_sheet) + protoAdapter3.encodedSizeWithTag(7, detailsPageView.secondary_button) + protoAdapter3.encodedSizeWithTag(6, detailsPageView.primary_button) + encodedSizeWithTag2;
        zzjq zzjqVar = detailsPageView.primary_content;
        if (zzjqVar instanceof DetailsPageView$PrimaryContent$EmptyContent) {
            return EmptyPrimaryContent.ADAPTER.encodedSizeWithTag(IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, ((DetailsPageView$PrimaryContent$EmptyContent) zzjqVar).value) + encodedSizeWithTag3;
        }
        if (zzjqVar instanceof DetailsPageView$PrimaryContent$HeroImage) {
            return HeroImage.ADAPTER.encodedSizeWithTag(IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, ((DetailsPageView$PrimaryContent$HeroImage) zzjqVar).value) + encodedSizeWithTag3;
        }
        if (zzjqVar == null) {
            return encodedSizeWithTag3;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DetailsPageView detailsPageView = (DetailsPageView) obj;
        detailsPageView.getClass();
        Text text = detailsPageView.eyebrow;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = detailsPageView.headline;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        Text text5 = detailsPageView.subheadline;
        Text text6 = text5 != null ? (Text) Text.ADAPTER.redact(text5) : null;
        AppMessageAction appMessageAction = detailsPageView.primary_button;
        AppMessageAction appMessageAction2 = appMessageAction != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction) : null;
        AppMessageAction appMessageAction3 = detailsPageView.secondary_button;
        AppMessageAction appMessageAction4 = appMessageAction3 != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction3) : null;
        ShareSheet shareSheet = detailsPageView.share_sheet;
        ShareSheet shareSheet2 = shareSheet != null ? (ShareSheet) ShareSheet.ADAPTER.redact(shareSheet) : null;
        NavigationIcon navigationIcon = detailsPageView.navigation_icon;
        NavigationIcon navigationIcon2 = navigationIcon != null ? (NavigationIcon) NavigationIcon.ADAPTER.redact(navigationIcon) : null;
        AppMessageAction appMessageAction5 = detailsPageView.primary_button_footer;
        AppMessageAction appMessageAction6 = appMessageAction5 != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction5) : null;
        AppMessageAction appMessageAction7 = detailsPageView.secondary_button_footer;
        AppMessageAction appMessageAction8 = appMessageAction7 != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction7) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(detailsPageView.details_page_components, DetailsPageComponent.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = detailsPageView.treehouse_path;
        DetailsPageView.TextPlacement textPlacement = detailsPageView.text_placement;
        String str2 = detailsPageView.header_bar_title;
        String str3 = detailsPageView.token;
        zzjq zzjqVar = detailsPageView.primary_content;
        byteString.getClass();
        return new DetailsPageView(str, text2, text4, text6, textPlacement, appMessageAction2, appMessageAction4, shareSheet2, str2, str3, navigationIcon2, appMessageAction6, appMessageAction8, m1169redactElements, zzjqVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DetailsPageView detailsPageView = (DetailsPageView) obj;
        detailsPageView.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, detailsPageView.treehouse_path);
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, detailsPageView.eyebrow);
        protoAdapter2.encodeWithTag(protoWriter, 3, detailsPageView.headline);
        protoAdapter2.encodeWithTag(protoWriter, 4, detailsPageView.subheadline);
        DetailsPageView.TextPlacement.ADAPTER.encodeWithTag(protoWriter, 5, detailsPageView.text_placement);
        ProtoAdapter protoAdapter3 = AppMessageAction.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 6, detailsPageView.primary_button);
        protoAdapter3.encodeWithTag(protoWriter, 7, detailsPageView.secondary_button);
        ShareSheet.ADAPTER.encodeWithTag(protoWriter, 8, detailsPageView.share_sheet);
        protoAdapter.encodeWithTag(protoWriter, 9, detailsPageView.header_bar_title);
        protoAdapter.encodeWithTag(protoWriter, 10, detailsPageView.token);
        NavigationIcon.ADAPTER.encodeWithTag(protoWriter, 11, detailsPageView.navigation_icon);
        protoAdapter3.encodeWithTag(protoWriter, 12, detailsPageView.primary_button_footer);
        protoAdapter3.encodeWithTag(protoWriter, 13, detailsPageView.secondary_button_footer);
        DetailsPageComponent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 15, detailsPageView.details_page_components);
        zzjq zzjqVar = detailsPageView.primary_content;
        if (zzjqVar instanceof DetailsPageView$PrimaryContent$EmptyContent) {
            EmptyPrimaryContent.ADAPTER.encodeWithTag(protoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, ((DetailsPageView$PrimaryContent$EmptyContent) zzjqVar).value);
        } else if (zzjqVar instanceof DetailsPageView$PrimaryContent$HeroImage) {
            HeroImage.ADAPTER.encodeWithTag(protoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, ((DetailsPageView$PrimaryContent$HeroImage) zzjqVar).value);
        } else if (zzjqVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(detailsPageView.unknownFields());
    }
}
