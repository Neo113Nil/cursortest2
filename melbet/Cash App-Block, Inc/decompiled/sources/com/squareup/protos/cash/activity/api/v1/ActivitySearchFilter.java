package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "search_filter", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "", "suggested", "Ljava/lang/Boolean;", "Companion", "Builder", "SearchFilter", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivitySearchFilter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivitySearchFilter> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final SearchFilter search_filter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 20)
    public final Boolean suggested;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter;", "<init>", "()V", "search_filter", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "suggested", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public SearchFilter search_filter;
        public Boolean suggested;

        @Override // com.squareup.wire.Message.Builder
        public ActivitySearchFilter build() {
            return new ActivitySearchFilter(this.search_filter, this.suggested, buildUnknownFields());
        }

        public final Builder search_filter(SearchFilter search_filter) {
            this.search_filter = search_filter;
            return this;
        }

        public final Builder suggested(Boolean suggested) {
            this.suggested = suggested;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "", "Amount", "CustomerAnyOf", "CounterpartyCashtag", "CounterpartyName", "Counterparty", "Date", "DisplayCategory", "DisplayCategoryAnyOf", "DisplayType", "DisplayTypeAnyOf", "MerchantCategory", "MerchantCategoryAnyOf", "MerchantCategoryExists", "MoneyMovement", "PaymentNote", "PaymentState", "PaymentStateAnyOf", "ProductClassifier", "ProductClassifiersAnyOf", "RatePlan", "Section", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$Amount;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$Counterparty;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$CounterpartyCashtag;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$CounterpartyName;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$CustomerAnyOf;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$Date;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$DisplayCategory;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$DisplayCategoryAnyOf;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$DisplayType;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$DisplayTypeAnyOf;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$MerchantCategory;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$MerchantCategoryAnyOf;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$MerchantCategoryExists;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$MoneyMovement;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$PaymentNote;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$PaymentState;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$PaymentStateAnyOf;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$ProductClassifier;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$ProductClassifiersAnyOf;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$RatePlan;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$Section;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class SearchFilter {

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.AmountSearchFilter#ADAPTER", declaredName = "amount", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$Amount;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/AmountSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/AmountSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/AmountSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Amount extends SearchFilter {
            private final AmountSearchFilter value;

            public Amount(AmountSearchFilter amountSearchFilter) {
                amountSearchFilter.getClass();
                this.value = amountSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Amount) && Intrinsics.areEqual(this.value, ((Amount) obj).value);
            }

            public final AmountSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Amount(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.CustomerSearchFilter#ADAPTER", declaredName = "counterparty", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$Counterparty;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/CustomerSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/CustomerSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/CustomerSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Counterparty extends SearchFilter {
            private final CustomerSearchFilter value;

            public Counterparty(CustomerSearchFilter customerSearchFilter) {
                customerSearchFilter.getClass();
                this.value = customerSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Counterparty) && Intrinsics.areEqual(this.value, ((Counterparty) obj).value);
            }

            public final CustomerSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Counterparty(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.CustomerCashtagSearchFilter#ADAPTER", declaredName = "counterparty_cashtag", tag = 16)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$CounterpartyCashtag;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/CustomerCashtagSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/CustomerCashtagSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/CustomerCashtagSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CounterpartyCashtag extends SearchFilter {
            private final CustomerCashtagSearchFilter value;

            public CounterpartyCashtag(CustomerCashtagSearchFilter customerCashtagSearchFilter) {
                customerCashtagSearchFilter.getClass();
                this.value = customerCashtagSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CounterpartyCashtag) && Intrinsics.areEqual(this.value, ((CounterpartyCashtag) obj).value);
            }

            public final CustomerCashtagSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CounterpartyCashtag(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.CustomerNameSearchFilter#ADAPTER", declaredName = "counterparty_name", tag = 17)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$CounterpartyName;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/CustomerNameSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/CustomerNameSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/CustomerNameSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CounterpartyName extends SearchFilter {
            private final CustomerNameSearchFilter value;

            public CounterpartyName(CustomerNameSearchFilter customerNameSearchFilter) {
                customerNameSearchFilter.getClass();
                this.value = customerNameSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CounterpartyName) && Intrinsics.areEqual(this.value, ((CounterpartyName) obj).value);
            }

            public final CustomerNameSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CounterpartyName(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.CustomerAnyOfSearchFilter#ADAPTER", declaredName = "customer_any_of", tag = 13)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$CustomerAnyOf;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/CustomerAnyOfSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/CustomerAnyOfSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/CustomerAnyOfSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CustomerAnyOf extends SearchFilter {
            private final CustomerAnyOfSearchFilter value;

            public CustomerAnyOf(CustomerAnyOfSearchFilter customerAnyOfSearchFilter) {
                customerAnyOfSearchFilter.getClass();
                this.value = customerAnyOfSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CustomerAnyOf) && Intrinsics.areEqual(this.value, ((CustomerAnyOf) obj).value);
            }

            public final CustomerAnyOfSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CustomerAnyOf(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.DateSearchFilter#ADAPTER", declaredName = InquiryField.DateField.TYPE, tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$Date;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/DateSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/DateSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/DateSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Date extends SearchFilter {
            private final DateSearchFilter value;

            public Date(DateSearchFilter dateSearchFilter) {
                dateSearchFilter.getClass();
                this.value = dateSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Date) && Intrinsics.areEqual(this.value, ((Date) obj).value);
            }

            public final DateSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Date(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.DisplayCategorySearchFilter#ADAPTER", declaredName = "display_category", tag = 6)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$DisplayCategory;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayCategorySearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/DisplayCategorySearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/DisplayCategorySearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DisplayCategory extends SearchFilter {
            private final DisplayCategorySearchFilter value;

            public DisplayCategory(DisplayCategorySearchFilter displayCategorySearchFilter) {
                displayCategorySearchFilter.getClass();
                this.value = displayCategorySearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayCategory) && Intrinsics.areEqual(this.value, ((DisplayCategory) obj).value);
            }

            public final DisplayCategorySearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "DisplayCategory(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.DisplayCategoryAnyOfSearchFilter#ADAPTER", declaredName = "display_category_any_of", tag = 10)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$DisplayCategoryAnyOf;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayCategoryAnyOfSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/DisplayCategoryAnyOfSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/DisplayCategoryAnyOfSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DisplayCategoryAnyOf extends SearchFilter {
            private final DisplayCategoryAnyOfSearchFilter value;

            public DisplayCategoryAnyOf(DisplayCategoryAnyOfSearchFilter displayCategoryAnyOfSearchFilter) {
                displayCategoryAnyOfSearchFilter.getClass();
                this.value = displayCategoryAnyOfSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayCategoryAnyOf) && Intrinsics.areEqual(this.value, ((DisplayCategoryAnyOf) obj).value);
            }

            public final DisplayCategoryAnyOfSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "DisplayCategoryAnyOf(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.DisplayTypeSearchFilter#ADAPTER", declaredName = "display_type", tag = 8)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$DisplayType;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayTypeSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/DisplayTypeSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/DisplayTypeSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DisplayType extends SearchFilter {
            private final DisplayTypeSearchFilter value;

            public DisplayType(DisplayTypeSearchFilter displayTypeSearchFilter) {
                displayTypeSearchFilter.getClass();
                this.value = displayTypeSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayType) && Intrinsics.areEqual(this.value, ((DisplayType) obj).value);
            }

            public final DisplayTypeSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "DisplayType(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.DisplayTypeAnyOfSearchFilter#ADAPTER", declaredName = "display_type_any_of", tag = 12)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$DisplayTypeAnyOf;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayTypeAnyOfSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/DisplayTypeAnyOfSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/DisplayTypeAnyOfSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DisplayTypeAnyOf extends SearchFilter {
            private final DisplayTypeAnyOfSearchFilter value;

            public DisplayTypeAnyOf(DisplayTypeAnyOfSearchFilter displayTypeAnyOfSearchFilter) {
                displayTypeAnyOfSearchFilter.getClass();
                this.value = displayTypeAnyOfSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayTypeAnyOf) && Intrinsics.areEqual(this.value, ((DisplayTypeAnyOf) obj).value);
            }

            public final DisplayTypeAnyOfSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "DisplayTypeAnyOf(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.MerchantCategorySearchFilter#ADAPTER", declaredName = "merchant_category", tag = 19)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$MerchantCategory;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/MerchantCategorySearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/MerchantCategorySearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/MerchantCategorySearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MerchantCategory extends SearchFilter {
            private final MerchantCategorySearchFilter value;

            public MerchantCategory(MerchantCategorySearchFilter merchantCategorySearchFilter) {
                merchantCategorySearchFilter.getClass();
                this.value = merchantCategorySearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MerchantCategory) && Intrinsics.areEqual(this.value, ((MerchantCategory) obj).value);
            }

            public final MerchantCategorySearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "MerchantCategory(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.MerchantCategoryAnyOfSearchFilter#ADAPTER", declaredName = "merchant_category_any_of", tag = 21)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$MerchantCategoryAnyOf;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/MerchantCategoryAnyOfSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/MerchantCategoryAnyOfSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/MerchantCategoryAnyOfSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MerchantCategoryAnyOf extends SearchFilter {
            private final MerchantCategoryAnyOfSearchFilter value;

            public MerchantCategoryAnyOf(MerchantCategoryAnyOfSearchFilter merchantCategoryAnyOfSearchFilter) {
                merchantCategoryAnyOfSearchFilter.getClass();
                this.value = merchantCategoryAnyOfSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MerchantCategoryAnyOf) && Intrinsics.areEqual(this.value, ((MerchantCategoryAnyOf) obj).value);
            }

            public final MerchantCategoryAnyOfSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "MerchantCategoryAnyOf(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.MerchantCategoryExistsSearchFilter#ADAPTER", declaredName = "merchant_category_exists", tag = 22)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$MerchantCategoryExists;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/MerchantCategoryExistsSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/MerchantCategoryExistsSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/MerchantCategoryExistsSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MerchantCategoryExists extends SearchFilter {
            private final MerchantCategoryExistsSearchFilter value;

            public MerchantCategoryExists(MerchantCategoryExistsSearchFilter merchantCategoryExistsSearchFilter) {
                merchantCategoryExistsSearchFilter.getClass();
                this.value = merchantCategoryExistsSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MerchantCategoryExists) && Intrinsics.areEqual(this.value, ((MerchantCategoryExists) obj).value);
            }

            public final MerchantCategoryExistsSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "MerchantCategoryExists(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.MoneyMovementSearchFilter#ADAPTER", declaredName = "money_movement", tag = 14)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$MoneyMovement;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/MoneyMovementSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/MoneyMovementSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/MoneyMovementSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MoneyMovement extends SearchFilter {
            private final MoneyMovementSearchFilter value;

            public MoneyMovement(MoneyMovementSearchFilter moneyMovementSearchFilter) {
                moneyMovementSearchFilter.getClass();
                this.value = moneyMovementSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MoneyMovement) && Intrinsics.areEqual(this.value, ((MoneyMovement) obj).value);
            }

            public final MoneyMovementSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "MoneyMovement(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.PaymentNoteSearchFilter#ADAPTER", declaredName = "payment_note", tag = 18)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$PaymentNote;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/PaymentNoteSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/PaymentNoteSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/PaymentNoteSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PaymentNote extends SearchFilter {
            private final PaymentNoteSearchFilter value;

            public PaymentNote(PaymentNoteSearchFilter paymentNoteSearchFilter) {
                paymentNoteSearchFilter.getClass();
                this.value = paymentNoteSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaymentNote) && Intrinsics.areEqual(this.value, ((PaymentNote) obj).value);
            }

            public final PaymentNoteSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PaymentNote(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.PaymentStateSearchFilter#ADAPTER", declaredName = "payment_state", tag = 5)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$PaymentState;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/PaymentStateSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/PaymentStateSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/PaymentStateSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PaymentState extends SearchFilter {
            private final PaymentStateSearchFilter value;

            public PaymentState(PaymentStateSearchFilter paymentStateSearchFilter) {
                paymentStateSearchFilter.getClass();
                this.value = paymentStateSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaymentState) && Intrinsics.areEqual(this.value, ((PaymentState) obj).value);
            }

            public final PaymentStateSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PaymentState(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.PaymentStateAnyOfSearchFilter#ADAPTER", declaredName = "payment_state_any_of", tag = 15)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$PaymentStateAnyOf;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/PaymentStateAnyOfSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/PaymentStateAnyOfSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/PaymentStateAnyOfSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PaymentStateAnyOf extends SearchFilter {
            private final PaymentStateAnyOfSearchFilter value;

            public PaymentStateAnyOf(PaymentStateAnyOfSearchFilter paymentStateAnyOfSearchFilter) {
                paymentStateAnyOfSearchFilter.getClass();
                this.value = paymentStateAnyOfSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaymentStateAnyOf) && Intrinsics.areEqual(this.value, ((PaymentStateAnyOf) obj).value);
            }

            public final PaymentStateAnyOfSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PaymentStateAnyOf(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.ProductClassifierSearchFilter#ADAPTER", declaredName = "product_classifier", tag = 7)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$ProductClassifier;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/ProductClassifierSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/ProductClassifierSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/ProductClassifierSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ProductClassifier extends SearchFilter {
            private final ProductClassifierSearchFilter value;

            public ProductClassifier(ProductClassifierSearchFilter productClassifierSearchFilter) {
                productClassifierSearchFilter.getClass();
                this.value = productClassifierSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProductClassifier) && Intrinsics.areEqual(this.value, ((ProductClassifier) obj).value);
            }

            public final ProductClassifierSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ProductClassifier(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.ProductClassifierAnyOfSearchFilter#ADAPTER", declaredName = "product_classifiers_any_of", tag = 11)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$ProductClassifiersAnyOf;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/ProductClassifierAnyOfSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/ProductClassifierAnyOfSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/ProductClassifierAnyOfSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ProductClassifiersAnyOf extends SearchFilter {
            private final ProductClassifierAnyOfSearchFilter value;

            public ProductClassifiersAnyOf(ProductClassifierAnyOfSearchFilter productClassifierAnyOfSearchFilter) {
                productClassifierAnyOfSearchFilter.getClass();
                this.value = productClassifierAnyOfSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProductClassifiersAnyOf) && Intrinsics.areEqual(this.value, ((ProductClassifiersAnyOf) obj).value);
            }

            public final ProductClassifierAnyOfSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ProductClassifiersAnyOf(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.RatePlanSearchFilter#ADAPTER", declaredName = "rate_plan", tag = 4)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$RatePlan;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/RatePlanSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/RatePlanSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/RatePlanSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RatePlan extends SearchFilter {
            private final RatePlanSearchFilter value;

            public RatePlan(RatePlanSearchFilter ratePlanSearchFilter) {
                ratePlanSearchFilter.getClass();
                this.value = ratePlanSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RatePlan) && Intrinsics.areEqual(this.value, ((RatePlan) obj).value);
            }

            public final RatePlanSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "RatePlan(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.SectionSearchFilter#ADAPTER", declaredName = "section", tag = 9)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter$Section;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$SearchFilter;", "Lcom/squareup/protos/cash/activity/api/v1/SectionSearchFilter;", "value", "Lcom/squareup/protos/cash/activity/api/v1/SectionSearchFilter;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/SectionSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Section extends SearchFilter {
            private final SectionSearchFilter value;

            public Section(SectionSearchFilter sectionSearchFilter) {
                sectionSearchFilter.getClass();
                this.value = sectionSearchFilter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Section) && Intrinsics.areEqual(this.value, ((Section) obj).value);
            }

            public final SectionSearchFilter getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Section(value=" + this.value + ")";
            }
        }
    }

    static {
        ActivitySearchFilter$Companion$ADAPTER$1 activitySearchFilter$Companion$ADAPTER$1 = new ActivitySearchFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivitySearchFilter.class), "type.googleapis.com/squareup.cash.activity.api.v1.ActivitySearchFilter", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = activitySearchFilter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activitySearchFilter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySearchFilter(SearchFilter searchFilter, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.search_filter = searchFilter;
        this.suggested = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivitySearchFilter)) {
            return false;
        }
        ActivitySearchFilter activitySearchFilter = (ActivitySearchFilter) obj;
        return Intrinsics.areEqual(unknownFields(), activitySearchFilter.unknownFields()) && Intrinsics.areEqual(this.search_filter, activitySearchFilter.search_filter) && Intrinsics.areEqual(this.suggested, activitySearchFilter.suggested);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SearchFilter searchFilter = this.search_filter;
        int hashCode2 = (hashCode + (searchFilter != null ? searchFilter.hashCode() : 0)) * 37;
        Boolean bool = this.suggested;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.search_filter = this.search_filter;
        builder.suggested = this.suggested;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SearchFilter searchFilter = this.search_filter;
        if (searchFilter != null) {
            arrayList.add("search_filter=" + searchFilter);
        }
        Boolean bool = this.suggested;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suggested=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySearchFilter{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ActivitySearchFilter(SearchFilter searchFilter) {
        this(searchFilter, null, ByteString.EMPTY);
    }
}
