package z7;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends v7.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10165f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f10166g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i7) {
        super(str, true);
        this.f10164e = i7;
        this.f10165f = obj;
        this.f10166g = obj2;
    }

    @Override // v7.a
    public final long a() {
        long a3;
        int i7;
        v[] vVarArr;
        v[] vVarArr2;
        switch (this.f10164e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                n nVar = (n) this.f10165f;
                nVar.f10181f.a(nVar, (z) ((r6.v) this.f10166g).f7968f);
                return -1L;
            case 1:
                try {
                    ((n) this.f10165f).f10181f.b((v) this.f10166g);
                } catch (IOException e9) {
                    a8.o oVar = a8.o.f570a;
                    a8.o oVar2 = a8.o.f570a;
                    String str = "Http2Connection.Listener failure for " + ((n) this.f10165f).f10183h;
                    oVar2.getClass();
                    a8.o.i(str, 4, e9);
                    try {
                        ((v) this.f10166g).c(2, e9);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                g4.o oVar3 = (g4.o) this.f10165f;
                z zVar = (z) this.f10166g;
                r6.v vVar = new r6.v();
                n nVar2 = (n) oVar3.f4350g;
                synchronized (nVar2.B) {
                    synchronized (nVar2) {
                        try {
                            z zVar2 = nVar2.f10197v;
                            z zVar3 = new z();
                            zVar3.b(zVar2);
                            zVar3.b(zVar);
                            vVar.f7968f = zVar3;
                            a3 = zVar3.a() - zVar2.a();
                            i7 = 0;
                            if (a3 != 0 && !nVar2.f10182g.isEmpty()) {
                                vVarArr = (v[]) nVar2.f10182g.values().toArray(new v[0]);
                                vVarArr2 = vVarArr;
                                z zVar4 = (z) vVar.f7968f;
                                r6.k.f(zVar4, "<set-?>");
                                nVar2.f10197v = zVar4;
                                nVar2.f10190o.c(new i(nVar2.f10183h + " onSettings", nVar2, vVar, i7), 0L);
                            }
                            vVarArr = null;
                            vVarArr2 = vVarArr;
                            z zVar42 = (z) vVar.f7968f;
                            r6.k.f(zVar42, "<set-?>");
                            nVar2.f10197v = zVar42;
                            nVar2.f10190o.c(new i(nVar2.f10183h + " onSettings", nVar2, vVar, i7), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        nVar2.B.b((z) vVar.f7968f);
                    } catch (IOException e10) {
                        nVar2.b(2, 2, e10);
                    }
                }
                if (vVarArr2 != null) {
                    int length = vVarArr2.length;
                    while (i7 < length) {
                        v vVar2 = vVarArr2[i7];
                        synchronized (vVar2) {
                            vVar2.f10236f += a3;
                            if (a3 > 0) {
                                vVar2.notifyAll();
                            }
                        }
                        i7++;
                    }
                }
                return -1L;
        }
    }
}
