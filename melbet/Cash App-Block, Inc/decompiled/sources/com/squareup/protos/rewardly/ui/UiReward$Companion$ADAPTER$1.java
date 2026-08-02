package com.squareup.protos.rewardly.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiReward$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0033. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
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
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj20 = obj5;
            if (nextTag == -1) {
                return new UiReward((String) obj3, (String) obj19, (UiRewardAvatars) obj4, (String) obj20, (String) obj6, (String) obj7, (String) obj8, (String) obj9, (Long) obj10, (Long) obj11, m, (String) obj12, (Boolean) obj13, (String) obj14, arrayList, (String) obj15, (Boolean) obj16, (Boolean) obj17, (Boolean) obj18, (AppLinks) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj20;
                    break;
                case 2:
                    obj19 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj20;
                    obj = obj3;
                    break;
                case 3:
                    obj4 = TransactorKt.decodeMessageOrMerge(UiRewardAvatars.ADAPTER, protoReader, obj4);
                    obj5 = obj20;
                    obj = obj3;
                    break;
                case 4:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    obj = obj3;
                    break;
                case 5:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj20;
                    obj = obj3;
                    break;
                case 6:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj5 = obj20;
                    break;
                case 7:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj20;
                    obj = obj3;
                    break;
                case 8:
                    obj11 = ProtoAdapter.INT64.decode(protoReader);
                    obj5 = obj20;
                    obj = obj3;
                    break;
                case 9:
                    m.add(UiBoostAttribute.ADAPTER.decode(protoReader));
                    obj = obj3;
                    obj5 = obj20;
                    break;
                case 10:
                    obj10 = ProtoAdapter.INT64.decode(protoReader);
                    obj5 = obj20;
                    obj = obj3;
                    break;
                case 11:
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj20;
                    obj = obj3;
                    break;
                case 12:
                    obj13 = ProtoAdapter.BOOL.decode(protoReader);
                    obj5 = obj20;
                    obj = obj3;
                    break;
                case 13:
                    obj14 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj20;
                    obj = obj3;
                    break;
                case 14:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj20;
                    obj = obj3;
                    break;
                case 15:
                    arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    obj = obj3;
                    obj5 = obj20;
                    break;
                case 16:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj20;
                    obj = obj3;
                    break;
                case 17:
                    obj15 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj20;
                    obj = obj3;
                    break;
                case 18:
                    obj16 = ProtoAdapter.BOOL.decode(protoReader);
                    obj5 = obj20;
                    obj = obj3;
                    break;
                case 19:
                    obj17 = ProtoAdapter.BOOL.decode(protoReader);
                    obj5 = obj20;
                    obj = obj3;
                    break;
                case 20:
                    obj18 = ProtoAdapter.BOOL.decode(protoReader);
                    obj5 = obj20;
                    obj = obj3;
                    break;
                case 21:
                    obj2 = TransactorKt.decodeMessageOrMerge(AppLinks.ADAPTER, protoReader, obj2);
                    obj = obj3;
                    obj5 = obj20;
                    break;
            }
            obj3 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiReward uiReward = (UiReward) obj;
        reverseProtoWriter.getClass();
        uiReward.getClass();
        reverseProtoWriter.writeBytes(uiReward.unknownFields());
        AppLinks.ADAPTER.encodeWithTag(reverseProtoWriter, 21, uiReward.app_links);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 20, uiReward.redeemable_with_cash_app_pay);
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, uiReward.redeemable_with_cash_card);
        protoAdapter.encodeWithTag(reverseProtoWriter, 18, uiReward.is_custom_offer);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 17, uiReward.offerly_token);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 15, uiReward.merchant_tokens);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, uiReward.merchant_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, uiReward.draggable);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, uiReward.discount_text);
        UiBoostAttribute.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, uiReward.boost_attributes);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 8, uiReward.expiration_date_time_ms);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 10, uiReward.activation_date_time_ms);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, uiReward.full_title_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 16, uiReward.user_agent);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 14, uiReward.affiliate_link_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, uiReward.main_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, uiReward.title);
        UiRewardAvatars.ADAPTER.encodeWithTag(reverseProtoWriter, 3, uiReward.reward_avatars);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, uiReward.category);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, uiReward.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiReward uiReward = (UiReward) obj;
        uiReward.getClass();
        int size$okio = uiReward.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(7, uiReward.full_title_text) + protoAdapter.encodedSizeWithTag(16, uiReward.user_agent) + protoAdapter.encodedSizeWithTag(14, uiReward.affiliate_link_url) + protoAdapter.encodedSizeWithTag(5, uiReward.main_text) + protoAdapter.encodedSizeWithTag(4, uiReward.title) + UiRewardAvatars.ADAPTER.encodedSizeWithTag(3, uiReward.reward_avatars) + protoAdapter.encodedSizeWithTag(2, uiReward.category) + protoAdapter.encodedSizeWithTag(1, uiReward.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(11, uiReward.discount_text) + UiBoostAttribute.ADAPTER.asRepeated().encodedSizeWithTag(9, uiReward.boost_attributes) + protoAdapter2.encodedSizeWithTag(8, uiReward.expiration_date_time_ms) + protoAdapter2.encodedSizeWithTag(10, uiReward.activation_date_time_ms) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return AppLinks.ADAPTER.encodedSizeWithTag(21, uiReward.app_links) + protoAdapter3.encodedSizeWithTag(20, uiReward.redeemable_with_cash_app_pay) + protoAdapter3.encodedSizeWithTag(19, uiReward.redeemable_with_cash_card) + protoAdapter3.encodedSizeWithTag(18, uiReward.is_custom_offer) + protoAdapter.encodedSizeWithTag(17, uiReward.offerly_token) + protoAdapter.asRepeated().encodedSizeWithTag(15, uiReward.merchant_tokens) + protoAdapter.encodedSizeWithTag(13, uiReward.merchant_name) + protoAdapter3.encodedSizeWithTag(12, uiReward.draggable) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiReward uiReward = (UiReward) obj;
        uiReward.getClass();
        UiRewardAvatars uiRewardAvatars = uiReward.reward_avatars;
        UiRewardAvatars uiRewardAvatars2 = uiRewardAvatars != null ? (UiRewardAvatars) UiRewardAvatars.ADAPTER.redact(uiRewardAvatars) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(uiReward.boost_attributes, UiBoostAttribute.ADAPTER);
        AppLinks appLinks = uiReward.app_links;
        AppLinks appLinks2 = appLinks != null ? (AppLinks) AppLinks.ADAPTER.redact(appLinks) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = uiReward.token;
        String str2 = uiReward.category;
        String str3 = uiReward.title;
        String str4 = uiReward.main_text;
        String str5 = uiReward.affiliate_link_url;
        String str6 = uiReward.user_agent;
        String str7 = uiReward.full_title_text;
        Long l = uiReward.activation_date_time_ms;
        Long l2 = uiReward.expiration_date_time_ms;
        String str8 = uiReward.discount_text;
        Boolean bool = uiReward.draggable;
        String str9 = uiReward.merchant_name;
        List list = uiReward.merchant_tokens;
        String str10 = uiReward.offerly_token;
        Boolean bool2 = uiReward.is_custom_offer;
        Boolean bool3 = uiReward.redeemable_with_cash_card;
        Boolean bool4 = uiReward.redeemable_with_cash_app_pay;
        list.getClass();
        byteString.getClass();
        return new UiReward(str, str2, uiRewardAvatars2, str3, str4, str5, str6, str7, l, l2, m1169redactElements, str8, bool, str9, list, str10, bool2, bool3, bool4, appLinks2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiReward uiReward = (UiReward) obj;
        uiReward.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, uiReward.token);
        protoAdapter.encodeWithTag(protoWriter, 2, uiReward.category);
        UiRewardAvatars.ADAPTER.encodeWithTag(protoWriter, 3, uiReward.reward_avatars);
        protoAdapter.encodeWithTag(protoWriter, 4, uiReward.title);
        protoAdapter.encodeWithTag(protoWriter, 5, uiReward.main_text);
        protoAdapter.encodeWithTag(protoWriter, 14, uiReward.affiliate_link_url);
        protoAdapter.encodeWithTag(protoWriter, 16, uiReward.user_agent);
        protoAdapter.encodeWithTag(protoWriter, 7, uiReward.full_title_text);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 10, uiReward.activation_date_time_ms);
        protoAdapter2.encodeWithTag(protoWriter, 8, uiReward.expiration_date_time_ms);
        UiBoostAttribute.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, uiReward.boost_attributes);
        protoAdapter.encodeWithTag(protoWriter, 11, uiReward.discount_text);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 12, uiReward.draggable);
        protoAdapter.encodeWithTag(protoWriter, 13, uiReward.merchant_name);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 15, uiReward.merchant_tokens);
        protoAdapter.encodeWithTag(protoWriter, 17, uiReward.offerly_token);
        protoAdapter3.encodeWithTag(protoWriter, 18, uiReward.is_custom_offer);
        protoAdapter3.encodeWithTag(protoWriter, 19, uiReward.redeemable_with_cash_card);
        protoAdapter3.encodeWithTag(protoWriter, 20, uiReward.redeemable_with_cash_app_pay);
        AppLinks.ADAPTER.encodeWithTag(protoWriter, 21, uiReward.app_links);
        protoWriter.writeBytes(uiReward.unknownFields());
    }
}
