package p;

import L.Q;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import h.C0165s;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m0.C0193c;
import t.k;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final o.g f2812a;

    /* renamed from: b, reason: collision with root package name */
    public static final k.d f2813b;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f2812a = new i();
        } else if (i2 >= 28) {
            f2812a = new h();
        } else if (i2 >= 26) {
            f2812a = new g();
        } else {
            Method method = f.f2821c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f2812a = new f();
            } else {
                f2812a = new e();
            }
        }
        f2813b = new k.d(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r5.equals(r6) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, o.b bVar, Resources resources, int i2, String str, int i3, int i4, C0165s c0165s) {
        Typeface g2;
        Typeface typeface;
        Typeface typeface2;
        int i5 = 3;
        int i6 = 1;
        boolean z2 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (bVar instanceof o.e) {
            o.e eVar = (o.e) bVar;
            String str2 = eVar.f2802d;
            g2 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new J.g(i6, c0165s, typeface));
                return typeface;
            }
            Object[] objArr3 = eVar.f2801c == 0;
            int i7 = eVar.f2800b;
            Handler handler = new Handler(Looper.getMainLooper());
            C0193c c0193c = new C0193c();
            c0193c.f2706f = c0165s;
            t.c cVar = eVar.f2799a;
            Q q2 = new Q(24, c0193c, handler);
            if (objArr3 == true) {
                k.d dVar = t.g.f2979a;
                String str3 = cVar.f2969e + "-" + i4;
                typeface2 = (Typeface) t.g.f2979a.a(str3);
                if (typeface2 != null) {
                    handler.post(new R0.i(c0193c, typeface2, i5, z2));
                } else if (i7 == -1) {
                    t.f a2 = t.g.a(str3, context, cVar, i4);
                    q2.s(a2);
                    g2 = a2.f2977a;
                } else {
                    try {
                        try {
                            try {
                                t.f fVar = (t.f) t.g.f2980b.submit(new t.d(str3, context, cVar, i4, 0)).get(i7, TimeUnit.MILLISECONDS);
                                q2.s(fVar);
                                g2 = fVar.f2977a;
                            } catch (InterruptedException e2) {
                                throw e2;
                            }
                        } catch (ExecutionException e3) {
                            throw new RuntimeException(e3);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) q2.f516g).post(new A.b((C0193c) q2.f515f, -3));
                    }
                }
            } else {
                k.d dVar2 = t.g.f2979a;
                String str4 = cVar.f2969e + "-" + i4;
                typeface2 = (Typeface) t.g.f2979a.a(str4);
                if (typeface2 != null) {
                    handler.post(new R0.i(c0193c, typeface2, i5, objArr2 == true ? 1 : 0));
                } else {
                    t.e eVar2 = new t.e(objArr == true ? 1 : 0, q2);
                    synchronized (t.g.f2981c) {
                        try {
                            k.i iVar = t.g.f2982d;
                            ArrayList arrayList = (ArrayList) iVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(eVar2);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(eVar2);
                                iVar.put(str4, arrayList2);
                                t.d dVar3 = new t.d(str4, context, cVar, i4, 1);
                                ThreadPoolExecutor threadPoolExecutor = t.g.f2980b;
                                t.e eVar3 = new t.e(i6, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                k kVar = new k();
                                kVar.f2991e = dVar3;
                                kVar.f2992f = eVar3;
                                kVar.f2993g = handler2;
                                threadPoolExecutor.execute(kVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            g2 = typeface2;
        } else {
            g2 = f2812a.g(context, (o.c) bVar, resources, i4);
            if (g2 != null) {
                new Handler(Looper.getMainLooper()).post(new J.g(i6, c0165s, g2));
            } else {
                c0165s.a();
            }
        }
        if (g2 != null) {
            f2813b.b(b(resources, i2, str, i3, i4), g2);
        }
        return g2;
    }

    public static String b(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
