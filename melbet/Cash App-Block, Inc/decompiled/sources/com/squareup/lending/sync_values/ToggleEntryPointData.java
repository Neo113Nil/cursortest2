package com.squareup.lending.sync_values;

import android.os.Parcelable;
import app.cash.local.presenters.internal.LoyaltyKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
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
import squareup.cash.earnings.ActionButton;

/* loaded from: classes7.dex */
public final class ToggleEntryPointData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ToggleEntryPointData> CREATOR;
    public final LoyaltyKt action;
    public final CardTabCta card_tab_cta;
    public final String info_icon_url;
    public final String row_override_url;
    public final Icon toggle_icon;
    public final ToggleState toggle_state;
    public final LocalizedString toggle_subtitle_text;
    public final LocalizedString toggle_text;
    public final CardHeader turned_on_card_header;

    public final class CardHeader extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CardHeader> CREATOR;
        public final LocalizedString header_text;
        public final LocalizedString label_header_text;
        public final String pill_client_route;
        public final LocalizedString pill_text;

        static {
            ToggleEntryPointData$CardHeader$Companion$ADAPTER$1 toggleEntryPointData$CardHeader$Companion$ADAPTER$1 = new ToggleEntryPointData$CardHeader$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardHeader.class), "type.googleapis.com/squareup.lending.sync_values.ToggleEntryPointData.CardHeader", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_sync_values.proto");
            ADAPTER = toggleEntryPointData$CardHeader$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(toggleEntryPointData$CardHeader$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardHeader(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label_header_text = localizedString;
            this.header_text = localizedString2;
            this.pill_text = localizedString3;
            this.pill_client_route = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CardHeader)) {
                return false;
            }
            CardHeader cardHeader = (CardHeader) obj;
            return Intrinsics.areEqual(unknownFields(), cardHeader.unknownFields()) && Intrinsics.areEqual(this.label_header_text, cardHeader.label_header_text) && Intrinsics.areEqual(this.header_text, cardHeader.header_text) && Intrinsics.areEqual(this.pill_text, cardHeader.pill_text) && Intrinsics.areEqual(this.pill_client_route, cardHeader.pill_client_route);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.label_header_text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.header_text;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.pill_text;
            int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            String str = this.pill_client_route;
            int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ForEach.Builder builder = new ForEach.Builder(16);
            builder.collection = this.label_header_text;
            builder.template = this.header_text;
            builder.source = this.pill_text;
            builder.item_variable = this.pill_client_route;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.label_header_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("label_header_text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.header_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("header_text=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.pill_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("pill_text=", localizedString3, arrayList);
            }
            String str = this.pill_client_route;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "pill_client_route=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CardHeader{", "}", 0, null, null, 56);
        }
    }

    public final class CardTabCta extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CardTabCta> CREATOR;
        public final Button button;
        public final LocalizedString subtitle;
        public final LocalizedString title;

        public final class Button extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Button> CREATOR;
            public final String client_route;
            public final LocalizedString text;

            static {
                ToggleEntryPointData$CardTabCta$Button$Companion$ADAPTER$1 toggleEntryPointData$CardTabCta$Button$Companion$ADAPTER$1 = new ToggleEntryPointData$CardTabCta$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.lending.sync_values.ToggleEntryPointData.CardTabCta.Button", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_sync_values.proto");
                ADAPTER = toggleEntryPointData$CardTabCta$Button$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(toggleEntryPointData$CardTabCta$Button$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(LocalizedString localizedString, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = localizedString;
                this.client_route = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.client_route, button.client_route);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                String str = this.client_route;
                int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ActionButton.Builder builder = new ActionButton.Builder(2);
                builder.title = this.text;
                builder.client_route = this.client_route;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
                }
                String str = this.client_route;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
            }
        }

        static {
            ToggleEntryPointData$CardTabCta$Companion$ADAPTER$1 toggleEntryPointData$CardTabCta$Companion$ADAPTER$1 = new ToggleEntryPointData$CardTabCta$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardTabCta.class), "type.googleapis.com/squareup.lending.sync_values.ToggleEntryPointData.CardTabCta", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_sync_values.proto");
            ADAPTER = toggleEntryPointData$CardTabCta$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(toggleEntryPointData$CardTabCta$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardTabCta(LocalizedString localizedString, LocalizedString localizedString2, Button button, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
            this.subtitle = localizedString2;
            this.button = button;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CardTabCta)) {
                return false;
            }
            CardTabCta cardTabCta = (CardTabCta) obj;
            return Intrinsics.areEqual(unknownFields(), cardTabCta.unknownFields()) && Intrinsics.areEqual(this.title, cardTabCta.title) && Intrinsics.areEqual(this.subtitle, cardTabCta.subtitle) && Intrinsics.areEqual(this.button, cardTabCta.button);
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
            Button button = this.button;
            int hashCode4 = hashCode3 + (button != null ? button.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Section.Builder builder = new Section.Builder(5);
            builder.header_text = this.title;
            builder.header_button = this.subtitle;
            builder.groups = this.button;
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
            Button button = this.button;
            if (button != null) {
                arrayList.add("button=" + button);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CardTabCta{", "}", 0, null, null, 56);
        }
    }

    public enum ToggleState implements WireEnum {
        TOGGLE_STATE_UNSPECIFIED(0),
        TURNED_OFF(1),
        TURNED_ON(2),
        DISABLED(3);

        public static final ToggleEntryPointData$ToggleState$Companion$ADAPTER$1 ADAPTER;
        public static final Error.Code.Companion Companion;
        public final int value;

        static {
            ToggleState toggleState = TOGGLE_STATE_UNSPECIFIED;
            Companion = new Error.Code.Companion(14);
            ADAPTER = new ToggleEntryPointData$ToggleState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ToggleState.class), Syntax.PROTO_2, toggleState);
        }

        ToggleState(int i) {
            this.value = i;
        }

        public static final ToggleState fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return TOGGLE_STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return TURNED_OFF;
            }
            if (i == 2) {
                return TURNED_ON;
            }
            if (i != 3) {
                return null;
            }
            return DISABLED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ToggleEntryPointData$Companion$ADAPTER$1 toggleEntryPointData$Companion$ADAPTER$1 = new ToggleEntryPointData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ToggleEntryPointData.class), "type.googleapis.com/squareup.lending.sync_values.ToggleEntryPointData", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_sync_values.proto");
        ADAPTER = toggleEntryPointData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(toggleEntryPointData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleEntryPointData(Icon icon, ToggleState toggleState, LoyaltyKt loyaltyKt, LocalizedString localizedString, LocalizedString localizedString2, CardHeader cardHeader, CardTabCta cardTabCta, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.toggle_icon = icon;
        this.toggle_state = toggleState;
        this.action = loyaltyKt;
        this.toggle_text = localizedString;
        this.toggle_subtitle_text = localizedString2;
        this.turned_on_card_header = cardHeader;
        this.card_tab_cta = cardTabCta;
        this.row_override_url = str;
        this.info_icon_url = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ToggleEntryPointData)) {
            return false;
        }
        ToggleEntryPointData toggleEntryPointData = (ToggleEntryPointData) obj;
        return Intrinsics.areEqual(unknownFields(), toggleEntryPointData.unknownFields()) && Intrinsics.areEqual(this.toggle_icon, toggleEntryPointData.toggle_icon) && this.toggle_state == toggleEntryPointData.toggle_state && Intrinsics.areEqual(this.action, toggleEntryPointData.action) && Intrinsics.areEqual(this.toggle_text, toggleEntryPointData.toggle_text) && Intrinsics.areEqual(this.toggle_subtitle_text, toggleEntryPointData.toggle_subtitle_text) && Intrinsics.areEqual(this.turned_on_card_header, toggleEntryPointData.turned_on_card_header) && Intrinsics.areEqual(this.card_tab_cta, toggleEntryPointData.card_tab_cta) && Intrinsics.areEqual(this.row_override_url, toggleEntryPointData.row_override_url) && Intrinsics.areEqual(this.info_icon_url, toggleEntryPointData.info_icon_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Icon icon = this.toggle_icon;
        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        ToggleState toggleState = this.toggle_state;
        int hashCode3 = (hashCode2 + (toggleState != null ? toggleState.hashCode() : 0)) * 37;
        LoyaltyKt loyaltyKt = this.action;
        int hashCode4 = (hashCode3 + (loyaltyKt != null ? loyaltyKt.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.toggle_text;
        int hashCode5 = (hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.toggle_subtitle_text;
        int hashCode6 = (hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        CardHeader cardHeader = this.turned_on_card_header;
        int hashCode7 = (hashCode6 + (cardHeader != null ? cardHeader.hashCode() : 0)) * 37;
        CardTabCta cardTabCta = this.card_tab_cta;
        int hashCode8 = (hashCode7 + (cardTabCta != null ? cardTabCta.hashCode() : 0)) * 37;
        String str = this.row_override_url;
        int hashCode9 = (hashCode8 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.info_icon_url;
        int hashCode10 = hashCode9 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(3, false);
        builder.locale = this.toggle_icon;
        builder.footer_text = this.toggle_state;
        builder.loadable_subtitle = this.action;
        builder.title = this.toggle_text;
        builder.info_rows_header = this.toggle_subtitle_text;
        builder.info_rows = this.turned_on_card_header;
        builder.primary_footer_button_state = this.card_tab_cta;
        builder.secondary_footer_button_state = this.row_override_url;
        builder.payment_plans_data = this.info_icon_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Icon icon = this.toggle_icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("toggle_icon=", icon, arrayList);
        }
        ToggleState toggleState = this.toggle_state;
        if (toggleState != null) {
            arrayList.add("toggle_state=" + toggleState);
        }
        LoyaltyKt loyaltyKt = this.action;
        if (loyaltyKt != null) {
            arrayList.add("action=" + loyaltyKt);
        }
        LocalizedString localizedString = this.toggle_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("toggle_text=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.toggle_subtitle_text;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("toggle_subtitle_text=", localizedString2, arrayList);
        }
        CardHeader cardHeader = this.turned_on_card_header;
        if (cardHeader != null) {
            arrayList.add("turned_on_card_header=" + cardHeader);
        }
        CardTabCta cardTabCta = this.card_tab_cta;
        if (cardTabCta != null) {
            arrayList.add("card_tab_cta=" + cardTabCta);
        }
        String str = this.row_override_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "row_override_url=", arrayList);
        }
        String str2 = this.info_icon_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "info_icon_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ToggleEntryPointData{", "}", 0, null, null, 56);
    }
}
