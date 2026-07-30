package B;

import F.n;
import a.AbstractC0169a;
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
import n.U;
import u.C0938i;
import u.C0939j;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final V6.b f153a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0938i f154b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f155c;

    static {
        Trace.beginSection(AbstractC0169a.G("TypefaceCompat static init"));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f153a = new m();
        } else if (i2 >= 29) {
            f153a = new l();
        } else if (i2 >= 28) {
            f153a = new k();
        } else if (i2 >= 26) {
            f153a = new j();
        } else {
            Method method = i.f163d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f153a = new i();
            } else {
                f153a = new h();
            }
        }
        f154b = new C0938i(16);
        f155c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, A.d dVar, Resources resources, int i2, String str, int i5, int i7, U u7) {
        Typeface o7;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        Typeface typeface;
        int i8 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        if (dVar instanceof A.g) {
            A.g gVar = (A.g) dVar;
            String str2 = gVar.f24d;
            o7 = null;
            int i9 = 1;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = gVar.f21a;
                if (arrayList.size() == 1) {
                    build = c(((F.f) arrayList.get(0)).f728e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                int i11 = 0;
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                while (true) {
                                    if (i11 >= arrayList.size()) {
                                        break;
                                    }
                                    F.f fVar = (F.f) arrayList.get(i11);
                                    if (i11 == arrayList.size() - 1 && TextUtils.isEmpty(fVar.f729f)) {
                                        customFallbackBuilder.setSystemFallback(fVar.f728e);
                                        break;
                                    }
                                    String str3 = fVar.f728e;
                                    String str4 = fVar.f729f;
                                    Font d7 = d(c(str3));
                                    if (d7 == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + fVar.f728e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = d.f(d7).build();
                                    } else {
                                        try {
                                            d.o();
                                            d.z();
                                            fontVariationSettings = e.f(d7).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = d.f(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = d.b(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i11++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((F.f) arrayList.get(i10)).f728e) == null) {
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
                new Handler(Looper.getMainLooper()).post(new A.j(u7, i8, build));
                f154b.b(b(resources, i2, str, i5, i7), build);
                return build;
            }
            Object[] objArr8 = gVar.f23c == 0;
            int i12 = gVar.f22b;
            Handler handler = new Handler(Looper.getMainLooper());
            f fVar2 = new f((int) (objArr7 == true ? 1 : 0), (boolean) (objArr6 == true ? 1 : 0));
            fVar2.f152e = u7;
            ArrayList arrayList2 = gVar.f21a;
            E.e eVar = new E.e(handler, 1);
            P0.l lVar = new P0.l(fVar2, i9, eVar);
            if (objArr8 != true) {
                String a7 = F.j.a(i7, arrayList2);
                typeface = (Typeface) F.j.f740a.a(a7);
                if (typeface != null) {
                    eVar.execute(new F.a((Object) fVar2, (int) (objArr4 == true ? 1 : 0), (Object) typeface));
                } else {
                    F.h hVar = new F.h(objArr3 == true ? 1 : 0, lVar);
                    synchronized (F.j.f742c) {
                        try {
                            C0939j c0939j = F.j.f743d;
                            ArrayList arrayList3 = (ArrayList) c0939j.get(a7);
                            if (arrayList3 != null) {
                                arrayList3.add(hVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(hVar);
                                c0939j.put(a7, arrayList4);
                                F.g gVar2 = new F.g(a7, context, arrayList2, i7, 1);
                                ThreadPoolExecutor threadPoolExecutor = F.j.f741b;
                                F.h hVar2 = new F.h(i9, a7);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                n nVar = new n(objArr2 == true ? 1 : 0);
                                nVar.f753e = gVar2;
                                nVar.f754i = hVar2;
                                nVar.f755l = handler2;
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
                F.f fVar3 = (F.f) arrayList2.get(0);
                C0938i c0938i = F.j.f740a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{fVar3}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a8 = F.j.a(i7, Collections.unmodifiableList(arrayList5));
                typeface = (Typeface) F.j.f740a.a(a8);
                if (typeface != null) {
                    eVar.execute(new F.a((Object) fVar2, (int) (objArr5 == true ? 1 : 0), (Object) typeface));
                } else if (i12 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{fVar3}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    F.i b7 = F.j.b(a8, context, Collections.unmodifiableList(arrayList6), i7);
                    lVar.c(b7);
                    o7 = b7.f738a;
                } else {
                    try {
                        try {
                            F.i iVar = (F.i) F.j.f741b.submit(new F.g(a8, context, fVar3, i7, 0)).get(i12, TimeUnit.MILLISECONDS);
                            lVar.c(iVar);
                            o7 = iVar.f738a;
                        } catch (InterruptedException e7) {
                            throw e7;
                        } catch (ExecutionException e8) {
                            throw new RuntimeException(e8);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((E.e) lVar.f2210i).execute(new F.b((f) lVar.f2209e, -3));
                    }
                }
            }
            o7 = typeface;
        } else {
            o7 = f153a.o(context, (A.e) dVar, resources, i7);
            if (o7 != null) {
                new Handler(Looper.getMainLooper()).post(new A.j(u7, objArr == true ? 1 : 0, o7));
            } else {
                u7.a();
            }
        }
        if (o7 != null) {
            f154b.b(b(resources, i2, str, i5, i7), o7);
        }
        return o7;
    }

    public static String b(Resources resources, int i2, String str, int i5, int i7) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i5 + '-' + i2 + '-' + i7;
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
        if (f155c == null) {
            f155c = new Paint();
        }
        f155c.setTextSize(10.0f);
        f155c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f155c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
