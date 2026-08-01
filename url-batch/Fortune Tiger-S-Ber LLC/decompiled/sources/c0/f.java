package c0;

import a2.s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.activity.n;
import b1.k1;
import h0.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k3.m;
import n.j;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final k3.d f984a;

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f985b;

    static {
        m.i("TypefaceCompat static init");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            f984a = new i();
        } else if (i4 >= 28) {
            f984a = new h();
        } else {
            f984a = new g();
        }
        f985b = new k1(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r3.equals(r9) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, b0.e eVar, Resources resources, int i4, String str, int i5, int i6, b0.b bVar, boolean z3) {
        Typeface q4;
        Typeface typeface;
        List unmodifiableList;
        int i7 = -3;
        int i8 = 1;
        if (eVar instanceof b0.h) {
            b0.h hVar = (b0.h) eVar;
            String str2 = hVar.f710e;
            q4 = null;
            boolean z4 = false;
            Object[] objArr = 0;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new n(bVar, typeface, 1));
                }
                return typeface;
            }
            Object[] objArr2 = !z3 ? bVar != null : hVar.f709d != 0;
            int i9 = z3 ? hVar.c : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            a2.e eVar2 = new a2.e(8, z4);
            eVar2.g = bVar;
            h0.d dVar = hVar.f708b;
            int i10 = 2;
            if (dVar != null) {
                Object[] objArr3 = {hVar.f707a, dVar};
                ArrayList arrayList = new ArrayList(2);
                for (int i11 = 0; i11 < 2; i11++) {
                    Object obj = objArr3[i11];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                Object[] objArr4 = {hVar.f707a};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr4[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            l lVar = new l(handler);
            s sVar = new s(eVar2, lVar, 13);
            if (objArr2 != true) {
                String a4 = h0.h.a(unmodifiableList, i6);
                Typeface typeface2 = (Typeface) h0.h.f1991a.f(a4);
                if (typeface2 != null) {
                    lVar.execute(new androidx.fragment.app.e(eVar2, typeface2, 1));
                    q4 = typeface2;
                } else {
                    h0.f fVar = new h0.f(objArr == true ? 1 : 0, sVar);
                    synchronized (h0.h.c) {
                        try {
                            j jVar = h0.h.f1993d;
                            ArrayList arrayList3 = (ArrayList) jVar.get(a4);
                            if (arrayList3 != null) {
                                arrayList3.add(fVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(fVar);
                                jVar.put(a4, arrayList4);
                                h0.e eVar3 = new h0.e(a4, context, unmodifiableList, i6, 1);
                                ThreadPoolExecutor threadPoolExecutor = h0.h.f1992b;
                                h0.f fVar2 = new h0.f(i8, a4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                h0.m mVar = new h0.m();
                                mVar.f2000f = eVar3;
                                mVar.g = fVar2;
                                mVar.h = handler2;
                                threadPoolExecutor.execute(mVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (unmodifiableList.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                h0.d dVar2 = (h0.d) unmodifiableList.get(0);
                k1 k1Var = h0.h.f1991a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{dVar2}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a5 = h0.h.a(Collections.unmodifiableList(arrayList5), i6);
                Typeface typeface3 = (Typeface) h0.h.f1991a.f(a5);
                if (typeface3 != null) {
                    lVar.execute(new androidx.fragment.app.e(eVar2, typeface3, 1));
                    q4 = typeface3;
                } else if (i9 == -1) {
                    Object[] objArr5 = {dVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr5[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    h0.g b2 = h0.h.b(a5, context, Collections.unmodifiableList(arrayList6), i6);
                    sVar.E(b2);
                    q4 = b2.f1989a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    h0.g gVar = (h0.g) h0.h.f1992b.submit(new h0.e(a5, context, dVar2, i6, 0)).get(i9, TimeUnit.MILLISECONDS);
                                    sVar.E(gVar);
                                    q4 = gVar.f1989a;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e4) {
                                throw e4;
                            }
                        } catch (ExecutionException e5) {
                            throw new RuntimeException(e5);
                        }
                    } catch (InterruptedException unused2) {
                        ((l) sVar.h).execute(new androidx.emoji2.text.j(i7, i10, (a2.e) sVar.g));
                    }
                }
            }
        } else {
            q4 = f984a.q(context, (b0.f) eVar, resources, i6);
            if (bVar != null) {
                if (q4 != null) {
                    new Handler(Looper.getMainLooper()).post(new n(bVar, q4, 1));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (q4 != null) {
            f985b.j(b(resources, i4, str, i5, i6), q4);
        }
        return q4;
    }

    public static String b(Resources resources, int i4, String str, int i5, int i6) {
        return resources.getResourcePackageName(i4) + '-' + str + '-' + i5 + '-' + i4 + '-' + i6;
    }
}
