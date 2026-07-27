package Z;

import a0.AbstractC0348c;
import a0.C0349d;
import a0.C0361p;
import a0.C0362q;
import a0.C0363r;
import a0.C0364s;
import a0.InterfaceC0354i;
import android.graphics.ColorSpace;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class y {
    public static final ColorSpace a(AbstractC0348c abstractC0348c) {
        C0362q c0362q;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb rgb;
        if (Intrinsics.a(abstractC0348c, C0349d.f4763c)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (Intrinsics.a(abstractC0348c, C0349d.f4775o)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (Intrinsics.a(abstractC0348c, C0349d.f4776p)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (Intrinsics.a(abstractC0348c, C0349d.f4773m)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (Intrinsics.a(abstractC0348c, C0349d.f4768h)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (Intrinsics.a(abstractC0348c, C0349d.f4767g)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (Intrinsics.a(abstractC0348c, C0349d.f4778r)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (Intrinsics.a(abstractC0348c, C0349d.f4777q)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (Intrinsics.a(abstractC0348c, C0349d.f4769i)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (Intrinsics.a(abstractC0348c, C0349d.f4770j)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (Intrinsics.a(abstractC0348c, C0349d.f4765e)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (Intrinsics.a(abstractC0348c, C0349d.f4766f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (Intrinsics.a(abstractC0348c, C0349d.f4764d)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (Intrinsics.a(abstractC0348c, C0349d.f4771k)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (Intrinsics.a(abstractC0348c, C0349d.f4774n)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (Intrinsics.a(abstractC0348c, C0349d.f4772l)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(abstractC0348c instanceof C0362q)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        C0362q c0362q2 = (C0362q) abstractC0348c;
        float[] a4 = c0362q2.f4809d.a();
        C0363r c0363r = c0362q2.f4812g;
        if (c0363r != null) {
            c0362q = c0362q2;
            transferParameters = new ColorSpace.Rgb.TransferParameters(c0363r.f4824b, c0363r.f4825c, c0363r.f4826d, c0363r.f4827e, c0363r.f4828f, c0363r.f4829g, c0363r.f4823a);
        } else {
            c0362q = c0362q2;
            transferParameters = null;
        }
        if (transferParameters != null) {
            rgb = new ColorSpace.Rgb(abstractC0348c.f4758a, c0362q.f4813h, a4, transferParameters);
        } else {
            C0362q c0362q3 = c0362q;
            String str = abstractC0348c.f4758a;
            final C0361p c0361p = c0362q3.f4817l;
            final int i2 = 0;
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: Z.w
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d4) {
                    switch (i2) {
                        case 0:
                            return ((Number) ((C0361p) c0361p).invoke(Double.valueOf(d4))).doubleValue();
                        default:
                            return ((Number) ((C0361p) c0361p).invoke(Double.valueOf(d4))).doubleValue();
                    }
                }
            };
            final C0361p c0361p2 = c0362q3.f4820o;
            final int i4 = 1;
            C0362q c0362q4 = (C0362q) abstractC0348c;
            rgb = new ColorSpace.Rgb(str, c0362q3.f4813h, a4, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: Z.w
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d4) {
                    switch (i4) {
                        case 0:
                            return ((Number) ((C0361p) c0361p2).invoke(Double.valueOf(d4))).doubleValue();
                        default:
                            return ((Number) ((C0361p) c0361p2).invoke(Double.valueOf(d4))).doubleValue();
                    }
                }
            }, c0362q4.f4810e, c0362q4.f4811f);
        }
        return rgb;
    }

    public static final AbstractC0348c b(final ColorSpace colorSpace) {
        C0364s c0364s;
        C0364s c0364s2;
        C0363r c0363r;
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return C0349d.f4763c;
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return C0349d.f4775o;
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return C0349d.f4776p;
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return C0349d.f4773m;
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return C0349d.f4768h;
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return C0349d.f4767g;
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return C0349d.f4778r;
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return C0349d.f4777q;
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return C0349d.f4769i;
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return C0349d.f4770j;
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return C0349d.f4765e;
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return C0349d.f4766f;
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return C0349d.f4764d;
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return C0349d.f4771k;
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return C0349d.f4774n;
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return C0349d.f4772l;
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return C0349d.f4763c;
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        if (rgb.getWhitePoint().length == 3) {
            float f4 = rgb.getWhitePoint()[0];
            float f5 = rgb.getWhitePoint()[1];
            float f6 = f4 + f5 + rgb.getWhitePoint()[2];
            c0364s = new C0364s(f4 / f6, f5 / f6);
        } else {
            c0364s = new C0364s(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
        }
        C0364s c0364s3 = c0364s;
        if (transferParameters != null) {
            c0364s2 = c0364s3;
            c0363r = new C0363r(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f);
        } else {
            c0364s2 = c0364s3;
            c0363r = null;
        }
        String name = rgb.getName();
        float[] primaries = rgb.getPrimaries();
        float[] transform = rgb.getTransform();
        final int i2 = 0;
        InterfaceC0354i interfaceC0354i = new InterfaceC0354i() { // from class: Z.x
            @Override // a0.InterfaceC0354i
            public final double c(double d4) {
                switch (i2) {
                    case 0:
                        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d4);
                    default:
                        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d4);
                }
            }
        };
        final int i4 = 1;
        return new C0362q(name, primaries, c0364s2, transform, interfaceC0354i, new InterfaceC0354i() { // from class: Z.x
            @Override // a0.InterfaceC0354i
            public final double c(double d4) {
                switch (i4) {
                    case 0:
                        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d4);
                    default:
                        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d4);
                }
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), c0363r, rgb.getId());
    }
}
