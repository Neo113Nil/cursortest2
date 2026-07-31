package u0;

import U.p;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import j.C0527a;
import j.C0532f;
import t0.AbstractC0993f;
import u0.ViewOnDragListenerC1111l0;

/* renamed from: u0.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnDragListenerC1111l0 implements View.OnDragListener, X.a {

    /* renamed from: a, reason: collision with root package name */
    public final X.e f9395a = new X.e();

    /* renamed from: b, reason: collision with root package name */
    public final C0532f f9396b = new C0532f();

    /* renamed from: c, reason: collision with root package name */
    public final DragAndDropModifierOnDragListener$modifier$1 f9397c = new t0.U() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return ViewOnDragListenerC1111l0.this.f9395a.hashCode();
        }

        @Override // t0.U
        public final p l() {
            return ViewOnDragListenerC1111l0.this.f9395a;
        }

        @Override // t0.U
        public final /* bridge */ /* synthetic */ void m(p pVar) {
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        B.Y y3 = new B.Y(dragEvent);
        int action = dragEvent.getAction();
        X.e eVar = this.f9395a;
        t0.q0 q0Var = t0.q0.f8779d;
        switch (action) {
            case 1:
                f2.q qVar = new f2.q();
                X.c cVar = new X.c(y3, eVar, qVar);
                if (cVar.n(eVar) == q0Var) {
                    AbstractC0993f.x(eVar, cVar);
                }
                boolean z3 = qVar.f5828d;
                C0532f c0532f = this.f9396b;
                c0532f.getClass();
                C0527a c0527a = new C0527a(c0532f);
                while (c0527a.hasNext()) {
                    ((X.e) c0527a.next()).C0(y3);
                }
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                eVar.B0(y3);
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                X.d dVar = new X.d(1);
                if (dVar.n(eVar) == q0Var) {
                    AbstractC0993f.x(eVar, dVar);
                    break;
                }
                break;
            case 5:
                eVar.z0(y3);
                break;
            case 6:
                eVar.A0(y3);
                break;
        }
        return false;
    }
}
