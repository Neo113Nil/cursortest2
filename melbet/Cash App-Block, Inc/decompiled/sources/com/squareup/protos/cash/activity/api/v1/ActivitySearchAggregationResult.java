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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Builder;", "", "name", "Ljava/lang/String;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Result;", "result", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Result;", "Companion", "Builder", "Result", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivitySearchAggregationResult extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivitySearchAggregationResult> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String name;

    @WireSealedOneof(schemaIndex = 1)
    public final Result result;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult;", "<init>", "()V", "name", "", "result", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Result;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String name;
        public Result result;

        @Override // com.squareup.wire.Message.Builder
        public ActivitySearchAggregationResult build() {
            return new ActivitySearchAggregationResult(this.name, this.result, buildUnknownFields());
        }

        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        public final Builder result(Result result) {
            this.result = result;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Result;", "", "BucketResult", "RangeResult", "MetricResult", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Result$BucketResult;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Result$MetricResult;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Result$RangeResult;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Result {

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.BucketAggregationResult#ADAPTER", declaredName = "bucket_result", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Result$BucketResult;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Result;", "Lcom/squareup/protos/cash/activity/api/v1/BucketAggregationResult;", "value", "Lcom/squareup/protos/cash/activity/api/v1/BucketAggregationResult;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/BucketAggregationResult;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class BucketResult extends Result {
            private final BucketAggregationResult value;

            public BucketResult(BucketAggregationResult bucketAggregationResult) {
                bucketAggregationResult.getClass();
                this.value = bucketAggregationResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BucketResult) && Intrinsics.areEqual(this.value, ((BucketResult) obj).value);
            }

            public final BucketAggregationResult getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BucketResult(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.MetricAggregationResult#ADAPTER", declaredName = "metric_result", tag = 4)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Result$MetricResult;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Result;", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregationResult;", "value", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregationResult;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/MetricAggregationResult;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MetricResult extends Result {
            private final MetricAggregationResult value;

            public MetricResult(MetricAggregationResult metricAggregationResult) {
                metricAggregationResult.getClass();
                this.value = metricAggregationResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MetricResult) && Intrinsics.areEqual(this.value, ((MetricResult) obj).value);
            }

            public final MetricAggregationResult getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "MetricResult(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.RangeAggregationResult#ADAPTER", declaredName = "range_result", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Result$RangeResult;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult$Result;", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregationResult;", "value", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregationResult;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/RangeAggregationResult;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RangeResult extends Result {
            private final RangeAggregationResult value;

            public RangeResult(RangeAggregationResult rangeAggregationResult) {
                rangeAggregationResult.getClass();
                this.value = rangeAggregationResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RangeResult) && Intrinsics.areEqual(this.value, ((RangeResult) obj).value);
            }

            public final RangeAggregationResult getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "RangeResult(value=" + this.value + ")";
            }
        }
    }

    static {
        ActivitySearchAggregationResult$Companion$ADAPTER$1 activitySearchAggregationResult$Companion$ADAPTER$1 = new ActivitySearchAggregationResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivitySearchAggregationResult.class), "type.googleapis.com/squareup.cash.activity.api.v1.ActivitySearchAggregationResult", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = activitySearchAggregationResult$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activitySearchAggregationResult$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySearchAggregationResult(String str, Result result, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = str;
        this.result = result;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivitySearchAggregationResult)) {
            return false;
        }
        ActivitySearchAggregationResult activitySearchAggregationResult = (ActivitySearchAggregationResult) obj;
        return Intrinsics.areEqual(unknownFields(), activitySearchAggregationResult.unknownFields()) && Intrinsics.areEqual(this.name, activitySearchAggregationResult.name) && Intrinsics.areEqual(this.result, activitySearchAggregationResult.result);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Result result = this.result;
        int hashCode3 = hashCode2 + (result != null ? result.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.result = this.result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        Result result = this.result;
        if (result != null) {
            arrayList.add("result=" + result);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySearchAggregationResult{", "}", 0, null, null, 56);
    }
}
