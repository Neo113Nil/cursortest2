package x;

import B.l;
import V0.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r.C1396f;
import r.C1401k;
import u1.AbstractC1477a;
import w.C1501c;
import w.C1503e;
import w.InterfaceC1500b;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1529d {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1477a f12236a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1396f f12237b;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f12236a = new C1534i();
        } else if (i2 >= 28) {
            f12236a = new C1533h();
        } else if (i2 >= 26) {
            f12236a = new C1532g();
        } else {
            Method method = C1531f.f12245e;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f12236a = new C1531f();
            } else {
                f12236a = new C1530e();
            }
        }
        f12237b = new C1396f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r4.equals(r5) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, InterfaceC1500b interfaceC1500b, Resources resources, int i2, String str, int i3, int i6, G2.f fVar) {
        Typeface f3;
        Typeface typeface;
        Typeface typeface2;
        int i7 = 26;
        int i8 = 1;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (interfaceC1500b instanceof C1503e) {
            C1503e c1503e = (C1503e) interfaceC1500b;
            String str2 = c1503e.f12107d;
            f3 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new B3.c(fVar, i7, typeface));
                return typeface;
            }
            Object[] objArr5 = c1503e.f12106c == 0;
            int i9 = c1503e.f12105b;
            Handler handler = new Handler(Looper.getMainLooper());
            j jVar = new j(27, z);
            jVar.f3212b = fVar;
            B.d dVar = c1503e.f12104a;
            B0.c cVar = new B0.c(jVar, i8, handler);
            if (objArr5 == true) {
                C1396f c1396f = B.h.f120a;
                String str3 = ((String) dVar.f109e) + "-" + i6;
                typeface2 = (Typeface) B.h.f120a.a(str3);
                if (typeface2 != null) {
                    handler.post(new A0.a(jVar, typeface2, i8, objArr4 == true ? 1 : 0));
                } else if (i9 == -1) {
                    B.g a6 = B.h.a(str3, context, dVar, i6);
                    cVar.h(a6);
                    f3 = a6.f118a;
                } else {
                    try {
                        try {
                            try {
                                B.g gVar = (B.g) B.h.f121b.submit(new B.e(str3, context, dVar, i6, 0)).get(i9, TimeUnit.MILLISECONDS);
                                cVar.h(gVar);
                                f3 = gVar.f118a;
                            } catch (InterruptedException e3) {
                                throw e3;
                            }
                        } catch (ExecutionException e6) {
                            throw new RuntimeException(e6);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) cVar.f141c).post(new B.a((j) cVar.f140b, -3));
                    }
                }
            } else {
                C1396f c1396f2 = B.h.f120a;
                String str4 = ((String) dVar.f109e) + "-" + i6;
                typeface2 = (Typeface) B.h.f120a.a(str4);
                if (typeface2 != null) {
                    handler.post(new A0.a(jVar, typeface2, i8, objArr3 == true ? 1 : 0));
                } else {
                    B.f fVar2 = new B.f(objArr2 == true ? 1 : 0, cVar);
                    synchronized (B.h.f122c) {
                        try {
                            C1401k c1401k = B.h.f123d;
                            ArrayList arrayList = (ArrayList) c1401k.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(fVar2);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(fVar2);
                                c1401k.put(str4, arrayList2);
                                B.e eVar = new B.e(str4, context, dVar, i6, 1);
                                ThreadPoolExecutor threadPoolExecutor = B.h.f121b;
                                B.f fVar3 = new B.f(i8, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                l lVar = new l(objArr == true ? 1 : 0);
                                lVar.f133b = eVar;
                                lVar.f134c = fVar3;
                                lVar.f135d = handler2;
                                threadPoolExecutor.execute(lVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            f3 = typeface2;
        } else {
            f3 = f12236a.f(context, (C1501c) interfaceC1500b, resources, i6);
            if (f3 != null) {
                new Handler(Looper.getMainLooper()).post(new B3.c(fVar, i7, f3));
            } else {
                fVar.a();
            }
        }
        if (f3 != null) {
            f12237b.b(b(resources, i2, str, i3, i6), f3);
        }
        return f3;
    }

    public static String b(Resources resources, int i2, String str, int i3, int i6) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i6;
    }
}
