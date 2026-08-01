package k1;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class r {
    public static final ColorSpace a(l1.c cVar) {
        ColorSpace colorSpace;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (Intrinsics.a(cVar, l1.d.f5762e)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (Intrinsics.a(cVar, l1.d.f5772q)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (Intrinsics.a(cVar, l1.d.f5773r)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (Intrinsics.a(cVar, l1.d.f5770o)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (Intrinsics.a(cVar, l1.d.j)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (Intrinsics.a(cVar, l1.d.f5765i)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (Intrinsics.a(cVar, l1.d.f5775t)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (Intrinsics.a(cVar, l1.d.f5774s)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (Intrinsics.a(cVar, l1.d.f5766k)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (Intrinsics.a(cVar, l1.d.f5767l)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (Intrinsics.a(cVar, l1.d.g)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (Intrinsics.a(cVar, l1.d.f5764h)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (Intrinsics.a(cVar, l1.d.f5763f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (Intrinsics.a(cVar, l1.d.f5768m)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (Intrinsics.a(cVar, l1.d.f5771p)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (Intrinsics.a(cVar, l1.d.f5769n)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (Intrinsics.a(cVar, l1.d.f5777v)) {
                named2 = ColorSpace.Named.BT2020_HLG;
                colorSpace = ColorSpace.get(named2);
            } else if (Intrinsics.a(cVar, l1.d.f5778w)) {
                named = ColorSpace.Named.BT2020_PQ;
                colorSpace = ColorSpace.get(named);
            } else {
                colorSpace = null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (!(cVar instanceof l1.q)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        String str = cVar.f5755a;
        l1.q qVar = (l1.q) cVar;
        float[] a9 = qVar.f5806d.a();
        l1.r rVar = qVar.g;
        ColorSpace.Rgb.TransferParameters transferParameters = rVar != null ? new ColorSpace.Rgb.TransferParameters(rVar.f5819b, rVar.f5820c, rVar.f5821d, rVar.f5822e, rVar.f5823f, rVar.g, rVar.f5818a) : null;
        float[] fArr = qVar.f5810i;
        if (transferParameters != null) {
            ColorSpace.Rgb rgb = new ColorSpace.Rgb(str, qVar.f5809h, a9, transferParameters);
            return (Float.isNaN(fArr[0]) || Arrays.equals(rgb.getTransform(), fArr)) ? rgb : new ColorSpace.Rgb(str, fArr, transferParameters);
        }
        float[] fArr2 = qVar.f5809h;
        final l1.p pVar = qVar.f5812l;
        final int i3 = 0;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: k1.q
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d10) {
                switch (i3) {
                }
                return ((Number) pVar.invoke(Double.valueOf(d10))).doubleValue();
            }
        };
        final l1.p pVar2 = qVar.f5815o;
        final int i10 = 1;
        return new ColorSpace.Rgb(str, fArr2, a9, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: k1.q
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d10) {
                switch (i10) {
                }
                return ((Number) pVar2.invoke(Double.valueOf(d10))).doubleValue();
            }
        }, qVar.f5807e, qVar.f5808f);
    }
}
