package io.ktor.utils.io.bits;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrimiteArrays.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a>\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a>\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\f\u001a>\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\n\u001a>\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\f\u001a>\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a>\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0014\u001a>\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00162\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a>\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00162\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0019\u001a>\u0010\u001a\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001b2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a>\u0010\u001a\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u001b2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001e\u001a>\u0010\u001f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\n\u001a>\u0010\u001f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\f\u001a>\u0010#\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\n\u001a>\u0010#\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\f\u001a>\u0010%\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0013\u001a>\u0010%\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0014\u001a>\u0010'\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00162\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0018\u001a>\u0010'\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00162\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0019\u001a>\u0010)\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010\u001d\u001a>\u0010)\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"loadByteArray", "", "Lio/ktor/utils/io/bits/Memory;", TypedValues.CycleType.S_WAVE_OFFSET, "", FirebaseAnalytics.Param.DESTINATION, "", "destinationOffset", "count", "loadByteArray-9zorpBc", "(Ljava/nio/ByteBuffer;I[BII)V", "", "(Ljava/nio/ByteBuffer;J[BII)V", "loadUByteArray", "Lkotlin/UByteArray;", "loadUByteArray-KqtU1YU", "loadUIntArray", "Lkotlin/UIntArray;", "loadUIntArray-EM3dPTA", "(Ljava/nio/ByteBuffer;I[III)V", "(Ljava/nio/ByteBuffer;J[III)V", "loadULongArray", "Lkotlin/ULongArray;", "loadULongArray-bNlDJKc", "(Ljava/nio/ByteBuffer;I[JII)V", "(Ljava/nio/ByteBuffer;J[JII)V", "loadUShortArray", "Lkotlin/UShortArray;", "loadUShortArray-m8CCUi4", "(Ljava/nio/ByteBuffer;I[SII)V", "(Ljava/nio/ByteBuffer;J[SII)V", "storeByteArray", FirebaseAnalytics.Param.SOURCE, "sourceOffset", "storeByteArray-9zorpBc", "storeUByteArray", "storeUByteArray-KqtU1YU", "storeUIntArray", "storeUIntArray-EM3dPTA", "storeULongArray", "storeULongArray-bNlDJKc", "storeUShortArray", "storeUShortArray-m8CCUi4", "ktor-io"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PrimiteArraysKt {
    /* renamed from: loadByteArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m382loadByteArray9zorpBc$default(ByteBuffer loadByteArray, int i, byte[] destination, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = destination.length - i2;
        }
        Intrinsics.checkNotNullParameter(loadByteArray, "$this$loadByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m335copyTo9zorpBc(loadByteArray, destination, i, i3, i2);
    }

    /* renamed from: loadByteArray-9zorpBc, reason: not valid java name */
    public static final void m380loadByteArray9zorpBc(ByteBuffer loadByteArray, int i, byte[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadByteArray, "$this$loadByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m335copyTo9zorpBc(loadByteArray, destination, i, i3, i2);
    }

    /* renamed from: loadByteArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m383loadByteArray9zorpBc$default(ByteBuffer loadByteArray, long j, byte[] destination, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = destination.length - i4;
        }
        Intrinsics.checkNotNullParameter(loadByteArray, "$this$loadByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m336copyTo9zorpBc(loadByteArray, destination, j, i2, i4);
    }

    /* renamed from: loadByteArray-9zorpBc, reason: not valid java name */
    public static final void m381loadByteArray9zorpBc(ByteBuffer loadByteArray, long j, byte[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadByteArray, "$this$loadByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m336copyTo9zorpBc(loadByteArray, destination, j, i2, i);
    }

    /* renamed from: loadUByteArray-KqtU1YU$default, reason: not valid java name */
    public static /* synthetic */ void m386loadUByteArrayKqtU1YU$default(ByteBuffer loadUByteArray, int i, byte[] destination, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UByteArray.m670getSizeimpl(destination) - i2;
        }
        Intrinsics.checkNotNullParameter(loadUByteArray, "$this$loadUByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m335copyTo9zorpBc(loadUByteArray, destination, i, i3, i2);
    }

    /* renamed from: loadUByteArray-KqtU1YU, reason: not valid java name */
    public static final void m384loadUByteArrayKqtU1YU(ByteBuffer loadUByteArray, int i, byte[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadUByteArray, "$this$loadUByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m335copyTo9zorpBc(loadUByteArray, destination, i, i3, i2);
    }

    /* renamed from: loadUByteArray-KqtU1YU$default, reason: not valid java name */
    public static /* synthetic */ void m387loadUByteArrayKqtU1YU$default(ByteBuffer loadUByteArray, long j, byte[] destination, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = UByteArray.m670getSizeimpl(destination) - i4;
        }
        Intrinsics.checkNotNullParameter(loadUByteArray, "$this$loadUByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m336copyTo9zorpBc(loadUByteArray, destination, j, i2, i4);
    }

    /* renamed from: loadUByteArray-KqtU1YU, reason: not valid java name */
    public static final void m385loadUByteArrayKqtU1YU(ByteBuffer loadUByteArray, long j, byte[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadUByteArray, "$this$loadUByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m336copyTo9zorpBc(loadUByteArray, destination, j, i2, i);
    }

    /* renamed from: loadUShortArray-m8CCUi4$default, reason: not valid java name */
    public static /* synthetic */ void m398loadUShortArraym8CCUi4$default(ByteBuffer loadUShortArray, int i, short[] destination, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UShortArray.m933getSizeimpl(destination) - i2;
        }
        Intrinsics.checkNotNullParameter(loadUShortArray, "$this$loadUShortArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m436loadShortArray9zorpBc(loadUShortArray, i, destination, i2, i3);
    }

    /* renamed from: loadUShortArray-m8CCUi4, reason: not valid java name */
    public static final void m396loadUShortArraym8CCUi4(ByteBuffer loadUShortArray, int i, short[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadUShortArray, "$this$loadUShortArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m436loadShortArray9zorpBc(loadUShortArray, i, destination, i2, i3);
    }

    /* renamed from: loadUShortArray-m8CCUi4$default, reason: not valid java name */
    public static /* synthetic */ void m399loadUShortArraym8CCUi4$default(ByteBuffer loadUShortArray, long j, short[] destination, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = UShortArray.m933getSizeimpl(destination) - i4;
        }
        Intrinsics.checkNotNullParameter(loadUShortArray, "$this$loadUShortArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m437loadShortArray9zorpBc(loadUShortArray, j, destination, i4, i2);
    }

    /* renamed from: loadUShortArray-m8CCUi4, reason: not valid java name */
    public static final void m397loadUShortArraym8CCUi4(ByteBuffer loadUShortArray, long j, short[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadUShortArray, "$this$loadUShortArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m437loadShortArray9zorpBc(loadUShortArray, j, destination, i, i2);
    }

    /* renamed from: loadUIntArray-EM3dPTA$default, reason: not valid java name */
    public static /* synthetic */ void m390loadUIntArrayEM3dPTA$default(ByteBuffer loadUIntArray, int i, int[] destination, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UIntArray.m749getSizeimpl(destination) - i2;
        }
        Intrinsics.checkNotNullParameter(loadUIntArray, "$this$loadUIntArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m428loadIntArray9zorpBc(loadUIntArray, i, destination, i2, i3);
    }

    /* renamed from: loadUIntArray-EM3dPTA, reason: not valid java name */
    public static final void m388loadUIntArrayEM3dPTA(ByteBuffer loadUIntArray, int i, int[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadUIntArray, "$this$loadUIntArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m428loadIntArray9zorpBc(loadUIntArray, i, destination, i2, i3);
    }

    /* renamed from: loadUIntArray-EM3dPTA$default, reason: not valid java name */
    public static /* synthetic */ void m391loadUIntArrayEM3dPTA$default(ByteBuffer loadUIntArray, long j, int[] destination, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = UIntArray.m749getSizeimpl(destination) - i4;
        }
        Intrinsics.checkNotNullParameter(loadUIntArray, "$this$loadUIntArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m429loadIntArray9zorpBc(loadUIntArray, j, destination, i4, i2);
    }

    /* renamed from: loadUIntArray-EM3dPTA, reason: not valid java name */
    public static final void m389loadUIntArrayEM3dPTA(ByteBuffer loadUIntArray, long j, int[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadUIntArray, "$this$loadUIntArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m429loadIntArray9zorpBc(loadUIntArray, j, destination, i, i2);
    }

    /* renamed from: loadULongArray-bNlDJKc$default, reason: not valid java name */
    public static /* synthetic */ void m394loadULongArraybNlDJKc$default(ByteBuffer loadULongArray, int i, long[] destination, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = ULongArray.m828getSizeimpl(destination) - i2;
        }
        Intrinsics.checkNotNullParameter(loadULongArray, "$this$loadULongArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m432loadLongArray9zorpBc(loadULongArray, i, destination, i2, i3);
    }

    /* renamed from: loadULongArray-bNlDJKc, reason: not valid java name */
    public static final void m392loadULongArraybNlDJKc(ByteBuffer loadULongArray, int i, long[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadULongArray, "$this$loadULongArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m432loadLongArray9zorpBc(loadULongArray, i, destination, i2, i3);
    }

    /* renamed from: loadULongArray-bNlDJKc$default, reason: not valid java name */
    public static /* synthetic */ void m395loadULongArraybNlDJKc$default(ByteBuffer loadULongArray, long j, long[] destination, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = ULongArray.m828getSizeimpl(destination) - i4;
        }
        Intrinsics.checkNotNullParameter(loadULongArray, "$this$loadULongArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m433loadLongArray9zorpBc(loadULongArray, j, destination, i4, i2);
    }

    /* renamed from: loadULongArray-bNlDJKc, reason: not valid java name */
    public static final void m393loadULongArraybNlDJKc(ByteBuffer loadULongArray, long j, long[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadULongArray, "$this$loadULongArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m433loadLongArray9zorpBc(loadULongArray, j, destination, i, i2);
    }

    /* renamed from: storeByteArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m402storeByteArray9zorpBc$default(ByteBuffer storeByteArray, int i, byte[] source, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = source.length - i2;
        }
        Intrinsics.checkNotNullParameter(storeByteArray, "$this$storeByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer order = ByteBuffer.wrap(source, i2, i3).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(order, "order(...)");
        Memory.m317copyToJT6ljtQ(Memory.m316constructorimpl(order), storeByteArray, 0, i3, i);
    }

    /* renamed from: storeByteArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m403storeByteArray9zorpBc$default(ByteBuffer storeByteArray, long j, byte[] source, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = source.length - i;
        }
        Intrinsics.checkNotNullParameter(storeByteArray, "$this$storeByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer order = ByteBuffer.wrap(source, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(order, "order(...)");
        Memory.m318copyToJT6ljtQ(Memory.m316constructorimpl(order), storeByteArray, 0L, i2, j);
    }

    /* renamed from: storeUByteArray-KqtU1YU$default, reason: not valid java name */
    public static /* synthetic */ void m406storeUByteArrayKqtU1YU$default(ByteBuffer storeUByteArray, int i, byte[] source, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UByteArray.m670getSizeimpl(source) - i2;
        }
        Intrinsics.checkNotNullParameter(storeUByteArray, "$this$storeUByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer order = ByteBuffer.wrap(source, i2, i3).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(order, "order(...)");
        Memory.m317copyToJT6ljtQ(Memory.m316constructorimpl(order), storeUByteArray, 0, i3, i);
    }

    /* renamed from: storeUByteArray-KqtU1YU$default, reason: not valid java name */
    public static /* synthetic */ void m407storeUByteArrayKqtU1YU$default(ByteBuffer storeUByteArray, long j, byte[] source, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = UByteArray.m670getSizeimpl(source) - i;
        }
        Intrinsics.checkNotNullParameter(storeUByteArray, "$this$storeUByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer order = ByteBuffer.wrap(source, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(order, "order(...)");
        Memory.m318copyToJT6ljtQ(Memory.m316constructorimpl(order), storeUByteArray, 0L, i2, j);
    }

    /* renamed from: storeUShortArray-m8CCUi4$default, reason: not valid java name */
    public static /* synthetic */ void m418storeUShortArraym8CCUi4$default(ByteBuffer storeUShortArray, int i, short[] source, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UShortArray.m933getSizeimpl(source) - i2;
        }
        Intrinsics.checkNotNullParameter(storeUShortArray, "$this$storeUShortArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m456storeShortArray9zorpBc(storeUShortArray, i, source, i2, i3);
    }

    /* renamed from: storeUShortArray-m8CCUi4, reason: not valid java name */
    public static final void m416storeUShortArraym8CCUi4(ByteBuffer storeUShortArray, int i, short[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeUShortArray, "$this$storeUShortArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m456storeShortArray9zorpBc(storeUShortArray, i, source, i2, i3);
    }

    /* renamed from: storeUShortArray-m8CCUi4$default, reason: not valid java name */
    public static /* synthetic */ void m419storeUShortArraym8CCUi4$default(ByteBuffer storeUShortArray, long j, short[] source, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = UShortArray.m933getSizeimpl(source) - i4;
        }
        Intrinsics.checkNotNullParameter(storeUShortArray, "$this$storeUShortArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m457storeShortArray9zorpBc(storeUShortArray, j, source, i4, i2);
    }

    /* renamed from: storeUShortArray-m8CCUi4, reason: not valid java name */
    public static final void m417storeUShortArraym8CCUi4(ByteBuffer storeUShortArray, long j, short[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeUShortArray, "$this$storeUShortArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m457storeShortArray9zorpBc(storeUShortArray, j, source, i, i2);
    }

    /* renamed from: storeUIntArray-EM3dPTA$default, reason: not valid java name */
    public static /* synthetic */ void m410storeUIntArrayEM3dPTA$default(ByteBuffer storeUIntArray, int i, int[] source, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UIntArray.m749getSizeimpl(source) - i2;
        }
        Intrinsics.checkNotNullParameter(storeUIntArray, "$this$storeUIntArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m448storeIntArray9zorpBc(storeUIntArray, i, source, i2, i3);
    }

    /* renamed from: storeUIntArray-EM3dPTA, reason: not valid java name */
    public static final void m408storeUIntArrayEM3dPTA(ByteBuffer storeUIntArray, int i, int[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeUIntArray, "$this$storeUIntArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m448storeIntArray9zorpBc(storeUIntArray, i, source, i2, i3);
    }

    /* renamed from: storeUIntArray-EM3dPTA$default, reason: not valid java name */
    public static /* synthetic */ void m411storeUIntArrayEM3dPTA$default(ByteBuffer storeUIntArray, long j, int[] source, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = UIntArray.m749getSizeimpl(source) - i4;
        }
        Intrinsics.checkNotNullParameter(storeUIntArray, "$this$storeUIntArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m449storeIntArray9zorpBc(storeUIntArray, j, source, i4, i2);
    }

    /* renamed from: storeUIntArray-EM3dPTA, reason: not valid java name */
    public static final void m409storeUIntArrayEM3dPTA(ByteBuffer storeUIntArray, long j, int[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeUIntArray, "$this$storeUIntArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m449storeIntArray9zorpBc(storeUIntArray, j, source, i, i2);
    }

    /* renamed from: storeULongArray-bNlDJKc$default, reason: not valid java name */
    public static /* synthetic */ void m414storeULongArraybNlDJKc$default(ByteBuffer storeULongArray, int i, long[] source, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = ULongArray.m828getSizeimpl(source) - i2;
        }
        Intrinsics.checkNotNullParameter(storeULongArray, "$this$storeULongArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m452storeLongArray9zorpBc(storeULongArray, i, source, i2, i3);
    }

    /* renamed from: storeULongArray-bNlDJKc, reason: not valid java name */
    public static final void m412storeULongArraybNlDJKc(ByteBuffer storeULongArray, int i, long[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeULongArray, "$this$storeULongArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m452storeLongArray9zorpBc(storeULongArray, i, source, i2, i3);
    }

    /* renamed from: storeULongArray-bNlDJKc$default, reason: not valid java name */
    public static /* synthetic */ void m415storeULongArraybNlDJKc$default(ByteBuffer storeULongArray, long j, long[] source, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = ULongArray.m828getSizeimpl(source) - i4;
        }
        Intrinsics.checkNotNullParameter(storeULongArray, "$this$storeULongArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m453storeLongArray9zorpBc(storeULongArray, j, source, i4, i2);
    }

    /* renamed from: storeULongArray-bNlDJKc, reason: not valid java name */
    public static final void m413storeULongArraybNlDJKc(ByteBuffer storeULongArray, long j, long[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeULongArray, "$this$storeULongArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m453storeLongArray9zorpBc(storeULongArray, j, source, i, i2);
    }

    /* renamed from: storeByteArray-9zorpBc, reason: not valid java name */
    public static final void m400storeByteArray9zorpBc(ByteBuffer storeByteArray, int i, byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeByteArray, "$this$storeByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer order = ByteBuffer.wrap(source, i2, i3).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(order, "order(...)");
        Memory.m317copyToJT6ljtQ(Memory.m316constructorimpl(order), storeByteArray, 0, i3, i);
    }

    /* renamed from: storeByteArray-9zorpBc, reason: not valid java name */
    public static final void m401storeByteArray9zorpBc(ByteBuffer storeByteArray, long j, byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeByteArray, "$this$storeByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer order = ByteBuffer.wrap(source, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(order, "order(...)");
        Memory.m318copyToJT6ljtQ(Memory.m316constructorimpl(order), storeByteArray, 0L, i2, j);
    }

    /* renamed from: storeUByteArray-KqtU1YU, reason: not valid java name */
    public static final void m404storeUByteArrayKqtU1YU(ByteBuffer storeUByteArray, int i, byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeUByteArray, "$this$storeUByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer order = ByteBuffer.wrap(source, i2, i3).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(order, "order(...)");
        Memory.m317copyToJT6ljtQ(Memory.m316constructorimpl(order), storeUByteArray, 0, i3, i);
    }

    /* renamed from: storeUByteArray-KqtU1YU, reason: not valid java name */
    public static final void m405storeUByteArrayKqtU1YU(ByteBuffer storeUByteArray, long j, byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeUByteArray, "$this$storeUByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer order = ByteBuffer.wrap(source, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(order, "order(...)");
        Memory.m318copyToJT6ljtQ(Memory.m316constructorimpl(order), storeUByteArray, 0L, i2, j);
    }
}
