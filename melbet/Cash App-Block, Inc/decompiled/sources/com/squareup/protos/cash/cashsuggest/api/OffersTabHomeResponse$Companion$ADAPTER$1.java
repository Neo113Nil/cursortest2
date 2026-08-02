package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.HomeSection;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class OffersTabHomeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OffersTabHomeResponse((String) obj, (String) obj2, (String) obj3, m, (StyledText) obj4, (Long) obj5, arrayList, arrayList2, (AnalyticsEvent) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    m.add(HomeSection.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 6:
                    arrayList.add(OffersTabCollectionPreload.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    arrayList2.add(OfferSheetPreload.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    obj6 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj6);
                    break;
                case 9:
                    obj4 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj4);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OffersTabHomeResponse offersTabHomeResponse = (OffersTabHomeResponse) obj;
        reverseProtoWriter.getClass();
        offersTabHomeResponse.getClass();
        reverseProtoWriter.writeBytes(offersTabHomeResponse.unknownFields());
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 8, offersTabHomeResponse.analytics_view_event);
        OfferSheetPreload.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, offersTabHomeResponse.sheets_preload);
        OffersTabCollectionPreload.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, offersTabHomeResponse.collections_preload);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 5, offersTabHomeResponse.expire_at_ms);
        StyledText.ADAPTER.encodeWithTag(reverseProtoWriter, 9, offersTabHomeResponse.footer_markdown_text);
        HomeSection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, offersTabHomeResponse.sections);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, offersTabHomeResponse.search_bar_placeholder_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, offersTabHomeResponse.screen_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, offersTabHomeResponse.screen_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OffersTabHomeResponse offersTabHomeResponse = (OffersTabHomeResponse) obj;
        offersTabHomeResponse.getClass();
        int size$okio = offersTabHomeResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return AnalyticsEvent.ADAPTER.encodedSizeWithTag(8, offersTabHomeResponse.analytics_view_event) + OfferSheetPreload.ADAPTER.asRepeated().encodedSizeWithTag(7, offersTabHomeResponse.sheets_preload) + OffersTabCollectionPreload.ADAPTER.asRepeated().encodedSizeWithTag(6, offersTabHomeResponse.collections_preload) + ProtoAdapter.INT64.encodedSizeWithTag(5, offersTabHomeResponse.expire_at_ms) + StyledText.ADAPTER.encodedSizeWithTag(9, offersTabHomeResponse.footer_markdown_text) + HomeSection.ADAPTER.asRepeated().encodedSizeWithTag(4, offersTabHomeResponse.sections) + protoAdapter.encodedSizeWithTag(3, offersTabHomeResponse.search_bar_placeholder_text) + protoAdapter.encodedSizeWithTag(2, offersTabHomeResponse.screen_subtitle) + protoAdapter.encodedSizeWithTag(1, offersTabHomeResponse.screen_title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OffersTabHomeResponse offersTabHomeResponse = (OffersTabHomeResponse) obj;
        offersTabHomeResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(offersTabHomeResponse.sections, HomeSection.ADAPTER);
        StyledText styledText = offersTabHomeResponse.footer_markdown_text;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(offersTabHomeResponse.collections_preload, OffersTabCollectionPreload.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(offersTabHomeResponse.sheets_preload, OfferSheetPreload.ADAPTER);
        AnalyticsEvent analyticsEvent = offersTabHomeResponse.analytics_view_event;
        return OffersTabHomeResponse.copy$default(offersTabHomeResponse, m1169redactElements, styledText2, m1169redactElements2, m1169redactElements3, analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null, ByteString.EMPTY, 39);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OffersTabHomeResponse offersTabHomeResponse = (OffersTabHomeResponse) obj;
        offersTabHomeResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, offersTabHomeResponse.screen_title);
        protoAdapter.encodeWithTag(protoWriter, 2, offersTabHomeResponse.screen_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, offersTabHomeResponse.search_bar_placeholder_text);
        HomeSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, offersTabHomeResponse.sections);
        StyledText.ADAPTER.encodeWithTag(protoWriter, 9, offersTabHomeResponse.footer_markdown_text);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, offersTabHomeResponse.expire_at_ms);
        OffersTabCollectionPreload.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, offersTabHomeResponse.collections_preload);
        OfferSheetPreload.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, offersTabHomeResponse.sheets_preload);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 8, offersTabHomeResponse.analytics_view_event);
        protoWriter.writeBytes(offersTabHomeResponse.unknownFields());
    }
}
