package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\r\f\u000e\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/BucketSort;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/BucketSort$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/BucketSort$Type;", "type", "Lcom/squareup/protos/cash/activity/api/v1/BucketSort$Type;", "", "aggregation_name", "Ljava/lang/String;", "Lcom/squareup/protos/cash/activity/api/v1/BucketSort$Order;", "order", "Lcom/squareup/protos/cash/activity/api/v1/BucketSort$Order;", "Companion", "Builder", "Type", "Order", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BucketSort extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BucketSort> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String aggregation_name;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.BucketSort$Order#ADAPTER", schemaIndex = 2, tag = 3)
    public final Order order;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.BucketSort$Type#ADAPTER", schemaIndex = 0, tag = 1)
    public final Type type;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/BucketSort$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/BucketSort;", "<init>", "()V", "type", "Lcom/squareup/protos/cash/activity/api/v1/BucketSort$Type;", "aggregation_name", "", "order", "Lcom/squareup/protos/cash/activity/api/v1/BucketSort$Order;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String aggregation_name;
        public Order order;
        public Type type;

        public final Builder aggregation_name(String aggregation_name) {
            this.aggregation_name = aggregation_name;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public BucketSort build() {
            return new BucketSort(this.type, this.aggregation_name, this.order, buildUnknownFields());
        }

        public final Builder order(Order order) {
            this.order = order;
            return this;
        }

        public final Builder type(Type type2) {
            this.type = type2;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/BucketSort$Order;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "ASC", "DESC", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Order implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Order[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final Order ASC;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Order DESC;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/BucketSort$Order$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/BucketSort$Order;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            ADAPTER = new BucketSort$Order$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Order.class), Syntax.PROTO_2, null);
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/BucketSort$Type;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "FIELD_DEFAULT_DO_NOT_USE", "COUNT", "METRIC", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final Type COUNT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type FIELD_DEFAULT_DO_NOT_USE;
        public static final Type METRIC;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/BucketSort$Type$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/BucketSort$Type;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            Type type2 = new Type("FIELD_DEFAULT_DO_NOT_USE", 0, 0);
            FIELD_DEFAULT_DO_NOT_USE = type2;
            Type type3 = new Type("COUNT", 1, 1);
            COUNT = type3;
            Type type4 = new Type("METRIC", 2, 2);
            METRIC = type4;
            Type[] typeArr = {type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new EnumEntriesList(typeArr);
            INSTANCE = new Companion();
            ADAPTER = new BucketSort$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
        }

        public Type(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Type fromValue(int i) {
            INSTANCE.getClass();
            if (i == 0) {
                return FIELD_DEFAULT_DO_NOT_USE;
            }
            if (i == 1) {
                return COUNT;
            }
            if (i != 2) {
                return null;
            }
            return METRIC;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        BucketSort$Companion$ADAPTER$1 bucketSort$Companion$ADAPTER$1 = new BucketSort$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BucketSort.class), "type.googleapis.com/squareup.cash.activity.api.v1.BucketSort", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = bucketSort$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bucketSort$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BucketSort(Type type2, String str, Order order, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.type = type2;
        this.aggregation_name = str;
        this.order = order;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BucketSort)) {
            return false;
        }
        BucketSort bucketSort = (BucketSort) obj;
        return Intrinsics.areEqual(unknownFields(), bucketSort.unknownFields()) && this.type == bucketSort.type && Intrinsics.areEqual(this.aggregation_name, bucketSort.aggregation_name) && this.order == bucketSort.order;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        String str = this.aggregation_name;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Order order = this.order;
        int hashCode4 = hashCode3 + (order != null ? order.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.aggregation_name = this.aggregation_name;
        builder.order = this.order;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        String str = this.aggregation_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "aggregation_name=", arrayList);
        }
        Order order = this.order;
        if (order != null) {
            arrayList.add("order=" + order);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BucketSort{", "}", 0, null, null, 56);
    }
}
