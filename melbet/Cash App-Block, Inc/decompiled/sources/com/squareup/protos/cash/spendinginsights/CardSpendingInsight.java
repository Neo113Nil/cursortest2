package com.squareup.protos.cash.spendinginsights;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.cash.ui.graphs.HorizontalBarGraph;
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

/* loaded from: classes8.dex */
public final class CardSpendingInsight extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardSpendingInsight> CREATOR;
    public final ColoredButton button;
    public final CardSpendingInsightType card_spending_insight_type;
    public final List colored_title;
    public final HorizontalBarGraph horizontal_bar_graph;
    public final List spending_analysis_category;
    public final LocalizedString subtitle;
    public final TextSize title_text_size;

    static {
        CardSpendingInsight$Companion$ADAPTER$1 cardSpendingInsight$Companion$ADAPTER$1 = new CardSpendingInsight$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardSpendingInsight.class), "type.googleapis.com/squareup.cash.spendinginsights.CardSpendingInsight", Syntax.PROTO_2, null, "squareup/cash/spendinginsights/card_spending_insight.proto");
        ADAPTER = cardSpendingInsight$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSpendingInsight$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSpendingInsight(CardSpendingInsightType cardSpendingInsightType, List list, HorizontalBarGraph horizontalBarGraph, ColoredButton coloredButton, TextSize textSize, LocalizedString localizedString, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.card_spending_insight_type = cardSpendingInsightType;
        this.horizontal_bar_graph = horizontalBarGraph;
        this.button = coloredButton;
        this.title_text_size = textSize;
        this.subtitle = localizedString;
        this.colored_title = TransactorKt.immutableCopyOf("colored_title", list);
        this.spending_analysis_category = TransactorKt.immutableCopyOf("spending_analysis_category", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardSpendingInsight)) {
            return false;
        }
        CardSpendingInsight cardSpendingInsight = (CardSpendingInsight) obj;
        return Intrinsics.areEqual(unknownFields(), cardSpendingInsight.unknownFields()) && this.card_spending_insight_type == cardSpendingInsight.card_spending_insight_type && Intrinsics.areEqual(this.colored_title, cardSpendingInsight.colored_title) && Intrinsics.areEqual(this.horizontal_bar_graph, cardSpendingInsight.horizontal_bar_graph) && Intrinsics.areEqual(this.button, cardSpendingInsight.button) && this.title_text_size == cardSpendingInsight.title_text_size && Intrinsics.areEqual(this.subtitle, cardSpendingInsight.subtitle) && Intrinsics.areEqual(this.spending_analysis_category, cardSpendingInsight.spending_analysis_category);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CardSpendingInsightType cardSpendingInsightType = this.card_spending_insight_type;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (cardSpendingInsightType != null ? cardSpendingInsightType.hashCode() : 0)) * 37, 37, this.colored_title);
        HorizontalBarGraph horizontalBarGraph = this.horizontal_bar_graph;
        int hashCode2 = (m + (horizontalBarGraph != null ? horizontalBarGraph.hashCode() : 0)) * 37;
        ColoredButton coloredButton = this.button;
        int hashCode3 = (hashCode2 + (coloredButton != null ? coloredButton.hashCode() : 0)) * 37;
        TextSize textSize = this.title_text_size;
        int hashCode4 = (hashCode3 + (textSize != null ? textSize.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.subtitle;
        int hashCode5 = this.spending_analysis_category.hashCode() + ((hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(25);
        builder.customer_identifier = this.card_spending_insight_type;
        builder.full_name = this.colored_title;
        builder.profile_photo_url = this.horizontal_bar_graph;
        builder.cashtag = this.button;
        builder.added_at = this.title_text_size;
        builder.participant_type = this.subtitle;
        builder.aggregated_contribution_amount = this.spending_analysis_category;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CardSpendingInsightType cardSpendingInsightType = this.card_spending_insight_type;
        if (cardSpendingInsightType != null) {
            arrayList.add("card_spending_insight_type=" + cardSpendingInsightType);
        }
        List list = this.colored_title;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("colored_title=", arrayList, list);
        }
        HorizontalBarGraph horizontalBarGraph = this.horizontal_bar_graph;
        if (horizontalBarGraph != null) {
            arrayList.add("horizontal_bar_graph=" + horizontalBarGraph);
        }
        ColoredButton coloredButton = this.button;
        if (coloredButton != null) {
            arrayList.add("button=" + coloredButton);
        }
        TextSize textSize = this.title_text_size;
        if (textSize != null) {
            arrayList.add("title_text_size=" + textSize);
        }
        LocalizedString localizedString = this.subtitle;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString, arrayList);
        }
        List list2 = this.spending_analysis_category;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("spending_analysis_category=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardSpendingInsight{", "}", 0, null, null, 56);
    }
}
