package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.google.android.gms.internal.mlkit_vision_common.zzjz;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DetailsPageComponent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzjz zzjzVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DetailsPageComponent(zzjzVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    zzjzVar = new DetailsPageComponent$Component$Header((DetailsPageHeader) DetailsPageHeader.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    zzjzVar = new DetailsPageComponent$Component$Paragraph((DetailsPageParagraph) DetailsPageParagraph.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    zzjzVar = new DetailsPageComponent$Component$Footer((DetailsPageFooter) DetailsPageFooter.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    zzjzVar = new DetailsPageComponent$Component$OrderedList((DetailsPageOrderedList) DetailsPageOrderedList.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    zzjzVar = new DetailsPageComponent$Component$UnorderedList((DetailsPageUnorderedList) DetailsPageUnorderedList.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    zzjzVar = new DetailsPageComponent$Component$HorizontalDivider((DetailsPageHorizontalDivider) DetailsPageHorizontalDivider.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    zzjzVar = new DetailsPageComponent$Component$VerticalSpacer((DetailsPageVerticalSpacer) DetailsPageVerticalSpacer.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    zzjzVar = new DetailsPageComponent$Component$Image((DetailsPageImage) DetailsPageImage.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DetailsPageComponent detailsPageComponent = (DetailsPageComponent) obj;
        reverseProtoWriter.getClass();
        detailsPageComponent.getClass();
        reverseProtoWriter.writeBytes(detailsPageComponent.unknownFields());
        zzjz zzjzVar = detailsPageComponent.component;
        if (zzjzVar instanceof DetailsPageComponent$Component$Header) {
            DetailsPageHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((DetailsPageComponent$Component$Header) zzjzVar).value);
            return;
        }
        if (zzjzVar instanceof DetailsPageComponent$Component$Paragraph) {
            DetailsPageParagraph.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((DetailsPageComponent$Component$Paragraph) zzjzVar).value);
            return;
        }
        if (zzjzVar instanceof DetailsPageComponent$Component$Footer) {
            DetailsPageFooter.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((DetailsPageComponent$Component$Footer) zzjzVar).value);
            return;
        }
        if (zzjzVar instanceof DetailsPageComponent$Component$OrderedList) {
            DetailsPageOrderedList.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((DetailsPageComponent$Component$OrderedList) zzjzVar).value);
            return;
        }
        if (zzjzVar instanceof DetailsPageComponent$Component$UnorderedList) {
            DetailsPageUnorderedList.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((DetailsPageComponent$Component$UnorderedList) zzjzVar).value);
            return;
        }
        if (zzjzVar instanceof DetailsPageComponent$Component$HorizontalDivider) {
            DetailsPageHorizontalDivider.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((DetailsPageComponent$Component$HorizontalDivider) zzjzVar).value);
            return;
        }
        if (zzjzVar instanceof DetailsPageComponent$Component$VerticalSpacer) {
            DetailsPageVerticalSpacer.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((DetailsPageComponent$Component$VerticalSpacer) zzjzVar).value);
        } else if (zzjzVar instanceof DetailsPageComponent$Component$Image) {
            DetailsPageImage.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((DetailsPageComponent$Component$Image) zzjzVar).value);
        } else {
            if (zzjzVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        DetailsPageComponent detailsPageComponent = (DetailsPageComponent) obj;
        detailsPageComponent.getClass();
        int size$okio = detailsPageComponent.unknownFields().getSize$okio();
        zzjz zzjzVar = detailsPageComponent.component;
        if (zzjzVar instanceof DetailsPageComponent$Component$Header) {
            encodedSizeWithTag = DetailsPageHeader.ADAPTER.encodedSizeWithTag(1, ((DetailsPageComponent$Component$Header) zzjzVar).value);
        } else if (zzjzVar instanceof DetailsPageComponent$Component$Paragraph) {
            encodedSizeWithTag = DetailsPageParagraph.ADAPTER.encodedSizeWithTag(2, ((DetailsPageComponent$Component$Paragraph) zzjzVar).value);
        } else if (zzjzVar instanceof DetailsPageComponent$Component$Footer) {
            encodedSizeWithTag = DetailsPageFooter.ADAPTER.encodedSizeWithTag(3, ((DetailsPageComponent$Component$Footer) zzjzVar).value);
        } else if (zzjzVar instanceof DetailsPageComponent$Component$OrderedList) {
            encodedSizeWithTag = DetailsPageOrderedList.ADAPTER.encodedSizeWithTag(4, ((DetailsPageComponent$Component$OrderedList) zzjzVar).value);
        } else if (zzjzVar instanceof DetailsPageComponent$Component$UnorderedList) {
            encodedSizeWithTag = DetailsPageUnorderedList.ADAPTER.encodedSizeWithTag(5, ((DetailsPageComponent$Component$UnorderedList) zzjzVar).value);
        } else if (zzjzVar instanceof DetailsPageComponent$Component$HorizontalDivider) {
            encodedSizeWithTag = DetailsPageHorizontalDivider.ADAPTER.encodedSizeWithTag(6, ((DetailsPageComponent$Component$HorizontalDivider) zzjzVar).value);
        } else if (zzjzVar instanceof DetailsPageComponent$Component$VerticalSpacer) {
            encodedSizeWithTag = DetailsPageVerticalSpacer.ADAPTER.encodedSizeWithTag(7, ((DetailsPageComponent$Component$VerticalSpacer) zzjzVar).value);
        } else {
            if (!(zzjzVar instanceof DetailsPageComponent$Component$Image)) {
                if (zzjzVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = DetailsPageImage.ADAPTER.encodedSizeWithTag(8, ((DetailsPageComponent$Component$Image) zzjzVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DetailsPageComponent detailsPageComponent = (DetailsPageComponent) obj;
        detailsPageComponent.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzjz zzjzVar = detailsPageComponent.component;
        byteString.getClass();
        return new DetailsPageComponent(zzjzVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DetailsPageComponent detailsPageComponent = (DetailsPageComponent) obj;
        detailsPageComponent.getClass();
        zzjz zzjzVar = detailsPageComponent.component;
        if (zzjzVar instanceof DetailsPageComponent$Component$Header) {
            DetailsPageHeader.ADAPTER.encodeWithTag(protoWriter, 1, ((DetailsPageComponent$Component$Header) zzjzVar).value);
        } else if (zzjzVar instanceof DetailsPageComponent$Component$Paragraph) {
            DetailsPageParagraph.ADAPTER.encodeWithTag(protoWriter, 2, ((DetailsPageComponent$Component$Paragraph) zzjzVar).value);
        } else if (zzjzVar instanceof DetailsPageComponent$Component$Footer) {
            DetailsPageFooter.ADAPTER.encodeWithTag(protoWriter, 3, ((DetailsPageComponent$Component$Footer) zzjzVar).value);
        } else if (zzjzVar instanceof DetailsPageComponent$Component$OrderedList) {
            DetailsPageOrderedList.ADAPTER.encodeWithTag(protoWriter, 4, ((DetailsPageComponent$Component$OrderedList) zzjzVar).value);
        } else if (zzjzVar instanceof DetailsPageComponent$Component$UnorderedList) {
            DetailsPageUnorderedList.ADAPTER.encodeWithTag(protoWriter, 5, ((DetailsPageComponent$Component$UnorderedList) zzjzVar).value);
        } else if (zzjzVar instanceof DetailsPageComponent$Component$HorizontalDivider) {
            DetailsPageHorizontalDivider.ADAPTER.encodeWithTag(protoWriter, 6, ((DetailsPageComponent$Component$HorizontalDivider) zzjzVar).value);
        } else if (zzjzVar instanceof DetailsPageComponent$Component$VerticalSpacer) {
            DetailsPageVerticalSpacer.ADAPTER.encodeWithTag(protoWriter, 7, ((DetailsPageComponent$Component$VerticalSpacer) zzjzVar).value);
        } else if (zzjzVar instanceof DetailsPageComponent$Component$Image) {
            DetailsPageImage.ADAPTER.encodeWithTag(protoWriter, 8, ((DetailsPageComponent$Component$Image) zzjzVar).value);
        } else if (zzjzVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(detailsPageComponent.unknownFields());
    }
}
