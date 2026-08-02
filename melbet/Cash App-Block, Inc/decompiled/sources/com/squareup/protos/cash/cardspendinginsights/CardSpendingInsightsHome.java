package com.squareup.protos.cash.cardspendinginsights;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.protos.cash.appthemes.Gradient;
import com.squareup.protos.cash.cashapproxy.api.Divider;
import com.squareup.protos.cash.cashface.api.Activity;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile;
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
public final class CardSpendingInsightsHome extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardSpendingInsightsHome> CREATOR;
    public final ActivitySection activity_section;
    public final EntryPoint entry_point;
    public final InsightsSection insights_section;
    public final OverviewSection overview_section;

    public final class ActivitySection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ActivitySection> CREATOR;

        static {
            CardSpendingInsightsHome$ActivitySection$Companion$ADAPTER$1 cardSpendingInsightsHome$ActivitySection$Companion$ADAPTER$1 = new CardSpendingInsightsHome$ActivitySection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivitySection.class), "type.googleapis.com/squareup.cash.cardspendinginsights.CardSpendingInsightsHome.ActivitySection", Syntax.PROTO_2, null, "squareup/cash/cardspendinginsights/home.proto");
            ADAPTER = cardSpendingInsightsHome$ActivitySection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSpendingInsightsHome$ActivitySection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivitySection(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof ActivitySection) && Intrinsics.areEqual(unknownFields(), ((ActivitySection) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Divider.Builder builder = new Divider.Builder(23);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "ActivitySection{}";
        }
    }

    public final class EntryPoint extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EntryPoint> CREATOR;
        public final String client_route;
        public final LocalizedString preview_text;
        public final Boolean visible;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public String client_route;
            public LocalizedString preview_text;
            public Boolean visible;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        String str = this.client_route;
                        return new EntryPoint(this.preview_text, this.visible, str, buildUnknownFields());
                    case 1:
                        return new CardModule.CardElementAction.OpenDialog.OpenDialogButton(this.preview_text, this.visible, this.client_route, buildUnknownFields());
                    default:
                        return new BorrowAppletPaymentTimelineTile.Data.Button(this.preview_text, this.visible, this.client_route, buildUnknownFields());
                }
            }
        }

        static {
            CardSpendingInsightsHome$EntryPoint$Companion$ADAPTER$1 cardSpendingInsightsHome$EntryPoint$Companion$ADAPTER$1 = new CardSpendingInsightsHome$EntryPoint$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EntryPoint.class), "type.googleapis.com/squareup.cash.cardspendinginsights.CardSpendingInsightsHome.EntryPoint", Syntax.PROTO_2, null, "squareup/cash/cardspendinginsights/home.proto");
            ADAPTER = cardSpendingInsightsHome$EntryPoint$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSpendingInsightsHome$EntryPoint$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntryPoint(LocalizedString localizedString, Boolean bool, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.client_route = str;
            this.visible = bool;
            this.preview_text = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EntryPoint)) {
                return false;
            }
            EntryPoint entryPoint = (EntryPoint) obj;
            return Intrinsics.areEqual(unknownFields(), entryPoint.unknownFields()) && Intrinsics.areEqual(this.client_route, entryPoint.client_route) && Intrinsics.areEqual(this.visible, entryPoint.visible) && Intrinsics.areEqual(this.preview_text, entryPoint.preview_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.client_route;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Boolean bool = this.visible;
            int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            LocalizedString localizedString = this.preview_text;
            int hashCode4 = hashCode3 + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.client_route = this.client_route;
            builder.visible = this.visible;
            builder.preview_text = this.preview_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.client_route;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
            }
            Boolean bool = this.visible;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("visible=", bool, arrayList);
            }
            LocalizedString localizedString = this.preview_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("preview_text=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EntryPoint{", "}", 0, null, null, 56);
        }
    }

    public final class InsightsSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InsightsSection> CREATOR;
        public final List spending_insight_rows;

        static {
            CardSpendingInsightsHome$InsightsSection$Companion$ADAPTER$1 cardSpendingInsightsHome$InsightsSection$Companion$ADAPTER$1 = new CardSpendingInsightsHome$InsightsSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InsightsSection.class), "type.googleapis.com/squareup.cash.cardspendinginsights.CardSpendingInsightsHome.InsightsSection", Syntax.PROTO_2, null, "squareup/cash/cardspendinginsights/home.proto");
            ADAPTER = cardSpendingInsightsHome$InsightsSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSpendingInsightsHome$InsightsSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InsightsSection(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.spending_insight_rows = TransactorKt.immutableCopyOf("spending_insight_rows", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InsightsSection)) {
                return false;
            }
            InsightsSection insightsSection = (InsightsSection) obj;
            return Intrinsics.areEqual(unknownFields(), insightsSection.unknownFields()) && Intrinsics.areEqual(this.spending_insight_rows, insightsSection.spending_insight_rows);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.spending_insight_rows.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Gradient.Builder builder = new Gradient.Builder(29, false);
            builder.colors = this.spending_insight_rows;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.spending_insight_rows;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("spending_insight_rows=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InsightsSection{", "}", 0, null, null, 56);
        }
    }

    public final class OverviewSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OverviewSection> CREATOR;
        public final VerticalStackedBarGraph vertical_stacked_bar_graph;

        static {
            CardSpendingInsightsHome$OverviewSection$Companion$ADAPTER$1 cardSpendingInsightsHome$OverviewSection$Companion$ADAPTER$1 = new CardSpendingInsightsHome$OverviewSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OverviewSection.class), "type.googleapis.com/squareup.cash.cardspendinginsights.CardSpendingInsightsHome.OverviewSection", Syntax.PROTO_2, null, "squareup/cash/cardspendinginsights/home.proto");
            ADAPTER = cardSpendingInsightsHome$OverviewSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSpendingInsightsHome$OverviewSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OverviewSection(VerticalStackedBarGraph verticalStackedBarGraph, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.vertical_stacked_bar_graph = verticalStackedBarGraph;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OverviewSection)) {
                return false;
            }
            OverviewSection overviewSection = (OverviewSection) obj;
            return Intrinsics.areEqual(unknownFields(), overviewSection.unknownFields()) && Intrinsics.areEqual(this.vertical_stacked_bar_graph, overviewSection.vertical_stacked_bar_graph);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            VerticalStackedBarGraph verticalStackedBarGraph = this.vertical_stacked_bar_graph;
            int hashCode2 = hashCode + (verticalStackedBarGraph != null ? verticalStackedBarGraph.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Activity.Builder builder = new Activity.Builder(1);
            builder.activity = this.vertical_stacked_bar_graph;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            VerticalStackedBarGraph verticalStackedBarGraph = this.vertical_stacked_bar_graph;
            if (verticalStackedBarGraph != null) {
                arrayList.add("vertical_stacked_bar_graph=" + verticalStackedBarGraph);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OverviewSection{", "}", 0, null, null, 56);
        }
    }

    static {
        CardSpendingInsightsHome$Companion$ADAPTER$1 cardSpendingInsightsHome$Companion$ADAPTER$1 = new CardSpendingInsightsHome$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardSpendingInsightsHome.class), "type.googleapis.com/squareup.cash.cardspendinginsights.CardSpendingInsightsHome", Syntax.PROTO_2, null, "squareup/cash/cardspendinginsights/home.proto");
        ADAPTER = cardSpendingInsightsHome$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSpendingInsightsHome$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSpendingInsightsHome(EntryPoint entryPoint, OverviewSection overviewSection, InsightsSection insightsSection, ActivitySection activitySection, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entry_point = entryPoint;
        this.overview_section = overviewSection;
        this.insights_section = insightsSection;
        this.activity_section = activitySection;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardSpendingInsightsHome)) {
            return false;
        }
        CardSpendingInsightsHome cardSpendingInsightsHome = (CardSpendingInsightsHome) obj;
        return Intrinsics.areEqual(unknownFields(), cardSpendingInsightsHome.unknownFields()) && Intrinsics.areEqual(this.entry_point, cardSpendingInsightsHome.entry_point) && Intrinsics.areEqual(this.overview_section, cardSpendingInsightsHome.overview_section) && Intrinsics.areEqual(this.insights_section, cardSpendingInsightsHome.insights_section) && Intrinsics.areEqual(this.activity_section, cardSpendingInsightsHome.activity_section);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EntryPoint entryPoint = this.entry_point;
        int hashCode2 = (hashCode + (entryPoint != null ? entryPoint.hashCode() : 0)) * 37;
        OverviewSection overviewSection = this.overview_section;
        int hashCode3 = (hashCode2 + (overviewSection != null ? overviewSection.hashCode() : 0)) * 37;
        InsightsSection insightsSection = this.insights_section;
        int hashCode4 = (hashCode3 + (insightsSection != null ? insightsSection.hashCode() : 0)) * 37;
        ActivitySection activitySection = this.activity_section;
        int hashCode5 = hashCode4 + (activitySection != null ? activitySection.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(29);
        builder.collection = this.entry_point;
        builder.template = this.overview_section;
        builder.item_variable = this.insights_section;
        builder.source = this.activity_section;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EntryPoint entryPoint = this.entry_point;
        if (entryPoint != null) {
            arrayList.add("entry_point=" + entryPoint);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardSpendingInsightsHome{", "}", 0, null, null, 56);
    }
}
