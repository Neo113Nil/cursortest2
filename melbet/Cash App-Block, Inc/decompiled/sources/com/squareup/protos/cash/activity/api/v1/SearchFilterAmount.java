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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterAmount;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterAmount$Builder;", "", "amount_gte_in_base_unit", "Ljava/lang/Long;", "amount_lte_in_base_unit", "Lcom/squareup/protos/common/CurrencyCode;", "currency", "Lcom/squareup/protos/common/CurrencyCode;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchFilterAmount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchFilterAmount> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
    public final Long amount_gte_in_base_unit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
    public final Long amount_lte_in_base_unit;

    @WireField(adapter = "com.squareup.protos.common.CurrencyCode#ADAPTER", schemaIndex = 2, tag = 3)
    public final CurrencyCode currency;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterAmount$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterAmount;", "<init>", "()V", "amount_gte_in_base_unit", "", "Ljava/lang/Long;", "amount_lte_in_base_unit", "currency", "Lcom/squareup/protos/common/CurrencyCode;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/activity/api/v1/SearchFilterAmount$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Long amount_gte_in_base_unit;
        public Long amount_lte_in_base_unit;
        public CurrencyCode currency;

        public final Builder amount_gte_in_base_unit(Long amount_gte_in_base_unit) {
            this.amount_gte_in_base_unit = amount_gte_in_base_unit;
            return this;
        }

        public final Builder amount_lte_in_base_unit(Long amount_lte_in_base_unit) {
            this.amount_lte_in_base_unit = amount_lte_in_base_unit;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SearchFilterAmount build() {
            return new SearchFilterAmount(this.amount_gte_in_base_unit, this.amount_lte_in_base_unit, this.currency, buildUnknownFields());
        }

        public final Builder currency(CurrencyCode currency) {
            this.currency = currency;
            return this;
        }
    }

    static {
        SearchFilterAmount$Companion$ADAPTER$1 searchFilterAmount$Companion$ADAPTER$1 = new SearchFilterAmount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchFilterAmount.class), "type.googleapis.com/squareup.cash.activity.api.v1.SearchFilterAmount", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = searchFilterAmount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchFilterAmount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFilterAmount(Long l, Long l2, CurrencyCode currencyCode, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount_gte_in_base_unit = l;
        this.amount_lte_in_base_unit = l2;
        this.currency = currencyCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchFilterAmount)) {
            return false;
        }
        SearchFilterAmount searchFilterAmount = (SearchFilterAmount) obj;
        return Intrinsics.areEqual(unknownFields(), searchFilterAmount.unknownFields()) && Intrinsics.areEqual(this.amount_gte_in_base_unit, searchFilterAmount.amount_gte_in_base_unit) && Intrinsics.areEqual(this.amount_lte_in_base_unit, searchFilterAmount.amount_lte_in_base_unit) && this.currency == searchFilterAmount.currency;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.amount_gte_in_base_unit;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.amount_lte_in_base_unit;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        CurrencyCode currencyCode = this.currency;
        int hashCode4 = hashCode3 + (currencyCode != null ? currencyCode.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.amount_gte_in_base_unit = this.amount_gte_in_base_unit;
        builder.amount_lte_in_base_unit = this.amount_lte_in_base_unit;
        builder.currency = this.currency;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.amount_gte_in_base_unit;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("amount_gte_in_base_unit=", l, arrayList);
        }
        Long l2 = this.amount_lte_in_base_unit;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("amount_lte_in_base_unit=", l2, arrayList);
        }
        CurrencyCode currencyCode = this.currency;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("currency=", currencyCode, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchFilterAmount{", "}", 0, null, null, 56);
    }
}
