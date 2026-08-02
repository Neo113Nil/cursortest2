package com.squareup.protos.cash.marketdata.model;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.money.content.MoneyTab;
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
public final class PortfolioNews extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PortfolioNews> CREATOR;
    public final List news;

    static {
        PortfolioNews$Companion$ADAPTER$1 portfolioNews$Companion$ADAPTER$1 = new PortfolioNews$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PortfolioNews.class), "type.googleapis.com/squareup.cash.marketdata.model.PortfolioNews", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/news.proto");
        ADAPTER = portfolioNews$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(portfolioNews$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioNews(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.news = TransactorKt.immutableCopyOf("news", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PortfolioNews)) {
            return false;
        }
        PortfolioNews portfolioNews = (PortfolioNews) obj;
        return Intrinsics.areEqual(unknownFields(), portfolioNews.unknownFields()) && Intrinsics.areEqual(this.news, portfolioNews.news);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.news.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        MoneyTab.Builder builder = new MoneyTab.Builder(17, false);
        builder.applets = this.news;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.news;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("news=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfolioNews{", "}", 0, null, null, 56);
    }
}
