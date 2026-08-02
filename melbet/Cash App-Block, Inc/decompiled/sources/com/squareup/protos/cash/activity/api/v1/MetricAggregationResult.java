package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/MetricAggregationResult;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregationResult$Builder;", "", "value", "Ljava/lang/Double;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MetricAggregationResult extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MetricAggregationResult> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 0, tag = 1)
    public final Double value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/MetricAggregationResult$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregationResult;", "<init>", "()V", "value", "", "Ljava/lang/Double;", "(Ljava/lang/Double;)Lcom/squareup/protos/cash/activity/api/v1/MetricAggregationResult$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Double value;

        @Override // com.squareup.wire.Message.Builder
        public MetricAggregationResult build() {
            return new MetricAggregationResult(this.value, buildUnknownFields());
        }

        public final Builder value(Double value) {
            this.value = value;
            return this;
        }
    }

    static {
        MetricAggregationResult$Companion$ADAPTER$1 metricAggregationResult$Companion$ADAPTER$1 = new MetricAggregationResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MetricAggregationResult.class), "type.googleapis.com/squareup.cash.activity.api.v1.MetricAggregationResult", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = metricAggregationResult$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(metricAggregationResult$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricAggregationResult(Double d, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.value = d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MetricAggregationResult)) {
            return false;
        }
        MetricAggregationResult metricAggregationResult = (MetricAggregationResult) obj;
        return Intrinsics.areEqual(unknownFields(), metricAggregationResult.unknownFields()) && Intrinsics.areEqual(this.value, metricAggregationResult.value);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Double d = this.value;
        int hashCode2 = hashCode + (d != null ? Double.hashCode(d.doubleValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.value = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Double d = this.value;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("value=", d, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MetricAggregationResult{", "}", 0, null, null, 56);
    }
}
