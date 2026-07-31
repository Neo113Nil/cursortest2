package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aJ\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H,0\u0001\"\u0004\b\u0000\u0010+\"\b\b\u0001\u0010,*\u00020-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H,0/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H+0/\u001a \u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\bH\u0000\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00178Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0001*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001b\"$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u001c8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001d\"$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u001e8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001f\"$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020 8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010!\"$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\"8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010#\"$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u0001*\u00020$8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010%\"!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020&8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010'\"!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0001*\u00020(8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"DpOffsetToVector", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "DpToVector", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/animation/core/AnimationVector1D;", "FloatToVector", "", "IntOffsetToVector", "Landroidx/compose/ui/unit/IntOffset;", "IntSizeToVector", "Landroidx/compose/ui/unit/IntSize;", "IntToVector", "", "OffsetToVector", "Landroidx/compose/ui/geometry/Offset;", "RectToVector", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "SizeToVector", "Landroidx/compose/ui/geometry/Size;", "VectorConverter", "Landroidx/compose/ui/geometry/Offset$Companion;", "getVectorConverter", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Size$Companion;", "(Landroidx/compose/ui/geometry/Size$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/Dp$Companion;", "(Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/DpOffset$Companion;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "(Landroidx/compose/ui/unit/IntOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntSize$Companion;", "(Landroidx/compose/ui/unit/IntSize$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Lkotlin/Float$Companion;", "(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;", "Lkotlin/Int$Companion;", "(Lkotlin/jvm/internal/IntCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;", "TwoWayConverter", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "convertToVector", "Lkotlin/Function1;", "convertFromVector", "lerp", "start", "stop", "fraction", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VectorConvertersKt {
    private static final TwoWayConverter FloatToVector = TwoWayConverter(new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$1
        @NotNull
        public final AnimationVector1D invoke(float f) {
            return new AnimationVector1D(f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }
    }, new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$2
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Float invoke(@NotNull AnimationVector1D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.getValue());
        }
    });
    private static final TwoWayConverter IntToVector = TwoWayConverter(new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$1
        @NotNull
        public final AnimationVector1D invoke(int i) {
            return new AnimationVector1D(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }, new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$2
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Integer invoke(@NotNull AnimationVector1D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf((int) it.getValue());
        }
    });
    private static final TwoWayConverter DpToVector = TwoWayConverter(new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m135invoke0680j_4(((Dp) obj).getValue());
        }

        @NotNull
        /* renamed from: invoke-0680j_4, reason: not valid java name */
        public final AnimationVector1D m135invoke0680j_4(float f) {
            return new AnimationVector1D(f);
        }
    }, new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Dp.m2505boximpl(m136invokeu2uoSUM((AnimationVector1D) obj));
        }

        /* renamed from: invoke-u2uoSUM, reason: not valid java name */
        public final float m136invokeu2uoSUM(@NotNull AnimationVector1D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Dp.m2507constructorimpl(it.getValue());
        }
    });
    private static final TwoWayConverter DpOffsetToVector = TwoWayConverter(new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m133invokejoFl9I(((DpOffset) obj).getPackedValue());
        }

        @NotNull
        /* renamed from: invoke-jo-Fl9I, reason: not valid java name */
        public final AnimationVector2D m133invokejoFl9I(long j) {
            return new AnimationVector2D(DpOffset.m2522getXD9Ej5fM(j), DpOffset.m2523getYD9Ej5fM(j));
        }
    }, new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return DpOffset.m2518boximpl(m134invokegVRvYmI((AnimationVector2D) obj));
        }

        /* renamed from: invoke-gVRvYmI, reason: not valid java name */
        public final long m134invokegVRvYmI(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DpKt.m2516DpOffsetYgX7TsA(Dp.m2507constructorimpl(it.getV1()), Dp.m2507constructorimpl(it.getV2()));
        }
    });
    private static final TwoWayConverter SizeToVector = TwoWayConverter(new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m143invokeuvyYCjk(((Size) obj).getPackedValue());
        }

        @NotNull
        /* renamed from: invoke-uvyYCjk, reason: not valid java name */
        public final AnimationVector2D m143invokeuvyYCjk(long j) {
            return new AnimationVector2D(Size.m1335getWidthimpl(j), Size.m1333getHeightimpl(j));
        }
    }, new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Size.m1329boximpl(m144invoke7Ah8Wj8((AnimationVector2D) obj));
        }

        /* renamed from: invoke-7Ah8Wj8, reason: not valid java name */
        public final long m144invoke7Ah8Wj8(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SizeKt.Size(it.getV1(), it.getV2());
        }
    });
    private static final TwoWayConverter OffsetToVector = TwoWayConverter(new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m141invokek4lQ0M(((Offset) obj).getPackedValue());
        }

        @NotNull
        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final AnimationVector2D m141invokek4lQ0M(long j) {
            return new AnimationVector2D(Offset.m1297getXimpl(j), Offset.m1298getYimpl(j));
        }
    }, new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Offset.m1288boximpl(m142invoketuRUvjQ((AnimationVector2D) obj));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m142invoketuRUvjQ(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return OffsetKt.Offset(it.getV1(), it.getV2());
        }
    });
    private static final TwoWayConverter IntOffsetToVector = TwoWayConverter(new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m137invokegyyYBs(((IntOffset) obj).getPackedValue());
        }

        @NotNull
        /* renamed from: invoke--gyyYBs, reason: not valid java name */
        public final AnimationVector2D m137invokegyyYBs(long j) {
            return new AnimationVector2D(IntOffset.m2553getXimpl(j), IntOffset.m2554getYimpl(j));
        }
    }, new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return IntOffset.m2545boximpl(m138invokeBjo55l4((AnimationVector2D) obj));
        }

        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m138invokeBjo55l4(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return IntOffsetKt.IntOffset(MathKt.roundToInt(it.getV1()), MathKt.roundToInt(it.getV2()));
        }
    });
    private static final TwoWayConverter IntSizeToVector = TwoWayConverter(new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m139invokeozmzZPI(((IntSize) obj).getPackedValue());
        }

        @NotNull
        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
        public final AnimationVector2D m139invokeozmzZPI(long j) {
            return new AnimationVector2D(IntSize.m2567getWidthimpl(j), IntSize.m2566getHeightimpl(j));
        }
    }, new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return IntSize.m2562boximpl(m140invokeYEO4UFw((AnimationVector2D) obj));
        }

        /* renamed from: invoke-YEO4UFw, reason: not valid java name */
        public final long m140invokeYEO4UFw(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return IntSizeKt.IntSize(MathKt.roundToInt(it.getV1()), MathKt.roundToInt(it.getV2()));
        }
    });
    private static final TwoWayConverter RectToVector = TwoWayConverter(new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final AnimationVector4D invoke(@NotNull Rect it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new AnimationVector4D(it.getLeft(), it.getTop(), it.getRight(), it.getBottom());
        }
    }, new Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$2
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Rect invoke(@NotNull AnimationVector4D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Rect(it.getV1(), it.getV2(), it.getV3(), it.getV4());
        }
    });

    public static final float lerp(float f, float f2, float f3) {
        return (f * (1 - f3)) + (f2 * f3);
    }

    public static final TwoWayConverter TwoWayConverter(Function1 convertToVector, Function1 convertFromVector) {
        Intrinsics.checkNotNullParameter(convertToVector, "convertToVector");
        Intrinsics.checkNotNullParameter(convertFromVector, "convertFromVector");
        return new TwoWayConverterImpl(convertToVector, convertFromVector);
    }

    public static final TwoWayConverter getVectorConverter(FloatCompanionObject floatCompanionObject) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return FloatToVector;
    }

    public static final TwoWayConverter getVectorConverter(IntCompanionObject intCompanionObject) {
        Intrinsics.checkNotNullParameter(intCompanionObject, "<this>");
        return IntToVector;
    }

    public static final TwoWayConverter getVectorConverter(Rect.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return RectToVector;
    }

    public static final TwoWayConverter getVectorConverter(Dp.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return DpToVector;
    }

    public static final TwoWayConverter getVectorConverter(DpOffset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return DpOffsetToVector;
    }

    public static final TwoWayConverter getVectorConverter(Size.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return SizeToVector;
    }

    public static final TwoWayConverter getVectorConverter(Offset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return OffsetToVector;
    }

    public static final TwoWayConverter getVectorConverter(IntOffset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return IntOffsetToVector;
    }

    public static final TwoWayConverter getVectorConverter(IntSize.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return IntSizeToVector;
    }
}
