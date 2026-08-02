package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import o3.InterfaceC1339l;

/* renamed from: K.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063l extends h3.g implements InterfaceC1339l {

    /* renamed from: a, reason: collision with root package name */
    public Object f1385a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f1386b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1387c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1388d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f1389e;

    /* renamed from: f, reason: collision with root package name */
    public int f1390f;

    /* renamed from: g, reason: collision with root package name */
    public int f1391g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ M f1392h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ G1.c f1393i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0063l(M m4, G1.c cVar, InterfaceC0425c interfaceC0425c) {
        super(1, interfaceC0425c);
        this.f1392h = m4;
        this.f1393i = cVar;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(InterfaceC0425c interfaceC0425c) {
        return new C0063l(this.f1392h, this.f1393i, interfaceC0425c);
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        return ((C0063l) create((InterfaceC0425c) obj)).invokeSuspend(C0297i.f5732a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    @Override // h3.AbstractC0448a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        F3.a dVar;
        kotlin.jvm.internal.n nVar;
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.p pVar2;
        Iterator it;
        F3.a aVar;
        kotlin.jvm.internal.n nVar2;
        kotlin.jvm.internal.p pVar3;
        C0062k c0062k;
        F3.d dVar2;
        kotlin.jvm.internal.p pVar4;
        kotlin.jvm.internal.n nVar3;
        Object obj2;
        Object obj3;
        Integer a3;
        int i4;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i5 = this.f1391g;
        G1.c cVar = this.f1393i;
        M m4 = this.f1392h;
        if (i5 == 0) {
            O3.l.w(obj);
            dVar = new F3.d();
            nVar = new kotlin.jvm.internal.n();
            pVar = new kotlin.jvm.internal.p();
            this.f1385a = dVar;
            this.f1386b = nVar;
            this.f1387c = pVar;
            this.f1388d = pVar;
            this.f1391g = 1;
            obj = M.f(m4, true, this);
            if (obj != enumC0441a) {
                pVar2 = pVar;
            }
            return enumC0441a;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = this.f1390f;
                    obj3 = this.f1385a;
                    O3.l.w(obj);
                    return new C0054c(i4, ((Number) obj).intValue(), obj3);
                }
                Object obj4 = (F3.a) this.f1387c;
                pVar4 = (kotlin.jvm.internal.p) this.f1386b;
                nVar3 = (kotlin.jvm.internal.n) this.f1385a;
                O3.l.w(obj);
                obj2 = obj4;
                try {
                    nVar3.f14157a = true;
                    ((F3.d) obj2).e(null);
                    obj3 = pVar4.f14159a;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    g0 g4 = m4.g();
                    this.f1385a = obj3;
                    this.f1386b = null;
                    this.f1387c = null;
                    this.f1390f = hashCode;
                    this.f1391g = 4;
                    a3 = g4.a();
                    if (a3 != enumC0441a) {
                        i4 = hashCode;
                        obj = a3;
                        return new C0054c(i4, ((Number) obj).intValue(), obj3);
                    }
                    return enumC0441a;
                } catch (Throwable th) {
                    ((F3.d) obj2).e(null);
                    throw th;
                }
            }
            it = this.f1389e;
            c0062k = (C0062k) this.f1388d;
            pVar3 = (kotlin.jvm.internal.p) this.f1387c;
            nVar2 = (kotlin.jvm.internal.n) this.f1386b;
            aVar = (F3.a) this.f1385a;
            O3.l.w(obj);
            while (it.hasNext()) {
                o3.p pVar5 = (o3.p) it.next();
                this.f1385a = aVar;
                this.f1386b = nVar2;
                this.f1387c = pVar3;
                this.f1388d = c0062k;
                this.f1389e = it;
                this.f1391g = 2;
                if (pVar5.invoke(c0062k, this) == enumC0441a) {
                    break;
                }
            }
            pVar2 = pVar3;
            nVar = nVar2;
            dVar = aVar;
            cVar.f837d = null;
            this.f1385a = nVar;
            this.f1386b = pVar2;
            this.f1387c = dVar;
            this.f1388d = null;
            this.f1389e = null;
            this.f1391g = 3;
            dVar2 = (F3.d) dVar;
            if (dVar2.c(this) != enumC0441a) {
                pVar4 = pVar2;
                nVar3 = nVar;
                obj2 = dVar2;
                nVar3.f14157a = true;
                ((F3.d) obj2).e(null);
                obj3 = pVar4.f14159a;
                if (obj3 == null) {
                }
                g0 g42 = m4.g();
                this.f1385a = obj3;
                this.f1386b = null;
                this.f1387c = null;
                this.f1390f = hashCode;
                this.f1391g = 4;
                a3 = g42.a();
                if (a3 != enumC0441a) {
                }
            }
            return enumC0441a;
        }
        pVar = (kotlin.jvm.internal.p) this.f1388d;
        pVar2 = (kotlin.jvm.internal.p) this.f1387c;
        nVar = (kotlin.jvm.internal.n) this.f1386b;
        dVar = (F3.a) this.f1385a;
        O3.l.w(obj);
        pVar.f14159a = ((C0054c) obj).f1333b;
        C0062k c0062k2 = new C0062k(dVar, nVar, pVar2, m4);
        List list = (List) cVar.f837d;
        if (list != null) {
            it = list.iterator();
            aVar = dVar;
            nVar2 = nVar;
            pVar3 = pVar2;
            c0062k = c0062k2;
            while (it.hasNext()) {
            }
            pVar2 = pVar3;
            nVar = nVar2;
            dVar = aVar;
        }
        cVar.f837d = null;
        this.f1385a = nVar;
        this.f1386b = pVar2;
        this.f1387c = dVar;
        this.f1388d = null;
        this.f1389e = null;
        this.f1391g = 3;
        dVar2 = (F3.d) dVar;
        if (dVar2.c(this) != enumC0441a) {
        }
        return enumC0441a;
    }
}
