package androidx.lifecycle;

import android.app.Application;
import android.view.View;
import android.webkit.WebSettings;
import c7.m1;
import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.plate.PlateVault;
import com.chicken.road.whale.store.PlanDatabase_Impl;
import g0.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import s1.s1;
import s1.x2;
import s1.z2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f988g;

    /* renamed from: h, reason: collision with root package name */
    public int f989h;

    /* renamed from: i, reason: collision with root package name */
    public Object f990i;

    /* renamed from: j, reason: collision with root package name */
    public Object f991j;

    /* renamed from: k, reason: collision with root package name */
    public Object f992k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f993l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f994m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f995n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, Object obj4, h6.d dVar, int i7) {
        super(2, dVar);
        this.f988g = i7;
        this.f992k = obj;
        this.f993l = obj2;
        this.f994m = obj3;
        this.f995n = obj4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j6.i, q6.c] */
    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f988g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new i0((x) this.f992k, (o) this.f993l, (c7.x) this.f994m, (a0.a0) this.f995n, dVar, 0);
            case 1:
                return new i0((androidx.room.u) this.f991j, (androidx.room.c) this.f992k, (e7.e) this.f993l, (Callable) this.f994m, (e7.e) this.f995n, dVar, 1);
            case 2:
                i0 i0Var = new i0((String) this.f991j, (String) this.f992k, (String) this.f993l, (String) this.f994m, (b1.b) this.f995n, dVar, 2);
                i0Var.f990i = obj;
                return i0Var;
            case 3:
                i0 i0Var2 = new i0((e7.i) this.f992k, (l.d) this.f993l, (g0.z0) this.f994m, (g0.z0) this.f995n, dVar, 3);
                i0Var2.f991j = obj;
                return i0Var2;
            case 4:
                i0 i0Var3 = new i0((l.o0) this.f994m, (j6.i) this.f995n, dVar);
                i0Var3.f993l = obj;
                return i0Var3;
            default:
                i0 i0Var4 = new i0((r6.v) this.f990i, (t1) this.f992k, (v) this.f993l, (x2) this.f994m, (View) this.f995n, dVar);
                i0Var4.f991j = obj;
                return i0Var4;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f988g) {
        }
        return ((i0) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0494 A[Catch: all -> 0x0341, TRY_LEAVE, TryCatch #2 {all -> 0x0341, blocks: (B:180:0x0339, B:182:0x0480, B:186:0x048c, B:188:0x0494, B:197:0x0350, B:248:0x0477), top: B:175:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0570  */
    /* JADX WARN: Type inference failed for: r3v34, types: [int] */
    /* JADX WARN: Type inference failed for: r8v29, types: [q6.c] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x01f2 -> B:103:0x01f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x04ac -> B:165:0x0480). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r6.v vVar;
        r6.v vVar2;
        n nVar;
        n nVar2;
        c7.x0 x0Var;
        t tVar;
        Object obj2;
        androidx.room.n nVar3;
        e7.b bVar;
        boolean z8;
        Object obj3;
        Object b9;
        Object b10;
        c7.x xVar;
        e7.b it;
        Object b11;
        l.n0 n0Var;
        k7.a aVar;
        ?? r8;
        l.o0 o0Var;
        l.o0 o0Var2;
        l.n0 n0Var2;
        Object f9;
        k7.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        c7.x0 x0Var2;
        m1 m1Var;
        switch (this.f988g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.z zVar = d6.z.f2639a;
                x xVar2 = (x) this.f992k;
                i6.a aVar3 = i6.a.f4956f;
                int i7 = this.f989h;
                if (i7 == 0) {
                    d6.a.e(obj);
                    if (xVar2.f1046d == o.f1007f) {
                        return zVar;
                    }
                    r6.v vVar3 = new r6.v();
                    r6.v vVar4 = new r6.v();
                    try {
                        o oVar = (o) this.f993l;
                        c7.x xVar3 = (c7.x) this.f994m;
                        a0.a0 a0Var = (a0.a0) this.f995n;
                        this.f990i = vVar3;
                        this.f991j = vVar4;
                        this.f989h = 1;
                        c7.h hVar = new c7.h(1, a8.m.A(this));
                        hVar.r();
                        n.Companion.getClass();
                        r6.k.f(oVar, "state");
                        int ordinal = oVar.ordinal();
                        n nVar4 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : n.ON_RESUME : n.ON_START : n.ON_CREATE;
                        int ordinal2 = oVar.ordinal();
                        if (ordinal2 == 2) {
                            nVar = n.ON_DESTROY;
                        } else if (ordinal2 == 3) {
                            nVar = n.ON_STOP;
                        } else if (ordinal2 != 4) {
                            nVar2 = null;
                            h0 h0Var = new h0(nVar4, vVar3, xVar3, nVar2, hVar, new k7.c(), a0Var);
                            vVar4.f7968f = h0Var;
                            xVar2.a(h0Var);
                            if (hVar.q() != aVar3) {
                                return aVar3;
                            }
                            vVar = vVar4;
                            vVar2 = vVar3;
                        } else {
                            nVar = n.ON_PAUSE;
                        }
                        nVar2 = nVar;
                        h0 h0Var2 = new h0(nVar4, vVar3, xVar3, nVar2, hVar, new k7.c(), a0Var);
                        vVar4.f7968f = h0Var2;
                        xVar2.a(h0Var2);
                        if (hVar.q() != aVar3) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        vVar = vVar4;
                        vVar2 = vVar3;
                        x0Var = (c7.x0) vVar2.f7968f;
                        if (x0Var != null) {
                        }
                        tVar = (t) vVar.f7968f;
                        if (tVar != null) {
                        }
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = (r6.v) this.f991j;
                    vVar2 = (r6.v) this.f990i;
                    try {
                        d6.a.e(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        x0Var = (c7.x0) vVar2.f7968f;
                        if (x0Var != null) {
                            x0Var.c(null);
                        }
                        tVar = (t) vVar.f7968f;
                        if (tVar != null) {
                            xVar2.f(tVar);
                        }
                        throw th;
                    }
                }
                c7.x0 x0Var3 = (c7.x0) vVar2.f7968f;
                if (x0Var3 != null) {
                    x0Var3.c(null);
                }
                t tVar2 = (t) vVar.f7968f;
                if (tVar2 == null) {
                    return zVar;
                }
                xVar2.f(tVar2);
                return zVar;
            case 1:
                androidx.room.c cVar = (androidx.room.c) this.f992k;
                androidx.room.u uVar = (androidx.room.u) this.f991j;
                i6.a aVar4 = i6.a.f4956f;
                int i8 = this.f989h;
                boolean z9 = true;
                try {
                    if (i8 == 0) {
                        d6.a.e(obj);
                        androidx.room.p invalidationTracker = uVar.getInvalidationTracker();
                        invalidationTracker.getClass();
                        String[] strArr = (String[]) cVar.f1069g;
                        HashMap hashMap = invalidationTracker.f1106c;
                        f6.j jVar = new f6.j();
                        int length = strArr.length;
                        int i9 = 0;
                        int i10 = 0;
                        while (i10 < length) {
                            String str = strArr[i10];
                            Locale locale = Locale.US;
                            r6.k.e(locale, "US");
                            boolean z10 = z9;
                            String lowerCase = str.toLowerCase(locale);
                            r6.k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                            if (hashMap.containsKey(lowerCase)) {
                                String lowerCase2 = str.toLowerCase(locale);
                                r6.k.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                                Object obj4 = hashMap.get(lowerCase2);
                                r6.k.c(obj4);
                                jVar.addAll((Collection) obj4);
                            } else {
                                jVar.add(str);
                            }
                            i10++;
                            z9 = z10;
                        }
                        boolean z11 = z9;
                        String[] strArr2 = (String[]) a8.m.k(jVar).toArray(new String[0]);
                        ArrayList arrayList = new ArrayList(strArr2.length);
                        for (String str2 : strArr2) {
                            LinkedHashMap linkedHashMap = invalidationTracker.f1107d;
                            Locale locale2 = Locale.US;
                            r6.k.e(locale2, "US");
                            String lowerCase3 = str2.toLowerCase(locale2);
                            r6.k.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                            Integer num = (Integer) linkedHashMap.get(lowerCase3);
                            if (num == null) {
                                throw new IllegalArgumentException("There is no table with name ".concat(str2));
                            }
                            arrayList.add(num);
                        }
                        int[] v02 = e6.l.v0(arrayList);
                        androidx.room.n nVar5 = new androidx.room.n(cVar, v02, strArr2);
                        synchronized (invalidationTracker.f1113j) {
                            h.f fVar = invalidationTracker.f1113j;
                            h.c a3 = fVar.a(cVar);
                            if (a3 != null) {
                                obj2 = a3.f4577g;
                            } else {
                                h.c cVar2 = new h.c(cVar, nVar5);
                                fVar.f4586i++;
                                h.c cVar3 = fVar.f4584g;
                                if (cVar3 == null) {
                                    fVar.f4583f = cVar2;
                                    fVar.f4584g = cVar2;
                                } else {
                                    cVar3.f4578h = cVar2;
                                    cVar2.f4579i = cVar3;
                                    fVar.f4584g = cVar2;
                                }
                                obj2 = null;
                            }
                            nVar3 = (androidx.room.n) obj2;
                        }
                        if (nVar3 == null) {
                            androidx.room.m mVar = invalidationTracker.f1112i;
                            int[] copyOf = Arrays.copyOf(v02, v02.length);
                            mVar.getClass();
                            r6.k.f(copyOf, "tableIds");
                            synchronized (mVar) {
                                int length2 = copyOf.length;
                                z8 = false;
                                while (i9 < length2) {
                                    int i11 = copyOf[i9];
                                    long[] jArr = (long[]) mVar.f1094b;
                                    long j8 = jArr[i11];
                                    jArr[i11] = 1 + j8;
                                    if (j8 == 0) {
                                        mVar.f1093a = z11;
                                        z8 = true;
                                    }
                                    i9++;
                                    z11 = true;
                                }
                            }
                            if (z8) {
                                PlanDatabase_Impl planDatabase_Impl = invalidationTracker.f1104a;
                                if (planDatabase_Impl.isOpenInternal()) {
                                    invalidationTracker.d(((z3.g) planDatabase_Impl.getOpenHelper()).b());
                                }
                            }
                        }
                        bVar = new e7.b((e7.e) this.f993l);
                    } else if (i8 == 1) {
                        e7.b bVar2 = (e7.b) this.f990i;
                        d6.a.e(obj);
                        bVar = bVar2;
                        obj3 = obj;
                        if (((Boolean) obj3).booleanValue()) {
                            uVar.getInvalidationTracker().b(cVar);
                            return d6.z.f2639a;
                        }
                        bVar.c();
                        Object call = ((Callable) this.f994m).call();
                        e7.e eVar = (e7.e) this.f995n;
                        this.f990i = bVar;
                        this.f989h = 2;
                        if (eVar.h(this, call) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e7.b bVar3 = (e7.b) this.f990i;
                        d6.a.e(obj);
                        bVar = bVar3;
                    }
                    this.f990i = bVar;
                    this.f989h = 1;
                    obj3 = bVar.b(this);
                    if (obj3 == aVar4) {
                        return aVar4;
                    }
                    if (((Boolean) obj3).booleanValue()) {
                    }
                } catch (Throwable th3) {
                    uVar.getInvalidationTracker().b(cVar);
                    throw th3;
                }
            case 2:
                b1.b bVar4 = (b1.b) this.f995n;
                String str3 = (String) this.f991j;
                i6.a aVar5 = i6.a.f4956f;
                int i12 = this.f989h;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return obj;
                }
                d6.a.e(obj);
                if (!z6.h.G(str3)) {
                    if (!z6.o.o(false, str3, "/")) {
                        str3 = str3.concat("/");
                    }
                    try {
                        r6.k.f(str3, "<this>");
                        n3.k kVar = new n3.k(1);
                        kVar.o(null, str3);
                        b9 = kVar.b();
                    } catch (Throwable th4) {
                        b9 = d6.a.b(th4);
                    }
                    if (b9 instanceof d6.l) {
                        b9 = null;
                    }
                    s7.l lVar = (s7.l) b9;
                    if (lVar != null) {
                        n3.k f10 = lVar.f();
                        PlateVault plateVault = PlateVault.INSTANCE;
                        f10.a(plateVault.at(5), (String) this.f992k);
                        f10.a(plateVault.at(6), (String) this.f993l);
                        f10.a(plateVault.at(7), (String) this.f994m);
                        s7.l b12 = f10.b();
                        try {
                            String defaultUserAgent = WebSettings.getDefaultUserAgent((Application) bVar4.f1230g);
                            r6.k.e(defaultUserAgent, "getDefaultUserAgent(...)");
                            b10 = z6.o.t(z6.o.t(defaultUserAgent, "; wv)", ")"), "Version/4.0 ", "");
                        } catch (Throwable th5) {
                            b10 = d6.a.b(th5);
                        }
                        if (b10 instanceof d6.l) {
                            b10 = null;
                        }
                        String str4 = (String) b10;
                        g3.k kVar2 = new g3.k(8);
                        kVar2.f4160g = b12;
                        kVar2.t("Accept", "application/json");
                        if (str4 != null && str4.length() != 0) {
                            kVar2.t("User-Agent", str4);
                        }
                        kVar2.v("GET", null);
                        com.chicken.road.whale.plate.a aVar6 = new com.chicken.road.whale.plate.a(bVar4, kVar2.m(), null);
                        this.f989h = 1;
                        Object y4 = c7.a0.y(15000L, aVar6, this);
                        return y4 == aVar5 ? aVar5 : y4;
                    }
                }
                return null;
            case 3:
                e7.i iVar = (e7.i) this.f992k;
                i6.a aVar7 = i6.a.f4956f;
                int i13 = this.f989h;
                if (i13 == 0) {
                    d6.a.e(obj);
                    xVar = (c7.x) this.f991j;
                    it = iVar.iterator();
                    this.f991j = xVar;
                    this.f990i = it;
                    this.f989h = 1;
                    b11 = it.b(this);
                    if (b11 == aVar7) {
                    }
                    if (((Boolean) b11).booleanValue()) {
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (e7.b) this.f990i;
                    xVar = (c7.x) this.f991j;
                    d6.a.e(obj);
                    b11 = obj;
                    if (((Boolean) b11).booleanValue()) {
                        Object c4 = it.c();
                        Object a9 = e7.l.a(iVar.d());
                        c7.a0.p(xVar, null, null, new g0(a9 == null ? c4 : a9, (l.d) this.f993l, (g0.z0) this.f994m, (g0.z0) this.f995n, null, 6), 3);
                        this.f991j = xVar;
                        this.f990i = it;
                        this.f989h = 1;
                        b11 = it.b(this);
                        if (b11 == aVar7) {
                            return aVar7;
                        }
                        if (((Boolean) b11).booleanValue()) {
                            return d6.z.f2639a;
                        }
                    }
                }
            case 4:
                l.o0 o0Var3 = (l.o0) this.f994m;
                i6.a aVar8 = i6.a.f4956f;
                ?? r32 = this.f989h;
                try {
                    try {
                        if (r32 == 0) {
                            d6.a.e(obj);
                            h6.g u8 = ((c7.x) this.f993l).k().u(c7.u.f1748g);
                            r6.k.c(u8);
                            n0Var = new l.n0((c7.x0) u8);
                            AtomicReference atomicReference3 = o0Var3.f5595a;
                            while (true) {
                                l.n0 n0Var3 = (l.n0) atomicReference3.get();
                                if (n0Var3 != null && l.h.a(1, 1) < 0) {
                                    throw new CancellationException("Current mutation had a higher priority");
                                }
                                while (!atomicReference3.compareAndSet(n0Var3, n0Var)) {
                                    if (atomicReference3.get() != n0Var3) {
                                        break;
                                    }
                                }
                                if (n0Var3 != null) {
                                    n0Var3.f5576a.c(new g0.s0("Mutation interrupted", 1));
                                }
                                k7.c cVar4 = o0Var3.f5596b;
                                j6.i iVar2 = (j6.i) this.f995n;
                                this.f993l = n0Var;
                                this.f990i = cVar4;
                                this.f991j = iVar2;
                                this.f992k = o0Var3;
                                this.f989h = 1;
                                if (cVar4.c(this) == aVar8) {
                                    return aVar8;
                                }
                                aVar = cVar4;
                                r8 = iVar2;
                            }
                        } else {
                            if (r32 != 1) {
                                if (r32 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                o0Var2 = (l.o0) this.f991j;
                                aVar2 = (k7.a) this.f990i;
                                n0Var2 = (l.n0) this.f993l;
                                try {
                                    d6.a.e(obj);
                                    f9 = obj;
                                    atomicReference2 = o0Var2.f5595a;
                                    while (!atomicReference2.compareAndSet(n0Var2, null) && atomicReference2.get() == n0Var2) {
                                    }
                                    ((k7.c) aVar2).e(null);
                                    return f9;
                                } catch (Throwable th6) {
                                    th = th6;
                                    atomicReference = o0Var2.f5595a;
                                    while (!atomicReference.compareAndSet(n0Var2, null) && atomicReference.get() == n0Var2) {
                                    }
                                    throw th;
                                }
                            }
                            o0Var3 = (l.o0) this.f992k;
                            q6.c cVar5 = (q6.c) this.f991j;
                            aVar = (k7.a) this.f990i;
                            n0Var = (l.n0) this.f993l;
                            d6.a.e(obj);
                            r8 = cVar5;
                        }
                        this.f993l = n0Var;
                        this.f990i = aVar;
                        this.f991j = o0Var;
                        this.f992k = null;
                        this.f989h = 2;
                        f9 = r8.f(this);
                        if (f9 == aVar8) {
                            return aVar8;
                        }
                        o0Var2 = o0Var;
                        aVar2 = aVar;
                        n0Var2 = n0Var;
                        atomicReference2 = o0Var2.f5595a;
                        while (!atomicReference2.compareAndSet(n0Var2, null)) {
                        }
                        ((k7.c) aVar2).e(null);
                        return f9;
                    } catch (Throwable th7) {
                        th = th7;
                        o0Var2 = o0Var;
                        n0Var2 = n0Var;
                        atomicReference = o0Var2.f5595a;
                        while (!atomicReference.compareAndSet(n0Var2, null)) {
                        }
                        throw th;
                    }
                    o0Var = o0Var3;
                } catch (Throwable th8) {
                    ((k7.c) r32).e(null);
                    throw th8;
                }
                break;
            default:
                x2 x2Var = (x2) this.f994m;
                v vVar5 = (v) this.f993l;
                d6.z zVar2 = d6.z.f2639a;
                i6.a aVar9 = i6.a.f4956f;
                int i14 = this.f989h;
                h6.d dVar = null;
                if (i14 == 0) {
                    d6.a.e(obj);
                    c7.x xVar4 = (c7.x) this.f991j;
                    try {
                        s1 s1Var = (s1) ((r6.v) this.f990i).f7968f;
                        if (s1Var != null) {
                            f7.o0 a10 = z2.a(((View) this.f995n).getContext().getApplicationContext());
                            s1Var.f8416f.f(((Number) a10.getValue()).floatValue());
                            m1Var = c7.a0.p(xVar4, null, null, new a0.e0(a10, s1Var, dVar, 25), 3);
                        } else {
                            m1Var = null;
                        }
                        try {
                            t1 t1Var = (t1) this.f992k;
                            this.f991j = m1Var;
                            this.f989h = 1;
                            Object x8 = c7.a0.x(t1Var.f3907a, new androidx.room.d(t1Var, new g0.s1(t1Var, null), g0.d.E(getContext()), (h6.d) null), this);
                            if (x8 != aVar9) {
                                x8 = zVar2;
                            }
                            if (x8 != aVar9) {
                                x8 = zVar2;
                            }
                            if (x8 == aVar9) {
                                return aVar9;
                            }
                            x0Var2 = m1Var;
                        } catch (Throwable th9) {
                            th = th9;
                            x0Var2 = m1Var;
                            if (x0Var2 != null) {
                            }
                            vVar5.f().f(x2Var);
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        x0Var2 = null;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x0Var2 = (c7.x0) this.f991j;
                    try {
                        d6.a.e(obj);
                    } catch (Throwable th11) {
                        th = th11;
                        if (x0Var2 != null) {
                            x0Var2.c(null);
                        }
                        vVar5.f().f(x2Var);
                        throw th;
                    }
                }
                if (x0Var2 != null) {
                    x0Var2.c(null);
                }
                vVar5.f().f(x2Var);
                return zVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, h6.d dVar, int i7) {
        super(2, dVar);
        this.f988g = i7;
        this.f991j = obj;
        this.f992k = obj2;
        this.f993l = obj3;
        this.f994m = obj4;
        this.f995n = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i0(l.o0 o0Var, q6.c cVar, h6.d dVar) {
        super(2, dVar);
        this.f988g = 4;
        this.f994m = o0Var;
        this.f995n = (j6.i) cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r6.v vVar, t1 t1Var, v vVar2, x2 x2Var, View view, h6.d dVar) {
        super(2, dVar);
        this.f988g = 5;
        this.f990i = vVar;
        this.f992k = t1Var;
        this.f993l = vVar2;
        this.f994m = x2Var;
        this.f995n = view;
    }
}
