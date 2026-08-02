package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CashFlow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/CashFlow$Builder;", "", "source", "Ljava/lang/String;", "Lcom/squareup/protos/common/Money;", "amount", "Lcom/squareup/protos/common/Money;", "Lcom/squareup/protos/cash/kgoose/api/v3/CashFlow$Category;", "category", "Lcom/squareup/protos/cash/kgoose/api/v3/CashFlow$Category;", "Companion", "Builder", "Category", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CashFlow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashFlow> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 1, tag = 2)
    public final Money amount;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.CashFlow$Category#ADAPTER", schemaIndex = 2, tag = 3)
    public final Category category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String source;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CashFlow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/CashFlow;", "<init>", "()V", "source", "", "amount", "Lcom/squareup/protos/common/Money;", "category", "Lcom/squareup/protos/cash/kgoose/api/v3/CashFlow$Category;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Money amount;
        public Category category;
        public String source;

        public final Builder amount(Money amount) {
            this.amount = amount;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public CashFlow build() {
            return new CashFlow(this.source, this.amount, this.category, buildUnknownFields());
        }

        public final Builder category(Category category) {
            this.category = category;
            return this;
        }

        public final Builder source(String source) {
            this.source = source;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CashFlow$Category;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "CATEGORY_UNSPECIFIED", "CATEGORY_PAYMENT", "CATEGORY_EARNING", "CATEGORY_TRANSFER", "CATEGORY_COMBINED", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Category implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Category[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final Category CATEGORY_COMBINED;
        public static final Category CATEGORY_EARNING;
        public static final Category CATEGORY_PAYMENT;
        public static final Category CATEGORY_TRANSFER;
        public static final Category CATEGORY_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CashFlow$Category$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/CashFlow$Category;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public static Category fromValue(int i) {
                if (i == 0) {
                    return Category.CATEGORY_UNSPECIFIED;
                }
                if (i == 1) {
                    return Category.CATEGORY_PAYMENT;
                }
                if (i == 2) {
                    return Category.CATEGORY_EARNING;
                }
                if (i == 3) {
                    return Category.CATEGORY_TRANSFER;
                }
                if (i != 4) {
                    return null;
                }
                return Category.CATEGORY_COMBINED;
            }
        }

        static {
            Category category = new Category("CATEGORY_UNSPECIFIED", 0, 0);
            CATEGORY_UNSPECIFIED = category;
            Category category2 = new Category("CATEGORY_PAYMENT", 1, 1);
            CATEGORY_PAYMENT = category2;
            Category category3 = new Category("CATEGORY_EARNING", 2, 2);
            CATEGORY_EARNING = category3;
            Category category4 = new Category("CATEGORY_TRANSFER", 3, 3);
            CATEGORY_TRANSFER = category4;
            Category category5 = new Category("CATEGORY_COMBINED", 4, 4);
            CATEGORY_COMBINED = category5;
            Category[] categoryArr = {category, category2, category3, category4, category5};
            $VALUES = categoryArr;
            $ENTRIES = new EnumEntriesList(categoryArr);
            INSTANCE = new Companion();
            ADAPTER = new CashFlow$Category$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Category.class), Syntax.PROTO_2, category);
        }

        public Category(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Category fromValue(int i) {
            INSTANCE.getClass();
            return Companion.fromValue(i);
        }

        public static Category valueOf(String str) {
            return (Category) Enum.valueOf(Category.class, str);
        }

        public static Category[] values() {
            return (Category[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CashFlow$Companion$ADAPTER$1 cashFlow$Companion$ADAPTER$1 = new CashFlow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashFlow.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.CashFlow", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
        ADAPTER = cashFlow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashFlow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashFlow(String str, Money money, Category category, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.source = str;
        this.amount = money;
        this.category = category;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashFlow)) {
            return false;
        }
        CashFlow cashFlow = (CashFlow) obj;
        return Intrinsics.areEqual(unknownFields(), cashFlow.unknownFields()) && Intrinsics.areEqual(this.source, cashFlow.source) && Intrinsics.areEqual(this.amount, cashFlow.amount) && this.category == cashFlow.category;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.source;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Category category = this.category;
        int hashCode4 = hashCode3 + (category != null ? category.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.source = this.source;
        builder.amount = this.amount;
        builder.category = this.category;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.source;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "source=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        Category category = this.category;
        if (category != null) {
            arrayList.add("category=" + category);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashFlow{", "}", 0, null, null, 56);
    }
}
