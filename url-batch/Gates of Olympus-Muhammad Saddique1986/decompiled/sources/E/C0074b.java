package E;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0335d;
import h2.AbstractC0508a;
import java.util.LinkedHashMap;
import t0.AbstractC0993f;
import z.C1256t;

/* renamed from: E.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074b extends y implements s {

    /* renamed from: A, reason: collision with root package name */
    public r f945A;

    /* renamed from: B, reason: collision with root package name */
    public u f946B;

    @Override // E.y
    public final void B0(q.m mVar) {
        u uVar = this.f946B;
        if (uVar != null) {
            uVar.d();
        }
    }

    @Override // E.s
    public final void Q() {
        this.f946B = null;
        AbstractC0993f.m(this);
    }

    @Override // U.p
    public final void r0() {
        r rVar = this.f945A;
        if (rVar != null) {
            Q();
            C1256t c1256t = rVar.f995g;
            u uVar = (u) ((LinkedHashMap) c1256t.f10466e).get(this);
            if (uVar != null) {
                uVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c1256t.f10466e;
                u uVar2 = (u) linkedHashMap.get(this);
                if (uVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f994f.add(uVar);
            }
        }
    }

    @Override // E.y
    public final void y0(q.m mVar, long j3, float f3) {
        r rVar = this.f945A;
        if (rVar == null) {
            rVar = C.a(C.b((View) AbstractC0993f.i(this, AndroidCompositionLocals_androidKt.f4942f)));
            this.f945A = rVar;
            f2.j.c(rVar);
        }
        u a3 = rVar.a(this);
        int Q3 = AbstractC0508a.Q(f3);
        long a4 = this.f1015t.a();
        C0080h c0080h = (C0080h) this.f1016u.b();
        a3.b(mVar, this.f1013r, j3, Q3, a4, c0080h.f963d, new A.h(4, this));
        this.f946B = a3;
        AbstractC0993f.m(this);
    }

    @Override // E.y
    public final void z0(t0.G g3) {
        b0.r h3 = g3.f8573d.f5649e.h();
        u uVar = this.f946B;
        if (uVar != null) {
            uVar.e(this.f1019x, this.f1015t.a(), ((C0080h) this.f1016u.b()).f963d);
            uVar.draw(AbstractC0335d.a(h3));
        }
    }
}
