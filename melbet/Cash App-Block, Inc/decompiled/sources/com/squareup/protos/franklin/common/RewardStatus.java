package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzjn;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.protos.cash.cashidv.common.Button;
import com.squareup.protos.cash.cashidv.common.IdvEndResultScreenConfig;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessage;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessageBadge;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessageContent;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessageSubjectType;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessageType;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard$TypeDetails$BrandCardDetails;
import com.squareup.protos.cash.local.client.app.v1.card.MiniCard;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageFormat;
import com.squareup.protos.cash.messagingplatformcommon.common.MessageType;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsMetadata;
import com.squareup.protos.cash.shop.rendering.api.ClusterItem;
import com.squareup.protos.cash.shop.rendering.api.CountdownCaption;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.cash.shop.rendering.api.OfferBadge;
import com.squareup.protos.cash.shop.rendering.api.OfferDetailSheet;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.protos.cash.shop.rendering.api.SheetStyledDetails;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.RegisterSmsRequest;
import com.squareup.protos.franklin.common.GenericNonPaymentRenderData;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import okio.internal.ResourceFileSystem;

/* loaded from: classes8.dex */
public final class RewardStatus extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RewardStatus> CREATOR;
    public final Integer available_reward_payments;
    public final String code_entry_client_route;
    public final Boolean code_entry_enabled;
    public final Integer completed_reward_payments;
    public final Expiration expiration;
    public final Integer minimum_code_length;
    public final ProfileRow referral_status_screen;
    public final Integer reward_button_priority;
    public final String reward_button_text;
    public final String reward_header_text;
    public final String reward_main_text;
    public final Money reward_payment_amount;
    public final Boolean reward_screen_enabled;

    /* loaded from: classes.dex */
    public enum Expiration implements WireEnum {
        VALID(0),
        EXPIRING(1);

        public static final RewardStatus$Expiration$Companion$ADAPTER$1 ADAPTER;
        public static final ResourceFileSystem.Companion Companion;
        public final int value;

        static {
            Expiration expiration = VALID;
            Companion = new ResourceFileSystem.Companion();
            ADAPTER = new RewardStatus$Expiration$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Expiration.class), Syntax.PROTO_2, expiration);
        }

        Expiration(int i) {
            this.value = i;
        }

        public static final Expiration fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return VALID;
            }
            if (i != 1) {
                return null;
            }
            return EXPIRING;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        RewardStatus$Companion$ADAPTER$1 rewardStatus$Companion$ADAPTER$1 = new RewardStatus$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RewardStatus.class), "type.googleapis.com/squareup.franklin.common.RewardStatus", Syntax.PROTO_2, null, "squareup/franklin/common/reward_status.proto");
        ADAPTER = rewardStatus$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(rewardStatus$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardStatus(Boolean bool, Integer num, String str, Boolean bool2, String str2, Integer num2, String str3, String str4, Integer num3, Integer num4, Money money, Expiration expiration, ProfileRow profileRow, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.code_entry_enabled = bool;
        this.minimum_code_length = num;
        this.code_entry_client_route = str;
        this.reward_screen_enabled = bool2;
        this.reward_button_text = str2;
        this.reward_button_priority = num2;
        this.reward_header_text = str3;
        this.reward_main_text = str4;
        this.completed_reward_payments = num3;
        this.available_reward_payments = num4;
        this.reward_payment_amount = money;
        this.expiration = expiration;
        this.referral_status_screen = profileRow;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RewardStatus)) {
            return false;
        }
        RewardStatus rewardStatus = (RewardStatus) obj;
        return Intrinsics.areEqual(unknownFields(), rewardStatus.unknownFields()) && Intrinsics.areEqual(this.code_entry_enabled, rewardStatus.code_entry_enabled) && Intrinsics.areEqual(this.minimum_code_length, rewardStatus.minimum_code_length) && Intrinsics.areEqual(this.code_entry_client_route, rewardStatus.code_entry_client_route) && Intrinsics.areEqual(this.reward_screen_enabled, rewardStatus.reward_screen_enabled) && Intrinsics.areEqual(this.reward_button_text, rewardStatus.reward_button_text) && Intrinsics.areEqual(this.reward_button_priority, rewardStatus.reward_button_priority) && Intrinsics.areEqual(this.reward_header_text, rewardStatus.reward_header_text) && Intrinsics.areEqual(this.reward_main_text, rewardStatus.reward_main_text) && Intrinsics.areEqual(this.completed_reward_payments, rewardStatus.completed_reward_payments) && Intrinsics.areEqual(this.available_reward_payments, rewardStatus.available_reward_payments) && Intrinsics.areEqual(this.reward_payment_amount, rewardStatus.reward_payment_amount) && this.expiration == rewardStatus.expiration && Intrinsics.areEqual(this.referral_status_screen, rewardStatus.referral_status_screen);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.code_entry_enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Integer num = this.minimum_code_length;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str = this.code_entry_client_route;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool2 = this.reward_screen_enabled;
        int hashCode5 = (hashCode4 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str2 = this.reward_button_text;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num2 = this.reward_button_priority;
        int hashCode7 = (hashCode6 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        String str3 = this.reward_header_text;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.reward_main_text;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Integer num3 = this.completed_reward_payments;
        int hashCode10 = (hashCode9 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
        Integer num4 = this.available_reward_payments;
        int hashCode11 = (hashCode10 + (num4 != null ? Integer.hashCode(num4.intValue()) : 0)) * 37;
        Money money = this.reward_payment_amount;
        int hashCode12 = (hashCode11 + (money != null ? money.hashCode() : 0)) * 37;
        Expiration expiration = this.expiration;
        int hashCode13 = (hashCode12 + (expiration != null ? expiration.hashCode() : 0)) * 37;
        ProfileRow profileRow = this.referral_status_screen;
        int hashCode14 = hashCode13 + (profileRow != null ? profileRow.hashCode() : 0);
        this.hashCode = hashCode14;
        return hashCode14;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.code_entry_enabled = this.code_entry_enabled;
        builder.minimum_code_length = this.minimum_code_length;
        builder.code_entry_client_route = this.code_entry_client_route;
        builder.reward_screen_enabled = this.reward_screen_enabled;
        builder.reward_button_text = this.reward_button_text;
        builder.reward_button_priority = this.reward_button_priority;
        builder.reward_header_text = this.reward_header_text;
        builder.reward_main_text = this.reward_main_text;
        builder.completed_reward_payments = this.completed_reward_payments;
        builder.available_reward_payments = this.available_reward_payments;
        builder.reward_payment_amount = this.reward_payment_amount;
        builder.expiration = this.expiration;
        builder.referral_status_screen = this.referral_status_screen;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.code_entry_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("code_entry_enabled=", bool, arrayList);
        }
        Integer num = this.minimum_code_length;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("minimum_code_length=", num, arrayList);
        }
        if (this.code_entry_client_route != null) {
            arrayList.add("code_entry_client_route=██");
        }
        Boolean bool2 = this.reward_screen_enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("reward_screen_enabled=", bool2, arrayList);
        }
        String str = this.reward_button_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "reward_button_text=", arrayList);
        }
        Integer num2 = this.reward_button_priority;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("reward_button_priority=", num2, arrayList);
        }
        String str2 = this.reward_header_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "reward_header_text=", arrayList);
        }
        String str3 = this.reward_main_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "reward_main_text=", arrayList);
        }
        Integer num3 = this.completed_reward_payments;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("completed_reward_payments=", num3, arrayList);
        }
        Integer num4 = this.available_reward_payments;
        if (num4 != null) {
            re$$ExternalSyntheticOutline0.m("available_reward_payments=", num4, arrayList);
        }
        Money money = this.reward_payment_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("reward_payment_amount=", money, arrayList);
        }
        Expiration expiration = this.expiration;
        if (expiration != null) {
            arrayList.add("expiration=" + expiration);
        }
        ProfileRow profileRow = this.referral_status_screen;
        if (profileRow != null) {
            arrayList.add("referral_status_screen=" + profileRow);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RewardStatus{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object available_reward_payments;
        public Serializable code_entry_client_route;
        public Object code_entry_enabled;
        public Serializable completed_reward_payments;
        public Serializable expiration;
        public Object minimum_code_length;
        public Object referral_status_screen;
        public Object reward_button_priority;
        public Serializable reward_button_text;
        public Serializable reward_header_text;
        public Serializable reward_main_text;
        public Serializable reward_payment_amount;
        public Object reward_screen_enabled;

        public Builder() {
            this.$r8$classId = 8;
            this.available_reward_payments = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new RewardStatus((Boolean) this.code_entry_enabled, (Integer) this.minimum_code_length, (String) this.code_entry_client_route, (Boolean) this.reward_screen_enabled, (String) this.reward_button_text, (Integer) this.reward_button_priority, (String) this.reward_header_text, (String) this.reward_main_text, (Integer) this.completed_reward_payments, (Integer) this.available_reward_payments, (Money) this.reward_payment_amount, (Expiration) this.expiration, (ProfileRow) this.referral_status_screen, buildUnknownFields());
                case 1:
                    return new ComposePlatform((ComposePlatform.Column) this.code_entry_enabled, (ComposePlatform.Row) this.reward_screen_enabled, (ComposePlatform.Box) this.minimum_code_length, (ComposePlatform.Text) this.reward_button_priority, (ComposePlatform.Image) this.completed_reward_payments, (ComposePlatform.Button) this.available_reward_payments, (ComposePlatform.TextField) this.code_entry_client_route, (ComposePlatform.Switch) this.reward_button_text, (ComposePlatform.Slider) this.reward_header_text, (ComposePlatform.DropdownMenu) this.reward_main_text, (ComposePlatform.DatePicker) this.reward_payment_amount, (ComposePlatform.ProgressIndicator) this.expiration, (List) this.referral_status_screen, buildUnknownFields());
                case 2:
                    return new IdvEndResultScreenConfig((Boolean) this.code_entry_enabled, (String) this.code_entry_client_route, (String) this.reward_button_text, (String) this.reward_header_text, (String) this.reward_main_text, (Button) this.minimum_code_length, (Button) this.reward_button_priority, (Button) this.completed_reward_payments, (Button) this.available_reward_payments, (Boolean) this.reward_screen_enabled, (Button) this.reward_payment_amount, (Boolean) this.expiration, (Boolean) this.referral_status_screen, buildUnknownFields());
                case 3:
                    return new MarketingMessage((String) this.code_entry_client_route, (MarketingMessageType) this.code_entry_enabled, (MarketingMessageSubjectType) this.reward_screen_enabled, (String) this.reward_button_text, (MarketingMessageContent) this.minimum_code_length, (Long) this.reward_button_priority, (Long) this.completed_reward_payments, (String) this.reward_header_text, (LocalColor) this.available_reward_payments, (LocalColor) this.reward_main_text, (LocalImage) this.reward_payment_amount, (Long) this.expiration, (MarketingMessageBadge) this.referral_status_screen, buildUnknownFields());
                case 4:
                    return new LocalCard((String) this.code_entry_client_route, (String) this.reward_button_text, (List) this.code_entry_enabled, (String) this.reward_header_text, (List) this.reward_screen_enabled, (List) this.minimum_code_length, (String) this.reward_main_text, (LocalCard$TypeDetails$BrandCardDetails) this.reward_button_priority, (LocalCard.ColorPalette) this.completed_reward_payments, (MiniCard) this.available_reward_payments, (Image) this.reward_payment_amount, (String) this.expiration, (Color) this.referral_status_screen, buildUnknownFields());
                case 5:
                    return new AppMessage((String) this.code_entry_client_route, (String) this.reward_button_text, (zzjn) this.reward_screen_enabled, (AppMessageFormat) this.minimum_code_length, (Boolean) this.code_entry_enabled, (String) this.reward_header_text, (Long) this.reward_button_priority, (MessageType) this.completed_reward_payments, (String) this.reward_main_text, (Long) this.available_reward_payments, (String) this.reward_payment_amount, (String) this.expiration, (Long) this.referral_status_screen, buildUnknownFields());
                case 6:
                    return new ClusterItem((AnalyticsEvent) this.code_entry_enabled, (TapAction) this.reward_screen_enabled, (Avatar) this.minimum_code_length, (String) this.code_entry_client_route, (String) this.reward_button_text, (EngagedItemToken) this.reward_button_priority, (LocalizedString) this.completed_reward_payments, (LocalizedString) this.available_reward_payments, (AnalyticsMetadata) this.reward_main_text, (String) this.reward_header_text, (StyledText) this.reward_payment_amount, (StyledText) this.expiration, (OfferBadge) this.referral_status_screen, buildUnknownFields());
                case 7:
                    return new OfferDetailSheet((OfferType) this.code_entry_enabled, (String) this.code_entry_client_route, (String) this.reward_button_text, (TapAction) this.reward_screen_enabled, (Avatar) this.minimum_code_length, (String) this.reward_header_text, (String) this.reward_main_text, (com.squareup.protos.cash.shop.rendering.api.Button) this.reward_button_priority, (com.squareup.protos.cash.shop.rendering.api.Button) this.completed_reward_payments, (CountdownCaption) this.available_reward_payments, (com.squareup.protos.cash.shop.rendering.api.Button) this.reward_payment_amount, (SheetStyledDetails) this.expiration, (FormattedDetail) this.referral_status_screen, buildUnknownFields());
                case 8:
                    return new RegisterSmsRequest((RequestContext) this.minimum_code_length, (String) this.code_entry_client_route, (SmsDeliveryMechanism) this.reward_button_priority, (RegisterSmsRequest.Scenario) this.completed_reward_payments, (Boolean) this.code_entry_enabled, (List) this.available_reward_payments, (Boolean) this.reward_screen_enabled, (DeviceLocationHeuristics) this.reward_payment_amount, (String) this.reward_button_text, (String) this.reward_header_text, (String) this.reward_main_text, (String) this.expiration, (String) this.referral_status_screen, buildUnknownFields());
                default:
                    return new GenericNonPaymentRenderData((GenericNonPaymentRenderData.Title) this.code_entry_enabled, (GenericNonPaymentRenderData.Subtitle) this.reward_screen_enabled, (GenericNonPaymentRenderData.Avatar) this.minimum_code_length, (GenericNonPaymentRenderData.Header) this.reward_button_priority, (GenericNonPaymentRenderData.InlineButton) this.completed_reward_payments, (GenericNonPaymentRenderData.Button) this.available_reward_payments, (GenericNonPaymentRenderData.Button) this.reward_button_text, (GenericNonPaymentRenderData.MoreInfoSheet) this.reward_header_text, (GenericNonPaymentRenderData.ThreadedView) this.reward_main_text, (GenericNonPaymentRenderData.HelpCenterLinkType) this.reward_payment_amount, (String) this.code_entry_client_route, (GenericNonPaymentRenderData.TertiaryLabelSuffix) this.expiration, (GenericNonPaymentRenderData.Avatar) this.referral_status_screen, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
