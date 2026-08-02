package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\b\u0007\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterType;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterType$Builder;", "", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterType$ActivityType;", "filter_by_types", "Ljava/util/List;", "Companion", "Builder", "ActivityType", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchFilterType extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchFilterType> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchFilterType$ActivityType#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<ActivityType> filter_by_types;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterType$ActivityType;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "PAYMENTS", "CASH_CARD", "BITCOIN", "TRANSFERS", "BORROW", "STOCK", "SAVINGS", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivityType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ActivityType[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final ActivityType BITCOIN;
        public static final ActivityType BORROW;
        public static final ActivityType CASH_CARD;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ActivityType PAYMENTS;
        public static final ActivityType SAVINGS;
        public static final ActivityType STOCK;
        public static final ActivityType TRANSFERS;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterType$ActivityType$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterType$ActivityType;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            ActivityType activityType = new ActivityType("PAYMENTS", 0, 1);
            PAYMENTS = activityType;
            ActivityType activityType2 = new ActivityType("CASH_CARD", 1, 2);
            CASH_CARD = activityType2;
            ActivityType activityType3 = new ActivityType("BITCOIN", 2, 3);
            BITCOIN = activityType3;
            ActivityType activityType4 = new ActivityType("TRANSFERS", 3, 4);
            TRANSFERS = activityType4;
            ActivityType activityType5 = new ActivityType("BORROW", 4, 5);
            BORROW = activityType5;
            ActivityType activityType6 = new ActivityType("STOCK", 5, 6);
            STOCK = activityType6;
            ActivityType activityType7 = new ActivityType("SAVINGS", 6, 7);
            SAVINGS = activityType7;
            ActivityType[] activityTypeArr = {activityType, activityType2, activityType3, activityType4, activityType5, activityType6, activityType7};
            $VALUES = activityTypeArr;
            $ENTRIES = new EnumEntriesList(activityTypeArr);
            INSTANCE = new Companion();
            ADAPTER = new SearchFilterType$ActivityType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ActivityType.class), Syntax.PROTO_2, null);
        }

        public ActivityType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final ActivityType fromValue(int i) {
            INSTANCE.getClass();
            switch (i) {
                case 1:
                    return PAYMENTS;
                case 2:
                    return CASH_CARD;
                case 3:
                    return BITCOIN;
                case 4:
                    return TRANSFERS;
                case 5:
                    return BORROW;
                case 6:
                    return STOCK;
                case 7:
                    return SAVINGS;
                default:
                    return null;
            }
        }

        public static ActivityType valueOf(String str) {
            return (ActivityType) Enum.valueOf(ActivityType.class, str);
        }

        public static ActivityType[] values() {
            return (ActivityType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterType$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterType;", "<init>", "()V", "filter_by_types", "", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterType$ActivityType;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<? extends ActivityType> filter_by_types = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public SearchFilterType build() {
            return new SearchFilterType(this.filter_by_types, buildUnknownFields());
        }

        public final Builder filter_by_types(List<? extends ActivityType> filter_by_types) {
            filter_by_types.getClass();
            TransactorKt.checkElementsNotNull(filter_by_types);
            this.filter_by_types = filter_by_types;
            return this;
        }
    }

    static {
        SearchFilterType$Companion$ADAPTER$1 searchFilterType$Companion$ADAPTER$1 = new SearchFilterType$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchFilterType.class), "type.googleapis.com/squareup.cash.activity.api.v1.SearchFilterType", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = searchFilterType$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchFilterType$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFilterType(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.filter_by_types = TransactorKt.immutableCopyOf("filter_by_types", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchFilterType)) {
            return false;
        }
        SearchFilterType searchFilterType = (SearchFilterType) obj;
        return Intrinsics.areEqual(unknownFields(), searchFilterType.unknownFields()) && Intrinsics.areEqual(this.filter_by_types, searchFilterType.filter_by_types);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.filter_by_types.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.filter_by_types = this.filter_by_types;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.filter_by_types.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("filter_by_types=", arrayList, this.filter_by_types);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchFilterType{", "}", 0, null, null, 56);
    }
}
