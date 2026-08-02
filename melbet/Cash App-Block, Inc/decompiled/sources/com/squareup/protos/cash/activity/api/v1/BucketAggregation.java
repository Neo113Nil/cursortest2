package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/BucketAggregation;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/BucketAggregation$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/BucketAggregation$Field;", "field", "Lcom/squareup/protos/cash/activity/api/v1/BucketAggregation$Field;", "", "size", "Ljava/lang/Integer;", "Lcom/squareup/protos/cash/activity/api/v1/BucketSort;", "sort", "Lcom/squareup/protos/cash/activity/api/v1/BucketSort;", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation;", "sub_aggregations", "Ljava/util/List;", "Companion", "Builder", "Field", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BucketAggregation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BucketAggregation> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.BucketAggregation$Field#ADAPTER", schemaIndex = 0, tag = 1)
    public final Field field;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
    public final Integer size;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.BucketSort#ADAPTER", schemaIndex = 3, tag = 4)
    public final BucketSort sort;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivitySearchAggregation#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<ActivitySearchAggregation> sub_aggregations;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000fJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/BucketAggregation$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/BucketAggregation;", "<init>", "()V", "field", "Lcom/squareup/protos/cash/activity/api/v1/BucketAggregation$Field;", "size", "", "Ljava/lang/Integer;", "sub_aggregations", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation;", "sort", "Lcom/squareup/protos/cash/activity/api/v1/BucketSort;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/activity/api/v1/BucketAggregation$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Field field;
        public Integer size;
        public BucketSort sort;
        public List<ActivitySearchAggregation> sub_aggregations = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public BucketAggregation build() {
            return new BucketAggregation(this.field, this.size, this.sub_aggregations, this.sort, buildUnknownFields());
        }

        public final Builder field(Field field) {
            this.field = field;
            return this;
        }

        public final Builder size(Integer size) {
            this.size = size;
            return this;
        }

        public final Builder sort(BucketSort sort) {
            this.sort = sort;
            return this;
        }

        public final Builder sub_aggregations(List<ActivitySearchAggregation> sub_aggregations) {
            sub_aggregations.getClass();
            TransactorKt.checkElementsNotNull(sub_aggregations);
            this.sub_aggregations = sub_aggregations;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/BucketAggregation$Field;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "FIELD_DEFAULT_DO_NOT_USE", "PRODUCT_CLASSIFIERS", "SECTION", "DISPLAY_CATEGORY", "DISPLAY_TYPE", "COUNTERPARTY", "COUNTERPARTY_TO", "COUNTERPARTY_FROM", "COUNTERPARTY_NAME", "COUNTERPARTY_NAME_TO", "COUNTERPARTY_NAME_FROM", "MERCHANT_CATEGORY", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Field implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Field[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final Field COUNTERPARTY;
        public static final Field COUNTERPARTY_FROM;
        public static final Field COUNTERPARTY_NAME;
        public static final Field COUNTERPARTY_NAME_FROM;
        public static final Field COUNTERPARTY_NAME_TO;
        public static final Field COUNTERPARTY_TO;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Field DISPLAY_CATEGORY;
        public static final Field DISPLAY_TYPE;
        public static final Field FIELD_DEFAULT_DO_NOT_USE;
        public static final Field MERCHANT_CATEGORY;
        public static final Field PRODUCT_CLASSIFIERS;
        public static final Field SECTION;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/BucketAggregation$Field$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/BucketAggregation$Field;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public static Field fromValue(int i) {
                switch (i) {
                    case 0:
                        return Field.FIELD_DEFAULT_DO_NOT_USE;
                    case 1:
                        return Field.PRODUCT_CLASSIFIERS;
                    case 2:
                        return Field.SECTION;
                    case 3:
                        return Field.DISPLAY_CATEGORY;
                    case 4:
                        return Field.DISPLAY_TYPE;
                    case 5:
                        return Field.COUNTERPARTY;
                    case 6:
                        return Field.COUNTERPARTY_TO;
                    case 7:
                        return Field.COUNTERPARTY_FROM;
                    case 8:
                        return Field.COUNTERPARTY_NAME;
                    case 9:
                        return Field.COUNTERPARTY_NAME_TO;
                    case 10:
                        return Field.COUNTERPARTY_NAME_FROM;
                    case 11:
                        return Field.MERCHANT_CATEGORY;
                    default:
                        return null;
                }
            }
        }

        static {
            Field field = new Field("FIELD_DEFAULT_DO_NOT_USE", 0, 0);
            FIELD_DEFAULT_DO_NOT_USE = field;
            Field field2 = new Field("PRODUCT_CLASSIFIERS", 1, 1);
            PRODUCT_CLASSIFIERS = field2;
            Field field3 = new Field("SECTION", 2, 2);
            SECTION = field3;
            Field field4 = new Field("DISPLAY_CATEGORY", 3, 3);
            DISPLAY_CATEGORY = field4;
            Field field5 = new Field("DISPLAY_TYPE", 4, 4);
            DISPLAY_TYPE = field5;
            Field field6 = new Field("COUNTERPARTY", 5, 5);
            COUNTERPARTY = field6;
            Field field7 = new Field("COUNTERPARTY_TO", 6, 6);
            COUNTERPARTY_TO = field7;
            Field field8 = new Field("COUNTERPARTY_FROM", 7, 7);
            COUNTERPARTY_FROM = field8;
            Field field9 = new Field("COUNTERPARTY_NAME", 8, 8);
            COUNTERPARTY_NAME = field9;
            Field field10 = new Field("COUNTERPARTY_NAME_TO", 9, 9);
            COUNTERPARTY_NAME_TO = field10;
            Field field11 = new Field("COUNTERPARTY_NAME_FROM", 10, 10);
            COUNTERPARTY_NAME_FROM = field11;
            Field field12 = new Field("MERCHANT_CATEGORY", 11, 11);
            MERCHANT_CATEGORY = field12;
            Field[] fieldArr = {field, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12};
            $VALUES = fieldArr;
            $ENTRIES = new EnumEntriesList(fieldArr);
            INSTANCE = new Companion();
            ADAPTER = new BucketAggregation$Field$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Field.class), Syntax.PROTO_2, field);
        }

        public Field(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Field fromValue(int i) {
            INSTANCE.getClass();
            return Companion.fromValue(i);
        }

        public static Field valueOf(String str) {
            return (Field) Enum.valueOf(Field.class, str);
        }

        public static Field[] values() {
            return (Field[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        BucketAggregation$Companion$ADAPTER$1 bucketAggregation$Companion$ADAPTER$1 = new BucketAggregation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BucketAggregation.class), "type.googleapis.com/squareup.cash.activity.api.v1.BucketAggregation", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = bucketAggregation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bucketAggregation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BucketAggregation(Field field, Integer num, List list, BucketSort bucketSort, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.field = field;
        this.size = num;
        this.sort = bucketSort;
        this.sub_aggregations = TransactorKt.immutableCopyOf("sub_aggregations", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BucketAggregation)) {
            return false;
        }
        BucketAggregation bucketAggregation = (BucketAggregation) obj;
        return Intrinsics.areEqual(unknownFields(), bucketAggregation.unknownFields()) && this.field == bucketAggregation.field && Intrinsics.areEqual(this.size, bucketAggregation.size) && Intrinsics.areEqual(this.sub_aggregations, bucketAggregation.sub_aggregations) && Intrinsics.areEqual(this.sort, bucketAggregation.sort);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Field field = this.field;
        int hashCode2 = (hashCode + (field != null ? field.hashCode() : 0)) * 37;
        Integer num = this.size;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37, 37, this.sub_aggregations);
        BucketSort bucketSort = this.sort;
        int hashCode3 = m + (bucketSort != null ? bucketSort.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.field = this.field;
        builder.size = this.size;
        builder.sub_aggregations = this.sub_aggregations;
        builder.sort = this.sort;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Field field = this.field;
        if (field != null) {
            arrayList.add("field=" + field);
        }
        Integer num = this.size;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("size=", num, arrayList);
        }
        if (!this.sub_aggregations.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sub_aggregations=", arrayList, this.sub_aggregations);
        }
        BucketSort bucketSort = this.sort;
        if (bucketSort != null) {
            arrayList.add("sort=" + bucketSort);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BucketAggregation{", "}", 0, null, null, 56);
    }
}
