package f0;

import a.v;
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
import androidx.emoji2.text.q;
import g1.y1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k0.l;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b4.d f1420a;

    /* renamed from: b, reason: collision with root package name */
    public static final y1 f1421b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f1422c;

    static {
        b4.d.j("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f1420a = new j();
        } else if (i >= 29) {
            f1420a = new i();
        } else if (i >= 28) {
            f1420a = new h();
        } else {
            f1420a = new g();
        }
        f1421b = new y1(16);
        f1422c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, e0.e eVar, Resources resources, int i, String str, int i4, int i5, e0.b bVar, boolean z4) {
        Typeface o4;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i6 = 2;
        int i7 = -3;
        if (eVar instanceof e0.h) {
            e0.h hVar = (e0.h) eVar;
            String str2 = hVar.d;
            o4 = null;
            int i8 = 1;
            int i9 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = hVar.f1329a;
                if (arrayList.size() == 1) {
                    build = c(((k0.d) arrayList.get(0)).f2284e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= arrayList.size()) {
                                        break;
                                    }
                                    k0.d dVar = (k0.d) arrayList.get(i11);
                                    if (i11 == arrayList.size() - 1 && TextUtils.isEmpty(dVar.f2285f)) {
                                        customFallbackBuilder.setSystemFallback(dVar.f2284e);
                                        break;
                                    }
                                    String str3 = dVar.f2284e;
                                    String str4 = dVar.f2285f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + dVar.f2284e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = v.i(d).build();
                                    } else {
                                        try {
                                            v.l();
                                            v.y();
                                            fontVariationSettings = e.g(d).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = v.i(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = v.d(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i11++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((k0.d) arrayList.get(i10)).f2284e) == null) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new a.b(bVar, build, i6));
                }
                f1421b.j(b(resources, i, str, i4, i5), build);
                return build;
            }
            boolean z5 = !z4 ? bVar != null : hVar.f1331c != 0;
            int i12 = z4 ? hVar.f1330b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            a0.a aVar = new a0.a(9);
            aVar.f79g = bVar;
            ArrayList arrayList2 = hVar.f1329a;
            g1.d dVar2 = new g1.d(handler);
            q qVar = new q(aVar, dVar2, 12);
            int i13 = 5;
            if (!z5) {
                String a5 = k0.h.a(arrayList2, i5);
                Typeface typeface = (Typeface) k0.h.f2295a.f(a5);
                if (typeface != null) {
                    dVar2.execute(new androidx.fragment.app.e(aVar, typeface, i13));
                    o4 = typeface;
                } else {
                    k0.f fVar = new k0.f(i9, qVar);
                    synchronized (k0.h.f2297c) {
                        try {
                            q.j jVar = k0.h.d;
                            ArrayList arrayList3 = (ArrayList) jVar.get(a5);
                            if (arrayList3 != null) {
                                arrayList3.add(fVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(fVar);
                                jVar.put(a5, arrayList4);
                                k0.e eVar2 = new k0.e(a5, context, arrayList2, i5, 1);
                                ThreadPoolExecutor threadPoolExecutor = k0.h.f2296b;
                                k0.f fVar2 = new k0.f(i8, a5);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                l lVar = new l();
                                lVar.f2304f = eVar2;
                                lVar.f2305g = fVar2;
                                lVar.h = handler2;
                                threadPoolExecutor.execute(lVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                k0.d dVar3 = (k0.d) arrayList2.get(0);
                y1 y1Var = k0.h.f2295a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{dVar3}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a6 = k0.h.a(Collections.unmodifiableList(arrayList5), i5);
                Typeface typeface2 = (Typeface) k0.h.f2295a.f(a6);
                if (typeface2 != null) {
                    dVar2.execute(new androidx.fragment.app.e(aVar, typeface2, i13));
                    o4 = typeface2;
                } else if (i12 == -1) {
                    Object[] objArr = {dVar3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    k0.g b2 = k0.h.b(a6, context, Collections.unmodifiableList(arrayList6), i5);
                    qVar.E(b2);
                    o4 = b2.f2293a;
                } else {
                    try {
                        try {
                            try {
                                k0.g gVar = (k0.g) k0.h.f2296b.submit(new k0.e(a6, context, dVar3, i5, 0)).get(i12, TimeUnit.MILLISECONDS);
                                qVar.E(gVar);
                                o4 = gVar.f2293a;
                            } catch (InterruptedException e4) {
                                throw e4;
                            }
                        } catch (ExecutionException e5) {
                            throw new RuntimeException(e5);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((g1.d) qVar.h).execute(new androidx.emoji2.text.j(i7, i6, (a0.a) qVar.f466g));
                    }
                }
            }
        } else {
            o4 = f1420a.o(context, (e0.f) eVar, resources, i5);
            if (bVar != null) {
                if (o4 != null) {
                    new Handler(Looper.getMainLooper()).post(new a.b(bVar, o4, i6));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (o4 != null) {
            f1421b.j(b(resources, i, str, i4, i5), o4);
        }
        return o4;
    }

    public static String b(Resources resources, int i, String str, int i4, int i5) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i4 + '-' + i + '-' + i5;
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
        if (f1422c == null) {
            f1422c = new Paint();
        }
        f1422c.setTextSize(10.0f);
        f1422c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f1422c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
