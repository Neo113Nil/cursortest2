package com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues;

import android.os.Parcelable;
import app.cash.local.primitives.ComputedOrderSummaryKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.cash.balancebasedaddcash.core.models.DisablePreferenceReason;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
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
import squareup.cash.earnings.ActivitySection;
import squareup.cash.overdraft.OverdraftUsage;

/* loaded from: classes7.dex */
public final class BalanceBasedAddCashPreference extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BalanceBasedAddCashPreference> CREATOR;
    public final ComputedOrderSummaryKt preference;
    public final LocalizedString subtitle;
    public final LocalizedString title;

    public final class DialogBox extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DialogBox> CREATOR;
        public final LocalizedString button_text;
        public final String client_route;
        public final LocalizedString description;
        public final LocalizedString dismiss_button_text;
        public final LocalizedString title;

        static {
            BalanceBasedAddCashPreference$DialogBox$Companion$ADAPTER$1 balanceBasedAddCashPreference$DialogBox$Companion$ADAPTER$1 = new BalanceBasedAddCashPreference$DialogBox$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DialogBox.class), "type.googleapis.com/squareup.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference.DialogBox", Syntax.PROTO_2, null, "squareup/cash/balancebasedaddcash/api/v1_0/syncvalues/BalanceBasedAddCashPreference.proto");
            ADAPTER = balanceBasedAddCashPreference$DialogBox$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(balanceBasedAddCashPreference$DialogBox$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogBox(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
            this.description = localizedString2;
            this.button_text = localizedString3;
            this.dismiss_button_text = localizedString4;
            this.client_route = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DialogBox)) {
                return false;
            }
            DialogBox dialogBox = (DialogBox) obj;
            return Intrinsics.areEqual(unknownFields(), dialogBox.unknownFields()) && Intrinsics.areEqual(this.title, dialogBox.title) && Intrinsics.areEqual(this.description, dialogBox.description) && Intrinsics.areEqual(this.button_text, dialogBox.button_text) && Intrinsics.areEqual(this.dismiss_button_text, dialogBox.dismiss_button_text) && Intrinsics.areEqual(this.client_route, dialogBox.client_route);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.description;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.button_text;
            int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            LocalizedString localizedString4 = this.dismiss_button_text;
            int hashCode5 = (hashCode4 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
            String str = this.client_route;
            int hashCode6 = hashCode5 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ActivitySection.Builder builder = new ActivitySection.Builder(1);
            builder.title = this.title;
            builder.no_activity_subtitle = this.description;
            builder.load_failure_subtitle = this.button_text;
            builder.view_all_button_title = this.dismiss_button_text;
            builder.view_all_client_route = this.client_route;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.description;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("description=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.button_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("button_text=", localizedString3, arrayList);
            }
            LocalizedString localizedString4 = this.dismiss_button_text;
            if (localizedString4 != null) {
                Matcher$$ExternalSyntheticOutline0.m("dismiss_button_text=", localizedString4, arrayList);
            }
            String str = this.client_route;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DialogBox{", "}", 0, null, null, 56);
        }
    }

    public final class Disabled extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Disabled> CREATOR;
        public final DisablePreferenceReason disable_preference_reason;
        public final Boolean is_locked;
        public final DialogBox locked_dialog_box;

        static {
            BalanceBasedAddCashPreference$Disabled$Companion$ADAPTER$1 balanceBasedAddCashPreference$Disabled$Companion$ADAPTER$1 = new BalanceBasedAddCashPreference$Disabled$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Disabled.class), "type.googleapis.com/squareup.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference.Disabled", Syntax.PROTO_2, null, "squareup/cash/balancebasedaddcash/api/v1_0/syncvalues/BalanceBasedAddCashPreference.proto");
            ADAPTER = balanceBasedAddCashPreference$Disabled$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(balanceBasedAddCashPreference$Disabled$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disabled(DisablePreferenceReason disablePreferenceReason, Boolean bool, DialogBox dialogBox, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.disable_preference_reason = disablePreferenceReason;
            this.is_locked = bool;
            this.locked_dialog_box = dialogBox;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Disabled)) {
                return false;
            }
            Disabled disabled = (Disabled) obj;
            return Intrinsics.areEqual(unknownFields(), disabled.unknownFields()) && this.disable_preference_reason == disabled.disable_preference_reason && Intrinsics.areEqual(this.is_locked, disabled.is_locked) && Intrinsics.areEqual(this.locked_dialog_box, disabled.locked_dialog_box);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            DisablePreferenceReason disablePreferenceReason = this.disable_preference_reason;
            int hashCode2 = (hashCode + (disablePreferenceReason != null ? disablePreferenceReason.hashCode() : 0)) * 37;
            Boolean bool = this.is_locked;
            int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            DialogBox dialogBox = this.locked_dialog_box;
            int hashCode4 = hashCode3 + (dialogBox != null ? dialogBox.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Section.Builder builder = new Section.Builder(13);
            builder.header_text = this.disable_preference_reason;
            builder.header_button = this.is_locked;
            builder.groups = this.locked_dialog_box;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            DisablePreferenceReason disablePreferenceReason = this.disable_preference_reason;
            if (disablePreferenceReason != null) {
                arrayList.add("disable_preference_reason=" + disablePreferenceReason);
            }
            Boolean bool = this.is_locked;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_locked=", bool, arrayList);
            }
            DialogBox dialogBox = this.locked_dialog_box;
            if (dialogBox != null) {
                arrayList.add("locked_dialog_box=" + dialogBox);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Disabled{", "}", 0, null, null, 56);
        }
    }

    public final class Enabled extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Enabled> CREATOR;
        public final Money increment_amount;
        public final Money minimum_balance_amount;

        static {
            BalanceBasedAddCashPreference$Enabled$Companion$ADAPTER$1 balanceBasedAddCashPreference$Enabled$Companion$ADAPTER$1 = new BalanceBasedAddCashPreference$Enabled$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Enabled.class), "type.googleapis.com/squareup.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference.Enabled", Syntax.PROTO_2, null, "squareup/cash/balancebasedaddcash/api/v1_0/syncvalues/BalanceBasedAddCashPreference.proto");
            ADAPTER = balanceBasedAddCashPreference$Enabled$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(balanceBasedAddCashPreference$Enabled$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Enabled(Money money, Money money2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.minimum_balance_amount = money;
            this.increment_amount = money2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Enabled)) {
                return false;
            }
            Enabled enabled = (Enabled) obj;
            return Intrinsics.areEqual(unknownFields(), enabled.unknownFields()) && Intrinsics.areEqual(this.minimum_balance_amount, enabled.minimum_balance_amount) && Intrinsics.areEqual(this.increment_amount, enabled.increment_amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.minimum_balance_amount;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.increment_amount;
            int hashCode3 = hashCode2 + (money2 != null ? money2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OverdraftUsage.Builder builder = new OverdraftUsage.Builder(2);
            builder.limit = this.minimum_balance_amount;
            builder.usage = this.increment_amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.minimum_balance_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("minimum_balance_amount=", money, arrayList);
            }
            Money money2 = this.increment_amount;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("increment_amount=", money2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Enabled{", "}", 0, null, null, 56);
        }
    }

    static {
        BalanceBasedAddCashPreference$Companion$ADAPTER$1 balanceBasedAddCashPreference$Companion$ADAPTER$1 = new BalanceBasedAddCashPreference$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BalanceBasedAddCashPreference.class), "type.googleapis.com/squareup.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference", Syntax.PROTO_2, null, "squareup/cash/balancebasedaddcash/api/v1_0/syncvalues/BalanceBasedAddCashPreference.proto");
        ADAPTER = balanceBasedAddCashPreference$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(balanceBasedAddCashPreference$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceBasedAddCashPreference(ComputedOrderSummaryKt computedOrderSummaryKt, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.preference = computedOrderSummaryKt;
        this.title = localizedString;
        this.subtitle = localizedString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BalanceBasedAddCashPreference)) {
            return false;
        }
        BalanceBasedAddCashPreference balanceBasedAddCashPreference = (BalanceBasedAddCashPreference) obj;
        return Intrinsics.areEqual(unknownFields(), balanceBasedAddCashPreference.unknownFields()) && Intrinsics.areEqual(this.preference, balanceBasedAddCashPreference.preference) && Intrinsics.areEqual(this.title, balanceBasedAddCashPreference.title) && Intrinsics.areEqual(this.subtitle, balanceBasedAddCashPreference.subtitle);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ComputedOrderSummaryKt computedOrderSummaryKt = this.preference;
        int hashCode2 = (hashCode + (computedOrderSummaryKt != null ? computedOrderSummaryKt.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode4 = hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(12);
        builder.header_text = this.preference;
        builder.header_button = this.title;
        builder.groups = this.subtitle;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ComputedOrderSummaryKt computedOrderSummaryKt = this.preference;
        if (computedOrderSummaryKt != null) {
            arrayList.add("preference=" + computedOrderSummaryKt);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BalanceBasedAddCashPreference{", "}", 0, null, null, 56);
    }
}
