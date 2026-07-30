package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class w03 {
    public static final th2 a;
    public static final yg1 b;
    public static Paint c;

    static {
        ak2.f("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new d13();
        } else if (i >= 29) {
            a = new c13();
        } else if (i >= 28) {
            a = new b13();
        } else if (i >= 26) {
            a = new a13();
        } else {
            Method method = y03.c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new y03();
            } else {
                a = new x03();
            }
        }
        b = new yg1(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, yp0 yp0Var, Resources resources, int i, String str, int i2, int i3, sg sgVar, boolean z) {
        Typeface d;
        Typeface build;
        FontFamily build2;
        int i4 = 19;
        int i5 = -3;
        if (yp0Var instanceof bq0) {
            bq0 bq0Var = (bq0) yp0Var;
            String str2 = bq0Var.d;
            d = null;
            int i6 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = bq0Var.a;
                if (arrayList.size() == 1) {
                    build = c(((rp0) arrayList.get(0)).e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= arrayList.size()) {
                                        break;
                                    }
                                    rp0 rp0Var = (rp0) arrayList.get(i8);
                                    if (i8 == arrayList.size() - 1 && TextUtils.isEmpty(rp0Var.f)) {
                                        customFallbackBuilder.setSystemFallback(rp0Var.e);
                                        break;
                                    }
                                    String str3 = rp0Var.e;
                                    String str4 = rp0Var.f;
                                    Font d2 = d(c(str3));
                                    if (d2 == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + rp0Var.e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build2 = new FontFamily.Builder(d2).build();
                                    } else {
                                        try {
                                            build2 = new FontFamily.Builder(i20.a(d2).setFontVariationSettings(str4).build()).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build2);
                                    }
                                    i8++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((rp0) arrayList.get(i7)).e) == null) {
                                    break;
                                }
                                i7++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (sgVar != null) {
                    new Handler(Looper.getMainLooper()).post(new q1(i4, sgVar, build));
                }
                b.d(b(resources, i, str, i2, i3), build);
                return build;
            }
            Object[] objArr3 = !z ? sgVar != null : bq0Var.c != 0;
            int i9 = z ? bq0Var.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            ot2 ot2Var = new ot2(4, z2);
            ot2Var.n = sgVar;
            ArrayList arrayList2 = bq0Var.a;
            e92 e92Var = new e92(0, handler);
            t21 t21Var = new t21(8, ot2Var, e92Var);
            int i10 = 6;
            if (objArr3 != true) {
                String a2 = xp0.a(i3, arrayList2);
                Typeface typeface = (Typeface) xp0.a.c(a2);
                if (typeface != null) {
                    e92Var.execute(new iu0(i10, ot2Var, typeface));
                    d = typeface;
                } else {
                    vp0 vp0Var = new vp0(objArr == true ? 1 : 0, t21Var);
                    synchronized (xp0.c) {
                        try {
                            fl2 fl2Var = xp0.d;
                            ArrayList arrayList3 = (ArrayList) fl2Var.get(a2);
                            if (arrayList3 != null) {
                                arrayList3.add(vp0Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(vp0Var);
                                fl2Var.put(a2, arrayList4);
                                up0 up0Var = new up0(a2, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = xp0.b;
                                vp0 vp0Var2 = new vp0(i6, a2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                f92 f92Var = new f92();
                                f92Var.n = up0Var;
                                f92Var.o = vp0Var2;
                                f92Var.p = handler2;
                                threadPoolExecutor.execute(f92Var);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    lh.e("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                rp0 rp0Var2 = (rp0) arrayList2.get(0);
                yg1 yg1Var = xp0.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{rp0Var2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a3 = xp0.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) xp0.a.c(a3);
                if (typeface2 != null) {
                    e92Var.execute(new iu0(i10, ot2Var, typeface2));
                    d = typeface2;
                } else if (i9 == -1) {
                    Object[] objArr4 = {rp0Var2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr4[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    wp0 b2 = xp0.b(a3, context, Collections.unmodifiableList(arrayList6), i3);
                    t21Var.G(b2);
                    d = b2.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    wp0 wp0Var = (wp0) xp0.b.submit(new up0(a3, context, rp0Var2, i3, 0)).get(i9, TimeUnit.MILLISECONDS);
                                    t21Var.G(wp0Var);
                                    d = wp0Var.a;
                                } catch (TimeoutException unused2) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused3) {
                        ((e92) t21Var.o).execute(new xr(i5, (int) (objArr2 == true ? 1 : 0), t21Var.n));
                    }
                }
            }
        } else {
            d = a.d(context, (zp0) yp0Var, resources, i3);
            if (sgVar != null) {
                if (d != null) {
                    new Handler(Looper.getMainLooper()).post(new q1(i4, sgVar, d));
                } else {
                    sgVar.a(-3);
                }
            }
        }
        if (d != null) {
            b.d(b(resources, i, str, i2, i3), d);
        }
        return d;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (shapeTextRun.glyphCount() == 0) {
            return null;
        }
        return shapeTextRun.getFont(0);
    }
}
