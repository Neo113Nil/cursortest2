package defpackage;

import android.adservices.measurement.MeasurementManager;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.layout.Arrangement$SpacingAlignmentCalculator;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.splashscreen.SplashScreen$KeepOnScreenCondition;
import java.util.ConcurrentModificationException;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final /* synthetic */ class Drop$$ExternalSyntheticBUOutline0 implements Easing, Arrangement$SpacingAlignmentCalculator, DoubleFunction, SplashScreen$KeepOnScreenCondition {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Drop$$ExternalSyntheticBUOutline0(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(int i, Object obj, Object obj2, Object obj3, String str) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void m$1() {
        throw new ConcurrentModificationException();
    }

    @Override // androidx.compose.foundation.layout.Arrangement$SpacingAlignmentCalculator
    public int align(int i, LayoutDirection layoutDirection) {
        return Math.round((1.0f + (layoutDirection == LayoutDirection.Ltr ? -1.0f : 1.0f)) * (i / 2.0f));
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        switch (this.$r8$classId) {
            case 5:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 6:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 7:
                float[] fArr = ColorSpaces.SrgbPrimaries;
                return ColorSpaces.transferHlgOetf$ui_graphics(ColorSpaces.Bt2020HlgTransferParameters, d);
            case 8:
                float[] fArr2 = ColorSpaces.SrgbPrimaries;
                return ColorSpaces.transferHlgEotf$ui_graphics(ColorSpaces.Bt2020HlgTransferParameters, d);
            case 9:
                float[] fArr3 = ColorSpaces.SrgbPrimaries;
                return ColorSpaces.transferSt2048Oetf$ui_graphics(ColorSpaces.Bt2020PqTransferParameters, d);
            case 10:
                float[] fArr4 = ColorSpaces.SrgbPrimaries;
                return ColorSpaces.transferSt2048Eotf$ui_graphics(ColorSpaces.Bt2020PqTransferParameters, d);
            default:
                return d;
        }
    }

    @Override // androidx.core.splashscreen.SplashScreen$KeepOnScreenCondition
    public boolean shouldKeepOnScreen() {
        return false;
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f) {
        return f;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager m(Object obj) {
        return (MeasurementManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m0m() {
        return MeasurementManager.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m1m() {
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void m(Object obj, Object obj2, Object obj3, Object obj4, String str) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void m(String str, float f, Object obj, float f2, Object obj2) {
        throw new IllegalArgumentException(str + f + obj + f2 + obj2);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
