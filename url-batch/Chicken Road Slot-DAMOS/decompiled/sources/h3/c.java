package h3;

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
import androidx.lifecycle.i0;
import b7.e0;
import c6.l;
import com.google.android.gms.internal.measurement.cf;
import f8.j0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m.u;
import s.r;
import s.r0;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a.a f4447a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f4448b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f4449c;

    static {
        i7.a.n("TypefaceCompat static init");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            f4447a = new i();
        } else if (i3 >= 29) {
            f4447a = new h();
        } else if (i3 >= 28) {
            f4447a = new g();
        } else if (i3 >= 26) {
            f4447a = new f();
        } else {
            Method method = e.f4457c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f4447a = new e();
            } else {
                f4447a = new d();
            }
        }
        f4448b = new r(16);
        f4449c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, g3.d dVar, Resources resources, int i3, String str, int i10, int i11, u uVar, boolean z10) {
        Typeface m10;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i12 = 10;
        int i13 = -3;
        if (dVar instanceof g3.g) {
            g3.g gVar = (g3.g) dVar;
            String str2 = gVar.f4251d;
            m10 = null;
            int i14 = 1;
            boolean z11 = false;
            Object[] objArr = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = gVar.f4248a;
                if (arrayList.size() == 1) {
                    build = c(((l3.c) arrayList.get(0)).f5838e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i15 = 0;
                        while (true) {
                            if (i15 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= arrayList.size()) {
                                        break;
                                    }
                                    l3.c cVar = (l3.c) arrayList.get(i16);
                                    if (i16 == arrayList.size() - 1 && TextUtils.isEmpty(cVar.f5839f)) {
                                        customFallbackBuilder.setSystemFallback(cVar.f5838e);
                                        break;
                                    }
                                    String str3 = cVar.f5838e;
                                    String str4 = cVar.f5839f;
                                    Font d10 = d(c(str3));
                                    if (d10 == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + cVar.f5838e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = i0.g(d10).build();
                                    } else {
                                        try {
                                            i0.l();
                                            i0.x();
                                            fontVariationSettings = a7.h.f(d10).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = i0.g(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = i0.c(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i16++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((l3.c) arrayList.get(i15)).f5838e) == null) {
                                    break;
                                }
                                i15++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (uVar != null) {
                    new Handler(Looper.getMainLooper()).post(new a6.f(i12, uVar, build));
                }
                f4448b.d(b(resources, i3, str, i10, i11), build);
                return build;
            }
            Object[] objArr2 = !z10 ? uVar != null : gVar.f4250c != 0;
            int i17 = z10 ? gVar.f4249b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            d9.c cVar2 = new d9.c(23, z11);
            cVar2.f3701e = uVar;
            ArrayList arrayList2 = gVar.f4248a;
            e0 e0Var = new e0(handler, 1);
            l lVar = new l(7, cVar2, e0Var);
            int i18 = 3;
            int i19 = 9;
            if (objArr2 != true) {
                String a9 = l3.g.a(i11, arrayList2);
                Typeface typeface = (Typeface) l3.g.f5849a.c(a9);
                if (typeface != null) {
                    e0Var.execute(new j0(i19, cVar2, typeface));
                    m10 = typeface;
                } else {
                    l3.e eVar = new l3.e(objArr == true ? 1 : 0, lVar);
                    synchronized (l3.g.f5851c) {
                        try {
                            r0 r0Var = l3.g.f5852d;
                            ArrayList arrayList3 = (ArrayList) r0Var.get(a9);
                            if (arrayList3 != null) {
                                arrayList3.add(eVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(eVar);
                                r0Var.put(a9, arrayList4);
                                l3.d dVar2 = new l3.d(a9, context, arrayList2, i11, 1);
                                ThreadPoolExecutor threadPoolExecutor = l3.g.f5850b;
                                l3.e eVar2 = new l3.e(i14, a9);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                cf cfVar = new cf(i18);
                                cfVar.f2202e = dVar2;
                                cfVar.f2203i = eVar2;
                                cfVar.f2204r = handler2;
                                threadPoolExecutor.execute(cfVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    a1.e("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                l3.c cVar3 = (l3.c) arrayList2.get(0);
                r rVar = l3.g.f5849a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{cVar3}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a10 = l3.g.a(i11, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) l3.g.f5849a.c(a10);
                if (typeface2 != null) {
                    e0Var.execute(new j0(i19, cVar2, typeface2));
                    m10 = typeface2;
                } else if (i17 == -1) {
                    Object[] objArr3 = {cVar3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr3[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    l3.f b10 = l3.g.b(a10, context, Collections.unmodifiableList(arrayList6), i11);
                    lVar.h(b10);
                    m10 = b10.f5847a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    l3.f fVar = (l3.f) l3.g.f5850b.submit(new l3.d(a10, context, cVar3, i11, 0)).get(i17, TimeUnit.MILLISECONDS);
                                    lVar.h(fVar);
                                    m10 = fVar.f5847a;
                                } catch (TimeoutException unused2) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e2) {
                                throw e2;
                            }
                        } catch (ExecutionException e9) {
                            throw new RuntimeException(e9);
                        }
                    } catch (InterruptedException unused3) {
                        ((e0) lVar.f1830i).execute(new b6.d(i13, i18, (d9.c) lVar.f1829e));
                    }
                }
            }
        } else {
            m10 = f4447a.m(context, (g3.e) dVar, resources, i11);
            if (uVar != null) {
                if (m10 != null) {
                    new Handler(Looper.getMainLooper()).post(new a6.f(i12, uVar, m10));
                } else {
                    uVar.a(-3);
                }
            }
        }
        if (m10 != null) {
            f4448b.d(b(resources, i3, str, i10, i11), m10);
        }
        return m10;
    }

    public static String b(Resources resources, int i3, String str, int i10, int i11) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i10 + '-' + i3 + '-' + i11;
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
        if (f4449c == null) {
            f4449c = new Paint();
        }
        f4449c.setTextSize(10.0f);
        f4449c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f4449c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
