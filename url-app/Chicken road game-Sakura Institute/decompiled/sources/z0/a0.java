package z0;

import android.graphics.ColorSpace;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a0 {
    public static final ColorSpace a(a1.c cVar) {
        ColorSpace colorSpace;
        if (r6.k.a(cVar, a1.d.f220c)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (r6.k.a(cVar, a1.d.f232o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (r6.k.a(cVar, a1.d.f233p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (r6.k.a(cVar, a1.d.f230m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (r6.k.a(cVar, a1.d.f225h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (r6.k.a(cVar, a1.d.f224g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (r6.k.a(cVar, a1.d.f235r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (r6.k.a(cVar, a1.d.f234q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (r6.k.a(cVar, a1.d.f226i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (r6.k.a(cVar, a1.d.f227j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (r6.k.a(cVar, a1.d.f222e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (r6.k.a(cVar, a1.d.f223f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (r6.k.a(cVar, a1.d.f221d)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (r6.k.a(cVar, a1.d.f228k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (r6.k.a(cVar, a1.d.f231n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (r6.k.a(cVar, a1.d.f229l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            if (cVar instanceof a1.q) {
                a1.q qVar = (a1.q) cVar;
                float[] a3 = qVar.f266d.a();
                a1.r rVar = qVar.f269g;
                ColorSpace.Rgb.TransferParameters transferParameters = rVar != null ? new ColorSpace.Rgb.TransferParameters(rVar.f281b, rVar.f282c, rVar.f283d, rVar.f284e, rVar.f285f, rVar.f286g, rVar.f280a) : null;
                if (transferParameters != null) {
                    return new ColorSpace.Rgb(cVar.f215a, qVar.f270h, a3, transferParameters);
                }
                String str = cVar.f215a;
                float[] fArr = qVar.f270h;
                final a1.p pVar = qVar.f274l;
                final int i7 = 0;
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: z0.y
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d8) {
                        switch (i7) {
                        }
                        return ((Number) pVar.f(Double.valueOf(d8))).doubleValue();
                    }
                };
                final a1.p pVar2 = qVar.f277o;
                final int i8 = 1;
                return new ColorSpace.Rgb(str, fArr, a3, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: z0.y
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d8) {
                        switch (i8) {
                        }
                        return ((Number) pVar2.f(Double.valueOf(d8))).doubleValue();
                    }
                }, qVar.f267e, qVar.f268f);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return colorSpace;
    }

    public static final a1.c b(final ColorSpace colorSpace) {
        int id;
        int ordinal;
        int ordinal2;
        int ordinal3;
        int ordinal4;
        int ordinal5;
        int ordinal6;
        int ordinal7;
        int ordinal8;
        int ordinal9;
        int ordinal10;
        int ordinal11;
        int ordinal12;
        int ordinal13;
        int ordinal14;
        int ordinal15;
        int ordinal16;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] whitePoint;
        a1.s sVar;
        float[] whitePoint2;
        float[] whitePoint3;
        a1.r rVar;
        String name;
        float[] primaries;
        float[] transform;
        float minValue;
        float maxValue;
        int id2;
        double d8;
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        float[] whitePoint4;
        float[] whitePoint5;
        float[] whitePoint6;
        ColorSpace.Named unused;
        ColorSpace.Named unused2;
        ColorSpace.Named unused3;
        ColorSpace.Named unused4;
        ColorSpace.Named unused5;
        ColorSpace.Named unused6;
        ColorSpace.Named unused7;
        ColorSpace.Named unused8;
        ColorSpace.Named unused9;
        ColorSpace.Named unused10;
        ColorSpace.Named unused11;
        ColorSpace.Named unused12;
        ColorSpace.Named unused13;
        ColorSpace.Named unused14;
        ColorSpace.Named unused15;
        ColorSpace.Named unused16;
        id = colorSpace.getId();
        unused = ColorSpace.Named.SRGB;
        ordinal = ColorSpace.Named.SRGB.ordinal();
        if (id == ordinal) {
            return a1.d.f220c;
        }
        unused2 = ColorSpace.Named.ACES;
        ordinal2 = ColorSpace.Named.ACES.ordinal();
        if (id == ordinal2) {
            return a1.d.f232o;
        }
        unused3 = ColorSpace.Named.ACESCG;
        ordinal3 = ColorSpace.Named.ACESCG.ordinal();
        if (id == ordinal3) {
            return a1.d.f233p;
        }
        unused4 = ColorSpace.Named.ADOBE_RGB;
        ordinal4 = ColorSpace.Named.ADOBE_RGB.ordinal();
        if (id == ordinal4) {
            return a1.d.f230m;
        }
        unused5 = ColorSpace.Named.BT2020;
        ordinal5 = ColorSpace.Named.BT2020.ordinal();
        if (id == ordinal5) {
            return a1.d.f225h;
        }
        unused6 = ColorSpace.Named.BT709;
        ordinal6 = ColorSpace.Named.BT709.ordinal();
        if (id == ordinal6) {
            return a1.d.f224g;
        }
        unused7 = ColorSpace.Named.CIE_LAB;
        ordinal7 = ColorSpace.Named.CIE_LAB.ordinal();
        if (id == ordinal7) {
            return a1.d.f235r;
        }
        unused8 = ColorSpace.Named.CIE_XYZ;
        ordinal8 = ColorSpace.Named.CIE_XYZ.ordinal();
        if (id == ordinal8) {
            return a1.d.f234q;
        }
        unused9 = ColorSpace.Named.DCI_P3;
        ordinal9 = ColorSpace.Named.DCI_P3.ordinal();
        if (id == ordinal9) {
            return a1.d.f226i;
        }
        unused10 = ColorSpace.Named.DISPLAY_P3;
        ordinal10 = ColorSpace.Named.DISPLAY_P3.ordinal();
        if (id == ordinal10) {
            return a1.d.f227j;
        }
        unused11 = ColorSpace.Named.EXTENDED_SRGB;
        ordinal11 = ColorSpace.Named.EXTENDED_SRGB.ordinal();
        if (id == ordinal11) {
            return a1.d.f222e;
        }
        unused12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        ordinal12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal();
        if (id == ordinal12) {
            return a1.d.f223f;
        }
        unused13 = ColorSpace.Named.LINEAR_SRGB;
        ordinal13 = ColorSpace.Named.LINEAR_SRGB.ordinal();
        if (id == ordinal13) {
            return a1.d.f221d;
        }
        unused14 = ColorSpace.Named.NTSC_1953;
        ordinal14 = ColorSpace.Named.NTSC_1953.ordinal();
        if (id == ordinal14) {
            return a1.d.f228k;
        }
        unused15 = ColorSpace.Named.PRO_PHOTO_RGB;
        ordinal15 = ColorSpace.Named.PRO_PHOTO_RGB.ordinal();
        if (id == ordinal15) {
            return a1.d.f231n;
        }
        unused16 = ColorSpace.Named.SMPTE_C;
        ordinal16 = ColorSpace.Named.SMPTE_C.ordinal();
        if (id == ordinal16) {
            return a1.d.f229l;
        }
        if (!w.i(colorSpace)) {
            return a1.d.f220c;
        }
        transferParameters = w.g(colorSpace).getTransferParameters();
        whitePoint = w.g(colorSpace).getWhitePoint();
        if (whitePoint.length == 3) {
            whitePoint4 = w.g(colorSpace).getWhitePoint();
            float f9 = whitePoint4[0];
            whitePoint5 = w.g(colorSpace).getWhitePoint();
            float f10 = whitePoint5[1];
            whitePoint6 = w.g(colorSpace).getWhitePoint();
            float f11 = f9 + f10 + whitePoint6[2];
            sVar = new a1.s(f9 / f11, f10 / f11);
        } else {
            whitePoint2 = w.g(colorSpace).getWhitePoint();
            float f12 = whitePoint2[0];
            whitePoint3 = w.g(colorSpace).getWhitePoint();
            sVar = new a1.s(f12, whitePoint3[1]);
        }
        a1.s sVar2 = sVar;
        if (transferParameters != null) {
            d8 = transferParameters.g;
            d9 = transferParameters.a;
            d10 = transferParameters.b;
            d11 = transferParameters.c;
            d12 = transferParameters.d;
            d13 = transferParameters.e;
            d14 = transferParameters.f;
            rVar = new a1.r(d8, d9, d10, d11, d12, d13, d14);
        } else {
            rVar = null;
        }
        a1.r rVar2 = rVar;
        name = w.g(colorSpace).getName();
        primaries = w.g(colorSpace).getPrimaries();
        transform = w.g(colorSpace).getTransform();
        final int i7 = 0;
        a1.i iVar = new a1.i() { // from class: z0.z
            @Override // a1.i
            public final double d(double d15) {
                DoubleUnaryOperator oetf;
                DoubleUnaryOperator eotf;
                switch (i7) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        oetf = w.g(colorSpace).getOetf();
                        return oetf.applyAsDouble(d15);
                    default:
                        eotf = w.g(colorSpace).getEotf();
                        return eotf.applyAsDouble(d15);
                }
            }
        };
        final int i8 = 1;
        a1.i iVar2 = new a1.i() { // from class: z0.z
            @Override // a1.i
            public final double d(double d15) {
                DoubleUnaryOperator oetf;
                DoubleUnaryOperator eotf;
                switch (i8) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        oetf = w.g(colorSpace).getOetf();
                        return oetf.applyAsDouble(d15);
                    default:
                        eotf = w.g(colorSpace).getEotf();
                        return eotf.applyAsDouble(d15);
                }
            }
        };
        minValue = colorSpace.getMinValue(0);
        maxValue = colorSpace.getMaxValue(0);
        id2 = w.g(colorSpace).getId();
        return new a1.q(name, primaries, sVar2, transform, iVar, iVar2, minValue, maxValue, rVar2, id2);
    }
}
