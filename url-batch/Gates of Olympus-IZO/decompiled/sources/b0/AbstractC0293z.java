package b0;

import android.graphics.ColorSpace;
import c0.AbstractC0300c;
import c0.C0301d;
import c0.C0313p;
import c0.C0314q;
import c0.C0315r;
import c0.C0316s;
import c0.InterfaceC0306i;
import java.util.function.DoubleUnaryOperator;

/* renamed from: b0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0293z {
    /* JADX WARN: Type inference failed for: r6v0, types: [b0.x] */
    /* JADX WARN: Type inference failed for: r7v0, types: [b0.x] */
    public static final ColorSpace a(AbstractC0300c abstractC0300c) {
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
        if (Z1.i.a(abstractC0300c, C0301d.f4351c)) {
            named17 = ColorSpace.Named.SRGB;
            colorSpace17 = ColorSpace.get(named17);
            return colorSpace17;
        }
        if (Z1.i.a(abstractC0300c, C0301d.f4363o)) {
            named16 = ColorSpace.Named.ACES;
            colorSpace16 = ColorSpace.get(named16);
            return colorSpace16;
        }
        if (Z1.i.a(abstractC0300c, C0301d.p)) {
            named15 = ColorSpace.Named.ACESCG;
            colorSpace15 = ColorSpace.get(named15);
            return colorSpace15;
        }
        if (Z1.i.a(abstractC0300c, C0301d.f4361m)) {
            named14 = ColorSpace.Named.ADOBE_RGB;
            colorSpace14 = ColorSpace.get(named14);
            return colorSpace14;
        }
        if (Z1.i.a(abstractC0300c, C0301d.f4356h)) {
            named13 = ColorSpace.Named.BT2020;
            colorSpace13 = ColorSpace.get(named13);
            return colorSpace13;
        }
        if (Z1.i.a(abstractC0300c, C0301d.f4355g)) {
            named12 = ColorSpace.Named.BT709;
            colorSpace12 = ColorSpace.get(named12);
            return colorSpace12;
        }
        if (Z1.i.a(abstractC0300c, C0301d.f4365r)) {
            named11 = ColorSpace.Named.CIE_LAB;
            colorSpace11 = ColorSpace.get(named11);
            return colorSpace11;
        }
        if (Z1.i.a(abstractC0300c, C0301d.f4364q)) {
            named10 = ColorSpace.Named.CIE_XYZ;
            colorSpace10 = ColorSpace.get(named10);
            return colorSpace10;
        }
        if (Z1.i.a(abstractC0300c, C0301d.f4357i)) {
            named9 = ColorSpace.Named.DCI_P3;
            colorSpace9 = ColorSpace.get(named9);
            return colorSpace9;
        }
        if (Z1.i.a(abstractC0300c, C0301d.f4358j)) {
            named8 = ColorSpace.Named.DISPLAY_P3;
            colorSpace8 = ColorSpace.get(named8);
            return colorSpace8;
        }
        if (Z1.i.a(abstractC0300c, C0301d.f4353e)) {
            named7 = ColorSpace.Named.EXTENDED_SRGB;
            colorSpace7 = ColorSpace.get(named7);
            return colorSpace7;
        }
        if (Z1.i.a(abstractC0300c, C0301d.f4354f)) {
            named6 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace6 = ColorSpace.get(named6);
            return colorSpace6;
        }
        if (Z1.i.a(abstractC0300c, C0301d.f4352d)) {
            named5 = ColorSpace.Named.LINEAR_SRGB;
            colorSpace5 = ColorSpace.get(named5);
            return colorSpace5;
        }
        if (Z1.i.a(abstractC0300c, C0301d.f4359k)) {
            named4 = ColorSpace.Named.NTSC_1953;
            colorSpace4 = ColorSpace.get(named4);
            return colorSpace4;
        }
        if (Z1.i.a(abstractC0300c, C0301d.f4362n)) {
            named3 = ColorSpace.Named.PRO_PHOTO_RGB;
            colorSpace3 = ColorSpace.get(named3);
            return colorSpace3;
        }
        if (Z1.i.a(abstractC0300c, C0301d.f4360l)) {
            named2 = ColorSpace.Named.SMPTE_C;
            colorSpace2 = ColorSpace.get(named2);
            return colorSpace2;
        }
        if (!(abstractC0300c instanceof C0314q)) {
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            return colorSpace;
        }
        C0314q c0314q = (C0314q) abstractC0300c;
        float[] a3 = c0314q.f4396d.a();
        C0315r c0315r = c0314q.f4399g;
        if (c0315r != null) {
            AbstractC0290w.g();
            transferParameters = AbstractC0290w.b(c0315r.f4410b, c0315r.f4411c, c0315r.f4412d, c0315r.f4413e, c0315r.f4414f, c0315r.f4415g, c0315r.f4409a);
        } else {
            transferParameters = null;
        }
        if (transferParameters != null) {
            AbstractC0290w.m();
            d3 = AbstractC0290w.c(abstractC0300c.f4346a, c0314q.f4400h, a3, transferParameters);
        } else {
            AbstractC0290w.m();
            String str = abstractC0300c.f4346a;
            final C0313p c0313p = c0314q.f4404l;
            final int i3 = 0;
            ?? r6 = new DoubleUnaryOperator() { // from class: b0.x
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d4) {
                    switch (i3) {
                        case 0:
                            return ((Number) ((C0313p) c0313p).j(Double.valueOf(d4))).doubleValue();
                        default:
                            return ((Number) ((C0313p) c0313p).j(Double.valueOf(d4))).doubleValue();
                    }
                }
            };
            final C0313p c0313p2 = c0314q.f4407o;
            final int i4 = 1;
            C0314q c0314q2 = (C0314q) abstractC0300c;
            d3 = AbstractC0290w.d(str, c0314q.f4400h, a3, r6, new DoubleUnaryOperator() { // from class: b0.x
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d4) {
                    switch (i4) {
                        case 0:
                            return ((Number) ((C0313p) c0313p2).j(Double.valueOf(d4))).doubleValue();
                        default:
                            return ((Number) ((C0313p) c0313p2).j(Double.valueOf(d4))).doubleValue();
                    }
                }
            }, c0314q2.f4397e, c0314q2.f4398f);
        }
        return AbstractC0289v.j(d3);
    }

    public static final AbstractC0300c b(final ColorSpace colorSpace) {
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
        C0316s c0316s;
        float[] whitePoint2;
        float[] whitePoint3;
        C0315r c0315r;
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
            return C0301d.f4351c;
        }
        named2 = ColorSpace.Named.ACES;
        ordinal2 = named2.ordinal();
        if (id == ordinal2) {
            return C0301d.f4363o;
        }
        named3 = ColorSpace.Named.ACESCG;
        ordinal3 = named3.ordinal();
        if (id == ordinal3) {
            return C0301d.p;
        }
        named4 = ColorSpace.Named.ADOBE_RGB;
        ordinal4 = named4.ordinal();
        if (id == ordinal4) {
            return C0301d.f4361m;
        }
        named5 = ColorSpace.Named.BT2020;
        ordinal5 = named5.ordinal();
        if (id == ordinal5) {
            return C0301d.f4356h;
        }
        named6 = ColorSpace.Named.BT709;
        ordinal6 = named6.ordinal();
        if (id == ordinal6) {
            return C0301d.f4355g;
        }
        named7 = ColorSpace.Named.CIE_LAB;
        ordinal7 = named7.ordinal();
        if (id == ordinal7) {
            return C0301d.f4365r;
        }
        named8 = ColorSpace.Named.CIE_XYZ;
        ordinal8 = named8.ordinal();
        if (id == ordinal8) {
            return C0301d.f4364q;
        }
        named9 = ColorSpace.Named.DCI_P3;
        ordinal9 = named9.ordinal();
        if (id == ordinal9) {
            return C0301d.f4357i;
        }
        named10 = ColorSpace.Named.DISPLAY_P3;
        ordinal10 = named10.ordinal();
        if (id == ordinal10) {
            return C0301d.f4358j;
        }
        named11 = ColorSpace.Named.EXTENDED_SRGB;
        ordinal11 = named11.ordinal();
        if (id == ordinal11) {
            return C0301d.f4353e;
        }
        named12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        ordinal12 = named12.ordinal();
        if (id == ordinal12) {
            return C0301d.f4354f;
        }
        named13 = ColorSpace.Named.LINEAR_SRGB;
        ordinal13 = named13.ordinal();
        if (id == ordinal13) {
            return C0301d.f4352d;
        }
        named14 = ColorSpace.Named.NTSC_1953;
        ordinal14 = named14.ordinal();
        if (id == ordinal14) {
            return C0301d.f4359k;
        }
        named15 = ColorSpace.Named.PRO_PHOTO_RGB;
        ordinal15 = named15.ordinal();
        if (id == ordinal15) {
            return C0301d.f4362n;
        }
        named16 = ColorSpace.Named.SMPTE_C;
        ordinal16 = named16.ordinal();
        if (id == ordinal16) {
            return C0301d.f4360l;
        }
        if (!AbstractC0289v.m(colorSpace)) {
            return C0301d.f4351c;
        }
        transferParameters = AbstractC0289v.h(colorSpace).getTransferParameters();
        whitePoint = AbstractC0289v.h(colorSpace).getWhitePoint();
        if (whitePoint.length == 3) {
            whitePoint4 = AbstractC0289v.h(colorSpace).getWhitePoint();
            float f3 = whitePoint4[0];
            whitePoint5 = AbstractC0289v.h(colorSpace).getWhitePoint();
            float f4 = whitePoint5[1];
            whitePoint6 = AbstractC0289v.h(colorSpace).getWhitePoint();
            float f5 = f3 + f4 + whitePoint6[2];
            c0316s = new C0316s(f3 / f5, f4 / f5);
        } else {
            whitePoint2 = AbstractC0289v.h(colorSpace).getWhitePoint();
            float f6 = whitePoint2[0];
            whitePoint3 = AbstractC0289v.h(colorSpace).getWhitePoint();
            c0316s = new C0316s(f6, whitePoint3[1]);
        }
        C0316s c0316s2 = c0316s;
        if (transferParameters != null) {
            d3 = transferParameters.g;
            d4 = transferParameters.a;
            d5 = transferParameters.b;
            d6 = transferParameters.c;
            d7 = transferParameters.d;
            d8 = transferParameters.e;
            d9 = transferParameters.f;
            c0315r = new C0315r(d3, d4, d5, d6, d7, d8, d9);
        } else {
            c0315r = null;
        }
        name = AbstractC0289v.h(colorSpace).getName();
        primaries = AbstractC0289v.h(colorSpace).getPrimaries();
        transform = AbstractC0289v.h(colorSpace).getTransform();
        final int i3 = 0;
        InterfaceC0306i interfaceC0306i = new InterfaceC0306i() { // from class: b0.y
            @Override // c0.InterfaceC0306i
            public final double b(double d10) {
                DoubleUnaryOperator oetf;
                DoubleUnaryOperator eotf;
                switch (i3) {
                    case 0:
                        oetf = AbstractC0289v.h(colorSpace).getOetf();
                        return oetf.applyAsDouble(d10);
                    default:
                        eotf = AbstractC0289v.h(colorSpace).getEotf();
                        return eotf.applyAsDouble(d10);
                }
            }
        };
        final int i4 = 1;
        InterfaceC0306i interfaceC0306i2 = new InterfaceC0306i() { // from class: b0.y
            @Override // c0.InterfaceC0306i
            public final double b(double d10) {
                DoubleUnaryOperator oetf;
                DoubleUnaryOperator eotf;
                switch (i4) {
                    case 0:
                        oetf = AbstractC0289v.h(colorSpace).getOetf();
                        return oetf.applyAsDouble(d10);
                    default:
                        eotf = AbstractC0289v.h(colorSpace).getEotf();
                        return eotf.applyAsDouble(d10);
                }
            }
        };
        minValue = colorSpace.getMinValue(0);
        maxValue = colorSpace.getMaxValue(0);
        id2 = AbstractC0289v.h(colorSpace).getId();
        return new C0314q(name, primaries, c0316s2, transform, interfaceC0306i, interfaceC0306i2, minValue, maxValue, c0315r, id2);
    }
}
