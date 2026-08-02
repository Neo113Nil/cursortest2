package com.squareup.protos.cash.local.client.app.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhh;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MarketScreenContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzhh zzhhVar = null;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MarketScreenContent(zzhhVar, (String) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    zzhhVar = new MarketScreenContent$ContentType$Masthead((MarketScreenMasthead) MarketScreenMasthead.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    zzhhVar = new MarketScreenContent$ContentType$SectionHeader((MarketScreenSectionHeader) MarketScreenSectionHeader.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    zzhhVar = new MarketScreenContent$ContentType$LargeCell((MarketScreenLargeCell) MarketScreenLargeCell.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    zzhhVar = new MarketScreenContent$ContentType$RowCell((MarketScreenRowCell) MarketScreenRowCell.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    zzhhVar = new MarketScreenContent$ContentType$InformationalContent((MarketScreenInformationalContent) MarketScreenInformationalContent.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MarketScreenContent marketScreenContent = (MarketScreenContent) obj;
        reverseProtoWriter.getClass();
        marketScreenContent.getClass();
        reverseProtoWriter.writeBytes(marketScreenContent.unknownFields());
        zzhh zzhhVar = marketScreenContent.content_type;
        if (zzhhVar instanceof MarketScreenContent$ContentType$Masthead) {
            MarketScreenMasthead.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((MarketScreenContent$ContentType$Masthead) zzhhVar).value);
        } else if (zzhhVar instanceof MarketScreenContent$ContentType$SectionHeader) {
            MarketScreenSectionHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((MarketScreenContent$ContentType$SectionHeader) zzhhVar).value);
        } else if (zzhhVar instanceof MarketScreenContent$ContentType$LargeCell) {
            MarketScreenLargeCell.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((MarketScreenContent$ContentType$LargeCell) zzhhVar).value);
        } else if (zzhhVar instanceof MarketScreenContent$ContentType$RowCell) {
            MarketScreenRowCell.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((MarketScreenContent$ContentType$RowCell) zzhhVar).value);
        } else if (zzhhVar instanceof MarketScreenContent$ContentType$InformationalContent) {
            MarketScreenInformationalContent.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((MarketScreenContent$ContentType$InformationalContent) zzhhVar).value);
        } else if (zzhhVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 7, marketScreenContent.section_index);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, marketScreenContent.section_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        MarketScreenContent marketScreenContent = (MarketScreenContent) obj;
        marketScreenContent.getClass();
        int size$okio = marketScreenContent.unknownFields().getSize$okio();
        zzhh zzhhVar = marketScreenContent.content_type;
        if (zzhhVar instanceof MarketScreenContent$ContentType$Masthead) {
            encodedSizeWithTag = MarketScreenMasthead.ADAPTER.encodedSizeWithTag(1, ((MarketScreenContent$ContentType$Masthead) zzhhVar).value);
        } else if (zzhhVar instanceof MarketScreenContent$ContentType$SectionHeader) {
            encodedSizeWithTag = MarketScreenSectionHeader.ADAPTER.encodedSizeWithTag(2, ((MarketScreenContent$ContentType$SectionHeader) zzhhVar).value);
        } else if (zzhhVar instanceof MarketScreenContent$ContentType$LargeCell) {
            encodedSizeWithTag = MarketScreenLargeCell.ADAPTER.encodedSizeWithTag(3, ((MarketScreenContent$ContentType$LargeCell) zzhhVar).value);
        } else if (zzhhVar instanceof MarketScreenContent$ContentType$RowCell) {
            encodedSizeWithTag = MarketScreenRowCell.ADAPTER.encodedSizeWithTag(4, ((MarketScreenContent$ContentType$RowCell) zzhhVar).value);
        } else {
            if (!(zzhhVar instanceof MarketScreenContent$ContentType$InformationalContent)) {
                if (zzhhVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.INT64.encodedSizeWithTag(7, marketScreenContent.section_index) + ProtoAdapter.STRING.encodedSizeWithTag(6, marketScreenContent.section_id) + size$okio;
            }
            encodedSizeWithTag = MarketScreenInformationalContent.ADAPTER.encodedSizeWithTag(5, ((MarketScreenContent$ContentType$InformationalContent) zzhhVar).value);
        }
        size$okio += encodedSizeWithTag;
        return ProtoAdapter.INT64.encodedSizeWithTag(7, marketScreenContent.section_index) + ProtoAdapter.STRING.encodedSizeWithTag(6, marketScreenContent.section_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketScreenContent marketScreenContent = (MarketScreenContent) obj;
        marketScreenContent.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzhh zzhhVar = marketScreenContent.content_type;
        String str = marketScreenContent.section_id;
        Long l = marketScreenContent.section_index;
        byteString.getClass();
        return new MarketScreenContent(zzhhVar, str, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketScreenContent marketScreenContent = (MarketScreenContent) obj;
        marketScreenContent.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, marketScreenContent.section_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, marketScreenContent.section_index);
        zzhh zzhhVar = marketScreenContent.content_type;
        if (zzhhVar instanceof MarketScreenContent$ContentType$Masthead) {
            MarketScreenMasthead.ADAPTER.encodeWithTag(protoWriter, 1, ((MarketScreenContent$ContentType$Masthead) zzhhVar).value);
        } else if (zzhhVar instanceof MarketScreenContent$ContentType$SectionHeader) {
            MarketScreenSectionHeader.ADAPTER.encodeWithTag(protoWriter, 2, ((MarketScreenContent$ContentType$SectionHeader) zzhhVar).value);
        } else if (zzhhVar instanceof MarketScreenContent$ContentType$LargeCell) {
            MarketScreenLargeCell.ADAPTER.encodeWithTag(protoWriter, 3, ((MarketScreenContent$ContentType$LargeCell) zzhhVar).value);
        } else if (zzhhVar instanceof MarketScreenContent$ContentType$RowCell) {
            MarketScreenRowCell.ADAPTER.encodeWithTag(protoWriter, 4, ((MarketScreenContent$ContentType$RowCell) zzhhVar).value);
        } else if (zzhhVar instanceof MarketScreenContent$ContentType$InformationalContent) {
            MarketScreenInformationalContent.ADAPTER.encodeWithTag(protoWriter, 5, ((MarketScreenContent$ContentType$InformationalContent) zzhhVar).value);
        } else if (zzhhVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(marketScreenContent.unknownFields());
    }
}
