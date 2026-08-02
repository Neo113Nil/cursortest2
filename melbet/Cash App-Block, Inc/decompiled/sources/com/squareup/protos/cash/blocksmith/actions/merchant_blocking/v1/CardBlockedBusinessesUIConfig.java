package com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.UiAvatar;
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
import squareup.cash.analytics.CdfEvent;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes7.dex */
public final class CardBlockedBusinessesUIConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardBlockedBusinessesUIConfig> CREATOR;
    public final String customer_token;
    public final ErrorMessageDialog error_message;
    public final NavigationHelpItem navigation_item;
    public final List sections;

    public final class ErrorMessageDialog extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ErrorMessageDialog> CREATOR;
        public final LocalizedString button_title;
        public final LocalizedString subtitle;
        public final LocalizedString title;

        static {
            CardBlockedBusinessesUIConfig$ErrorMessageDialog$Companion$ADAPTER$1 cardBlockedBusinessesUIConfig$ErrorMessageDialog$Companion$ADAPTER$1 = new CardBlockedBusinessesUIConfig$ErrorMessageDialog$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ErrorMessageDialog.class), "type.googleapis.com/squareup.cash.blocksmith.actions.merchant_blocking.v1beta1.CardBlockedBusinessesUIConfig.ErrorMessageDialog", Syntax.PROTO_2, null, "squareup/cash/blocksmith/actions/merchant_blocking/v1beta1/card_blocked_businesses_ui_config.proto");
            ADAPTER = cardBlockedBusinessesUIConfig$ErrorMessageDialog$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardBlockedBusinessesUIConfig$ErrorMessageDialog$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorMessageDialog(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
            this.subtitle = localizedString2;
            this.button_title = localizedString3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ErrorMessageDialog)) {
                return false;
            }
            ErrorMessageDialog errorMessageDialog = (ErrorMessageDialog) obj;
            return Intrinsics.areEqual(unknownFields(), errorMessageDialog.unknownFields()) && Intrinsics.areEqual(this.title, errorMessageDialog.title) && Intrinsics.areEqual(this.subtitle, errorMessageDialog.subtitle) && Intrinsics.areEqual(this.button_title, errorMessageDialog.button_title);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.button_title;
            int hashCode4 = hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CashCreditScoreEntryPointData.InstalledState.Subtitle.Builder builder = new CashCreditScoreEntryPointData.InstalledState.Subtitle.Builder(2);
            builder.emphasis = this.title;
            builder.brief = this.subtitle;
            builder.accessibility_description = this.button_title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.button_title;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("button_title=", localizedString3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ErrorMessageDialog{", "}", 0, null, null, 56);
        }
    }

    public final class MerchantRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MerchantRow> CREATOR;
        public final String button_action_client_route;
        public final CdfEvent button_action_event;
        public final LocalizedString button_action_title;
        public final Color button_action_title_color;
        public final String merchant_name;
        public final String merchant_token;
        public final Avatar merchant_ui_avatar;
        public final String row_tap_action_client_route;
        public final CdfEvent row_tap_action_event;
        public final UiAvatar ui_avatar;

        static {
            CardBlockedBusinessesUIConfig$MerchantRow$Companion$ADAPTER$1 cardBlockedBusinessesUIConfig$MerchantRow$Companion$ADAPTER$1 = new CardBlockedBusinessesUIConfig$MerchantRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MerchantRow.class), "type.googleapis.com/squareup.cash.blocksmith.actions.merchant_blocking.v1beta1.CardBlockedBusinessesUIConfig.MerchantRow", Syntax.PROTO_2, null, "squareup/cash/blocksmith/actions/merchant_blocking/v1beta1/card_blocked_businesses_ui_config.proto");
            ADAPTER = cardBlockedBusinessesUIConfig$MerchantRow$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardBlockedBusinessesUIConfig$MerchantRow$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MerchantRow(String str, String str2, String str3, CdfEvent cdfEvent, String str4, CdfEvent cdfEvent2, LocalizedString localizedString, Color color, Avatar avatar, UiAvatar uiAvatar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.merchant_token = str;
            this.merchant_name = str2;
            this.row_tap_action_client_route = str3;
            this.row_tap_action_event = cdfEvent;
            this.button_action_client_route = str4;
            this.button_action_event = cdfEvent2;
            this.button_action_title = localizedString;
            this.button_action_title_color = color;
            this.merchant_ui_avatar = avatar;
            this.ui_avatar = uiAvatar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MerchantRow)) {
                return false;
            }
            MerchantRow merchantRow = (MerchantRow) obj;
            return Intrinsics.areEqual(unknownFields(), merchantRow.unknownFields()) && Intrinsics.areEqual(this.merchant_token, merchantRow.merchant_token) && Intrinsics.areEqual(this.merchant_name, merchantRow.merchant_name) && Intrinsics.areEqual(this.row_tap_action_client_route, merchantRow.row_tap_action_client_route) && Intrinsics.areEqual(this.row_tap_action_event, merchantRow.row_tap_action_event) && Intrinsics.areEqual(this.button_action_client_route, merchantRow.button_action_client_route) && Intrinsics.areEqual(this.button_action_event, merchantRow.button_action_event) && Intrinsics.areEqual(this.button_action_title, merchantRow.button_action_title) && Intrinsics.areEqual(this.button_action_title_color, merchantRow.button_action_title_color) && Intrinsics.areEqual(this.merchant_ui_avatar, merchantRow.merchant_ui_avatar) && Intrinsics.areEqual(this.ui_avatar, merchantRow.ui_avatar);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.merchant_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.merchant_name;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.row_tap_action_client_route;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            CdfEvent cdfEvent = this.row_tap_action_event;
            int hashCode5 = (hashCode4 + (cdfEvent != null ? cdfEvent.hashCode() : 0)) * 37;
            String str4 = this.button_action_client_route;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
            CdfEvent cdfEvent2 = this.button_action_event;
            int hashCode7 = (hashCode6 + (cdfEvent2 != null ? cdfEvent2.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.button_action_title;
            int hashCode8 = (hashCode7 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Color color = this.button_action_title_color;
            int hashCode9 = (hashCode8 + (color != null ? color.hashCode() : 0)) * 37;
            Avatar avatar = this.merchant_ui_avatar;
            int hashCode10 = (hashCode9 + (avatar != null ? avatar.hashCode() : 0)) * 37;
            UiAvatar uiAvatar = this.ui_avatar;
            int hashCode11 = hashCode10 + (uiAvatar != null ? uiAvatar.hashCode() : 0);
            this.hashCode = hashCode11;
            return hashCode11;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CashInRequest.Builder builder = new CashInRequest.Builder(1);
            builder.external_id = this.merchant_token;
            builder.passcode_token = this.merchant_name;
            builder.external_client_transfer_token = this.row_tap_action_client_route;
            builder.request_context = this.row_tap_action_event;
            builder.source = this.button_action_client_route;
            builder.target = this.button_action_event;
            builder.amount = this.button_action_title;
            builder.call_context = this.button_action_title_color;
            builder.forwarded_call_context = this.merchant_ui_avatar;
            builder.client_verified_digital_wallet = this.ui_avatar;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.merchant_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchant_token=", arrayList);
            }
            String str2 = this.merchant_name;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "merchant_name=", arrayList);
            }
            String str3 = this.row_tap_action_client_route;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "row_tap_action_client_route=", arrayList);
            }
            CdfEvent cdfEvent = this.row_tap_action_event;
            if (cdfEvent != null) {
                arrayList.add("row_tap_action_event=" + cdfEvent);
            }
            String str4 = this.button_action_client_route;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "button_action_client_route=", arrayList);
            }
            CdfEvent cdfEvent2 = this.button_action_event;
            if (cdfEvent2 != null) {
                arrayList.add("button_action_event=" + cdfEvent2);
            }
            LocalizedString localizedString = this.button_action_title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("button_action_title=", localizedString, arrayList);
            }
            Color color = this.button_action_title_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("button_action_title_color=", color, arrayList);
            }
            Avatar avatar = this.merchant_ui_avatar;
            if (avatar != null) {
                arrayList.add("merchant_ui_avatar=" + avatar);
            }
            UiAvatar uiAvatar = this.ui_avatar;
            if (uiAvatar != null) {
                Matcher$$ExternalSyntheticOutline0.m("ui_avatar=", uiAvatar, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MerchantRow{", "}", 0, null, null, 56);
        }
    }

    public final class NavigationHelpItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<NavigationHelpItem> CREATOR;
        public final LocalizedString navigation_item_accessibility_text;
        public final String navigation_item_action_client_route;
        public final CdfEvent navigation_item_action_event;

        static {
            CardBlockedBusinessesUIConfig$NavigationHelpItem$Companion$ADAPTER$1 cardBlockedBusinessesUIConfig$NavigationHelpItem$Companion$ADAPTER$1 = new CardBlockedBusinessesUIConfig$NavigationHelpItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NavigationHelpItem.class), "type.googleapis.com/squareup.cash.blocksmith.actions.merchant_blocking.v1beta1.CardBlockedBusinessesUIConfig.NavigationHelpItem", Syntax.PROTO_2, null, "squareup/cash/blocksmith/actions/merchant_blocking/v1beta1/card_blocked_businesses_ui_config.proto");
            ADAPTER = cardBlockedBusinessesUIConfig$NavigationHelpItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardBlockedBusinessesUIConfig$NavigationHelpItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigationHelpItem(String str, CdfEvent cdfEvent, LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.navigation_item_action_client_route = str;
            this.navigation_item_action_event = cdfEvent;
            this.navigation_item_accessibility_text = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NavigationHelpItem)) {
                return false;
            }
            NavigationHelpItem navigationHelpItem = (NavigationHelpItem) obj;
            return Intrinsics.areEqual(unknownFields(), navigationHelpItem.unknownFields()) && Intrinsics.areEqual(this.navigation_item_action_client_route, navigationHelpItem.navigation_item_action_client_route) && Intrinsics.areEqual(this.navigation_item_action_event, navigationHelpItem.navigation_item_action_event) && Intrinsics.areEqual(this.navigation_item_accessibility_text, navigationHelpItem.navigation_item_accessibility_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.navigation_item_action_client_route;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            CdfEvent cdfEvent = this.navigation_item_action_event;
            int hashCode3 = (hashCode2 + (cdfEvent != null ? cdfEvent.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.navigation_item_accessibility_text;
            int hashCode4 = hashCode3 + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Section.Builder builder = new Section.Builder(15);
            builder.header_text = this.navigation_item_action_client_route;
            builder.header_button = this.navigation_item_action_event;
            builder.groups = this.navigation_item_accessibility_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.navigation_item_action_client_route;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "navigation_item_action_client_route=", arrayList);
            }
            CdfEvent cdfEvent = this.navigation_item_action_event;
            if (cdfEvent != null) {
                arrayList.add("navigation_item_action_event=" + cdfEvent);
            }
            LocalizedString localizedString = this.navigation_item_accessibility_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("navigation_item_accessibility_text=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "NavigationHelpItem{", "}", 0, null, null, 56);
        }
    }

    public final class SectionConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SectionConfig> CREATOR;
        public final List merchant_rows;
        public final LocalizedString section_title;

        static {
            CardBlockedBusinessesUIConfig$SectionConfig$Companion$ADAPTER$1 cardBlockedBusinessesUIConfig$SectionConfig$Companion$ADAPTER$1 = new CardBlockedBusinessesUIConfig$SectionConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SectionConfig.class), "type.googleapis.com/squareup.cash.blocksmith.actions.merchant_blocking.v1beta1.CardBlockedBusinessesUIConfig.SectionConfig", Syntax.PROTO_2, null, "squareup/cash/blocksmith/actions/merchant_blocking/v1beta1/card_blocked_businesses_ui_config.proto");
            ADAPTER = cardBlockedBusinessesUIConfig$SectionConfig$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardBlockedBusinessesUIConfig$SectionConfig$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionConfig(LocalizedString localizedString, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.section_title = localizedString;
            this.merchant_rows = TransactorKt.immutableCopyOf("merchant_rows", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SectionConfig)) {
                return false;
            }
            SectionConfig sectionConfig = (SectionConfig) obj;
            return Intrinsics.areEqual(unknownFields(), sectionConfig.unknownFields()) && Intrinsics.areEqual(this.section_title, sectionConfig.section_title) && Intrinsics.areEqual(this.merchant_rows, sectionConfig.merchant_rows);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.section_title;
            int hashCode2 = this.merchant_rows.hashCode() + ((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsApplet.FullApplet.Builder builder = new BillsApplet.FullApplet.Builder(5);
            builder.title = this.section_title;
            builder.lines = this.merchant_rows;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.section_title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("section_title=", localizedString, arrayList);
            }
            List list = this.merchant_rows;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("merchant_rows=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SectionConfig{", "}", 0, null, null, 56);
        }
    }

    static {
        CardBlockedBusinessesUIConfig$Companion$ADAPTER$1 cardBlockedBusinessesUIConfig$Companion$ADAPTER$1 = new CardBlockedBusinessesUIConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardBlockedBusinessesUIConfig.class), "type.googleapis.com/squareup.cash.blocksmith.actions.merchant_blocking.v1beta1.CardBlockedBusinessesUIConfig", Syntax.PROTO_2, null, "squareup/cash/blocksmith/actions/merchant_blocking/v1beta1/card_blocked_businesses_ui_config.proto");
        ADAPTER = cardBlockedBusinessesUIConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardBlockedBusinessesUIConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBlockedBusinessesUIConfig(String str, List list, NavigationHelpItem navigationHelpItem, ErrorMessageDialog errorMessageDialog, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.customer_token = str;
        this.navigation_item = navigationHelpItem;
        this.error_message = errorMessageDialog;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardBlockedBusinessesUIConfig)) {
            return false;
        }
        CardBlockedBusinessesUIConfig cardBlockedBusinessesUIConfig = (CardBlockedBusinessesUIConfig) obj;
        return Intrinsics.areEqual(unknownFields(), cardBlockedBusinessesUIConfig.unknownFields()) && Intrinsics.areEqual(this.customer_token, cardBlockedBusinessesUIConfig.customer_token) && Intrinsics.areEqual(this.sections, cardBlockedBusinessesUIConfig.sections) && Intrinsics.areEqual(this.navigation_item, cardBlockedBusinessesUIConfig.navigation_item) && Intrinsics.areEqual(this.error_message, cardBlockedBusinessesUIConfig.error_message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.sections);
        NavigationHelpItem navigationHelpItem = this.navigation_item;
        int hashCode2 = (m + (navigationHelpItem != null ? navigationHelpItem.hashCode() : 0)) * 37;
        ErrorMessageDialog errorMessageDialog = this.error_message;
        int hashCode3 = hashCode2 + (errorMessageDialog != null ? errorMessageDialog.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(26);
        builder.item_variable = this.customer_token;
        builder.collection = this.sections;
        builder.template = this.navigation_item;
        builder.source = this.error_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        NavigationHelpItem navigationHelpItem = this.navigation_item;
        if (navigationHelpItem != null) {
            arrayList.add("navigation_item=" + navigationHelpItem);
        }
        ErrorMessageDialog errorMessageDialog = this.error_message;
        if (errorMessageDialog != null) {
            arrayList.add("error_message=" + errorMessageDialog);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardBlockedBusinessesUIConfig{", "}", 0, null, null, 56);
    }
}
