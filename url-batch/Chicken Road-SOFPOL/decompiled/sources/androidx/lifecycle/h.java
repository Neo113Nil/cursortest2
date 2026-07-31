package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h implements s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f826d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f827e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f828f;

    public h(f fVar, s sVar) {
        q6.i.e(fVar, "defaultLifecycleObserver");
        this.f827e = fVar;
        this.f828f = sVar;
    }

    @Override // androidx.lifecycle.s
    public final void b(u uVar, o oVar) {
        switch (this.f826d) {
            case 0:
                f fVar = (f) this.f827e;
                switch (g.f825a[oVar.ordinal()]) {
                    case 1:
                        fVar.getClass();
                        break;
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        fVar.c(uVar);
                        break;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        fVar.a(uVar);
                        break;
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        fVar.getClass();
                        break;
                    case 5:
                        fVar.d(uVar);
                        break;
                    case 6:
                        fVar.getClass();
                        break;
                    case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new a5.c();
                }
                s sVar = (s) this.f828f;
                if (sVar != null) {
                    sVar.b(uVar, oVar);
                    return;
                }
                return;
            case 1:
                if (oVar == o.ON_START) {
                    ((w) this.f827e).f(this);
                    ((x4.e) this.f828f).g();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((b) this.f828f).f808a;
                List list = (List) hashMap.get(oVar);
                Object obj = this.f827e;
                b.a(list, uVar, oVar, obj);
                b.a((List) hashMap.get(o.ON_ANY), uVar, oVar, obj);
                return;
        }
    }

    public h(t tVar) {
        this.f827e = tVar;
        d dVar = d.f812c;
        Class<?> cls = tVar.getClass();
        b bVar = (b) dVar.f813a.get(cls);
        this.f828f = bVar == null ? dVar.a(cls, null) : bVar;
    }

    public h(w wVar, x4.e eVar) {
        this.f827e = wVar;
        this.f828f = eVar;
    }
}
