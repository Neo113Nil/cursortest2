package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f692d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f693e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f694i;

    public h(t tVar) {
        this.f693e = tVar;
        d dVar = d.f675c;
        Class<?> cls = tVar.getClass();
        b bVar = (b) dVar.f676a.get(cls);
        this.f694i = bVar == null ? dVar.a(cls, null) : bVar;
    }

    @Override // androidx.lifecycle.s
    public final void d(u uVar, o oVar) {
        switch (this.f692d) {
            case 0:
                f fVar = (f) this.f693e;
                switch (g.f682a[oVar.ordinal()]) {
                    case 1:
                        fVar.getClass();
                        break;
                    case 2:
                        fVar.h(uVar);
                        break;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        fVar.a(uVar);
                        break;
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        fVar.getClass();
                        break;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        fVar.i(uVar);
                        break;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        fVar.getClass();
                        break;
                    case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        te.a1.e("ON_ANY must not been send by anybody");
                        break;
                    default:
                        a2.r.p();
                        break;
                }
                s sVar = (s) this.f694i;
                if (sVar != null) {
                    sVar.d(uVar, oVar);
                    break;
                }
                break;
            case 1:
                if (oVar == o.ON_START) {
                    ((w) this.f693e).f(this);
                    ((c6.l) this.f694i).l();
                    break;
                }
                break;
            case 2:
                HashMap hashMap = ((b) this.f694i).f663a;
                List list = (List) hashMap.get(oVar);
                Object obj = this.f693e;
                b.a(list, uVar, oVar, obj);
                b.a((List) hashMap.get(o.ON_ANY), uVar, oVar, obj);
                break;
            default:
                d.x xVar = (d.x) this.f693e;
                int i3 = d.b0.f3212a[oVar.ordinal()];
                if (i3 == 1) {
                    xVar.g(true);
                    break;
                } else if (i3 == 2) {
                    xVar.g(false);
                    break;
                } else if (i3 == 3) {
                    xVar.e();
                    ((w) this.f694i).f(this);
                    break;
                }
                break;
        }
    }

    public h(f fVar, s sVar) {
        fVar.getClass();
        this.f693e = fVar;
        this.f694i = sVar;
    }

    public h(w wVar, c6.l lVar) {
        this.f693e = wVar;
        this.f694i = lVar;
    }

    public h(d.x xVar, d.c0 c0Var, w wVar) {
        this.f693e = xVar;
        this.f694i = wVar;
    }
}
