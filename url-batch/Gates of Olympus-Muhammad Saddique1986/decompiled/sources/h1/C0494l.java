package h1;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: h1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494l extends X1.i implements InterfaceC0424c {

    /* renamed from: h, reason: collision with root package name */
    public Object f6169h;

    /* renamed from: i, reason: collision with root package name */
    public Serializable f6170i;

    /* renamed from: j, reason: collision with root package name */
    public Object f6171j;

    /* renamed from: k, reason: collision with root package name */
    public Object f6172k;

    /* renamed from: l, reason: collision with root package name */
    public Iterator f6173l;

    /* renamed from: m, reason: collision with root package name */
    public int f6174m;

    /* renamed from: n, reason: collision with root package name */
    public int f6175n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ M f6176o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G1.g f6177p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0494l(M m3, G1.g gVar, V1.d dVar) {
        super(1, dVar);
        this.f6176o = m3;
        this.f6177p = gVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        return new C0494l(this.f6176o, this.f6177p, (V1.d) obj).q(R1.y.f4171a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        y2.a a3;
        f2.q qVar;
        f2.u uVar;
        f2.u uVar2;
        Iterator it;
        y2.a aVar;
        f2.q qVar2;
        f2.u uVar3;
        C0493k c0493k;
        y2.c cVar;
        f2.u uVar4;
        f2.q qVar3;
        Object obj2;
        Object obj3;
        Integer a4;
        int i3;
        W1.a aVar2 = W1.a.f4608d;
        int i4 = this.f6175n;
        G1.g gVar = this.f6177p;
        M m3 = this.f6176o;
        if (i4 == 0) {
            R1.a.e(obj);
            a3 = y2.d.a();
            qVar = new f2.q();
            uVar = new f2.u();
            this.f6169h = a3;
            this.f6170i = qVar;
            this.f6171j = uVar;
            this.f6172k = uVar;
            this.f6175n = 1;
            obj = M.e(m3, true, this);
            if (obj == aVar2) {
                return aVar2;
            }
            uVar2 = uVar;
        } else if (i4 == 1) {
            uVar = (f2.u) this.f6172k;
            uVar2 = (f2.u) this.f6171j;
            qVar = (f2.q) this.f6170i;
            a3 = (y2.a) this.f6169h;
            R1.a.e(obj);
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = this.f6174m;
                    obj3 = this.f6169h;
                    R1.a.e(obj);
                    return new C0485c(i3, ((Number) obj).intValue(), obj3);
                }
                Object obj4 = (y2.a) this.f6171j;
                uVar4 = (f2.u) this.f6170i;
                qVar3 = (f2.q) this.f6169h;
                R1.a.e(obj);
                obj2 = obj4;
                try {
                    qVar3.f5828d = true;
                    ((y2.c) obj2).e(null);
                    obj3 = uVar4.f5832d;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    W f3 = m3.f();
                    this.f6169h = obj3;
                    this.f6170i = null;
                    this.f6171j = null;
                    this.f6174m = hashCode;
                    this.f6175n = 4;
                    a4 = f3.a();
                    if (a4 != aVar2) {
                        return aVar2;
                    }
                    i3 = hashCode;
                    obj = a4;
                    return new C0485c(i3, ((Number) obj).intValue(), obj3);
                } catch (Throwable th) {
                    ((y2.c) obj2).e(null);
                    throw th;
                }
            }
            it = this.f6173l;
            c0493k = (C0493k) this.f6172k;
            uVar3 = (f2.u) this.f6171j;
            qVar2 = (f2.q) this.f6170i;
            aVar = (y2.a) this.f6169h;
            R1.a.e(obj);
            while (it.hasNext()) {
                InterfaceC0426e interfaceC0426e = (InterfaceC0426e) it.next();
                this.f6169h = aVar;
                this.f6170i = qVar2;
                this.f6171j = uVar3;
                this.f6172k = c0493k;
                this.f6173l = it;
                this.f6175n = 2;
                if (interfaceC0426e.h(c0493k, this) == aVar2) {
                    return aVar2;
                }
            }
            uVar2 = uVar3;
            qVar = qVar2;
            a3 = aVar;
            gVar.f2095g = null;
            this.f6169h = qVar;
            this.f6170i = uVar2;
            this.f6171j = a3;
            this.f6172k = null;
            this.f6173l = null;
            this.f6175n = 3;
            cVar = (y2.c) a3;
            if (cVar.c(null, this) != aVar2) {
                return aVar2;
            }
            uVar4 = uVar2;
            qVar3 = qVar;
            obj2 = cVar;
            qVar3.f5828d = true;
            ((y2.c) obj2).e(null);
            obj3 = uVar4.f5832d;
            if (obj3 == null) {
            }
            W f32 = m3.f();
            this.f6169h = obj3;
            this.f6170i = null;
            this.f6171j = null;
            this.f6174m = hashCode;
            this.f6175n = 4;
            a4 = f32.a();
            if (a4 != aVar2) {
            }
        }
        uVar.f5832d = ((C0485c) obj).f6137b;
        C0493k c0493k2 = new C0493k(a3, qVar, uVar2, m3);
        List list = (List) gVar.f2095g;
        if (list != null) {
            it = list.iterator();
            aVar = a3;
            qVar2 = qVar;
            uVar3 = uVar2;
            c0493k = c0493k2;
            while (it.hasNext()) {
            }
            uVar2 = uVar3;
            qVar = qVar2;
            a3 = aVar;
        }
        gVar.f2095g = null;
        this.f6169h = qVar;
        this.f6170i = uVar2;
        this.f6171j = a3;
        this.f6172k = null;
        this.f6173l = null;
        this.f6175n = 3;
        cVar = (y2.c) a3;
        if (cVar.c(null, this) != aVar2) {
        }
    }
}
