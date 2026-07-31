package b;

import c5.x;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public r2.o f1008a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1009b;

    /* renamed from: c, reason: collision with root package name */
    public x f1010c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1011d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1012e;

    public o(c.d dVar, c.g gVar) {
        this.f1011d = 1;
        this.f1012e = dVar;
        this.f1008a = gVar;
        this.f1009b = false;
    }

    public final void a() {
        switch (this.f1011d) {
            case 0:
                u uVar = (u) this.f1012e;
                switch (uVar.f1024d) {
                    case 1:
                        ((c.d) uVar.f1025e).b();
                        break;
                }
            default:
                ((c.d) this.f1012e).b();
                break;
        }
    }

    public final void b() {
        x xVar = this.f1010c;
        if (xVar == null || !((LinkedHashSet) xVar.f1739f).remove(this)) {
            return;
        }
        s4.f fVar = (s4.f) xVar.f1738e;
        fVar.getClass();
        if (equals(fVar.f6714f)) {
            if (fVar.f6715g == -1) {
                a();
            }
            fVar.f6714f = null;
            fVar.f6715g = 0;
            fVar.f6716h = null;
        }
        fVar.f6712d.remove(this);
        fVar.f6713e.remove(this);
        this.f1010c = null;
        fVar.b();
    }

    public final void c(boolean z3) {
        s4.f fVar;
        if (this.f1009b == z3) {
            return;
        }
        this.f1009b = z3;
        x xVar = this.f1010c;
        if (xVar == null || (fVar = (s4.f) xVar.f1738e) == null) {
            return;
        }
        fVar.b();
    }

    public o(u uVar, p pVar) {
        this.f1011d = 0;
        boolean z3 = uVar.f1022b;
        this.f1008a = pVar;
        this.f1009b = z3;
        this.f1012e = uVar;
    }
}
