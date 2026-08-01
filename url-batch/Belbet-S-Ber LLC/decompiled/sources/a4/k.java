package a4;

import java.io.IOException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k extends w3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f183g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f181e = i;
        this.f182f = obj;
        this.f183g = obj2;
    }

    @Override // w3.a
    public final long a() {
        long c5;
        z[] zVarArr;
        z[] zVarArr2;
        switch (this.f181e) {
            case 0:
                r rVar = (r) this.f182f;
                rVar.f200f.a(rVar, (e0) ((i3.f) this.f183g).f2074g);
                return -1L;
            case 1:
                try {
                    ((r) this.f182f).f200f.b((z) this.f183g);
                } catch (IOException e4) {
                    b4.n nVar = b4.n.f853a;
                    b4.n nVar2 = b4.n.f853a;
                    String str = "Http2Connection.Listener failure for " + ((r) this.f182f).h;
                    nVar2.getClass();
                    b4.n.i(str, 4, e4);
                    try {
                        ((z) this.f183g).c(2, e4);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                m mVar = (m) this.f182f;
                e0 e0Var = (e0) this.f183g;
                int i = 0;
                i3.f fVar = new i3.f(0);
                r rVar2 = mVar.f188g;
                synchronized (rVar2.B) {
                    synchronized (rVar2) {
                        try {
                            e0 e0Var2 = rVar2.f214v;
                            e0 e0Var3 = new e0(0);
                            e0Var3.e(e0Var2);
                            e0Var3.e(e0Var);
                            fVar.f2074g = e0Var3;
                            c5 = e0Var3.c() - e0Var2.c();
                            if (c5 != 0 && !rVar2.f201g.isEmpty()) {
                                zVarArr = (z[]) rVar2.f201g.values().toArray(new z[0]);
                                zVarArr2 = zVarArr;
                                e0 e0Var4 = (e0) fVar.f2074g;
                                i3.d.e(e0Var4, "<set-?>");
                                rVar2.f214v = e0Var4;
                                rVar2.f207o.c(new k(rVar2.h + " onSettings", rVar2, fVar, i), 0L);
                            }
                            zVarArr = null;
                            zVarArr2 = zVarArr;
                            e0 e0Var42 = (e0) fVar.f2074g;
                            i3.d.e(e0Var42, "<set-?>");
                            rVar2.f214v = e0Var42;
                            rVar2.f207o.c(new k(rVar2.h + " onSettings", rVar2, fVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        rVar2.B.m((e0) fVar.f2074g);
                    } catch (IOException e5) {
                        rVar2.m(2, 2, e5);
                    }
                }
                if (zVarArr2 != null) {
                    int length = zVarArr2.length;
                    while (i < length) {
                        z zVar = zVarArr2[i];
                        synchronized (zVar) {
                            zVar.f242f += c5;
                            if (c5 > 0) {
                                zVar.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
