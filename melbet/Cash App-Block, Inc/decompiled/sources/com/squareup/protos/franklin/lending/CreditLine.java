package com.squareup.protos.franklin.lending;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzhq;
import com.google.android.gms.internal.mlkit_vision_face.zzeb;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.protos.cash.cashidv.common.EIdvIntroBlockerTemplateName;
import com.squareup.protos.cash.cashidv.common.EidvFailedBlockerTemplateName;
import com.squareup.protos.cash.cashidv.common.IdvEndResultScreenConfig;
import com.squareup.protos.cash.cashidv.common.IdvRenderConfig;
import com.squareup.protos.cash.cashidv.common.InReviewBlockerTemplateName;
import com.squareup.protos.cash.cashidv.common.NotVerifiedBlockerTemplateName;
import com.squareup.protos.cash.cashidv.common.ProvideLegalBlockerTemplateName;
import com.squareup.protos.cash.cashidv.common.SsnCollectionBlockerTemplateName;
import com.squareup.protos.cash.cashidv.common.SsnScreenRenderConfig;
import com.squareup.protos.cash.cashidv.common.SsnTooltipConfig;
import com.squareup.protos.cash.cashidv.common.VerifiedBlockerTemplateName;
import com.squareup.protos.cash.investcrypto.resources.OrderStateReason;
import com.squareup.protos.cash.local.client.v1.CreateOrderRequest;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentOption;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.local.client.v1.OrderWorkflow;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.cash.shop.rendering.api.OfferDetailListSheet;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.franklin.common.CryptoOrderRenderData;
import com.squareup.protos.franklin.common.CryptoPayrollRenderData;
import com.squareup.protos.franklin.common.ProfileRow;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.protos.person.Alias;
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
import squareup.cash.savings.GoalFolder;

/* loaded from: classes8.dex */
public final class CreditLine extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreditLine> CREATOR;
    public final Alert alert;
    public final Money available_amount;
    public final Money credit_limit;
    public final CreditLineLimitData credit_line_limit_data;
    public final CreditLineStatusData credit_line_status_data;
    public final CreditLineStatusIcon credit_line_status_icon;
    public final FirstTimeBorrowData first_time_borrow_data;
    public final String instrument_display_name;
    public final String instrument_subtitle;
    public final LendingProduct lending_product;
    public final LocalizableString localizable_instrument_display_name;
    public final LocalizableString localizable_instrument_subtitle;
    public final Money minimum_loan_amount;
    public final Money outstanding_amount;
    public final List quick_amounts;
    public final Integer setup_fee_bps;
    public final Boolean skip_loan_amount_selection;
    public final String token;
    public final UnlockBorrowData unlock_borrow_data;

    public final class Alert extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Alert> CREATOR;
        public final String dismiss_button_title;
        public final DisplayTime displayTime;
        public final String message;
        public final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class DisplayTime implements WireEnum {
            public static final /* synthetic */ DisplayTime[] $VALUES;
            public static final CreditLine$Alert$DisplayTime$Companion$ADAPTER$1 ADAPTER;
            public static final DisplayTime BORROW_ENTRY;
            public static final Trigger.Companion Companion;

            static {
                DisplayTime displayTime = new DisplayTime("BORROW_ENTRY", 0);
                BORROW_ENTRY = displayTime;
                $VALUES = new DisplayTime[]{displayTime};
                Companion = new Trigger.Companion();
                ADAPTER = new CreditLine$Alert$DisplayTime$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisplayTime.class), Syntax.PROTO_2, null);
            }

            public static final DisplayTime fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return BORROW_ENTRY;
                }
                return null;
            }

            public static DisplayTime valueOf(String str) {
                return (DisplayTime) Enum.valueOf(DisplayTime.class, str);
            }

            public static DisplayTime[] values() {
                return (DisplayTime[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return 1;
            }
        }

        static {
            CreditLine$Alert$Companion$ADAPTER$1 creditLine$Alert$Companion$ADAPTER$1 = new CreditLine$Alert$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Alert.class), "type.googleapis.com/squareup.franklin.lending.CreditLine.Alert", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
            ADAPTER = creditLine$Alert$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(creditLine$Alert$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Alert(String str, String str2, String str3, DisplayTime displayTime, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.message = str;
            this.dismiss_button_title = str2;
            this.title = str3;
            this.displayTime = displayTime;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Alert)) {
                return false;
            }
            Alert alert = (Alert) obj;
            return Intrinsics.areEqual(unknownFields(), alert.unknownFields()) && Intrinsics.areEqual(this.message, alert.message) && Intrinsics.areEqual(this.dismiss_button_title, alert.dismiss_button_title) && Intrinsics.areEqual(this.title, alert.title) && this.displayTime == alert.displayTime;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.message;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.dismiss_button_title;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.title;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            DisplayTime displayTime = this.displayTime;
            int hashCode5 = hashCode4 + (displayTime != null ? displayTime.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiDda.Builder builder = new UiDda.Builder(3);
            builder.account = this.message;
            builder.enabled = this.dismiss_button_title;
            builder.button = this.title;
            builder.dda_form = this.displayTime;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.message;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message=", arrayList);
            }
            String str2 = this.dismiss_button_title;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "dismiss_button_title=", arrayList);
            }
            String str3 = this.title;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "title=", arrayList);
            }
            DisplayTime displayTime = this.displayTime;
            if (displayTime != null) {
                arrayList.add("displayTime=" + displayTime);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Alert{", "}", 0, null, null, 56);
        }
    }

    public final class CreditLineLimitData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CreditLineLimitData> CREATOR;
        public final String additionalInfoText;
        public final List bullets;
        public final LocalizableString localizable_additionalInfoText;
        public final LocalizableString localizable_subtitle;
        public final LocalizableString localizable_title;
        public final String subtitle;
        public final String title;
        public final String url;

        public final class Bullet extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Bullet> CREATOR;
            public final Icon icon;
            public final LocalizableString localizable_text;
            public final String text;

            public enum Icon implements WireEnum {
                TIME(1),
                DEPOSIT(2),
                BANK(3);

                public final int value;
                public static final KeyScope.Companion Companion = new KeyScope.Companion();
                public static final CreditLine$CreditLineLimitData$Bullet$Icon$Companion$ADAPTER$1 ADAPTER = new CreditLine$CreditLineLimitData$Bullet$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);

                Icon(int i) {
                    this.value = i;
                }

                public static final Icon fromValue(int i) {
                    Companion.getClass();
                    if (i == 1) {
                        return TIME;
                    }
                    if (i == 2) {
                        return DEPOSIT;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return BANK;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                CreditLine$CreditLineLimitData$Bullet$Companion$ADAPTER$1 creditLine$CreditLineLimitData$Bullet$Companion$ADAPTER$1 = new CreditLine$CreditLineLimitData$Bullet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Bullet.class), "type.googleapis.com/squareup.franklin.lending.CreditLine.CreditLineLimitData.Bullet", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
                ADAPTER = creditLine$CreditLineLimitData$Bullet$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(creditLine$CreditLineLimitData$Bullet$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Bullet(String str, Icon icon, LocalizableString localizableString, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = str;
                this.icon = icon;
                this.localizable_text = localizableString;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Bullet)) {
                    return false;
                }
                Bullet bullet = (Bullet) obj;
                return Intrinsics.areEqual(unknownFields(), bullet.unknownFields()) && Intrinsics.areEqual(this.text, bullet.text) && this.icon == bullet.icon && Intrinsics.areEqual(this.localizable_text, bullet.localizable_text);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.text;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Icon icon = this.icon;
                int hashCode3 = (hashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
                LocalizableString localizableString = this.localizable_text;
                int hashCode4 = hashCode3 + (localizableString != null ? localizableString.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                GiftCard.Options.Builder builder = new GiftCard.Options.Builder(4);
                builder.label = this.text;
                builder.client_scenario = this.icon;
                builder.localizable_label = this.localizable_text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
                }
                Icon icon = this.icon;
                if (icon != null) {
                    arrayList.add("icon=" + icon);
                }
                LocalizableString localizableString = this.localizable_text;
                if (localizableString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Bullet{", "}", 0, null, null, 56);
            }
        }

        static {
            CreditLine$CreditLineLimitData$Companion$ADAPTER$1 creditLine$CreditLineLimitData$Companion$ADAPTER$1 = new CreditLine$CreditLineLimitData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreditLineLimitData.class), "type.googleapis.com/squareup.franklin.lending.CreditLine.CreditLineLimitData", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
            ADAPTER = creditLine$CreditLineLimitData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(creditLine$CreditLineLimitData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreditLineLimitData(String str, String str2, String str3, List list, String str4, LocalizableString localizableString, LocalizableString localizableString2, LocalizableString localizableString3, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.additionalInfoText = str3;
            this.url = str4;
            this.localizable_title = localizableString;
            this.localizable_subtitle = localizableString2;
            this.localizable_additionalInfoText = localizableString3;
            this.bullets = TransactorKt.immutableCopyOf("bullets", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreditLineLimitData)) {
                return false;
            }
            CreditLineLimitData creditLineLimitData = (CreditLineLimitData) obj;
            return Intrinsics.areEqual(unknownFields(), creditLineLimitData.unknownFields()) && Intrinsics.areEqual(this.title, creditLineLimitData.title) && Intrinsics.areEqual(this.subtitle, creditLineLimitData.subtitle) && Intrinsics.areEqual(this.additionalInfoText, creditLineLimitData.additionalInfoText) && Intrinsics.areEqual(this.bullets, creditLineLimitData.bullets) && Intrinsics.areEqual(this.url, creditLineLimitData.url) && Intrinsics.areEqual(this.localizable_title, creditLineLimitData.localizable_title) && Intrinsics.areEqual(this.localizable_subtitle, creditLineLimitData.localizable_subtitle) && Intrinsics.areEqual(this.localizable_additionalInfoText, creditLineLimitData.localizable_additionalInfoText);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.additionalInfoText;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.bullets);
            String str4 = this.url;
            int hashCode4 = (m + (str4 != null ? str4.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_title;
            int hashCode5 = (hashCode4 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_subtitle;
            int hashCode6 = (hashCode5 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
            LocalizableString localizableString3 = this.localizable_additionalInfoText;
            int hashCode7 = hashCode6 + (localizableString3 != null ? localizableString3.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GoalFolder.Builder builder = new GoalFolder.Builder(2);
            builder.token = this.title;
            builder.icon_unicode = this.subtitle;
            builder.completion_token = this.additionalInfoText;
            builder.goal_flow_parameters = this.bullets;
            builder.label = this.url;
            builder.met_goal = this.localizable_title;
            builder.goal_amount = this.localizable_subtitle;
            builder.goal_progress_percentage = this.localizable_additionalInfoText;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.subtitle;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
            }
            String str3 = this.additionalInfoText;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "additionalInfoText=", arrayList);
            }
            List list = this.bullets;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("bullets=", arrayList, list);
            }
            String str4 = this.url;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "url=", arrayList);
            }
            LocalizableString localizableString = this.localizable_title;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
            }
            LocalizableString localizableString2 = this.localizable_subtitle;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_subtitle=", localizableString2, arrayList);
            }
            LocalizableString localizableString3 = this.localizable_additionalInfoText;
            if (localizableString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_additionalInfoText=", localizableString3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CreditLineLimitData{", "}", 0, null, null, 56);
        }
    }

    public final class CreditLineStatusData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CreditLineStatusData> CREATOR;
        public final Boolean badged;
        public final Icon icon;
        public final LocalizableString localizable_subtitle;
        public final LocalizableString localizable_title;
        public final zzeb routing;
        public final String subtitle;
        public final String title;

        public enum Icon implements WireEnum {
            CHECKMARK(1),
            INFO(2);

            public final int value;
            public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
            public static final CreditLine$CreditLineStatusData$Icon$Companion$ADAPTER$1 ADAPTER = new CreditLine$CreditLineStatusData$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);

            Icon(int i) {
                this.value = i;
            }

            public static final Icon fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return CHECKMARK;
                }
                if (i != 2) {
                    return null;
                }
                return INFO;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            CreditLine$CreditLineStatusData$Companion$ADAPTER$1 creditLine$CreditLineStatusData$Companion$ADAPTER$1 = new CreditLine$CreditLineStatusData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreditLineStatusData.class), "type.googleapis.com/squareup.franklin.lending.CreditLine.CreditLineStatusData", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
            ADAPTER = creditLine$CreditLineStatusData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(creditLine$CreditLineStatusData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreditLineStatusData(Icon icon, String str, String str2, Boolean bool, zzeb zzebVar, LocalizableString localizableString, LocalizableString localizableString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = icon;
            this.title = str;
            this.subtitle = str2;
            this.badged = bool;
            this.routing = zzebVar;
            this.localizable_title = localizableString;
            this.localizable_subtitle = localizableString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreditLineStatusData)) {
                return false;
            }
            CreditLineStatusData creditLineStatusData = (CreditLineStatusData) obj;
            return Intrinsics.areEqual(unknownFields(), creditLineStatusData.unknownFields()) && this.icon == creditLineStatusData.icon && Intrinsics.areEqual(this.title, creditLineStatusData.title) && Intrinsics.areEqual(this.subtitle, creditLineStatusData.subtitle) && Intrinsics.areEqual(this.badged, creditLineStatusData.badged) && Intrinsics.areEqual(this.routing, creditLineStatusData.routing) && Intrinsics.areEqual(this.localizable_title, creditLineStatusData.localizable_title) && Intrinsics.areEqual(this.localizable_subtitle, creditLineStatusData.localizable_subtitle);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Icon icon = this.icon;
            int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtitle;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Boolean bool = this.badged;
            int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            zzeb zzebVar = this.routing;
            int hashCode6 = (hashCode5 + (zzebVar != null ? zzebVar.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_title;
            int hashCode7 = (hashCode6 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_subtitle;
            int hashCode8 = hashCode7 + (localizableString2 != null ? localizableString2.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Alias.Builder builder = new Alias.Builder(13, false);
            builder.f1407type = this.icon;
            builder.scope = this.title;
            builder.value = this.subtitle;
            builder.first_verified_at_ms = this.badged;
            builder.last_verified_at_ms = this.routing;
            builder.created_at = this.localizable_title;
            builder.updated_at = this.localizable_subtitle;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Icon icon = this.icon;
            if (icon != null) {
                arrayList.add("icon=" + icon);
            }
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.subtitle;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
            }
            Boolean bool = this.badged;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("badged=", bool, arrayList);
            }
            zzeb zzebVar = this.routing;
            if (zzebVar != null) {
                arrayList.add("routing=" + zzebVar);
            }
            LocalizableString localizableString = this.localizable_title;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
            }
            LocalizableString localizableString2 = this.localizable_subtitle;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_subtitle=", localizableString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CreditLineStatusData{", "}", 0, null, null, 56);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CreditLineStatusIcon implements WireEnum {
        public static final /* synthetic */ CreditLineStatusIcon[] $VALUES;
        public static final CreditLine$CreditLineStatusIcon$Companion$ADAPTER$1 ADAPTER;
        public static final UiControl.Type.Companion Companion;
        public static final CreditLineStatusIcon EXCEPTION;

        static {
            CreditLineStatusIcon creditLineStatusIcon = new CreditLineStatusIcon("EXCEPTION", 0);
            EXCEPTION = creditLineStatusIcon;
            $VALUES = new CreditLineStatusIcon[]{creditLineStatusIcon};
            Companion = new UiControl.Type.Companion();
            ADAPTER = new CreditLine$CreditLineStatusIcon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CreditLineStatusIcon.class), Syntax.PROTO_2, null);
        }

        public static final CreditLineStatusIcon fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return EXCEPTION;
            }
            return null;
        }

        public static CreditLineStatusIcon valueOf(String str) {
            return (CreditLineStatusIcon) Enum.valueOf(CreditLineStatusIcon.class, str);
        }

        public static CreditLineStatusIcon[] values() {
            return (CreditLineStatusIcon[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return 1;
        }
    }

    public final class FirstTimeBorrowData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FirstTimeBorrowData> CREATOR;
        public final List bullets;
        public final String button_title;
        public final LocalizableString localizable_title;
        public final String notice_body;
        public final String notice_title;
        public final PromoContent promo_content;
        public final String subtitle;
        public final String support_button_title;
        public final String support_node;
        public final String title;

        public final class PromoContent extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<PromoContent> CREATOR;
            public final String button_support_node;
            public final String button_title;
            public final String button_url;
            public final String subtitle;
            public final String title;

            static {
                CreditLine$FirstTimeBorrowData$PromoContent$Companion$ADAPTER$1 creditLine$FirstTimeBorrowData$PromoContent$Companion$ADAPTER$1 = new CreditLine$FirstTimeBorrowData$PromoContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PromoContent.class), "type.googleapis.com/squareup.franklin.lending.CreditLine.FirstTimeBorrowData.PromoContent", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
                ADAPTER = creditLine$FirstTimeBorrowData$PromoContent$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(creditLine$FirstTimeBorrowData$PromoContent$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PromoContent(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.subtitle = str2;
                this.button_title = str3;
                this.button_support_node = str4;
                this.button_url = str5;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PromoContent)) {
                    return false;
                }
                PromoContent promoContent = (PromoContent) obj;
                return Intrinsics.areEqual(unknownFields(), promoContent.unknownFields()) && Intrinsics.areEqual(this.title, promoContent.title) && Intrinsics.areEqual(this.subtitle, promoContent.subtitle) && Intrinsics.areEqual(this.button_title, promoContent.button_title) && Intrinsics.areEqual(this.button_support_node, promoContent.button_support_node) && Intrinsics.areEqual(this.button_url, promoContent.button_url);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.subtitle;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.button_title;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                String str4 = this.button_support_node;
                int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
                String str5 = this.button_url;
                int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ProfileRow.Builder builder = new ProfileRow.Builder(12);
                builder.client_route = this.title;
                builder.icon_id = this.subtitle;
                builder.title = this.button_title;
                builder.subtitle = this.button_support_node;
                builder.call_to_action = this.button_url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.subtitle;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
                }
                String str3 = this.button_title;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_title=", arrayList);
                }
                String str4 = this.button_support_node;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "button_support_node=", arrayList);
                }
                String str5 = this.button_url;
                if (str5 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "button_url=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "PromoContent{", "}", 0, null, null, 56);
            }
        }

        static {
            CreditLine$FirstTimeBorrowData$Companion$ADAPTER$1 creditLine$FirstTimeBorrowData$Companion$ADAPTER$1 = new CreditLine$FirstTimeBorrowData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FirstTimeBorrowData.class), "type.googleapis.com/squareup.franklin.lending.CreditLine.FirstTimeBorrowData", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
            ADAPTER = creditLine$FirstTimeBorrowData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(creditLine$FirstTimeBorrowData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FirstTimeBorrowData(String str, String str2, String str3, List list, String str4, String str5, PromoContent promoContent, String str6, String str7, LocalizableString localizableString, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.button_title = str3;
            this.support_button_title = str4;
            this.support_node = str5;
            this.promo_content = promoContent;
            this.notice_title = str6;
            this.notice_body = str7;
            this.localizable_title = localizableString;
            this.bullets = TransactorKt.immutableCopyOf("bullets", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FirstTimeBorrowData)) {
                return false;
            }
            FirstTimeBorrowData firstTimeBorrowData = (FirstTimeBorrowData) obj;
            return Intrinsics.areEqual(unknownFields(), firstTimeBorrowData.unknownFields()) && Intrinsics.areEqual(this.title, firstTimeBorrowData.title) && Intrinsics.areEqual(this.subtitle, firstTimeBorrowData.subtitle) && Intrinsics.areEqual(this.button_title, firstTimeBorrowData.button_title) && Intrinsics.areEqual(this.bullets, firstTimeBorrowData.bullets) && Intrinsics.areEqual(this.support_button_title, firstTimeBorrowData.support_button_title) && Intrinsics.areEqual(this.support_node, firstTimeBorrowData.support_node) && Intrinsics.areEqual(this.promo_content, firstTimeBorrowData.promo_content) && Intrinsics.areEqual(this.notice_title, firstTimeBorrowData.notice_title) && Intrinsics.areEqual(this.notice_body, firstTimeBorrowData.notice_body) && Intrinsics.areEqual(this.localizable_title, firstTimeBorrowData.localizable_title);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.button_title;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.bullets);
            String str4 = this.support_button_title;
            int hashCode4 = (m + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.support_node;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 37;
            PromoContent promoContent = this.promo_content;
            int hashCode6 = (hashCode5 + (promoContent != null ? promoContent.hashCode() : 0)) * 37;
            String str6 = this.notice_title;
            int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.notice_body;
            int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_title;
            int hashCode9 = hashCode8 + (localizableString != null ? localizableString.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CashInRequest.Builder builder = new CashInRequest.Builder(22);
            builder.external_id = this.title;
            builder.passcode_token = this.subtitle;
            builder.external_client_transfer_token = this.button_title;
            builder.request_context = this.bullets;
            builder.source = this.support_button_title;
            builder.target = this.support_node;
            builder.amount = this.promo_content;
            builder.call_context = this.notice_title;
            builder.forwarded_call_context = this.notice_body;
            builder.client_verified_digital_wallet = this.localizable_title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.subtitle;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
            }
            String str3 = this.button_title;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_title=", arrayList);
            }
            List list = this.bullets;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("bullets=", arrayList, list);
            }
            String str4 = this.support_button_title;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "support_button_title=", arrayList);
            }
            String str5 = this.support_node;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "support_node=", arrayList);
            }
            PromoContent promoContent = this.promo_content;
            if (promoContent != null) {
                arrayList.add("promo_content=" + promoContent);
            }
            String str6 = this.notice_title;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "notice_title=", arrayList);
            }
            String str7 = this.notice_body;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "notice_body=", arrayList);
            }
            LocalizableString localizableString = this.localizable_title;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FirstTimeBorrowData{", "}", 0, null, null, 56);
        }
    }

    public final class UnlockBorrowData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UnlockBorrowData> CREATOR;
        public final ClientScenario client_scenario;
        public final String unlock_button_title;

        static {
            CreditLine$UnlockBorrowData$Companion$ADAPTER$1 creditLine$UnlockBorrowData$Companion$ADAPTER$1 = new CreditLine$UnlockBorrowData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UnlockBorrowData.class), "type.googleapis.com/squareup.franklin.lending.CreditLine.UnlockBorrowData", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
            ADAPTER = creditLine$UnlockBorrowData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(creditLine$UnlockBorrowData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnlockBorrowData(String str, ClientScenario clientScenario, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.unlock_button_title = str;
            this.client_scenario = clientScenario;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UnlockBorrowData)) {
                return false;
            }
            UnlockBorrowData unlockBorrowData = (UnlockBorrowData) obj;
            return Intrinsics.areEqual(unknownFields(), unlockBorrowData.unknownFields()) && Intrinsics.areEqual(this.unlock_button_title, unlockBorrowData.unlock_button_title) && this.client_scenario == unlockBorrowData.client_scenario;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.unlock_button_title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            ClientScenario clientScenario = this.client_scenario;
            int hashCode3 = hashCode2 + (clientScenario != null ? clientScenario.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AppLinks.Builder builder = new AppLinks.Builder(25);
            builder.f1372android = this.unlock_button_title;
            builder.ios = this.client_scenario;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.unlock_button_title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "unlock_button_title=", arrayList);
            }
            ClientScenario clientScenario = this.client_scenario;
            if (clientScenario != null) {
                Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "UnlockBorrowData{", "}", 0, null, null, 56);
        }
    }

    static {
        CreditLine$Companion$ADAPTER$1 creditLine$Companion$ADAPTER$1 = new CreditLine$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreditLine.class), "type.googleapis.com/squareup.franklin.lending.CreditLine", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
        ADAPTER = creditLine$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(creditLine$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditLine(String str, Money money, Money money2, Money money3, Integer num, List list, Money money4, FirstTimeBorrowData firstTimeBorrowData, UnlockBorrowData unlockBorrowData, String str2, CreditLineStatusIcon creditLineStatusIcon, Boolean bool, String str3, LendingProduct lendingProduct, CreditLineStatusData creditLineStatusData, CreditLineLimitData creditLineLimitData, Alert alert, LocalizableString localizableString, LocalizableString localizableString2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.token = str;
        this.credit_limit = money;
        this.available_amount = money2;
        this.outstanding_amount = money3;
        this.setup_fee_bps = num;
        this.minimum_loan_amount = money4;
        this.first_time_borrow_data = firstTimeBorrowData;
        this.unlock_borrow_data = unlockBorrowData;
        this.instrument_display_name = str2;
        this.credit_line_status_icon = creditLineStatusIcon;
        this.skip_loan_amount_selection = bool;
        this.instrument_subtitle = str3;
        this.lending_product = lendingProduct;
        this.credit_line_status_data = creditLineStatusData;
        this.credit_line_limit_data = creditLineLimitData;
        this.alert = alert;
        this.localizable_instrument_display_name = localizableString;
        this.localizable_instrument_subtitle = localizableString2;
        this.quick_amounts = TransactorKt.immutableCopyOf("quick_amounts", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreditLine)) {
            return false;
        }
        CreditLine creditLine = (CreditLine) obj;
        return Intrinsics.areEqual(unknownFields(), creditLine.unknownFields()) && Intrinsics.areEqual(this.token, creditLine.token) && Intrinsics.areEqual(this.credit_limit, creditLine.credit_limit) && Intrinsics.areEqual(this.available_amount, creditLine.available_amount) && Intrinsics.areEqual(this.outstanding_amount, creditLine.outstanding_amount) && Intrinsics.areEqual(this.setup_fee_bps, creditLine.setup_fee_bps) && Intrinsics.areEqual(this.quick_amounts, creditLine.quick_amounts) && Intrinsics.areEqual(this.minimum_loan_amount, creditLine.minimum_loan_amount) && Intrinsics.areEqual(this.first_time_borrow_data, creditLine.first_time_borrow_data) && Intrinsics.areEqual(this.unlock_borrow_data, creditLine.unlock_borrow_data) && Intrinsics.areEqual(this.instrument_display_name, creditLine.instrument_display_name) && this.credit_line_status_icon == creditLine.credit_line_status_icon && Intrinsics.areEqual(this.skip_loan_amount_selection, creditLine.skip_loan_amount_selection) && Intrinsics.areEqual(this.instrument_subtitle, creditLine.instrument_subtitle) && this.lending_product == creditLine.lending_product && Intrinsics.areEqual(this.credit_line_status_data, creditLine.credit_line_status_data) && Intrinsics.areEqual(this.credit_line_limit_data, creditLine.credit_line_limit_data) && Intrinsics.areEqual(this.alert, creditLine.alert) && Intrinsics.areEqual(this.localizable_instrument_display_name, creditLine.localizable_instrument_display_name) && Intrinsics.areEqual(this.localizable_instrument_subtitle, creditLine.localizable_instrument_subtitle);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.credit_limit;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.available_amount;
        int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.outstanding_amount;
        int hashCode5 = (hashCode4 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Integer num = this.setup_fee_bps;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37, 37, this.quick_amounts);
        Money money4 = this.minimum_loan_amount;
        int hashCode6 = (m + (money4 != null ? money4.hashCode() : 0)) * 37;
        FirstTimeBorrowData firstTimeBorrowData = this.first_time_borrow_data;
        int hashCode7 = (hashCode6 + (firstTimeBorrowData != null ? firstTimeBorrowData.hashCode() : 0)) * 37;
        UnlockBorrowData unlockBorrowData = this.unlock_borrow_data;
        int hashCode8 = (hashCode7 + (unlockBorrowData != null ? unlockBorrowData.hashCode() : 0)) * 37;
        String str2 = this.instrument_display_name;
        int hashCode9 = (hashCode8 + (str2 != null ? str2.hashCode() : 0)) * 37;
        CreditLineStatusIcon creditLineStatusIcon = this.credit_line_status_icon;
        int hashCode10 = (hashCode9 + (creditLineStatusIcon != null ? creditLineStatusIcon.hashCode() : 0)) * 37;
        Boolean bool = this.skip_loan_amount_selection;
        int hashCode11 = (hashCode10 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str3 = this.instrument_subtitle;
        int hashCode12 = (hashCode11 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LendingProduct lendingProduct = this.lending_product;
        int hashCode13 = (hashCode12 + (lendingProduct != null ? lendingProduct.hashCode() : 0)) * 37;
        CreditLineStatusData creditLineStatusData = this.credit_line_status_data;
        int hashCode14 = (hashCode13 + (creditLineStatusData != null ? creditLineStatusData.hashCode() : 0)) * 37;
        CreditLineLimitData creditLineLimitData = this.credit_line_limit_data;
        int hashCode15 = (hashCode14 + (creditLineLimitData != null ? creditLineLimitData.hashCode() : 0)) * 37;
        Alert alert = this.alert;
        int hashCode16 = (hashCode15 + (alert != null ? alert.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_instrument_display_name;
        int hashCode17 = (hashCode16 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localizable_instrument_subtitle;
        int hashCode18 = hashCode17 + (localizableString2 != null ? localizableString2.hashCode() : 0);
        this.hashCode = hashCode18;
        return hashCode18;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.token = this.token;
        builder.credit_limit = this.credit_limit;
        builder.available_amount = this.available_amount;
        builder.outstanding_amount = this.outstanding_amount;
        builder.setup_fee_bps = this.setup_fee_bps;
        builder.quick_amounts = this.quick_amounts;
        builder.minimum_loan_amount = this.minimum_loan_amount;
        builder.first_time_borrow_data = this.first_time_borrow_data;
        builder.unlock_borrow_data = this.unlock_borrow_data;
        builder.instrument_display_name = this.instrument_display_name;
        builder.credit_line_status_icon = this.credit_line_status_icon;
        builder.skip_loan_amount_selection = this.skip_loan_amount_selection;
        builder.instrument_subtitle = this.instrument_subtitle;
        builder.lending_product = this.lending_product;
        builder.credit_line_status_data = this.credit_line_status_data;
        builder.credit_line_limit_data = this.credit_line_limit_data;
        builder.alert = this.alert;
        builder.localizable_instrument_display_name = this.localizable_instrument_display_name;
        builder.localizable_instrument_subtitle = this.localizable_instrument_subtitle;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        Money money = this.credit_limit;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("credit_limit=", money, arrayList);
        }
        Money money2 = this.available_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("available_amount=", money2, arrayList);
        }
        Money money3 = this.outstanding_amount;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("outstanding_amount=", money3, arrayList);
        }
        Integer num = this.setup_fee_bps;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("setup_fee_bps=", num, arrayList);
        }
        List list = this.quick_amounts;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("quick_amounts=", arrayList, list);
        }
        Money money4 = this.minimum_loan_amount;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("minimum_loan_amount=", money4, arrayList);
        }
        FirstTimeBorrowData firstTimeBorrowData = this.first_time_borrow_data;
        if (firstTimeBorrowData != null) {
            arrayList.add("first_time_borrow_data=" + firstTimeBorrowData);
        }
        UnlockBorrowData unlockBorrowData = this.unlock_borrow_data;
        if (unlockBorrowData != null) {
            arrayList.add("unlock_borrow_data=" + unlockBorrowData);
        }
        String str2 = this.instrument_display_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "instrument_display_name=", arrayList);
        }
        CreditLineStatusIcon creditLineStatusIcon = this.credit_line_status_icon;
        if (creditLineStatusIcon != null) {
            arrayList.add("credit_line_status_icon=" + creditLineStatusIcon);
        }
        Boolean bool = this.skip_loan_amount_selection;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("skip_loan_amount_selection=", bool, arrayList);
        }
        String str3 = this.instrument_subtitle;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "instrument_subtitle=", arrayList);
        }
        LendingProduct lendingProduct = this.lending_product;
        if (lendingProduct != null) {
            arrayList.add("lending_product=" + lendingProduct);
        }
        CreditLineStatusData creditLineStatusData = this.credit_line_status_data;
        if (creditLineStatusData != null) {
            arrayList.add("credit_line_status_data=" + creditLineStatusData);
        }
        CreditLineLimitData creditLineLimitData = this.credit_line_limit_data;
        if (creditLineLimitData != null) {
            arrayList.add("credit_line_limit_data=" + creditLineLimitData);
        }
        Alert alert = this.alert;
        if (alert != null) {
            arrayList.add("alert=" + alert);
        }
        LocalizableString localizableString = this.localizable_instrument_display_name;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_instrument_display_name=", localizableString, arrayList);
        }
        LocalizableString localizableString2 = this.localizable_instrument_subtitle;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_instrument_subtitle=", localizableString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreditLine{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable alert;
        public Serializable available_amount;
        public Object credit_limit;
        public Serializable credit_line_limit_data;
        public Serializable credit_line_status_data;
        public Serializable credit_line_status_icon;
        public Serializable first_time_borrow_data;
        public String instrument_display_name;
        public String instrument_subtitle;
        public Serializable lending_product;
        public Object localizable_instrument_display_name;
        public Serializable localizable_instrument_subtitle;
        public Serializable minimum_loan_amount;
        public AndroidMessage outstanding_amount;
        public Object quick_amounts;
        public Serializable setup_fee_bps;
        public Serializable skip_loan_amount_selection;
        public String token;
        public Serializable unlock_borrow_data;

        public Builder() {
            this.$r8$classId = 2;
            EmptyList emptyList = EmptyList.INSTANCE;
            this.quick_amounts = emptyList;
            this.localizable_instrument_display_name = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CreditLine(this.token, (Money) this.credit_limit, (Money) this.available_amount, (Money) this.outstanding_amount, (Integer) this.setup_fee_bps, (List) this.quick_amounts, (Money) this.minimum_loan_amount, (FirstTimeBorrowData) this.first_time_borrow_data, (UnlockBorrowData) this.unlock_borrow_data, this.instrument_display_name, (CreditLineStatusIcon) this.credit_line_status_icon, (Boolean) this.skip_loan_amount_selection, this.instrument_subtitle, (LendingProduct) this.lending_product, (CreditLineStatusData) this.credit_line_status_data, (CreditLineLimitData) this.credit_line_limit_data, (Alert) this.alert, (LocalizableString) this.localizable_instrument_display_name, (LocalizableString) this.localizable_instrument_subtitle, buildUnknownFields());
                case 1:
                    return new IdvRenderConfig(this.token, (Boolean) this.skip_loan_amount_selection, (Boolean) this.credit_limit, this.instrument_display_name, this.instrument_subtitle, (String) this.available_amount, (IdvEndResultScreenConfig) this.outstanding_amount, (String) this.minimum_loan_amount, (String) this.setup_fee_bps, (SsnTooltipConfig) this.quick_amounts, (SsnScreenRenderConfig) this.first_time_borrow_data, (SsnCollectionBlockerTemplateName) this.unlock_borrow_data, (EidvFailedBlockerTemplateName) this.credit_line_status_icon, (InReviewBlockerTemplateName) this.lending_product, (NotVerifiedBlockerTemplateName) this.credit_line_status_data, (EIdvIntroBlockerTemplateName) this.credit_line_limit_data, (VerifiedBlockerTemplateName) this.alert, (ProvideLegalBlockerTemplateName) this.localizable_instrument_display_name, (Boolean) this.localizable_instrument_subtitle, buildUnknownFields());
                case 2:
                    return new CreateOrderRequest(this.token, this.instrument_display_name, (zzhq) this.credit_limit, this.instrument_subtitle, (List) this.quick_amounts, (LocalFulfillmentOption.Type) this.available_amount, (LocalMoney) this.outstanding_amount, (LocalFulfillmentType) this.minimum_loan_amount, (String) this.setup_fee_bps, (String) this.first_time_borrow_data, (String) this.unlock_borrow_data, (Boolean) this.skip_loan_amount_selection, (LocalMoney) this.credit_line_status_icon, (LocalMoney) this.lending_product, (LocalFulfillment) this.credit_line_status_data, (Boolean) this.credit_line_limit_data, (String) this.alert, (List) this.localizable_instrument_display_name, (OrderWorkflow) this.localizable_instrument_subtitle, buildUnknownFields());
                case 3:
                    return new OfferDetailListSheet((OfferType) this.credit_limit, this.token, this.instrument_display_name, this.instrument_subtitle, (String) this.available_amount, (Avatar) this.outstanding_amount, (LocalizedString) this.minimum_loan_amount, (FormattedDetail) this.setup_fee_bps, (List) this.quick_amounts, (Button) this.first_time_borrow_data, (Button) this.unlock_borrow_data, (Button) this.credit_line_status_icon, (Button) this.skip_loan_amount_selection, (TapAction) this.lending_product, (LocalizedString) this.credit_line_status_data, (Long) this.credit_line_limit_data, (String) this.alert, (StyledText) this.localizable_instrument_display_name, (String) this.localizable_instrument_subtitle, buildUnknownFields());
                default:
                    return new CryptoOrderRenderData(this.token, (CryptoOrderRenderData.OrderSide) this.setup_fee_bps, (CryptoOrderRenderData.OrderType) this.quick_amounts, (CryptoOrderRenderData.OrderState) this.first_time_borrow_data, (Money) this.credit_limit, (Money) this.available_amount, (Money) this.outstanding_amount, (Money) this.minimum_loan_amount, (Money) this.unlock_borrow_data, (Money) this.credit_line_status_icon, (Long) this.skip_loan_amount_selection, (CryptoPayrollRenderData) this.lending_product, (OrderStateReason) this.credit_line_status_data, (CryptoOrderRenderData.OrderFeature) this.credit_line_limit_data, this.instrument_display_name, this.instrument_subtitle, (String) this.alert, (String) this.localizable_instrument_display_name, (Money) this.localizable_instrument_subtitle, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
