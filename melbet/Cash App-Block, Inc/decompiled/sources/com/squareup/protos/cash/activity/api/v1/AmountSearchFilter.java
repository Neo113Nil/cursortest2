package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/AmountSearchFilter;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/AmountSearchFilter$Builder;", "", "amount", "Ljava/lang/Long;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterComparison;", "comparison", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterComparison;", "Lcom/squareup/protos/common/CurrencyCode;", "currency", "Lcom/squareup/protos/common/CurrencyCode;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AmountSearchFilter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AmountSearchFilter> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
    public final Long amount;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchFilterComparison#ADAPTER", schemaIndex = 1, tag = 2)
    public final SearchFilterComparison comparison;

    @WireField(adapter = "com.squareup.protos.common.CurrencyCode#ADAPTER", schemaIndex = 2, tag = 3)
    public final CurrencyCode currency;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/AmountSearchFilter$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/AmountSearchFilter;", "<init>", "()V", "amount", "", "Ljava/lang/Long;", "comparison", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterComparison;", "currency", "Lcom/squareup/protos/common/CurrencyCode;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/activity/api/v1/AmountSearchFilter$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Long amount;
        public SearchFilterComparison comparison;
        public CurrencyCode currency;

        public final Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public AmountSearchFilter build() {
            return new AmountSearchFilter(this.amount, this.comparison, this.currency, buildUnknownFields());
        }

        public final Builder comparison(SearchFilterComparison comparison) {
            this.comparison = comparison;
            return this;
        }

        public final Builder currency(CurrencyCode currency) {
            this.currency = currency;
            return this;
        }
    }

    static {
        AmountSearchFilter$Companion$ADAPTER$1 amountSearchFilter$Companion$ADAPTER$1 = new AmountSearchFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AmountSearchFilter.class), "type.googleapis.com/squareup.cash.activity.api.v1.AmountSearchFilter", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = amountSearchFilter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(amountSearchFilter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountSearchFilter(Long l, SearchFilterComparison searchFilterComparison, CurrencyCode currencyCode, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = l;
        this.comparison = searchFilterComparison;
        this.currency = currencyCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AmountSearchFilter)) {
            return false;
        }
        AmountSearchFilter amountSearchFilter = (AmountSearchFilter) obj;
        return Intrinsics.areEqual(unknownFields(), amountSearchFilter.unknownFields()) && Intrinsics.areEqual(this.amount, amountSearchFilter.amount) && this.comparison == amountSearchFilter.comparison && this.currency == amountSearchFilter.currency;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.amount;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        SearchFilterComparison searchFilterComparison = this.comparison;
        int hashCode3 = (hashCode2 + (searchFilterComparison != null ? searchFilterComparison.hashCode() : 0)) * 37;
        CurrencyCode currencyCode = this.currency;
        int hashCode4 = hashCode3 + (currencyCode != null ? currencyCode.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.amount = this.amount;
        builder.comparison = this.comparison;
        builder.currency = this.currency;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.amount;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("amount=", l, arrayList);
        }
        SearchFilterComparison searchFilterComparison = this.comparison;
        if (searchFilterComparison != null) {
            arrayList.add("comparison=" + searchFilterComparison);
        }
        CurrencyCode currencyCode = this.currency;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("currency=", currencyCode, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AmountSearchFilter{", "}", 0, null, null, 56);
    }
}
