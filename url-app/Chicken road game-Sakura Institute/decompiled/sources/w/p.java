package w;

import com.android.installreferrer.api.InstallReferrerClient;
import g0.p1;
import java.util.List;
import s1.g1;
import s1.h2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9376g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j0 f9377h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(j0 j0Var, int i7) {
        super(1);
        this.f9376g = i7;
        this.f9377h = j0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        h2 h2Var;
        int i7 = this.f9376g;
        boolean z8 = false;
        d6.z zVar = null;
        d6.z zVar2 = d6.z.f2639a;
        j0 j0Var = this.f9377h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p1.p pVar = (p1.p) obj;
                z0 d8 = j0Var.d();
                if (d8 != null) {
                    d8.f9473c = pVar;
                }
                return zVar2;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                j0Var.f9271q.setValue(bool);
                return zVar2;
            case 2:
                List list = (List) obj;
                if (j0Var.d() != null) {
                    z0 d9 = j0Var.d();
                    r6.k.c(d9);
                    list.add(d9.f9471a);
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            case 3:
                a2.g gVar = (a2.g) obj;
                g2.c0 c0Var = j0Var.f9259e;
                p pVar2 = j0Var.f9274t;
                if (c0Var != null) {
                    g2.w n8 = j0Var.f9258d.n(e6.m.X(new g2.f(), new g2.a(gVar, 1)));
                    c0Var.a(null, n8);
                    pVar2.f(n8);
                    zVar = zVar2;
                }
                if (zVar == null) {
                    String str = gVar.f373f;
                    int length = str.length();
                    pVar2.f(new g2.w(4, r4.a.h(length, length), str));
                }
                return Boolean.TRUE;
            case 4:
                int i8 = ((g2.l) obj).f4040a;
                b1.b bVar = j0Var.f9272r;
                bVar.getClass();
                if (i8 == 7) {
                    bVar.n();
                } else if (i8 == 2) {
                    bVar.n();
                } else if (i8 == 6) {
                    bVar.n();
                } else if (i8 == 5) {
                    bVar.n();
                } else if (i8 == 3) {
                    bVar.n();
                } else if (i8 == 4) {
                    bVar.n();
                } else if (i8 != 1 && i8 != 0) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                if (i8 == 6) {
                    x0.g gVar2 = (x0.g) bVar.f1232i;
                    if (gVar2 == null) {
                        r6.k.j("focusManager");
                        throw null;
                    }
                    ((androidx.compose.ui.focus.b) gVar2).d(1);
                } else if (i8 == 5) {
                    x0.g gVar3 = (x0.g) bVar.f1232i;
                    if (gVar3 == null) {
                        r6.k.j("focusManager");
                        throw null;
                    }
                    ((androidx.compose.ui.focus.b) gVar3).d(2);
                } else if (i8 == 7 && (h2Var = (h2) bVar.f1230g) != null) {
                    ((g1) h2Var).a();
                }
                return zVar2;
            default:
                g2.w wVar = (g2.w) obj;
                String str2 = wVar.f4065a.f373f;
                a2.g gVar4 = j0Var.f9264j;
                if (!r6.k.a(str2, gVar4 != null ? gVar4.f373f : null)) {
                    j0Var.f9265k.setValue(a0.f9183f);
                }
                long j8 = a2.j0.f406b;
                j0Var.f(j8);
                j0Var.e(j8);
                j0Var.f9273s.f(wVar);
                p1 p1Var = j0Var.f9256b;
                g0.u uVar = p1Var.f3851b;
                if (uVar != null) {
                    uVar.p(p1Var, null);
                }
                return zVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j0 j0Var, y1.i iVar) {
        super(1);
        this.f9376g = 3;
        this.f9377h = j0Var;
    }
}
