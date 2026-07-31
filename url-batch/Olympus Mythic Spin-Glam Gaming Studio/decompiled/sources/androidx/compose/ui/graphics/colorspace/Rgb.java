package androidx.compose.ui.graphics.colorspace;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Rgb.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\u0018\u0000 D2\u00020\u0001:\u0001DBu\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0017BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0019B!\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\"J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010.R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104R\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b5\u00104R\u001a\u00106\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R&\u00108\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b<\u0010;R&\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010;R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b?\u0010;R\u001a\u0010@\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b@\u0010BR\u001a\u0010C\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010A\u001a\u0004\bC\u0010B¨\u0006E"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "primaries", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "transform", "Lkotlin/Function1;", "", "oetf", "eotf", "", "min", "max", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "transferParameters", "", "id", "<init>", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "function", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "component", "getMinValue", "(I)F", "getMaxValue", "v", "toXyz", "([F)[F", "fromXyz", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "F", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "[F", "getPrimaries$ui_graphics_release", "()[F", "getTransform$ui_graphics_release", "inverseTransform", "getInverseTransform$ui_graphics_release", "oetfOrig", "Lkotlin/jvm/functions/Function1;", "getOetfOrig$ui_graphics_release", "()Lkotlin/jvm/functions/Function1;", "getOetf", "eotfOrig", "getEotfOrig$ui_graphics_release", "getEotf", "isWideGamut", "Z", "()Z", "isSrgb", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Rgb extends ColorSpace {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Function1 DoubleIdentity = new Function1() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$DoubleIdentity$1
        @NotNull
        public final Double invoke(double d) {
            return Double.valueOf(d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).doubleValue());
        }
    };
    private final Function1 eotf;
    private final Function1 eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    private final Function1 oetf;
    private final Function1 oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb(String name, float[] primaries, WhitePoint whitePoint, float[] fArr, Function1 oetf, Function1 eotf, float f, float f2, TransferParameters transferParameters, int i) {
        super(name, ColorModel.INSTANCE.m1643getRgbxdoWZVw(), i, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
        this.whitePoint = whitePoint;
        this.min = f;
        this.max = f2;
        this.transferParameters = transferParameters;
        this.oetfOrig = oetf;
        this.oetf = new Function1() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d) {
                float f3;
                float f4;
                double doubleValue = ((Number) Rgb.this.getOetfOrig().invoke(Double.valueOf(d))).doubleValue();
                f3 = Rgb.this.min;
                double d2 = f3;
                f4 = Rgb.this.max;
                return Double.valueOf(RangesKt.coerceIn(doubleValue, d2, f4));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        this.eotfOrig = eotf;
        this.eotf = new Function1() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d) {
                float f3;
                float f4;
                Function1 eotfOrig = Rgb.this.getEotfOrig();
                f3 = Rgb.this.min;
                double d2 = f3;
                f4 = Rgb.this.max;
                return (Double) eotfOrig.invoke(Double.valueOf(RangesKt.coerceIn(d, d2, f4)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        if (primaries.length != 6 && primaries.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] xyPrimaries = companion.xyPrimaries(primaries);
        this.primaries = xyPrimaries;
        if (fArr != null) {
            if (fArr.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr.length);
            }
            this.transform = fArr;
        } else {
            this.transform = companion.computeXYZMatrix(xyPrimaries, whitePoint);
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = companion.isWideGamut(xyPrimaries, f, f2);
        this.isSrgb = companion.isSrgb(xyPrimaries, whitePoint, oetf, eotf, f, f2, i);
    }

    /* renamed from: getTransform$ui_graphics_release, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    /* renamed from: getInverseTransform$ui_graphics_release, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    /* renamed from: getOetfOrig$ui_graphics_release, reason: from getter */
    public final Function1 getOetfOrig() {
        return this.oetfOrig;
    }

    public final Function1 getOetf() {
        return this.oetf;
    }

    /* renamed from: getEotfOrig$ui_graphics_release, reason: from getter */
    public final Function1 getEotfOrig() {
        return this.eotfOrig;
    }

    public final Function1 getEotf() {
        return this.eotf;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: isSrgb, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(String name, float[] primaries, WhitePoint whitePoint, final TransferParameters function, int i) {
        this(name, primaries, whitePoint, null, (function.getE() == 0.0d && function.getF() == 0.0d) ? new Function1() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }

            @NotNull
            public final Double invoke(double d) {
                return Double.valueOf(ColorSpaceKt.rcpResponse(d, TransferParameters.this.getA(), TransferParameters.this.getB(), TransferParameters.this.getC(), TransferParameters.this.getD(), TransferParameters.this.getGamma()));
            }
        } : new Function1() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }

            @NotNull
            public final Double invoke(double d) {
                return Double.valueOf(ColorSpaceKt.rcpResponse(d, TransferParameters.this.getA(), TransferParameters.this.getB(), TransferParameters.this.getC(), TransferParameters.this.getD(), TransferParameters.this.getE(), TransferParameters.this.getF(), TransferParameters.this.getGamma()));
            }
        }, (function.getE() == 0.0d && function.getF() == 0.0d) ? new Function1() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }

            @NotNull
            public final Double invoke(double d) {
                return Double.valueOf(ColorSpaceKt.response(d, TransferParameters.this.getA(), TransferParameters.this.getB(), TransferParameters.this.getC(), TransferParameters.this.getD(), TransferParameters.this.getGamma()));
            }
        } : new Function1() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }

            @NotNull
            public final Double invoke(double d) {
                return Double.valueOf(ColorSpaceKt.response(d, TransferParameters.this.getA(), TransferParameters.this.getB(), TransferParameters.this.getC(), TransferParameters.this.getD(), TransferParameters.this.getE(), TransferParameters.this.getF(), TransferParameters.this.getGamma()));
            }
        }, 0.0f, 1.0f, function, i);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(function, "function");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(String name, float[] primaries, WhitePoint whitePoint, final double d, float f, float f2, int i) {
        this(name, primaries, whitePoint, null, r17, r0, f, f2, new TransferParameters(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i);
        Function1 function1;
        Function1 function12;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        if (d == 1.0d) {
            function1 = DoubleIdentity;
        } else {
            function1 = new Function1() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @NotNull
                public final Double invoke(double d2) {
                    if (d2 < 0.0d) {
                        d2 = 0.0d;
                    }
                    return Double.valueOf(Math.pow(d2, 1.0d / d));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).doubleValue());
                }
            };
        }
        Function1 function13 = function1;
        if (d == 1.0d) {
            function12 = DoubleIdentity;
        } else {
            function12 = new Function1() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @NotNull
                public final Double invoke(double d2) {
                    if (d2 < 0.0d) {
                        d2 = 0.0d;
                    }
                    return Double.valueOf(Math.pow(d2, d));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).doubleValue());
                }
            };
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(Rgb colorSpace, float[] transform, WhitePoint whitePoint) {
        this(colorSpace.getName(), colorSpace.primaries, whitePoint, transform, colorSpace.oetfOrig, colorSpace.eotfOrig, colorSpace.min, colorSpace.max, colorSpace.transferParameters, -1);
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return this.min;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = (float) ((Number) this.eotf.invoke(Double.valueOf(v[0]))).doubleValue();
        v[1] = (float) ((Number) this.eotf.invoke(Double.valueOf(v[1]))).doubleValue();
        v[2] = (float) ((Number) this.eotf.invoke(Double.valueOf(v[2]))).doubleValue();
        return ColorSpaceKt.mul3x3Float3(this.transform, v);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, v);
        v[0] = (float) ((Number) this.oetf.invoke(Double.valueOf(v[0]))).doubleValue();
        v[1] = (float) ((Number) this.oetf.invoke(Double.valueOf(v[1]))).doubleValue();
        v[2] = (float) ((Number) this.oetf.invoke(Double.valueOf(v[2]))).doubleValue();
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(Rgb.class), Reflection.getOrCreateKotlinClass(other.getClass())) || !super.equals(other)) {
            return false;
        }
        Rgb rgb = (Rgb) other;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !Intrinsics.areEqual(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return Intrinsics.areEqual(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (Intrinsics.areEqual(this.oetfOrig, rgb.oetfOrig)) {
            return Intrinsics.areEqual(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int hashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f = this.min;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.max;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int hashCode2 = floatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        return this.transferParameters == null ? (((hashCode2 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode() : hashCode2;
    }

    /* compiled from: Rgb.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J_\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010!\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "<init>", "()V", "", "primaries", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "Lkotlin/Function1;", "", "OETF", "EOTF", "", "min", "max", "", "id", "", "isSrgb", "([FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FFI)Z", "point", "a", "b", "compare", "(DLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Z", "isWideGamut", "([FFF)Z", "area", "([F)F", "ax", "ay", "bx", "by", "cross", "(FFFF)F", "p1", "p2", "contains", "([F[F)Z", "xyPrimaries", "([F)[F", "computeXYZMatrix", "([FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)[F", "DoubleIdentity", "Lkotlin/jvm/functions/Function1;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float cross(float ax, float ay, float bx, float by) {
            return (ax * by) - (ay * bx);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] primaries, WhitePoint whitePoint, Function1 OETF, Function1 EOTF, float min, float max, int id) {
            if (id == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(primaries, colorSpaces.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) || min != 0.0f || max != 1.0f) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!compare(d, OETF, srgb.getOetfOrig()) || !compare(d, EOTF, srgb.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        private final boolean compare(double point, Function1 a, Function1 b) {
            return Math.abs(((Number) a.invoke(Double.valueOf(point))).doubleValue() - ((Number) b.invoke(Double.valueOf(point))).doubleValue()) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] primaries, float min, float max) {
            float area = area(primaries);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            return (area / area(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) > 0.9f && contains(primaries, colorSpaces.getSrgbPrimaries$ui_graphics_release())) || (min < 0.0f && max > 1.0f);
        }

        private final float area(float[] primaries) {
            float f = primaries[0];
            float f2 = primaries[1];
            float f3 = primaries[2];
            float f4 = primaries[3];
            float f5 = primaries[4];
            float f6 = primaries[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        private final boolean contains(float[] p1, float[] p2) {
            float f = p1[0];
            float f2 = p2[0];
            float f3 = p1[1];
            float f4 = p2[1];
            float f5 = p1[2] - p2[2];
            float f6 = p1[3] - p2[3];
            float f7 = p1[4];
            float f8 = p2[4];
            float f9 = p1[5];
            float f10 = p2[5];
            float[] fArr = {f - f2, f3 - f4, f5, f6, f7 - f8, f9 - f10};
            return cross(fArr[0], fArr[1], f2 - f8, f4 - f10) >= 0.0f && cross(p2[0] - p2[2], p2[1] - p2[3], fArr[0], fArr[1]) >= 0.0f && cross(fArr[2], fArr[3], p2[2] - p2[0], p2[3] - p2[1]) >= 0.0f && cross(p2[2] - p2[4], p2[3] - p2[5], fArr[2], fArr[3]) >= 0.0f && cross(fArr[4], fArr[5], p2[4] - p2[2], p2[5] - p2[3]) >= 0.0f && cross(p2[4] - p2[0], p2[5] - p2[1], fArr[4], fArr[5]) >= 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length == 9) {
                float f = primaries[0];
                float f2 = primaries[1];
                float f3 = f + f2 + primaries[2];
                fArr[0] = f / f3;
                fArr[1] = f2 / f3;
                float f4 = primaries[3];
                float f5 = primaries[4];
                float f6 = f4 + f5 + primaries[5];
                fArr[2] = f4 / f6;
                fArr[3] = f5 / f6;
                float f7 = primaries[6];
                float f8 = primaries[7];
                float f9 = f7 + f8 + primaries[8];
                fArr[4] = f7 / f9;
                fArr[5] = f8 / f9;
            } else {
                ArraysKt.copyInto$default(primaries, fArr, 0, 0, 6, 6, (Object) null);
            }
            return fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] primaries, WhitePoint whitePoint) {
            float f = primaries[0];
            float f2 = primaries[1];
            float f3 = primaries[2];
            float f4 = primaries[3];
            float f5 = primaries[4];
            float f6 = primaries[5];
            float x = whitePoint.getX();
            float y = whitePoint.getY();
            float f7 = 1;
            float f8 = (f7 - f) / f2;
            float f9 = (f7 - f3) / f4;
            float f10 = (f7 - f5) / f6;
            float f11 = (f7 - x) / y;
            float f12 = f / f2;
            float f13 = (f3 / f4) - f12;
            float f14 = (x / y) - f12;
            float f15 = f9 - f8;
            float f16 = (f5 / f6) - f12;
            float f17 = (((f11 - f8) * f13) - (f14 * f15)) / (((f10 - f8) * f13) - (f15 * f16));
            float f18 = (f14 - (f16 * f17)) / f13;
            float f19 = (1.0f - f18) - f17;
            float f20 = f19 / f2;
            float f21 = f18 / f4;
            float f22 = f17 / f6;
            return new float[]{f20 * f, f19, f20 * ((1.0f - f) - f2), f21 * f3, f18, f21 * ((1.0f - f3) - f4), f22 * f5, f17, f22 * ((1.0f - f5) - f6)};
        }
    }
}
