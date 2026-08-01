package io.ktor.utils.io.bits;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.io.core.internal.NumbersKt;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrimitiveArraysJvm.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0017\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\f\u001a;\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0011\u001a;\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00132\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00132\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0016\u001a;\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00182\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a;\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00182\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001b\u001a;\u0010\u001c\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001d2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a;\u0010\u001c\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u001d2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010 \u001a;\u0010!\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\n\u001a;\u0010!\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\f\u001a;\u0010%\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0010\u001a;\u0010%\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0011\u001a;\u0010'\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0015\u001a;\u0010'\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0016\u001a;\u0010)\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010\u001a\u001a;\u0010)\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010\u001b\u001a;\u0010+\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001d2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010\u001f\u001a;\u0010+\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u001d2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010 \u001a\u0015\u0010-\u001a\u00020.*\u00020.2\u0006\u0010\u0003\u001a\u00020\u0004H\u0082\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"loadDoubleArray", "", "Lio/ktor/utils/io/bits/Memory;", TypedValues.CycleType.S_WAVE_OFFSET, "", FirebaseAnalytics.Param.DESTINATION, "", "destinationOffset", "count", "loadDoubleArray-9zorpBc", "(Ljava/nio/ByteBuffer;I[DII)V", "", "(Ljava/nio/ByteBuffer;J[DII)V", "loadFloatArray", "", "loadFloatArray-9zorpBc", "(Ljava/nio/ByteBuffer;I[FII)V", "(Ljava/nio/ByteBuffer;J[FII)V", "loadIntArray", "", "loadIntArray-9zorpBc", "(Ljava/nio/ByteBuffer;I[III)V", "(Ljava/nio/ByteBuffer;J[III)V", "loadLongArray", "", "loadLongArray-9zorpBc", "(Ljava/nio/ByteBuffer;I[JII)V", "(Ljava/nio/ByteBuffer;J[JII)V", "loadShortArray", "", "loadShortArray-9zorpBc", "(Ljava/nio/ByteBuffer;I[SII)V", "(Ljava/nio/ByteBuffer;J[SII)V", "storeDoubleArray", FirebaseAnalytics.Param.SOURCE, "sourceOffset", "storeDoubleArray-9zorpBc", "storeFloatArray", "storeFloatArray-9zorpBc", "storeIntArray", "storeIntArray-9zorpBc", "storeLongArray", "storeLongArray-9zorpBc", "storeShortArray", "storeShortArray-9zorpBc", "withOffset", "Ljava/nio/ByteBuffer;", "ktor-io"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PrimitiveArraysJvmKt {
    /* renamed from: loadShortArray-9zorpBc, reason: not valid java name */
    public static final void m437loadShortArray9zorpBc(ByteBuffer loadShortArray, long j, short[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadShortArray, "$this$loadShortArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (j < 2147483647L) {
            m436loadShortArray9zorpBc(loadShortArray, (int) j, destination, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadIntArray-9zorpBc, reason: not valid java name */
    public static final void m429loadIntArray9zorpBc(ByteBuffer loadIntArray, long j, int[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadIntArray, "$this$loadIntArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (j < 2147483647L) {
            m428loadIntArray9zorpBc(loadIntArray, (int) j, destination, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadShortArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m438loadShortArray9zorpBc$default(ByteBuffer byteBuffer, int i, short[] sArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sArr.length - i2;
        }
        m436loadShortArray9zorpBc(byteBuffer, i, sArr, i2, i3);
    }

    /* renamed from: loadLongArray-9zorpBc, reason: not valid java name */
    public static final void m433loadLongArray9zorpBc(ByteBuffer loadLongArray, long j, long[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadLongArray, "$this$loadLongArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (j < 2147483647L) {
            m432loadLongArray9zorpBc(loadLongArray, (int) j, destination, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadShortArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m439loadShortArray9zorpBc$default(ByteBuffer byteBuffer, long j, short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = sArr.length - i4;
        }
        m437loadShortArray9zorpBc(byteBuffer, j, sArr, i4, i2);
    }

    /* renamed from: loadFloatArray-9zorpBc, reason: not valid java name */
    public static final void m425loadFloatArray9zorpBc(ByteBuffer loadFloatArray, long j, float[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadFloatArray, "$this$loadFloatArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (j < 2147483647L) {
            m424loadFloatArray9zorpBc(loadFloatArray, (int) j, destination, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadIntArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m430loadIntArray9zorpBc$default(ByteBuffer byteBuffer, int i, int[] iArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length - i2;
        }
        m428loadIntArray9zorpBc(byteBuffer, i, iArr, i2, i3);
    }

    /* renamed from: loadDoubleArray-9zorpBc, reason: not valid java name */
    public static final void m421loadDoubleArray9zorpBc(ByteBuffer loadDoubleArray, long j, double[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadDoubleArray, "$this$loadDoubleArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (j < 2147483647L) {
            m420loadDoubleArray9zorpBc(loadDoubleArray, (int) j, destination, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadIntArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m431loadIntArray9zorpBc$default(ByteBuffer byteBuffer, long j, int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = iArr.length - i4;
        }
        m429loadIntArray9zorpBc(byteBuffer, j, iArr, i4, i2);
    }

    /* renamed from: storeShortArray-9zorpBc, reason: not valid java name */
    public static final void m457storeShortArray9zorpBc(ByteBuffer storeShortArray, long j, short[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeShortArray, "$this$storeShortArray");
        Intrinsics.checkNotNullParameter(source, "source");
        if (j < 2147483647L) {
            m456storeShortArray9zorpBc(storeShortArray, (int) j, source, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadLongArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m434loadLongArray9zorpBc$default(ByteBuffer byteBuffer, int i, long[] jArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length - i2;
        }
        m432loadLongArray9zorpBc(byteBuffer, i, jArr, i2, i3);
    }

    /* renamed from: storeIntArray-9zorpBc, reason: not valid java name */
    public static final void m449storeIntArray9zorpBc(ByteBuffer storeIntArray, long j, int[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeIntArray, "$this$storeIntArray");
        Intrinsics.checkNotNullParameter(source, "source");
        if (j < 2147483647L) {
            m448storeIntArray9zorpBc(storeIntArray, (int) j, source, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadLongArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m435loadLongArray9zorpBc$default(ByteBuffer byteBuffer, long j, long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = jArr.length - i4;
        }
        m433loadLongArray9zorpBc(byteBuffer, j, jArr, i4, i2);
    }

    /* renamed from: storeLongArray-9zorpBc, reason: not valid java name */
    public static final void m453storeLongArray9zorpBc(ByteBuffer storeLongArray, long j, long[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeLongArray, "$this$storeLongArray");
        Intrinsics.checkNotNullParameter(source, "source");
        if (j < 2147483647L) {
            m452storeLongArray9zorpBc(storeLongArray, (int) j, source, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: storeFloatArray-9zorpBc, reason: not valid java name */
    public static final void m445storeFloatArray9zorpBc(ByteBuffer storeFloatArray, long j, float[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeFloatArray, "$this$storeFloatArray");
        Intrinsics.checkNotNullParameter(source, "source");
        if (j < 2147483647L) {
            m444storeFloatArray9zorpBc(storeFloatArray, (int) j, source, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadFloatArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m426loadFloatArray9zorpBc$default(ByteBuffer byteBuffer, int i, float[] fArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length - i2;
        }
        m424loadFloatArray9zorpBc(byteBuffer, i, fArr, i2, i3);
    }

    /* renamed from: loadFloatArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m427loadFloatArray9zorpBc$default(ByteBuffer byteBuffer, long j, float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = fArr.length - i4;
        }
        m425loadFloatArray9zorpBc(byteBuffer, j, fArr, i4, i2);
    }

    /* renamed from: storeDoubleArray-9zorpBc, reason: not valid java name */
    public static final void m441storeDoubleArray9zorpBc(ByteBuffer storeDoubleArray, long j, double[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeDoubleArray, "$this$storeDoubleArray");
        Intrinsics.checkNotNullParameter(source, "source");
        if (j < 2147483647L) {
            m440storeDoubleArray9zorpBc(storeDoubleArray, (int) j, source, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadDoubleArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m422loadDoubleArray9zorpBc$default(ByteBuffer byteBuffer, int i, double[] dArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = dArr.length - i2;
        }
        m420loadDoubleArray9zorpBc(byteBuffer, i, dArr, i2, i3);
    }

    private static final ByteBuffer withOffset(ByteBuffer byteBuffer, int i) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        Intrinsics.checkNotNull(duplicate);
        duplicate.position(i);
        return duplicate;
    }

    /* renamed from: loadDoubleArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m423loadDoubleArray9zorpBc$default(ByteBuffer byteBuffer, long j, double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = dArr.length - i4;
        }
        m421loadDoubleArray9zorpBc(byteBuffer, j, dArr, i4, i2);
    }

    /* renamed from: storeDoubleArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m442storeDoubleArray9zorpBc$default(ByteBuffer byteBuffer, int i, double[] dArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = dArr.length - i2;
        }
        m440storeDoubleArray9zorpBc(byteBuffer, i, dArr, i2, i3);
    }

    /* renamed from: storeDoubleArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m443storeDoubleArray9zorpBc$default(ByteBuffer byteBuffer, long j, double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = dArr.length - i4;
        }
        m441storeDoubleArray9zorpBc(byteBuffer, j, dArr, i4, i2);
    }

    /* renamed from: storeFloatArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m446storeFloatArray9zorpBc$default(ByteBuffer byteBuffer, int i, float[] fArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length - i2;
        }
        m444storeFloatArray9zorpBc(byteBuffer, i, fArr, i2, i3);
    }

    /* renamed from: storeFloatArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m447storeFloatArray9zorpBc$default(ByteBuffer byteBuffer, long j, float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = fArr.length - i4;
        }
        m445storeFloatArray9zorpBc(byteBuffer, j, fArr, i4, i2);
    }

    /* renamed from: storeIntArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m450storeIntArray9zorpBc$default(ByteBuffer byteBuffer, int i, int[] iArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length - i2;
        }
        m448storeIntArray9zorpBc(byteBuffer, i, iArr, i2, i3);
    }

    /* renamed from: storeIntArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m451storeIntArray9zorpBc$default(ByteBuffer byteBuffer, long j, int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = iArr.length - i4;
        }
        m449storeIntArray9zorpBc(byteBuffer, j, iArr, i4, i2);
    }

    /* renamed from: storeLongArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m454storeLongArray9zorpBc$default(ByteBuffer byteBuffer, int i, long[] jArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length - i2;
        }
        m452storeLongArray9zorpBc(byteBuffer, i, jArr, i2, i3);
    }

    /* renamed from: storeLongArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m455storeLongArray9zorpBc$default(ByteBuffer byteBuffer, long j, long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = jArr.length - i4;
        }
        m453storeLongArray9zorpBc(byteBuffer, j, jArr, i4, i2);
    }

    /* renamed from: storeShortArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m458storeShortArray9zorpBc$default(ByteBuffer byteBuffer, int i, short[] sArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sArr.length - i2;
        }
        m456storeShortArray9zorpBc(byteBuffer, i, sArr, i2, i3);
    }

    /* renamed from: storeShortArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m459storeShortArray9zorpBc$default(ByteBuffer byteBuffer, long j, short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = sArr.length - i4;
        }
        m457storeShortArray9zorpBc(byteBuffer, j, sArr, i4, i2);
    }

    /* renamed from: loadShortArray-9zorpBc, reason: not valid java name */
    public static final void m436loadShortArray9zorpBc(ByteBuffer loadShortArray, int i, short[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadShortArray, "$this$loadShortArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ByteBuffer duplicate = loadShortArray.duplicate();
        Intrinsics.checkNotNull(duplicate);
        duplicate.position(i);
        duplicate.asShortBuffer().get(destination, i2, i3);
    }

    /* renamed from: loadIntArray-9zorpBc, reason: not valid java name */
    public static final void m428loadIntArray9zorpBc(ByteBuffer loadIntArray, int i, int[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadIntArray, "$this$loadIntArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ByteBuffer duplicate = loadIntArray.duplicate();
        Intrinsics.checkNotNull(duplicate);
        duplicate.position(i);
        duplicate.asIntBuffer().get(destination, i2, i3);
    }

    /* renamed from: loadLongArray-9zorpBc, reason: not valid java name */
    public static final void m432loadLongArray9zorpBc(ByteBuffer loadLongArray, int i, long[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadLongArray, "$this$loadLongArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ByteBuffer duplicate = loadLongArray.duplicate();
        Intrinsics.checkNotNull(duplicate);
        duplicate.position(i);
        duplicate.asLongBuffer().get(destination, i2, i3);
    }

    /* renamed from: loadFloatArray-9zorpBc, reason: not valid java name */
    public static final void m424loadFloatArray9zorpBc(ByteBuffer loadFloatArray, int i, float[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadFloatArray, "$this$loadFloatArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ByteBuffer duplicate = loadFloatArray.duplicate();
        Intrinsics.checkNotNull(duplicate);
        duplicate.position(i);
        duplicate.asFloatBuffer().get(destination, i2, i3);
    }

    /* renamed from: loadDoubleArray-9zorpBc, reason: not valid java name */
    public static final void m420loadDoubleArray9zorpBc(ByteBuffer loadDoubleArray, int i, double[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadDoubleArray, "$this$loadDoubleArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ByteBuffer duplicate = loadDoubleArray.duplicate();
        Intrinsics.checkNotNull(duplicate);
        duplicate.position(i);
        duplicate.asDoubleBuffer().get(destination, i2, i3);
    }

    /* renamed from: storeShortArray-9zorpBc, reason: not valid java name */
    public static final void m456storeShortArray9zorpBc(ByteBuffer storeShortArray, int i, short[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeShortArray, "$this$storeShortArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer duplicate = storeShortArray.duplicate();
        Intrinsics.checkNotNull(duplicate);
        duplicate.position(i);
        duplicate.asShortBuffer().put(source, i2, i3);
    }

    /* renamed from: storeIntArray-9zorpBc, reason: not valid java name */
    public static final void m448storeIntArray9zorpBc(ByteBuffer storeIntArray, int i, int[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeIntArray, "$this$storeIntArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer duplicate = storeIntArray.duplicate();
        Intrinsics.checkNotNull(duplicate);
        duplicate.position(i);
        duplicate.asIntBuffer().put(source, i2, i3);
    }

    /* renamed from: storeLongArray-9zorpBc, reason: not valid java name */
    public static final void m452storeLongArray9zorpBc(ByteBuffer storeLongArray, int i, long[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeLongArray, "$this$storeLongArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer duplicate = storeLongArray.duplicate();
        Intrinsics.checkNotNull(duplicate);
        duplicate.position(i);
        duplicate.asLongBuffer().put(source, i2, i3);
    }

    /* renamed from: storeFloatArray-9zorpBc, reason: not valid java name */
    public static final void m444storeFloatArray9zorpBc(ByteBuffer storeFloatArray, int i, float[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeFloatArray, "$this$storeFloatArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer duplicate = storeFloatArray.duplicate();
        Intrinsics.checkNotNull(duplicate);
        duplicate.position(i);
        duplicate.asFloatBuffer().put(source, i2, i3);
    }

    /* renamed from: storeDoubleArray-9zorpBc, reason: not valid java name */
    public static final void m440storeDoubleArray9zorpBc(ByteBuffer storeDoubleArray, int i, double[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeDoubleArray, "$this$storeDoubleArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer duplicate = storeDoubleArray.duplicate();
        Intrinsics.checkNotNull(duplicate);
        duplicate.position(i);
        duplicate.asDoubleBuffer().put(source, i2, i3);
    }
}
