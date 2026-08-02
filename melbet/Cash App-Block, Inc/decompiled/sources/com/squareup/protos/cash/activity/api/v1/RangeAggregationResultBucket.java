package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/RangeAggregationResultBucket;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregationResultBucket$Builder;", "", "key", "Ljava/lang/String;", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregationRange;", "range", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregationRange;", "", "count", "Ljava/lang/Long;", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult;", "sub_aggregation_results", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RangeAggregationResultBucket extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RangeAggregationResultBucket> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 2, tag = 3)
    public final Long count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String key;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.RangeAggregationRange#ADAPTER", schemaIndex = 1, tag = 2)
    public final RangeAggregationRange range;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivitySearchAggregationResult#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<ActivitySearchAggregationResult> sub_aggregation_results;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000fJ\u0014\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/RangeAggregationResultBucket$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregationResultBucket;", "<init>", "()V", "key", "", "range", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregationRange;", "count", "", "Ljava/lang/Long;", "sub_aggregation_results", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchAggregationResult;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/activity/api/v1/RangeAggregationResultBucket$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Long count;
        public String key;
        public RangeAggregationRange range;
        public List<ActivitySearchAggregationResult> sub_aggregation_results = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public RangeAggregationResultBucket build() {
            return new RangeAggregationResultBucket(this.key, this.range, this.count, this.sub_aggregation_results, buildUnknownFields());
        }

        public final Builder count(Long count) {
            this.count = count;
            return this;
        }

        public final Builder key(String key) {
            this.key = key;
            return this;
        }

        public final Builder range(RangeAggregationRange range) {
            this.range = range;
            return this;
        }

        public final Builder sub_aggregation_results(List<ActivitySearchAggregationResult> sub_aggregation_results) {
            sub_aggregation_results.getClass();
            TransactorKt.checkElementsNotNull(sub_aggregation_results);
            this.sub_aggregation_results = sub_aggregation_results;
            return this;
        }
    }

    static {
        RangeAggregationResultBucket$Companion$ADAPTER$1 rangeAggregationResultBucket$Companion$ADAPTER$1 = new RangeAggregationResultBucket$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RangeAggregationResultBucket.class), "type.googleapis.com/squareup.cash.activity.api.v1.RangeAggregationResultBucket", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = rangeAggregationResultBucket$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(rangeAggregationResultBucket$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeAggregationResultBucket(String str, RangeAggregationRange rangeAggregationRange, Long l, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.key = str;
        this.range = rangeAggregationRange;
        this.count = l;
        this.sub_aggregation_results = TransactorKt.immutableCopyOf("sub_aggregation_results", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RangeAggregationResultBucket)) {
            return false;
        }
        RangeAggregationResultBucket rangeAggregationResultBucket = (RangeAggregationResultBucket) obj;
        return Intrinsics.areEqual(unknownFields(), rangeAggregationResultBucket.unknownFields()) && Intrinsics.areEqual(this.key, rangeAggregationResultBucket.key) && Intrinsics.areEqual(this.range, rangeAggregationResultBucket.range) && Intrinsics.areEqual(this.count, rangeAggregationResultBucket.count) && Intrinsics.areEqual(this.sub_aggregation_results, rangeAggregationResultBucket.sub_aggregation_results);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.key;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        RangeAggregationRange rangeAggregationRange = this.range;
        int hashCode3 = (hashCode2 + (rangeAggregationRange != null ? rangeAggregationRange.hashCode() : 0)) * 37;
        Long l = this.count;
        int hashCode4 = this.sub_aggregation_results.hashCode() + ((hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.key = this.key;
        builder.range = this.range;
        builder.count = this.count;
        builder.sub_aggregation_results = this.sub_aggregation_results;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "key=", arrayList);
        }
        RangeAggregationRange rangeAggregationRange = this.range;
        if (rangeAggregationRange != null) {
            arrayList.add("range=" + rangeAggregationRange);
        }
        Long l = this.count;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("count=", l, arrayList);
        }
        if (!this.sub_aggregation_results.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sub_aggregation_results=", arrayList, this.sub_aggregation_results);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RangeAggregationResultBucket{", "}", 0, null, null, 56);
    }
}
