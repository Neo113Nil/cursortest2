package com.squareup.protos.cash.cardspendinginsights;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.protos.cash.cashapproxy.api.Divider;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.cash.localization.LocalizedString;
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

/* loaded from: classes7.dex */
public final class CardSpendingInsightsConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardSpendingInsightsConfig> CREATOR;
    public final ActivitySection activity_section;
    public final InsightsSection insights_section;
    public final OverviewSection overview_section;
    public final LocalizedString preview_title;
    public final LocalizedString recurring_payment_info_description;
    public final LocalizedString recurring_payment_info_title;
    public final LocalizedString title;

    public final class ActivitySection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ActivitySection> CREATOR;
        public final List exclude_product_classifiers;
        public final List include_product_classifiers;
        public final Integer page_size;
        public final LocalizedString title;

        static {
            CardSpendingInsightsConfig$ActivitySection$Companion$ADAPTER$1 cardSpendingInsightsConfig$ActivitySection$Companion$ADAPTER$1 = new CardSpendingInsightsConfig$ActivitySection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivitySection.class), "type.googleapis.com/squareup.cash.cardspendinginsights.CardSpendingInsightsConfig.ActivitySection", Syntax.PROTO_2, null, "squareup/cash/cardspendinginsights/config.proto");
            ADAPTER = cardSpendingInsightsConfig$ActivitySection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSpendingInsightsConfig$ActivitySection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivitySection(LocalizedString localizedString, List list, List list2, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.title = localizedString;
            this.page_size = num;
            this.include_product_classifiers = TransactorKt.immutableCopyOf("include_product_classifiers", list);
            this.exclude_product_classifiers = TransactorKt.immutableCopyOf("exclude_product_classifiers", list2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivitySection)) {
                return false;
            }
            ActivitySection activitySection = (ActivitySection) obj;
            return Intrinsics.areEqual(unknownFields(), activitySection.unknownFields()) && Intrinsics.areEqual(this.title, activitySection.title) && Intrinsics.areEqual(this.include_product_classifiers, activitySection.include_product_classifiers) && Intrinsics.areEqual(this.exclude_product_classifiers, activitySection.exclude_product_classifiers) && Intrinsics.areEqual(this.page_size, activitySection.page_size);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.include_product_classifiers), 37, this.exclude_product_classifiers);
            Integer num = this.page_size;
            int hashCode2 = m + (num != null ? Integer.hashCode(num.intValue()) : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ForEach.Builder builder = new ForEach.Builder(28);
            builder.collection = this.title;
            builder.template = this.include_product_classifiers;
            builder.item_variable = this.exclude_product_classifiers;
            builder.source = this.page_size;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            List list = this.include_product_classifiers;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("include_product_classifiers=", arrayList, list);
            }
            List list2 = this.exclude_product_classifiers;
            if (!list2.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("exclude_product_classifiers=", arrayList, list2);
            }
            Integer num = this.page_size;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("page_size=", num, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySection{", "}", 0, null, null, 56);
        }
    }

    public final class InsightsSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InsightsSection> CREATOR;

        static {
            CardSpendingInsightsConfig$InsightsSection$Companion$ADAPTER$1 cardSpendingInsightsConfig$InsightsSection$Companion$ADAPTER$1 = new CardSpendingInsightsConfig$InsightsSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InsightsSection.class), "type.googleapis.com/squareup.cash.cardspendinginsights.CardSpendingInsightsConfig.InsightsSection", Syntax.PROTO_2, null, "squareup/cash/cardspendinginsights/config.proto");
            ADAPTER = cardSpendingInsightsConfig$InsightsSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSpendingInsightsConfig$InsightsSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InsightsSection(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof InsightsSection) && Intrinsics.areEqual(unknownFields(), ((InsightsSection) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Divider.Builder builder = new Divider.Builder(21);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "InsightsSection{}";
        }
    }

    public final class OverviewSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OverviewSection> CREATOR;

        static {
            CardSpendingInsightsConfig$OverviewSection$Companion$ADAPTER$1 cardSpendingInsightsConfig$OverviewSection$Companion$ADAPTER$1 = new CardSpendingInsightsConfig$OverviewSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OverviewSection.class), "type.googleapis.com/squareup.cash.cardspendinginsights.CardSpendingInsightsConfig.OverviewSection", Syntax.PROTO_2, null, "squareup/cash/cardspendinginsights/config.proto");
            ADAPTER = cardSpendingInsightsConfig$OverviewSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSpendingInsightsConfig$OverviewSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OverviewSection(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof OverviewSection) && Intrinsics.areEqual(unknownFields(), ((OverviewSection) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Divider.Builder builder = new Divider.Builder(22);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "OverviewSection{}";
        }
    }

    static {
        CardSpendingInsightsConfig$Companion$ADAPTER$1 cardSpendingInsightsConfig$Companion$ADAPTER$1 = new CardSpendingInsightsConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardSpendingInsightsConfig.class), "type.googleapis.com/squareup.cash.cardspendinginsights.CardSpendingInsightsConfig", Syntax.PROTO_2, null, "squareup/cash/cardspendinginsights/config.proto");
        ADAPTER = cardSpendingInsightsConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSpendingInsightsConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSpendingInsightsConfig(LocalizedString localizedString, LocalizedString localizedString2, OverviewSection overviewSection, InsightsSection insightsSection, ActivitySection activitySection, LocalizedString localizedString3, LocalizedString localizedString4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.preview_title = localizedString2;
        this.overview_section = overviewSection;
        this.insights_section = insightsSection;
        this.activity_section = activitySection;
        this.recurring_payment_info_title = localizedString3;
        this.recurring_payment_info_description = localizedString4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardSpendingInsightsConfig)) {
            return false;
        }
        CardSpendingInsightsConfig cardSpendingInsightsConfig = (CardSpendingInsightsConfig) obj;
        return Intrinsics.areEqual(unknownFields(), cardSpendingInsightsConfig.unknownFields()) && Intrinsics.areEqual(this.title, cardSpendingInsightsConfig.title) && Intrinsics.areEqual(this.preview_title, cardSpendingInsightsConfig.preview_title) && Intrinsics.areEqual(this.overview_section, cardSpendingInsightsConfig.overview_section) && Intrinsics.areEqual(this.insights_section, cardSpendingInsightsConfig.insights_section) && Intrinsics.areEqual(this.activity_section, cardSpendingInsightsConfig.activity_section) && Intrinsics.areEqual(this.recurring_payment_info_title, cardSpendingInsightsConfig.recurring_payment_info_title) && Intrinsics.areEqual(this.recurring_payment_info_description, cardSpendingInsightsConfig.recurring_payment_info_description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.preview_title;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        OverviewSection overviewSection = this.overview_section;
        int hashCode4 = (hashCode3 + (overviewSection != null ? overviewSection.hashCode() : 0)) * 37;
        InsightsSection insightsSection = this.insights_section;
        int hashCode5 = (hashCode4 + (insightsSection != null ? insightsSection.hashCode() : 0)) * 37;
        ActivitySection activitySection = this.activity_section;
        int hashCode6 = (hashCode5 + (activitySection != null ? activitySection.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.recurring_payment_info_title;
        int hashCode7 = (hashCode6 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        LocalizedString localizedString4 = this.recurring_payment_info_description;
        int hashCode8 = hashCode7 + (localizedString4 != null ? localizedString4.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(8, false);
        builder.customer_token = this.title;
        builder.alias_value = this.preview_title;
        builder.hashed_alias_token = this.overview_section;
        builder.alias_type = this.insights_section;
        builder.updated_at = this.activity_section;
        builder.linked_at = this.recurring_payment_info_title;
        builder.version = this.recurring_payment_info_description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.preview_title;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("preview_title=", localizedString2, arrayList);
        }
        OverviewSection overviewSection = this.overview_section;
        if (overviewSection != null) {
            arrayList.add("overview_section=" + overviewSection);
        }
        InsightsSection insightsSection = this.insights_section;
        if (insightsSection != null) {
            arrayList.add("insights_section=" + insightsSection);
        }
        ActivitySection activitySection = this.activity_section;
        if (activitySection != null) {
            arrayList.add("activity_section=" + activitySection);
        }
        LocalizedString localizedString3 = this.recurring_payment_info_title;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("recurring_payment_info_title=", localizedString3, arrayList);
        }
        LocalizedString localizedString4 = this.recurring_payment_info_description;
        if (localizedString4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("recurring_payment_info_description=", localizedString4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardSpendingInsightsConfig{", "}", 0, null, null, 56);
    }
}
