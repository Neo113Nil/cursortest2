package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalBrand$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        ArrayList arrayList;
        Object obj3;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        LocalBrand$CashBackOffer$Percentage localBrand$CashBackOffer$Percentage = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        Object obj23 = null;
        Object obj24 = null;
        Object obj25 = null;
        Object obj26 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                Object obj27 = obj4;
                Object obj28 = obj5;
                Object obj29 = obj9;
                Object obj30 = obj26;
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                String str = (String) obj23;
                if (str != null) {
                    return new LocalBrand(str, (String) obj17, (LocalColor) obj30, (LocalColor) obj29, (LocalImage) obj10, localBrand$CashBackOffer$Percentage, (Long) obj18, (LocalLocationDetail) obj13, m, (String) obj19, (String) obj22, (LocalMiniCard) obj6, (LocalBrand.Banner) obj16, (LocalCashConfiguration) obj8, (LocalEstimatedCompletionDuration) obj11, (LocalBrand.RequiredLocationSelection) obj12, (LocalImage) obj14, (String) obj20, (LocalBrand.WebLayoutType) obj21, (FeatureSet) obj15, (LocalBrand.FulfillmentSelection) obj7, (LocalBrand.LocationFulfillmentSummary) obj27, (Boolean) obj24, (LocalColor) obj28, (String) obj25, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj23, "token");
                throw null;
            }
            switch (nextTag) {
                case 1:
                    obj3 = obj4;
                    obj23 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj3;
                    break;
                case 2:
                    obj3 = obj4;
                    obj17 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj3;
                    break;
                case 3:
                    obj3 = obj4;
                    obj26 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj26);
                    obj4 = obj3;
                    break;
                case 4:
                    obj3 = obj4;
                    obj9 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj9);
                    obj4 = obj3;
                    break;
                case 5:
                    obj10 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj10);
                    break;
                case 6:
                    obj3 = obj4;
                    localBrand$CashBackOffer$Percentage = new LocalBrand$CashBackOffer$Percentage((LocalCashBackOfferPercentage) LocalCashBackOfferPercentage.ADAPTER.decode(protoReader));
                    obj4 = obj3;
                    break;
                case 7:
                    obj18 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 8:
                    obj13 = TransactorKt.decodeMessageOrMerge(LocalLocationDetail.ADAPTER, protoReader, obj13);
                    break;
                case 9:
                    obj = obj4;
                    obj2 = obj9;
                    m.add(LocalLocationSummary.ADAPTER.decode(protoReader));
                    obj4 = obj;
                    obj9 = obj2;
                    break;
                case 10:
                    obj19 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    obj22 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 12:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalMiniCard.ADAPTER, protoReader, obj6);
                    break;
                case 13:
                    obj = obj4;
                    obj2 = obj9;
                    arrayList = m;
                    try {
                        obj16 = LocalBrand.Banner.ADAPTER.decode(protoReader);
                        obj4 = obj;
                        m = arrayList;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        m = arrayList;
                        obj4 = obj;
                        obj9 = obj2;
                    }
                    obj9 = obj2;
                case 14:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalCashConfiguration.ADAPTER, protoReader, obj8);
                    break;
                case 15:
                    obj11 = TransactorKt.decodeMessageOrMerge(LocalEstimatedCompletionDuration.ADAPTER, protoReader, obj11);
                    break;
                case 16:
                    obj12 = TransactorKt.decodeMessageOrMerge(LocalBrand.RequiredLocationSelection.ADAPTER, protoReader, obj12);
                    break;
                case 17:
                    obj14 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj14);
                    break;
                case 18:
                    obj20 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 19:
                    try {
                        obj21 = LocalBrand.WebLayoutType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj4;
                        obj2 = obj9;
                        arrayList = m;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        m = arrayList;
                        obj4 = obj;
                        obj9 = obj2;
                    }
                case 20:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj9;
                    obj4 = obj;
                    obj9 = obj2;
                    break;
                case 21:
                    obj15 = TransactorKt.decodeMessageOrMerge(FeatureSet.ADAPTER, protoReader, obj15);
                    break;
                case 22:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalBrand.FulfillmentSelection.ADAPTER, protoReader, obj7);
                    break;
                case 23:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalBrand.LocationFulfillmentSummary.ADAPTER, protoReader, obj4);
                    break;
                case 24:
                    obj24 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 25:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj5);
                    break;
                case 26:
                    obj25 = ProtoAdapter.STRING.decode(protoReader);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalBrand localBrand = (LocalBrand) obj;
        reverseProtoWriter.getClass();
        localBrand.getClass();
        reverseProtoWriter.writeBytes(localBrand.unknownFields());
        LocalBrand$CashBackOffer$Percentage localBrand$CashBackOffer$Percentage = localBrand.cash_back_offer;
        if (localBrand$CashBackOffer$Percentage != null) {
            LocalCashBackOfferPercentage.ADAPTER.encodeWithTag(reverseProtoWriter, 6, localBrand$CashBackOffer$Percentage.value);
        } else if (localBrand$CashBackOffer$Percentage != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 26, localBrand.policies);
        ProtoAdapter protoAdapter2 = LocalColor.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 25, localBrand.brand_card_outline_color);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 24, localBrand.allow_checkout_notes);
        LocalBrand.LocationFulfillmentSummary.ADAPTER.encodeWithTag(reverseProtoWriter, 23, localBrand.location_fulfillment_summary);
        LocalBrand.FulfillmentSelection.ADAPTER.encodeWithTag(reverseProtoWriter, 22, localBrand.fulfillment_selection);
        FeatureSet.ADAPTER.encodeWithTag(reverseProtoWriter, 21, localBrand.feature_set);
        LocalBrand.WebLayoutType.ADAPTER.encodeWithTag(reverseProtoWriter, 19, localBrand.web_layout_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 18, localBrand.cashtag);
        ProtoAdapter protoAdapter3 = LocalImage.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 17, localBrand.artwork_image);
        LocalBrand.RequiredLocationSelection.ADAPTER.encodeWithTag(reverseProtoWriter, 16, localBrand.required_location_selection);
        LocalEstimatedCompletionDuration.ADAPTER.encodeWithTag(reverseProtoWriter, 15, localBrand.estimated_pickup_wait_time);
        LocalCashConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 14, localBrand.redeemable_local_bux);
        LocalBrand.Banner.ADAPTER.encodeWithTag(reverseProtoWriter, 13, localBrand.banner);
        LocalMiniCard.ADAPTER.encodeWithTag(reverseProtoWriter, 12, localBrand.mini_card);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, localBrand.category);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, localBrand.description);
        LocalLocationSummary.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, localBrand.nearby_locations);
        LocalLocationDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 8, localBrand.selected_location);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 7, localBrand.customer_added_count);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, localBrand.hero_image);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, localBrand.background_color);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, localBrand.foreground_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localBrand.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localBrand.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalBrand localBrand = (LocalBrand) obj;
        localBrand.getClass();
        int size$okio = localBrand.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, localBrand.name) + protoAdapter.encodedSizeWithTag(1, localBrand.token) + size$okio;
        ProtoAdapter protoAdapter2 = LocalColor.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(4, localBrand.background_color) + protoAdapter2.encodedSizeWithTag(3, localBrand.foreground_color) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = LocalImage.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter3.encodedSizeWithTag(5, localBrand.hero_image) + encodedSizeWithTag2;
        LocalBrand$CashBackOffer$Percentage localBrand$CashBackOffer$Percentage = localBrand.cash_back_offer;
        if (localBrand$CashBackOffer$Percentage != null) {
            encodedSizeWithTag3 += LocalCashBackOfferPercentage.ADAPTER.encodedSizeWithTag(6, localBrand$CashBackOffer$Percentage.value);
        } else if (localBrand$CashBackOffer$Percentage != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        return protoAdapter.encodedSizeWithTag(26, localBrand.policies) + protoAdapter2.encodedSizeWithTag(25, localBrand.brand_card_outline_color) + ProtoAdapter.BOOL.encodedSizeWithTag(24, localBrand.allow_checkout_notes) + LocalBrand.LocationFulfillmentSummary.ADAPTER.encodedSizeWithTag(23, localBrand.location_fulfillment_summary) + LocalBrand.FulfillmentSelection.ADAPTER.encodedSizeWithTag(22, localBrand.fulfillment_selection) + FeatureSet.ADAPTER.encodedSizeWithTag(21, localBrand.feature_set) + LocalBrand.WebLayoutType.ADAPTER.encodedSizeWithTag(19, localBrand.web_layout_type) + protoAdapter.encodedSizeWithTag(18, localBrand.cashtag) + protoAdapter3.encodedSizeWithTag(17, localBrand.artwork_image) + LocalBrand.RequiredLocationSelection.ADAPTER.encodedSizeWithTag(16, localBrand.required_location_selection) + LocalEstimatedCompletionDuration.ADAPTER.encodedSizeWithTag(15, localBrand.estimated_pickup_wait_time) + LocalCashConfiguration.ADAPTER.encodedSizeWithTag(14, localBrand.redeemable_local_bux) + LocalBrand.Banner.ADAPTER.encodedSizeWithTag(13, localBrand.banner) + LocalMiniCard.ADAPTER.encodedSizeWithTag(12, localBrand.mini_card) + protoAdapter.encodedSizeWithTag(11, localBrand.category) + protoAdapter.encodedSizeWithTag(10, localBrand.description) + LocalLocationSummary.ADAPTER.asRepeated().encodedSizeWithTag(9, localBrand.nearby_locations) + LocalLocationDetail.ADAPTER.encodedSizeWithTag(8, localBrand.selected_location) + ProtoAdapter.INT64.encodedSizeWithTag(7, localBrand.customer_added_count) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalBrand localBrand = (LocalBrand) obj;
        localBrand.getClass();
        LocalColor localColor = localBrand.foreground_color;
        LocalColor localColor2 = localColor != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor) : null;
        LocalColor localColor3 = localBrand.background_color;
        LocalColor localColor4 = localColor3 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor3) : null;
        LocalImage localImage = localBrand.hero_image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        LocalLocationDetail localLocationDetail = localBrand.selected_location;
        LocalLocationDetail localLocationDetail2 = localLocationDetail != null ? (LocalLocationDetail) LocalLocationDetail.ADAPTER.redact(localLocationDetail) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localBrand.nearby_locations, LocalLocationSummary.ADAPTER);
        LocalMiniCard localMiniCard = localBrand.mini_card;
        LocalMiniCard localMiniCard2 = localMiniCard != null ? (LocalMiniCard) LocalMiniCard.ADAPTER.redact(localMiniCard) : null;
        LocalCashConfiguration localCashConfiguration = localBrand.redeemable_local_bux;
        LocalCashConfiguration localCashConfiguration2 = localCashConfiguration != null ? (LocalCashConfiguration) LocalCashConfiguration.ADAPTER.redact(localCashConfiguration) : null;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = localBrand.estimated_pickup_wait_time;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration2 = localEstimatedCompletionDuration != null ? (LocalEstimatedCompletionDuration) LocalEstimatedCompletionDuration.ADAPTER.redact(localEstimatedCompletionDuration) : null;
        LocalBrand.RequiredLocationSelection requiredLocationSelection = localBrand.required_location_selection;
        LocalBrand.RequiredLocationSelection requiredLocationSelection2 = requiredLocationSelection != null ? (LocalBrand.RequiredLocationSelection) LocalBrand.RequiredLocationSelection.ADAPTER.redact(requiredLocationSelection) : null;
        LocalImage localImage3 = localBrand.artwork_image;
        LocalImage localImage4 = localImage3 != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage3) : null;
        FeatureSet featureSet = localBrand.feature_set;
        FeatureSet featureSet2 = featureSet != null ? (FeatureSet) FeatureSet.ADAPTER.redact(featureSet) : null;
        LocalBrand.FulfillmentSelection fulfillmentSelection = localBrand.fulfillment_selection;
        LocalBrand.FulfillmentSelection fulfillmentSelection2 = fulfillmentSelection != null ? (LocalBrand.FulfillmentSelection) LocalBrand.FulfillmentSelection.ADAPTER.redact(fulfillmentSelection) : null;
        LocalBrand.LocationFulfillmentSummary locationFulfillmentSummary = localBrand.location_fulfillment_summary;
        LocalBrand.LocationFulfillmentSummary locationFulfillmentSummary2 = locationFulfillmentSummary != null ? (LocalBrand.LocationFulfillmentSummary) LocalBrand.LocationFulfillmentSummary.ADAPTER.redact(locationFulfillmentSummary) : null;
        LocalColor localColor5 = localBrand.brand_card_outline_color;
        LocalColor localColor6 = localColor5 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localBrand.token;
        String str2 = localBrand.name;
        LocalBrand$CashBackOffer$Percentage localBrand$CashBackOffer$Percentage = localBrand.cash_back_offer;
        Long l = localBrand.customer_added_count;
        String str3 = localBrand.description;
        String str4 = localBrand.category;
        LocalBrand.Banner banner = localBrand.banner;
        LocalBrand.WebLayoutType webLayoutType = localBrand.web_layout_type;
        Boolean bool = localBrand.allow_checkout_notes;
        String str5 = localBrand.policies;
        str.getClass();
        byteString.getClass();
        return new LocalBrand(str, str2, localColor2, localColor4, localImage2, localBrand$CashBackOffer$Percentage, l, localLocationDetail2, m1169redactElements, str3, str4, localMiniCard2, banner, localCashConfiguration2, localEstimatedCompletionDuration2, requiredLocationSelection2, localImage4, null, webLayoutType, featureSet2, fulfillmentSelection2, locationFulfillmentSummary2, bool, localColor6, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalBrand localBrand = (LocalBrand) obj;
        localBrand.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localBrand.token);
        protoAdapter.encodeWithTag(protoWriter, 2, localBrand.name);
        ProtoAdapter protoAdapter2 = LocalColor.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, localBrand.foreground_color);
        protoAdapter2.encodeWithTag(protoWriter, 4, localBrand.background_color);
        ProtoAdapter protoAdapter3 = LocalImage.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 5, localBrand.hero_image);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, localBrand.customer_added_count);
        LocalLocationDetail.ADAPTER.encodeWithTag(protoWriter, 8, localBrand.selected_location);
        LocalLocationSummary.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, localBrand.nearby_locations);
        protoAdapter.encodeWithTag(protoWriter, 10, localBrand.description);
        protoAdapter.encodeWithTag(protoWriter, 11, localBrand.category);
        LocalMiniCard.ADAPTER.encodeWithTag(protoWriter, 12, localBrand.mini_card);
        LocalBrand.Banner.ADAPTER.encodeWithTag(protoWriter, 13, localBrand.banner);
        LocalCashConfiguration.ADAPTER.encodeWithTag(protoWriter, 14, localBrand.redeemable_local_bux);
        LocalEstimatedCompletionDuration.ADAPTER.encodeWithTag(protoWriter, 15, localBrand.estimated_pickup_wait_time);
        LocalBrand.RequiredLocationSelection.ADAPTER.encodeWithTag(protoWriter, 16, localBrand.required_location_selection);
        protoAdapter3.encodeWithTag(protoWriter, 17, localBrand.artwork_image);
        protoAdapter.encodeWithTag(protoWriter, 18, localBrand.cashtag);
        LocalBrand.WebLayoutType.ADAPTER.encodeWithTag(protoWriter, 19, localBrand.web_layout_type);
        FeatureSet.ADAPTER.encodeWithTag(protoWriter, 21, localBrand.feature_set);
        LocalBrand.FulfillmentSelection.ADAPTER.encodeWithTag(protoWriter, 22, localBrand.fulfillment_selection);
        LocalBrand.LocationFulfillmentSummary.ADAPTER.encodeWithTag(protoWriter, 23, localBrand.location_fulfillment_summary);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, localBrand.allow_checkout_notes);
        protoAdapter2.encodeWithTag(protoWriter, 25, localBrand.brand_card_outline_color);
        protoAdapter.encodeWithTag(protoWriter, 26, localBrand.policies);
        LocalBrand$CashBackOffer$Percentage localBrand$CashBackOffer$Percentage = localBrand.cash_back_offer;
        if (localBrand$CashBackOffer$Percentage != null) {
            LocalCashBackOfferPercentage.ADAPTER.encodeWithTag(protoWriter, 6, localBrand$CashBackOffer$Percentage.value);
        } else if (localBrand$CashBackOffer$Percentage != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(localBrand.unknownFields());
    }
}
