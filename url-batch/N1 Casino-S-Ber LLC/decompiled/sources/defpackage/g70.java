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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class g70 {
    public static final e70 a;
    public static final ir b;
    public static Paint c;

    static {
        o8.d("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new k70();
        } else if (i >= 29) {
            a = new j70();
        } else if (i >= 28) {
            a = new i70();
        } else {
            a = new h70();
        }
        b = new ir(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, zj zjVar, Resources resources, int i, String str, int i2, int i3, jw jwVar, boolean z) {
        Typeface m;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i4 = -3;
        if (zjVar instanceof ck) {
            ck ckVar = (ck) zjVar;
            String str2 = ckVar.d;
            m = null;
            int i5 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = ckVar.a;
                if (arrayList.size() == 1) {
                    build = c(((sj) arrayList.get(0)).e);
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
                                    sj sjVar = (sj) arrayList.get(i7);
                                    if (i7 == arrayList.size() - 1 && TextUtils.isEmpty(sjVar.f)) {
                                        customFallbackBuilder.setSystemFallback(sjVar.e);
                                        break;
                                    }
                                    String str3 = sjVar.e;
                                    String str4 = sjVar.f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + sjVar.e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = y.w(d).build();
                                    } else {
                                        try {
                                            y.l();
                                            f70.k();
                                            fontVariationSettings = c8.g(d).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = y.h(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = y.e(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i7++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((sj) arrayList.get(i6)).e) == null) {
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
                if (jwVar != null) {
                    new Handler(Looper.getMainLooper()).post(new m3(jwVar, build, 3));
                }
                b.o(b(resources, i, str, i2, i3), build);
                return build;
            }
            Object[] objArr4 = !z ? jwVar != null : ckVar.c != 0;
            int i8 = z ? ckVar.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            mr mrVar = new mr();
            mrVar.f = jwVar;
            ArrayList arrayList2 = ckVar.a;
            s6 s6Var = new s6(handler);
            q4 q4Var = new q4(mrVar, s6Var, 10);
            int i9 = 5;
            if (objArr4 != true) {
                String a2 = yj.a(arrayList2, i3);
                Typeface typeface = (Typeface) yj.a.h(a2);
                if (typeface != null) {
                    s6Var.execute(new f1(mrVar, typeface, i9, objArr2 == true ? 1 : 0));
                    m = typeface;
                } else {
                    wj wjVar = new wj(objArr == true ? 1 : 0, q4Var);
                    synchronized (yj.c) {
                        try {
                            u20 u20Var = yj.d;
                            ArrayList arrayList3 = (ArrayList) u20Var.get(a2);
                            if (arrayList3 != null) {
                                arrayList3.add(wjVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(wjVar);
                                u20Var.put(a2, arrayList4);
                                vj vjVar = new vj(a2, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = yj.b;
                                wj wjVar2 = new wj(i5, a2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                vm vmVar = new vm();
                                vmVar.g = vjVar;
                                vmVar.h = wjVar2;
                                vmVar.i = handler2;
                                threadPoolExecutor.execute(vmVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    t8.k("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                sj sjVar2 = (sj) arrayList2.get(0);
                ir irVar = yj.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{sjVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a3 = yj.a(Collections.unmodifiableList(arrayList5), i3);
                Typeface typeface2 = (Typeface) yj.a.h(a3);
                if (typeface2 != null) {
                    s6Var.execute(new f1(mrVar, typeface2, i9, z2));
                    m = typeface2;
                } else if (i8 == -1) {
                    Object[] objArr5 = {sjVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr5[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    xj b2 = yj.b(a3, context, Collections.unmodifiableList(arrayList6), i3);
                    q4Var.M(b2);
                    m = b2.a;
                } else {
                    try {
                        try {
                            try {
                                xj xjVar = (xj) yj.b.submit(new vj(a3, context, sjVar2, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                q4Var.M(xjVar);
                                m = xjVar.a;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((s6) q4Var.h).execute(new d9(i4, (int) (objArr3 == true ? 1 : 0), q4Var.g));
                    }
                }
            }
        } else {
            m = a.m(context, (ak) zjVar, resources, i3);
            if (jwVar != null) {
                if (m != null) {
                    new Handler(Looper.getMainLooper()).post(new m3(jwVar, m, 3));
                } else {
                    jwVar.l(-3);
                }
            }
        }
        if (m != null) {
            b.o(b(resources, i, str, i2, i3), m);
        }
        return m;
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
