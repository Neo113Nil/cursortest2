package r;

import N.P;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.datastore.preferences.protobuf.k0;
import g0.C0131a;
import i.C0172t;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0.C0211b;
import v.j;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f2965a;

    /* renamed from: b, reason: collision with root package name */
    public static final m.d f2966b;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f2965a = new i();
        } else if (i2 >= 28) {
            f2965a = new h();
        } else if (i2 >= 26) {
            f2965a = new g();
        } else {
            Method method = f.f2974g;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f2965a = new f();
            } else {
                f2965a = new e();
            }
        }
        f2966b = new m.d(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r1.equals(r3) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, q.b bVar, Resources resources, int i2, String str, int i3, int i4, C0172t c0172t) {
        Typeface k2;
        Typeface typeface;
        if (bVar instanceof q.e) {
            q.e eVar = (q.e) bVar;
            String str2 = eVar.f2955d;
            k2 = null;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new q.f(c0172t, typeface));
                return typeface;
            }
            int i5 = 1;
            Object[] objArr3 = eVar.f2954c == 0;
            int i6 = eVar.f2953b;
            Handler handler = new Handler(Looper.getMainLooper());
            C0211b c0211b = new C0211b();
            c0211b.f2915f = c0172t;
            C0131a c0131a = eVar.f2952a;
            P p2 = new P(22, c0211b, handler);
            int i7 = 3;
            if (objArr3 == true) {
                m.d dVar = v.f.f3069a;
                String str3 = ((String) c0131a.f1933f) + "-" + i4;
                Typeface typeface2 = (Typeface) v.f.f3069a.a(str3);
                if (typeface2 != null) {
                    handler.post(new b1.i(c0211b, typeface2, i7, z2));
                    k2 = typeface2;
                } else if (i6 == -1) {
                    v.e a2 = v.f.a(str3, context, c0131a, i4);
                    p2.A(a2);
                    k2 = a2.f3067a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    v.e eVar2 = (v.e) v.f.f3070b.submit(new v.c(str3, context, c0131a, i4, 0)).get(i6, TimeUnit.MILLISECONDS);
                                    p2.A(eVar2);
                                    k2 = eVar2.f3067a;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e2) {
                                throw e2;
                            }
                        } catch (ExecutionException e3) {
                            throw new RuntimeException(e3);
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) p2.f699g).post(new C.b((C0211b) p2.f698f, -3));
                    }
                }
            } else {
                m.d dVar2 = v.f.f3069a;
                String str4 = ((String) c0131a.f1933f) + "-" + i4;
                Typeface typeface3 = (Typeface) v.f.f3069a.a(str4);
                if (typeface3 != null) {
                    handler.post(new b1.i(c0211b, typeface3, i7, objArr2 == true ? 1 : 0));
                    k2 = typeface3;
                } else {
                    v.d dVar3 = new v.d(objArr == true ? 1 : 0, p2);
                    synchronized (v.f.f3071c) {
                        try {
                            m.i iVar = v.f.f3072d;
                            ArrayList arrayList = (ArrayList) iVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(dVar3);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(dVar3);
                                iVar.put(str4, arrayList2);
                                v.c cVar = new v.c(str4, context, c0131a, i4, 1);
                                ThreadPoolExecutor threadPoolExecutor = v.f.f3070b;
                                v.d dVar4 = new v.d(i5, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                j jVar = new j();
                                jVar.f3079e = cVar;
                                jVar.f3080f = dVar4;
                                jVar.f3081g = handler2;
                                threadPoolExecutor.execute(jVar);
                            }
                        } finally {
                        }
                    }
                }
            }
        } else {
            k2 = f2965a.k(context, (q.c) bVar, resources, i4);
            if (k2 != null) {
                new Handler(Looper.getMainLooper()).post(new q.f(c0172t, k2));
            } else {
                c0172t.a();
            }
        }
        if (k2 != null) {
            f2966b.b(b(resources, i2, str, i3, i4), k2);
        }
        return k2;
    }

    public static String b(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
