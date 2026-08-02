package com.squareup.protos.cash.marketdata.model;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
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
public final class InvestmentEntityNews extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestmentEntityNews> CREATOR;
    public final String investment_entity_token;
    public final List news;

    static {
        InvestmentEntityNews$Companion$ADAPTER$1 investmentEntityNews$Companion$ADAPTER$1 = new InvestmentEntityNews$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestmentEntityNews.class), "type.googleapis.com/squareup.cash.marketdata.model.InvestmentEntityNews", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/news.proto");
        ADAPTER = investmentEntityNews$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(investmentEntityNews$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentEntityNews(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.investment_entity_token = str;
        this.news = TransactorKt.immutableCopyOf("news", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestmentEntityNews)) {
            return false;
        }
        InvestmentEntityNews investmentEntityNews = (InvestmentEntityNews) obj;
        return Intrinsics.areEqual(unknownFields(), investmentEntityNews.unknownFields()) && Intrinsics.areEqual(this.investment_entity_token, investmentEntityNews.investment_entity_token) && Intrinsics.areEqual(this.news, investmentEntityNews.news);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.investment_entity_token;
        int hashCode2 = this.news.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(27, false);
        builder.toggle_title = this.investment_entity_token;
        builder.sections = this.news;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        List list = this.news;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("news=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentEntityNews{", "}", 0, null, null, 56);
    }
}
