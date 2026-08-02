package com.squareup.protos.cash.pay;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.franklin.api.SupportConfig;
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
public final class CashAppPayMerchantRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppPayMerchantRenderData> CREATOR;
    public final BrandColors brand_colors;
    public final String brand_id;
    public final String display_name;
    public final Boolean is_template_avatar;
    public final LogoUrls logo_urls;
    public final String merchant_id;
    public final String merchant_token;

    public final class BrandColors extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BrandColors> CREATOR;
        public final String dark_theme_primary_color;
        public final String default_primary_color;
        public final String light_theme_primary_color;

        static {
            CashAppPayMerchantRenderData$BrandColors$Companion$ADAPTER$1 cashAppPayMerchantRenderData$BrandColors$Companion$ADAPTER$1 = new CashAppPayMerchantRenderData$BrandColors$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BrandColors.class), "type.googleapis.com/squareup.cash.pay.CashAppPayMerchantRenderData.BrandColors", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_merchant.proto");
            ADAPTER = cashAppPayMerchantRenderData$BrandColors$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayMerchantRenderData$BrandColors$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BrandColors(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.default_primary_color = str;
            this.light_theme_primary_color = str2;
            this.dark_theme_primary_color = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BrandColors)) {
                return false;
            }
            BrandColors brandColors = (BrandColors) obj;
            return Intrinsics.areEqual(unknownFields(), brandColors.unknownFields()) && Intrinsics.areEqual(this.default_primary_color, brandColors.default_primary_color) && Intrinsics.areEqual(this.light_theme_primary_color, brandColors.light_theme_primary_color) && Intrinsics.areEqual(this.dark_theme_primary_color, brandColors.dark_theme_primary_color);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.default_primary_color;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.light_theme_primary_color;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.dark_theme_primary_color;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SupportConfig.Builder builder = new SupportConfig.Builder(21);
            builder.contact_support_url = this.default_primary_color;
            builder.privacy_policy_url = this.light_theme_primary_color;
            builder.terms_of_service_url = this.dark_theme_primary_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.default_primary_color;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "default_primary_color=", arrayList);
            }
            String str2 = this.light_theme_primary_color;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "light_theme_primary_color=", arrayList);
            }
            String str3 = this.dark_theme_primary_color;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "dark_theme_primary_color=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BrandColors{", "}", 0, null, null, 56);
        }
    }

    public final class LogoUrls extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LogoUrls> CREATOR;
        public final String dark_theme_url;
        public final String default_url;
        public final String light_theme_url;

        static {
            CashAppPayMerchantRenderData$LogoUrls$Companion$ADAPTER$1 cashAppPayMerchantRenderData$LogoUrls$Companion$ADAPTER$1 = new CashAppPayMerchantRenderData$LogoUrls$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LogoUrls.class), "type.googleapis.com/squareup.cash.pay.CashAppPayMerchantRenderData.LogoUrls", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_merchant.proto");
            ADAPTER = cashAppPayMerchantRenderData$LogoUrls$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayMerchantRenderData$LogoUrls$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogoUrls(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.default_url = str;
            this.light_theme_url = str2;
            this.dark_theme_url = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LogoUrls)) {
                return false;
            }
            LogoUrls logoUrls = (LogoUrls) obj;
            return Intrinsics.areEqual(unknownFields(), logoUrls.unknownFields()) && Intrinsics.areEqual(this.default_url, logoUrls.default_url) && Intrinsics.areEqual(this.light_theme_url, logoUrls.light_theme_url) && Intrinsics.areEqual(this.dark_theme_url, logoUrls.dark_theme_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.default_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.light_theme_url;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.dark_theme_url;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SupportConfig.Builder builder = new SupportConfig.Builder(22);
            builder.contact_support_url = this.default_url;
            builder.privacy_policy_url = this.light_theme_url;
            builder.terms_of_service_url = this.dark_theme_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.default_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "default_url=", arrayList);
            }
            String str2 = this.light_theme_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "light_theme_url=", arrayList);
            }
            String str3 = this.dark_theme_url;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "dark_theme_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LogoUrls{", "}", 0, null, null, 56);
        }
    }

    static {
        CashAppPayMerchantRenderData$Companion$ADAPTER$1 cashAppPayMerchantRenderData$Companion$ADAPTER$1 = new CashAppPayMerchantRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppPayMerchantRenderData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayMerchantRenderData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_merchant.proto");
        ADAPTER = cashAppPayMerchantRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayMerchantRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayMerchantRenderData(String str, String str2, String str3, String str4, LogoUrls logoUrls, BrandColors brandColors, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.merchant_id = str;
        this.merchant_token = str2;
        this.brand_id = str3;
        this.display_name = str4;
        this.logo_urls = logoUrls;
        this.brand_colors = brandColors;
        this.is_template_avatar = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppPayMerchantRenderData)) {
            return false;
        }
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = (CashAppPayMerchantRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppPayMerchantRenderData.unknownFields()) && Intrinsics.areEqual(this.merchant_id, cashAppPayMerchantRenderData.merchant_id) && Intrinsics.areEqual(this.merchant_token, cashAppPayMerchantRenderData.merchant_token) && Intrinsics.areEqual(this.brand_id, cashAppPayMerchantRenderData.brand_id) && Intrinsics.areEqual(this.display_name, cashAppPayMerchantRenderData.display_name) && Intrinsics.areEqual(this.logo_urls, cashAppPayMerchantRenderData.logo_urls) && Intrinsics.areEqual(this.brand_colors, cashAppPayMerchantRenderData.brand_colors) && Intrinsics.areEqual(this.is_template_avatar, cashAppPayMerchantRenderData.is_template_avatar);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.merchant_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.merchant_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.brand_id;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.display_name;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        LogoUrls logoUrls = this.logo_urls;
        int hashCode6 = (hashCode5 + (logoUrls != null ? logoUrls.hashCode() : 0)) * 37;
        BrandColors brandColors = this.brand_colors;
        int hashCode7 = (hashCode6 + (brandColors != null ? brandColors.hashCode() : 0)) * 37;
        Boolean bool = this.is_template_avatar;
        int hashCode8 = hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(12);
        builder.customer_identifier = this.merchant_id;
        builder.full_name = this.merchant_token;
        builder.profile_photo_url = this.brand_id;
        builder.cashtag = this.display_name;
        builder.added_at = this.logo_urls;
        builder.participant_type = this.brand_colors;
        builder.aggregated_contribution_amount = this.is_template_avatar;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.merchant_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchant_id=", arrayList);
        }
        String str2 = this.merchant_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "merchant_token=", arrayList);
        }
        String str3 = this.brand_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "brand_id=", arrayList);
        }
        String str4 = this.display_name;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "display_name=", arrayList);
        }
        LogoUrls logoUrls = this.logo_urls;
        if (logoUrls != null) {
            arrayList.add("logo_urls=" + logoUrls);
        }
        BrandColors brandColors = this.brand_colors;
        if (brandColors != null) {
            arrayList.add("brand_colors=" + brandColors);
        }
        Boolean bool = this.is_template_avatar;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_template_avatar=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppPayMerchantRenderData{", "}", 0, null, null, 56);
    }
}
