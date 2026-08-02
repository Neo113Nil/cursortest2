package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\n\t\u000b\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchSort;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/SearchSort$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/SearchSort$SortByField;", "sort_by_field", "Lcom/squareup/protos/cash/activity/api/v1/SearchSort$SortByField;", "Lcom/squareup/protos/cash/activity/api/v1/SearchSort$Order;", "order", "Lcom/squareup/protos/cash/activity/api/v1/SearchSort$Order;", "Companion", "Builder", "SortByField", "Order", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchSort extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchSort> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchSort$Order#ADAPTER", schemaIndex = 1, tag = 2)
    public final Order order;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchSort$SortByField#ADAPTER", schemaIndex = 0, tag = 1)
    public final SortByField sort_by_field;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchSort$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/SearchSort;", "<init>", "()V", "sort_by_field", "Lcom/squareup/protos/cash/activity/api/v1/SearchSort$SortByField;", "order", "Lcom/squareup/protos/cash/activity/api/v1/SearchSort$Order;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Order order;
        public SortByField sort_by_field;

        @Override // com.squareup.wire.Message.Builder
        public SearchSort build() {
            return new SearchSort(this.sort_by_field, this.order, buildUnknownFields());
        }

        public final Builder order(Order order) {
            this.order = order;
            return this;
        }

        public final Builder sort_by_field(SortByField sort_by_field) {
            this.sort_by_field = sort_by_field;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchSort$Order;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "ASC", "DESC", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Order implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Order[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final Order ASC;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Order DESC;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchSort$Order$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchSort$Order;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            Order order = new Order("ASC", 0, 1);
            ASC = order;
            Order order2 = new Order("DESC", 1, 2);
            DESC = order2;
            Order[] orderArr = {order, order2};
            $VALUES = orderArr;
            $ENTRIES = new EnumEntriesList(orderArr);
            INSTANCE = new Companion();
            ADAPTER = new SearchSort$Order$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Order.class), Syntax.PROTO_2, null);
        }

        public Order(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Order fromValue(int i) {
            INSTANCE.getClass();
            if (i == 1) {
                return ASC;
            }
            if (i != 2) {
                return null;
            }
            return DESC;
        }

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchSort$SortByField;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "DATE", "AMOUNT", "SECTION_AND_DATE", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SortByField implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SortByField[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final SortByField AMOUNT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final SortByField DATE;
        public static final SortByField SECTION_AND_DATE;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchSort$SortByField$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchSort$SortByField;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            SortByField sortByField = new SortByField("DATE", 0, 1);
            DATE = sortByField;
            SortByField sortByField2 = new SortByField("AMOUNT", 1, 2);
            AMOUNT = sortByField2;
            SortByField sortByField3 = new SortByField("SECTION_AND_DATE", 2, 3);
            SECTION_AND_DATE = sortByField3;
            SortByField[] sortByFieldArr = {sortByField, sortByField2, sortByField3};
            $VALUES = sortByFieldArr;
            $ENTRIES = new EnumEntriesList(sortByFieldArr);
            INSTANCE = new Companion();
            ADAPTER = new SearchSort$SortByField$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SortByField.class), Syntax.PROTO_2, null);
        }

        public SortByField(String str, int i, int i2) {
            this.value = i2;
        }

        public static final SortByField fromValue(int i) {
            INSTANCE.getClass();
            if (i == 1) {
                return DATE;
            }
            if (i == 2) {
                return AMOUNT;
            }
            if (i != 3) {
                return null;
            }
            return SECTION_AND_DATE;
        }

        public static SortByField valueOf(String str) {
            return (SortByField) Enum.valueOf(SortByField.class, str);
        }

        public static SortByField[] values() {
            return (SortByField[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SearchSort$Companion$ADAPTER$1 searchSort$Companion$ADAPTER$1 = new SearchSort$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchSort.class), "type.googleapis.com/squareup.cash.activity.api.v1.SearchSort", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = searchSort$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchSort$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchSort(SortByField sortByField, Order order, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sort_by_field = sortByField;
        this.order = order;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchSort)) {
            return false;
        }
        SearchSort searchSort = (SearchSort) obj;
        return Intrinsics.areEqual(unknownFields(), searchSort.unknownFields()) && this.sort_by_field == searchSort.sort_by_field && this.order == searchSort.order;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SortByField sortByField = this.sort_by_field;
        int hashCode2 = (hashCode + (sortByField != null ? sortByField.hashCode() : 0)) * 37;
        Order order = this.order;
        int hashCode3 = hashCode2 + (order != null ? order.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.sort_by_field = this.sort_by_field;
        builder.order = this.order;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SortByField sortByField = this.sort_by_field;
        if (sortByField != null) {
            arrayList.add("sort_by_field=" + sortByField);
        }
        Order order = this.order;
        if (order != null) {
            arrayList.add("order=" + order);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchSort{", "}", 0, null, null, 56);
    }
}
