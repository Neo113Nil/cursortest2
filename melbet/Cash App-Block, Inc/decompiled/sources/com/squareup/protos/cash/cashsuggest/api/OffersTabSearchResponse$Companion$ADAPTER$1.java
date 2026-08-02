package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes.dex */
public final class OffersTabSearchResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OffersTabSearchResponse(m, (String) obj, (FilterGroupSection) obj2, arrayList, (Long) obj3, (AnalyticsEvent) obj4, arrayList2, arrayList3, (AnalyticsEvent) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    m.add(SearchSection.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj2 = TransactorKt.decodeMessageOrMerge(FilterGroupSection.ADAPTER, protoReader, obj2);
                    break;
                case 4:
                    arrayList.add(OfferSheetPreload.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj4);
                    break;
                case 7:
                    arrayList3.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 8:
                    obj5 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj5);
                    break;
                case 9:
                    arrayList2.add(EngagedItemToken.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OffersTabSearchResponse offersTabSearchResponse = (OffersTabSearchResponse) obj;
        reverseProtoWriter.getClass();
        offersTabSearchResponse.getClass();
        reverseProtoWriter.writeBytes(offersTabSearchResponse.unknownFields());
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, offersTabSearchResponse.analytics_view_query_event);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 7, offersTabSearchResponse.invalid_recently_viewed_tokens);
        EngagedItemToken.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, offersTabSearchResponse.invalid_recently_viewed_engaged_tokens);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, offersTabSearchResponse.analytics_view_event);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 5, offersTabSearchResponse.expire_at_ms);
        OfferSheetPreload.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, offersTabSearchResponse.sheets_preload);
        FilterGroupSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, offersTabSearchResponse.filter_group_sections);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, offersTabSearchResponse.pagination_token);
        SearchSection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, offersTabSearchResponse.sections);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OffersTabSearchResponse offersTabSearchResponse = (OffersTabSearchResponse) obj;
        offersTabSearchResponse.getClass();
        int encodedSizeWithTag = SearchSection.ADAPTER.asRepeated().encodedSizeWithTag(1, offersTabSearchResponse.sections) + offersTabSearchResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = ProtoAdapter.INT64.encodedSizeWithTag(5, offersTabSearchResponse.expire_at_ms) + OfferSheetPreload.ADAPTER.asRepeated().encodedSizeWithTag(4, offersTabSearchResponse.sheets_preload) + FilterGroupSection.ADAPTER.encodedSizeWithTag(3, offersTabSearchResponse.filter_group_sections) + protoAdapter.encodedSizeWithTag(2, offersTabSearchResponse.pagination_token) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = AnalyticsEvent.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(8, offersTabSearchResponse.analytics_view_query_event) + protoAdapter.asRepeated().encodedSizeWithTag(7, offersTabSearchResponse.invalid_recently_viewed_tokens) + EngagedItemToken.ADAPTER.asRepeated().encodedSizeWithTag(9, offersTabSearchResponse.invalid_recently_viewed_engaged_tokens) + protoAdapter2.encodedSizeWithTag(6, offersTabSearchResponse.analytics_view_event) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OffersTabSearchResponse offersTabSearchResponse = (OffersTabSearchResponse) obj;
        offersTabSearchResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(offersTabSearchResponse.sections, SearchSection.ADAPTER);
        FilterGroupSection filterGroupSection = offersTabSearchResponse.filter_group_sections;
        FilterGroupSection filterGroupSection2 = filterGroupSection != null ? (FilterGroupSection) FilterGroupSection.ADAPTER.redact(filterGroupSection) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(offersTabSearchResponse.sheets_preload, OfferSheetPreload.ADAPTER);
        AnalyticsEvent analyticsEvent = offersTabSearchResponse.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(offersTabSearchResponse.invalid_recently_viewed_engaged_tokens, EngagedItemToken.ADAPTER);
        AnalyticsEvent analyticsEvent3 = offersTabSearchResponse.analytics_view_query_event;
        AnalyticsEvent analyticsEvent4 = analyticsEvent3 != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = offersTabSearchResponse.pagination_token;
        Long l = offersTabSearchResponse.expire_at_ms;
        List list = offersTabSearchResponse.invalid_recently_viewed_tokens;
        list.getClass();
        byteString.getClass();
        return new OffersTabSearchResponse(m1169redactElements, str, filterGroupSection2, m1169redactElements2, l, analyticsEvent2, m1169redactElements3, list, analyticsEvent4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OffersTabSearchResponse offersTabSearchResponse = (OffersTabSearchResponse) obj;
        offersTabSearchResponse.getClass();
        SearchSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, offersTabSearchResponse.sections);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, offersTabSearchResponse.pagination_token);
        FilterGroupSection.ADAPTER.encodeWithTag(protoWriter, 3, offersTabSearchResponse.filter_group_sections);
        OfferSheetPreload.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, offersTabSearchResponse.sheets_preload);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, offersTabSearchResponse.expire_at_ms);
        ProtoAdapter protoAdapter2 = AnalyticsEvent.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, offersTabSearchResponse.analytics_view_event);
        EngagedItemToken.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, offersTabSearchResponse.invalid_recently_viewed_engaged_tokens);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 7, offersTabSearchResponse.invalid_recently_viewed_tokens);
        protoAdapter2.encodeWithTag(protoWriter, 8, offersTabSearchResponse.analytics_view_query_event);
        protoWriter.writeBytes(offersTabSearchResponse.unknownFields());
    }
}
