package io.opentelemetry.sdk.metrics.internal.data;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.metrics.data.LongExemplarData;
import io.opentelemetry.sdk.metrics.data.LongPointData;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public class MutableLongPointData implements LongPointData {
    private long epochNanos;
    private long startEpochNanos;
    private long value;
    private Attributes attributes = Attributes.empty();
    private List<LongExemplarData> exemplars = Collections.emptyList();

    @Override // io.opentelemetry.sdk.metrics.data.LongPointData
    public long getValue() {
        return this.value;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public long getStartEpochNanos() {
        return this.startEpochNanos;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public long getEpochNanos() {
        return this.epochNanos;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public Attributes getAttributes() {
        return this.attributes;
    }

    @Override // io.opentelemetry.sdk.metrics.data.LongPointData, io.opentelemetry.sdk.metrics.data.PointData
    public List<LongExemplarData> getExemplars() {
        return this.exemplars;
    }

    public void set(LongPointData longPointData) {
        set(longPointData.getStartEpochNanos(), longPointData.getEpochNanos(), longPointData.getAttributes(), longPointData.getValue(), longPointData.getExemplars());
    }

    public void set(long j, long j2, Attributes attributes, long j3) {
        set(j, j2, attributes, j3, Collections.emptyList());
    }

    public void set(long j, long j2, Attributes attributes, long j3, List<LongExemplarData> list) {
        this.startEpochNanos = j;
        this.epochNanos = j2;
        this.attributes = attributes;
        this.value = j3;
        this.exemplars = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongPointData)) {
            return false;
        }
        LongPointData longPointData = (LongPointData) obj;
        return this.value == longPointData.getValue() && this.startEpochNanos == longPointData.getStartEpochNanos() && this.epochNanos == longPointData.getEpochNanos() && Objects.equals(this.attributes, longPointData.getAttributes()) && Objects.equals(this.exemplars, longPointData.getExemplars());
    }

    public int hashCode() {
        long j = this.startEpochNanos;
        long j2 = this.epochNanos;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.attributes.hashCode()) * 1000003;
        long j3 = this.value;
        return ((hashCode ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.exemplars.hashCode();
    }

    public String toString() {
        return "MutableLongPointData{value=" + this.value + ", startEpochNanos=" + this.startEpochNanos + ", epochNanos=" + this.epochNanos + ", attributes=" + this.attributes + ", exemplars=" + this.exemplars + AbstractJsonLexerKt.END_OBJ;
    }
}
