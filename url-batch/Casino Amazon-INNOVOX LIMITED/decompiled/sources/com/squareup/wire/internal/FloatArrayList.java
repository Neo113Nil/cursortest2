package com.squareup.wire.internal;

import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: FloatArrayList.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/wire/internal/FloatArrayList;", "", "initialCapacity", "", "<init>", "(I)V", "data", "", "size", "toArray", "add", "", TypedValues.Custom.S_FLOAT, "", "isNotEmpty", "", "ensureCapacity", "minCapacity", "toString", "", "Companion", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FloatArrayList {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private float[] data;
    private int size;

    public FloatArrayList(int i) {
        this.data = new float[i];
    }

    public final float[] toArray() {
        int i = this.size;
        float[] fArr = this.data;
        if (i < fArr.length) {
            float[] copyOf = Arrays.copyOf(fArr, i);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.data = copyOf;
        }
        return this.data;
    }

    public final void add(float r4) {
        ensureCapacity(this.size + 1);
        float[] fArr = this.data;
        int i = this.size;
        this.size = i + 1;
        fArr[i] = r4;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    private final void ensureCapacity(int minCapacity) {
        float[] fArr = this.data;
        if (minCapacity > fArr.length) {
            float[] copyOf = Arrays.copyOf(fArr, Math.max(((fArr.length * 3) / 2) + 1, minCapacity));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.data = copyOf;
        }
    }

    public String toString() {
        float[] copyOf = Arrays.copyOf(this.data, this.size);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        String arrays = Arrays.toString(copyOf);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        return arrays;
    }

    /* compiled from: FloatArrayList.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/squareup/wire/internal/FloatArrayList$Companion;", "", "<init>", "()V", "forDecoding", "Lcom/squareup/wire/internal/FloatArrayList;", "minLengthInBytes", "", "minimumElementByteSize", "", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FloatArrayList forDecoding(long minLengthInBytes, long minimumElementByteSize) {
            return new FloatArrayList((int) RangesKt.coerceAtMost(minLengthInBytes / minimumElementByteSize, SieveCacheKt.NodeLinkMask));
        }

        public final FloatArrayList forDecoding(int minLengthInBytes, int minimumElementByteSize) {
            return new FloatArrayList(minLengthInBytes / minimumElementByteSize);
        }
    }
}
