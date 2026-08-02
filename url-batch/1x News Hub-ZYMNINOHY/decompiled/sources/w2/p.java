package w2;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C1148j;
import t2.C1196f;
import t2.C1209t;
import t2.U;
import t2.e0;

/* loaded from: classes.dex */
public final class p extends x2.b implements d, e, x2.i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10686e = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public int f10687d;

    public p(Object obj) {
        this._state$volatile = obj;
    }

    @Override // w2.e
    public final Object a(Object obj, InterfaceC0300c interfaceC0300c) {
        if (obj == null) {
            obj = x2.k.f10788a;
        }
        b(null, obj);
        return C0195i.f2555a;
    }

    public final boolean b(Object obj, Object obj2) {
        int i3;
        r[] rVarArr;
        C1148j c1148j;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10686e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.j.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.j.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i4 = this.f10687d;
            if ((i4 & 1) != 0) {
                this.f10687d = i4 + 2;
                return true;
            }
            int i5 = i4 + 1;
            this.f10687d = i5;
            r[] rVarArr2 = this.f10771a;
            while (true) {
                if (rVarArr2 != null) {
                    for (r rVar : rVarArr2) {
                        if (rVar != null) {
                            AtomicReference atomicReference = rVar.f10690a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (c1148j = q.f10689b)) {
                                    C1148j c1148j2 = q.f10688a;
                                    if (obj4 != c1148j2) {
                                        while (!atomicReference.compareAndSet(obj4, c1148j2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C1196f) obj4).f(C0195i.f2555a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, c1148j)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i3 = this.f10687d;
                    if (i3 == i5) {
                        this.f10687d = i5 + 1;
                        return true;
                    }
                    rVarArr = this.f10771a;
                }
                rVarArr2 = rVarArr;
                i5 = i3;
            }
        }
    }

    @Override // x2.i
    public final d i(d2.h hVar, int i3, v2.a aVar) {
        return ((((i3 < 0 || i3 >= 2) && i3 != -2) || aVar != v2.a.f10572b) && !((i3 == 0 || i3 == -3) && aVar == v2.a.f10571a)) ? new x2.g(this, hVar, i3, aVar) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e3, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0145, code lost:
    
        if (r4 == r3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0148, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cf A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00c7, B:18:0x00cf, B:21:0x00d6, B:22:0x00dc, B:26:0x00df, B:28:0x0100, B:31:0x0110, B:32:0x012a, B:39:0x013c, B:34:0x0133, B:38:0x0139, B:47:0x00e5, B:50:0x00ec, B:58:0x0054, B:60:0x005f, B:61:0x00b7), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0110 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00c7, B:18:0x00cf, B:21:0x00d6, B:22:0x00dc, B:26:0x00df, B:28:0x0100, B:31:0x0110, B:32:0x012a, B:39:0x013c, B:34:0x0133, B:38:0x0139, B:47:0x00e5, B:50:0x00ec, B:58:0x0054, B:60:0x005f, B:61:0x00b7), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x010f -> B:16:0x00c7). Please report as a decompilation issue!!! */
    @Override // w2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(e eVar, InterfaceC0300c interfaceC0300c) {
        o oVar;
        EnumC0317a enumC0317a;
        int i3;
        r rVar;
        AtomicReference atomicReference;
        e eVar2;
        p pVar;
        r rVar2;
        U u3;
        e eVar3;
        Object obj;
        Object obj2;
        Object andSet;
        Object obj3;
        try {
            if (interfaceC0300c instanceof o) {
                oVar = (o) interfaceC0300c;
                int i4 = oVar.f10685k;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    oVar.f10685k = i4 - Integer.MIN_VALUE;
                    Object obj4 = oVar.f10683i;
                    enumC0317a = EnumC0317a.f4969a;
                    i3 = oVar.f10685k;
                    int i5 = 1;
                    int i6 = 3;
                    if (i3 != 0) {
                        android.support.v4.media.session.a.T(obj4);
                        synchronized (this) {
                            try {
                                r[] rVarArr = this.f10771a;
                                if (rVarArr == null) {
                                    rVarArr = new r[2];
                                    this.f10771a = rVarArr;
                                } else if (this.f10772b >= rVarArr.length) {
                                    Object[] copyOf = Arrays.copyOf(rVarArr, rVarArr.length * 2);
                                    kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
                                    this.f10771a = (r[]) copyOf;
                                    rVarArr = (r[]) copyOf;
                                }
                                int i7 = this.f10773c;
                                do {
                                    rVar = rVarArr[i7];
                                    if (rVar == null) {
                                        rVar = new r();
                                        rVarArr[i7] = rVar;
                                    }
                                    i7++;
                                    if (i7 >= rVarArr.length) {
                                        i7 = 0;
                                    }
                                    atomicReference = rVar.f10690a;
                                } while (atomicReference.get() != null);
                                atomicReference.set(q.f10688a);
                                this.f10773c = i7;
                                this.f10772b++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        eVar2 = eVar;
                        pVar = this;
                        rVar2 = rVar;
                    } else if (i3 == 1) {
                        rVar2 = oVar.f;
                        eVar2 = oVar.f10680e;
                        pVar = oVar.f10679d;
                        android.support.v4.media.session.a.T(obj4);
                    } else if (i3 == 2) {
                        obj2 = oVar.f10682h;
                        u3 = oVar.f10681g;
                        rVar2 = oVar.f;
                        eVar3 = oVar.f10680e;
                        pVar = oVar.f10679d;
                        android.support.v4.media.session.a.T(obj4);
                        obj = obj2;
                        AtomicReference atomicReference2 = rVar2.f10690a;
                        C1148j c1148j = q.f10688a;
                        andSet = atomicReference2.getAndSet(c1148j);
                        kotlin.jvm.internal.j.b(andSet);
                        if (andSet == q.f10689b) {
                        }
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj5 = oVar.f10682h;
                        u3 = oVar.f10681g;
                        rVar2 = oVar.f;
                        eVar3 = oVar.f10680e;
                        pVar = oVar.f10679d;
                        android.support.v4.media.session.a.T(obj4);
                        obj = obj5;
                        i5 = 1;
                        i6 = 3;
                        obj2 = f10686e.get(pVar);
                        if (u3 != null && !u3.a()) {
                            throw ((e0) u3).z();
                        }
                        obj3 = obj2 != x2.k.f10788a ? null : obj2;
                        oVar.f10679d = pVar;
                        oVar.f10680e = eVar3;
                        oVar.f = rVar2;
                        oVar.f10681g = u3;
                        oVar.f10682h = obj2;
                        oVar.f10685k = 2;
                        if (eVar3.a(obj3, oVar) == enumC0317a) {
                            return enumC0317a;
                        }
                        obj = obj2;
                        AtomicReference atomicReference22 = rVar2.f10690a;
                        C1148j c1148j2 = q.f10688a;
                        andSet = atomicReference22.getAndSet(c1148j2);
                        kotlin.jvm.internal.j.b(andSet);
                        if (andSet == q.f10689b) {
                            obj2 = f10686e.get(pVar);
                            if (u3 != null) {
                                throw ((e0) u3).z();
                            }
                            if (obj2 != x2.k.f10788a) {
                            }
                            oVar.f10679d = pVar;
                            oVar.f10680e = eVar3;
                            oVar.f = rVar2;
                            oVar.f10681g = u3;
                            oVar.f10682h = obj2;
                            oVar.f10685k = 2;
                            if (eVar3.a(obj3, oVar) == enumC0317a) {
                            }
                            obj = obj2;
                            AtomicReference atomicReference222 = rVar2.f10690a;
                            C1148j c1148j22 = q.f10688a;
                            andSet = atomicReference222.getAndSet(c1148j22);
                            kotlin.jvm.internal.j.b(andSet);
                            if (andSet == q.f10689b) {
                                oVar.f10679d = pVar;
                                oVar.f10680e = eVar3;
                                oVar.f = rVar2;
                                oVar.f10681g = u3;
                                oVar.f10682h = obj;
                                oVar.f10685k = i6;
                                C1196f c1196f = new C1196f(i5, C2.b.x(oVar));
                                c1196f.t();
                                AtomicReference atomicReference3 = rVar2.f10690a;
                                while (true) {
                                    boolean compareAndSet = atomicReference3.compareAndSet(c1148j22, c1196f);
                                    C0195i c0195i = C0195i.f2555a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReference3.get() != c1148j22) {
                                        c1196f.f(c0195i);
                                        break;
                                    }
                                }
                                Object s3 = c1196f.s();
                                if (s3 == EnumC0317a.f4969a) {
                                }
                            }
                        }
                    }
                    d2.h hVar = oVar.f4981b;
                    kotlin.jvm.internal.j.b(hVar);
                    u3 = (U) hVar.h(C1209t.f10441b);
                    eVar3 = eVar2;
                    obj = null;
                    obj2 = f10686e.get(pVar);
                    if (u3 != null) {
                    }
                    if (obj2 != x2.k.f10788a) {
                    }
                    oVar.f10679d = pVar;
                    oVar.f10680e = eVar3;
                    oVar.f = rVar2;
                    oVar.f10681g = u3;
                    oVar.f10682h = obj2;
                    oVar.f10685k = 2;
                    if (eVar3.a(obj3, oVar) == enumC0317a) {
                    }
                    obj = obj2;
                    AtomicReference atomicReference2222 = rVar2.f10690a;
                    C1148j c1148j222 = q.f10688a;
                    andSet = atomicReference2222.getAndSet(c1148j222);
                    kotlin.jvm.internal.j.b(andSet);
                    if (andSet == q.f10689b) {
                    }
                }
            }
            if (i3 != 0) {
            }
            d2.h hVar2 = oVar.f4981b;
            kotlin.jvm.internal.j.b(hVar2);
            u3 = (U) hVar2.h(C1209t.f10441b);
            eVar3 = eVar2;
            obj = null;
            obj2 = f10686e.get(pVar);
            if (u3 != null) {
            }
            if (obj2 != x2.k.f10788a) {
            }
            oVar.f10679d = pVar;
            oVar.f10680e = eVar3;
            oVar.f = rVar2;
            oVar.f10681g = u3;
            oVar.f10682h = obj2;
            oVar.f10685k = 2;
            if (eVar3.a(obj3, oVar) == enumC0317a) {
            }
            obj = obj2;
            AtomicReference atomicReference22222 = rVar2.f10690a;
            C1148j c1148j2222 = q.f10688a;
            andSet = atomicReference22222.getAndSet(c1148j2222);
            kotlin.jvm.internal.j.b(andSet);
            if (andSet == q.f10689b) {
            }
        } catch (Throwable th2) {
            synchronized (pVar) {
                try {
                    int i8 = pVar.f10772b - 1;
                    pVar.f10772b = i8;
                    if (i8 == 0) {
                        pVar.f10773c = 0;
                    }
                    kotlin.jvm.internal.j.c(rVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    rVar2.f10690a.set(null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        oVar = new o(this, interfaceC0300c);
        Object obj42 = oVar.f10683i;
        enumC0317a = EnumC0317a.f4969a;
        i3 = oVar.f10685k;
        int i52 = 1;
        int i62 = 3;
    }
}
