package v0;

import a0.a0;
import a0.g1;
import c6.m;
import g2.v;
import java.util.Arrays;
import m0.n;
import m0.s;
import r.s1;
import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f7447a = new a0(21, new v(13), new s1(20));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Object b(Object[] objArr, i iVar, p6.a aVar, s sVar, int i) {
        return c(Arrays.copyOf(objArr, objArr.length), iVar, aVar, sVar, 384 | ((i << 3) & 7168), 0);
    }

    public static final Object c(Object[] objArr, i iVar, p6.a aVar, s sVar, int i, int i8) {
        Object[] objArr2;
        i iVar2;
        final Object obj;
        Object e8;
        long j7 = sVar.T;
        o.p(36);
        final String l3 = Long.toString(j7, 36);
        q6.i.d(l3, "toString(...)");
        q6.i.c(iVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final e eVar = (e) sVar.j(g.f7442a);
        Object K = sVar.K();
        Object obj2 = n.f5019a;
        if (K == obj2) {
            Object d8 = (eVar == null || (e8 = eVar.e(l3)) == null) ? null : iVar.d(e8);
            if (d8 == null) {
                d8 = aVar.b();
            }
            objArr2 = objArr;
            iVar2 = iVar;
            Object bVar = new b(iVar2, eVar, l3, d8, objArr2);
            sVar.f0(bVar);
            K = bVar;
        } else {
            objArr2 = objArr;
            iVar2 = iVar;
        }
        final b bVar2 = (b) K;
        Object obj3 = Arrays.equals(objArr2, bVar2.f7432h) ? bVar2.f7431g : null;
        if (obj3 == null) {
            obj3 = aVar.b();
        }
        boolean h8 = sVar.h(bVar2) | ((((i & 112) ^ 48) > 32 && sVar.h(iVar2)) || (i & 48) == 32) | sVar.h(eVar) | sVar.f(l3) | sVar.h(obj3) | sVar.h(objArr2);
        Object K2 = sVar.K();
        if (h8 || K2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = obj3;
            final i iVar3 = iVar2;
            Object obj4 = new p6.a() { // from class: v0.a
                @Override // p6.a
                public final Object b() {
                    boolean z3;
                    b bVar3 = b.this;
                    e eVar2 = bVar3.f7429e;
                    e eVar3 = eVar;
                    boolean z7 = true;
                    if (eVar2 != eVar3) {
                        bVar3.f7429e = eVar3;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String str = bVar3.f7430f;
                    String str2 = l3;
                    if (q6.i.a(str, str2)) {
                        z7 = z3;
                    } else {
                        bVar3.f7430f = str2;
                    }
                    bVar3.f7428d = iVar3;
                    bVar3.f7431g = obj;
                    bVar3.f7432h = objArr3;
                    g1 g1Var = bVar3.i;
                    if (g1Var != null && z7) {
                        g1Var.P();
                        bVar3.i = null;
                        bVar3.a();
                    }
                    return m.f1757a;
                }
            };
            sVar.f0(obj4);
            K2 = obj4;
        } else {
            obj = obj3;
        }
        m0.b.g((p6.a) K2, sVar);
        return obj;
    }

    public static final d d(s sVar) {
        sVar.V(1967008021);
        Object[] objArr = new Object[0];
        Object K = sVar.K();
        if (K == n.f5019a) {
            K = new c.e(28);
            sVar.f0(K);
        }
        d dVar = (d) b(objArr, d.f7434h, (p6.a) K, sVar, 384);
        dVar.f7437f = (e) sVar.j(g.f7442a);
        sVar.p(false);
        return dVar;
    }
}
