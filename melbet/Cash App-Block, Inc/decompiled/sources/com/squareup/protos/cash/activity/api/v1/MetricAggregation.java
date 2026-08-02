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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\n\t\u000b\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation$Operation;", "operation", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation$Operation;", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation$Field;", "field", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation$Field;", "Companion", "Builder", "Operation", "Field", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MetricAggregation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MetricAggregation> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.MetricAggregation$Field#ADAPTER", schemaIndex = 1, tag = 2)
    public final Field field;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.MetricAggregation$Operation#ADAPTER", schemaIndex = 0, tag = 1)
    public final Operation operation;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation;", "<init>", "()V", "operation", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation$Operation;", "field", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation$Field;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Field field;
        public Operation operation;

        @Override // com.squareup.wire.Message.Builder
        public MetricAggregation build() {
            return new MetricAggregation(this.operation, this.field, buildUnknownFields());
        }

        public final Builder field(Field field) {
            this.field = field;
            return this;
        }

        public final Builder operation(Operation operation2) {
            this.operation = operation2;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation$Field;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "FIELD_DEFAULT_DO_NOT_USE", "AMOUNT", "SIGNED_AMOUNT", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Field implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Field[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final Field AMOUNT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Field FIELD_DEFAULT_DO_NOT_USE;
        public static final Field SIGNED_AMOUNT;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation$Field$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation$Field;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            Field field = new Field("FIELD_DEFAULT_DO_NOT_USE", 0, 0);
            FIELD_DEFAULT_DO_NOT_USE = field;
            Field field2 = new Field("AMOUNT", 1, 1);
            AMOUNT = field2;
            Field field3 = new Field("SIGNED_AMOUNT", 2, 2);
            SIGNED_AMOUNT = field3;
            Field[] fieldArr = {field, field2, field3};
            $VALUES = fieldArr;
            $ENTRIES = new EnumEntriesList(fieldArr);
            INSTANCE = new Companion();
            ADAPTER = new MetricAggregation$Field$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Field.class), Syntax.PROTO_2, field);
        }

        public Field(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Field fromValue(int i) {
            INSTANCE.getClass();
            if (i == 0) {
                return FIELD_DEFAULT_DO_NOT_USE;
            }
            if (i == 1) {
                return AMOUNT;
            }
            if (i != 2) {
                return null;
            }
            return SIGNED_AMOUNT;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation$Operation;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "OPERATION_DEFAULT_DO_NOT_USE", "SUM", "AVERAGE", "COUNT", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Operation implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Operation[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final Operation AVERAGE;
        public static final Operation COUNT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Operation OPERATION_DEFAULT_DO_NOT_USE;
        public static final Operation SUM;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation$Operation$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation$Operation;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            Operation operation2 = new Operation("OPERATION_DEFAULT_DO_NOT_USE", 0, 0);
            OPERATION_DEFAULT_DO_NOT_USE = operation2;
            Operation operation3 = new Operation("SUM", 1, 1);
            SUM = operation3;
            Operation operation4 = new Operation("AVERAGE", 2, 2);
            AVERAGE = operation4;
            Operation operation5 = new Operation("COUNT", 3, 3);
            COUNT = operation5;
            Operation[] operationArr = {operation2, operation3, operation4, operation5};
            $VALUES = operationArr;
            $ENTRIES = new EnumEntriesList(operationArr);
            INSTANCE = new Companion();
            ADAPTER = new MetricAggregation$Operation$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Operation.class), Syntax.PROTO_2, operation2);
        }

        public Operation(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Operation fromValue(int i) {
            INSTANCE.getClass();
            if (i == 0) {
                return OPERATION_DEFAULT_DO_NOT_USE;
            }
            if (i == 1) {
                return SUM;
            }
            if (i == 2) {
                return AVERAGE;
            }
            if (i != 3) {
                return null;
            }
            return COUNT;
        }

        public static Operation valueOf(String str) {
            return (Operation) Enum.valueOf(Operation.class, str);
        }

        public static Operation[] values() {
            return (Operation[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        MetricAggregation$Companion$ADAPTER$1 metricAggregation$Companion$ADAPTER$1 = new MetricAggregation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MetricAggregation.class), "type.googleapis.com/squareup.cash.activity.api.v1.MetricAggregation", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = metricAggregation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(metricAggregation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricAggregation(Operation operation2, Field field, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.operation = operation2;
        this.field = field;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MetricAggregation)) {
            return false;
        }
        MetricAggregation metricAggregation = (MetricAggregation) obj;
        return Intrinsics.areEqual(unknownFields(), metricAggregation.unknownFields()) && this.operation == metricAggregation.operation && this.field == metricAggregation.field;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Operation operation2 = this.operation;
        int hashCode2 = (hashCode + (operation2 != null ? operation2.hashCode() : 0)) * 37;
        Field field = this.field;
        int hashCode3 = hashCode2 + (field != null ? field.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.operation = this.operation;
        builder.field = this.field;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Operation operation2 = this.operation;
        if (operation2 != null) {
            arrayList.add("operation=" + operation2);
        }
        Field field = this.field;
        if (field != null) {
            arrayList.add("field=" + field);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MetricAggregation{", "}", 0, null, null, 56);
    }
}
