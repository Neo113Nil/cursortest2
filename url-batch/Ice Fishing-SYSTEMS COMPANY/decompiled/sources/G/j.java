package G;

import B2.N;
import B2.RunnableC0272f;
import B2.z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.ads.B0;
import g1.C4523c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final com.bumptech.glide.d f1158a;

    /* renamed from: b, reason: collision with root package name */
    public static final B0 f1159b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f1158a = new o();
        } else if (i >= 28) {
            f1158a = new n();
        } else if (i >= 26) {
            f1158a = new m();
        } else {
            Method method = l.f1167c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f1158a = new l();
            } else {
                f1158a = new k();
            }
        }
        f1159b = new B0(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r8.equals(r11) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, F.f fVar, Resources resources, int i, String str, int i4, int i9, F.b bVar, boolean z8) {
        Typeface h9;
        Typeface typeface;
        int i10 = 11;
        int i11 = 4;
        int i12 = 0;
        int i13 = 1;
        int i14 = -3;
        if (fVar instanceof F.i) {
            F.i iVar = (F.i) fVar;
            String str2 = iVar.f921d;
            h9 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new D5.b(i13, bVar, typeface));
                }
                return typeface;
            }
            boolean z9 = !z8 ? bVar != null : iVar.f920c != 0;
            int i15 = z8 ? iVar.f919b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C4523c c4523c = new C4523c(i11);
            c4523c.f37856u = bVar;
            N n9 = iVar.f918a;
            S0.l lVar = new S0.l(i11, c4523c, handler);
            if (z9) {
                B0 b02 = L.g.f1682a;
                String str3 = ((String) n9.f200y) + "-" + i9;
                Typeface typeface2 = (Typeface) L.g.f1682a.b(str3);
                if (typeface2 != null) {
                    handler.post(new RunnableC0272f(i10, c4523c, typeface2));
                    h9 = typeface2;
                } else if (i15 == -1) {
                    L.f a9 = L.g.a(str3, context, n9, i9);
                    lVar.r(a9);
                    h9 = a9.f1680a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    L.f fVar2 = (L.f) L.g.f1683b.submit(new L.d(str3, context, n9, i9, 0)).get(i15, TimeUnit.MILLISECONDS);
                                    lVar.r(fVar2);
                                    h9 = fVar2.f1680a;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e6) {
                                throw e6;
                            }
                        } catch (ExecutionException e9) {
                            throw new RuntimeException(e9);
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) lVar.f2911v).post(new L.a((C4523c) lVar.f2910u, i14, i12));
                    }
                }
            } else {
                B0 b03 = L.g.f1682a;
                String str4 = ((String) n9.f200y) + "-" + i9;
                Typeface typeface3 = (Typeface) L.g.f1682a.b(str4);
                if (typeface3 != null) {
                    handler.post(new RunnableC0272f(i10, c4523c, typeface3));
                    h9 = typeface3;
                } else {
                    L.e eVar = new L.e(i12, lVar);
                    synchronized (L.g.f1684c) {
                        try {
                            s.k kVar = L.g.f1685d;
                            ArrayList arrayList = (ArrayList) kVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(eVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(eVar);
                                kVar.put(str4, arrayList2);
                                L.d dVar = new L.d(str4, context, n9, i9, 1);
                                ThreadPoolExecutor threadPoolExecutor = L.g.f1683b;
                                L.e eVar2 = new L.e(i13, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                z zVar = new z(5);
                                zVar.f321u = dVar;
                                zVar.f322v = eVar2;
                                zVar.f323w = handler2;
                                threadPoolExecutor.execute(zVar);
                            }
                        } finally {
                        }
                    }
                }
            }
        } else {
            h9 = f1158a.h(context, (F.g) fVar, resources, i9);
            if (bVar != null) {
                if (h9 != null) {
                    new Handler(Looper.getMainLooper()).post(new D5.b(i13, bVar, h9));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (h9 != null) {
            f1159b.c(b(resources, i, str, i4, i9), h9);
        }
        return h9;
    }

    public static String b(Resources resources, int i, String str, int i4, int i9) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i4 + '-' + i + '-' + i9;
    }
}
