package e7;

import a7.s0;
import a7.x;
import java.io.Serializable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j implements d7.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Serializable f2558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2560g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2561h;

    public /* synthetic */ j(Serializable serializable, Object obj, Object obj2, Object obj3, int i) {
        this.f2557d = i;
        this.f2558e = serializable;
        this.f2559f = obj;
        this.f2560g = obj2;
        this.f2561h = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    @Override // d7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, g6.c cVar) {
        i iVar;
        int i;
        j jVar;
        switch (this.f2557d) {
            case 0:
                if (cVar instanceof i) {
                    iVar = (i) cVar;
                    int i8 = iVar.f2556k;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        iVar.f2556k = i8 - Integer.MIN_VALUE;
                        Object obj2 = iVar.i;
                        i = iVar.f2556k;
                        if (i != 0) {
                            s6.a.K(obj2);
                            s0 s0Var = (s0) ((q6.s) this.f2558e).f6205d;
                            if (s0Var != null) {
                                s0Var.a(new l("Child of the scoped flow was cancelled", 0));
                                iVar.f2553g = this;
                                iVar.f2554h = obj;
                                iVar.f2556k = 1;
                                Object r7 = s0Var.r(iVar);
                                h6.a aVar = h6.a.f3204d;
                                if (r7 == aVar) {
                                    return aVar;
                                }
                            }
                            jVar = this;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = iVar.f2554h;
                            jVar = iVar.f2553g;
                            s6.a.K(obj2);
                        }
                        ((q6.s) jVar.f2558e).f6205d = x.n((a7.u) jVar.f2559f, null, new h((k) jVar.f2560g, (d7.g) jVar.f2561h, obj, null), 1);
                        return c6.m.f1757a;
                    }
                }
                iVar = new i(this, cVar);
                Object obj22 = iVar.i;
                i = iVar.f2556k;
                if (i != 0) {
                }
                ((q6.s) jVar.f2558e).f6205d = x.n((a7.u) jVar.f2559f, null, new h((k) jVar.f2560g, (d7.g) jVar.f2561h, obj, null), 1);
                return c6.m.f1757a;
            default:
                v.h hVar = (v.h) obj;
                q6.q qVar = (q6.q) this.f2560g;
                q6.q qVar2 = (q6.q) this.f2559f;
                q6.q qVar3 = (q6.q) this.f2558e;
                boolean z3 = true;
                if (hVar instanceof v.l) {
                    qVar3.f6203d++;
                } else if (hVar instanceof v.m) {
                    qVar3.f6203d--;
                } else if (hVar instanceof v.k) {
                    qVar3.f6203d--;
                } else if (hVar instanceof v.f) {
                    qVar2.f6203d++;
                } else if (hVar instanceof v.g) {
                    qVar2.f6203d--;
                } else if (hVar instanceof v.d) {
                    qVar.f6203d++;
                } else if (hVar instanceof v.e) {
                    qVar.f6203d--;
                }
                int i9 = qVar3.f6203d;
                boolean z7 = false;
                boolean z8 = i9 > 0;
                boolean z9 = qVar2.f6203d > 0;
                boolean z10 = qVar.f6203d > 0;
                t.x xVar = (t.x) this.f2561h;
                if (xVar.f6886s != z8) {
                    xVar.f6886s = z8;
                    z7 = true;
                }
                if (xVar.f6887t != z9) {
                    xVar.f6887t = z9;
                    z7 = true;
                }
                if (xVar.f6888u != z10) {
                    xVar.f6888u = z10;
                } else {
                    z3 = z7;
                }
                if (z3) {
                    w1.f.l(xVar);
                }
                return c6.m.f1757a;
        }
    }
}
