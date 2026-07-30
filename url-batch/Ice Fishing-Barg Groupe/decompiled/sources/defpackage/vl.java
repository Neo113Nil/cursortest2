package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class vl {
    public static void OPXfSBeufaJ8(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static final ColorSpace PxuCJdSBwIXG(tl tlVar) {
        ColorSpace colorSpace;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (cs0.wdg6QnbFHrFF(tlVar, wl.e9gEMXR7LXtO)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (cs0.wdg6QnbFHrFF(tlVar, wl.BRwzKIf41E4i)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (cs0.wdg6QnbFHrFF(tlVar, wl.XL4ISE6Oc65B)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (cs0.wdg6QnbFHrFF(tlVar, wl.QrzZRwfaDlRX)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (cs0.wdg6QnbFHrFF(tlVar, wl.wdg6QnbFHrFF)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (cs0.wdg6QnbFHrFF(tlVar, wl.OPXfSBeufaJ8)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (cs0.wdg6QnbFHrFF(tlVar, wl.EcgxDIVH5in8)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (cs0.wdg6QnbFHrFF(tlVar, wl.RfyTYNmI9Srp)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (cs0.wdg6QnbFHrFF(tlVar, wl.dgRBjINgWbAK)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (cs0.wdg6QnbFHrFF(tlVar, wl.x50lh2ztY7Y5)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (cs0.wdg6QnbFHrFF(tlVar, wl.RAsUl2FVSrh6)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (cs0.wdg6QnbFHrFF(tlVar, wl.rtx2ld2ELZv4)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (cs0.wdg6QnbFHrFF(tlVar, wl.a92UlCVFR9N8)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (cs0.wdg6QnbFHrFF(tlVar, wl.cpQdD2nAriOS)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (cs0.wdg6QnbFHrFF(tlVar, wl.gPXPFXrUH4XX)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (cs0.wdg6QnbFHrFF(tlVar, wl.r3s1LDPKFs1S)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (cs0.wdg6QnbFHrFF(tlVar, wl.VhhvGxCb8gfr)) {
                named2 = ColorSpace.Named.BT2020_HLG;
                colorSpace = ColorSpace.get(named2);
            } else if (cs0.wdg6QnbFHrFF(tlVar, wl.S2OOm9zPNm0h)) {
                named = ColorSpace.Named.BT2020_PQ;
                colorSpace = ColorSpace.get(named);
            } else {
                colorSpace = null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (!(tlVar instanceof lw1)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        String str = tlVar.PxuCJdSBwIXG;
        lw1 lw1Var = (lw1) tlVar;
        float[] PxuCJdSBwIXG = lw1Var.Y1f8riQaR6yg.PxuCJdSBwIXG();
        vk2 vk2Var = lw1Var.RAsUl2FVSrh6;
        ColorSpace.Rgb.TransferParameters transferParameters = vk2Var != null ? new ColorSpace.Rgb.TransferParameters(vk2Var.lS5Rgt96tfkO, vk2Var.TSizfFm2Yiuu, vk2Var.Y1f8riQaR6yg, vk2Var.e9gEMXR7LXtO, vk2Var.a92UlCVFR9N8, vk2Var.RAsUl2FVSrh6, vk2Var.PxuCJdSBwIXG) : null;
        float[] fArr = lw1Var.OPXfSBeufaJ8;
        final int i = 0;
        if (transferParameters != null) {
            ColorSpace.Rgb rgb = new ColorSpace.Rgb(str, lw1Var.rtx2ld2ELZv4, PxuCJdSBwIXG, transferParameters);
            return (Float.isNaN(fArr[0]) || Arrays.equals(rgb.getTransform(), fArr)) ? rgb : new ColorSpace.Rgb(str, fArr, transferParameters);
        }
        float[] fArr2 = lw1Var.rtx2ld2ELZv4;
        final kw1 kw1Var = lw1Var.x50lh2ztY7Y5;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: ul
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i2 = i;
                le0 le0Var = kw1Var;
                switch (i2) {
                }
                return ((Number) le0Var.OPXfSBeufaJ8(Double.valueOf(d))).doubleValue();
            }
        };
        final kw1 kw1Var2 = lw1Var.QrzZRwfaDlRX;
        final int i2 = 1;
        return new ColorSpace.Rgb(str, fArr2, PxuCJdSBwIXG, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: ul
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i22 = i2;
                le0 le0Var = kw1Var2;
                switch (i22) {
                }
                return ((Number) le0Var.OPXfSBeufaJ8(Double.valueOf(d))).doubleValue();
            }
        }, lw1Var.e9gEMXR7LXtO, lw1Var.a92UlCVFR9N8);
    }

    public static float RAsUl2FVSrh6(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static Icon TSizfFm2Yiuu(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static AutofillId Y1f8riQaR6yg(View view) {
        return view.getAutofillId();
    }

    public static float a92UlCVFR9N8(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static void cpQdD2nAriOS(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void dgRBjINgWbAK(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static float e9gEMXR7LXtO(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static Notification.Builder lS5Rgt96tfkO(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static float rtx2ld2ELZv4(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void wdg6QnbFHrFF(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void x50lh2ztY7Y5(Notification.Builder builder) {
        builder.setShortcutId(null);
    }
}
