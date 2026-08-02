package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilter;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter;", "search_filter", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter;", "Companion", "Builder", "SearchFilter", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchFilter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchFilter> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final AbstractC0069SearchFilter search_filter;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter;", "<init>", "()V", "search_filter", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public AbstractC0069SearchFilter search_filter;

        @Override // com.squareup.wire.Message.Builder
        public SearchFilter build() {
            return new SearchFilter(this.search_filter, buildUnknownFields());
        }

        public final Builder search_filter(AbstractC0069SearchFilter search_filter) {
            this.search_filter = search_filter;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter;", "", "Counterparty", "Amount", "Date", "Type", "RatePlan", "PaymentState", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter$Amount;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter$Counterparty;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter$Date;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter$PaymentState;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter$RatePlan;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter$Type;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.squareup.protos.cash.activity.api.v1.SearchFilter$SearchFilter, reason: collision with other inner class name */
    public static abstract class AbstractC0069SearchFilter {

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchFilterAmount#ADAPTER", declaredName = "amount", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter$Amount;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterAmount;", "value", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterAmount;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/SearchFilterAmount;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.squareup.protos.cash.activity.api.v1.SearchFilter$SearchFilter$Amount */
        public static final /* data */ class Amount extends AbstractC0069SearchFilter {
            private final SearchFilterAmount value;

            public Amount(SearchFilterAmount searchFilterAmount) {
                searchFilterAmount.getClass();
                this.value = searchFilterAmount;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Amount) && Intrinsics.areEqual(this.value, ((Amount) obj).value);
            }

            public final SearchFilterAmount getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Amount(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchFilterCounterparty#ADAPTER", declaredName = "counterparty", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter$Counterparty;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty;", "value", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.squareup.protos.cash.activity.api.v1.SearchFilter$SearchFilter$Counterparty */
        public static final /* data */ class Counterparty extends AbstractC0069SearchFilter {
            private final SearchFilterCounterparty value;

            public Counterparty(SearchFilterCounterparty searchFilterCounterparty) {
                searchFilterCounterparty.getClass();
                this.value = searchFilterCounterparty;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Counterparty) && Intrinsics.areEqual(this.value, ((Counterparty) obj).value);
            }

            public final SearchFilterCounterparty getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Counterparty(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchFilterDate#ADAPTER", declaredName = InquiryField.DateField.TYPE, tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter$Date;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterDate;", "value", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterDate;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/SearchFilterDate;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.squareup.protos.cash.activity.api.v1.SearchFilter$SearchFilter$Date */
        public static final /* data */ class Date extends AbstractC0069SearchFilter {
            private final SearchFilterDate value;

            public Date(SearchFilterDate searchFilterDate) {
                searchFilterDate.getClass();
                this.value = searchFilterDate;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Date) && Intrinsics.areEqual(this.value, ((Date) obj).value);
            }

            public final SearchFilterDate getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Date(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchFilterPaymentState#ADAPTER", declaredName = "payment_state", tag = 6)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter$PaymentState;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterPaymentState;", "value", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterPaymentState;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/SearchFilterPaymentState;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.squareup.protos.cash.activity.api.v1.SearchFilter$SearchFilter$PaymentState */
        public static final /* data */ class PaymentState extends AbstractC0069SearchFilter {
            private final SearchFilterPaymentState value;

            public PaymentState(SearchFilterPaymentState searchFilterPaymentState) {
                searchFilterPaymentState.getClass();
                this.value = searchFilterPaymentState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaymentState) && Intrinsics.areEqual(this.value, ((PaymentState) obj).value);
            }

            public final SearchFilterPaymentState getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PaymentState(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchFilterRatePlan#ADAPTER", declaredName = "rate_plan", tag = 5)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter$RatePlan;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterRatePlan;", "value", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterRatePlan;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/SearchFilterRatePlan;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.squareup.protos.cash.activity.api.v1.SearchFilter$SearchFilter$RatePlan */
        public static final /* data */ class RatePlan extends AbstractC0069SearchFilter {
            private final SearchFilterRatePlan value;

            public RatePlan(SearchFilterRatePlan searchFilterRatePlan) {
                searchFilterRatePlan.getClass();
                this.value = searchFilterRatePlan;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RatePlan) && Intrinsics.areEqual(this.value, ((RatePlan) obj).value);
            }

            public final SearchFilterRatePlan getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "RatePlan(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchFilterType#ADAPTER", declaredName = "type", tag = 4)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter$Type;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterType;", "value", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterType;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/SearchFilterType;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.squareup.protos.cash.activity.api.v1.SearchFilter$SearchFilter$Type */
        public static final /* data */ class Type extends AbstractC0069SearchFilter {
            private final SearchFilterType value;

            public Type(SearchFilterType searchFilterType) {
                searchFilterType.getClass();
                this.value = searchFilterType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Type) && Intrinsics.areEqual(this.value, ((Type) obj).value);
            }

            public final SearchFilterType getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Type(value=" + this.value + ")";
            }
        }
    }

    static {
        SearchFilter$Companion$ADAPTER$1 searchFilter$Companion$ADAPTER$1 = new SearchFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchFilter.class), "type.googleapis.com/squareup.cash.activity.api.v1.SearchFilter", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = searchFilter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchFilter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFilter(AbstractC0069SearchFilter abstractC0069SearchFilter, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.search_filter = abstractC0069SearchFilter;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchFilter)) {
            return false;
        }
        SearchFilter searchFilter = (SearchFilter) obj;
        return Intrinsics.areEqual(unknownFields(), searchFilter.unknownFields()) && Intrinsics.areEqual(this.search_filter, searchFilter.search_filter);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AbstractC0069SearchFilter abstractC0069SearchFilter = this.search_filter;
        int hashCode2 = hashCode + (abstractC0069SearchFilter != null ? abstractC0069SearchFilter.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.search_filter = this.search_filter;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC0069SearchFilter abstractC0069SearchFilter = this.search_filter;
        if (abstractC0069SearchFilter != null) {
            arrayList.add("search_filter=" + abstractC0069SearchFilter);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchFilter{", "}", 0, null, null, 56);
    }
}
