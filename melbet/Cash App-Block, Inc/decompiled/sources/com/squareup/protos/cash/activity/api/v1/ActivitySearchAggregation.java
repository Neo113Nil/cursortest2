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
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Builder;", "", "name", "Ljava/lang/String;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Aggregation;", "aggregation", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Aggregation;", "Companion", "Builder", "Aggregation", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivitySearchAggregation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivitySearchAggregation> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 1)
    public final Aggregation aggregation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String name;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Aggregation;", "", "Bucket", "Range", "Metric", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Aggregation$Bucket;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Aggregation$Metric;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Aggregation$Range;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Aggregation {

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.BucketAggregation#ADAPTER", declaredName = "bucket", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Aggregation$Bucket;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Aggregation;", "Lcom/squareup/protos/cash/activity/api/v1/BucketAggregation;", "value", "Lcom/squareup/protos/cash/activity/api/v1/BucketAggregation;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/BucketAggregation;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Bucket extends Aggregation {
            private final BucketAggregation value;

            public Bucket(BucketAggregation bucketAggregation) {
                bucketAggregation.getClass();
                this.value = bucketAggregation;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Bucket) && Intrinsics.areEqual(this.value, ((Bucket) obj).value);
            }

            public final BucketAggregation getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Bucket(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.MetricAggregation#ADAPTER", declaredName = "metric", tag = 4)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Aggregation$Metric;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Aggregation;", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation;", "value", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Metric extends Aggregation {
            private final MetricAggregation value;

            public Metric(MetricAggregation metricAggregation) {
                metricAggregation.getClass();
                this.value = metricAggregation;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Metric) && Intrinsics.areEqual(this.value, ((Metric) obj).value);
            }

            public final MetricAggregation getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Metric(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.RangeAggregation#ADAPTER", declaredName = "range", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Aggregation$Range;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Aggregation;", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregation;", "value", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregation;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/RangeAggregation;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Range extends Aggregation {
            private final RangeAggregation value;

            public Range(RangeAggregation rangeAggregation) {
                rangeAggregation.getClass();
                this.value = rangeAggregation;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Range) && Intrinsics.areEqual(this.value, ((Range) obj).value);
            }

            public final RangeAggregation getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Range(value=" + this.value + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation;", "<init>", "()V", "name", "", "aggregation", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregation$Aggregation;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Aggregation aggregation;
        public String name;

        public final Builder aggregation(Aggregation aggregation) {
            this.aggregation = aggregation;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActivitySearchAggregation build() {
            return new ActivitySearchAggregation(this.name, this.aggregation, buildUnknownFields());
        }

        public final Builder name(String name) {
            this.name = name;
            return this;
        }
    }

    static {
        ActivitySearchAggregation$Companion$ADAPTER$1 activitySearchAggregation$Companion$ADAPTER$1 = new ActivitySearchAggregation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivitySearchAggregation.class), "type.googleapis.com/squareup.cash.activity.api.v1.ActivitySearchAggregation", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = activitySearchAggregation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activitySearchAggregation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySearchAggregation(String str, Aggregation aggregation, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = str;
        this.aggregation = aggregation;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivitySearchAggregation)) {
            return false;
        }
        ActivitySearchAggregation activitySearchAggregation = (ActivitySearchAggregation) obj;
        return Intrinsics.areEqual(unknownFields(), activitySearchAggregation.unknownFields()) && Intrinsics.areEqual(this.name, activitySearchAggregation.name) && Intrinsics.areEqual(this.aggregation, activitySearchAggregation.aggregation);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Aggregation aggregation = this.aggregation;
        int hashCode3 = hashCode2 + (aggregation != null ? aggregation.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.aggregation = this.aggregation;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        Aggregation aggregation = this.aggregation;
        if (aggregation != null) {
            arrayList.add("aggregation=" + aggregation);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySearchAggregation{", "}", 0, null, null, 56);
    }
}
