package b0;

import android.graphics.ColorSpace;
import android.view.autofill.AutofillId;

/* renamed from: b0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0290w {
    public static /* synthetic */ ColorSpace.Rgb.TransferParameters b(double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return new ColorSpace.Rgb.TransferParameters(d3, d4, d5, d6, d7, d8, d9);
    }

    public static /* synthetic */ ColorSpace.Rgb c(String str, float[] fArr, float[] fArr2, ColorSpace.Rgb.TransferParameters transferParameters) {
        return new ColorSpace.Rgb(str, fArr, fArr2, transferParameters);
    }

    public static /* synthetic */ ColorSpace.Rgb d(String str, float[] fArr, float[] fArr2, C0291x c0291x, C0291x c0291x2, float f3, float f4) {
        return new ColorSpace.Rgb(str, fArr, fArr2, c0291x, c0291x2, f3, f4);
    }

    public static /* bridge */ /* synthetic */ AutofillId f(Object obj) {
        return (AutofillId) obj;
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void m() {
    }
}
