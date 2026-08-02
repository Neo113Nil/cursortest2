package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashstorefronts.api.AfterpayAppMetadata;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.ui.UiControl;
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
import squareup.cash.bankingbenefits.ui.BenefitExplainerScreen;

/* loaded from: classes8.dex */
public final class BalanceData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BalanceData> CREATOR;
    public final Boolean adding_cash_enabled;
    public final List balance_limit_groups;
    public final Boolean bitcoin_p2p_enabled;
    public final Boolean cash_balance_home_screen_button_enabled;
    public final Integer cash_balance_home_screen_button_priority;
    public final Boolean check_deposits_enabled;
    public final Button dda_form;
    public final Button deposit_check;
    public final Button direct_deposit;
    public final String enable_cryptocurrency_transfer_in_button_text;
    public final EnableCryptocurrencyTransferInStatus enable_cryptocurrency_transfer_in_status;
    public final String enable_cryptocurrency_transfer_out_button_text;
    public final EnableCryptocurrencyTransferOutStatus enable_cryptocurrency_transfer_out_status;
    public final ScheduledReloadData scheduled_btc_buy_data;
    public final Boolean scheduled_btc_buy_enabled;
    public final ScheduledReloadData scheduled_reload_data;
    public final Boolean scheduled_reload_enabled;
    public final List supported_transfer_instruments;

    /* loaded from: classes.dex */
    public final class Button extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Button> CREATOR;
        public final Action action;
        public final ClientScenario client_scenario;
        public final Dialog dialog;
        public final LocalizableString localizable_text;
        public final String text;

        /* loaded from: classes8.dex */
        public enum Action implements WireEnum {
            DO_CLIENT_SCENARIO(1),
            SHOW_DDA_COPY_AND_PASTE(2),
            SHOW_DIALOG(3);

            public final int value;
            public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
            public static final BalanceData$Button$Action$Companion$ADAPTER$1 ADAPTER = new BalanceData$Button$Action$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Action.class), Syntax.PROTO_2, null);

            Action(int i) {
                this.value = i;
            }

            public static final Action fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return DO_CLIENT_SCENARIO;
                }
                if (i == 2) {
                    return SHOW_DDA_COPY_AND_PASTE;
                }
                if (i != 3) {
                    return null;
                }
                return SHOW_DIALOG;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            BalanceData$Button$Companion$ADAPTER$1 balanceData$Button$Companion$ADAPTER$1 = new BalanceData$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.franklin.common.BalanceData.Button", Syntax.PROTO_2, null, "squareup/franklin/common/balance_data.proto");
            ADAPTER = balanceData$Button$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(balanceData$Button$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Button(Action action, ClientScenario clientScenario, Dialog dialog, String str, LocalizableString localizableString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.action = action;
            this.client_scenario = clientScenario;
            this.dialog = dialog;
            this.text = str;
            this.localizable_text = localizableString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && this.action == button.action && this.client_scenario == button.client_scenario && Intrinsics.areEqual(this.dialog, button.dialog) && Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.localizable_text, button.localizable_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Action action = this.action;
            int hashCode2 = (hashCode + (action != null ? action.hashCode() : 0)) * 37;
            ClientScenario clientScenario = this.client_scenario;
            int hashCode3 = (hashCode2 + (clientScenario != null ? clientScenario.hashCode() : 0)) * 37;
            Dialog dialog = this.dialog;
            int hashCode4 = (hashCode3 + (dialog != null ? dialog.hashCode() : 0)) * 37;
            String str = this.text;
            int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_text;
            int hashCode6 = hashCode5 + (localizableString != null ? localizableString.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileAlias.Builder builder = new ProfileAlias.Builder(5, false);
            builder.alias = this.action;
            builder.verified = this.client_scenario;
            builder.expires_at = this.dialog;
            builder.version = this.text;
            builder.display_date = this.localizable_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Action action = this.action;
            if (action != null) {
                arrayList.add("action=" + action);
            }
            ClientScenario clientScenario = this.client_scenario;
            if (clientScenario != null) {
                Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
            }
            Dialog dialog = this.dialog;
            if (dialog != null) {
                arrayList.add("dialog=" + dialog);
            }
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            LocalizableString localizableString = this.localizable_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
        }
    }

    public final class Dialog extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Dialog> CREATOR;
        public final LocalizableString localizable_main_text;
        public final LocalizableString localizable_title;
        public final String main_text;
        public final Button primary_button;
        public final Button secondary_button;
        public final Button tertiary_button;
        public final String title;

        public final class Button extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Button> CREATOR;
            public final Action action;
            public final ClientScenario client_scenario;
            public final LocalizableString localizable_text;
            public final String text;

            public enum Action implements WireEnum {
                DO_CLIENT_SCENARIO(1),
                DISMISS(2);

                public final int value;
                public static final LinkResult.Companion Companion = new LinkResult.Companion();
                public static final BalanceData$Dialog$Button$Action$Companion$ADAPTER$1 ADAPTER = new BalanceData$Dialog$Button$Action$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Action.class), Syntax.PROTO_2, null);

                Action(int i) {
                    this.value = i;
                }

                public static final Action fromValue(int i) {
                    Companion.getClass();
                    if (i == 1) {
                        return DO_CLIENT_SCENARIO;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DISMISS;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                BalanceData$Dialog$Button$Companion$ADAPTER$1 balanceData$Dialog$Button$Companion$ADAPTER$1 = new BalanceData$Dialog$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.franklin.common.BalanceData.Dialog.Button", Syntax.PROTO_2, null, "squareup/franklin/common/balance_data.proto");
                ADAPTER = balanceData$Dialog$Button$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(balanceData$Dialog$Button$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(String str, LocalizableString localizableString, Action action, ClientScenario clientScenario, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = str;
                this.localizable_text = localizableString;
                this.action = action;
                this.client_scenario = clientScenario;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.localizable_text, button.localizable_text) && this.action == button.action && this.client_scenario == button.client_scenario;
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
                int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
                Action action = this.action;
                int hashCode4 = (hashCode3 + (action != null ? action.hashCode() : 0)) * 37;
                ClientScenario clientScenario = this.client_scenario;
                int hashCode5 = hashCode4 + (clientScenario != null ? clientScenario.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ColoredButton.Builder builder = new ColoredButton.Builder(20);
                builder.button_color = this.text;
                builder.text_color = this.localizable_text;
                builder.text = this.action;
                builder.action = this.client_scenario;
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
                Action action = this.action;
                if (action != null) {
                    arrayList.add("action=" + action);
                }
                ClientScenario clientScenario = this.client_scenario;
                if (clientScenario != null) {
                    Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
            }
        }

        static {
            BalanceData$Dialog$Companion$ADAPTER$1 balanceData$Dialog$Companion$ADAPTER$1 = new BalanceData$Dialog$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Dialog.class), "type.googleapis.com/squareup.franklin.common.BalanceData.Dialog", Syntax.PROTO_2, null, "squareup/franklin/common/balance_data.proto");
            ADAPTER = balanceData$Dialog$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(balanceData$Dialog$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, Button button, Button button2, Button button3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.localizable_title = localizableString;
            this.main_text = str2;
            this.localizable_main_text = localizableString2;
            this.primary_button = button;
            this.secondary_button = button2;
            this.tertiary_button = button3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) obj;
            return Intrinsics.areEqual(unknownFields(), dialog.unknownFields()) && Intrinsics.areEqual(this.title, dialog.title) && Intrinsics.areEqual(this.localizable_title, dialog.localizable_title) && Intrinsics.areEqual(this.main_text, dialog.main_text) && Intrinsics.areEqual(this.localizable_main_text, dialog.localizable_main_text) && Intrinsics.areEqual(this.primary_button, dialog.primary_button) && Intrinsics.areEqual(this.secondary_button, dialog.secondary_button) && Intrinsics.areEqual(this.tertiary_button, dialog.tertiary_button);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_title;
            int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            String str2 = this.main_text;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_main_text;
            int hashCode5 = (hashCode4 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
            Button button = this.primary_button;
            int hashCode6 = (hashCode5 + (button != null ? button.hashCode() : 0)) * 37;
            Button button2 = this.secondary_button;
            int hashCode7 = (hashCode6 + (button2 != null ? button2.hashCode() : 0)) * 37;
            Button button3 = this.tertiary_button;
            int hashCode8 = hashCode7 + (button3 != null ? button3.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Alias.Builder builder = new Alias.Builder(5, false);
            builder.scope = this.title;
            builder.f1407type = this.localizable_title;
            builder.value = this.main_text;
            builder.first_verified_at_ms = this.localizable_main_text;
            builder.last_verified_at_ms = this.primary_button;
            builder.created_at = this.secondary_button;
            builder.updated_at = this.tertiary_button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            LocalizableString localizableString = this.localizable_title;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
            }
            String str2 = this.main_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "main_text=", arrayList);
            }
            LocalizableString localizableString2 = this.localizable_main_text;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_main_text=", localizableString2, arrayList);
            }
            Button button = this.primary_button;
            if (button != null) {
                arrayList.add("primary_button=" + button);
            }
            Button button2 = this.secondary_button;
            if (button2 != null) {
                arrayList.add("secondary_button=" + button2);
            }
            Button button3 = this.tertiary_button;
            if (button3 != null) {
                arrayList.add("tertiary_button=" + button3);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Dialog{", "}", 0, null, null, 56);
        }
    }

    static {
        BalanceData$Companion$ADAPTER$1 balanceData$Companion$ADAPTER$1 = new BalanceData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BalanceData.class), "type.googleapis.com/squareup.franklin.common.BalanceData", Syntax.PROTO_2, null, "squareup/franklin/common/balance_data.proto");
        ADAPTER = balanceData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(balanceData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceData(List list, Boolean bool, Integer num, Boolean bool2, EnableCryptocurrencyTransferOutStatus enableCryptocurrencyTransferOutStatus, String str, EnableCryptocurrencyTransferInStatus enableCryptocurrencyTransferInStatus, String str2, List list2, ScheduledReloadData scheduledReloadData, Boolean bool3, ScheduledReloadData scheduledReloadData2, Boolean bool4, Boolean bool5, Button button, Button button2, Button button3, Boolean bool6, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.cash_balance_home_screen_button_enabled = bool;
        this.cash_balance_home_screen_button_priority = num;
        this.adding_cash_enabled = bool2;
        this.enable_cryptocurrency_transfer_out_status = enableCryptocurrencyTransferOutStatus;
        this.enable_cryptocurrency_transfer_out_button_text = str;
        this.enable_cryptocurrency_transfer_in_status = enableCryptocurrencyTransferInStatus;
        this.enable_cryptocurrency_transfer_in_button_text = str2;
        this.scheduled_reload_data = scheduledReloadData;
        this.scheduled_reload_enabled = bool3;
        this.scheduled_btc_buy_data = scheduledReloadData2;
        this.scheduled_btc_buy_enabled = bool4;
        this.check_deposits_enabled = bool5;
        this.direct_deposit = button;
        this.deposit_check = button2;
        this.dda_form = button3;
        this.bitcoin_p2p_enabled = bool6;
        this.supported_transfer_instruments = TransactorKt.immutableCopyOf("supported_transfer_instruments", list);
        this.balance_limit_groups = TransactorKt.immutableCopyOf("balance_limit_groups", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BalanceData)) {
            return false;
        }
        BalanceData balanceData = (BalanceData) obj;
        return Intrinsics.areEqual(unknownFields(), balanceData.unknownFields()) && Intrinsics.areEqual(this.supported_transfer_instruments, balanceData.supported_transfer_instruments) && Intrinsics.areEqual(this.cash_balance_home_screen_button_enabled, balanceData.cash_balance_home_screen_button_enabled) && Intrinsics.areEqual(this.cash_balance_home_screen_button_priority, balanceData.cash_balance_home_screen_button_priority) && Intrinsics.areEqual(this.adding_cash_enabled, balanceData.adding_cash_enabled) && this.enable_cryptocurrency_transfer_out_status == balanceData.enable_cryptocurrency_transfer_out_status && Intrinsics.areEqual(this.enable_cryptocurrency_transfer_out_button_text, balanceData.enable_cryptocurrency_transfer_out_button_text) && this.enable_cryptocurrency_transfer_in_status == balanceData.enable_cryptocurrency_transfer_in_status && Intrinsics.areEqual(this.enable_cryptocurrency_transfer_in_button_text, balanceData.enable_cryptocurrency_transfer_in_button_text) && Intrinsics.areEqual(this.balance_limit_groups, balanceData.balance_limit_groups) && Intrinsics.areEqual(this.scheduled_reload_data, balanceData.scheduled_reload_data) && Intrinsics.areEqual(this.scheduled_reload_enabled, balanceData.scheduled_reload_enabled) && Intrinsics.areEqual(this.scheduled_btc_buy_data, balanceData.scheduled_btc_buy_data) && Intrinsics.areEqual(this.scheduled_btc_buy_enabled, balanceData.scheduled_btc_buy_enabled) && Intrinsics.areEqual(this.check_deposits_enabled, balanceData.check_deposits_enabled) && Intrinsics.areEqual(this.direct_deposit, balanceData.direct_deposit) && Intrinsics.areEqual(this.deposit_check, balanceData.deposit_check) && Intrinsics.areEqual(this.dda_form, balanceData.dda_form) && Intrinsics.areEqual(this.bitcoin_p2p_enabled, balanceData.bitcoin_p2p_enabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.supported_transfer_instruments);
        Boolean bool = this.cash_balance_home_screen_button_enabled;
        int hashCode = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Integer num = this.cash_balance_home_screen_button_priority;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Boolean bool2 = this.adding_cash_enabled;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        EnableCryptocurrencyTransferOutStatus enableCryptocurrencyTransferOutStatus = this.enable_cryptocurrency_transfer_out_status;
        int hashCode4 = (hashCode3 + (enableCryptocurrencyTransferOutStatus != null ? enableCryptocurrencyTransferOutStatus.hashCode() : 0)) * 37;
        String str = this.enable_cryptocurrency_transfer_out_button_text;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        EnableCryptocurrencyTransferInStatus enableCryptocurrencyTransferInStatus = this.enable_cryptocurrency_transfer_in_status;
        int hashCode6 = (hashCode5 + (enableCryptocurrencyTransferInStatus != null ? enableCryptocurrencyTransferInStatus.hashCode() : 0)) * 37;
        String str2 = this.enable_cryptocurrency_transfer_in_button_text;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.balance_limit_groups);
        ScheduledReloadData scheduledReloadData = this.scheduled_reload_data;
        int hashCode7 = (m2 + (scheduledReloadData != null ? scheduledReloadData.hashCode() : 0)) * 37;
        Boolean bool3 = this.scheduled_reload_enabled;
        int hashCode8 = (hashCode7 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        ScheduledReloadData scheduledReloadData2 = this.scheduled_btc_buy_data;
        int hashCode9 = (hashCode8 + (scheduledReloadData2 != null ? scheduledReloadData2.hashCode() : 0)) * 37;
        Boolean bool4 = this.scheduled_btc_buy_enabled;
        int hashCode10 = (hashCode9 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.check_deposits_enabled;
        int hashCode11 = (hashCode10 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        Button button = this.direct_deposit;
        int hashCode12 = (hashCode11 + (button != null ? button.hashCode() : 0)) * 37;
        Button button2 = this.deposit_check;
        int hashCode13 = (hashCode12 + (button2 != null ? button2.hashCode() : 0)) * 37;
        Button button3 = this.dda_form;
        int hashCode14 = (hashCode13 + (button3 != null ? button3.hashCode() : 0)) * 37;
        Boolean bool6 = this.bitcoin_p2p_enabled;
        int hashCode15 = hashCode14 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0);
        this.hashCode = hashCode15;
        return hashCode15;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.supported_transfer_instruments = this.supported_transfer_instruments;
        builder.cash_balance_home_screen_button_enabled = this.cash_balance_home_screen_button_enabled;
        builder.cash_balance_home_screen_button_priority = this.cash_balance_home_screen_button_priority;
        builder.adding_cash_enabled = this.adding_cash_enabled;
        builder.enable_cryptocurrency_transfer_out_status = this.enable_cryptocurrency_transfer_out_status;
        builder.enable_cryptocurrency_transfer_out_button_text = this.enable_cryptocurrency_transfer_out_button_text;
        builder.enable_cryptocurrency_transfer_in_status = this.enable_cryptocurrency_transfer_in_status;
        builder.enable_cryptocurrency_transfer_in_button_text = this.enable_cryptocurrency_transfer_in_button_text;
        builder.balance_limit_groups = this.balance_limit_groups;
        builder.scheduled_reload_data = this.scheduled_reload_data;
        builder.scheduled_reload_enabled = this.scheduled_reload_enabled;
        builder.scheduled_btc_buy_data = this.scheduled_btc_buy_data;
        builder.scheduled_btc_buy_enabled = this.scheduled_btc_buy_enabled;
        builder.check_deposits_enabled = this.check_deposits_enabled;
        builder.direct_deposit = this.direct_deposit;
        builder.deposit_check = this.deposit_check;
        builder.dda_form = this.dda_form;
        builder.bitcoin_p2p_enabled = this.bitcoin_p2p_enabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.supported_transfer_instruments;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("supported_transfer_instruments=", arrayList, list);
        }
        Boolean bool = this.cash_balance_home_screen_button_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cash_balance_home_screen_button_enabled=", bool, arrayList);
        }
        Integer num = this.cash_balance_home_screen_button_priority;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("cash_balance_home_screen_button_priority=", num, arrayList);
        }
        Boolean bool2 = this.adding_cash_enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("adding_cash_enabled=", bool2, arrayList);
        }
        EnableCryptocurrencyTransferOutStatus enableCryptocurrencyTransferOutStatus = this.enable_cryptocurrency_transfer_out_status;
        if (enableCryptocurrencyTransferOutStatus != null) {
            arrayList.add("enable_cryptocurrency_transfer_out_status=" + enableCryptocurrencyTransferOutStatus);
        }
        String str = this.enable_cryptocurrency_transfer_out_button_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "enable_cryptocurrency_transfer_out_button_text=", arrayList);
        }
        EnableCryptocurrencyTransferInStatus enableCryptocurrencyTransferInStatus = this.enable_cryptocurrency_transfer_in_status;
        if (enableCryptocurrencyTransferInStatus != null) {
            arrayList.add("enable_cryptocurrency_transfer_in_status=" + enableCryptocurrencyTransferInStatus);
        }
        String str2 = this.enable_cryptocurrency_transfer_in_button_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "enable_cryptocurrency_transfer_in_button_text=", arrayList);
        }
        List list2 = this.balance_limit_groups;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("balance_limit_groups=", arrayList, list2);
        }
        ScheduledReloadData scheduledReloadData = this.scheduled_reload_data;
        if (scheduledReloadData != null) {
            arrayList.add("scheduled_reload_data=" + scheduledReloadData);
        }
        Boolean bool3 = this.scheduled_reload_enabled;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("scheduled_reload_enabled=", bool3, arrayList);
        }
        ScheduledReloadData scheduledReloadData2 = this.scheduled_btc_buy_data;
        if (scheduledReloadData2 != null) {
            arrayList.add("scheduled_btc_buy_data=" + scheduledReloadData2);
        }
        Boolean bool4 = this.scheduled_btc_buy_enabled;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("scheduled_btc_buy_enabled=", bool4, arrayList);
        }
        Boolean bool5 = this.check_deposits_enabled;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("check_deposits_enabled=", bool5, arrayList);
        }
        Button button = this.direct_deposit;
        if (button != null) {
            arrayList.add("direct_deposit=" + button);
        }
        Button button2 = this.deposit_check;
        if (button2 != null) {
            arrayList.add("deposit_check=" + button2);
        }
        Button button3 = this.dda_form;
        if (button3 != null) {
            arrayList.add("dda_form=" + button3);
        }
        Boolean bool6 = this.bitcoin_p2p_enabled;
        if (bool6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("bitcoin_p2p_enabled=", bool6, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BalanceData{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object adding_cash_enabled;
        public Object balance_limit_groups;
        public Object bitcoin_p2p_enabled;
        public Object cash_balance_home_screen_button_enabled;
        public Object cash_balance_home_screen_button_priority;
        public Object check_deposits_enabled;
        public Serializable dda_form;
        public Serializable deposit_check;
        public Serializable direct_deposit;
        public String enable_cryptocurrency_transfer_in_button_text;
        public Object enable_cryptocurrency_transfer_in_status;
        public String enable_cryptocurrency_transfer_out_button_text;
        public Object enable_cryptocurrency_transfer_out_status;
        public Serializable scheduled_btc_buy_data;
        public Object scheduled_btc_buy_enabled;
        public Serializable scheduled_reload_data;
        public Object scheduled_reload_enabled;
        public Object supported_transfer_instruments;

        public Builder() {
            this.$r8$classId = 2;
            this.supported_transfer_instruments = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new BalanceData((List) this.supported_transfer_instruments, (Boolean) this.cash_balance_home_screen_button_enabled, (Integer) this.cash_balance_home_screen_button_priority, (Boolean) this.adding_cash_enabled, (EnableCryptocurrencyTransferOutStatus) this.enable_cryptocurrency_transfer_out_status, this.enable_cryptocurrency_transfer_out_button_text, (EnableCryptocurrencyTransferInStatus) this.enable_cryptocurrency_transfer_in_status, this.enable_cryptocurrency_transfer_in_button_text, (List) this.balance_limit_groups, (ScheduledReloadData) this.scheduled_reload_data, (Boolean) this.scheduled_reload_enabled, (ScheduledReloadData) this.scheduled_btc_buy_data, (Boolean) this.scheduled_btc_buy_enabled, (Boolean) this.check_deposits_enabled, (Button) this.direct_deposit, (Button) this.deposit_check, (Button) this.dda_form, (Boolean) this.bitcoin_p2p_enabled, buildUnknownFields());
                case 1:
                    return new AfterpayAppMetadata(this.enable_cryptocurrency_transfer_out_button_text, this.enable_cryptocurrency_transfer_in_button_text, (String) this.supported_transfer_instruments, (String) this.balance_limit_groups, (String) this.scheduled_reload_enabled, (Boolean) this.cash_balance_home_screen_button_enabled, (String) this.scheduled_btc_buy_enabled, (Long) this.check_deposits_enabled, (String) this.bitcoin_p2p_enabled, (String) this.cash_balance_home_screen_button_priority, (String) this.enable_cryptocurrency_transfer_out_status, (String) this.enable_cryptocurrency_transfer_in_status, (String) this.scheduled_reload_data, (String) this.scheduled_btc_buy_data, (String) this.direct_deposit, (Boolean) this.adding_cash_enabled, (String) this.deposit_check, (Long) this.dda_form, buildUnknownFields());
                default:
                    return new GetPaperCashDepositBarcodeResponse.Success(this.enable_cryptocurrency_transfer_out_button_text, (Long) this.balance_limit_groups, this.enable_cryptocurrency_transfer_in_button_text, (List) this.supported_transfer_instruments, (String) this.cash_balance_home_screen_button_enabled, (String) this.adding_cash_enabled, (String) this.scheduled_reload_enabled, (String) this.scheduled_btc_buy_enabled, (String) this.check_deposits_enabled, (String) this.bitcoin_p2p_enabled, (String) this.cash_balance_home_screen_button_priority, (String) this.enable_cryptocurrency_transfer_out_status, (String) this.enable_cryptocurrency_transfer_in_status, (String) this.scheduled_reload_data, (GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage) this.scheduled_btc_buy_data, (String) this.direct_deposit, (String) this.deposit_check, (BenefitExplainerScreen) this.dda_form, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
