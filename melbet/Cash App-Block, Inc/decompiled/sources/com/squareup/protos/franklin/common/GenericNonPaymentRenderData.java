package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.sync_values.Text;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GenericNonPaymentRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GenericNonPaymentRenderData> CREATOR;
    public final Avatar avatar;
    public final Header header;
    public final HelpCenterLinkType help_center_link_type;
    public final InlineButton inline_button;
    public final MoreInfoSheet more_info_sheet;
    public final Button primary_button;
    public final Avatar second_avatar;
    public final Button secondary_button;
    public final Subtitle subtitle;
    public final TertiaryLabelSuffix tertiary_label_suffix;
    public final ThreadedView threaded_view;
    public final Title title;
    public final String url_to_open;

    public final class Avatar extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Avatar> CREATOR;
        public final String accent_color;
        public final Boolean colorize_image;
        public final String dark_theme_accent_color;
        public final String dark_theme_image_url;
        public final String image_url;
        public final String initial;

        static {
            GenericNonPaymentRenderData$Avatar$Companion$ADAPTER$1 genericNonPaymentRenderData$Avatar$Companion$ADAPTER$1 = new GenericNonPaymentRenderData$Avatar$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Avatar.class), "type.googleapis.com/squareup.franklin.GenericNonPaymentRenderData.Avatar", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = genericNonPaymentRenderData$Avatar$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericNonPaymentRenderData$Avatar$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Avatar(Boolean bool, String str, String str2, String str3, String str4, String str5, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image_url = str;
            this.accent_color = str2;
            this.dark_theme_image_url = str3;
            this.dark_theme_accent_color = str4;
            this.colorize_image = bool;
            this.initial = str5;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Avatar)) {
                return false;
            }
            Avatar avatar = (Avatar) obj;
            return Intrinsics.areEqual(unknownFields(), avatar.unknownFields()) && Intrinsics.areEqual(this.image_url, avatar.image_url) && Intrinsics.areEqual(this.accent_color, avatar.accent_color) && Intrinsics.areEqual(this.dark_theme_image_url, avatar.dark_theme_image_url) && Intrinsics.areEqual(this.dark_theme_accent_color, avatar.dark_theme_accent_color) && Intrinsics.areEqual(this.colorize_image, avatar.colorize_image) && Intrinsics.areEqual(this.initial, avatar.initial);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.image_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.accent_color;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.dark_theme_image_url;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.dark_theme_accent_color;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            Boolean bool = this.colorize_image;
            int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            String str5 = this.initial;
            int hashCode7 = hashCode6 + (str5 != null ? str5.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiPublicProfile.Builder builder = new UiPublicProfile.Builder(1, false);
            builder.full_name = this.image_url;
            builder.photo_url = this.accent_color;
            builder.synopsis = this.dark_theme_image_url;
            builder.full_cashtag = this.dark_theme_accent_color;
            builder.cashtag_url_enabled = this.colorize_image;
            builder.is_verified_account = this.initial;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.image_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "image_url=", arrayList);
            }
            String str2 = this.accent_color;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "accent_color=", arrayList);
            }
            String str3 = this.dark_theme_image_url;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "dark_theme_image_url=", arrayList);
            }
            String str4 = this.dark_theme_accent_color;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "dark_theme_accent_color=", arrayList);
            }
            Boolean bool = this.colorize_image;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("colorize_image=", bool, arrayList);
            }
            if (this.initial != null) {
                arrayList.add("initial=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Avatar{", "}", 0, null, null, 56);
        }
    }

    public final class Button extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Button> CREATOR;
        public final PaymentHistoryButton.ButtonAction action;
        public final ClientScenario client_scenario;
        public final PaymentHistoryButton.Icon icon;
        public final LocalizableString localizable_title;
        public final LocalizedString localized_title;
        public final String title;
        public final PaymentHistoryData.UiStatusTreatment treatment;
        public final String url;

        public final class Builder extends Message.Builder {
            public PaymentHistoryButton.ButtonAction action;
            public ClientScenario client_scenario;
            public PaymentHistoryButton.Icon icon;
            public LocalizableString localizable_title;
            public LocalizedString localized_title;
            public String title;
            public PaymentHistoryData.UiStatusTreatment treatment;
            public String url;

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                return new Button(this.title, this.action, this.client_scenario, this.icon, this.treatment, this.url, this.localized_title, this.localizable_title, buildUnknownFields());
            }
        }

        static {
            GenericNonPaymentRenderData$Button$Companion$ADAPTER$1 genericNonPaymentRenderData$Button$Companion$ADAPTER$1 = new GenericNonPaymentRenderData$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.franklin.GenericNonPaymentRenderData.Button", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = genericNonPaymentRenderData$Button$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericNonPaymentRenderData$Button$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Button(String str, PaymentHistoryButton.ButtonAction buttonAction, ClientScenario clientScenario, PaymentHistoryButton.Icon icon, PaymentHistoryData.UiStatusTreatment uiStatusTreatment, String str2, LocalizedString localizedString, LocalizableString localizableString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.action = buttonAction;
            this.client_scenario = clientScenario;
            this.icon = icon;
            this.treatment = uiStatusTreatment;
            this.url = str2;
            this.localized_title = localizedString;
            this.localizable_title = localizableString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.title, button.title) && this.action == button.action && this.client_scenario == button.client_scenario && this.icon == button.icon && this.treatment == button.treatment && Intrinsics.areEqual(this.url, button.url) && Intrinsics.areEqual(this.localized_title, button.localized_title) && Intrinsics.areEqual(this.localizable_title, button.localizable_title);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            PaymentHistoryButton.ButtonAction buttonAction = this.action;
            int hashCode3 = (hashCode2 + (buttonAction != null ? buttonAction.hashCode() : 0)) * 37;
            ClientScenario clientScenario = this.client_scenario;
            int hashCode4 = (hashCode3 + (clientScenario != null ? clientScenario.hashCode() : 0)) * 37;
            PaymentHistoryButton.Icon icon = this.icon;
            int hashCode5 = (hashCode4 + (icon != null ? icon.hashCode() : 0)) * 37;
            PaymentHistoryData.UiStatusTreatment uiStatusTreatment = this.treatment;
            int hashCode6 = (hashCode5 + (uiStatusTreatment != null ? uiStatusTreatment.hashCode() : 0)) * 37;
            String str2 = this.url;
            int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.localized_title;
            int hashCode8 = (hashCode7 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_title;
            int hashCode9 = hashCode8 + (localizableString != null ? localizableString.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.action = this.action;
            builder.client_scenario = this.client_scenario;
            builder.icon = this.icon;
            builder.treatment = this.treatment;
            builder.url = this.url;
            builder.localized_title = this.localized_title;
            builder.localizable_title = this.localizable_title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            PaymentHistoryButton.ButtonAction buttonAction = this.action;
            if (buttonAction != null) {
                arrayList.add("action=" + buttonAction);
            }
            ClientScenario clientScenario = this.client_scenario;
            if (clientScenario != null) {
                Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
            }
            PaymentHistoryButton.Icon icon = this.icon;
            if (icon != null) {
                arrayList.add("icon=" + icon);
            }
            PaymentHistoryData.UiStatusTreatment uiStatusTreatment = this.treatment;
            if (uiStatusTreatment != null) {
                arrayList.add("treatment=" + uiStatusTreatment);
            }
            String str2 = this.url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
            }
            LocalizedString localizedString = this.localized_title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_title=", localizedString, arrayList);
            }
            LocalizableString localizableString = this.localizable_title;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
        }
    }

    public final class Header extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Header> CREATOR;
        public final LocalizableString localizable_subtext;
        public final LocalizableString localizable_text;
        public final LocalizedString localized_subtext;
        public final LocalizedString localized_text;
        public final String subtext;
        public final String text;

        static {
            GenericNonPaymentRenderData$Header$Companion$ADAPTER$1 genericNonPaymentRenderData$Header$Companion$ADAPTER$1 = new GenericNonPaymentRenderData$Header$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Header.class), "type.googleapis.com/squareup.franklin.GenericNonPaymentRenderData.Header", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = genericNonPaymentRenderData$Header$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericNonPaymentRenderData$Header$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(String str, String str2, LocalizedString localizedString, LocalizedString localizedString2, LocalizableString localizableString, LocalizableString localizableString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.subtext = str2;
            this.localized_text = localizedString;
            this.localized_subtext = localizedString2;
            this.localizable_text = localizableString;
            this.localizable_subtext = localizableString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.areEqual(unknownFields(), header.unknownFields()) && Intrinsics.areEqual(this.text, header.text) && Intrinsics.areEqual(this.subtext, header.subtext) && Intrinsics.areEqual(this.localized_text, header.localized_text) && Intrinsics.areEqual(this.localized_subtext, header.localized_subtext) && Intrinsics.areEqual(this.localizable_text, header.localizable_text) && Intrinsics.areEqual(this.localizable_subtext, header.localizable_subtext);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtext;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.localized_text;
            int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.localized_subtext;
            int hashCode5 = (hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_text;
            int hashCode6 = (hashCode5 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_subtext;
            int hashCode7 = hashCode6 + (localizableString2 != null ? localizableString2.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiPublicProfile.Builder builder = new UiPublicProfile.Builder(2, false);
            builder.full_name = this.text;
            builder.photo_url = this.subtext;
            builder.synopsis = this.localized_text;
            builder.full_cashtag = this.localized_subtext;
            builder.cashtag_url_enabled = this.localizable_text;
            builder.is_verified_account = this.localizable_subtext;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            String str2 = this.subtext;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtext=", arrayList);
            }
            LocalizedString localizedString = this.localized_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.localized_subtext;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_subtext=", localizedString2, arrayList);
            }
            LocalizableString localizableString = this.localizable_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
            }
            LocalizableString localizableString2 = this.localizable_subtext;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_subtext=", localizableString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Header{", "}", 0, null, null, 56);
        }
    }

    public enum HelpCenterLinkType implements WireEnum {
        DEFAULT(1),
        LOGIN(2),
        REFUND_FAILED(3),
        SPONSORED_ACCOUNT(4);

        public final int value;
        public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
        public static final GenericNonPaymentRenderData$HelpCenterLinkType$Companion$ADAPTER$1 ADAPTER = new GenericNonPaymentRenderData$HelpCenterLinkType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(HelpCenterLinkType.class), Syntax.PROTO_2, null);

        HelpCenterLinkType(int i) {
            this.value = i;
        }

        public static final HelpCenterLinkType fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return DEFAULT;
            }
            if (i == 2) {
                return LOGIN;
            }
            if (i == 3) {
                return REFUND_FAILED;
            }
            if (i != 4) {
                return null;
            }
            return SPONSORED_ACCOUNT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class InlineButton extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InlineButton> CREATOR;
        public final PaymentHistoryButton.ButtonAction action;
        public final ClientScenario client_scenario;
        public final LocalizableString localizable_title;
        public final LocalizedString localized_title;
        public final String title;
        public final PaymentHistoryData.InlineButtonTreatment treatment;
        public final String url;

        public final class Builder extends Message.Builder {
            public PaymentHistoryButton.ButtonAction action;
            public ClientScenario client_scenario;
            public LocalizableString localizable_title;
            public LocalizedString localized_title;
            public String title;
            public PaymentHistoryData.InlineButtonTreatment treatment;
            public String url;

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                return new InlineButton(this.title, this.action, this.client_scenario, this.url, this.treatment, this.localized_title, this.localizable_title, buildUnknownFields());
            }
        }

        static {
            GenericNonPaymentRenderData$InlineButton$Companion$ADAPTER$1 genericNonPaymentRenderData$InlineButton$Companion$ADAPTER$1 = new GenericNonPaymentRenderData$InlineButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InlineButton.class), "type.googleapis.com/squareup.franklin.GenericNonPaymentRenderData.InlineButton", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = genericNonPaymentRenderData$InlineButton$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericNonPaymentRenderData$InlineButton$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InlineButton(String str, PaymentHistoryButton.ButtonAction buttonAction, ClientScenario clientScenario, String str2, PaymentHistoryData.InlineButtonTreatment inlineButtonTreatment, LocalizedString localizedString, LocalizableString localizableString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.action = buttonAction;
            this.client_scenario = clientScenario;
            this.url = str2;
            this.treatment = inlineButtonTreatment;
            this.localized_title = localizedString;
            this.localizable_title = localizableString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InlineButton)) {
                return false;
            }
            InlineButton inlineButton = (InlineButton) obj;
            return Intrinsics.areEqual(unknownFields(), inlineButton.unknownFields()) && Intrinsics.areEqual(this.title, inlineButton.title) && this.action == inlineButton.action && this.client_scenario == inlineButton.client_scenario && Intrinsics.areEqual(this.url, inlineButton.url) && this.treatment == inlineButton.treatment && Intrinsics.areEqual(this.localized_title, inlineButton.localized_title) && Intrinsics.areEqual(this.localizable_title, inlineButton.localizable_title);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            PaymentHistoryButton.ButtonAction buttonAction = this.action;
            int hashCode3 = (hashCode2 + (buttonAction != null ? buttonAction.hashCode() : 0)) * 37;
            ClientScenario clientScenario = this.client_scenario;
            int hashCode4 = (hashCode3 + (clientScenario != null ? clientScenario.hashCode() : 0)) * 37;
            String str2 = this.url;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
            PaymentHistoryData.InlineButtonTreatment inlineButtonTreatment = this.treatment;
            int hashCode6 = (hashCode5 + (inlineButtonTreatment != null ? inlineButtonTreatment.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.localized_title;
            int hashCode7 = (hashCode6 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_title;
            int hashCode8 = hashCode7 + (localizableString != null ? localizableString.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.action = this.action;
            builder.client_scenario = this.client_scenario;
            builder.url = this.url;
            builder.treatment = this.treatment;
            builder.localized_title = this.localized_title;
            builder.localizable_title = this.localizable_title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            PaymentHistoryButton.ButtonAction buttonAction = this.action;
            if (buttonAction != null) {
                arrayList.add("action=" + buttonAction);
            }
            ClientScenario clientScenario = this.client_scenario;
            if (clientScenario != null) {
                Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
            }
            String str2 = this.url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
            }
            PaymentHistoryData.InlineButtonTreatment inlineButtonTreatment = this.treatment;
            if (inlineButtonTreatment != null) {
                arrayList.add("treatment=" + inlineButtonTreatment);
            }
            LocalizedString localizedString = this.localized_title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_title=", localizedString, arrayList);
            }
            LocalizableString localizableString = this.localizable_title;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InlineButton{", "}", 0, null, null, 56);
        }
    }

    public final class MoreInfoSheet extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MoreInfoSheet> CREATOR;
        public final PaymentHistoryData.MoreInfoSheetHeaderIcon header_icon;
        public final PaymentHistoryData.UiStatusTreatment header_icon_treatment;
        public final LocalizableString localizable_status_subtext;
        public final LocalizableString localizable_status_text;
        public final LocalizedString localized_status_subtext;
        public final LocalizedString localized_status_text;
        public final LocalizedString localized_subtext;
        public final String status_subtext;
        public final String status_text;

        public final class Builder extends Message.Builder {
            public PaymentHistoryData.MoreInfoSheetHeaderIcon header_icon;
            public PaymentHistoryData.UiStatusTreatment header_icon_treatment;
            public LocalizableString localizable_status_subtext;
            public LocalizableString localizable_status_text;
            public LocalizedString localized_status_subtext;
            public LocalizedString localized_status_text;
            public LocalizedString localized_subtext;
            public String status_subtext;
            public String status_text;

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                return new MoreInfoSheet(this.header_icon, this.header_icon_treatment, this.status_text, this.status_subtext, this.localized_status_text, this.localized_subtext, this.localized_status_subtext, this.localizable_status_text, this.localizable_status_subtext, buildUnknownFields());
            }
        }

        static {
            GenericNonPaymentRenderData$MoreInfoSheet$Companion$ADAPTER$1 genericNonPaymentRenderData$MoreInfoSheet$Companion$ADAPTER$1 = new GenericNonPaymentRenderData$MoreInfoSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoreInfoSheet.class), "type.googleapis.com/squareup.franklin.GenericNonPaymentRenderData.MoreInfoSheet", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = genericNonPaymentRenderData$MoreInfoSheet$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericNonPaymentRenderData$MoreInfoSheet$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoreInfoSheet(PaymentHistoryData.MoreInfoSheetHeaderIcon moreInfoSheetHeaderIcon, PaymentHistoryData.UiStatusTreatment uiStatusTreatment, String str, String str2, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizableString localizableString, LocalizableString localizableString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.header_icon = moreInfoSheetHeaderIcon;
            this.header_icon_treatment = uiStatusTreatment;
            this.status_text = str;
            this.status_subtext = str2;
            this.localized_status_text = localizedString;
            this.localized_subtext = localizedString2;
            this.localized_status_subtext = localizedString3;
            this.localizable_status_text = localizableString;
            this.localizable_status_subtext = localizableString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MoreInfoSheet)) {
                return false;
            }
            MoreInfoSheet moreInfoSheet = (MoreInfoSheet) obj;
            return Intrinsics.areEqual(unknownFields(), moreInfoSheet.unknownFields()) && this.header_icon == moreInfoSheet.header_icon && this.header_icon_treatment == moreInfoSheet.header_icon_treatment && Intrinsics.areEqual(this.status_text, moreInfoSheet.status_text) && Intrinsics.areEqual(this.status_subtext, moreInfoSheet.status_subtext) && Intrinsics.areEqual(this.localized_status_text, moreInfoSheet.localized_status_text) && Intrinsics.areEqual(this.localized_subtext, moreInfoSheet.localized_subtext) && Intrinsics.areEqual(this.localized_status_subtext, moreInfoSheet.localized_status_subtext) && Intrinsics.areEqual(this.localizable_status_text, moreInfoSheet.localizable_status_text) && Intrinsics.areEqual(this.localizable_status_subtext, moreInfoSheet.localizable_status_subtext);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            PaymentHistoryData.MoreInfoSheetHeaderIcon moreInfoSheetHeaderIcon = this.header_icon;
            int hashCode2 = (hashCode + (moreInfoSheetHeaderIcon != null ? moreInfoSheetHeaderIcon.hashCode() : 0)) * 37;
            PaymentHistoryData.UiStatusTreatment uiStatusTreatment = this.header_icon_treatment;
            int hashCode3 = (hashCode2 + (uiStatusTreatment != null ? uiStatusTreatment.hashCode() : 0)) * 37;
            String str = this.status_text;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.status_subtext;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.localized_status_text;
            int hashCode6 = (hashCode5 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.localized_subtext;
            int hashCode7 = (hashCode6 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.localized_status_subtext;
            int hashCode8 = (hashCode7 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_status_text;
            int hashCode9 = (hashCode8 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_status_subtext;
            int hashCode10 = hashCode9 + (localizableString2 != null ? localizableString2.hashCode() : 0);
            this.hashCode = hashCode10;
            return hashCode10;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.header_icon = this.header_icon;
            builder.header_icon_treatment = this.header_icon_treatment;
            builder.status_text = this.status_text;
            builder.status_subtext = this.status_subtext;
            builder.localized_status_text = this.localized_status_text;
            builder.localized_subtext = this.localized_subtext;
            builder.localized_status_subtext = this.localized_status_subtext;
            builder.localizable_status_text = this.localizable_status_text;
            builder.localizable_status_subtext = this.localizable_status_subtext;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            PaymentHistoryData.MoreInfoSheetHeaderIcon moreInfoSheetHeaderIcon = this.header_icon;
            if (moreInfoSheetHeaderIcon != null) {
                arrayList.add("header_icon=" + moreInfoSheetHeaderIcon);
            }
            PaymentHistoryData.UiStatusTreatment uiStatusTreatment = this.header_icon_treatment;
            if (uiStatusTreatment != null) {
                arrayList.add("header_icon_treatment=" + uiStatusTreatment);
            }
            String str = this.status_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "status_text=", arrayList);
            }
            String str2 = this.status_subtext;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "status_subtext=", arrayList);
            }
            LocalizedString localizedString = this.localized_status_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_status_text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.localized_subtext;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_subtext=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.localized_status_subtext;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_status_subtext=", localizedString3, arrayList);
            }
            LocalizableString localizableString = this.localizable_status_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_status_text=", localizableString, arrayList);
            }
            LocalizableString localizableString2 = this.localizable_status_subtext;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_status_subtext=", localizableString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MoreInfoSheet{", "}", 0, null, null, 56);
        }
    }

    public final class Subtitle extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Subtitle> CREATOR;
        public final PaymentHistoryData.Icon icon;
        public final LocalizableString localizable_text;
        public final LocalizedString localized_text;
        public final String text;

        public final class Builder extends Message.Builder {
            public PaymentHistoryData.Icon icon;
            public LocalizableString localizable_text;
            public LocalizedString localized_text;
            public String text;

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                return new Subtitle(this.text, this.icon, this.localized_text, this.localizable_text, buildUnknownFields());
            }
        }

        static {
            GenericNonPaymentRenderData$Subtitle$Companion$ADAPTER$1 genericNonPaymentRenderData$Subtitle$Companion$ADAPTER$1 = new GenericNonPaymentRenderData$Subtitle$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Subtitle.class), "type.googleapis.com/squareup.franklin.GenericNonPaymentRenderData.Subtitle", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = genericNonPaymentRenderData$Subtitle$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericNonPaymentRenderData$Subtitle$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subtitle(String str, PaymentHistoryData.Icon icon, LocalizedString localizedString, LocalizableString localizableString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.icon = icon;
            this.localized_text = localizedString;
            this.localizable_text = localizableString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Subtitle)) {
                return false;
            }
            Subtitle subtitle = (Subtitle) obj;
            return Intrinsics.areEqual(unknownFields(), subtitle.unknownFields()) && Intrinsics.areEqual(this.text, subtitle.text) && this.icon == subtitle.icon && Intrinsics.areEqual(this.localized_text, subtitle.localized_text) && Intrinsics.areEqual(this.localizable_text, subtitle.localizable_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            PaymentHistoryData.Icon icon = this.icon;
            int hashCode3 = (hashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.localized_text;
            int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_text;
            int hashCode5 = hashCode4 + (localizableString != null ? localizableString.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.text = this.text;
            builder.icon = this.icon;
            builder.localized_text = this.localized_text;
            builder.localizable_text = this.localizable_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            PaymentHistoryData.Icon icon = this.icon;
            if (icon != null) {
                arrayList.add("icon=" + icon);
            }
            LocalizedString localizedString = this.localized_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_text=", localizedString, arrayList);
            }
            LocalizableString localizableString = this.localizable_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Subtitle{", "}", 0, null, null, 56);
        }
    }

    public final class TertiaryLabelSuffix extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TertiaryLabelSuffix> CREATOR;
        public final LocalizableString localizable_text;
        public final String text;

        static {
            GenericNonPaymentRenderData$TertiaryLabelSuffix$Companion$ADAPTER$1 genericNonPaymentRenderData$TertiaryLabelSuffix$Companion$ADAPTER$1 = new GenericNonPaymentRenderData$TertiaryLabelSuffix$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TertiaryLabelSuffix.class), "type.googleapis.com/squareup.franklin.GenericNonPaymentRenderData.TertiaryLabelSuffix", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = genericNonPaymentRenderData$TertiaryLabelSuffix$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericNonPaymentRenderData$TertiaryLabelSuffix$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TertiaryLabelSuffix(String str, LocalizableString localizableString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.localizable_text = localizableString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TertiaryLabelSuffix)) {
                return false;
            }
            TertiaryLabelSuffix tertiaryLabelSuffix = (TertiaryLabelSuffix) obj;
            return Intrinsics.areEqual(unknownFields(), tertiaryLabelSuffix.unknownFields()) && Intrinsics.areEqual(this.text, tertiaryLabelSuffix.text) && Intrinsics.areEqual(this.localizable_text, tertiaryLabelSuffix.localizable_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_text;
            int hashCode3 = hashCode2 + (localizableString != null ? localizableString.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Text.Builder builder = new Text.Builder(3);
            builder.text = this.text;
            builder.localizable_text = this.localizable_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            LocalizableString localizableString = this.localizable_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TertiaryLabelSuffix{", "}", 0, null, null, 56);
        }
    }

    public final class ThreadedView extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ThreadedView> CREATOR;
        public final LocalizableString localizable_subtitle;
        public final LocalizableString localizable_title;
        public final LocalizedString localized_subtitle;
        public final LocalizedString localized_title;
        public final String subtitle;
        public final PaymentHistoryData.Icon subtitle_icon;
        public final String title;

        public final class Builder extends Message.Builder {
            public LocalizableString localizable_subtitle;
            public LocalizableString localizable_title;
            public LocalizedString localized_subtitle;
            public LocalizedString localized_title;
            public String subtitle;
            public PaymentHistoryData.Icon subtitle_icon;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                return new ThreadedView(this.title, this.subtitle, this.subtitle_icon, this.localized_title, this.localized_subtitle, this.localizable_title, this.localizable_subtitle, buildUnknownFields());
            }
        }

        static {
            GenericNonPaymentRenderData$ThreadedView$Companion$ADAPTER$1 genericNonPaymentRenderData$ThreadedView$Companion$ADAPTER$1 = new GenericNonPaymentRenderData$ThreadedView$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ThreadedView.class), "type.googleapis.com/squareup.franklin.GenericNonPaymentRenderData.ThreadedView", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = genericNonPaymentRenderData$ThreadedView$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericNonPaymentRenderData$ThreadedView$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThreadedView(String str, String str2, PaymentHistoryData.Icon icon, LocalizedString localizedString, LocalizedString localizedString2, LocalizableString localizableString, LocalizableString localizableString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.subtitle_icon = icon;
            this.localized_title = localizedString;
            this.localized_subtitle = localizedString2;
            this.localizable_title = localizableString;
            this.localizable_subtitle = localizableString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ThreadedView)) {
                return false;
            }
            ThreadedView threadedView = (ThreadedView) obj;
            return Intrinsics.areEqual(unknownFields(), threadedView.unknownFields()) && Intrinsics.areEqual(this.title, threadedView.title) && Intrinsics.areEqual(this.subtitle, threadedView.subtitle) && this.subtitle_icon == threadedView.subtitle_icon && Intrinsics.areEqual(this.localized_title, threadedView.localized_title) && Intrinsics.areEqual(this.localized_subtitle, threadedView.localized_subtitle) && Intrinsics.areEqual(this.localizable_title, threadedView.localizable_title) && Intrinsics.areEqual(this.localizable_subtitle, threadedView.localizable_subtitle);
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
            PaymentHistoryData.Icon icon = this.subtitle_icon;
            int hashCode4 = (hashCode3 + (icon != null ? icon.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.localized_title;
            int hashCode5 = (hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.localized_subtitle;
            int hashCode6 = (hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_title;
            int hashCode7 = (hashCode6 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_subtitle;
            int hashCode8 = hashCode7 + (localizableString2 != null ? localizableString2.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.subtitle_icon = this.subtitle_icon;
            builder.localized_title = this.localized_title;
            builder.localized_subtitle = this.localized_subtitle;
            builder.localizable_title = this.localizable_title;
            builder.localizable_subtitle = this.localizable_subtitle;
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
            PaymentHistoryData.Icon icon = this.subtitle_icon;
            if (icon != null) {
                arrayList.add("subtitle_icon=" + icon);
            }
            LocalizedString localizedString = this.localized_title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.localized_subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_subtitle=", localizedString2, arrayList);
            }
            LocalizableString localizableString = this.localizable_title;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
            }
            LocalizableString localizableString2 = this.localizable_subtitle;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_subtitle=", localizableString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ThreadedView{", "}", 0, null, null, 56);
        }
    }

    public final class Title extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Title> CREATOR;
        public final LocalizableString localizable_text;
        public final LocalizedString localized_text;
        public final String text;

        static {
            GenericNonPaymentRenderData$Title$Companion$ADAPTER$1 genericNonPaymentRenderData$Title$Companion$ADAPTER$1 = new GenericNonPaymentRenderData$Title$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Title.class), "type.googleapis.com/squareup.franklin.GenericNonPaymentRenderData.Title", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = genericNonPaymentRenderData$Title$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(genericNonPaymentRenderData$Title$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Title(String str, LocalizedString localizedString, LocalizableString localizableString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.localized_text = localizedString;
            this.localizable_text = localizableString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Title)) {
                return false;
            }
            Title title = (Title) obj;
            return Intrinsics.areEqual(unknownFields(), title.unknownFields()) && Intrinsics.areEqual(this.text, title.text) && Intrinsics.areEqual(this.localized_text, title.localized_text) && Intrinsics.areEqual(this.localizable_text, title.localizable_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.localized_text;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_text;
            int hashCode4 = hashCode3 + (localizableString != null ? localizableString.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Institution.Builder builder = new Institution.Builder(19, false);
            builder.institution_token = this.text;
            builder.display_info = this.localized_text;
            builder.help_menu_items = this.localizable_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            LocalizedString localizedString = this.localized_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localized_text=", localizedString, arrayList);
            }
            LocalizableString localizableString = this.localizable_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Title{", "}", 0, null, null, 56);
        }
    }

    static {
        GenericNonPaymentRenderData$Companion$ADAPTER$1 genericNonPaymentRenderData$Companion$ADAPTER$1 = new GenericNonPaymentRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GenericNonPaymentRenderData.class), "type.googleapis.com/squareup.franklin.GenericNonPaymentRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = genericNonPaymentRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(genericNonPaymentRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericNonPaymentRenderData(Title title, Subtitle subtitle, Avatar avatar, Header header, InlineButton inlineButton, Button button, Button button2, MoreInfoSheet moreInfoSheet, ThreadedView threadedView, HelpCenterLinkType helpCenterLinkType, String str, TertiaryLabelSuffix tertiaryLabelSuffix, Avatar avatar2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = title;
        this.subtitle = subtitle;
        this.avatar = avatar;
        this.header = header;
        this.inline_button = inlineButton;
        this.primary_button = button;
        this.secondary_button = button2;
        this.more_info_sheet = moreInfoSheet;
        this.threaded_view = threadedView;
        this.help_center_link_type = helpCenterLinkType;
        this.url_to_open = str;
        this.tertiary_label_suffix = tertiaryLabelSuffix;
        this.second_avatar = avatar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GenericNonPaymentRenderData)) {
            return false;
        }
        GenericNonPaymentRenderData genericNonPaymentRenderData = (GenericNonPaymentRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), genericNonPaymentRenderData.unknownFields()) && Intrinsics.areEqual(this.title, genericNonPaymentRenderData.title) && Intrinsics.areEqual(this.subtitle, genericNonPaymentRenderData.subtitle) && Intrinsics.areEqual(this.avatar, genericNonPaymentRenderData.avatar) && Intrinsics.areEqual(this.header, genericNonPaymentRenderData.header) && Intrinsics.areEqual(this.inline_button, genericNonPaymentRenderData.inline_button) && Intrinsics.areEqual(this.primary_button, genericNonPaymentRenderData.primary_button) && Intrinsics.areEqual(this.secondary_button, genericNonPaymentRenderData.secondary_button) && Intrinsics.areEqual(this.more_info_sheet, genericNonPaymentRenderData.more_info_sheet) && Intrinsics.areEqual(this.threaded_view, genericNonPaymentRenderData.threaded_view) && this.help_center_link_type == genericNonPaymentRenderData.help_center_link_type && Intrinsics.areEqual(this.url_to_open, genericNonPaymentRenderData.url_to_open) && Intrinsics.areEqual(this.tertiary_label_suffix, genericNonPaymentRenderData.tertiary_label_suffix) && Intrinsics.areEqual(this.second_avatar, genericNonPaymentRenderData.second_avatar);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Title title = this.title;
        int hashCode2 = (hashCode + (title != null ? title.hashCode() : 0)) * 37;
        Subtitle subtitle = this.subtitle;
        int hashCode3 = (hashCode2 + (subtitle != null ? subtitle.hashCode() : 0)) * 37;
        Avatar avatar = this.avatar;
        int hashCode4 = (hashCode3 + (avatar != null ? avatar.hashCode() : 0)) * 37;
        Header header = this.header;
        int hashCode5 = (hashCode4 + (header != null ? header.hashCode() : 0)) * 37;
        InlineButton inlineButton = this.inline_button;
        int hashCode6 = (hashCode5 + (inlineButton != null ? inlineButton.hashCode() : 0)) * 37;
        Button button = this.primary_button;
        int hashCode7 = (hashCode6 + (button != null ? button.hashCode() : 0)) * 37;
        Button button2 = this.secondary_button;
        int hashCode8 = (hashCode7 + (button2 != null ? button2.hashCode() : 0)) * 37;
        MoreInfoSheet moreInfoSheet = this.more_info_sheet;
        int hashCode9 = (hashCode8 + (moreInfoSheet != null ? moreInfoSheet.hashCode() : 0)) * 37;
        ThreadedView threadedView = this.threaded_view;
        int hashCode10 = (hashCode9 + (threadedView != null ? threadedView.hashCode() : 0)) * 37;
        HelpCenterLinkType helpCenterLinkType = this.help_center_link_type;
        int hashCode11 = (hashCode10 + (helpCenterLinkType != null ? helpCenterLinkType.hashCode() : 0)) * 37;
        String str = this.url_to_open;
        int hashCode12 = (hashCode11 + (str != null ? str.hashCode() : 0)) * 37;
        TertiaryLabelSuffix tertiaryLabelSuffix = this.tertiary_label_suffix;
        int hashCode13 = (hashCode12 + (tertiaryLabelSuffix != null ? tertiaryLabelSuffix.hashCode() : 0)) * 37;
        Avatar avatar2 = this.second_avatar;
        int hashCode14 = hashCode13 + (avatar2 != null ? avatar2.hashCode() : 0);
        this.hashCode = hashCode14;
        return hashCode14;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        RewardStatus.Builder builder = new RewardStatus.Builder(9);
        builder.code_entry_enabled = this.title;
        builder.reward_screen_enabled = this.subtitle;
        builder.minimum_code_length = this.avatar;
        builder.reward_button_priority = this.header;
        builder.completed_reward_payments = this.inline_button;
        builder.available_reward_payments = this.primary_button;
        builder.reward_button_text = this.secondary_button;
        builder.reward_header_text = this.more_info_sheet;
        builder.reward_main_text = this.threaded_view;
        builder.reward_payment_amount = this.help_center_link_type;
        builder.code_entry_client_route = this.url_to_open;
        builder.expiration = this.tertiary_label_suffix;
        builder.referral_status_screen = this.second_avatar;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Title title = this.title;
        if (title != null) {
            arrayList.add("title=" + title);
        }
        Subtitle subtitle = this.subtitle;
        if (subtitle != null) {
            arrayList.add("subtitle=" + subtitle);
        }
        Avatar avatar = this.avatar;
        if (avatar != null) {
            arrayList.add("avatar=" + avatar);
        }
        Header header = this.header;
        if (header != null) {
            arrayList.add("header=" + header);
        }
        InlineButton inlineButton = this.inline_button;
        if (inlineButton != null) {
            arrayList.add("inline_button=" + inlineButton);
        }
        Button button = this.primary_button;
        if (button != null) {
            arrayList.add("primary_button=" + button);
        }
        Button button2 = this.secondary_button;
        if (button2 != null) {
            arrayList.add("secondary_button=" + button2);
        }
        MoreInfoSheet moreInfoSheet = this.more_info_sheet;
        if (moreInfoSheet != null) {
            arrayList.add("more_info_sheet=" + moreInfoSheet);
        }
        ThreadedView threadedView = this.threaded_view;
        if (threadedView != null) {
            arrayList.add("threaded_view=" + threadedView);
        }
        HelpCenterLinkType helpCenterLinkType = this.help_center_link_type;
        if (helpCenterLinkType != null) {
            arrayList.add("help_center_link_type=" + helpCenterLinkType);
        }
        String str = this.url_to_open;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url_to_open=", arrayList);
        }
        TertiaryLabelSuffix tertiaryLabelSuffix = this.tertiary_label_suffix;
        if (tertiaryLabelSuffix != null) {
            arrayList.add("tertiary_label_suffix=" + tertiaryLabelSuffix);
        }
        Avatar avatar2 = this.second_avatar;
        if (avatar2 != null) {
            arrayList.add("second_avatar=" + avatar2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GenericNonPaymentRenderData{", "}", 0, null, null, 56);
    }
}
