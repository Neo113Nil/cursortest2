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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class ik0 {
    public static final ud0 a;
    public static final fz b;
    public static Paint c;

    static {
        zb0.b("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new mk0();
        } else if (i >= 29) {
            a = new lk0();
        } else if (i >= 28) {
            a = new kk0();
        } else {
            a = new jk0();
        }
        b = new fz(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, jp jpVar, Resources resources, int i, String str, int i2, int i3, bi biVar, boolean z) {
        Typeface e;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i4 = -3;
        if (jpVar instanceof mp) {
            mp mpVar = (mp) jpVar;
            String str2 = mpVar.d;
            e = null;
            int i5 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = mpVar.a;
                if (arrayList.size() == 1) {
                    build = c(((cp) arrayList.get(0)).e);
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
                                    cp cpVar = (cp) arrayList.get(i7);
                                    if (i7 == arrayList.size() - 1 && TextUtils.isEmpty(cpVar.f)) {
                                        customFallbackBuilder.setSystemFallback(cpVar.e);
                                        break;
                                    }
                                    String str3 = cpVar.e;
                                    String str4 = cpVar.f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + cpVar.e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = c0.w(d).build();
                                    } else {
                                        try {
                                            c0.l();
                                            hk0.k();
                                            fontVariationSettings = c9.g(d).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = c0.h(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = c0.e(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i7++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((cp) arrayList.get(i6)).e) == null) {
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
                if (biVar != null) {
                    new Handler(Looper.getMainLooper()).post(new e4(biVar, build, 3));
                }
                b.j(b(resources, i, str, i2, i3), build);
                return build;
            }
            Object[] objArr4 = !z ? biVar != null : mpVar.c != 0;
            int i8 = z ? mpVar.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            kz kzVar = new kz();
            kzVar.f = biVar;
            ArrayList arrayList2 = mpVar.a;
            l7 l7Var = new l7(handler);
            i5 i5Var = new i5(kzVar, l7Var, 9);
            int i9 = 5;
            if (objArr4 != true) {
                String a2 = ip.a(arrayList2, i3);
                Typeface typeface = (Typeface) ip.a.f(a2);
                if (typeface != null) {
                    l7Var.execute(new j1(kzVar, typeface, i9, objArr2 == true ? 1 : 0));
                    e = typeface;
                } else {
                    gp gpVar = new gp(objArr == true ? 1 : 0, i5Var);
                    synchronized (ip.c) {
                        try {
                            zd0 zd0Var = ip.d;
                            ArrayList arrayList3 = (ArrayList) zd0Var.get(a2);
                            if (arrayList3 != null) {
                                arrayList3.add(gpVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(gpVar);
                                zd0Var.put(a2, arrayList4);
                                fp fpVar = new fp(a2, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = ip.b;
                                gp gpVar2 = new gp(i5, a2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                ys ysVar = new ys();
                                ysVar.g = fpVar;
                                ysVar.h = gpVar2;
                                ysVar.i = handler2;
                                threadPoolExecutor.execute(ysVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    s9.k("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                cp cpVar2 = (cp) arrayList2.get(0);
                fz fzVar = ip.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{cpVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a3 = ip.a(Collections.unmodifiableList(arrayList5), i3);
                Typeface typeface2 = (Typeface) ip.a.f(a3);
                if (typeface2 != null) {
                    l7Var.execute(new j1(kzVar, typeface2, i9, z2));
                    e = typeface2;
                } else if (i8 == -1) {
                    Object[] objArr5 = {cpVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr5[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    hp b2 = ip.b(a3, context, Collections.unmodifiableList(arrayList6), i3);
                    i5Var.J(b2);
                    e = b2.a;
                } else {
                    try {
                        try {
                            try {
                                hp hpVar = (hp) ip.b.submit(new fp(a3, context, cpVar2, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                i5Var.J(hpVar);
                                e = hpVar.a;
                            } catch (InterruptedException e2) {
                                throw e2;
                            }
                        } catch (ExecutionException e3) {
                            throw new RuntimeException(e3);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((l7) i5Var.h).execute(new fa(i4, (int) (objArr3 == true ? 1 : 0), i5Var.g));
                    }
                }
            }
        } else {
            e = a.e(context, (kp) jpVar, resources, i3);
            if (biVar != null) {
                if (e != null) {
                    new Handler(Looper.getMainLooper()).post(new e4(biVar, e, 3));
                } else {
                    biVar.k(-3);
                }
            }
        }
        if (e != null) {
            b.j(b(resources, i, str, i2, i3), e);
        }
        return e;
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
