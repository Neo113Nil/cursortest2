package androidx.room;

import a0.l0;
import a2.h0;
import android.view.View;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.store.MealRepository;
import f7.f0;
import g0.c1;
import g0.g1;
import g0.k2;
import g0.l1;
import g0.q1;
import g0.s1;
import g0.t0;
import g0.t1;
import g0.u0;
import g0.z0;
import g4.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import l.a2;
import l.p1;
import l.x0;
import l1.d0;
import o.d1;
import o.k1;
import o.m0;
import s1.p0;
import w.j0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1074g;

    /* renamed from: h, reason: collision with root package name */
    public int f1075h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1076i;

    /* renamed from: j, reason: collision with root package name */
    public Object f1077j;

    /* renamed from: k, reason: collision with root package name */
    public Object f1078k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1079l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1080m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t1 t1Var, s1 s1Var, u0 u0Var, h6.d dVar) {
        super(2, dVar);
        this.f1074g = 1;
        this.f1078k = t1Var;
        this.f1079l = s1Var;
        this.f1080m = u0Var;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [j6.i, q6.f] */
    /* JADX WARN: Type inference failed for: r5v7, types: [q6.c, r6.l] */
    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f1074g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d dVar2 = new d((u) this.f1077j, (f7.g) this.f1078k, (String[]) this.f1079l, (Callable) this.f1080m, dVar, 0);
                dVar2.f1076i = obj;
                return dVar2;
            case 1:
                d dVar3 = new d((t1) this.f1078k, (s1) this.f1079l, (u0) this.f1080m, dVar);
                dVar3.f1076i = obj;
                return dVar3;
            case 2:
                d dVar4 = new d((List) this.f1079l, (ArrayList) this.f1080m, dVar);
                dVar4.f1078k = obj;
                return dVar4;
            case 3:
                return new d((q0) this.f1076i, (String) this.f1077j, (String) this.f1078k, (String) this.f1079l, (String) this.f1080m, dVar, 3);
            case 4:
                return new d((x0) this.f1079l, this.f1076i, (p1) this.f1080m, dVar);
            case 5:
                d dVar5 = new d((o.t1) this.f1077j, (o.i) this.f1078k, (o.d) this.f1079l, (c7.x0) this.f1080m, dVar, 5);
                dVar5.f1076i = obj;
                return dVar5;
            case 6:
                d dVar6 = new d((d0) this.f1077j, (j6.i) this.f1078k, (r6.l) this.f1079l, (m0) this.f1080m, dVar);
                dVar6.f1076i = obj;
                return dVar6;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                d dVar7 = new d((androidx.lifecycle.x) this.f1077j, (androidx.lifecycle.o) this.f1078k, (h6.i) this.f1079l, (f7.f) this.f1080m, dVar, 7);
                dVar7.f1076i = obj;
                return dVar7;
            case 8:
                d dVar8 = new d((u3.i) this.f1077j, (c1) this.f1078k, (z0) this.f1079l, (z0) this.f1080m, dVar, 8);
                dVar8.f1076i = obj;
                return dVar8;
            case q.c.f7259c /* 9 */:
                return new d((j0) this.f1076i, (z0) this.f1077j, (g2.x) this.f1078k, (a0.x0) this.f1079l, (g2.m) this.f1080m, dVar, 9);
            case q.c.f7261e /* 10 */:
                return new d((t.c) this.f1076i, (g2.w) this.f1077j, (j0) this.f1078k, (w.z0) this.f1079l, (g2.q) this.f1080m, dVar, 10);
            case 11:
                d dVar9 = new d((h7.c) this.f1077j, (z0) this.f1078k, (p.j) this.f1079l, (z0) this.f1080m, dVar, 11);
                dVar9.f1076i = obj;
                return dVar9;
            default:
                d dVar10 = new d((p0) this.f1077j, (q6.c) this.f1078k, (y.d) this.f1079l, (y.q) this.f1080m, dVar, 12);
                dVar10.f1076i = obj;
                return dVar10;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f1074g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((d) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 1:
                return ((d) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 2:
                return ((d) create(obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 3:
                return ((d) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 4:
                return ((d) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 5:
                return ((d) create((d1) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 6:
                return ((d) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((d) create((l1) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 8:
                return ((d) create((f7.f) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case q.c.f7259c /* 9 */:
                return ((d) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case q.c.f7261e /* 10 */:
                return ((d) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 11:
                return ((d) create((d0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            default:
                ((d) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
                return i6.a.f4956f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x04a3, code lost:
    
        if (l.x0.i(r8, r2) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0496, code lost:
    
        if (l.x0.h(r8, r2) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03d8, code lost:
    
        if (l.x0.j(r13, r2) == r15) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03c4, code lost:
    
        if (r1 == r15) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03ce, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03cf, code lost:
    
        if (r1 != r15) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03cb, code lost:
    
        if (r1 == r15) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x064f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v8, types: [j6.i, q6.f] */
    /* JADX WARN: Type inference failed for: r14v7, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.Collection] */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c7.x0 j8;
        f7.q0 q0Var;
        Object obj2;
        m0.b bVar;
        e5.a aVar;
        t1 t1Var;
        List w4;
        t1 t1Var2;
        Object obj3;
        List list;
        Iterator it;
        d dVar;
        k7.c cVar;
        x0 x0Var;
        Object k8;
        i6.a aVar2;
        g1 g1Var;
        Object obj4;
        x0 x0Var2;
        l.p0 p0Var;
        long j9;
        l.m mVar;
        l.m mVar2;
        Object d8;
        t3.h hVar;
        long a3;
        y0.d dVar2;
        int i7 = 6;
        int i8 = 4;
        int i9 = 0;
        int i10 = 2;
        h6.d dVar3 = null;
        int i11 = 1;
        switch (this.f1074g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                u uVar = (u) this.f1077j;
                d6.z zVar = d6.z.f2639a;
                i6.a aVar3 = i6.a.f4956f;
                int i12 = this.f1075h;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                c7.x xVar = (c7.x) this.f1076i;
                e7.e C = j1.c.C(-1, 6, null);
                c cVar2 = new c((String[]) this.f1079l, C);
                C.e(zVar);
                if (xVar.k().u(a0.f1064f) != null) {
                    throw new ClassCastException();
                }
                c7.t c4 = f.c(uVar);
                e7.e C2 = j1.c.C(0, 7, null);
                c7.a0.p(xVar, c4, null, new i0((u) this.f1077j, cVar2, C, (Callable) this.f1080m, C2, null, 1), 2);
                f7.g gVar = (f7.g) this.f1078k;
                this.f1075h = 1;
                Object i13 = f0.i(gVar, C2, true, this);
                if (i13 != aVar3) {
                    i13 = zVar;
                }
                return i13 == aVar3 ? aVar3 : zVar;
            case 1:
                i6.a aVar4 = i6.a.f4956f;
                int i14 = this.f1075h;
                if (i14 == 0) {
                    d6.a.e(obj);
                    j8 = c7.a0.j(((c7.x) this.f1076i).k());
                    t1 t1Var3 = (t1) this.f1078k;
                    synchronized (t1Var3.f3908b) {
                        Throwable th = t1Var3.f3910d;
                        if (th != null) {
                            throw th;
                        }
                        if (((q1) t1Var3.f3924r.getValue()).compareTo(q1.f3861g) <= 0) {
                            throw new IllegalStateException("Recomposer shut down");
                        }
                        if (t1Var3.f3909c != null) {
                            throw new IllegalStateException("Recomposer already running");
                        }
                        t1Var3.f3909c = j8;
                        t1Var3.t();
                    }
                    a2.a aVar5 = new a2.a(i10, (t1) this.f1078k);
                    b1.b bVar2 = q0.n.f7426a;
                    q0.n.f(q0.m.f7424i);
                    synchronized (q0.n.f7427b) {
                        q0.n.f7432g = e6.l.q0(q0.n.f7432g, aVar5);
                    }
                    e5.a aVar6 = new e5.a(4, aVar5);
                    f7.q0 q0Var2 = t1.f3905v;
                    t0 t0Var = ((t1) this.f1078k).f3927u;
                    try {
                        do {
                            q0Var = t1.f3905v;
                            obj2 = (j0.b) q0Var.getValue();
                            bVar = (m0.b) obj2;
                            n0.b bVar3 = n0.b.f6497a;
                            l0.c cVar3 = bVar.f6294h;
                            if (!cVar3.containsKey(t0Var)) {
                                if (bVar.isEmpty()) {
                                    bVar = new m0.b(t0Var, t0Var, cVar3.a(t0Var, new m0.a(bVar3, bVar3)));
                                } else {
                                    Object obj5 = bVar.f6293g;
                                    Object obj6 = cVar3.get(obj5);
                                    r6.k.c(obj6);
                                    bVar = new m0.b(bVar.f6292f, t0Var, cVar3.a(obj5, new m0.a(((m0.a) obj6).f6289a, t0Var)).a(t0Var, new m0.a(obj5, bVar3)));
                                }
                            }
                            if (obj2 != bVar) {
                                Object obj7 = g7.c.f4481b;
                                if (obj2 == null) {
                                    obj2 = obj7;
                                }
                            }
                            t1Var = (t1) this.f1078k;
                            synchronized (t1Var.f3908b) {
                                w4 = t1Var.w();
                            }
                            int size = w4.size();
                            for (int i15 = 0; i15 < size; i15++) {
                                ((g0.u) w4.get(i15)).q();
                            }
                            a0.a0 a0Var = new a0.a0((s1) this.f1079l, (u0) this.f1080m, dVar3, i7);
                            this.f1076i = j8;
                            this.f1077j = aVar6;
                            this.f1075h = 1;
                            if (c7.a0.d(a0Var, this) == aVar4) {
                                return aVar4;
                            }
                            aVar = aVar6;
                        } while (!q0Var.l(obj2, bVar));
                        t1Var = (t1) this.f1078k;
                        synchronized (t1Var.f3908b) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = aVar6;
                        aVar.c();
                        t1Var2 = (t1) this.f1078k;
                        synchronized (t1Var2.f3908b) {
                            try {
                                if (t1Var2.f3909c == j8) {
                                    t1Var2.f3909c = null;
                                }
                                t1Var2.t();
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        f7.q0 q0Var3 = t1.f3905v;
                        t0.b(((t1) this.f1078k).f3927u);
                        throw th;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (e5.a) this.f1077j;
                    j8 = (c7.x0) this.f1076i;
                    try {
                        d6.a.e(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        aVar.c();
                        t1Var2 = (t1) this.f1078k;
                        synchronized (t1Var2.f3908b) {
                        }
                    }
                }
                aVar.c();
                t1 t1Var4 = (t1) this.f1078k;
                synchronized (t1Var4.f3908b) {
                    try {
                        if (t1Var4.f3909c == j8) {
                            t1Var4.f3909c = null;
                        }
                        t1Var4.t();
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                f7.q0 q0Var4 = t1.f3905v;
                t0.b(((t1) this.f1078k).f3927u);
                return d6.z.f2639a;
            case 2:
                int i16 = this.f1075h;
                if (i16 == 0) {
                    d6.a.e(obj);
                    obj3 = this.f1078k;
                    List list2 = (List) this.f1079l;
                    list = (ArrayList) this.f1080m;
                    it = list2.iterator();
                } else if (i16 == 1) {
                    obj3 = this.f1076i;
                    it = (Iterator) this.f1077j;
                    list = (List) this.f1078k;
                    d6.a.e(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list.add(new g3.e(1, null));
                        this.f1078k = list;
                        this.f1077j = it;
                        this.f1076i = null;
                        this.f1075h = 2;
                        throw null;
                    }
                } else {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Iterator it2 = (Iterator) this.f1077j;
                    List list3 = (List) this.f1078k;
                    d6.a.e(obj);
                    list = list3;
                    it = it2;
                    obj3 = obj;
                }
                if (!it.hasNext()) {
                    return obj3;
                }
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                this.f1078k = list;
                this.f1077j = it;
                this.f1076i = obj3;
                this.f1075h = 1;
                throw null;
            case 3:
                i6.a aVar7 = i6.a.f4956f;
                int i17 = this.f1075h;
                if (i17 == 0) {
                    d6.a.e(obj);
                    MealRepository mealRepository = ((q0) this.f1076i).f4364b;
                    String str = (String) this.f1077j;
                    String str2 = (String) this.f1078k;
                    String str3 = (String) this.f1079l;
                    String str4 = (String) this.f1080m;
                    this.f1075h = 1;
                    if (mealRepository.addMeal(str, str2, str3, str4, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            case 4:
                l.m mVar3 = x0.f5705s;
                d6.z zVar2 = d6.z.f2639a;
                p1 p1Var = (p1) this.f1080m;
                l.m mVar4 = x0.f5704r;
                Object obj8 = this.f1076i;
                x0 x0Var3 = (x0) this.f1079l;
                i6.a aVar8 = i6.a.f4956f;
                int i18 = this.f1075h;
                try {
                    if (i18 == 0) {
                        dVar = this;
                        d6.a.e(obj);
                        Object value = x0Var3.f5706b.getValue();
                        if (!obj8.equals(value)) {
                            x0.f(x0Var3);
                            x0Var3.o(0.0f);
                            p1Var.q(obj8);
                            p1Var.o(0L);
                            x0Var3.c(value);
                            x0Var3.f5706b.setValue(obj8);
                        }
                        k7.c cVar4 = x0Var3.f5714j;
                        dVar.f1077j = cVar4;
                        dVar.f1078k = x0Var3;
                        dVar.f1075h = 1;
                        if (cVar4.c(dVar) != aVar8) {
                            cVar = cVar4;
                            x0Var = x0Var3;
                        }
                        aVar2 = aVar8;
                        return aVar2;
                    }
                    if (i18 == 1) {
                        dVar = this;
                        x0Var = (x0) dVar.f1078k;
                        cVar = (k7.c) dVar.f1077j;
                        d6.a.e(obj);
                    } else if (i18 == 2) {
                        d6.a.e(obj);
                        dVar = this;
                        dVar.f1075h = 3;
                        break;
                    } else if (i18 == 3) {
                        d6.a.e(obj);
                        dVar = this;
                        g1Var = x0Var3.f5707c;
                        c1 c1Var = x0Var3.f5712h;
                        if (!r6.k.a(g1Var.getValue(), obj8)) {
                            return zVar2;
                        }
                        if (c1Var.e() >= 1.0f || ((p0Var = x0Var3.f5718n) != null && r6.k.a(null, p0Var.f5603b))) {
                            obj4 = obj8;
                            x0Var2 = x0Var3;
                            aVar2 = aVar8;
                        } else {
                            a2 a2Var = p0Var != null ? p0Var.f5603b : null;
                            if (a2Var != null) {
                                obj4 = obj8;
                                long j10 = p0Var.f5602a;
                                x0Var2 = x0Var3;
                                l.m mVar5 = p0Var.f5606e;
                                j9 = 0;
                                l.m mVar6 = p0Var.f5607f;
                                if (mVar6 == null) {
                                    aVar2 = aVar8;
                                    mVar2 = mVar4;
                                } else {
                                    mVar2 = mVar6;
                                    aVar2 = aVar8;
                                }
                                mVar = (l.m) a2Var.f(j10, mVar5, mVar3, mVar2);
                            } else {
                                j9 = 0;
                                obj4 = obj8;
                                x0Var2 = x0Var3;
                                aVar2 = aVar8;
                                if (p0Var != null && p0Var.f5602a != 0) {
                                    long j11 = p0Var.f5608g;
                                    if (j11 == Long.MIN_VALUE) {
                                        j11 = x0Var2.f5710f;
                                    }
                                    float f9 = j11 / 1.0E9f;
                                    if (f9 > 0.0f) {
                                        mVar = new l.m(1.0f / f9);
                                    }
                                }
                                mVar = mVar4;
                            }
                            if (p0Var == null) {
                                p0Var = new l.p0();
                            }
                            l.m mVar7 = p0Var.f5606e;
                            p0Var.f5603b = null;
                            p0Var.f5604c = false;
                            p0Var.f5605d = c1Var.e();
                            mVar7.e(c1Var.e(), 0);
                            long j12 = x0Var2.f5710f;
                            p0Var.f5608g = j12;
                            p0Var.f5602a = j9;
                            p0Var.f5607f = mVar;
                            p0Var.f5609h = t6.a.P((1.0d - c1Var.e()) * j12);
                            x0Var2.f5718n = p0Var;
                        }
                        dVar.f1077j = null;
                        dVar.f1078k = null;
                        dVar.f1075h = 4;
                        break;
                    } else {
                        if (i18 != 4) {
                            if (i18 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            d6.a.e(obj);
                            x0Var2 = x0Var3;
                            x0Var2.o(0.0f);
                            return zVar2;
                        }
                        d6.a.e(obj);
                        dVar = this;
                        obj4 = obj8;
                        x0Var2 = x0Var3;
                        aVar2 = aVar8;
                        x0Var2.c(obj4);
                        dVar.f1075h = 5;
                        break;
                    }
                    Object obj9 = x0Var.f5708d;
                    cVar.e(null);
                    if (!obj8.equals(obj9)) {
                        dVar.f1077j = null;
                        dVar.f1078k = null;
                        dVar.f1075h = 2;
                        if (x0Var3.f5716l == Long.MIN_VALUE) {
                            k8 = g0.d.E(dVar.getContext()).t(x0Var3.f5719o, dVar);
                            break;
                        } else {
                            k8 = x0Var3.k(dVar);
                            break;
                        }
                        x0Var2.o(0.0f);
                        return zVar2;
                    }
                    g1Var = x0Var3.f5707c;
                    c1 c1Var2 = x0Var3.f5712h;
                    if (!r6.k.a(g1Var.getValue(), obj8)) {
                    }
                } catch (Throwable th6) {
                    cVar.e(null);
                    throw th6;
                }
                break;
            case 5:
                o.d dVar4 = (o.d) this.f1079l;
                o.i iVar = (o.i) this.f1078k;
                o.t1 t1Var5 = (o.t1) this.f1077j;
                i6.a aVar9 = i6.a.f4956f;
                int i19 = this.f1075h;
                if (i19 == 0) {
                    d6.a.e(obj);
                    d1 d1Var = (d1) this.f1076i;
                    t1Var5.f6752e = o.i.A0(iVar, dVar4);
                    c.h hVar2 = new c.h(iVar, (c7.x0) this.f1080m, d1Var, i8);
                    m.h hVar3 = new m.h(iVar, t1Var5, dVar4, i11);
                    this.f1075h = 1;
                    if (t1Var5.a(hVar2, hVar3, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            case 6:
                i6.a aVar10 = i6.a.f4956f;
                int i20 = this.f1075h;
                if (i20 == 0) {
                    d6.a.e(obj);
                    c7.x xVar2 = (c7.x) this.f1076i;
                    d0 d0Var = (d0) this.f1077j;
                    k1 k1Var = new k1(xVar2, (q6.f) this.f1078k, (q6.c) this.f1079l, (m0) this.f1080m, (h6.d) null);
                    this.f1075h = 1;
                    if (t6.a.r(d0Var, k1Var, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                d6.z zVar3 = d6.z.f2639a;
                i6.a aVar11 = i6.a.f4956f;
                int i21 = this.f1075h;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar3;
                }
                d6.a.e(obj);
                l1 l1Var = (l1) this.f1076i;
                androidx.lifecycle.x xVar3 = (androidx.lifecycle.x) this.f1077j;
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.f1078k;
                a0.a0 a0Var2 = new a0.a0((h6.i) this.f1079l, (f7.f) this.f1080m, l1Var, null, 19);
                this.f1075h = 1;
                if (oVar == androidx.lifecycle.o.f1008g) {
                    throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
                }
                if (xVar3.f1046d == androidx.lifecycle.o.f1007f || (d8 = c7.a0.d(new g0(xVar3, oVar, a0Var2, (h6.d) null), this)) != aVar11) {
                    d8 = zVar3;
                }
                return d8 == aVar11 ? aVar11 : zVar3;
            case 8:
                c1 c1Var3 = (c1) this.f1078k;
                z0 z0Var = (z0) this.f1080m;
                u3.i iVar2 = (u3.i) this.f1077j;
                z0 z0Var2 = (z0) this.f1079l;
                i6.a aVar12 = i6.a.f4956f;
                int i22 = this.f1075h;
                try {
                    if (i22 == 0) {
                        d6.a.e(obj);
                        f7.f fVar = (f7.f) this.f1076i;
                        c1Var3.f(0.0f);
                        t3.h hVar4 = (t3.h) e6.l.o0((List) z0Var2.getValue());
                        r6.k.c(hVar4);
                        iVar2.g(hVar4);
                        iVar2.g((t3.h) ((List) z0Var2.getValue()).get(((List) z0Var2.getValue()).size() - 2));
                        l0 l0Var = new l0(z0Var, 8, c1Var3);
                        this.f1076i = hVar4;
                        this.f1075h = 1;
                        if (fVar.b(l0Var, this) == aVar12) {
                            return aVar12;
                        }
                        hVar = hVar4;
                    } else {
                        if (i22 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        hVar = (t3.h) this.f1076i;
                        d6.a.e(obj);
                    }
                    z0Var.setValue(Boolean.FALSE);
                    iVar2.e(hVar, false);
                } catch (CancellationException unused) {
                    z0Var.setValue(Boolean.FALSE);
                }
                return d6.z.f2639a;
            case q.c.f7259c /* 9 */:
                j0 j0Var = (j0) this.f1076i;
                i6.a aVar13 = i6.a.f4956f;
                int i23 = this.f1075h;
                try {
                    if (i23 == 0) {
                        d6.a.e(obj);
                        f7.a0 a0Var3 = new f7.a0(new k2(new c0.o((z0) this.f1077j, 3), null));
                        g7.j jVar = new g7.j(j0Var, (g2.x) this.f1078k, (a0.x0) this.f1079l, (g2.m) this.f1080m, 2);
                        this.f1075h = 1;
                        if (a0Var3.b(jVar, this) == aVar13) {
                            return aVar13;
                        }
                    } else {
                        if (i23 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                    }
                    w.g0.g(j0Var);
                    return d6.z.f2639a;
                } catch (Throwable th7) {
                    w.g0.g(j0Var);
                    throw th7;
                }
            case q.c.f7261e /* 10 */:
                d6.z zVar4 = d6.z.f2639a;
                i6.a aVar14 = i6.a.f4956f;
                int i24 = this.f1075h;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar4;
                }
                d6.a.e(obj);
                t.c cVar5 = (t.c) this.f1076i;
                g2.w wVar = (g2.w) this.f1077j;
                w.m0 m0Var = ((j0) this.f1078k).f9255a;
                h0 h0Var = ((w.z0) this.f1079l).f9471a;
                g2.q qVar = (g2.q) this.f1080m;
                this.f1075h = 1;
                int b9 = qVar.b(a2.j0.d(wVar.f4066b));
                if (b9 < h0Var.f388a.f377a.f373f.length()) {
                    dVar2 = h0Var.b(b9);
                } else if (b9 != 0) {
                    dVar2 = h0Var.b(b9 - 1);
                } else {
                    a3 = w.p0.a(m0Var.f9330b, m0Var.f9335g, m0Var.f9336h, w.p0.f9378a, 1);
                    dVar2 = new y0.d(0.0f, 0.0f, 1.0f, (int) (a3 & 4294967295L));
                }
                Object a9 = cVar5.a(dVar2, this);
                if (a9 != aVar14) {
                    a9 = zVar4;
                }
                return a9 == aVar14 ? aVar14 : zVar4;
            case 11:
                d6.z zVar5 = d6.z.f2639a;
                i6.a aVar15 = i6.a.f4956f;
                int i25 = this.f1075h;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar5;
                }
                d6.a.e(obj);
                d0 d0Var2 = (d0) this.f1076i;
                w.t0 t0Var2 = new w.t0((h7.c) this.f1077j, (z0) this.f1078k, (p.j) this.f1079l, null);
                o.z0 z0Var3 = new o.z0((z0) this.f1080m, 2);
                this.f1075h = 1;
                o.f0 f0Var = o.p1.f6716a;
                Object d9 = c7.a0.d(new d(d0Var2, t0Var2, z0Var3, new m0(d0Var2), null), this);
                if (d9 != aVar15) {
                    d9 = zVar5;
                }
                return d9 == aVar15 ? aVar15 : zVar5;
            default:
                y.d dVar5 = (y.d) this.f1079l;
                p0 p0Var2 = (p0) this.f1077j;
                i6.a aVar16 = i6.a.f4956f;
                int i26 = this.f1075h;
                try {
                    if (i26 != 0) {
                        if (i26 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                        throw new b4.c();
                    }
                    d6.a.e(obj);
                    c7.x xVar4 = (c7.x) this.f1076i;
                    y.s sVar = y.t.f9746a;
                    View view = p0Var2.f8340f;
                    sVar.getClass();
                    y.p pVar = new y.p(view);
                    y.u uVar2 = new y.u(p0Var2.f8340f, new y.c((y.q) this.f1080m), pVar);
                    if (x.b.f9592a) {
                        c7.a0.p(xVar4, null, null, new y.b(dVar5, pVar, dVar3, i9), 3);
                    }
                    q6.c cVar6 = (q6.c) this.f1078k;
                    if (cVar6 != null) {
                        cVar6.f(uVar2);
                    }
                    dVar5.f9711c = uVar2;
                    this.f1075h = 1;
                    p0Var2.a(uVar2, this);
                    return aVar16;
                } catch (Throwable th8) {
                    dVar5.f9711c = null;
                    throw th8;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, h6.d dVar, int i7) {
        super(2, dVar);
        this.f1074g = i7;
        this.f1077j = obj;
        this.f1078k = obj2;
        this.f1079l = obj3;
        this.f1080m = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, h6.d dVar, int i7) {
        super(2, dVar);
        this.f1074g = i7;
        this.f1076i = obj;
        this.f1077j = obj2;
        this.f1078k = obj3;
        this.f1079l = obj4;
        this.f1080m = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list, ArrayList arrayList, h6.d dVar) {
        super(2, dVar);
        this.f1074g = 2;
        this.f1079l = list;
        this.f1080m = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(x0 x0Var, Object obj, p1 p1Var, h6.d dVar) {
        super(2, dVar);
        this.f1074g = 4;
        this.f1079l = x0Var;
        this.f1076i = obj;
        this.f1080m = p1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(d0 d0Var, q6.f fVar, q6.c cVar, m0 m0Var, h6.d dVar) {
        super(2, dVar);
        this.f1074g = 6;
        this.f1077j = d0Var;
        this.f1078k = (j6.i) fVar;
        this.f1079l = (r6.l) cVar;
        this.f1080m = m0Var;
    }
}
