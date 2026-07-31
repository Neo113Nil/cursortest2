package F;

import m.C0619d;
import q.C0808d;

/* renamed from: F.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100i0 {

    /* renamed from: a, reason: collision with root package name */
    public float f1574a;

    /* renamed from: b, reason: collision with root package name */
    public float f1575b;

    /* renamed from: c, reason: collision with root package name */
    public float f1576c;

    /* renamed from: d, reason: collision with root package name */
    public float f1577d;

    /* renamed from: e, reason: collision with root package name */
    public final C0619d f1578e;

    /* renamed from: f, reason: collision with root package name */
    public q.i f1579f;

    /* renamed from: g, reason: collision with root package name */
    public q.i f1580g;

    public C0100i0(float f3, float f4, float f5, float f6) {
        this.f1574a = f3;
        this.f1575b = f4;
        this.f1576c = f5;
        this.f1577d = f6;
        this.f1578e = new C0619d(new O0.e(f3), m.v0.f6901c, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q.i iVar, X1.c cVar) {
        C0096g0 c0096g0;
        int i3;
        C0100i0 c0100i0;
        C0619d c0619d = this.f1578e;
        if (cVar instanceof C0096g0) {
            c0096g0 = (C0096g0) cVar;
            int i4 = c0096g0.f1544k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0096g0.f1544k = i4 - Integer.MIN_VALUE;
                Object obj = c0096g0.f1542i;
                W1.a aVar = W1.a.f4608d;
                i3 = c0096g0.f1544k;
                if (i3 != 0) {
                    R1.a.e(obj);
                    float f3 = iVar instanceof q.m ? this.f1575b : iVar instanceof q.g ? this.f1576c : iVar instanceof C0808d ? this.f1577d : this.f1574a;
                    this.f1580g = iVar;
                    try {
                        if (!O0.e.a(((O0.e) c0619d.f6761e.getValue()).f3731d, f3)) {
                            q.i iVar2 = this.f1579f;
                            c0096g0.f1540g = this;
                            c0096g0.f1541h = iVar;
                            c0096g0.f1544k = 1;
                            if (G.e.a(c0619d, f3, iVar2, iVar, c0096g0) == aVar) {
                                return aVar;
                            }
                        }
                        c0100i0 = this;
                    } catch (Throwable th) {
                        th = th;
                        c0100i0 = this;
                        c0100i0.f1579f = iVar;
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = c0096g0.f1541h;
                    c0100i0 = c0096g0.f1540g;
                    try {
                        R1.a.e(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        c0100i0.f1579f = iVar;
                        throw th;
                    }
                }
                c0100i0.f1579f = iVar;
                return R1.y.f4171a;
            }
        }
        c0096g0 = new C0096g0(this, cVar);
        Object obj2 = c0096g0.f1542i;
        W1.a aVar2 = W1.a.f4608d;
        i3 = c0096g0.f1544k;
        if (i3 != 0) {
        }
        c0100i0.f1579f = iVar;
        return R1.y.f4171a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(X1.c cVar) {
        C0098h0 c0098h0;
        int i3;
        C0100i0 c0100i0;
        if (cVar instanceof C0098h0) {
            c0098h0 = (C0098h0) cVar;
            int i4 = c0098h0.f1559j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0098h0.f1559j = i4 - Integer.MIN_VALUE;
                Object obj = c0098h0.f1557h;
                W1.a aVar = W1.a.f4608d;
                i3 = c0098h0.f1559j;
                if (i3 != 0) {
                    R1.a.e(obj);
                    q.i iVar = this.f1580g;
                    float f3 = iVar instanceof q.m ? this.f1575b : iVar instanceof q.g ? this.f1576c : iVar instanceof C0808d ? this.f1577d : this.f1574a;
                    C0619d c0619d = this.f1578e;
                    if (!O0.e.a(((O0.e) c0619d.f6761e.getValue()).f3731d, f3)) {
                        try {
                            O0.e eVar = new O0.e(f3);
                            c0098h0.f1556g = this;
                            c0098h0.f1559j = 1;
                            if (c0619d.e(c0098h0, eVar) == aVar) {
                                return aVar;
                            }
                            c0100i0 = this;
                        } catch (Throwable th) {
                            th = th;
                            c0100i0 = this;
                            c0100i0.f1579f = c0100i0.f1580g;
                            throw th;
                        }
                    }
                    return R1.y.f4171a;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0100i0 = c0098h0.f1556g;
                try {
                    R1.a.e(obj);
                } catch (Throwable th2) {
                    th = th2;
                    c0100i0.f1579f = c0100i0.f1580g;
                    throw th;
                }
                c0100i0.f1579f = c0100i0.f1580g;
                return R1.y.f4171a;
            }
        }
        c0098h0 = new C0098h0(this, cVar);
        Object obj2 = c0098h0.f1557h;
        W1.a aVar2 = W1.a.f4608d;
        i3 = c0098h0.f1559j;
        if (i3 != 0) {
        }
        c0100i0.f1579f = c0100i0.f1580g;
        return R1.y.f4171a;
    }
}
