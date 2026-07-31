package b0;

import android.graphics.ColorSpace;
import c0.AbstractC0357c;
import c0.C0358d;
import c0.C0370p;
import c0.C0371q;
import c0.C0372r;
import c0.C0373s;
import c0.InterfaceC0363i;
import java.util.function.DoubleUnaryOperator;

/* loaded from: classes.dex */
public abstract class B {
    /* JADX WARN: Type inference failed for: r6v0, types: [b0.z] */
    /* JADX WARN: Type inference failed for: r7v0, types: [b0.z] */
    public static final ColorSpace a(AbstractC0357c abstractC0357c) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb d3;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace.Named named3;
        ColorSpace colorSpace3;
        ColorSpace.Named named4;
        ColorSpace colorSpace4;
        ColorSpace.Named named5;
        ColorSpace colorSpace5;
        ColorSpace.Named named6;
        ColorSpace colorSpace6;
        ColorSpace.Named named7;
        ColorSpace colorSpace7;
        ColorSpace.Named named8;
        ColorSpace colorSpace8;
        ColorSpace.Named named9;
        ColorSpace colorSpace9;
        ColorSpace.Named named10;
        ColorSpace colorSpace10;
        ColorSpace.Named named11;
        ColorSpace colorSpace11;
        ColorSpace.Named named12;
        ColorSpace colorSpace12;
        ColorSpace.Named named13;
        ColorSpace colorSpace13;
        ColorSpace.Named named14;
        ColorSpace colorSpace14;
        ColorSpace.Named named15;
        ColorSpace colorSpace15;
        ColorSpace.Named named16;
        ColorSpace colorSpace16;
        ColorSpace.Named named17;
        ColorSpace colorSpace17;
        if (f2.j.a(abstractC0357c, C0358d.f5476c)) {
            named17 = ColorSpace.Named.SRGB;
            colorSpace17 = ColorSpace.get(named17);
            return colorSpace17;
        }
        if (f2.j.a(abstractC0357c, C0358d.f5488o)) {
            named16 = ColorSpace.Named.ACES;
            colorSpace16 = ColorSpace.get(named16);
            return colorSpace16;
        }
        if (f2.j.a(abstractC0357c, C0358d.f5489p)) {
            named15 = ColorSpace.Named.ACESCG;
            colorSpace15 = ColorSpace.get(named15);
            return colorSpace15;
        }
        if (f2.j.a(abstractC0357c, C0358d.f5486m)) {
            named14 = ColorSpace.Named.ADOBE_RGB;
            colorSpace14 = ColorSpace.get(named14);
            return colorSpace14;
        }
        if (f2.j.a(abstractC0357c, C0358d.f5481h)) {
            named13 = ColorSpace.Named.BT2020;
            colorSpace13 = ColorSpace.get(named13);
            return colorSpace13;
        }
        if (f2.j.a(abstractC0357c, C0358d.f5480g)) {
            named12 = ColorSpace.Named.BT709;
            colorSpace12 = ColorSpace.get(named12);
            return colorSpace12;
        }
        if (f2.j.a(abstractC0357c, C0358d.f5491r)) {
            named11 = ColorSpace.Named.CIE_LAB;
            colorSpace11 = ColorSpace.get(named11);
            return colorSpace11;
        }
        if (f2.j.a(abstractC0357c, C0358d.f5490q)) {
            named10 = ColorSpace.Named.CIE_XYZ;
            colorSpace10 = ColorSpace.get(named10);
            return colorSpace10;
        }
        if (f2.j.a(abstractC0357c, C0358d.f5482i)) {
            named9 = ColorSpace.Named.DCI_P3;
            colorSpace9 = ColorSpace.get(named9);
            return colorSpace9;
        }
        if (f2.j.a(abstractC0357c, C0358d.f5483j)) {
            named8 = ColorSpace.Named.DISPLAY_P3;
            colorSpace8 = ColorSpace.get(named8);
            return colorSpace8;
        }
        if (f2.j.a(abstractC0357c, C0358d.f5478e)) {
            named7 = ColorSpace.Named.EXTENDED_SRGB;
            colorSpace7 = ColorSpace.get(named7);
            return colorSpace7;
        }
        if (f2.j.a(abstractC0357c, C0358d.f5479f)) {
            named6 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace6 = ColorSpace.get(named6);
            return colorSpace6;
        }
        if (f2.j.a(abstractC0357c, C0358d.f5477d)) {
            named5 = ColorSpace.Named.LINEAR_SRGB;
            colorSpace5 = ColorSpace.get(named5);
            return colorSpace5;
        }
        if (f2.j.a(abstractC0357c, C0358d.f5484k)) {
            named4 = ColorSpace.Named.NTSC_1953;
            colorSpace4 = ColorSpace.get(named4);
            return colorSpace4;
        }
        if (f2.j.a(abstractC0357c, C0358d.f5487n)) {
            named3 = ColorSpace.Named.PRO_PHOTO_RGB;
            colorSpace3 = ColorSpace.get(named3);
            return colorSpace3;
        }
        if (f2.j.a(abstractC0357c, C0358d.f5485l)) {
            named2 = ColorSpace.Named.SMPTE_C;
            colorSpace2 = ColorSpace.get(named2);
            return colorSpace2;
        }
        if (!(abstractC0357c instanceof C0371q)) {
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            return colorSpace;
        }
        C0371q c0371q = (C0371q) abstractC0357c;
        float[] a3 = c0371q.f5522d.a();
        C0372r c0372r = c0371q.f5525g;
        if (c0372r != null) {
            y.g();
            transferParameters = y.b(c0372r.f5537b, c0372r.f5538c, c0372r.f5539d, c0372r.f5540e, c0372r.f5541f, c0372r.f5542g, c0372r.f5536a);
        } else {
            transferParameters = null;
        }
        if (transferParameters != null) {
            y.m();
            d3 = y.c(abstractC0357c.f5471a, c0371q.f5526h, a3, transferParameters);
        } else {
            y.m();
            String str = abstractC0357c.f5471a;
            final C0370p c0370p = c0371q.f5530l;
            final int i3 = 0;
            ?? r6 = new DoubleUnaryOperator() { // from class: b0.z
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d4) {
                    switch (i3) {
                        case 0:
                            return ((Number) ((C0370p) c0370p).n(Double.valueOf(d4))).doubleValue();
                        default:
                            return ((Number) ((C0370p) c0370p).n(Double.valueOf(d4))).doubleValue();
                    }
                }
            };
            final C0370p c0370p2 = c0371q.f5533o;
            final int i4 = 1;
            C0371q c0371q2 = (C0371q) abstractC0357c;
            d3 = y.d(str, c0371q.f5526h, a3, r6, new DoubleUnaryOperator() { // from class: b0.z
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d4) {
                    switch (i4) {
                        case 0:
                            return ((Number) ((C0370p) c0370p2).n(Double.valueOf(d4))).doubleValue();
                        default:
                            return ((Number) ((C0370p) c0370p2).n(Double.valueOf(d4))).doubleValue();
                    }
                }
            }, c0371q2.f5523e, c0371q2.f5524f);
        }
        return x.j(d3);
    }

    public static final AbstractC0357c b(final ColorSpace colorSpace) {
        int id;
        ColorSpace.Named named;
        int ordinal;
        ColorSpace.Named named2;
        int ordinal2;
        ColorSpace.Named named3;
        int ordinal3;
        ColorSpace.Named named4;
        int ordinal4;
        ColorSpace.Named named5;
        int ordinal5;
        ColorSpace.Named named6;
        int ordinal6;
        ColorSpace.Named named7;
        int ordinal7;
        ColorSpace.Named named8;
        int ordinal8;
        ColorSpace.Named named9;
        int ordinal9;
        ColorSpace.Named named10;
        int ordinal10;
        ColorSpace.Named named11;
        int ordinal11;
        ColorSpace.Named named12;
        int ordinal12;
        ColorSpace.Named named13;
        int ordinal13;
        ColorSpace.Named named14;
        int ordinal14;
        ColorSpace.Named named15;
        int ordinal15;
        ColorSpace.Named named16;
        int ordinal16;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] whitePoint;
        C0373s c0373s;
        float[] whitePoint2;
        float[] whitePoint3;
        C0372r c0372r;
        String name;
        float[] primaries;
        float[] transform;
        float minValue;
        float maxValue;
        int id2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        float[] whitePoint4;
        float[] whitePoint5;
        float[] whitePoint6;
        id = colorSpace.getId();
        named = ColorSpace.Named.SRGB;
        ordinal = named.ordinal();
        if (id == ordinal) {
            return C0358d.f5476c;
        }
        named2 = ColorSpace.Named.ACES;
        ordinal2 = named2.ordinal();
        if (id == ordinal2) {
            return C0358d.f5488o;
        }
        named3 = ColorSpace.Named.ACESCG;
        ordinal3 = named3.ordinal();
        if (id == ordinal3) {
            return C0358d.f5489p;
        }
        named4 = ColorSpace.Named.ADOBE_RGB;
        ordinal4 = named4.ordinal();
        if (id == ordinal4) {
            return C0358d.f5486m;
        }
        named5 = ColorSpace.Named.BT2020;
        ordinal5 = named5.ordinal();
        if (id == ordinal5) {
            return C0358d.f5481h;
        }
        named6 = ColorSpace.Named.BT709;
        ordinal6 = named6.ordinal();
        if (id == ordinal6) {
            return C0358d.f5480g;
        }
        named7 = ColorSpace.Named.CIE_LAB;
        ordinal7 = named7.ordinal();
        if (id == ordinal7) {
            return C0358d.f5491r;
        }
        named8 = ColorSpace.Named.CIE_XYZ;
        ordinal8 = named8.ordinal();
        if (id == ordinal8) {
            return C0358d.f5490q;
        }
        named9 = ColorSpace.Named.DCI_P3;
        ordinal9 = named9.ordinal();
        if (id == ordinal9) {
            return C0358d.f5482i;
        }
        named10 = ColorSpace.Named.DISPLAY_P3;
        ordinal10 = named10.ordinal();
        if (id == ordinal10) {
            return C0358d.f5483j;
        }
        named11 = ColorSpace.Named.EXTENDED_SRGB;
        ordinal11 = named11.ordinal();
        if (id == ordinal11) {
            return C0358d.f5478e;
        }
        named12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        ordinal12 = named12.ordinal();
        if (id == ordinal12) {
            return C0358d.f5479f;
        }
        named13 = ColorSpace.Named.LINEAR_SRGB;
        ordinal13 = named13.ordinal();
        if (id == ordinal13) {
            return C0358d.f5477d;
        }
        named14 = ColorSpace.Named.NTSC_1953;
        ordinal14 = named14.ordinal();
        if (id == ordinal14) {
            return C0358d.f5484k;
        }
        named15 = ColorSpace.Named.PRO_PHOTO_RGB;
        ordinal15 = named15.ordinal();
        if (id == ordinal15) {
            return C0358d.f5487n;
        }
        named16 = ColorSpace.Named.SMPTE_C;
        ordinal16 = named16.ordinal();
        if (id == ordinal16) {
            return C0358d.f5485l;
        }
        if (!x.m(colorSpace)) {
            return C0358d.f5476c;
        }
        transferParameters = x.h(colorSpace).getTransferParameters();
        whitePoint = x.h(colorSpace).getWhitePoint();
        if (whitePoint.length == 3) {
            whitePoint4 = x.h(colorSpace).getWhitePoint();
            float f3 = whitePoint4[0];
            whitePoint5 = x.h(colorSpace).getWhitePoint();
            float f4 = whitePoint5[1];
            whitePoint6 = x.h(colorSpace).getWhitePoint();
            float f5 = f3 + f4 + whitePoint6[2];
            c0373s = new C0373s(f3 / f5, f4 / f5);
        } else {
            whitePoint2 = x.h(colorSpace).getWhitePoint();
            float f6 = whitePoint2[0];
            whitePoint3 = x.h(colorSpace).getWhitePoint();
            c0373s = new C0373s(f6, whitePoint3[1]);
        }
        C0373s c0373s2 = c0373s;
        if (transferParameters != null) {
            d3 = transferParameters.g;
            d4 = transferParameters.a;
            d5 = transferParameters.b;
            d6 = transferParameters.c;
            d7 = transferParameters.d;
            d8 = transferParameters.e;
            d9 = transferParameters.f;
            c0372r = new C0372r(d3, d4, d5, d6, d7, d8, d9);
        } else {
            c0372r = null;
        }
        name = x.h(colorSpace).getName();
        primaries = x.h(colorSpace).getPrimaries();
        transform = x.h(colorSpace).getTransform();
        final int i3 = 0;
        InterfaceC0363i interfaceC0363i = new InterfaceC0363i() { // from class: b0.A
            @Override // c0.InterfaceC0363i
            public final double b(double d10) {
                DoubleUnaryOperator oetf;
                DoubleUnaryOperator eotf;
                switch (i3) {
                    case 0:
                        oetf = x.h(colorSpace).getOetf();
                        return oetf.applyAsDouble(d10);
                    default:
                        eotf = x.h(colorSpace).getEotf();
                        return eotf.applyAsDouble(d10);
                }
            }
        };
        final int i4 = 1;
        InterfaceC0363i interfaceC0363i2 = new InterfaceC0363i() { // from class: b0.A
            @Override // c0.InterfaceC0363i
            public final double b(double d10) {
                DoubleUnaryOperator oetf;
                DoubleUnaryOperator eotf;
                switch (i4) {
                    case 0:
                        oetf = x.h(colorSpace).getOetf();
                        return oetf.applyAsDouble(d10);
                    default:
                        eotf = x.h(colorSpace).getEotf();
                        return eotf.applyAsDouble(d10);
                }
            }
        };
        minValue = colorSpace.getMinValue(0);
        maxValue = colorSpace.getMaxValue(0);
        id2 = x.h(colorSpace).getId();
        return new C0371q(name, primaries, c0373s2, transform, interfaceC0363i, interfaceC0363i2, minValue, maxValue, c0372r, id2);
    }
}
