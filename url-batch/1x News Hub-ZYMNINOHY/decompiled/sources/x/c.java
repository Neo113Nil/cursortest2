package x;

import B.j;
import B.n;
import E1.o;
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
import b0.s;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l.AbstractC1102y;
import l.C1096s;
import p.C1173i;
import p.C1174j;
import w.C1231b;
import w.InterfaceC1230a;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final android.support.v4.media.session.a f10698a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1173i f10699b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f10700c;

    static {
        Trace.beginSection(S0.a.N("TypefaceCompat static init"));
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            f10698a = new i();
        } else if (i3 >= 29) {
            f10698a = new h();
        } else if (i3 >= 28) {
            f10698a = new g();
        } else if (i3 >= 26) {
            f10698a = new f();
        } else {
            Method method = e.f10707e;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f10698a = new e();
            } else {
                f10698a = new d();
            }
        }
        f10699b = new C1173i(16);
        f10700c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, InterfaceC1230a interfaceC1230a, Resources resources, int i3, String str, int i4, int i5, C1096s c1096s) {
        Typeface l3;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        Typeface typeface;
        int i6 = 19;
        int i7 = 0;
        int i8 = 1;
        if (interfaceC1230a instanceof w.d) {
            w.d dVar = (w.d) interfaceC1230a;
            String str2 = dVar.f10625d;
            l3 = null;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = dVar.f10622a;
                if (arrayList.size() == 1) {
                    build = c(((B.f) arrayList.get(0)).f88e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i9 = 0;
                        while (true) {
                            if (i9 >= arrayList.size()) {
                                int i10 = 0;
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                while (true) {
                                    if (i10 >= arrayList.size()) {
                                        break;
                                    }
                                    B.f fVar = (B.f) arrayList.get(i10);
                                    if (i10 == arrayList.size() - 1 && TextUtils.isEmpty(fVar.f)) {
                                        customFallbackBuilder.setSystemFallback(fVar.f88e);
                                        break;
                                    }
                                    Font d3 = d(c(fVar.f88e));
                                    if (d3 == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + fVar.f88e + ". Falling back to provider font.");
                                        break;
                                    }
                                    String str3 = fVar.f;
                                    if (TextUtils.isEmpty(str3)) {
                                        try {
                                            AbstractC1102y.h();
                                            AbstractC1102y.p();
                                            fontVariationSettings = o.e(d3).setFontVariationSettings(str3);
                                            build2 = fontVariationSettings.build();
                                            build3 = AbstractC1102y.f(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    } else {
                                        build3 = AbstractC1102y.f(d3).build();
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = AbstractC1102y.b(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i10++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((B.f) arrayList.get(i9)).f88e) == null) {
                                    break;
                                }
                                i9++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                new Handler(Looper.getMainLooper()).post(new A1.a(c1096s, i6, build));
                f10699b.b(b(resources, i3, str, i4, i5), build);
                return build;
            }
            boolean z = dVar.f10624c == 0;
            int i11 = dVar.f10623b;
            Handler handler = new Handler(Looper.getMainLooper());
            s sVar = new s();
            sVar.f2544a = c1096s;
            ArrayList arrayList2 = dVar.f10622a;
            A.b bVar = new A.b(handler, 1);
            V0.e eVar = new V0.e(sVar, i8, bVar);
            if (!z) {
                String a3 = j.a(i5, arrayList2);
                typeface = (Typeface) j.f99a.a(a3);
                if (typeface != null) {
                    bVar.execute(new B.a(sVar, i7, typeface));
                } else {
                    B.h hVar = new B.h(i7, eVar);
                    synchronized (j.f101c) {
                        try {
                            C1174j c1174j = j.f102d;
                            ArrayList arrayList3 = (ArrayList) c1174j.get(a3);
                            if (arrayList3 != null) {
                                arrayList3.add(hVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(hVar);
                                c1174j.put(a3, arrayList4);
                                B.g gVar = new B.g(a3, context, arrayList2, i5, 1);
                                ThreadPoolExecutor threadPoolExecutor = j.f100b;
                                B.h hVar2 = new B.h(i8, a3);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                n nVar = new n();
                                nVar.f110b = gVar;
                                nVar.f111c = hVar2;
                                nVar.f112d = handler2;
                                threadPoolExecutor.execute(nVar);
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
                C1173i c1173i = j.f99a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{fVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a4 = j.a(i5, Collections.unmodifiableList(arrayList5));
                typeface = (Typeface) j.f99a.a(a4);
                if (typeface != null) {
                    bVar.execute(new B.a(sVar, i7, typeface));
                } else if (i11 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{fVar2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    B.i b3 = j.b(a4, context, Collections.unmodifiableList(arrayList6), i5);
                    eVar.C(b3);
                    l3 = b3.f97a;
                } else {
                    try {
                        try {
                            try {
                                B.i iVar = (B.i) j.f100b.submit(new B.g(a4, context, fVar2, i5, 0)).get(i11, TimeUnit.MILLISECONDS);
                                eVar.C(iVar);
                                l3 = iVar.f97a;
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e3) {
                            throw e3;
                        } catch (ExecutionException e4) {
                            throw new RuntimeException(e4);
                        }
                    } catch (InterruptedException unused3) {
                        ((A.b) eVar.f1600c).execute(new B.b((s) eVar.f1599b, -3));
                    }
                }
            }
            l3 = typeface;
        } else {
            l3 = f10698a.l(context, (C1231b) interfaceC1230a, resources, i5);
            if (l3 != null) {
                new Handler(Looper.getMainLooper()).post(new A1.a(c1096s, i6, l3));
            } else {
                c1096s.a();
            }
        }
        if (l3 != null) {
            f10699b.b(b(resources, i3, str, i4, i5), l3);
        }
        return l3;
    }

    public static String b(Resources resources, int i3, String str, int i4, int i5) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i4 + '-' + i3 + '-' + i5;
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
        if (f10700c == null) {
            f10700c = new Paint();
        }
        f10700c.setTextSize(10.0f);
        f10700c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f10700c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
