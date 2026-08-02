package com.squareup.protos.cash.discover.api.app.v1.model;

import androidx.room.TransactorKt;
import array.SortOrder;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public final class DetailsPage$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        SortOrder detailsPage$PrimaryContent$EmptyContent;
        ?? r0;
        Object obj2;
        Object obj3;
        Object obj4;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        String str2 = null;
        String str3 = null;
        Object obj12 = null;
        Object obj13 = null;
        DetailsPage.TextPlacement textPlacement = null;
        SortOrder sortOrder = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DetailsPage(str, (Text) obj6, (Text) obj7, (Text) obj8, textPlacement, (Button) obj9, (Button) obj10, (ShareSheet) obj11, str2, str3, (NavigationIcon) obj12, (Button) obj13, (Button) obj5, sortOrder, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1001) {
                obj = obj5;
                detailsPage$PrimaryContent$EmptyContent = new DetailsPage$PrimaryContent$EmptyContent((EmptyPrimaryContent) EmptyPrimaryContent.ADAPTER.decode(protoReader));
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
                            textPlacement = DetailsPage.TextPlacement.ADAPTER.decode(protoReader);
                            r0 = str;
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            obj2 = obj5;
                            obj3 = obj9;
                            obj4 = obj10;
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 6:
                        obj9 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj9);
                        r0 = str;
                        break;
                    case 7:
                        obj10 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj10);
                        r0 = str;
                        break;
                    case 8:
                        obj11 = TransactorKt.decodeMessageOrMerge(ShareSheet.ADAPTER, protoReader, obj11);
                        r0 = str;
                        break;
                    case 9:
                        str2 = ProtoAdapter.STRING.decode(protoReader);
                        r0 = str;
                        break;
                    case 10:
                        str3 = ProtoAdapter.STRING.decode(protoReader);
                        r0 = str;
                        break;
                    case 11:
                        obj12 = TransactorKt.decodeMessageOrMerge(NavigationIcon.ADAPTER, protoReader, obj12);
                        r0 = str;
                        break;
                    case 12:
                        obj13 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj13);
                        r0 = str;
                        break;
                    case 13:
                        obj5 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj5);
                        r0 = str;
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        obj2 = obj5;
                        obj3 = obj9;
                        obj4 = obj10;
                        r0 = str;
                        obj5 = obj2;
                        obj10 = obj4;
                        obj9 = obj3;
                        break;
                }
                str = r0;
            } else {
                obj = obj5;
                detailsPage$PrimaryContent$EmptyContent = new DetailsPage$PrimaryContent$HeroImage((HeroImage) HeroImage.ADAPTER.decode(protoReader));
            }
            sortOrder = detailsPage$PrimaryContent$EmptyContent;
            obj5 = obj;
            r0 = str;
            str = r0;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DetailsPage detailsPage = (DetailsPage) obj;
        reverseProtoWriter.getClass();
        detailsPage.getClass();
        reverseProtoWriter.writeBytes(detailsPage.unknownFields());
        SortOrder sortOrder = detailsPage.primary_content;
        if (sortOrder instanceof DetailsPage$PrimaryContent$EmptyContent) {
            EmptyPrimaryContent.ADAPTER.encodeWithTag(reverseProtoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, ((DetailsPage$PrimaryContent$EmptyContent) sortOrder).getValue());
        } else if (sortOrder instanceof DetailsPage$PrimaryContent$HeroImage) {
            HeroImage.ADAPTER.encodeWithTag(reverseProtoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, ((DetailsPage$PrimaryContent$HeroImage) sortOrder).getValue());
        } else if (sortOrder != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, detailsPage.secondary_button_footer);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, detailsPage.primary_button_footer);
        NavigationIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 11, detailsPage.navigation_icon);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, detailsPage.token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, detailsPage.header_bar_title);
        ShareSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 8, detailsPage.share_sheet);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, detailsPage.secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, detailsPage.primary_button);
        DetailsPage.TextPlacement.ADAPTER.encodeWithTag(reverseProtoWriter, 5, detailsPage.text_placement);
        ProtoAdapter protoAdapter3 = Text.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, detailsPage.subheadline);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, detailsPage.headline);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, detailsPage.eyebrow);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, detailsPage.treehouse_path);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        DetailsPage detailsPage = (DetailsPage) obj;
        detailsPage.getClass();
        int size$okio = detailsPage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(1, detailsPage.treehouse_path) + size$okio;
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        int encodedSizeWithTag3 = DetailsPage.TextPlacement.ADAPTER.encodedSizeWithTag(5, detailsPage.text_placement) + protoAdapter2.encodedSizeWithTag(4, detailsPage.subheadline) + protoAdapter2.encodedSizeWithTag(3, detailsPage.headline) + protoAdapter2.encodedSizeWithTag(2, detailsPage.eyebrow) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = Button.ADAPTER;
        int encodedSizeWithTag4 = protoAdapter3.encodedSizeWithTag(13, detailsPage.secondary_button_footer) + protoAdapter3.encodedSizeWithTag(12, detailsPage.primary_button_footer) + NavigationIcon.ADAPTER.encodedSizeWithTag(11, detailsPage.navigation_icon) + protoAdapter.encodedSizeWithTag(10, detailsPage.token) + protoAdapter.encodedSizeWithTag(9, detailsPage.header_bar_title) + ShareSheet.ADAPTER.encodedSizeWithTag(8, detailsPage.share_sheet) + protoAdapter3.encodedSizeWithTag(7, detailsPage.secondary_button) + protoAdapter3.encodedSizeWithTag(6, detailsPage.primary_button) + encodedSizeWithTag3;
        SortOrder sortOrder = detailsPage.primary_content;
        if (sortOrder instanceof DetailsPage$PrimaryContent$EmptyContent) {
            encodedSizeWithTag = EmptyPrimaryContent.ADAPTER.encodedSizeWithTag(IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, ((DetailsPage$PrimaryContent$EmptyContent) sortOrder).getValue());
        } else {
            if (!(sortOrder instanceof DetailsPage$PrimaryContent$HeroImage)) {
                if (sortOrder == null) {
                    return encodedSizeWithTag4;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = HeroImage.ADAPTER.encodedSizeWithTag(IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, ((DetailsPage$PrimaryContent$HeroImage) sortOrder).getValue());
        }
        return encodedSizeWithTag + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DetailsPage detailsPage = (DetailsPage) obj;
        detailsPage.getClass();
        Text text = detailsPage.eyebrow;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = detailsPage.headline;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        Text text5 = detailsPage.subheadline;
        Text text6 = text5 != null ? (Text) Text.ADAPTER.redact(text5) : null;
        Button button = detailsPage.primary_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Button button3 = detailsPage.secondary_button;
        Button button4 = button3 != null ? (Button) Button.ADAPTER.redact(button3) : null;
        ShareSheet shareSheet = detailsPage.share_sheet;
        ShareSheet shareSheet2 = shareSheet != null ? (ShareSheet) ShareSheet.ADAPTER.redact(shareSheet) : null;
        NavigationIcon navigationIcon = detailsPage.navigation_icon;
        NavigationIcon navigationIcon2 = navigationIcon != null ? (NavigationIcon) NavigationIcon.ADAPTER.redact(navigationIcon) : null;
        Button button5 = detailsPage.primary_button_footer;
        Button button6 = button5 != null ? (Button) Button.ADAPTER.redact(button5) : null;
        Button button7 = detailsPage.secondary_button_footer;
        Button button8 = button7 != null ? (Button) Button.ADAPTER.redact(button7) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = detailsPage.treehouse_path;
        DetailsPage.TextPlacement textPlacement = detailsPage.text_placement;
        String str2 = detailsPage.header_bar_title;
        String str3 = detailsPage.token;
        SortOrder sortOrder = detailsPage.primary_content;
        byteString.getClass();
        return new DetailsPage(str, text2, text4, text6, textPlacement, button2, button4, shareSheet2, str2, str3, navigationIcon2, button6, button8, sortOrder, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DetailsPage detailsPage = (DetailsPage) obj;
        detailsPage.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, detailsPage.treehouse_path);
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, detailsPage.eyebrow);
        protoAdapter2.encodeWithTag(protoWriter, 3, detailsPage.headline);
        protoAdapter2.encodeWithTag(protoWriter, 4, detailsPage.subheadline);
        DetailsPage.TextPlacement.ADAPTER.encodeWithTag(protoWriter, 5, detailsPage.text_placement);
        ProtoAdapter protoAdapter3 = Button.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 6, detailsPage.primary_button);
        protoAdapter3.encodeWithTag(protoWriter, 7, detailsPage.secondary_button);
        ShareSheet.ADAPTER.encodeWithTag(protoWriter, 8, detailsPage.share_sheet);
        protoAdapter.encodeWithTag(protoWriter, 9, detailsPage.header_bar_title);
        protoAdapter.encodeWithTag(protoWriter, 10, detailsPage.token);
        NavigationIcon.ADAPTER.encodeWithTag(protoWriter, 11, detailsPage.navigation_icon);
        protoAdapter3.encodeWithTag(protoWriter, 12, detailsPage.primary_button_footer);
        protoAdapter3.encodeWithTag(protoWriter, 13, detailsPage.secondary_button_footer);
        SortOrder sortOrder = detailsPage.primary_content;
        if (sortOrder instanceof DetailsPage$PrimaryContent$EmptyContent) {
            EmptyPrimaryContent.ADAPTER.encodeWithTag(protoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, ((DetailsPage$PrimaryContent$EmptyContent) sortOrder).getValue());
        } else if (sortOrder instanceof DetailsPage$PrimaryContent$HeroImage) {
            HeroImage.ADAPTER.encodeWithTag(protoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, ((DetailsPage$PrimaryContent$HeroImage) sortOrder).getValue());
        } else if (sortOrder != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(detailsPage.unknownFields());
    }
}
