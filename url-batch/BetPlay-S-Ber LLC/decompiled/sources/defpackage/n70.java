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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class n70 {
    public static final op a;
    public static final wr b;
    public static Paint c;

    static {
        vw.h("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new r70();
        } else if (i >= 29) {
            a = new q70();
        } else if (i >= 28) {
            a = new p70();
        } else {
            a = new o70();
        }
        b = new wr(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, uj ujVar, Resources resources, int i, String str, int i2, int i3, l70 l70Var, boolean z) {
        Typeface o;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i4 = -3;
        if (ujVar instanceof xj) {
            xj xjVar = (xj) ujVar;
            String str2 = xjVar.d;
            o = null;
            int i5 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = xjVar.a;
                if (arrayList.size() == 1) {
                    build = c(((nj) arrayList.get(0)).e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= arrayList.size()) {
                                        break;
                                    }
                                    nj njVar = (nj) arrayList.get(i7);
                                    if (i7 == arrayList.size() - 1 && TextUtils.isEmpty(njVar.f)) {
                                        customFallbackBuilder.setSystemFallback(njVar.e);
                                        break;
                                    }
                                    String str3 = njVar.e;
                                    String str4 = njVar.f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + njVar.e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = y.v(d).build();
                                    } else {
                                        try {
                                            y.k();
                                            y.x();
                                            fontVariationSettings = i8.g(d).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = y.g(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = y.c(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i7++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((nj) arrayList.get(i6)).e) == null) {
                                    break;
                                }
                                i6++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (l70Var != null) {
                    new Handler(Looper.getMainLooper()).post(new c4(l70Var, build, 3));
                }
                b.j(b(resources, i, str, i2, i3), build);
                return build;
            }
            Object[] objArr4 = !z ? l70Var != null : xjVar.c != 0;
            int i8 = z ? xjVar.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            tx txVar = new tx();
            txVar.f = l70Var;
            ArrayList arrayList2 = xjVar.a;
            o00 o00Var = new o00(handler);
            h5 h5Var = new h5(txVar, o00Var, 7);
            int i9 = 4;
            if (objArr4 != true) {
                String a2 = tj.a(arrayList2, i3);
                Typeface typeface = (Typeface) tj.a.f(a2);
                if (typeface != null) {
                    o00Var.execute(new h1(txVar, typeface, i9, objArr2 == true ? 1 : 0));
                    o = typeface;
                } else {
                    rj rjVar = new rj(objArr == true ? 1 : 0, h5Var);
                    synchronized (tj.c) {
                        try {
                            h30 h30Var = tj.d;
                            ArrayList arrayList3 = (ArrayList) h30Var.get(a2);
                            if (arrayList3 != null) {
                                arrayList3.add(rjVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(rjVar);
                                h30Var.put(a2, arrayList4);
                                qj qjVar = new qj(a2, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = tj.b;
                                rj rjVar2 = new rj(i5, a2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                p00 p00Var = new p00();
                                p00Var.f = qjVar;
                                p00Var.g = rjVar2;
                                p00Var.h = handler2;
                                threadPoolExecutor.execute(p00Var);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    o8.j("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                nj njVar2 = (nj) arrayList2.get(0);
                wr wrVar = tj.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{njVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a3 = tj.a(Collections.unmodifiableList(arrayList5), i3);
                Typeface typeface2 = (Typeface) tj.a.f(a3);
                if (typeface2 != null) {
                    o00Var.execute(new h1(txVar, typeface2, i9, z2));
                    o = typeface2;
                } else if (i8 == -1) {
                    Object[] objArr5 = {njVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr5[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    sj b2 = tj.b(a3, context, Collections.unmodifiableList(arrayList6), i3);
                    h5Var.G(b2);
                    o = b2.a;
                } else {
                    try {
                        try {
                            try {
                                sj sjVar = (sj) tj.b.submit(new qj(a3, context, njVar2, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                h5Var.G(sjVar);
                                o = sjVar.a;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((o00) h5Var.h).execute(new y8(i4, (int) (objArr3 == true ? 1 : 0), h5Var.g));
                    }
                }
            }
        } else {
            o = a.o(context, (vj) ujVar, resources, i3);
            if (l70Var != null) {
                if (o != null) {
                    new Handler(Looper.getMainLooper()).post(new c4(l70Var, o, 3));
                } else {
                    l70Var.b(-3);
                }
            }
        }
        if (o != null) {
            b.j(b(resources, i, str, i2, i3), o);
        }
        return o;
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
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
