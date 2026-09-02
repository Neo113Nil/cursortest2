package f0;

import a.u;
import a.y;
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
import f1.j1;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final y f1272a;

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f1273b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f1274c;

    static {
        h.a.e("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f1272a = new m();
        } else if (i >= 29) {
            f1272a = new l();
        } else if (i >= 28) {
            f1272a = new k();
        } else if (i >= 26) {
            f1272a = new j();
        } else {
            Method method = i.f1282p;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f1272a = new i();
            } else {
                f1272a = new h();
            }
        }
        f1273b = new j1(16);
        f1274c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, e0.e eVar, Resources resources, int i, String str, int i4, int i5, e0.b bVar, boolean z3) {
        Typeface r3;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i6 = -3;
        int i7 = 1;
        if (eVar instanceof e0.h) {
            e0.h hVar = (e0.h) eVar;
            String str2 = hVar.d;
            r3 = null;
            boolean z4 = false;
            Object[] objArr = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = hVar.f1147a;
                if (arrayList.size() == 1) {
                    build = c(((k0.d) arrayList.get(0)).f2136e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i8 = 0;
                        while (true) {
                            if (i8 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= arrayList.size()) {
                                        break;
                                    }
                                    k0.d dVar = (k0.d) arrayList.get(i9);
                                    if (i9 == arrayList.size() - 1 && TextUtils.isEmpty(dVar.f2137f)) {
                                        customFallbackBuilder.setSystemFallback(dVar.f2136e);
                                        break;
                                    }
                                    String str3 = dVar.f2136e;
                                    String str4 = dVar.f2137f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + dVar.f2136e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        try {
                                            u.l();
                                            u.y();
                                            fontVariationSettings = f.f(d).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = u.i(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    } else {
                                        build3 = u.i(d).build();
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = u.d(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i9++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((k0.d) arrayList.get(i8)).f2136e) == null) {
                                    break;
                                }
                                i8++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new a.b(bVar, build, 1));
                }
                f1273b.j(b(resources, i, str, i4, i5), build);
                return build;
            }
            Object[] objArr2 = !z3 ? bVar != null : hVar.f1149c != 0;
            int i10 = z3 ? hVar.f1148b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            a0.a aVar = new a0.a(11, z4);
            aVar.f81g = bVar;
            ArrayList arrayList2 = hVar.f1147a;
            k0.l lVar = new k0.l(handler);
            q qVar = new q(aVar, lVar, 12);
            if (objArr2 != true) {
                String a2 = k0.h.a(arrayList2, i5);
                Typeface typeface = (Typeface) k0.h.f2147a.f(a2);
                if (typeface != null) {
                    lVar.execute(new androidx.fragment.app.e(aVar, typeface, 4));
                    r3 = typeface;
                } else {
                    k0.f fVar = new k0.f(objArr == true ? 1 : 0, qVar);
                    synchronized (k0.h.f2149c) {
                        try {
                            q.j jVar = k0.h.d;
                            ArrayList arrayList3 = (ArrayList) jVar.get(a2);
                            if (arrayList3 != null) {
                                arrayList3.add(fVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(fVar);
                                jVar.put(a2, arrayList4);
                                k0.e eVar2 = new k0.e(a2, context, arrayList2, i5, 1);
                                ThreadPoolExecutor threadPoolExecutor = k0.h.f2148b;
                                k0.f fVar2 = new k0.f(i7, a2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                k0.m mVar = new k0.m();
                                mVar.f2157f = eVar2;
                                mVar.f2158g = fVar2;
                                mVar.f2159h = handler2;
                                threadPoolExecutor.execute(mVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                k0.d dVar2 = (k0.d) arrayList2.get(0);
                j1 j1Var = k0.h.f2147a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{dVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a4 = k0.h.a(Collections.unmodifiableList(arrayList5), i5);
                Typeface typeface2 = (Typeface) k0.h.f2147a.f(a4);
                if (typeface2 != null) {
                    lVar.execute(new androidx.fragment.app.e(aVar, typeface2, 4));
                    r3 = typeface2;
                } else if (i10 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{dVar2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    k0.g b4 = k0.h.b(a4, context, Collections.unmodifiableList(arrayList6), i5);
                    qVar.C(b4);
                    r3 = b4.f2145a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    k0.g gVar = (k0.g) k0.h.f2148b.submit(new k0.e(a4, context, dVar2, i5, 0)).get(i10, TimeUnit.MILLISECONDS);
                                    qVar.C(gVar);
                                    r3 = gVar.f2145a;
                                } catch (ExecutionException e4) {
                                    throw new RuntimeException(e4);
                                }
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e5) {
                            throw e5;
                        }
                    } catch (InterruptedException unused3) {
                        ((k0.l) qVar.f347h).execute(new androidx.emoji2.text.j(i6, 3, (a0.a) qVar.f346g));
                    }
                }
            }
        } else {
            r3 = f1272a.r(context, (e0.f) eVar, resources, i5);
            if (bVar != null) {
                if (r3 != null) {
                    new Handler(Looper.getMainLooper()).post(new a.b(bVar, r3, 1));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (r3 != null) {
            f1273b.j(b(resources, i, str, i4, i5), r3);
        }
        return r3;
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
        if (f1274c == null) {
            f1274c = new Paint();
        }
        f1274c.setTextSize(10.0f);
        f1274c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f1274c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
