package s0;

import S.n;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import i.C0666a;
import i.C0671f;
import r0.AbstractC1065f;
import s0.ViewOnDragListenerC1154l0;
import w2.C1294c;

/* renamed from: s0.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnDragListenerC1154l0 implements View.OnDragListener, V.a {

    /* renamed from: a, reason: collision with root package name */
    public final V.e f10255a = new V.e();

    /* renamed from: b, reason: collision with root package name */
    public final C0671f f10256b = new C0671f(0);

    /* renamed from: c, reason: collision with root package name */
    public final DragAndDropModifierOnDragListener$modifier$1 f10257c = new r0.T() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return ViewOnDragListenerC1154l0.this.f10255a.hashCode();
        }

        @Override // r0.T
        public final n l() {
            return ViewOnDragListenerC1154l0.this.f10255a;
        }

        @Override // r0.T
        public final /* bridge */ /* synthetic */ void m(n nVar) {
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C1294c c1294c = new C1294c(dragEvent);
        int action = dragEvent.getAction();
        V.e eVar = this.f10255a;
        r0.p0 p0Var = r0.p0.f9828d;
        switch (action) {
            case 1:
                M2.A a4 = new M2.A();
                V.c cVar = new V.c(c1294c, eVar, a4);
                if (cVar.invoke(eVar) == p0Var) {
                    AbstractC1065f.z(eVar, cVar);
                }
                boolean z4 = a4.f3576d;
                C0671f c0671f = this.f10256b;
                c0671f.getClass();
                C0666a c0666a = new C0666a(c0671f);
                while (c0666a.hasNext()) {
                    ((V.e) c0666a.next()).F0(c1294c);
                }
                break;
            case 2:
                eVar.E0(c1294c);
                break;
            case 4:
                V.d dVar = new V.d(1);
                if (dVar.invoke(eVar) == p0Var) {
                    AbstractC1065f.z(eVar, dVar);
                    break;
                }
                break;
            case 5:
                eVar.C0(c1294c);
                break;
            case 6:
                eVar.D0(c1294c);
                break;
        }
        return false;
    }
}
