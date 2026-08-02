package com.squareup.protos.cash.cashface.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetProfileDetailsResponse$MerchantData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetProfileDetailsResponse.MerchantData((String) obj, (String) obj2, (Image) obj3, (Color) obj4, (Boolean) obj5, (Boolean) obj6, (String) obj7, (AnalyticsEvent) obj8, (Image) obj9, (GetProfileDetailsResponse.MerchantData.MerchantProfileImage) obj10, (Action) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj8);
                    break;
                case 9:
                    obj9 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj9);
                    break;
                case 10:
                    obj10 = TransactorKt.decodeMessageOrMerge(GetProfileDetailsResponse.MerchantData.MerchantProfileImage.ADAPTER, protoReader, obj10);
                    break;
                case 11:
                    obj11 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj11);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetProfileDetailsResponse.MerchantData merchantData = (GetProfileDetailsResponse.MerchantData) obj;
        reverseProtoWriter.getClass();
        merchantData.getClass();
        reverseProtoWriter.writeBytes(merchantData.unknownFields());
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 11, merchantData.passive_action);
        GetProfileDetailsResponse.MerchantData.MerchantProfileImage.ADAPTER.encodeWithTag(reverseProtoWriter, 10, merchantData.merchant_logo_url);
        ProtoAdapter protoAdapter = Image.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, merchantData.header_image_url);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 8, merchantData.view_event);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, merchantData.merchant_token);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, merchantData.should_fill_background);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, merchantData.should_colorize_avatar);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 4, merchantData.brand_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, merchantData.logo_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, merchantData.canonical_category);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, merchantData.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetProfileDetailsResponse.MerchantData merchantData = (GetProfileDetailsResponse.MerchantData) obj;
        merchantData.getClass();
        int size$okio = merchantData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, merchantData.canonical_category) + protoAdapter.encodedSizeWithTag(1, merchantData.name) + size$okio;
        ProtoAdapter protoAdapter2 = Image.ADAPTER;
        int encodedSizeWithTag2 = Color.ADAPTER.encodedSizeWithTag(4, merchantData.brand_color) + protoAdapter2.encodedSizeWithTag(3, merchantData.logo_url) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return Action.ADAPTER.encodedSizeWithTag(11, merchantData.passive_action) + GetProfileDetailsResponse.MerchantData.MerchantProfileImage.ADAPTER.encodedSizeWithTag(10, merchantData.merchant_logo_url) + protoAdapter2.encodedSizeWithTag(9, merchantData.header_image_url) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(8, merchantData.view_event) + protoAdapter.encodedSizeWithTag(7, merchantData.merchant_token) + protoAdapter3.encodedSizeWithTag(6, merchantData.should_fill_background) + protoAdapter3.encodedSizeWithTag(5, merchantData.should_colorize_avatar) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetProfileDetailsResponse.MerchantData merchantData = (GetProfileDetailsResponse.MerchantData) obj;
        merchantData.getClass();
        AnalyticsEvent analyticsEvent = merchantData.view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        Action action = merchantData.passive_action;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = merchantData.canonical_category;
        Boolean bool = merchantData.should_colorize_avatar;
        Boolean bool2 = merchantData.should_fill_background;
        String str2 = merchantData.merchant_token;
        byteString.getClass();
        return new GetProfileDetailsResponse.MerchantData(null, str, null, null, bool, bool2, str2, analyticsEvent2, null, null, action2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetProfileDetailsResponse.MerchantData merchantData = (GetProfileDetailsResponse.MerchantData) obj;
        merchantData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, merchantData.name);
        protoAdapter.encodeWithTag(protoWriter, 2, merchantData.canonical_category);
        ProtoAdapter protoAdapter2 = Image.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, merchantData.logo_url);
        Color.ADAPTER.encodeWithTag(protoWriter, 4, merchantData.brand_color);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 5, merchantData.should_colorize_avatar);
        protoAdapter3.encodeWithTag(protoWriter, 6, merchantData.should_fill_background);
        protoAdapter.encodeWithTag(protoWriter, 7, merchantData.merchant_token);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 8, merchantData.view_event);
        protoAdapter2.encodeWithTag(protoWriter, 9, merchantData.header_image_url);
        GetProfileDetailsResponse.MerchantData.MerchantProfileImage.ADAPTER.encodeWithTag(protoWriter, 10, merchantData.merchant_logo_url);
        Action.ADAPTER.encodeWithTag(protoWriter, 11, merchantData.passive_action);
        protoWriter.writeBytes(merchantData.unknownFields());
    }
}
