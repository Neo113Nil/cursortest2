package C;

import Z.AbstractC0307d;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import p.C0937m;
import r0.AbstractC1065f;

/* renamed from: C.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107b extends y implements s {

    /* renamed from: D, reason: collision with root package name */
    public r f1074D;

    /* renamed from: E, reason: collision with root package name */
    public u f1075E;

    @Override // C.y
    public final void B0(C0937m c0937m, long j4, float f4) {
        r rVar = this.f1074D;
        if (rVar == null) {
            rVar = C.a(C.b((View) AbstractC1065f.i(this, AndroidCompositionLocals_androidKt.f5217f)));
            this.f1074D = rVar;
            Intrinsics.c(rVar);
        }
        u a4 = rVar.a(this);
        int a5 = O2.c.a(f4);
        long a6 = this.f1146w.a();
        C0113h c0113h = (C0113h) this.f1147x.invoke();
        a4.b(c0937m, this.f1144u, j4, a5, a6, c0113h.f1092d, new A3.e(2, this));
        this.f1075E = a4;
        AbstractC1065f.n(this);
    }

    @Override // C.y
    public final void C0(r0.G g4) {
        Z.r k4 = g4.f9624d.f5603e.k();
        u uVar = this.f1075E;
        if (uVar != null) {
            uVar.e(this.f1141A, this.f1146w.a(), ((C0113h) this.f1147x.invoke()).f1092d);
            uVar.draw(AbstractC0307d.a(k4));
        }
    }

    @Override // C.y
    public final void E0(C0937m c0937m) {
        u uVar = this.f1075E;
        if (uVar != null) {
            uVar.d();
        }
    }

    @Override // C.s
    public final void W() {
        this.f1075E = null;
        AbstractC1065f.n(this);
    }

    @Override // S.n
    public final void u0() {
        r rVar = this.f1074D;
        if (rVar != null) {
            W();
            y.t tVar = rVar.f1124j;
            u uVar = (u) ((LinkedHashMap) tVar.f11494e).get(this);
            if (uVar != null) {
                uVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) tVar.f11494e;
                u uVar2 = (u) linkedHashMap.get(this);
                if (uVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f1123i.add(uVar);
            }
        }
    }
}
