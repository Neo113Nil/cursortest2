package i3;

import a0.a0;
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
import o.s;
import o.t0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final h0.a f3428a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f3429b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f3430c;

    static {
        a.a.e("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f3428a = new m();
        } else if (i >= 29) {
            f3428a = new l();
        } else if (i >= 28) {
            f3428a = new k();
        } else if (i >= 26) {
            f3428a = new j();
        } else {
            Method method = i.f3438d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f3428a = new i();
            } else {
                f3428a = new h();
            }
        }
        f3429b = new s(16);
        f3430c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, h3.d dVar, Resources resources, int i, String str, int i8, int i9, h3.b bVar, boolean z3) {
        Typeface s5;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i10 = 2;
        if (dVar instanceof h3.g) {
            h3.g gVar = (h3.g) dVar;
            String str2 = gVar.f3141d;
            s5 = null;
            int i11 = 1;
            boolean z7 = false;
            Object[] objArr = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = gVar.f3138a;
                if (arrayList.size() == 1) {
                    build = c(((n3.c) arrayList.get(0)).f5343e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= arrayList.size()) {
                                        break;
                                    }
                                    n3.c cVar = (n3.c) arrayList.get(i13);
                                    if (i13 == arrayList.size() - 1 && TextUtils.isEmpty(cVar.f5344f)) {
                                        customFallbackBuilder.setSystemFallback(cVar.f5343e);
                                        break;
                                    }
                                    String str3 = cVar.f5343e;
                                    String str4 = cVar.f5344f;
                                    Font d8 = d(c(str3));
                                    if (d8 == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + cVar.f5343e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        try {
                                            i1.f.h();
                                            i1.f.q();
                                            fontVariationSettings = a1.c.e(d8).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = i1.f.f(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    } else {
                                        build3 = i1.f.f(d8).build();
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = i1.f.c(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i13++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((n3.c) arrayList.get(i12)).f5343e) == null) {
                                    break;
                                }
                                i12++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new a1.e(i10, bVar, build));
                }
                f3429b.f(b(resources, i, str, i8, i9), build);
                return build;
            }
            Object[] objArr2 = !z3 ? bVar != null : gVar.f3140c != 0;
            int i14 = z3 ? gVar.f3139b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            b1.b bVar2 = new b1.b(13, z7);
            bVar2.f1050e = bVar;
            ArrayList arrayList2 = gVar.f3138a;
            n3.k kVar = new n3.k(handler);
            a0 a0Var = new a0(14, bVar2, kVar);
            int i15 = 4;
            if (objArr2 != true) {
                String a8 = n3.g.a(i9, arrayList2);
                Typeface typeface = (Typeface) n3.g.f5355a.c(a8);
                if (typeface != null) {
                    kVar.execute(new b7.d(i15, bVar2, typeface));
                    s5 = typeface;
                } else {
                    n3.e eVar = new n3.e(objArr == true ? 1 : 0, a0Var);
                    synchronized (n3.g.f5357c) {
                        try {
                            t0 t0Var = n3.g.f5358d;
                            ArrayList arrayList3 = (ArrayList) t0Var.get(a8);
                            if (arrayList3 != null) {
                                arrayList3.add(eVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(eVar);
                                t0Var.put(a8, arrayList4);
                                n3.d dVar2 = new n3.d(a8, context, arrayList2, i9, 1);
                                ThreadPoolExecutor threadPoolExecutor = n3.g.f5356b;
                                n3.e eVar2 = new n3.e(i11, a8);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                n3.l lVar = new n3.l();
                                lVar.f5367d = dVar2;
                                lVar.f5368e = eVar2;
                                lVar.f5369f = handler2;
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
                n3.c cVar2 = (n3.c) arrayList2.get(0);
                s sVar = n3.g.f5355a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{cVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a9 = n3.g.a(i9, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) n3.g.f5355a.c(a9);
                if (typeface2 != null) {
                    kVar.execute(new b7.d(i15, bVar2, typeface2));
                    s5 = typeface2;
                } else if (i14 == -1) {
                    Object[] objArr3 = {cVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr3[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    n3.f b8 = n3.g.b(a9, context, Collections.unmodifiableList(arrayList6), i9);
                    a0Var.r(b8);
                    s5 = b8.f5353a;
                } else {
                    try {
                        try {
                            try {
                                n3.f fVar = (n3.f) n3.g.f5356b.submit(new n3.d(a9, context, cVar2, i9, 0)).get(i14, TimeUnit.MILLISECONDS);
                                a0Var.r(fVar);
                                s5 = fVar.f5353a;
                            } catch (InterruptedException e8) {
                                throw e8;
                            }
                        } catch (ExecutionException e9) {
                            throw new RuntimeException(e9);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((n3.k) a0Var.f12f).execute(new d4.j((b1.b) a0Var.f11e, -3));
                    }
                }
            }
        } else {
            s5 = f3428a.s(context, (h3.e) dVar, resources, i9);
            if (bVar != null) {
                if (s5 != null) {
                    new Handler(Looper.getMainLooper()).post(new a1.e(i10, bVar, s5));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (s5 != null) {
            f3429b.f(b(resources, i, str, i8, i9), s5);
        }
        return s5;
    }

    public static String b(Resources resources, int i, String str, int i8, int i9) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i8 + '-' + i + '-' + i9;
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
        if (f3430c == null) {
            f3430c = new Paint();
        }
        f3430c.setTextSize(10.0f);
        f3430c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f3430c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
