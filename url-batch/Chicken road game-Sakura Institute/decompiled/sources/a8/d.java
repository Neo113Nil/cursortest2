package a8;

import a0.x0;
import a2.k0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.R;
import com.chicken.road.whale.store.Meal;
import d0.a4;
import d0.b4;
import d0.d3;
import d0.g3;
import d0.q0;
import d0.s0;
import d0.x3;
import e5.t;
import e6.b0;
import f8.g0;
import f8.u;
import g0.g1;
import g0.n2;
import g0.z0;
import i.e0;
import i.x;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import k.v;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l.k1;
import l.p1;
import l.t1;
import l.u1;
import l.x1;
import l1.a0;
import m.s;
import m.t0;
import m.u0;
import m.v0;
import m.w0;
import o.y0;
import o7.n0;
import p1.p;
import q.l0;
import q.m0;
import q0.q;
import s1.f1;
import t3.f0;
import t3.h0;
import u3.r;
import w.j0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class d implements c2.e {

    /* renamed from: f, reason: collision with root package name */
    public static z0.h f544f;

    /* renamed from: g, reason: collision with root package name */
    public static z0.d f545g;

    /* renamed from: h, reason: collision with root package name */
    public static b1.c f546h;

    /* renamed from: i, reason: collision with root package name */
    public static f1.f f547i;

    public static void A(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            e5.c cVar = (e5.c) obj;
            e5.j jVar = new e5.j(cVar);
            for (t tVar : cVar.f2761b) {
                boolean z8 = cVar.f2763d == 0;
                e5.k kVar = new e5.k(tVar, !z8);
                if (!hashMap.containsKey(kVar)) {
                    hashMap.put(kVar, new HashSet());
                }
                Set set = (Set) hashMap.get(kVar);
                if (!set.isEmpty() && z8) {
                    throw new IllegalArgumentException("Multiple components provide " + tVar + ".");
                }
                set.add(jVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (e5.j jVar2 : (Set) it.next()) {
                for (e5.l lVar : jVar2.f2780a.f2762c) {
                    if (lVar.f2787c == 0) {
                        Set<e5.j> set2 = (Set) hashMap.get(new e5.k(lVar.f2785a, lVar.f2786b == 2));
                        if (set2 != null) {
                            for (e5.j jVar3 : set2) {
                                jVar2.f2781b.add(jVar3);
                                jVar3.f2782c.add(jVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            e5.j jVar4 = (e5.j) it3.next();
            if (jVar4.f2782c.isEmpty()) {
                hashSet2.add(jVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            e5.j jVar5 = (e5.j) hashSet2.iterator().next();
            hashSet2.remove(jVar5);
            i7++;
            Iterator it4 = jVar5.f2781b.iterator();
            while (it4.hasNext()) {
                e5.j jVar6 = (e5.j) it4.next();
                jVar6.f2782c.remove(jVar5);
                if (jVar6.f2782c.isEmpty()) {
                    hashSet2.add(jVar6);
                }
            }
        }
        if (i7 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            e5.j jVar7 = (e5.j) it5.next();
            if (!jVar7.f2782c.isEmpty() && !jVar7.f2781b.isEmpty()) {
                arrayList2.add(jVar7.f2780a);
            }
        }
        throw new e5.m("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static final long B(long j8) {
        long j9 = (j8 << 1) + 1;
        int i7 = a7.a.f526i;
        int i8 = a7.b.f528a;
        return j9;
    }

    public static final long C(long j8) {
        if (-4611686018426L > j8 || j8 >= 4611686018427L) {
            return B(v1.g.f(j8, -4611686018427387903L, 4611686018427387903L));
        }
        long j9 = (j8 * 1000000) << 1;
        int i7 = a7.a.f526i;
        int i8 = a7.b.f528a;
        return j9;
    }

    public static void D(Parcel parcel, int i7) {
        if (parcel.dataPosition() != i7) {
            throw new b4.c(a0.m.i("Overread allowed size end=", i7), parcel);
        }
    }

    public static String E(List list, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            i7++;
            if (i7 > 1) {
                sb.append((CharSequence) str);
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final void F(l7.b bVar, n7.a aVar, String str) {
        r6.k.f(bVar, "<this>");
        j4.i t2 = aVar.t();
        bVar.getClass();
        t2.getClass();
        n0.e(str, null);
        throw null;
    }

    public static final int G(f2.k kVar, int i7) {
        boolean z8 = r6.k.g(kVar.f3280f, f2.k.f3277g.f3280f) >= 0;
        boolean z9 = i7 == 1;
        if (z9 && z8) {
            return 3;
        }
        if (z8) {
            return 1;
        }
        return z9 ? 2 : 0;
    }

    public static String H(Class cls) {
        LinkedHashMap linkedHashMap = h0.f8803b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            f0 f0Var = (f0) cls.getAnnotation(f0.class);
            str = f0Var != null ? f0Var.value() : null;
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, str);
        }
        r6.k.c(str);
        return str;
    }

    public static Intent I(Context context, ComponentName componentName) {
        String J = J(context, componentName);
        if (J == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), J);
        return J(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String J(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static int K(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 4) {
            return 2;
        }
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 == 32) {
            return 5;
        }
        if (i7 == 64) {
            return 6;
        }
        if (i7 == 128) {
            return 7;
        }
        if (i7 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(a0.m.i("type needs to be >= FIRST and <= LAST, type=", i7));
    }

    public static final boolean L(AssertionError assertionError) {
        Logger logger = u.f3642a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? z6.h.y(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    public static final boolean M(x0 x0Var, boolean z8) {
        p c4;
        j0 j0Var = x0Var.f178d;
        if (j0Var == null || (c4 = j0Var.c()) == null) {
            return false;
        }
        y0.d T = t6.a.T(c4);
        long i7 = x0Var.i(z8);
        float f9 = T.f9780a;
        float f10 = T.f9782c;
        float d8 = y0.c.d(i7);
        if (f9 > d8 || d8 > f10) {
            return false;
        }
        float f11 = T.f9781b;
        float f12 = T.f9783d;
        float e9 = y0.c.e(i7);
        return f11 <= e9 && e9 <= f12;
    }

    public static s7.k O(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            String str = strArr2[i8];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i8] = z6.h.W(str).toString();
        }
        int x8 = a.a.x(0, strArr2.length - 1, 2);
        if (x8 >= 0) {
            while (true) {
                String str2 = strArr2[i7];
                String str3 = strArr2[i7 + 1];
                t(str2);
                u(str3, str2);
                if (i7 == x8) {
                    break;
                }
                i7 += 2;
            }
        }
        return new s7.k(strArr2);
    }

    public static final long P(String str) {
        int length = str.length();
        int i7 = (length <= 0 || !z6.h.x("+-", str.charAt(0))) ? 0 : 1;
        if (length - i7 > 16) {
            Iterable dVar = new w6.d(i7, z6.h.B(str), 1);
            if (!(dVar instanceof Collection) || !((Collection) dVar).isEmpty()) {
                Iterator it = dVar.iterator();
                while (((w6.c) it).f9526h) {
                    char charAt = str.charAt(((b0) it).nextInt());
                    if ('0' <= charAt && charAt < ':') {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return z6.o.v(str, "+") ? Long.parseLong(z6.h.z(str, 1)) : Long.parseLong(str);
    }

    public static boolean T(Parcel parcel, int i7) {
        g0(parcel, i7, 4);
        return parcel.readInt() != 0;
    }

    public static int U(Parcel parcel, int i7) {
        g0(parcel, i7, 4);
        return parcel.readInt();
    }

    public static int V(Parcel parcel, int i7) {
        return (i7 & (-65536)) != -65536 ? (char) (i7 >> 16) : parcel.readInt();
    }

    public static final p0.g W(g0.p pVar) {
        pVar.Q(-796080049);
        p0.g gVar = (p0.g) a.a.E(new Object[0], p0.g.f7002d, p0.h.f7006h, pVar, 3072, 4);
        gVar.f7005c = (p0.i) pVar.k(p0.k.f7012a);
        pVar.p(false);
        return gVar;
    }

    public static final s0.o X(s0.o oVar, y0 y0Var, o.j0 j0Var, boolean z8, o.k kVar, p.j jVar, g0.p pVar) {
        w0 w0Var;
        y0 y0Var2;
        o.j0 j0Var2;
        boolean z9;
        o.k kVar2;
        s0.o oVar2;
        boolean z10;
        p.j jVar2;
        Context context = (Context) pVar.k(AndroidCompositionLocals_androidKt.f739b);
        u0 u0Var = (u0) pVar.k(v0.f6270a);
        if (u0Var != null) {
            pVar.Q(1586021609);
            boolean f9 = pVar.f(context) | pVar.f(u0Var);
            Object G = pVar.G();
            if (f9 || G == g0.l.f3784a) {
                G = new m.f(context, u0Var);
                pVar.a0(G);
            }
            w0Var = (m.f) G;
            pVar.p(false);
        } else {
            pVar.Q(1586120933);
            pVar.p(false);
            w0Var = t0.f6261h;
        }
        w0 w0Var2 = w0Var;
        o.j0 j0Var3 = o.j0.f6657f;
        s0.o j8 = oVar.j(j0Var == j0Var3 ? s.f6253c : s.f6252b).j(w0Var2.d());
        if (((m2.k) pVar.k(f1.f8223l)) != m2.k.f6323g || j0Var == j0Var3) {
            y0Var2 = y0Var;
            j0Var2 = j0Var;
            z9 = z8;
            kVar2 = kVar;
            oVar2 = j8;
            z10 = true;
            jVar2 = jVar;
        } else {
            y0Var2 = y0Var;
            j0Var2 = j0Var;
            kVar2 = kVar;
            jVar2 = jVar;
            oVar2 = j8;
            z10 = false;
            z9 = z8;
        }
        return androidx.compose.foundation.gestures.a.b(oVar2, y0Var2, j0Var2, w0Var2, z9, z10, kVar2, jVar2);
    }

    public static final void Y(c3.i iVar, y1.m mVar) {
        Object obj = mVar.i().f9832f.get(y1.p.f9865g);
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            throw new ClassCastException();
        }
        y1.m j8 = mVar.j();
        if (j8 == null) {
            return;
        }
        Object obj2 = j8.i().f9832f.get(y1.p.f9863e);
        if (obj2 == null) {
            obj2 = null;
        }
        if (obj2 != null) {
            Object obj3 = j8.i().f9832f.get(y1.p.f9864f);
            y1.b bVar = (y1.b) (obj3 != null ? obj3 : null);
            if (bVar == null || (bVar.f9795a >= 0 && bVar.f9796b >= 0)) {
                if (mVar.i().f9832f.containsKey(y1.p.A)) {
                    ArrayList arrayList = new ArrayList();
                    List h3 = y1.m.h(j8, 4);
                    int size = h3.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size; i8++) {
                        y1.m mVar2 = (y1.m) h3.get(i8);
                        if (mVar2.i().f9832f.containsKey(y1.p.A)) {
                            arrayList.add(mVar2);
                            if (mVar2.f9839c.t() < mVar.f9839c.t()) {
                                i7++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean p6 = p(arrayList);
                    int i9 = p6 ? 0 : i7;
                    int i10 = p6 ? i7 : 0;
                    Object obj4 = mVar.i().f9832f.get(y1.p.A);
                    if (obj4 == null) {
                        obj4 = Boolean.FALSE;
                    }
                    iVar.f1655a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i9, 1, i10, 1, false, ((Boolean) obj4).booleanValue()));
                }
            }
        }
    }

    public static final f8.c Z(Socket socket) {
        Logger logger = u.f3642a;
        f8.f0 f0Var = new f8.f0(socket);
        OutputStream outputStream = socket.getOutputStream();
        r6.k.e(outputStream, "getOutputStream(...)");
        return new f8.c(f0Var, new f8.c(outputStream, f0Var));
    }

    public static final void a(p1 p1Var, s0.o oVar, q6.c cVar, s0.c cVar2, q6.c cVar3, o0.a aVar, g0.p pVar, int i7) {
        int i8;
        u1 u1Var;
        q6.c cVar4;
        k.m mVar;
        q qVar;
        g0.p pVar2;
        k.m mVar2;
        q6.c cVar5 = cVar;
        pVar.S(-114689412);
        if ((i7 & 6) == 0) {
            i8 = (pVar.f(p1Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.f(oVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.h(cVar5) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= pVar.f(cVar2) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= pVar.h(cVar3) ? 16384 : 8192;
        }
        o0.a aVar2 = aVar;
        if ((196608 & i7) == 0) {
            i8 |= pVar.h(aVar2) ? 131072 : 65536;
        }
        if ((74899 & i8) == 74898 && pVar.x()) {
            pVar.L();
            cVar4 = cVar5;
            pVar2 = pVar;
        } else {
            int i9 = i8 & 14;
            boolean z8 = i9 == 4;
            Object G = pVar.G();
            Object obj = g0.l.f3784a;
            if (z8 || G == obj) {
                G = new k.m(p1Var, cVar2);
                pVar.a0(G);
            }
            k.m mVar3 = (k.m) G;
            boolean z9 = i9 == 4;
            Object G2 = pVar.G();
            Object obj2 = G2;
            if (z9 || G2 == obj) {
                Object[] objArr = {p1Var.f5610a.a()};
                q qVar2 = new q();
                qVar2.addAll(e6.k.i0(objArr));
                pVar.a0(qVar2);
                obj2 = qVar2;
            }
            q qVar3 = (q) obj2;
            boolean z10 = i9 == 4;
            Object G3 = pVar.G();
            if (z10 || G3 == obj) {
                long[] jArr = e0.f4736a;
                G3 = new x();
                pVar.a0(G3);
            }
            x xVar = (x) G3;
            u1 u1Var2 = p1Var.f5610a;
            g1 g1Var = p1Var.f5613d;
            if (!qVar3.contains(u1Var2.a())) {
                qVar3.clear();
                qVar3.add(u1Var2.a());
            }
            if (r6.k.a(u1Var2.a(), g1Var.getValue())) {
                if (qVar3.size() != 1 || !r6.k.a(qVar3.get(0), u1Var2.a())) {
                    qVar3.clear();
                    qVar3.add(u1Var2.a());
                }
                if (xVar.f4816e != 1 || xVar.b(u1Var2.a())) {
                    xVar.a();
                }
                mVar3.f5240b = cVar2;
            }
            if (r6.k.a(u1Var2.a(), g1Var.getValue()) || qVar3.contains(g1Var.getValue())) {
                u1Var = u1Var2;
            } else {
                ListIterator listIterator = qVar3.listIterator();
                int i10 = 0;
                while (true) {
                    f6.a aVar3 = (f6.a) listIterator;
                    u1Var = u1Var2;
                    if (!aVar3.hasNext()) {
                        i10 = -1;
                        break;
                    } else {
                        if (r6.k.a(cVar3.f(aVar3.next()), cVar3.f(g1Var.getValue()))) {
                            break;
                        }
                        i10++;
                        u1Var2 = u1Var;
                    }
                }
                if (i10 == -1) {
                    qVar3.add(g1Var.getValue());
                } else {
                    qVar3.set(i10, g1Var.getValue());
                }
            }
            if (xVar.b(g1Var.getValue()) && xVar.b(u1Var.a())) {
                pVar.Q(915535767);
                pVar.p(false);
                cVar4 = cVar5;
                mVar = mVar3;
            } else {
                pVar.Q(912931457);
                xVar.a();
                int size = qVar3.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = qVar3.get(i11);
                    xVar.i(obj3, o0.f.b(885640742, new k.e(p1Var, obj3, cVar5, mVar3, qVar3, aVar2), pVar));
                    i11++;
                    cVar5 = cVar5;
                    aVar2 = aVar;
                }
                cVar4 = cVar5;
                mVar = mVar3;
                pVar.p(false);
            }
            boolean f9 = pVar.f(p1Var.f()) | pVar.f(mVar);
            Object G4 = pVar.G();
            if (f9 || G4 == obj) {
                G4 = (v) cVar4.f(mVar);
                pVar.a0(G4);
            }
            v vVar = (v) G4;
            p1 p1Var2 = mVar.f5239a;
            boolean f10 = pVar.f(mVar);
            Object G5 = pVar.G();
            if (f10 || G5 == obj) {
                G5 = g0.d.J(Boolean.FALSE, g0.t0.f3903k);
                pVar.a0(G5);
            }
            z0 z0Var = (z0) G5;
            z0 M = g0.d.M(vVar.f5277d, pVar);
            if (r6.k.a(p1Var2.f5610a.a(), p1Var2.f5613d.getValue())) {
                z0Var.setValue(Boolean.FALSE);
            } else if (M.getValue() != null) {
                z0Var.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) z0Var.getValue()).booleanValue();
            s0.o oVar2 = s0.l.f8103a;
            if (booleanValue) {
                pVar.Q(249037309);
                k.m mVar4 = mVar;
                qVar = qVar3;
                pVar2 = pVar;
                mVar2 = mVar4;
                k1 a3 = t1.a(mVar4.f5239a, x1.f5729h, null, pVar2, 0, 2);
                boolean f11 = pVar2.f(a3);
                Object G6 = pVar2.G();
                if (f11 || G6 == obj) {
                    G6 = v0.d.e(oVar2).j(new k.l(mVar2, a3, M));
                    pVar2.a0(G6);
                }
                oVar2 = (s0.o) G6;
                pVar2.p(false);
            } else {
                qVar = qVar3;
                pVar2 = pVar;
                mVar2 = mVar;
                pVar2.Q(249353726);
                pVar2.p(false);
            }
            s0.o j8 = oVar.j(oVar2);
            Object G7 = pVar2.G();
            if (G7 == obj) {
                G7 = new k.h(mVar2);
                pVar2.a0(G7);
            }
            k.h hVar = (k.h) G7;
            int i12 = pVar2.P;
            g0.k1 m8 = pVar2.m();
            s0.o c4 = s0.a.c(pVar2, j8);
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            pVar2.U();
            if (pVar2.O) {
                pVar2.l(nVar);
            } else {
                pVar2.d0();
            }
            g0.d.Q(pVar2, hVar, r1.i.f7784e);
            g0.d.Q(pVar2, m8, r1.i.f7783d);
            r1.h hVar2 = r1.i.f7785f;
            if (pVar2.O || !r6.k.a(pVar2.G(), Integer.valueOf(i12))) {
                a0.m.q(i12, pVar2, i12, hVar2);
            }
            g0.d.Q(pVar2, c4, r1.i.f7782c);
            pVar2.Q(-1491001814);
            int size2 = qVar.size();
            int i13 = 0;
            while (i13 < size2) {
                q qVar4 = qVar;
                Object obj4 = qVar4.get(i13);
                pVar2.M(1908315325, 0, cVar3.f(obj4), null);
                q6.e eVar = (q6.e) xVar.e(obj4);
                if (eVar == null) {
                    pVar2.Q(-971711888);
                } else {
                    pVar2.Q(1908317105);
                    eVar.d(pVar2, 0);
                }
                pVar2.p(false);
                pVar2.p(false);
                i13++;
                qVar = qVar4;
            }
            pVar2.p(false);
            pVar2.p(true);
        }
        g0.p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new g3(p1Var, oVar, cVar4, cVar2, cVar3, aVar, i7);
        }
    }

    public static void a0(Parcel parcel, int i7) {
        parcel.setDataPosition(parcel.dataPosition() + V(parcel, i7));
    }

    public static final void b(final String str, s0.o oVar, g0.p pVar, final int i7, final int i8) {
        final s0.o oVar2;
        int i9;
        g0.p pVar2 = pVar;
        r6.k.f(str, "text");
        pVar2.S(446336081);
        int i10 = i7 | (pVar2.f(str) ? 4 : 2);
        int i11 = i8 & 2;
        if (i11 != 0) {
            i9 = i10 | 48;
            oVar2 = oVar;
        } else {
            oVar2 = oVar;
            i9 = i10 | (pVar2.f(oVar2) ? 32 : 16);
        }
        if ((i9 & 19) == 18 && pVar2.x()) {
            pVar2.L();
        } else {
            s0.o oVar3 = i11 != 0 ? s0.l.f8103a : oVar2;
            s0.o e9 = androidx.compose.foundation.layout.b.e(oVar3.j(androidx.compose.foundation.layout.c.f640c), 32);
            p1.f0 e10 = q.n.e(s0.b.f8082j, false);
            int i12 = pVar2.P;
            g0.k1 m8 = pVar2.m();
            s0.o c4 = s0.a.c(pVar2, e9);
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            pVar2.U();
            if (pVar2.O) {
                pVar2.l(nVar);
            } else {
                pVar2.d0();
            }
            g0.d.Q(pVar2, e10, r1.i.f7784e);
            g0.d.Q(pVar2, m8, r1.i.f7783d);
            r1.h hVar = r1.i.f7785f;
            if (pVar2.O || !r6.k.a(pVar2.G(), Integer.valueOf(i12))) {
                a0.m.q(i12, pVar2, i12, hVar);
            }
            g0.d.Q(pVar2, c4, r1.i.f7782c);
            x3.b(str, null, ((q0) pVar2.k(s0.f2378a)).f2318s, 0L, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, ((a4) pVar2.k(b4.f1865a)).f1840j, pVar, i9 & 14, 0, 65018);
            pVar2 = pVar;
            pVar2.p(true);
            oVar2 = oVar3;
        }
        g0.p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new q6.e(str, oVar2, i7, i8) { // from class: g4.h

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ String f4300f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ s0.o f4301g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ int f4302h;

                {
                    this.f4302h = i8;
                }

                @Override // q6.e
                public final Object d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int T = g0.d.T(1);
                    a8.d.b(this.f4300f, this.f4301g, (g0.p) obj, T, this.f4302h);
                    return d6.z.f2639a;
                }
            };
        }
    }

    public static final f8.d b0(Socket socket) {
        Logger logger = u.f3642a;
        f8.f0 f0Var = new f8.f0(socket);
        InputStream inputStream = socket.getInputStream();
        r6.k.e(inputStream, "getInputStream(...)");
        return new f8.d(f0Var, 0, new f8.d(inputStream, 1, f0Var));
    }

    public static final void c0(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final long d0(long j8, a7.c cVar) {
        r6.k.f(cVar, "unit");
        a7.c cVar2 = a7.c.NANOSECONDS;
        r6.k.f(cVar2, "sourceUnit");
        TimeUnit timeUnit = cVar.f536f;
        TimeUnit timeUnit2 = cVar2.f536f;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) > j8 || j8 > convert) {
            a7.c cVar3 = a7.c.MILLISECONDS;
            r6.k.f(cVar3, "targetUnit");
            return B(v1.g.f(cVar3.f536f.convert(j8, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long convert2 = timeUnit2.convert(j8, timeUnit) << 1;
        int i7 = a7.a.f526i;
        int i8 = a7.b.f528a;
        return convert2;
    }

    public static final void e(final Meal meal, final q6.g gVar, q6.a aVar, g0.p pVar, final int i7) {
        int i8;
        final q6.a aVar2;
        String notes;
        String str;
        String str2;
        String str3;
        g0.t0 t0Var = g0.t0.f3903k;
        r6.k.f(gVar, "onSave");
        r6.k.f(aVar, "onDismiss");
        pVar.S(-1135733918);
        if ((i7 & 6) == 0) {
            i8 = i7 | (pVar.f(meal) ? 4 : 2);
        } else {
            i8 = i7;
        }
        if (((i8 | (pVar.h(gVar) ? 32 : 16)) & 147) == 146 && pVar.x()) {
            pVar.L();
            aVar2 = aVar;
        } else {
            pVar.Q(1497260946);
            Object G = pVar.G();
            String str4 = "";
            g0.t0 t0Var2 = g0.l.f3784a;
            if (G == t0Var2) {
                if (meal == null || (str3 = meal.getName()) == null) {
                    str3 = "";
                }
                G = g0.d.J(str3, t0Var);
                pVar.a0(G);
            }
            z0 z0Var = (z0) G;
            pVar.p(false);
            pVar.Q(1497263066);
            Object G2 = pVar.G();
            if (G2 == t0Var2) {
                if (meal == null || (str2 = meal.getCategory()) == null) {
                    str2 = "Main";
                }
                G2 = g0.d.J(str2, t0Var);
                pVar.a0(G2);
            }
            z0 z0Var2 = (z0) G2;
            pVar.p(false);
            pVar.Q(1497265529);
            Object G3 = pVar.G();
            if (G3 == t0Var2) {
                if (meal == null || (str = meal.getIngredients()) == null) {
                    str = "";
                }
                G3 = g0.d.J(str, t0Var);
                pVar.a0(G3);
            }
            z0 z0Var3 = (z0) G3;
            pVar.p(false);
            pVar.Q(1497267763);
            Object G4 = pVar.G();
            if (G4 == t0Var2) {
                if (meal != null && (notes = meal.getNotes()) != null) {
                    str4 = notes;
                }
                G4 = g0.d.J(str4, t0Var);
                pVar.a0(G4);
            }
            z0 z0Var4 = (z0) G4;
            pVar.p(false);
            aVar2 = aVar;
            d3.a(aVar2, o0.f.b(2047574554, new g4.k(gVar, z0Var, z0Var2, z0Var3, z0Var4), pVar), null, o0.f.b(205098840, new g4.l(aVar, 0), pVar), o0.f.b(-1637376874, new g4.e(1, meal), pVar), o0.f.b(-411131083, new g4.n(z0Var, z0Var2, z0Var3, z0Var4), pVar), null, 0L, 0L, 0L, 0L, 0.0f, null, pVar, 1772598);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new q6.e() { // from class: g4.f
                @Override // q6.e
                public final Object d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int T = g0.d.T(i7 | 1);
                    a8.d.e(Meal.this, gVar, aVar2, (g0.p) obj, T);
                    return d6.z.f2639a;
                }
            };
        }
    }

    public static int e0(Parcel parcel) {
        int readInt = parcel.readInt();
        int V = V(parcel, readInt);
        char c4 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c4 != 20293) {
            throw new b4.c("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i7 = V + dataPosition;
        if (i7 < dataPosition || i7 > parcel.dataSize()) {
            throw new b4.c(r6.i.b(dataPosition, i7, "Size read is invalid start=", " end="), parcel);
        }
        return i7;
    }

    public static final void f(final List list, final q6.c cVar, final q6.a aVar, final q6.a aVar2, g0.p pVar, final int i7) {
        r6.k.f(list, "meals");
        r6.k.f(cVar, "onPick");
        r6.k.f(aVar, "onClear");
        r6.k.f(aVar2, "onDismiss");
        pVar.S(1037411205);
        if (((i7 | (pVar.h(list) ? 4 : 2) | (pVar.h(cVar) ? 32 : 16) | (pVar.h(aVar) ? 256 : 128)) & 1171) == 1170 && pVar.x()) {
            pVar.L();
        } else {
            d3.a(aVar2, o0.f.b(-58586051, new g4.l(aVar, 1), pVar), null, o0.f.b(-643357701, new g4.l(aVar2, 2), pVar), g4.v.f4415c, o0.f.b(-1520515176, new e4.c(list, 2, cVar), pVar), null, 0L, 0L, 0L, 0L, 0.0f, null, pVar, 1772598);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new q6.e(list, cVar, aVar, aVar2, i7) { // from class: g4.g

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ List f4291f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ q6.c f4292g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ q6.a f4293h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ q6.a f4294i;

                @Override // q6.e
                public final Object d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int T = g0.d.T(3073);
                    a8.d.f(this.f4291f, this.f4292g, this.f4293h, this.f4294i, (g0.p) obj, T);
                    return d6.z.f2639a;
                }
            };
        }
    }

    public static void g0(Parcel parcel, int i7, int i8) {
        int V = V(parcel, i7);
        if (V == i8) {
            return;
        }
        String hexString = Integer.toHexString(V);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i8);
        sb.append(" got ");
        sb.append(V);
        sb.append(" (0x");
        throw new b4.c(a0.m.m(sb, hexString, ")"), parcel);
    }

    public static final void h(String str, String str2, q6.a aVar, g0.p pVar, int i7) {
        long j8;
        g0.p pVar2 = pVar;
        r6.k.f(str, "slot");
        r6.k.f(aVar, "onClick");
        pVar2.S(1428392799);
        int i8 = i7 | (pVar2.f(str) ? 4 : 2) | (pVar2.f(str2) ? 32 : 16) | (pVar2.h(aVar) ? 256 : 128);
        if ((i8 & 147) == 146 && pVar2.x()) {
            pVar2.L();
        } else {
            s0.o g9 = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.b(s0.l.f8103a, 1.0f), false, null, aVar, 7), 0.0f, 8, 1);
            m0 a3 = l0.a(q.j.f7291a, s0.b.f8088p, pVar2, 48);
            int i9 = pVar2.P;
            g0.k1 m8 = pVar2.m();
            s0.o c4 = s0.a.c(pVar2, g9);
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            pVar2.U();
            if (pVar2.O) {
                pVar2.l(nVar);
            } else {
                pVar2.d0();
            }
            g0.d.Q(pVar2, a3, r1.i.f7784e);
            g0.d.Q(pVar2, m8, r1.i.f7783d);
            r1.h hVar = r1.i.f7785f;
            if (pVar2.O || !r6.k.a(pVar2.G(), Integer.valueOf(i9))) {
                a0.m.q(i9, pVar2, i9, hVar);
            }
            g0.d.Q(pVar2, c4, r1.i.f7782c);
            s0.o k8 = androidx.compose.foundation.layout.c.k(88);
            n2 n2Var = b4.f1865a;
            k0 k0Var = ((a4) pVar2.k(n2Var)).f1843m;
            n2 n2Var2 = s0.f2378a;
            x3.b(str, k8, ((q0) pVar2.k(n2Var2)).f2318s, 0L, 0L, null, null, 0L, 0, false, 0, 0, k0Var, pVar, (i8 & 14) | 48, 0, 65528);
            pVar.Q(300653629);
            String j9 = str2 == null ? u3.q.j(R.string.slot_empty, pVar) : str2;
            pVar.p(false);
            k0 k0Var2 = ((a4) pVar.k(n2Var)).f1841k;
            if (str2 != null) {
                pVar.Q(300659159);
                j8 = ((q0) pVar.k(n2Var2)).f2316q;
            } else {
                pVar.Q(300660469);
                j8 = ((q0) pVar.k(n2Var2)).A;
            }
            pVar.p(false);
            x3.b(j9, null, j8, 0L, 0L, null, null, 0L, 0, false, 0, 0, k0Var2, pVar, 0, 0, 65530);
            pVar2 = pVar;
            pVar2.p(true);
        }
        g0.p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new g4.i(str, str2, aVar, i7, 1);
        }
    }

    public static final void i(String str, String str2, s0.o oVar, g0.p pVar, int i7) {
        r6.k.f(str2, "value");
        pVar.S(562454894);
        int i8 = (pVar.f(str2) ? 32 : 16) | i7 | (pVar.f(oVar) ? 256 : 128);
        if ((i8 & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            d3.c(oVar, null, null, null, o0.f.b(-1904560928, new g4.d(str2, 1, str), pVar), pVar, ((i8 >> 6) & 14) | 196608);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new g4.i(str, str2, oVar, i7, 0);
        }
    }

    public static final void k(boolean z8, l2.h hVar, x0 x0Var, g0.p pVar, int i7) {
        int i8;
        pVar.S(-1344558920);
        if ((i7 & 6) == 0) {
            i8 = (pVar.g(z8) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.f(hVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.h(x0Var) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            int i9 = i8 & 14;
            boolean f9 = (i9 == 4) | pVar.f(x0Var);
            Object G = pVar.G();
            g0.t0 t0Var = g0.l.f3784a;
            if (f9 || G == t0Var) {
                G = new a0.v0(x0Var, z8);
                pVar.a0(G);
            }
            w.n0 n0Var = (w.n0) G;
            boolean h3 = pVar.h(x0Var) | (i9 == 4);
            Object G2 = pVar.G();
            if (h3 || G2 == t0Var) {
                G2 = new a0.y0(x0Var, z8);
                pVar.a0(G2);
            }
            a0.o oVar = (a0.o) G2;
            boolean f10 = a2.j0.f(x0Var.j().f4066b);
            boolean h8 = pVar.h(n0Var);
            Object G3 = pVar.G();
            if (h8 || G3 == t0Var) {
                G3 = new a0.e0(n0Var, (h6.d) null, 1);
                pVar.a0(G3);
            }
            a.a.e(oVar, z8, hVar, f10, 0L, a0.a(s0.l.f8103a, n0Var, (q6.e) G3), pVar, (i8 << 3) & 1008);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a0.g(z8, hVar, x0Var, i7);
        }
    }

    public static final int l(int i7, i0.d dVar) {
        int i8 = dVar.f4842h - 1;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = ((i8 - i9) / 2) + i9;
            Object[] objArr = dVar.f4840f;
            int i11 = ((s.g) objArr[i10]).f8004a;
            if (i11 != i7) {
                if (i11 < i7) {
                    i9 = i10 + 1;
                    if (i7 < ((s.g) objArr[i9]).f8004a) {
                    }
                } else {
                    i8 = i10 - 1;
                }
            }
            return i10;
        }
        return i9;
    }

    public static final long m(String str) {
        a7.c cVar;
        long C;
        char charAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i7 = a7.a.f526i;
        char charAt2 = str.charAt(0);
        int i8 = (charAt2 == '+' || charAt2 == '-') ? 1 : 0;
        boolean z8 = i8 > 0 && str.length() > 0 && v1.g.h(str.charAt(0), '-', false);
        if (length <= i8) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i8) != 'P') {
            throw new IllegalArgumentException();
        }
        int i9 = i8 + 1;
        if (i9 == length) {
            throw new IllegalArgumentException();
        }
        a7.c cVar2 = null;
        long j8 = 0;
        boolean z9 = false;
        while (i9 < length) {
            if (str.charAt(i9) != 'T') {
                int i10 = i9;
                while (i10 < str.length() && (('0' <= (charAt = str.charAt(i10)) && charAt < ':') || z6.h.x("+-.", charAt))) {
                    i10++;
                }
                String substring = str.substring(i9, i10);
                r6.k.e(substring, "substring(...)");
                if (substring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = substring.length() + i9;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                }
                char charAt3 = str.charAt(length2);
                int i11 = length2 + 1;
                if (z9) {
                    if (charAt3 == 'H') {
                        cVar = a7.c.HOURS;
                    } else if (charAt3 == 'M') {
                        cVar = a7.c.MINUTES;
                    } else {
                        if (charAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                        }
                        cVar = a7.c.SECONDS;
                    }
                } else {
                    if (charAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                    }
                    cVar = a7.c.DAYS;
                }
                if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int D = z6.h.D(substring, '.', 0, 6);
                if (cVar != a7.c.SECONDS || D <= 0) {
                    j8 = a7.a.h(j8, d0(P(substring), cVar));
                } else {
                    String substring2 = substring.substring(0, D);
                    r6.k.e(substring2, "substring(...)");
                    long h3 = a7.a.h(j8, d0(P(substring2), cVar));
                    String substring3 = substring.substring(D);
                    r6.k.e(substring3, "substring(...)");
                    double parseDouble = Double.parseDouble(substring3);
                    double p6 = m.p(parseDouble, cVar, a7.c.NANOSECONDS);
                    if (Double.isNaN(p6)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long P = t6.a.P(p6);
                    if (-4611686018426999999L > P || P >= 4611686018427000000L) {
                        C = C(t6.a.P(m.p(parseDouble, cVar, a7.c.MILLISECONDS)));
                    } else {
                        C = P << 1;
                        int i12 = a7.a.f526i;
                        int i13 = a7.b.f528a;
                    }
                    j8 = a7.a.h(h3, C);
                }
                cVar2 = cVar;
                i9 = i11;
            } else {
                if (z9 || (i9 = i9 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z9 = true;
            }
        }
        if (!z8) {
            return j8;
        }
        long j9 = ((-(j8 >> 1)) << 1) + (((int) j8) & 1);
        int i14 = a7.b.f528a;
        return j9;
    }

    public static final f8.a0 n(g0 g0Var) {
        r6.k.f(g0Var, "<this>");
        return new f8.a0(g0Var);
    }

    public static m7.f o(String str, m mVar, SerialDescriptor[] serialDescriptorArr) {
        r6.k.f(str, "serialName");
        if (z6.h.G(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (mVar.equals(m7.h.f6463g)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        m7.a aVar = new m7.a(str);
        return new m7.f(str, mVar, aVar.f6435b.size(), e6.k.i0(serialDescriptorArr), aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [e6.u] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean p(ArrayList arrayList) {
        ?? r02;
        long j8;
        if (arrayList.size() >= 2) {
            if (arrayList.size() == 0 || arrayList.size() == 1) {
                r02 = e6.u.f2826f;
            } else {
                r02 = new ArrayList();
                Object obj = arrayList.get(0);
                int W = e6.m.W(arrayList);
                int i7 = 0;
                while (i7 < W) {
                    i7++;
                    Object obj2 = arrayList.get(i7);
                    y1.m mVar = (y1.m) obj2;
                    y1.m mVar2 = (y1.m) obj;
                    r02.add(new y0.c(r.a(Math.abs(y0.c.d(mVar2.e().a()) - y0.c.d(mVar.e().a())), Math.abs(y0.c.e(mVar2.e().a()) - y0.c.e(mVar.e().a())))));
                    obj = obj2;
                }
            }
            if (r02.size() == 1) {
                j8 = ((y0.c) e6.l.h0(r02)).f9778a;
            } else {
                if (r02.isEmpty()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object h02 = e6.l.h0(r02);
                int W2 = e6.m.W(r02);
                if (1 <= W2) {
                    int i8 = 1;
                    while (true) {
                        h02 = new y0.c(y0.c.h(((y0.c) h02).f9778a, ((y0.c) r02.get(i8)).f9778a));
                        if (i8 == W2) {
                            break;
                        }
                        i8++;
                    }
                }
                j8 = ((y0.c) h02).f9778a;
            }
            if (y0.c.e(j8) >= y0.c.d(j8)) {
                return false;
            }
        }
        return true;
    }

    public static void t(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(t7.b.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i7), str).toString());
            }
        }
    }

    public static void u(String str, String str2) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(t7.b.g("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i7), str2));
                sb.append(t7.b.o(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static int v(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l3.t w(Context context) {
        ProviderInfo providerInfo;
        g3.k kVar;
        ApplicationInfo applicationInfo;
        j4.i cVar = Build.VERSION.SDK_INT >= 28 ? new l3.c(14) : new j4.i(14);
        PackageManager packageManager = context.getPackageManager();
        a.a.m(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] o2 = cVar.o(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : o2) {
                    arrayList.add(signature.toByteArray());
                }
                kVar = new g3.k(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e9) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e9);
            }
            if (kVar != null) {
                return null;
            }
            return new l3.t(new l3.s(context, kVar));
        }
        kVar = null;
        if (kVar != null) {
        }
    }

    public static Parcelable x(Parcel parcel, int i7, Parcelable.Creator creator) {
        int V = V(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + V);
        return parcelable;
    }

    public static String y(Parcel parcel, int i7) {
        int V = V(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + V);
        return readString;
    }

    public static Object[] z(Parcel parcel, int i7, Parcelable.Creator creator) {
        int V = V(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + V);
        return createTypedArray;
    }

    public abstract int N(int i7);

    public abstract int Q(int i7);

    public abstract void R(q2.g gVar, q2.g gVar2);

    public abstract void S(q2.g gVar, Thread thread);

    @Override // c2.e
    public int c(int i7) {
        return Q(i7);
    }

    @Override // c2.e
    public int d(int i7) {
        return N(i7);
    }

    public abstract void f0(Object obj, Object obj2);

    @Override // c2.e
    public int g(int i7) {
        int N = N(i7);
        if (N == -1 || N(N) == -1) {
            return -1;
        }
        return N;
    }

    @Override // c2.e
    public int j(int i7) {
        int Q = Q(i7);
        if (Q == -1 || Q(Q) == -1) {
            return -1;
        }
        return Q;
    }

    public abstract boolean q(q2.h hVar, q2.d dVar);

    public abstract boolean r(q2.h hVar, Object obj, Object obj2);

    public abstract boolean s(q2.h hVar, q2.g gVar, q2.g gVar2);
}
