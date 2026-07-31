package f1;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class u {
    public static final ColorSpace a(g1.c cVar) {
        ColorSpace colorSpace;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (q6.i.a(cVar, g1.d.f2825e)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (q6.i.a(cVar, g1.d.f2836q)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (q6.i.a(cVar, g1.d.f2837r)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (q6.i.a(cVar, g1.d.f2834o)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (q6.i.a(cVar, g1.d.f2829j)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (q6.i.a(cVar, g1.d.i)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (q6.i.a(cVar, g1.d.f2839t)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (q6.i.a(cVar, g1.d.f2838s)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (q6.i.a(cVar, g1.d.f2830k)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (q6.i.a(cVar, g1.d.f2831l)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (q6.i.a(cVar, g1.d.f2827g)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (q6.i.a(cVar, g1.d.f2828h)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (q6.i.a(cVar, g1.d.f2826f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (q6.i.a(cVar, g1.d.f2832m)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (q6.i.a(cVar, g1.d.f2835p)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (q6.i.a(cVar, g1.d.f2833n)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (q6.i.a(cVar, g1.d.f2841v)) {
                named2 = ColorSpace.Named.BT2020_HLG;
                colorSpace = ColorSpace.get(named2);
            } else if (q6.i.a(cVar, g1.d.f2842w)) {
                named = ColorSpace.Named.BT2020_PQ;
                colorSpace = ColorSpace.get(named);
            } else {
                colorSpace = null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (!(cVar instanceof g1.q)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        String str = cVar.f2818a;
        g1.q qVar = (g1.q) cVar;
        float[] a8 = qVar.f2872d.a();
        g1.r rVar = qVar.f2875g;
        ColorSpace.Rgb.TransferParameters transferParameters = rVar != null ? new ColorSpace.Rgb.TransferParameters(rVar.f2886b, rVar.f2887c, rVar.f2888d, rVar.f2889e, rVar.f2890f, rVar.f2891g, rVar.f2885a) : null;
        if (transferParameters != null) {
            return new ColorSpace.Rgb(str, qVar.f2876h, a8, transferParameters);
        }
        float[] fArr = qVar.f2876h;
        final g1.p pVar = qVar.f2879l;
        final int i = 0;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: f1.t
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d8) {
                switch (i) {
                }
                return ((Number) pVar.i(Double.valueOf(d8))).doubleValue();
            }
        };
        final g1.p pVar2 = qVar.f2882o;
        final int i8 = 1;
        return new ColorSpace.Rgb(str, fArr, a8, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: f1.t
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d8) {
                switch (i8) {
                }
                return ((Number) pVar2.i(Double.valueOf(d8))).doubleValue();
            }
        }, qVar.f2873e, qVar.f2874f);
    }
}
