package C;

import B.n;
import H.m;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import u0.C0365d;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final H1.d f74a;

    /* renamed from: b, reason: collision with root package name */
    public static final o.f f75b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f74a = new k();
        } else if (i >= 28) {
            f74a = new j();
        } else {
            f74a = new i();
        }
        f75b = new o.f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r3.equals(r4) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, B.f fVar, Resources resources, int i, String str, int i2, int i3, B.b bVar, boolean z2) {
        Typeface r2;
        Typeface typeface;
        Typeface typeface2;
        int i4 = 1;
        boolean z3 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i5 = -3;
        if (fVar instanceof B.i) {
            B.i iVar = (B.i) fVar;
            String str2 = iVar.d;
            r2 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new n(bVar, 0, typeface));
                }
                return typeface;
            }
            Object[] objArr3 = !z2 ? bVar != null : iVar.f42c != 0;
            int i6 = z2 ? iVar.f41b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            A0.c cVar = new A0.c(i4, z3);
            cVar.f6b = bVar;
            H.e eVar = iVar.f40a;
            C0365d c0365d = new C0365d(cVar, 2, handler);
            if (objArr3 == true) {
                o.f fVar2 = H.i.f494a;
                String str3 = ((String) eVar.f484e) + "-" + i3;
                typeface2 = (Typeface) H.i.f494a.a(str3);
                if (typeface2 != null) {
                    handler.post(new H.a(cVar, 0, typeface2));
                } else if (i6 == -1) {
                    H.h a2 = H.i.a(str3, context, eVar, i3);
                    c0365d.g(a2);
                    r2 = a2.f492a;
                } else {
                    try {
                        try {
                            try {
                                H.h hVar = (H.h) H.i.f495b.submit(new H.f(str3, context, eVar, i3, 0)).get(i6, TimeUnit.MILLISECONDS);
                                c0365d.g(hVar);
                                r2 = hVar.f492a;
                            } catch (InterruptedException e2) {
                                throw e2;
                            }
                        } catch (ExecutionException e3) {
                            throw new RuntimeException(e3);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) c0365d.f4176c).post(new H.b(c0365d.f4175b, i5, (int) (objArr2 == true ? 1 : 0)));
                    }
                }
            } else {
                o.f fVar3 = H.i.f494a;
                String str4 = ((String) eVar.f484e) + "-" + i3;
                typeface2 = (Typeface) H.i.f494a.a(str4);
                if (typeface2 != null) {
                    handler.post(new H.a(cVar, 0, typeface2));
                } else {
                    H.g gVar = new H.g(objArr == true ? 1 : 0, c0365d);
                    synchronized (H.i.f496c) {
                        try {
                            o.k kVar = H.i.d;
                            ArrayList arrayList = (ArrayList) kVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(gVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gVar);
                                kVar.put(str4, arrayList2);
                                H.f fVar4 = new H.f(str4, context, eVar, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = H.i.f495b;
                                H.g gVar2 = new H.g(i4, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                m mVar = new m();
                                mVar.f503b = fVar4;
                                mVar.f504c = gVar2;
                                mVar.d = handler2;
                                threadPoolExecutor.execute(mVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            r2 = typeface2;
        } else {
            r2 = f74a.r(context, (B.g) fVar, resources, i3);
            if (bVar != null) {
                if (r2 != null) {
                    new Handler(Looper.getMainLooper()).post(new n(bVar, 0, r2));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (r2 != null) {
            f75b.b(b(resources, i, str, i2, i3), r2);
        }
        return r2;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
