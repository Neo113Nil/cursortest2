package P;

import A.C0005a;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import y.t;

/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final t f3664d;

    /* renamed from: a, reason: collision with root package name */
    public final Map f3665a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3666b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public k f3667c;

    static {
        d dVar = d.f3647e;
        e eVar = e.f3650e;
        t tVar = o.f3675a;
        f3664d = new t(dVar, 13, eVar);
    }

    public i(Map map) {
        this.f3665a = map;
    }

    @Override // P.c
    public final void a(Object obj) {
        f fVar = (f) this.f3666b.get(obj);
        if (fVar != null) {
            fVar.f3654b = false;
        } else {
            this.f3665a.remove(obj);
        }
    }

    @Override // P.c
    public final void d(Object obj, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-1198538093);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(this) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.V(obj);
            Object I3 = c0216p.I();
            Object obj2 = C0208l.f2826a;
            if (I3 == obj2) {
                k kVar = this.f3667c;
                if (!(kVar != null ? kVar.b(obj) : true)) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                I3 = new f(this, obj);
                c0216p.c0(I3);
            }
            f fVar = (f) I3;
            C0192d.a(m.f3674a.a(fVar.f3655c), aVar, c0216p, (i4 & 112) | 8);
            Unit unit = Unit.f7487a;
            boolean h4 = c0216p.h(this) | c0216p.h(obj) | c0216p.h(fVar);
            Object I4 = c0216p.I();
            if (h4 || I4 == obj2) {
                I4 = new h(this, obj, fVar, 0);
                c0216p.c0(I4);
            }
            C0192d.d(unit, (Function1) I4, c0216p);
            c0216p.t();
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0005a(this, obj, aVar, i2, 2);
        }
    }
}
