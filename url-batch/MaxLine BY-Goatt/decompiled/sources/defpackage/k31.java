package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.text.StaticLayout;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class k31 {
    public static Context a;
    public static Boolean b;

    public static void A(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static final void B(StaticLayout.Builder builder, int i) {
        builder.setJustificationMode(i);
    }

    public static void C(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void D(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void E(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void F(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void G(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static final Bitmap.Config H(int i) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i2 < 26 || i != 4) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    public static final int I(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config3 = Bitmap.Config.RGBA_F16;
            if (config == config3) {
                return 3;
            }
        }
        if (i < 26) {
            return 0;
        }
        config2 = Bitmap.Config.HARDWARE;
        return config == config2 ? 4 : 0;
    }

    public static final Bitmap a(y9 y9Var) {
        if (y9Var instanceof y9) {
            return y9Var.a;
        }
        ch2.h("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static boolean b(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public static boolean c(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public static boolean d(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    public static boolean e(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public static boolean f(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public static final Bitmap g(int i, int i2, int i3, iw iwVar) {
        Bitmap.Config config;
        ColorSpace colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace m;
        ColorSpace colorSpace2;
        Bitmap.Config H = H(i3);
        if (Intrinsics.b(iwVar, kw.e)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (Intrinsics.b(iwVar, kw.q)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (Intrinsics.b(iwVar, kw.r)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (Intrinsics.b(iwVar, kw.o)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (Intrinsics.b(iwVar, kw.j)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (Intrinsics.b(iwVar, kw.i)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (Intrinsics.b(iwVar, kw.t)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (Intrinsics.b(iwVar, kw.s)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (Intrinsics.b(iwVar, kw.k)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (Intrinsics.b(iwVar, kw.l)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (Intrinsics.b(iwVar, kw.g)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (Intrinsics.b(iwVar, kw.h)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (Intrinsics.b(iwVar, kw.f)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (Intrinsics.b(iwVar, kw.m)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (Intrinsics.b(iwVar, kw.p)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!Intrinsics.b(iwVar, kw.n)) {
                if (Build.VERSION.SDK_INT >= 34 && (m = v1.m(iwVar)) != null) {
                    colorSpace = m;
                    config = H;
                    return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace);
                }
                if (iwVar instanceof pa2) {
                    String str = iwVar.a;
                    pa2 pa2Var = (pa2) iwVar;
                    float[] a2 = pa2Var.d.a();
                    vy2 vy2Var = pa2Var.g;
                    if (vy2Var != null) {
                        config = H;
                        transferParameters = new ColorSpace.Rgb.TransferParameters(vy2Var.b, vy2Var.c, vy2Var.d, vy2Var.e, vy2Var.f, vy2Var.g, vy2Var.a);
                    } else {
                        config = H;
                        transferParameters = null;
                    }
                    if (transferParameters != null) {
                        colorSpace = new ColorSpace.Rgb(str, pa2Var.h, a2, transferParameters);
                    } else {
                        float[] fArr = pa2Var.h;
                        final oa2 oa2Var = pa2Var.l;
                        final int i4 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: jw
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i5 = i4;
                                Function1 function1 = oa2Var;
                                switch (i5) {
                                }
                                return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
                            }
                        };
                        final oa2 oa2Var2 = pa2Var.o;
                        final int i5 = 1;
                        colorSpace = new ColorSpace.Rgb(str, fArr, a2, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: jw
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i52 = i5;
                                Function1 function1 = oa2Var2;
                                switch (i52) {
                                }
                                return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
                            }
                        }, pa2Var.e, pa2Var.f);
                    }
                } else {
                    config = H;
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace);
            }
            colorSpace2 = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        colorSpace = colorSpace2;
        config = H;
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace);
    }

    public static Notification.Builder h(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon i(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static void j(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        i = configuration.colorMode;
        int i7 = i & 3;
        i2 = configuration2.colorMode;
        int i8 = i2 & 3;
        if (i7 != i8) {
            i6 = configuration3.colorMode;
            configuration3.colorMode = i6 | i8;
        }
        i3 = configuration.colorMode;
        int i9 = i3 & 12;
        i4 = configuration2.colorMode;
        int i10 = i4 & 12;
        if (i9 != i10) {
            i5 = configuration3.colorMode;
            configuration3.colorMode = i5 | i10;
        }
    }

    public static final int k(Bitmap bitmap) {
        int i;
        Bitmap.Config config;
        if (bitmap.isRecycled()) {
            StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
            sb.append(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Bitmap.Config config2 = bitmap.getConfig();
            sb.append(" [");
            sb.append(width);
            sb.append(" x ");
            sb.append(height);
            sb.append("] + ");
            sb.append(config2);
            throw new IllegalStateException(sb.toString().toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height2 = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config3 = bitmap.getConfig();
            if (config3 == Bitmap.Config.ALPHA_8) {
                i = 1;
            } else if (config3 == Bitmap.Config.RGB_565 || config3 == Bitmap.Config.ARGB_4444) {
                i = 2;
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    config = Bitmap.Config.RGBA_F16;
                    if (config3 == config) {
                        i = 8;
                    }
                }
                i = 4;
            }
            return height2 * i;
        }
    }

    public static AutofillId l(View view) {
        return view.getAutofillId();
    }

    public static float m(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float n(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static final boolean o(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        config2 = Bitmap.Config.HARDWARE;
        return config == config2;
    }

    public static synchronized boolean p(Context context) {
        Boolean bool;
        synchronized (k31.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            b = null;
            if (s03.A()) {
                b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    b = Boolean.FALSE;
                }
            }
            a = applicationContext;
            return b.booleanValue();
        }
    }

    public static boolean q(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void r(t7 t7Var) {
        ViewParent parent = t7Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(t7Var, t7Var);
        }
    }

    public static final void s(t6 t6Var, SparseArray sparseArray) {
        if (t6Var.b.a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue a2 = a.a(sparseArray.get(keyAt));
            if (a2.isText()) {
                om omVar = t6Var.b;
                a2.getTextValue().toString();
                if (omVar.a.get(Integer.valueOf(keyAt)) != null) {
                    b71.o();
                    return;
                }
            } else {
                if (a2.isDate()) {
                    throw new ws1("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (a2.isList()) {
                    throw new ws1("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (a2.isToggle()) {
                    throw new ws1("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static Intent t(Context context, nf nfVar, IntentFilter intentFilter) {
        return context.registerReceiver(nfVar, intentFilter, null, null, 0);
    }

    public static Intent u(Context context, nf nfVar, IntentFilter intentFilter) {
        return context.registerReceiver(nfVar, intentFilter, null, null, 2);
    }

    public static void v(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void w(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void x(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void y(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void z(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }
}
