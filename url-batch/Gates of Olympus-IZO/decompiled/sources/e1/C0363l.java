package e1;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: e1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363l extends R1.i implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public Object f4716e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f4717f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4718g;

    /* renamed from: h, reason: collision with root package name */
    public Object f4719h;

    /* renamed from: i, reason: collision with root package name */
    public Iterator f4720i;

    /* renamed from: j, reason: collision with root package name */
    public int f4721j;

    /* renamed from: k, reason: collision with root package name */
    public int f4722k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0351N f4723l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ A2.k f4724m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0363l(C0351N c0351n, A2.k kVar, P1.d dVar) {
        super(1, dVar);
        this.f4723l = c0351n;
        this.f4724m = kVar;
    }

    @Override // R1.a
    public final P1.d create(P1.d dVar) {
        return new C0363l(this.f4723l, this.f4724m, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s2.a a3;
        Z1.p pVar;
        Z1.t tVar;
        Z1.t tVar2;
        Iterator it;
        s2.a aVar;
        Z1.p pVar2;
        Z1.t tVar3;
        C0362k c0362k;
        s2.c cVar;
        Z1.t tVar4;
        Z1.p pVar3;
        Object obj2;
        Object obj3;
        Integer a4;
        int i3;
        Q1.a aVar2 = Q1.a.f3113d;
        int i4 = this.f4722k;
        A2.k kVar = this.f4724m;
        C0351N c0351n = this.f4723l;
        if (i4 == 0) {
            I2.l.Q(obj);
            a3 = s2.d.a();
            pVar = new Z1.p();
            tVar = new Z1.t();
            this.f4716e = a3;
            this.f4717f = pVar;
            this.f4718g = tVar;
            this.f4719h = tVar;
            this.f4722k = 1;
            obj = C0351N.c(c0351n, true, this);
            if (obj == aVar2) {
                return aVar2;
            }
            tVar2 = tVar;
        } else if (i4 == 1) {
            tVar = (Z1.t) this.f4719h;
            tVar2 = (Z1.t) this.f4718g;
            pVar = (Z1.p) this.f4717f;
            a3 = (s2.a) this.f4716e;
            I2.l.Q(obj);
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = this.f4721j;
                    obj3 = this.f4716e;
                    I2.l.Q(obj);
                    return new C0354c(obj3, i3, ((Number) obj).intValue());
                }
                Object obj4 = (s2.a) this.f4718g;
                tVar4 = (Z1.t) this.f4717f;
                pVar3 = (Z1.p) this.f4716e;
                I2.l.Q(obj);
                obj2 = obj4;
                try {
                    pVar3.f3476d = true;
                    ((s2.c) obj2).e(null);
                    obj3 = tVar4.f3480d;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    X d3 = c0351n.d();
                    this.f4716e = obj3;
                    this.f4717f = null;
                    this.f4718g = null;
                    this.f4721j = hashCode;
                    this.f4722k = 4;
                    a4 = d3.a();
                    if (a4 != aVar2) {
                        return aVar2;
                    }
                    i3 = hashCode;
                    obj = a4;
                    return new C0354c(obj3, i3, ((Number) obj).intValue());
                } catch (Throwable th) {
                    ((s2.c) obj2).e(null);
                    throw th;
                }
            }
            it = this.f4720i;
            c0362k = (C0362k) this.f4719h;
            tVar3 = (Z1.t) this.f4718g;
            pVar2 = (Z1.p) this.f4717f;
            aVar = (s2.a) this.f4716e;
            I2.l.Q(obj);
            while (it.hasNext()) {
                Y1.e eVar = (Y1.e) it.next();
                this.f4716e = aVar;
                this.f4717f = pVar2;
                this.f4718g = tVar3;
                this.f4719h = c0362k;
                this.f4720i = it;
                this.f4722k = 2;
                if (eVar.g(c0362k, this) == aVar2) {
                    return aVar2;
                }
            }
            tVar2 = tVar3;
            pVar = pVar2;
            a3 = aVar;
            kVar.f110d = null;
            this.f4716e = pVar;
            this.f4717f = tVar2;
            this.f4718g = a3;
            this.f4719h = null;
            this.f4720i = null;
            this.f4722k = 3;
            cVar = (s2.c) a3;
            if (cVar.c(null, this) != aVar2) {
                return aVar2;
            }
            tVar4 = tVar2;
            pVar3 = pVar;
            obj2 = cVar;
            pVar3.f3476d = true;
            ((s2.c) obj2).e(null);
            obj3 = tVar4.f3480d;
            if (obj3 == null) {
            }
            X d32 = c0351n.d();
            this.f4716e = obj3;
            this.f4717f = null;
            this.f4718g = null;
            this.f4721j = hashCode;
            this.f4722k = 4;
            a4 = d32.a();
            if (a4 != aVar2) {
            }
        }
        tVar.f3480d = ((C0354c) obj).f4682b;
        C0362k c0362k2 = new C0362k(a3, pVar, tVar2, c0351n);
        List list = (List) kVar.f110d;
        if (list != null) {
            it = list.iterator();
            aVar = a3;
            pVar2 = pVar;
            tVar3 = tVar2;
            c0362k = c0362k2;
            while (it.hasNext()) {
            }
            tVar2 = tVar3;
            pVar = pVar2;
            a3 = aVar;
        }
        kVar.f110d = null;
        this.f4716e = pVar;
        this.f4717f = tVar2;
        this.f4718g = a3;
        this.f4719h = null;
        this.f4720i = null;
        this.f4722k = 3;
        cVar = (s2.c) a3;
        if (cVar.c(null, this) != aVar2) {
        }
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        return ((C0363l) create((P1.d) obj)).invokeSuspend(L1.z.f2729a);
    }
}
