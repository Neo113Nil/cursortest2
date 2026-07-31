package b0;

import android.graphics.ColorSpace;
import android.view.autofill.AutofillId;

/* loaded from: classes.dex */
public abstract /* synthetic */ class y {
    public static /* synthetic */ ColorSpace.Rgb.TransferParameters b(double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return new ColorSpace.Rgb.TransferParameters(d3, d4, d5, d6, d7, d8, d9);
    }

    public static /* synthetic */ ColorSpace.Rgb c(String str, float[] fArr, float[] fArr2, ColorSpace.Rgb.TransferParameters transferParameters) {
        return new ColorSpace.Rgb(str, fArr, fArr2, transferParameters);
    }

    public static /* synthetic */ ColorSpace.Rgb d(String str, float[] fArr, float[] fArr2, z zVar, z zVar2, float f3, float f4) {
        return new ColorSpace.Rgb(str, fArr, fArr2, zVar, zVar2, f3, f4);
    }

    public static /* bridge */ /* synthetic */ AutofillId f(Object obj) {
        return (AutofillId) obj;
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void m() {
    }
}
