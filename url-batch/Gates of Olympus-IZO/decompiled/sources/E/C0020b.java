package E;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0272e;
import b0.InterfaceC0285r;
import java.util.LinkedHashMap;
import t0.AbstractC0898f;

/* renamed from: E.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020b extends z implements t {

    /* renamed from: A, reason: collision with root package name */
    public s f643A;
    public v B;

    @Override // E.t
    public final void N() {
        this.B = null;
        AbstractC0898f.m(this);
    }

    @Override // U.k
    public final void o0() {
        s sVar = this.f643A;
        if (sVar != null) {
            N();
            C2.c cVar = sVar.f695g;
            v vVar = (v) ((LinkedHashMap) cVar.f484e).get(this);
            if (vVar != null) {
                vVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f484e;
                v vVar2 = (v) linkedHashMap.get(this);
                if (vVar2 != null) {
                }
                linkedHashMap.remove(this);
                sVar.f694f.add(vVar);
            }
        }
    }

    @Override // E.z
    public final void v0(q.l lVar, long j3, float f3) {
        s sVar = this.f643A;
        if (sVar == null) {
            sVar = D.a(D.b((View) AbstractC0898f.i(this, AndroidCompositionLocals_androidKt.f3742f)));
            this.f643A = sVar;
            Z1.i.c(sVar);
        }
        v a3 = sVar.a(this);
        int M3 = M1.B.M(f3);
        long o3 = this.f715t.o();
        C0027i c0027i = (C0027i) this.f716u.b();
        a3.b(lVar, this.f713r, j3, M3, o3, c0027i.f663d, new A2.l(3, this));
        this.B = a3;
        AbstractC0898f.m(this);
    }

    @Override // E.z
    public final void w0(t0.F f3) {
        InterfaceC0285r h3 = f3.f7748d.f4444e.h();
        v vVar = this.B;
        if (vVar != null) {
            vVar.e(this.f719x, this.f715t.o(), ((C0027i) this.f716u.b()).f663d);
            vVar.draw(AbstractC0272e.a(h3));
        }
    }

    @Override // E.z
    public final void y0(q.l lVar) {
        v vVar = this.B;
        if (vVar != null) {
            vVar.d();
        }
    }
}
