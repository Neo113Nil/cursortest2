package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
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

/* loaded from: classes7.dex */
public final class LocalCashMarketingContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalCashMarketingContent> CREATOR;
    public final Template brand_profile;
    public final Template cart_toolbar;
    public final Template checkout;
    public final Template order_details_redemption_off;
    public final Template order_details_redemption_on;

    public final class Template extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Template> CREATOR;
        public final String over_threshold_subtitle;
        public final String over_threshold_title;
        public final LocalMoney threshold;
        public final String under_threshold_subtitle;
        public final String under_threshold_title;

        static {
            LocalCashMarketingContent$Template$Companion$ADAPTER$1 localCashMarketingContent$Template$Companion$ADAPTER$1 = new LocalCashMarketingContent$Template$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Template.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalCashMarketingContent.Template", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand.proto");
            ADAPTER = localCashMarketingContent$Template$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localCashMarketingContent$Template$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Template(LocalMoney localMoney, String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.threshold = localMoney;
            this.under_threshold_title = str;
            this.over_threshold_title = str2;
            this.under_threshold_subtitle = str3;
            this.over_threshold_subtitle = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Template)) {
                return false;
            }
            Template template = (Template) obj;
            return Intrinsics.areEqual(unknownFields(), template.unknownFields()) && Intrinsics.areEqual(this.threshold, template.threshold) && Intrinsics.areEqual(this.under_threshold_title, template.under_threshold_title) && Intrinsics.areEqual(this.over_threshold_title, template.over_threshold_title) && Intrinsics.areEqual(this.under_threshold_subtitle, template.under_threshold_subtitle) && Intrinsics.areEqual(this.over_threshold_subtitle, template.over_threshold_subtitle);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalMoney localMoney = this.threshold;
            int hashCode2 = (hashCode + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
            String str = this.under_threshold_title;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.over_threshold_title;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.under_threshold_subtitle;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.over_threshold_subtitle;
            int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BrandBanner.Builder builder = new BrandBanner.Builder(8);
            builder.icon = this.threshold;
            builder.title = this.under_threshold_title;
            builder.subtitle = this.over_threshold_title;
            builder.action = this.under_threshold_subtitle;
            builder.icon_background_color = this.over_threshold_subtitle;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalMoney localMoney = this.threshold;
            if (localMoney != null) {
                SizeMode$EnumUnboxingLocalUtility.m("threshold=", localMoney, arrayList);
            }
            String str = this.under_threshold_title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "under_threshold_title=", arrayList);
            }
            String str2 = this.over_threshold_title;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "over_threshold_title=", arrayList);
            }
            String str3 = this.under_threshold_subtitle;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "under_threshold_subtitle=", arrayList);
            }
            String str4 = this.over_threshold_subtitle;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "over_threshold_subtitle=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Template{", "}", 0, null, null, 56);
        }
    }

    static {
        LocalCashMarketingContent$Companion$ADAPTER$1 localCashMarketingContent$Companion$ADAPTER$1 = new LocalCashMarketingContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalCashMarketingContent.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalCashMarketingContent", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand.proto");
        ADAPTER = localCashMarketingContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localCashMarketingContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCashMarketingContent(Template template, Template template2, Template template3, Template template4, Template template5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.brand_profile = template;
        this.cart_toolbar = template2;
        this.order_details_redemption_off = template3;
        this.order_details_redemption_on = template4;
        this.checkout = template5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalCashMarketingContent)) {
            return false;
        }
        LocalCashMarketingContent localCashMarketingContent = (LocalCashMarketingContent) obj;
        return Intrinsics.areEqual(unknownFields(), localCashMarketingContent.unknownFields()) && Intrinsics.areEqual(this.brand_profile, localCashMarketingContent.brand_profile) && Intrinsics.areEqual(this.cart_toolbar, localCashMarketingContent.cart_toolbar) && Intrinsics.areEqual(this.order_details_redemption_off, localCashMarketingContent.order_details_redemption_off) && Intrinsics.areEqual(this.order_details_redemption_on, localCashMarketingContent.order_details_redemption_on) && Intrinsics.areEqual(this.checkout, localCashMarketingContent.checkout);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Template template = this.brand_profile;
        int hashCode2 = (hashCode + (template != null ? template.hashCode() : 0)) * 37;
        Template template2 = this.cart_toolbar;
        int hashCode3 = (hashCode2 + (template2 != null ? template2.hashCode() : 0)) * 37;
        Template template3 = this.order_details_redemption_off;
        int hashCode4 = (hashCode3 + (template3 != null ? template3.hashCode() : 0)) * 37;
        Template template4 = this.order_details_redemption_on;
        int hashCode5 = (hashCode4 + (template4 != null ? template4.hashCode() : 0)) * 37;
        Template template5 = this.checkout;
        int hashCode6 = hashCode5 + (template5 != null ? template5.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(7);
        builder.icon = this.brand_profile;
        builder.title = this.cart_toolbar;
        builder.subtitle = this.order_details_redemption_off;
        builder.action = this.order_details_redemption_on;
        builder.icon_background_color = this.checkout;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Template template = this.brand_profile;
        if (template != null) {
            arrayList.add("brand_profile=" + template);
        }
        Template template2 = this.cart_toolbar;
        if (template2 != null) {
            arrayList.add("cart_toolbar=" + template2);
        }
        Template template3 = this.order_details_redemption_off;
        if (template3 != null) {
            arrayList.add("order_details_redemption_off=" + template3);
        }
        Template template4 = this.order_details_redemption_on;
        if (template4 != null) {
            arrayList.add("order_details_redemption_on=" + template4);
        }
        Template template5 = this.checkout;
        if (template5 != null) {
            arrayList.add("checkout=" + template5);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalCashMarketingContent{", "}", 0, null, null, 56);
    }
}
