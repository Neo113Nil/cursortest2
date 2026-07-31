package u0;

import F.C0047j0;
import U.k;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import h1.C0438i;
import j.C0483a;
import j.C0488f;
import t0.AbstractC0898f;
import u0.ViewOnDragListenerC0971f0;

/* renamed from: u0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnDragListenerC0971f0 implements View.OnDragListener, X.a {

    /* renamed from: a, reason: collision with root package name */
    public final X.d f8325a = new X.d();

    /* renamed from: b, reason: collision with root package name */
    public final C0488f f8326b = new C0488f();

    /* renamed from: c, reason: collision with root package name */
    public final DragAndDropModifierOnDragListener$modifier$1 f8327c = new t0.T() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // t0.T
        public final k h() {
            return ViewOnDragListenerC0971f0.this.f8325a;
        }

        public final int hashCode() {
            return ViewOnDragListenerC0971f0.this.f8325a.hashCode();
        }

        @Override // t0.T
        public final /* bridge */ /* synthetic */ void i(k kVar) {
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        A2.g gVar = new A2.g(13, dragEvent);
        int action = dragEvent.getAction();
        X.d dVar = this.f8325a;
        t0.p0 p0Var = t0.p0.f7942d;
        switch (action) {
            case 1:
                Z1.p pVar = new Z1.p();
                C0047j0 c0047j0 = new C0047j0(gVar, dVar, pVar);
                if (c0047j0.j(dVar) == p0Var) {
                    AbstractC0898f.v(dVar, c0047j0);
                }
                boolean z3 = pVar.f3476d;
                C0488f c0488f = this.f8326b;
                c0488f.getClass();
                C0483a c0483a = new C0483a(c0488f);
                while (c0483a.hasNext()) {
                    ((X.d) c0483a.next()).z0(gVar);
                }
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                dVar.y0(gVar);
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                X.c cVar = new X.c(1);
                if (cVar.j(dVar) == p0Var) {
                    AbstractC0898f.v(dVar, cVar);
                    break;
                }
                break;
            case 5:
                dVar.w0(gVar);
                break;
            case 6:
                dVar.x0(gVar);
                break;
        }
        return false;
    }
}
