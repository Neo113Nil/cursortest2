package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OfferDetailListSheet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OfferDetailListSheet> CREATOR;
    public final Button activate_button;
    public final String activation_card_title;
    public final String boost_token;
    public final Long expires_at_ms;
    public final List formatted_detail_rows;
    public final LocalizedString l_terms_link;
    public final LocalizedString l_title;
    public final TapAction learn_more_action;
    public final Avatar logo;
    public final String merchant_token;
    public final String offer_token;
    public final OfferType offer_type;
    public final Button open_button;
    public final Button order_card_button;
    public final Button shop_button;
    public final FormattedDetail subtitle;
    public final String sup_token;
    public final StyledText terms_link;
    public final String title;

    static {
        OfferDetailListSheet$Companion$ADAPTER$1 offerDetailListSheet$Companion$ADAPTER$1 = new OfferDetailListSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OfferDetailListSheet.class), "type.googleapis.com/squareup.cash.shop.rendering.api.OfferDetailListSheet", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Sheets.proto");
        ADAPTER = offerDetailListSheet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offerDetailListSheet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferDetailListSheet(OfferType offerType, String str, String str2, String str3, String str4, Avatar avatar, LocalizedString localizedString, FormattedDetail formattedDetail, List list, Button button, Button button2, Button button3, Button button4, TapAction tapAction, LocalizedString localizedString2, Long l, String str5, StyledText styledText, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.offer_type = offerType;
        this.offer_token = str;
        this.boost_token = str2;
        this.merchant_token = str3;
        this.sup_token = str4;
        this.logo = avatar;
        this.l_title = localizedString;
        this.subtitle = formattedDetail;
        this.shop_button = button;
        this.order_card_button = button2;
        this.activate_button = button3;
        this.open_button = button4;
        this.learn_more_action = tapAction;
        this.l_terms_link = localizedString2;
        this.expires_at_ms = l;
        this.title = str5;
        this.terms_link = styledText;
        this.activation_card_title = str6;
        this.formatted_detail_rows = TransactorKt.immutableCopyOf("formatted_detail_rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfferDetailListSheet)) {
            return false;
        }
        OfferDetailListSheet offerDetailListSheet = (OfferDetailListSheet) obj;
        return Intrinsics.areEqual(unknownFields(), offerDetailListSheet.unknownFields()) && this.offer_type == offerDetailListSheet.offer_type && Intrinsics.areEqual(this.offer_token, offerDetailListSheet.offer_token) && Intrinsics.areEqual(this.boost_token, offerDetailListSheet.boost_token) && Intrinsics.areEqual(this.merchant_token, offerDetailListSheet.merchant_token) && Intrinsics.areEqual(this.sup_token, offerDetailListSheet.sup_token) && Intrinsics.areEqual(this.logo, offerDetailListSheet.logo) && Intrinsics.areEqual(this.l_title, offerDetailListSheet.l_title) && Intrinsics.areEqual(this.subtitle, offerDetailListSheet.subtitle) && Intrinsics.areEqual(this.formatted_detail_rows, offerDetailListSheet.formatted_detail_rows) && Intrinsics.areEqual(this.shop_button, offerDetailListSheet.shop_button) && Intrinsics.areEqual(this.order_card_button, offerDetailListSheet.order_card_button) && Intrinsics.areEqual(this.activate_button, offerDetailListSheet.activate_button) && Intrinsics.areEqual(this.open_button, offerDetailListSheet.open_button) && Intrinsics.areEqual(this.learn_more_action, offerDetailListSheet.learn_more_action) && Intrinsics.areEqual(this.l_terms_link, offerDetailListSheet.l_terms_link) && Intrinsics.areEqual(this.expires_at_ms, offerDetailListSheet.expires_at_ms) && Intrinsics.areEqual(this.title, offerDetailListSheet.title) && Intrinsics.areEqual(this.terms_link, offerDetailListSheet.terms_link) && Intrinsics.areEqual(this.activation_card_title, offerDetailListSheet.activation_card_title);
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
        String str3 = this.merchant_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.sup_token;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Avatar avatar = this.logo;
        int hashCode7 = (hashCode6 + (avatar != null ? avatar.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.l_title;
        int hashCode8 = (hashCode7 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        FormattedDetail formattedDetail = this.subtitle;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode8 + (formattedDetail != null ? formattedDetail.hashCode() : 0)) * 37, 37, this.formatted_detail_rows);
        Button button = this.shop_button;
        int hashCode9 = (m + (button != null ? button.hashCode() : 0)) * 37;
        Button button2 = this.order_card_button;
        int hashCode10 = (hashCode9 + (button2 != null ? button2.hashCode() : 0)) * 37;
        Button button3 = this.activate_button;
        int hashCode11 = (hashCode10 + (button3 != null ? button3.hashCode() : 0)) * 37;
        Button button4 = this.open_button;
        int hashCode12 = (hashCode11 + (button4 != null ? button4.hashCode() : 0)) * 37;
        TapAction tapAction = this.learn_more_action;
        int hashCode13 = (hashCode12 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.l_terms_link;
        int hashCode14 = (hashCode13 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Long l = this.expires_at_ms;
        int hashCode15 = (hashCode14 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str5 = this.title;
        int hashCode16 = (hashCode15 + (str5 != null ? str5.hashCode() : 0)) * 37;
        StyledText styledText = this.terms_link;
        int hashCode17 = (hashCode16 + (styledText != null ? styledText.hashCode() : 0)) * 37;
        String str6 = this.activation_card_title;
        int hashCode18 = hashCode17 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode18;
        return hashCode18;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CreditLine.Builder builder = new CreditLine.Builder(3);
        builder.credit_limit = this.offer_type;
        builder.token = this.offer_token;
        builder.instrument_display_name = this.boost_token;
        builder.instrument_subtitle = this.merchant_token;
        builder.available_amount = this.sup_token;
        builder.outstanding_amount = this.logo;
        builder.minimum_loan_amount = this.l_title;
        builder.setup_fee_bps = this.subtitle;
        builder.quick_amounts = this.formatted_detail_rows;
        builder.first_time_borrow_data = this.shop_button;
        builder.unlock_borrow_data = this.order_card_button;
        builder.credit_line_status_icon = this.activate_button;
        builder.skip_loan_amount_selection = this.open_button;
        builder.lending_product = this.learn_more_action;
        builder.credit_line_status_data = this.l_terms_link;
        builder.credit_line_limit_data = this.expires_at_ms;
        builder.alert = this.title;
        builder.localizable_instrument_display_name = this.terms_link;
        builder.localizable_instrument_subtitle = this.activation_card_title;
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
        String str3 = this.merchant_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "merchant_token=", arrayList);
        }
        String str4 = this.sup_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "sup_token=", arrayList);
        }
        Avatar avatar = this.logo;
        if (avatar != null) {
            arrayList.add("logo=" + avatar);
        }
        LocalizedString localizedString = this.l_title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("l_title=", localizedString, arrayList);
        }
        FormattedDetail formattedDetail = this.subtitle;
        if (formattedDetail != null) {
            arrayList.add("subtitle=" + formattedDetail);
        }
        List list = this.formatted_detail_rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("formatted_detail_rows=", arrayList, list);
        }
        Button button = this.shop_button;
        if (button != null) {
            SizeMode$EnumUnboxingLocalUtility.m("shop_button=", button, arrayList);
        }
        Button button2 = this.order_card_button;
        if (button2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("order_card_button=", button2, arrayList);
        }
        Button button3 = this.activate_button;
        if (button3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("activate_button=", button3, arrayList);
        }
        Button button4 = this.open_button;
        if (button4 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("open_button=", button4, arrayList);
        }
        TapAction tapAction = this.learn_more_action;
        if (tapAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("learn_more_action=", tapAction, arrayList);
        }
        LocalizedString localizedString2 = this.l_terms_link;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("l_terms_link=", localizedString2, arrayList);
        }
        Long l = this.expires_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at_ms=", l, arrayList);
        }
        String str5 = this.title;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "title=", arrayList);
        }
        StyledText styledText = this.terms_link;
        if (styledText != null) {
            SizeMode$EnumUnboxingLocalUtility.m("terms_link=", styledText, arrayList);
        }
        String str6 = this.activation_card_title;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "activation_card_title=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OfferDetailListSheet{", "}", 0, null, null, 56);
    }
}
