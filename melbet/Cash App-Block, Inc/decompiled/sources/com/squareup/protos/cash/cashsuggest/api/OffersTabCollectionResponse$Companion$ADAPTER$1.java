package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionResponse;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.CollectionSection;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class OffersTabCollectionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OffersTabCollectionResponse((LocalizedString) obj, m, (Long) obj2, (AnalyticsEvent) obj3, (FormattedDetail) obj4, (String) obj5, (String) obj6, (OffersTabCollectionResponse.InStoreBoostMetadata) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    m.add(CollectionSection.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    obj7 = TransactorKt.decodeMessageOrMerge(OffersTabCollectionResponse.InStoreBoostMetadata.ADAPTER, protoReader, obj7);
                    break;
                case 6:
                    obj3 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj3);
                    break;
                case 7:
                    obj4 = TransactorKt.decodeMessageOrMerge(FormattedDetail.ADAPTER, protoReader, obj4);
                    break;
                case 8:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OffersTabCollectionResponse offersTabCollectionResponse = (OffersTabCollectionResponse) obj;
        reverseProtoWriter.getClass();
        offersTabCollectionResponse.getClass();
        reverseProtoWriter.writeBytes(offersTabCollectionResponse.unknownFields());
        OffersTabCollectionResponse.InStoreBoostMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 5, offersTabCollectionResponse.in_store_boost_metadata);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, offersTabCollectionResponse.screen_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, offersTabCollectionResponse.screen_title);
        FormattedDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 7, offersTabCollectionResponse.formatted_subtitle);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 6, offersTabCollectionResponse.analytics_view_event);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, offersTabCollectionResponse.expire_at_ms);
        CollectionSection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, offersTabCollectionResponse.sections);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 8, offersTabCollectionResponse.l_screen_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OffersTabCollectionResponse offersTabCollectionResponse = (OffersTabCollectionResponse) obj;
        offersTabCollectionResponse.getClass();
        int encodedSizeWithTag = FormattedDetail.ADAPTER.encodedSizeWithTag(7, offersTabCollectionResponse.formatted_subtitle) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(6, offersTabCollectionResponse.analytics_view_event) + ProtoAdapter.INT64.encodedSizeWithTag(4, offersTabCollectionResponse.expire_at_ms) + CollectionSection.ADAPTER.asRepeated().encodedSizeWithTag(3, offersTabCollectionResponse.sections) + LocalizedString.ADAPTER.encodedSizeWithTag(8, offersTabCollectionResponse.l_screen_title) + offersTabCollectionResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return OffersTabCollectionResponse.InStoreBoostMetadata.ADAPTER.encodedSizeWithTag(5, offersTabCollectionResponse.in_store_boost_metadata) + protoAdapter.encodedSizeWithTag(2, offersTabCollectionResponse.screen_subtitle) + protoAdapter.encodedSizeWithTag(1, offersTabCollectionResponse.screen_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OffersTabCollectionResponse offersTabCollectionResponse = (OffersTabCollectionResponse) obj;
        offersTabCollectionResponse.getClass();
        LocalizedString localizedString = offersTabCollectionResponse.l_screen_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(offersTabCollectionResponse.sections, CollectionSection.ADAPTER);
        AnalyticsEvent analyticsEvent = offersTabCollectionResponse.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        FormattedDetail formattedDetail = offersTabCollectionResponse.formatted_subtitle;
        FormattedDetail formattedDetail2 = formattedDetail != null ? (FormattedDetail) FormattedDetail.ADAPTER.redact(formattedDetail) : null;
        OffersTabCollectionResponse.InStoreBoostMetadata inStoreBoostMetadata = offersTabCollectionResponse.in_store_boost_metadata;
        OffersTabCollectionResponse.InStoreBoostMetadata inStoreBoostMetadata2 = inStoreBoostMetadata != null ? (OffersTabCollectionResponse.InStoreBoostMetadata) OffersTabCollectionResponse.InStoreBoostMetadata.ADAPTER.redact(inStoreBoostMetadata) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = offersTabCollectionResponse.expire_at_ms;
        String str = offersTabCollectionResponse.screen_title;
        String str2 = offersTabCollectionResponse.screen_subtitle;
        byteString.getClass();
        return new OffersTabCollectionResponse(localizedString2, m1169redactElements, l, analyticsEvent2, formattedDetail2, str, str2, inStoreBoostMetadata2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OffersTabCollectionResponse offersTabCollectionResponse = (OffersTabCollectionResponse) obj;
        offersTabCollectionResponse.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 8, offersTabCollectionResponse.l_screen_title);
        CollectionSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, offersTabCollectionResponse.sections);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, offersTabCollectionResponse.expire_at_ms);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 6, offersTabCollectionResponse.analytics_view_event);
        FormattedDetail.ADAPTER.encodeWithTag(protoWriter, 7, offersTabCollectionResponse.formatted_subtitle);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, offersTabCollectionResponse.screen_title);
        protoAdapter.encodeWithTag(protoWriter, 2, offersTabCollectionResponse.screen_subtitle);
        OffersTabCollectionResponse.InStoreBoostMetadata.ADAPTER.encodeWithTag(protoWriter, 5, offersTabCollectionResponse.in_store_boost_metadata);
        protoWriter.writeBytes(offersTabCollectionResponse.unknownFields());
    }
}
