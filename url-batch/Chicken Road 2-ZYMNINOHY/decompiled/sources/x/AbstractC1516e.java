package x;

import B.o;
import N3.A;
import O3.l;
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
import c0.AbstractC0268a;
import e0.t;
import g0.p;
import i2.AbstractC0457a;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p1.z;
import w.C1482b;
import w.C1484d;
import w.InterfaceC1481a;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1516e {

    /* renamed from: a, reason: collision with root package name */
    public static final l f15959a;

    /* renamed from: b, reason: collision with root package name */
    public static final p.i f15960b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f15961c;

    static {
        Trace.beginSection(AbstractC0457a.E("TypefaceCompat static init"));
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            f15959a = new C1522k();
        } else if (i4 >= 29) {
            f15959a = new C1521j();
        } else if (i4 >= 28) {
            f15959a = new C1520i();
        } else if (i4 >= 26) {
            f15959a = new C1519h();
        } else {
            Method method = C1518g.f15969e;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f15959a = new C1518g();
            } else {
                f15959a = new C1517f();
            }
        }
        f15960b = new p.i(16);
        f15961c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, InterfaceC1481a interfaceC1481a, Resources resources, int i4, String str, int i5, int i6, A a3) {
        Typeface i7;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i8 = 13;
        if (interfaceC1481a instanceof C1484d) {
            C1484d c1484d = (C1484d) interfaceC1481a;
            String str2 = c1484d.f15735d;
            i7 = null;
            int i9 = 1;
            int i10 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = c1484d.f15732a;
                if (arrayList.size() == 1) {
                    build = c(((B.f) arrayList.get(0)).f160e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= arrayList.size()) {
                                        break;
                                    }
                                    B.f fVar = (B.f) arrayList.get(i12);
                                    if (i12 == arrayList.size() - 1 && TextUtils.isEmpty(fVar.f161f)) {
                                        customFallbackBuilder.setSystemFallback(fVar.f160e);
                                        break;
                                    }
                                    String str3 = fVar.f160e;
                                    String str4 = fVar.f161f;
                                    Font d4 = d(c(str3));
                                    if (d4 == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + fVar.f160e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        try {
                                            z.g();
                                            z.m();
                                            fontVariationSettings = AbstractC0268a.f(d4).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = z.e(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    } else {
                                        build3 = z.e(d4).build();
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = z.a(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i12++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((B.f) arrayList.get(i11)).f160e) == null) {
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                new Handler(Looper.getMainLooper()).post(new p(a3, i8, build));
                f15960b.b(b(resources, i4, str, i5, i6), build);
                return build;
            }
            boolean z = c1484d.f15734c == 0;
            int i13 = c1484d.f15733b;
            Handler handler = new Handler(Looper.getMainLooper());
            t tVar = new t();
            tVar.f8416a = a3;
            ArrayList arrayList2 = c1484d.f15732a;
            A.c cVar = new A.c(handler, 1);
            l2.e eVar = new l2.e(tVar, i9, cVar);
            if (!z) {
                String a4 = B.j.a(i6, arrayList2);
                Typeface typeface = (Typeface) B.j.f172a.a(a4);
                if (typeface != null) {
                    cVar.execute(new B.a(tVar, i10, typeface));
                    i7 = typeface;
                } else {
                    B.h hVar = new B.h(i10, eVar);
                    synchronized (B.j.f174c) {
                        try {
                            p.j jVar = B.j.f175d;
                            ArrayList arrayList3 = (ArrayList) jVar.get(a4);
                            if (arrayList3 != null) {
                                arrayList3.add(hVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(hVar);
                                jVar.put(a4, arrayList4);
                                B.g gVar = new B.g(a4, context, arrayList2, i6, 1);
                                ThreadPoolExecutor threadPoolExecutor = B.j.f173b;
                                B.h hVar2 = new B.h(i9, a4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                o oVar = new o();
                                oVar.f186b = gVar;
                                oVar.f187c = hVar2;
                                oVar.f188d = handler2;
                                threadPoolExecutor.execute(oVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                B.f fVar2 = (B.f) arrayList2.get(0);
                p.i iVar = B.j.f172a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{fVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a5 = B.j.a(i6, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) B.j.f172a.a(a5);
                if (typeface2 != null) {
                    cVar.execute(new B.a(tVar, i10, typeface2));
                    i7 = typeface2;
                } else if (i13 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{fVar2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    B.i b4 = B.j.b(a5, context, Collections.unmodifiableList(arrayList6), i6);
                    eVar.s(b4);
                    i7 = b4.f170a;
                } else {
                    try {
                        try {
                            try {
                                B.i iVar2 = (B.i) B.j.f173b.submit(new B.g(a5, context, fVar2, i6, 0)).get(i13, TimeUnit.MILLISECONDS);
                                eVar.s(iVar2);
                                i7 = iVar2.f170a;
                            } catch (InterruptedException e4) {
                                throw e4;
                            }
                        } catch (ExecutionException e5) {
                            throw new RuntimeException(e5);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((A.c) eVar.f14271c).execute(new B.b((t) eVar.f14270b, -3));
                    }
                }
            }
        } else {
            i7 = f15959a.i(context, (C1482b) interfaceC1481a, resources, i6);
            if (i7 != null) {
                new Handler(Looper.getMainLooper()).post(new p(a3, i8, i7));
            } else {
                a3.d();
            }
        }
        if (i7 != null) {
            f15960b.b(b(resources, i4, str, i5, i6), i7);
        }
        return i7;
    }

    public static String b(Resources resources, int i4, String str, int i5, int i6) {
        return resources.getResourcePackageName(i4) + '-' + str + '-' + i5 + '-' + i4 + '-' + i6;
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
        if (f15961c == null) {
            f15961c = new Paint();
        }
        f15961c.setTextSize(10.0f);
        f15961c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f15961c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
