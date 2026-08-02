package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzld;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SearchSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzld searchSection$Content$MessageSection;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        zzld zzldVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchSection((AnalyticsEvent) obj, (SectionHeader) obj2, (String) obj3, zzldVar, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj);
                    continue;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(SectionHeader.ADAPTER, protoReader, obj2);
                    continue;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
                case 5:
                    searchSection$Content$MessageSection = new SearchSection$Content$MessageSection((ZeroResultsMessageSection) ZeroResultsMessageSection.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    searchSection$Content$MessageSection = new SearchSection$Content$RowSection((RowSection) RowSection.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    searchSection$Content$MessageSection = new SearchSection$Content$RecentlyViewedSection((RecentlyViewedSection) RecentlyViewedSection.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 9:
                    searchSection$Content$MessageSection = new SearchSection$Content$AvartarCarouselSection((AvatarCarouselSection) AvatarCarouselSection.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    searchSection$Content$MessageSection = new SearchSection$Content$ImageTextSection((ImageTextSection) ImageTextSection.ADAPTER.decode(protoReader));
                    break;
                case 11:
                    searchSection$Content$MessageSection = new SearchSection$Content$TileSection((CategoryTileSection) CategoryTileSection.ADAPTER.decode(protoReader));
                    break;
                case 12:
                    searchSection$Content$MessageSection = new SearchSection$Content$UpsellCard((UpsellCardSection) UpsellCardSection.ADAPTER.decode(protoReader));
                    break;
            }
            zzldVar = searchSection$Content$MessageSection;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchSection searchSection = (SearchSection) obj;
        reverseProtoWriter.getClass();
        searchSection.getClass();
        reverseProtoWriter.writeBytes(searchSection.unknownFields());
        zzld zzldVar = searchSection.content;
        if (zzldVar instanceof SearchSection$Content$MessageSection) {
            ZeroResultsMessageSection.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((SearchSection$Content$MessageSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$RowSection) {
            RowSection.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((SearchSection$Content$RowSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$RecentlyViewedSection) {
            RecentlyViewedSection.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((SearchSection$Content$RecentlyViewedSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$AvartarCarouselSection) {
            AvatarCarouselSection.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((SearchSection$Content$AvartarCarouselSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$ImageTextSection) {
            ImageTextSection.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((SearchSection$Content$ImageTextSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$TileSection) {
            CategoryTileSection.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((SearchSection$Content$TileSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$UpsellCard) {
            UpsellCardSection.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((SearchSection$Content$UpsellCard) zzldVar).value);
        } else if (zzldVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 8, searchSection.show_footer_divider);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, searchSection.section_id);
        SectionHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 2, searchSection.section_header);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, searchSection.analytics_view_event);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SearchSection searchSection = (SearchSection) obj;
        searchSection.getClass();
        int encodedSizeWithTag2 = ProtoAdapter.STRING.encodedSizeWithTag(3, searchSection.section_id) + SectionHeader.ADAPTER.encodedSizeWithTag(2, searchSection.section_header) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(1, searchSection.analytics_view_event) + searchSection.unknownFields().getSize$okio();
        zzld zzldVar = searchSection.content;
        if (zzldVar instanceof SearchSection$Content$MessageSection) {
            encodedSizeWithTag = ZeroResultsMessageSection.ADAPTER.encodedSizeWithTag(5, ((SearchSection$Content$MessageSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$RowSection) {
            encodedSizeWithTag = RowSection.ADAPTER.encodedSizeWithTag(6, ((SearchSection$Content$RowSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$RecentlyViewedSection) {
            encodedSizeWithTag = RecentlyViewedSection.ADAPTER.encodedSizeWithTag(7, ((SearchSection$Content$RecentlyViewedSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$AvartarCarouselSection) {
            encodedSizeWithTag = AvatarCarouselSection.ADAPTER.encodedSizeWithTag(9, ((SearchSection$Content$AvartarCarouselSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$ImageTextSection) {
            encodedSizeWithTag = ImageTextSection.ADAPTER.encodedSizeWithTag(10, ((SearchSection$Content$ImageTextSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$TileSection) {
            encodedSizeWithTag = CategoryTileSection.ADAPTER.encodedSizeWithTag(11, ((SearchSection$Content$TileSection) zzldVar).value);
        } else {
            if (!(zzldVar instanceof SearchSection$Content$UpsellCard)) {
                if (zzldVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.BOOL.encodedSizeWithTag(8, searchSection.show_footer_divider) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = UpsellCardSection.ADAPTER.encodedSizeWithTag(12, ((SearchSection$Content$UpsellCard) zzldVar).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return ProtoAdapter.BOOL.encodedSizeWithTag(8, searchSection.show_footer_divider) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchSection searchSection = (SearchSection) obj;
        searchSection.getClass();
        AnalyticsEvent analyticsEvent = searchSection.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        SectionHeader sectionHeader = searchSection.section_header;
        return SearchSection.copy$default(searchSection, analyticsEvent2, sectionHeader != null ? (SectionHeader) SectionHeader.ADAPTER.redact(sectionHeader) : null, null, ByteString.EMPTY, 28);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchSection searchSection = (SearchSection) obj;
        searchSection.getClass();
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 1, searchSection.analytics_view_event);
        SectionHeader.ADAPTER.encodeWithTag(protoWriter, 2, searchSection.section_header);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchSection.section_id);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, searchSection.show_footer_divider);
        zzld zzldVar = searchSection.content;
        if (zzldVar instanceof SearchSection$Content$MessageSection) {
            ZeroResultsMessageSection.ADAPTER.encodeWithTag(protoWriter, 5, ((SearchSection$Content$MessageSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$RowSection) {
            RowSection.ADAPTER.encodeWithTag(protoWriter, 6, ((SearchSection$Content$RowSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$RecentlyViewedSection) {
            RecentlyViewedSection.ADAPTER.encodeWithTag(protoWriter, 7, ((SearchSection$Content$RecentlyViewedSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$AvartarCarouselSection) {
            AvatarCarouselSection.ADAPTER.encodeWithTag(protoWriter, 9, ((SearchSection$Content$AvartarCarouselSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$ImageTextSection) {
            ImageTextSection.ADAPTER.encodeWithTag(protoWriter, 10, ((SearchSection$Content$ImageTextSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$TileSection) {
            CategoryTileSection.ADAPTER.encodeWithTag(protoWriter, 11, ((SearchSection$Content$TileSection) zzldVar).value);
        } else if (zzldVar instanceof SearchSection$Content$UpsellCard) {
            UpsellCardSection.ADAPTER.encodeWithTag(protoWriter, 12, ((SearchSection$Content$UpsellCard) zzldVar).value);
        } else if (zzldVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(searchSection.unknownFields());
    }
}
