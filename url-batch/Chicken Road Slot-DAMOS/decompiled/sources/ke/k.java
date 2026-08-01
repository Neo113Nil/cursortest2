package ke;

import ge.a0;
import ge.c1;
import ge.x;
import ge.y;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.collections.i0;
import wd.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k implements je.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Serializable f5532e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5533i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f5534r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5535s;

    public /* synthetic */ k(int i3, Serializable serializable, Object obj, Object obj2, Object obj3) {
        this.f5531d = i3;
        this.f5532e = serializable;
        this.f5533i = obj;
        this.f5534r = obj2;
        this.f5535s = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    @Override // je.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, ld.a aVar) {
        j jVar;
        int i3;
        int i10 = this.f5531d;
        Object obj2 = this.f5535s;
        Serializable serializable = this.f5532e;
        Object obj3 = this.f5533i;
        Object obj4 = this.f5534r;
        boolean z10 = true;
        switch (i10) {
            case 0:
                b0 b0Var = (b0) serializable;
                if (aVar instanceof j) {
                    jVar = (j) aVar;
                    int i11 = jVar.f5530r;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        jVar.f5530r = i11 - Integer.MIN_VALUE;
                        Object obj5 = jVar.f5528e;
                        md.a aVar2 = md.a.f6622d;
                        i3 = jVar.f5530r;
                        if (i3 != 0) {
                            cf.c.M(obj5);
                            c1 c1Var = (c1) b0Var.f10141d;
                            if (c1Var != null) {
                                c1Var.a(new d1.m("Child of the scoped flow was cancelled", 1));
                                jVar.f5527d = obj;
                                jVar.f5530r = 1;
                                if (c1Var.w(jVar) == aVar2) {
                                }
                            }
                        } else if (i3 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            obj = jVar.f5527d;
                            cf.c.M(obj5);
                        }
                        y yVar = y.f4417d;
                        b0Var.f10141d = a0.s((x) obj3, null, new i((l) obj4, (je.f) obj2, obj, null), 1);
                        break;
                    }
                }
                jVar = new j(this, aVar);
                Object obj52 = jVar.f5528e;
                md.a aVar22 = md.a.f6622d;
                i3 = jVar.f5530r;
                if (i3 != 0) {
                }
                y yVar2 = y.f4417d;
                b0Var.f10141d = a0.s((x) obj3, null, new i((l) obj4, (je.f) obj2, obj, null), 1);
                break;
            default:
                z.e eVar = (z.e) obj;
                wd.a0 a0Var = (wd.a0) obj4;
                wd.a0 a0Var2 = (wd.a0) obj3;
                wd.a0 a0Var3 = (wd.a0) serializable;
                if (eVar instanceof z.h) {
                    a0Var3.f10139d++;
                } else if (eVar instanceof z.i) {
                    a0Var3.f10139d--;
                } else if (eVar instanceof z.g) {
                    a0Var3.f10139d--;
                } else if (eVar instanceof z.c) {
                    a0Var2.f10139d++;
                } else if (eVar instanceof z.d) {
                    a0Var2.f10139d--;
                } else if (eVar instanceof z.a) {
                    a0Var.f10139d++;
                } else if (eVar instanceof z.b) {
                    a0Var.f10139d--;
                }
                boolean z11 = false;
                boolean z12 = a0Var3.f10139d > 0;
                boolean z13 = a0Var2.f10139d > 0;
                boolean z14 = a0Var.f10139d > 0;
                x.n nVar = (x.n) obj2;
                if (nVar.D != z12) {
                    nVar.D = z12;
                    z11 = true;
                }
                if (nVar.E != z13) {
                    nVar.E = z13;
                    z11 = true;
                }
                if (nVar.F != z14) {
                    nVar.F = z14;
                } else {
                    z10 = z11;
                }
                if (z10) {
                    c2.k.l(nVar);
                }
                break;
        }
        return Unit.f5554a;
    }
}
