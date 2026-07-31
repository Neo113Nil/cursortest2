package n;

import k2.AbstractC0552y;
import k2.InterfaceC0550w;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649d extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public boolean f6069e;

    /* renamed from: f, reason: collision with root package name */
    public int f6070f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6071g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o.M f6072h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f6073i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q.j f6074j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0667w f6075k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0649d(o.M m3, long j3, q.j jVar, C0667w c0667w, P1.d dVar) {
        super(2, dVar);
        this.f6072h = m3;
        this.f6073i = j3;
        this.f6074j = jVar;
        this.f6075k = c0667w;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0649d c0649d = new C0649d(this.f6072h, this.f6073i, this.f6074j, this.f6075k, dVar);
        c0649d.f6071g = obj;
        return c0649d;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0649d) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k2.X q2;
        Object d3;
        boolean z3;
        q.m mVar;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6070f;
        L1.z zVar = L1.z.f2729a;
        C0667w c0667w = this.f6075k;
        q.j jVar = this.f6074j;
        if (i3 == 0) {
            I2.l.Q(obj);
            q2 = AbstractC0552y.q((InterfaceC0550w) this.f6071g, null, null, new C0648c(this.f6075k, this.f6073i, this.f6074j, null), 3);
            this.f6071g = q2;
            this.f6070f = 1;
            d3 = this.f6072h.d(this);
            if (d3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4 && i3 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        I2.l.Q(obj);
                        c0667w.C = null;
                        return zVar;
                    }
                    mVar = (q.m) this.f6071g;
                    I2.l.Q(obj);
                    this.f6071g = null;
                    this.f6070f = 4;
                    if (jVar.b(mVar, this) == aVar) {
                        return aVar;
                    }
                    c0667w.C = null;
                    return zVar;
                }
                z3 = this.f6069e;
                I2.l.Q(obj);
                if (z3) {
                    q.l lVar = new q.l(this.f6073i);
                    q.m mVar2 = new q.m(lVar);
                    this.f6071g = mVar2;
                    this.f6070f = 3;
                    if (jVar.b(lVar, this) == aVar) {
                        return aVar;
                    }
                    mVar = mVar2;
                    this.f6071g = null;
                    this.f6070f = 4;
                    if (jVar.b(mVar, this) == aVar) {
                    }
                }
                c0667w.C = null;
                return zVar;
            }
            q2 = (k2.X) this.f6071g;
            I2.l.Q(obj);
            d3 = obj;
        }
        boolean booleanValue = ((Boolean) d3).booleanValue();
        if (!q2.b()) {
            q.l lVar2 = c0667w.C;
            if (lVar2 != null) {
                q.h mVar3 = booleanValue ? new q.m(lVar2) : new q.k(lVar2);
                this.f6071g = null;
                this.f6070f = 5;
                if (jVar.b(mVar3, this) == aVar) {
                    return aVar;
                }
            }
            c0667w.C = null;
            return zVar;
        }
        this.f6071g = null;
        this.f6069e = booleanValue;
        this.f6070f = 2;
        q2.a(null);
        Object h3 = q2.h(this);
        if (h3 != aVar) {
            h3 = zVar;
        }
        if (h3 == aVar) {
            return aVar;
        }
        z3 = booleanValue;
        if (z3) {
        }
        c0667w.C = null;
        return zVar;
    }
}
