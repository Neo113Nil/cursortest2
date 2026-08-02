package com.squareup.protos.rewardly.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cashsubscriptions.common.v1_0.PaymentType;
import com.squareup.cash.cashsubscriptions.common.v1_0.ProductType;
import com.squareup.cash.cashsubscriptions.common.v1_0.Subscription;
import com.squareup.cash.cashsubscriptions.common.v1_0.Subscription$Tier$CashGreenTier;
import com.squareup.cash.cashsubscriptions.common.v1_0.SubscriptionState;
import com.squareup.protos.cash.investcrypto.resources.CashInInstrumentType;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.cash.investcrypto.resources.TransactionOrchestrator;
import com.squareup.protos.cash.kgoosememorystore.api.v1.FinancialKey;
import com.squareup.protos.cash.kgoosememorystore.api.v1.Memory;
import com.squareup.protos.cash.kgoosememorystore.api.v1.MemoryOrigin;
import com.squareup.protos.cash.kgoosememorystore.api.v1.MemoryStatus;
import com.squareup.protos.cash.kgoosememorystore.api.v1.MemoryType;
import com.squareup.protos.cash.kgoosememorystore.api.v1.TemporalQualifier;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ReloadSchedule;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadStatus;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.merchants.api.UserLocale;
import com.squareup.protos.wire.roster.mds.BusinessUnit;
import com.squareup.protos.wire.roster.mds.Merchant;
import com.squareup.protos.wire.roster.mds.MerchantCapabilities;
import com.squareup.protos.wire.roster.mds.Names;
import com.squareup.protos.wire.roster.mds.StatusScope$Status;
import com.squareup.protos.wire.roster.mds.Unit;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiReward extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiReward> CREATOR;
    public final Long activation_date_time_ms;
    public final String affiliate_link_url;
    public final AppLinks app_links;
    public final List boost_attributes;
    public final String category;
    public final String discount_text;
    public final Boolean draggable;
    public final Long expiration_date_time_ms;
    public final String full_title_text;
    public final Boolean is_custom_offer;
    public final String main_text;
    public final String merchant_name;
    public final List merchant_tokens;
    public final String offerly_token;
    public final Boolean redeemable_with_cash_app_pay;
    public final Boolean redeemable_with_cash_card;
    public final UiRewardAvatars reward_avatars;
    public final String title;
    public final String token;
    public final String user_agent;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable activation_date_time_ms;
        public Serializable affiliate_link_url;
        public Serializable app_links;
        public Object boost_attributes;
        public String category;
        public Serializable discount_text;
        public Serializable draggable;
        public Serializable expiration_date_time_ms;
        public Object full_title_text;
        public Serializable is_custom_offer;
        public Serializable main_text;
        public Serializable merchant_name;
        public Object merchant_tokens;
        public Serializable offerly_token;
        public Serializable redeemable_with_cash_app_pay;
        public Serializable redeemable_with_cash_card;
        public Object reward_avatars;
        public String title;
        public String token;
        public Object user_agent;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new UiReward(this.token, this.category, (UiRewardAvatars) this.reward_avatars, this.title, (String) this.main_text, (String) this.affiliate_link_url, (String) this.user_agent, (String) this.full_title_text, (Long) this.activation_date_time_ms, (Long) this.expiration_date_time_ms, (List) this.boost_attributes, (String) this.discount_text, (Boolean) this.draggable, (String) this.merchant_name, (List) this.merchant_tokens, (String) this.offerly_token, (Boolean) this.is_custom_offer, (Boolean) this.redeemable_with_cash_card, (Boolean) this.redeemable_with_cash_app_pay, (AppLinks) this.app_links, buildUnknownFields());
                case 1:
                    return new Subscription(this.token, this.category, (ProductType) this.offerly_token, (PaymentType) this.reward_avatars, (SubscriptionState) this.boost_attributes, (Subscription$Tier$CashGreenTier) this.merchant_tokens, this.title, (String) this.main_text, (String) this.affiliate_link_url, (String) this.user_agent, (String) this.full_title_text, (String) this.discount_text, (Long) this.activation_date_time_ms, (Long) this.expiration_date_time_ms, (Long) this.draggable, (Long) this.is_custom_offer, (Long) this.redeemable_with_cash_card, (String) this.merchant_name, (Long) this.redeemable_with_cash_app_pay, (Long) this.app_links, buildUnknownFields());
                case 2:
                    return new Order.FundingSource((Money) this.offerly_token, this.token, (CashInInstrumentType) this.reward_avatars, (Money) this.activation_date_time_ms, this.category, this.title, (String) this.main_text, (String) this.affiliate_link_url, (Money) this.expiration_date_time_ms, (String) this.user_agent, (String) this.full_title_text, (String) this.discount_text, (String) this.merchant_name, (Money) this.boost_attributes, (Money) this.merchant_tokens, (Money) this.draggable, (Money) this.is_custom_offer, (Money) this.redeemable_with_cash_card, (Money) this.redeemable_with_cash_app_pay, (TransactionOrchestrator) this.app_links, buildUnknownFields());
                case 3:
                    return new Memory(this.token, this.category, (MemoryType) this.affiliate_link_url, this.title, (Float) this.user_agent, (List) this.boost_attributes, (List) this.merchant_tokens, (List) this.full_title_text, (Instant) this.discount_text, (Instant) this.merchant_name, (MemoryStatus) this.offerly_token, (List) this.reward_avatars, (String) this.main_text, (MemoryOrigin) this.activation_date_time_ms, (FinancialKey) this.expiration_date_time_ms, (Double) this.draggable, (Instant) this.is_custom_offer, (Instant) this.redeemable_with_cash_card, (Integer) this.redeemable_with_cash_app_pay, (TemporalQualifier) this.app_links, buildUnknownFields());
                case 4:
                    return new ScheduledReloadPreference((Boolean) this.draggable, (Money) this.main_text, (ReloadSchedule) this.affiliate_link_url, (ScheduledReloadPreference.Type) this.user_agent, this.token, (Instant) this.full_title_text, this.category, (Instant) this.discount_text, (Integer) this.merchant_name, (ScheduledReloadPreference.TargetIdentifierTokenType) this.offerly_token, this.title, (ScheduledReloadPreference.SourceType) this.reward_avatars, (List) this.boost_attributes, (ScheduledReloadPreference.ReminderMode) this.expiration_date_time_ms, (Integer) this.merchant_tokens, (Instant) this.is_custom_offer, (Long) this.activation_date_time_ms, (ScheduledReloadPreference.PreferenceDisabledReason) this.redeemable_with_cash_card, (Instant) this.redeemable_with_cash_app_pay, (ScheduledReloadStatus) this.app_links, buildUnknownFields());
                default:
                    return new Merchant(this.token, (Long) this.activation_date_time_ms, (Names) this.discount_text, (List) this.boost_attributes, (UserLocale) this.merchant_name, (Country) this.offerly_token, (StatusScope$Status) this.reward_avatars, (Long) this.expiration_date_time_ms, (Long) this.merchant_tokens, (Long) this.is_custom_offer, this.category, (Unit) this.redeemable_with_cash_card, this.title, (String) this.main_text, (String) this.affiliate_link_url, (Boolean) this.draggable, (MerchantCapabilities) this.redeemable_with_cash_app_pay, (BusinessUnit) this.app_links, (String) this.user_agent, (String) this.full_title_text, buildUnknownFields());
            }
        }
    }

    static {
        UiReward$Companion$ADAPTER$1 uiReward$Companion$ADAPTER$1 = new UiReward$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiReward.class), "type.googleapis.com/squareup.rewardly.ui.UiReward", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
        ADAPTER = uiReward$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiReward$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiReward(String str, String str2, UiRewardAvatars uiRewardAvatars, String str3, String str4, String str5, String str6, String str7, Long l, Long l2, List list, String str8, Boolean bool, String str9, List list2, String str10, Boolean bool2, Boolean bool3, Boolean bool4, AppLinks appLinks, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.token = str;
        this.category = str2;
        this.reward_avatars = uiRewardAvatars;
        this.title = str3;
        this.main_text = str4;
        this.affiliate_link_url = str5;
        this.user_agent = str6;
        this.full_title_text = str7;
        this.activation_date_time_ms = l;
        this.expiration_date_time_ms = l2;
        this.discount_text = str8;
        this.draggable = bool;
        this.merchant_name = str9;
        this.offerly_token = str10;
        this.is_custom_offer = bool2;
        this.redeemable_with_cash_card = bool3;
        this.redeemable_with_cash_app_pay = bool4;
        this.app_links = appLinks;
        this.boost_attributes = TransactorKt.immutableCopyOf("boost_attributes", list);
        this.merchant_tokens = TransactorKt.immutableCopyOf("merchant_tokens", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiReward)) {
            return false;
        }
        UiReward uiReward = (UiReward) obj;
        return Intrinsics.areEqual(unknownFields(), uiReward.unknownFields()) && Intrinsics.areEqual(this.token, uiReward.token) && Intrinsics.areEqual(this.category, uiReward.category) && Intrinsics.areEqual(this.reward_avatars, uiReward.reward_avatars) && Intrinsics.areEqual(this.title, uiReward.title) && Intrinsics.areEqual(this.main_text, uiReward.main_text) && Intrinsics.areEqual(this.affiliate_link_url, uiReward.affiliate_link_url) && Intrinsics.areEqual(this.user_agent, uiReward.user_agent) && Intrinsics.areEqual(this.full_title_text, uiReward.full_title_text) && Intrinsics.areEqual(this.activation_date_time_ms, uiReward.activation_date_time_ms) && Intrinsics.areEqual(this.expiration_date_time_ms, uiReward.expiration_date_time_ms) && Intrinsics.areEqual(this.boost_attributes, uiReward.boost_attributes) && Intrinsics.areEqual(this.discount_text, uiReward.discount_text) && Intrinsics.areEqual(this.draggable, uiReward.draggable) && Intrinsics.areEqual(this.merchant_name, uiReward.merchant_name) && Intrinsics.areEqual(this.merchant_tokens, uiReward.merchant_tokens) && Intrinsics.areEqual(this.offerly_token, uiReward.offerly_token) && Intrinsics.areEqual(this.is_custom_offer, uiReward.is_custom_offer) && Intrinsics.areEqual(this.redeemable_with_cash_card, uiReward.redeemable_with_cash_card) && Intrinsics.areEqual(this.redeemable_with_cash_app_pay, uiReward.redeemable_with_cash_app_pay) && Intrinsics.areEqual(this.app_links, uiReward.app_links);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.category;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        UiRewardAvatars uiRewardAvatars = this.reward_avatars;
        int hashCode4 = (hashCode3 + (uiRewardAvatars != null ? uiRewardAvatars.hashCode() : 0)) * 37;
        String str3 = this.title;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.main_text;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.affiliate_link_url;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.user_agent;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.full_title_text;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Long l = this.activation_date_time_ms;
        int hashCode10 = (hashCode9 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.expiration_date_time_ms;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode10 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37, 37, this.boost_attributes);
        String str8 = this.discount_text;
        int hashCode11 = (m + (str8 != null ? str8.hashCode() : 0)) * 37;
        Boolean bool = this.draggable;
        int hashCode12 = (hashCode11 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str9 = this.merchant_name;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 37, 37, this.merchant_tokens);
        String str10 = this.offerly_token;
        int hashCode13 = (m2 + (str10 != null ? str10.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_custom_offer;
        int hashCode14 = (hashCode13 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.redeemable_with_cash_card;
        int hashCode15 = (hashCode14 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.redeemable_with_cash_app_pay;
        int hashCode16 = (hashCode15 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        AppLinks appLinks = this.app_links;
        int hashCode17 = hashCode16 + (appLinks != null ? appLinks.hashCode() : 0);
        this.hashCode = hashCode17;
        return hashCode17;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.token = this.token;
        builder.category = this.category;
        builder.reward_avatars = this.reward_avatars;
        builder.title = this.title;
        builder.main_text = this.main_text;
        builder.affiliate_link_url = this.affiliate_link_url;
        builder.user_agent = this.user_agent;
        builder.full_title_text = this.full_title_text;
        builder.activation_date_time_ms = this.activation_date_time_ms;
        builder.expiration_date_time_ms = this.expiration_date_time_ms;
        builder.boost_attributes = this.boost_attributes;
        builder.discount_text = this.discount_text;
        builder.draggable = this.draggable;
        builder.merchant_name = this.merchant_name;
        builder.merchant_tokens = this.merchant_tokens;
        builder.offerly_token = this.offerly_token;
        builder.is_custom_offer = this.is_custom_offer;
        builder.redeemable_with_cash_card = this.redeemable_with_cash_card;
        builder.redeemable_with_cash_app_pay = this.redeemable_with_cash_app_pay;
        builder.app_links = this.app_links;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.category;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "category=", arrayList);
        }
        UiRewardAvatars uiRewardAvatars = this.reward_avatars;
        if (uiRewardAvatars != null) {
            arrayList.add("reward_avatars=" + uiRewardAvatars);
        }
        String str3 = this.title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "title=", arrayList);
        }
        String str4 = this.main_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "main_text=", arrayList);
        }
        String str5 = this.affiliate_link_url;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "affiliate_link_url=", arrayList);
        }
        String str6 = this.user_agent;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "user_agent=", arrayList);
        }
        String str7 = this.full_title_text;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "full_title_text=", arrayList);
        }
        Long l = this.activation_date_time_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("activation_date_time_ms=", l, arrayList);
        }
        Long l2 = this.expiration_date_time_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expiration_date_time_ms=", l2, arrayList);
        }
        List list = this.boost_attributes;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("boost_attributes=", arrayList, list);
        }
        String str8 = this.discount_text;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "discount_text=", arrayList);
        }
        Boolean bool = this.draggable;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("draggable=", bool, arrayList);
        }
        String str9 = this.merchant_name;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "merchant_name=", arrayList);
        }
        List list2 = this.merchant_tokens;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("merchant_tokens=", arrayList, list2);
        }
        String str10 = this.offerly_token;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "offerly_token=", arrayList);
        }
        Boolean bool2 = this.is_custom_offer;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_custom_offer=", bool2, arrayList);
        }
        Boolean bool3 = this.redeemable_with_cash_card;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("redeemable_with_cash_card=", bool3, arrayList);
        }
        Boolean bool4 = this.redeemable_with_cash_app_pay;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("redeemable_with_cash_app_pay=", bool4, arrayList);
        }
        AppLinks appLinks = this.app_links;
        if (appLinks != null) {
            arrayList.add("app_links=" + appLinks);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiReward{", "}", 0, null, null, 56);
    }
}
