package com.squareup.protos.cash.marketdata.model;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.invest.ui.Section;
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
public final class InvestmentAnalystOpinions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestmentAnalystOpinions> CREATOR;
    public final Integer analyst_count;
    public final List graph_labels;
    public final Section.Row.MoreInfo more_info;
    public final String recommendation_label;
    public final Integer score;

    static {
        InvestmentAnalystOpinions$Companion$ADAPTER$1 investmentAnalystOpinions$Companion$ADAPTER$1 = new InvestmentAnalystOpinions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestmentAnalystOpinions.class), "type.googleapis.com/squareup.cash.marketdata.model.InvestmentAnalystOpinions", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/investment_metrics.proto");
        ADAPTER = investmentAnalystOpinions$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(investmentAnalystOpinions$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentAnalystOpinions(String str, Integer num, List list, Integer num2, Section.Row.MoreInfo moreInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.recommendation_label = str;
        this.score = num;
        this.analyst_count = num2;
        this.more_info = moreInfo;
        this.graph_labels = TransactorKt.immutableCopyOf("graph_labels", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestmentAnalystOpinions)) {
            return false;
        }
        InvestmentAnalystOpinions investmentAnalystOpinions = (InvestmentAnalystOpinions) obj;
        return Intrinsics.areEqual(unknownFields(), investmentAnalystOpinions.unknownFields()) && Intrinsics.areEqual(this.recommendation_label, investmentAnalystOpinions.recommendation_label) && Intrinsics.areEqual(this.score, investmentAnalystOpinions.score) && Intrinsics.areEqual(this.graph_labels, investmentAnalystOpinions.graph_labels) && Intrinsics.areEqual(this.analyst_count, investmentAnalystOpinions.analyst_count) && Intrinsics.areEqual(this.more_info, investmentAnalystOpinions.more_info);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.recommendation_label;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.score;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37, 37, this.graph_labels);
        Integer num2 = this.analyst_count;
        int hashCode3 = (m + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Section.Row.MoreInfo moreInfo = this.more_info;
        int hashCode4 = hashCode3 + (moreInfo != null ? moreInfo.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(16);
        builder.icon = this.recommendation_label;
        builder.title = this.score;
        builder.subtitle = this.graph_labels;
        builder.action = this.analyst_count;
        builder.icon_background_color = this.more_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.recommendation_label;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "recommendation_label=", arrayList);
        }
        Integer num = this.score;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("score=", num, arrayList);
        }
        List list = this.graph_labels;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("graph_labels=", arrayList, list);
        }
        Integer num2 = this.analyst_count;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("analyst_count=", num2, arrayList);
        }
        Section.Row.MoreInfo moreInfo = this.more_info;
        if (moreInfo != null) {
            arrayList.add("more_info=" + moreInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentAnalystOpinions{", "}", 0, null, null, 56);
    }
}
