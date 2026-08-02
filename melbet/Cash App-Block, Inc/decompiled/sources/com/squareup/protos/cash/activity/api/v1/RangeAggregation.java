package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/RangeAggregation;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregation$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregation$Field;", "field", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregation$Field;", "", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregationRange;", "ranges", "Ljava/util/List;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation;", "sub_aggregations", "Companion", "Builder", "Field", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RangeAggregation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RangeAggregation> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.RangeAggregation$Field#ADAPTER", schemaIndex = 0, tag = 1)
    public final Field field;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.RangeAggregationRange#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<RangeAggregationRange> ranges;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivitySearchAggregation#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<ActivitySearchAggregation> sub_aggregations;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/RangeAggregation$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregation;", "<init>", "()V", "field", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregation$Field;", "ranges", "", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregationRange;", "sub_aggregations", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Field field;
        public List<RangeAggregationRange> ranges;
        public List<ActivitySearchAggregation> sub_aggregations;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.ranges = emptyList;
            this.sub_aggregations = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public RangeAggregation build() {
            return new RangeAggregation(this.field, this.ranges, this.sub_aggregations, buildUnknownFields());
        }

        public final Builder field(Field field) {
            this.field = field;
            return this;
        }

        public final Builder ranges(List<RangeAggregationRange> ranges) {
            ranges.getClass();
            TransactorKt.checkElementsNotNull(ranges);
            this.ranges = ranges;
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/RangeAggregation$Field;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "FIELD_DEFAULT_DO_NOT_USE", "AMOUNT", "DATE", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Field implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Field[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final Field AMOUNT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Field DATE;
        public static final Field FIELD_DEFAULT_DO_NOT_USE;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/RangeAggregation$Field$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregation$Field;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            Field field = new Field("FIELD_DEFAULT_DO_NOT_USE", 0, 0);
            FIELD_DEFAULT_DO_NOT_USE = field;
            Field field2 = new Field("AMOUNT", 1, 1);
            AMOUNT = field2;
            Field field3 = new Field("DATE", 2, 2);
            DATE = field3;
            Field[] fieldArr = {field, field2, field3};
            $VALUES = fieldArr;
            $ENTRIES = new EnumEntriesList(fieldArr);
            INSTANCE = new Companion();
            ADAPTER = new RangeAggregation$Field$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Field.class), Syntax.PROTO_2, field);
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
            return DATE;
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
        RangeAggregation$Companion$ADAPTER$1 rangeAggregation$Companion$ADAPTER$1 = new RangeAggregation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RangeAggregation.class), "type.googleapis.com/squareup.cash.activity.api.v1.RangeAggregation", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = rangeAggregation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(rangeAggregation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeAggregation(Field field, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.field = field;
        this.ranges = TransactorKt.immutableCopyOf("ranges", list);
        this.sub_aggregations = TransactorKt.immutableCopyOf("sub_aggregations", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RangeAggregation)) {
            return false;
        }
        RangeAggregation rangeAggregation = (RangeAggregation) obj;
        return Intrinsics.areEqual(unknownFields(), rangeAggregation.unknownFields()) && this.field == rangeAggregation.field && Intrinsics.areEqual(this.ranges, rangeAggregation.ranges) && Intrinsics.areEqual(this.sub_aggregations, rangeAggregation.sub_aggregations);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Field field = this.field;
        int hashCode2 = this.sub_aggregations.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (field != null ? field.hashCode() : 0)) * 37, 37, this.ranges);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.field = this.field;
        builder.ranges = this.ranges;
        builder.sub_aggregations = this.sub_aggregations;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Field field = this.field;
        if (field != null) {
            arrayList.add("field=" + field);
        }
        if (!this.ranges.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("ranges=", arrayList, this.ranges);
        }
        if (!this.sub_aggregations.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sub_aggregations=", arrayList, this.sub_aggregations);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RangeAggregation{", "}", 0, null, null, 56);
    }
}
