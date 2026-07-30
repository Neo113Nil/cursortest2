package s1;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import s0.n;
import s1.k1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k1 implements View.OnDragListener, v0.a {

    /* renamed from: a, reason: collision with root package name */
    public final v0.c f8272a = new v0.c();

    /* renamed from: b, reason: collision with root package name */
    public final i.f f8273b = new i.f(0);

    /* renamed from: c, reason: collision with root package name */
    public final DragAndDropModifierOnDragListener$modifier$1 f8274c = new r1.s0() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return k1.this.f8272a.hashCode();
        }

        @Override // r1.s0
        public final n l() {
            return k1.this.f8272a;
        }

        @Override // r1.s0
        public final /* bridge */ /* synthetic */ void m(n nVar) {
        }
    };

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        l1.x xVar = new l1.x(14, dragEvent);
        int action = dragEvent.getAction();
        r1.p1 p1Var = r1.p1.f7876f;
        v0.c cVar = this.f8272a;
        switch (action) {
            case 1:
                r6.r rVar = new r6.r();
                l1.n nVar = new l1.n(xVar, cVar, rVar);
                if (nVar.f(cVar) == p1Var) {
                    r1.f.x(cVar, nVar);
                }
                boolean z8 = rVar.f7964f;
                i.f fVar = this.f8273b;
                fVar.getClass();
                i.a aVar = new i.a(fVar);
                while (aVar.hasNext()) {
                    ((v0.c) aVar.next()).E0(xVar);
                }
                return z8;
            case 2:
                cVar.D0(xVar);
                return false;
            case 3:
                return cVar.A0(xVar);
            case 4:
                l1.o oVar = new l1.o(1, xVar);
                if (oVar.f(cVar) == p1Var) {
                    r1.f.x(cVar, oVar);
                    return false;
                }
                return false;
            case 5:
                cVar.B0(xVar);
                return false;
            case 6:
                cVar.C0(xVar);
                return false;
            default:
                return false;
        }
    }
}
