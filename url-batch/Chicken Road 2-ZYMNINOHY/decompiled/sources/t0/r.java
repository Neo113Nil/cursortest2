package t0;

import T.C0086d;
import T.C0097o;
import T.C0099q;
import T.U;
import T.V;
import W.AbstractC0108a;
import W.J;
import a.AbstractC0124a;
import a0.M;
import android.content.Context;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import q0.j0;
import v2.C1475w;
import v2.I;
import v2.Z;
import v2.a0;

/* loaded from: classes.dex */
public final class r extends w {

    /* renamed from: k, reason: collision with root package name */
    public static final Z f15365k = new C1475w(new B.c(8));

    /* renamed from: c, reason: collision with root package name */
    public final Object f15366c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f15367d;

    /* renamed from: e, reason: collision with root package name */
    public final C1427b f15368e;

    /* renamed from: f, reason: collision with root package name */
    public l f15369f;

    /* renamed from: g, reason: collision with root package name */
    public Thread f15370g;

    /* renamed from: h, reason: collision with root package name */
    public U.b f15371h;

    /* renamed from: i, reason: collision with root package name */
    public C0086d f15372i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f15373j;

    public r(Context context) {
        C1427b c1427b = new C1427b(0);
        l lVar = l.f15326F;
        this.f15366c = new Object();
        this.f15367d = context != null ? context.getApplicationContext() : null;
        this.f15368e = c1427b;
        if (lVar != null) {
            this.f15369f = lVar;
        } else {
            lVar.getClass();
            C1436k c1436k = new C1436k(lVar);
            c1436k.a(lVar);
            this.f15369f = new l(c1436k);
        }
        this.f15372i = C0086d.f2771c;
        if (this.f15369f.f15327A && context == null) {
            AbstractC0108a.s("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int b(C0097o c0097o, I i4) {
        for (int i5 = 0; i5 < i4.size(); i5++) {
            for (int i6 = 0; i6 < c0097o.f2858c.size(); i6++) {
                if (((C0099q) c0097o.f2858c.get(i6)).f2880b.equals(i4.get(i5))) {
                    return i5;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void c(j0 j0Var, l lVar, HashMap hashMap) {
        for (int i4 = 0; i4 < j0Var.f15034a; i4++) {
            V v = (V) lVar.f2750u.get(j0Var.a(i4));
            if (v != null) {
                U u4 = v.f2710a;
                V v4 = (V) hashMap.get(Integer.valueOf(u4.f2707c));
                if (v4 == null || (v4.f2711b.isEmpty() && !v.f2711b.isEmpty())) {
                    hashMap.put(Integer.valueOf(u4.f2707c), v);
                }
            }
        }
    }

    public static int d(C0097o c0097o, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c0097o.f2859d)) {
            return 4;
        }
        String f4 = f(str);
        String f5 = f(c0097o.f2859d);
        if (f5 == null || f4 == null) {
            return (z && f5 == null) ? 1 : 0;
        }
        if (f5.startsWith(f4) || f4.startsWith(f5)) {
            return 3;
        }
        String str2 = J.f3263a;
        return f5.split(TokenBuilder.TOKEN_DELIMITER, 2)[0].equals(f4.split(TokenBuilder.TOKEN_DELIMITER, 2)[0]) ? 2 : 0;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair g(int i4, v vVar, int[][][] iArr, o oVar, Comparator comparator) {
        int i5;
        RandomAccess randomAccess;
        v vVar2 = vVar;
        ArrayList arrayList = new ArrayList();
        int i6 = vVar2.f15376a;
        int i7 = 0;
        while (i7 < i6) {
            if (i4 == vVar2.f15377b[i7]) {
                j0 j0Var = vVar2.f15378c[i7];
                for (int i8 = 0; i8 < j0Var.f15034a; i8++) {
                    U a3 = j0Var.a(i8);
                    a0 a4 = oVar.a(i7, a3, iArr[i7][i8]);
                    int i9 = a3.f2705a;
                    boolean[] zArr = new boolean[i9];
                    int i10 = 0;
                    while (i10 < i9) {
                        p pVar = (p) a4.get(i10);
                        int a5 = pVar.a();
                        if (zArr[i10] || a5 == 0) {
                            i5 = i6;
                        } else {
                            if (a5 == 1) {
                                randomAccess = I.o(pVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(pVar);
                                int i11 = i10 + 1;
                                while (i11 < i9) {
                                    p pVar2 = (p) a4.get(i11);
                                    int i12 = i6;
                                    if (pVar2.a() == 2 && pVar.b(pVar2)) {
                                        arrayList2.add(pVar2);
                                        zArr[i11] = true;
                                    }
                                    i11++;
                                    i6 = i12;
                                }
                                randomAccess = arrayList2;
                            }
                            i5 = i6;
                            arrayList.add(randomAccess);
                        }
                        i10++;
                        i6 = i5;
                    }
                }
            }
            i7++;
            vVar2 = vVar;
            i6 = i6;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            iArr2[i13] = ((p) list.get(i13)).f15347c;
        }
        p pVar3 = (p) list.get(0);
        return Pair.create(new s(0, pVar3.f15346b, iArr2), Integer.valueOf(pVar3.f15345a));
    }

    @Override // t0.w
    public final void a() {
        U.b bVar;
        m mVar;
        synchronized (this.f15366c) {
            try {
                Thread thread = this.f15370g;
                if (thread != null) {
                    AbstractC0124a.s("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (bVar = this.f15371h) != null) {
            Handler handler = (Handler) bVar.f3019c;
            Spatializer spatializer = (Spatializer) bVar.f3018b;
            if (spatializer != null && (mVar = (m) bVar.f3020d) != null && handler != null) {
                spatializer.removeOnSpatializerStateChangedListener(mVar);
                handler.removeCallbacksAndMessages(null);
            }
            this.f15371h = null;
        }
        this.f15382a = null;
        this.f15383b = null;
    }

    public final void e() {
        boolean z;
        M m4;
        U.b bVar;
        synchronized (this.f15366c) {
            try {
                z = this.f15369f.f15327A && Build.VERSION.SDK_INT >= 32 && (bVar = this.f15371h) != null && bVar.f3017a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (m4 = this.f15382a) == null) {
            return;
        }
        m4.f3962h.e(10);
    }

    public final void h(l lVar) {
        boolean equals;
        synchronized (this.f15366c) {
            equals = this.f15369f.equals(lVar);
            this.f15369f = lVar;
        }
        if (equals) {
            return;
        }
        if (lVar.f15327A && this.f15367d == null) {
            AbstractC0108a.s("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        M m4 = this.f15382a;
        if (m4 != null) {
            m4.f3962h.e(10);
        }
    }
}
