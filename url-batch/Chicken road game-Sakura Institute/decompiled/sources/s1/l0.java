package s1;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8277g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f8278h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i7, Object obj) {
        super(1);
        this.f8277g = i7;
        this.f8278h = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0270  */
    @Override // q6.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj) {
        int i7;
        switch (this.f8277g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new c.g(6, (i1) this.f8278h);
            case 1:
                boolean compareAndSet = m1.f8288b.compareAndSet(false, true);
                d6.z zVar = d6.z.f2639a;
                if (compareAndSet) {
                    ((e7.e) this.f8278h).e(zVar);
                }
                return zVar;
            case 2:
                b1.e eVar = (b1.e) obj;
                n1 n1Var = (n1) this.f8278h;
                z0.r k8 = eVar.B().k();
                q6.e eVar2 = n1Var.f8295i;
                if (eVar2 != null) {
                    eVar2.d(k8, (c1.c) eVar.B().f1231h);
                }
                return d6.z.f2639a;
            case 3:
                g2.n nVar = (g2.n) obj;
                y.w wVar = nVar.f4049b;
                if (wVar != null) {
                    nVar.a(wVar);
                    nVar.f4049b = null;
                }
                p1 p1Var = (p1) this.f8278h;
                i0.d dVar = p1Var.f8347d;
                int i8 = dVar.f4842h;
                if (i8 > 0) {
                    Object[] objArr = dVar.f4840f;
                    i7 = 0;
                    while (!r6.k.a((WeakReference) objArr[i7], nVar)) {
                        i7++;
                        if (i7 >= i8) {
                        }
                    }
                    if (i7 >= 0) {
                        dVar.o(i7);
                    }
                    if (dVar.l()) {
                        p1Var.f8345b.a();
                    }
                    return d6.z.f2639a;
                }
                i7 = -1;
                if (i7 >= 0) {
                }
                if (dVar.l()) {
                }
                return d6.z.f2639a;
            case 4:
                ((q6.e) this.f8278h).d((z0.r) obj, null);
                return d6.z.f2639a;
            case 5:
                t3.h hVar = (t3.h) obj;
                t3.g0 g0Var = (t3.g0) this.f8278h;
                r6.k.f(hVar, "backStackEntry");
                t3.v vVar = hVar.f8792g;
                if (vVar == null) {
                    vVar = null;
                }
                if (vVar != null) {
                    hVar.g();
                    t3.v c4 = g0Var.c(vVar);
                    if (c4 != null) {
                        if (c4.equals(vVar)) {
                            return hVar;
                        }
                        t3.k b9 = g0Var.b();
                        Bundle a3 = c4.a(hVar.g());
                        t3.b0 b0Var = b9.f8818h;
                        return j4.i.k(b0Var.f8745a, c4, a3, b0Var.g(), b0Var.f8760p);
                    }
                }
                return null;
            case 6:
                Bundle bundle = (Bundle) obj;
                t3.b0 b10 = u3.t.b((Context) this.f8278h);
                LinkedHashMap linkedHashMap = b10.f8758n;
                if (bundle != null) {
                    bundle.setClassLoader(b10.f8745a.getClassLoader());
                    b10.f8748d = bundle.getBundle("android-support-nav:controller:navigatorState");
                    b10.f8749e = bundle.getParcelableArray("android-support-nav:controller:backStack");
                    linkedHashMap.clear();
                    int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                    int i9 = 0;
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            b10.f8757m.put(Integer.valueOf(intArray[i10]), stringArrayList.get(i11));
                            i10++;
                            i11++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        int size = stringArrayList2.size();
                        while (i9 < size) {
                            String str = stringArrayList2.get(i9);
                            i9++;
                            String str2 = str;
                            Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str2);
                            if (parcelableArray != null) {
                                r6.k.e(str2, "id");
                                e6.j jVar = new e6.j(parcelableArray.length);
                                d6.q h3 = r6.k.h(parcelableArray);
                                while (h3.hasNext()) {
                                    Parcelable parcelable = (Parcelable) h3.next();
                                    r6.k.d(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                    jVar.addLast((t3.i) parcelable);
                                }
                                linkedHashMap.put(str2, jVar);
                            }
                        }
                    }
                    b10.f8750f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                return b10;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((y1.i) obj).m(a0.g0.f72c, new a0.f0(w.z.f9467f, ((a0.o) this.f8278h).a(), 2, true));
                return d6.z.f2639a;
            case 8:
                float[] fArr = ((z0.f0) obj).f9990a;
                p1.p pVar = (p1.p) this.f8278h;
                if (pVar.O()) {
                    p1.s0.f(pVar).k(pVar, fArr);
                }
                return d6.z.f2639a;
            case q.c.f7259c /* 9 */:
                float floatValue = ((Number) obj).floatValue();
                w.x0 x0Var = (w.x0) this.f8278h;
                g0.c1 c1Var = x0Var.f9455a;
                g0.c1 c1Var2 = x0Var.f9455a;
                float e9 = c1Var.e() + floatValue;
                g0.c1 c1Var3 = x0Var.f9456b;
                if (e9 > c1Var3.e()) {
                    floatValue = c1Var3.e() - c1Var2.e();
                } else if (e9 < 0.0f) {
                    floatValue = -c1Var2.e();
                }
                c1Var2.f(c1Var2.e() + floatValue);
                return Float.valueOf(floatValue);
            case q.c.f7261e /* 10 */:
                r1.f0 f0Var = (r1.f0) obj;
                ((a0.y) this.f8278h).f(f0Var);
                f0Var.b();
                return d6.z.f2639a;
            case 11:
                z0.n0 n0Var = (z0.n0) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.f8278h;
                n0Var.h(n0Var.f10026r.a() * n.f.f6481d);
                n0Var.i(shadowGraphicsLayerElement.f703a);
                n0Var.e(shadowGraphicsLayerElement.f704b);
                n0Var.c(shadowGraphicsLayerElement.f705c);
                n0Var.j(shadowGraphicsLayerElement.f706d);
                return d6.z.f2639a;
            case 12:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.f8278h).cancel();
                }
                return d6.z.f2639a;
            case 13:
                ((y.w) this.f8278h).a((g2.i) obj);
                return d6.z.f2639a;
            case 14:
                y1.r.d((y1.i) obj, ((y1.f) this.f8278h).f9803a);
                return d6.z.f2639a;
            case q.c.f7263g /* 15 */:
                ((List) obj).add((Float) ((s.a0) this.f8278h).a());
                return true;
            case 16:
                z0.n0 n0Var2 = (z0.n0) obj;
                z0.q0 q0Var = (z0.q0) this.f8278h;
                n0Var2.f(q0Var.f10037s);
                n0Var2.g(q0Var.f10038t);
                n0Var2.b(q0Var.f10039u);
                n0Var2.h(q0Var.f10040v);
                float f9 = q0Var.f10041w;
                if (n0Var2.f10021m != f9) {
                    n0Var2.f10014f |= 2048;
                    n0Var2.f10021m = f9;
                }
                n0Var2.k(q0Var.f10042x);
                n0Var2.i(q0Var.f10043y);
                n0Var2.e(q0Var.f10044z);
                n0Var2.c(q0Var.A);
                n0Var2.j(q0Var.B);
                return d6.z.f2639a;
            default:
                w6.d dVar2 = (w6.d) obj;
                r6.k.f(dVar2, "it");
                return z6.h.R((CharSequence) this.f8278h, dVar2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(t3.g0 g0Var, t3.d0 d0Var) {
        super(1);
        this.f8277g = 5;
        this.f8278h = g0Var;
    }
}
