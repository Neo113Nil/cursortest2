package com.squareup.protos.cash.piggybank.appapi;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.cash.pools.PoolOwner;
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
public final class SavingsConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsConfig> CREATOR;
    public final Integer max_number_of_goals;
    public final SavingsCopy savings_copy;
    public final Boolean skip_cash_card_upsell_for_yield_onboarding;

    public final class SavingsCopy extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SavingsCopy> CREATOR;
        public final String default_savings_folder_label;
        public final String goal_complete_text;
        public final String remove_goal_text;
        public final String savings_interest_header_text;

        static {
            SavingsConfig$SavingsCopy$Companion$ADAPTER$1 savingsConfig$SavingsCopy$Companion$ADAPTER$1 = new SavingsConfig$SavingsCopy$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsCopy.class), "type.googleapis.com/squareup.cash.piggybank.appapi.SavingsConfig.SavingsCopy", Syntax.PROTO_2, null, "squareup/cash/app/get_savings_overview.proto");
            ADAPTER = savingsConfig$SavingsCopy$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsConfig$SavingsCopy$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingsCopy(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.goal_complete_text = str;
            this.remove_goal_text = str2;
            this.default_savings_folder_label = str3;
            this.savings_interest_header_text = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SavingsCopy)) {
                return false;
            }
            SavingsCopy savingsCopy = (SavingsCopy) obj;
            return Intrinsics.areEqual(unknownFields(), savingsCopy.unknownFields()) && Intrinsics.areEqual(this.goal_complete_text, savingsCopy.goal_complete_text) && Intrinsics.areEqual(this.remove_goal_text, savingsCopy.remove_goal_text) && Intrinsics.areEqual(this.default_savings_folder_label, savingsCopy.default_savings_folder_label) && Intrinsics.areEqual(this.savings_interest_header_text, savingsCopy.savings_interest_header_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.goal_complete_text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.remove_goal_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.default_savings_folder_label;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.savings_interest_header_text;
            int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolOwner.Builder builder = new PoolOwner.Builder(11);
            builder.customer_token = this.goal_complete_text;
            builder.full_name = this.remove_goal_text;
            builder.profile_photo_url = this.default_savings_folder_label;
            builder.cashtag = this.savings_interest_header_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.goal_complete_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "goal_complete_text=", arrayList);
            }
            String str2 = this.remove_goal_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "remove_goal_text=", arrayList);
            }
            String str3 = this.default_savings_folder_label;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "default_savings_folder_label=", arrayList);
            }
            String str4 = this.savings_interest_header_text;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "savings_interest_header_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsCopy{", "}", 0, null, null, 56);
        }
    }

    static {
        SavingsConfig$Companion$ADAPTER$1 savingsConfig$Companion$ADAPTER$1 = new SavingsConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsConfig.class), "type.googleapis.com/squareup.cash.piggybank.appapi.SavingsConfig", Syntax.PROTO_2, null, "squareup/cash/app/get_savings_overview.proto");
        ADAPTER = savingsConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsConfig(Integer num, SavingsCopy savingsCopy, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.max_number_of_goals = num;
        this.savings_copy = savingsCopy;
        this.skip_cash_card_upsell_for_yield_onboarding = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsConfig)) {
            return false;
        }
        SavingsConfig savingsConfig = (SavingsConfig) obj;
        return Intrinsics.areEqual(unknownFields(), savingsConfig.unknownFields()) && Intrinsics.areEqual(this.max_number_of_goals, savingsConfig.max_number_of_goals) && Intrinsics.areEqual(this.savings_copy, savingsConfig.savings_copy) && Intrinsics.areEqual(this.skip_cash_card_upsell_for_yield_onboarding, savingsConfig.skip_cash_card_upsell_for_yield_onboarding);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.max_number_of_goals;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        SavingsCopy savingsCopy = this.savings_copy;
        int hashCode3 = (hashCode2 + (savingsCopy != null ? savingsCopy.hashCode() : 0)) * 37;
        Boolean bool = this.skip_cash_card_upsell_for_yield_onboarding;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(27, false);
        builder.transmission_level = this.max_number_of_goals;
        builder.advertisement_data = this.savings_copy;
        builder.frequency = this.skip_cash_card_upsell_for_yield_onboarding;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.max_number_of_goals;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("max_number_of_goals=", num, arrayList);
        }
        SavingsCopy savingsCopy = this.savings_copy;
        if (savingsCopy != null) {
            arrayList.add("savings_copy=" + savingsCopy);
        }
        Boolean bool = this.skip_cash_card_upsell_for_yield_onboarding;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("skip_cash_card_upsell_for_yield_onboarding=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsConfig{", "}", 0, null, null, 56);
    }
}
