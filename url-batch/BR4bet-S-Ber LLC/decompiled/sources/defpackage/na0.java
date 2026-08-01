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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class na0 {
    public static final xf a;
    public static final fu b;
    public static Paint c;

    static {
        mz.f("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new ra0();
        } else if (i >= 29) {
            a = new qa0();
        } else if (i >= 28) {
            a = new pa0();
        } else {
            a = new oa0();
        }
        b = new fu(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, dm dmVar, Resources resources, int i, String str, int i2, int i3, b9 b9Var, boolean z) {
        Typeface k;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i4 = -3;
        if (dmVar instanceof gm) {
            gm gmVar = (gm) dmVar;
            String str2 = gmVar.d;
            k = null;
            int i5 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = gmVar.a;
                if (arrayList.size() == 1) {
                    build = c(((wl) arrayList.get(0)).e);
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
                                    wl wlVar = (wl) arrayList.get(i7);
                                    if (i7 == arrayList.size() - 1 && TextUtils.isEmpty(wlVar.f)) {
                                        customFallbackBuilder.setSystemFallback(wlVar.e);
                                        break;
                                    }
                                    String str3 = wlVar.e;
                                    String str4 = wlVar.f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + wlVar.e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = a0.w(d).build();
                                    } else {
                                        try {
                                            a0.l();
                                            ma0.k();
                                            fontVariationSettings = q8.g(d).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = a0.h(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = a0.e(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i7++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((wl) arrayList.get(i6)).e) == null) {
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
                if (b9Var != null) {
                    new Handler(Looper.getMainLooper()).post(new w3(b9Var, build, 3));
                }
                b.j(b(resources, i, str, i2, i3), build);
                return build;
            }
            Object[] objArr4 = !z ? b9Var != null : gmVar.c != 0;
            int i8 = z ? gmVar.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            pw pwVar = new pw();
            pwVar.f = b9Var;
            ArrayList arrayList2 = gmVar.a;
            c7 c7Var = new c7(handler);
            a5 a5Var = new a5(pwVar, c7Var, 9);
            int i9 = 5;
            if (objArr4 != true) {
                String a2 = cm.a(arrayList2, i3);
                Typeface typeface = (Typeface) cm.a.f(a2);
                if (typeface != null) {
                    c7Var.execute(new g1(pwVar, typeface, i9, objArr2 == true ? 1 : 0));
                    k = typeface;
                } else {
                    am amVar = new am(objArr == true ? 1 : 0, a5Var);
                    synchronized (cm.c) {
                        try {
                            w50 w50Var = cm.d;
                            ArrayList arrayList3 = (ArrayList) w50Var.get(a2);
                            if (arrayList3 != null) {
                                arrayList3.add(amVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(amVar);
                                w50Var.put(a2, arrayList4);
                                zl zlVar = new zl(a2, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = cm.b;
                                am amVar2 = new am(i5, a2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                hp hpVar = new hp();
                                hpVar.g = zlVar;
                                hpVar.h = amVar2;
                                hpVar.i = handler2;
                                threadPoolExecutor.execute(hpVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    g9.i("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                wl wlVar2 = (wl) arrayList2.get(0);
                fu fuVar = cm.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{wlVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a3 = cm.a(Collections.unmodifiableList(arrayList5), i3);
                Typeface typeface2 = (Typeface) cm.a.f(a3);
                if (typeface2 != null) {
                    c7Var.execute(new g1(pwVar, typeface2, i9, z2));
                    k = typeface2;
                } else if (i8 == -1) {
                    Object[] objArr5 = {wlVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr5[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    bm b2 = cm.b(a3, context, Collections.unmodifiableList(arrayList6), i3);
                    a5Var.M(b2);
                    k = b2.a;
                } else {
                    try {
                        try {
                            try {
                                bm bmVar = (bm) cm.b.submit(new zl(a3, context, wlVar2, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                a5Var.M(bmVar);
                                k = bmVar.a;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((c7) a5Var.h).execute(new q9(i4, (int) (objArr3 == true ? 1 : 0), a5Var.g));
                    }
                }
            }
        } else {
            k = a.k(context, (em) dmVar, resources, i3);
            if (b9Var != null) {
                if (k != null) {
                    new Handler(Looper.getMainLooper()).post(new w3(b9Var, k, 3));
                } else {
                    b9Var.c(-3);
                }
            }
        }
        if (k != null) {
            b.j(b(resources, i, str, i2, i3), k);
        }
        return k;
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
