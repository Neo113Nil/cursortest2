package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OfferDetailSheet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OfferDetailSheet> CREATOR;
    public final String boost_token;
    public final Avatar business_logo;
    public final CountdownCaption countdown_caption;
    public final FormattedDetail formatted_subtitle;
    public final TapAction learn_more_action;
    public final SheetStyledDetails merchant_sale_details;
    public final String offer_token;
    public final OfferType offer_type;
    public final Button order_card_button;
    public final Button sharing_button;
    public final Button shop_button;
    public final String subtitle;
    public final String title;

    static {
        OfferDetailSheet$Companion$ADAPTER$1 offerDetailSheet$Companion$ADAPTER$1 = new OfferDetailSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OfferDetailSheet.class), "type.googleapis.com/squareup.cash.shop.rendering.api.OfferDetailSheet", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Sheets.proto");
        ADAPTER = offerDetailSheet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offerDetailSheet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferDetailSheet(OfferType offerType, String str, String str2, TapAction tapAction, Avatar avatar, String str3, String str4, Button button, Button button2, CountdownCaption countdownCaption, Button button3, SheetStyledDetails sheetStyledDetails, FormattedDetail formattedDetail, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.offer_type = offerType;
        this.offer_token = str;
        this.boost_token = str2;
        this.learn_more_action = tapAction;
        this.business_logo = avatar;
        this.title = str3;
        this.subtitle = str4;
        this.sharing_button = button;
        this.shop_button = button2;
        this.countdown_caption = countdownCaption;
        this.order_card_button = button3;
        this.merchant_sale_details = sheetStyledDetails;
        this.formatted_subtitle = formattedDetail;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfferDetailSheet)) {
            return false;
        }
        OfferDetailSheet offerDetailSheet = (OfferDetailSheet) obj;
        return Intrinsics.areEqual(unknownFields(), offerDetailSheet.unknownFields()) && this.offer_type == offerDetailSheet.offer_type && Intrinsics.areEqual(this.offer_token, offerDetailSheet.offer_token) && Intrinsics.areEqual(this.boost_token, offerDetailSheet.boost_token) && Intrinsics.areEqual(this.learn_more_action, offerDetailSheet.learn_more_action) && Intrinsics.areEqual(this.business_logo, offerDetailSheet.business_logo) && Intrinsics.areEqual(this.title, offerDetailSheet.title) && Intrinsics.areEqual(this.subtitle, offerDetailSheet.subtitle) && Intrinsics.areEqual(this.sharing_button, offerDetailSheet.sharing_button) && Intrinsics.areEqual(this.shop_button, offerDetailSheet.shop_button) && Intrinsics.areEqual(this.countdown_caption, offerDetailSheet.countdown_caption) && Intrinsics.areEqual(this.order_card_button, offerDetailSheet.order_card_button) && Intrinsics.areEqual(this.merchant_sale_details, offerDetailSheet.merchant_sale_details) && Intrinsics.areEqual(this.formatted_subtitle, offerDetailSheet.formatted_subtitle);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        OfferType offerType = this.offer_type;
        int hashCode2 = (hashCode + (offerType != null ? offerType.hashCode() : 0)) * 37;
        String str = this.offer_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.boost_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        TapAction tapAction = this.learn_more_action;
        int hashCode5 = (hashCode4 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
        Avatar avatar = this.business_logo;
        int hashCode6 = (hashCode5 + (avatar != null ? avatar.hashCode() : 0)) * 37;
        String str3 = this.title;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.subtitle;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Button button = this.sharing_button;
        int hashCode9 = (hashCode8 + (button != null ? button.hashCode() : 0)) * 37;
        Button button2 = this.shop_button;
        int hashCode10 = (hashCode9 + (button2 != null ? button2.hashCode() : 0)) * 37;
        CountdownCaption countdownCaption = this.countdown_caption;
        int hashCode11 = (hashCode10 + (countdownCaption != null ? countdownCaption.hashCode() : 0)) * 37;
        Button button3 = this.order_card_button;
        int hashCode12 = (hashCode11 + (button3 != null ? button3.hashCode() : 0)) * 37;
        SheetStyledDetails sheetStyledDetails = this.merchant_sale_details;
        int hashCode13 = (hashCode12 + (sheetStyledDetails != null ? sheetStyledDetails.hashCode() : 0)) * 37;
        FormattedDetail formattedDetail = this.formatted_subtitle;
        int hashCode14 = hashCode13 + (formattedDetail != null ? formattedDetail.hashCode() : 0);
        this.hashCode = hashCode14;
        return hashCode14;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        RewardStatus.Builder builder = new RewardStatus.Builder(7);
        builder.code_entry_enabled = this.offer_type;
        builder.code_entry_client_route = this.offer_token;
        builder.reward_button_text = this.boost_token;
        builder.reward_screen_enabled = this.learn_more_action;
        builder.minimum_code_length = this.business_logo;
        builder.reward_header_text = this.title;
        builder.reward_main_text = this.subtitle;
        builder.reward_button_priority = this.sharing_button;
        builder.completed_reward_payments = this.shop_button;
        builder.available_reward_payments = this.countdown_caption;
        builder.reward_payment_amount = this.order_card_button;
        builder.expiration = this.merchant_sale_details;
        builder.referral_status_screen = this.formatted_subtitle;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        OfferType offerType = this.offer_type;
        if (offerType != null) {
            arrayList.add("offer_type=" + offerType);
        }
        String str = this.offer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "offer_token=", arrayList);
        }
        String str2 = this.boost_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "boost_token=", arrayList);
        }
        TapAction tapAction = this.learn_more_action;
        if (tapAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("learn_more_action=", tapAction, arrayList);
        }
        Avatar avatar = this.business_logo;
        if (avatar != null) {
            arrayList.add("business_logo=" + avatar);
        }
        String str3 = this.title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "title=", arrayList);
        }
        String str4 = this.subtitle;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "subtitle=", arrayList);
        }
        Button button = this.sharing_button;
        if (button != null) {
            SizeMode$EnumUnboxingLocalUtility.m("sharing_button=", button, arrayList);
        }
        Button button2 = this.shop_button;
        if (button2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("shop_button=", button2, arrayList);
        }
        CountdownCaption countdownCaption = this.countdown_caption;
        if (countdownCaption != null) {
            arrayList.add("countdown_caption=" + countdownCaption);
        }
        Button button3 = this.order_card_button;
        if (button3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("order_card_button=", button3, arrayList);
        }
        SheetStyledDetails sheetStyledDetails = this.merchant_sale_details;
        if (sheetStyledDetails != null) {
            arrayList.add("merchant_sale_details=" + sheetStyledDetails);
        }
        FormattedDetail formattedDetail = this.formatted_subtitle;
        if (formattedDetail != null) {
            arrayList.add("formatted_subtitle=" + formattedDetail);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OfferDetailSheet{", "}", 0, null, null, 56);
    }
}
