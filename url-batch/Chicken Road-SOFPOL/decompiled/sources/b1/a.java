package b1;

import a4.i;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import b1.a;
import q6.o;
import w1.w1;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a implements View.OnDragListener, c {

    /* renamed from: a, reason: collision with root package name */
    public final g f1046a;

    /* renamed from: b, reason: collision with root package name */
    public final o.f f1047b;

    /* renamed from: c, reason: collision with root package name */
    public final AndroidDragAndDropManager$modifier$1 f1048c;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public a() {
        g gVar = new g();
        gVar.f1060t = 0L;
        this.f1046a = gVar;
        this.f1047b = new o.f();
        this.f1048c = new x0() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // w1.x0
            public final l f() {
                return a.this.f1046a;
            }

            @Override // w1.x0
            public final /* bridge */ /* synthetic */ void g(l lVar) {
            }

            public final int hashCode() {
                return a.this.f1046a.hashCode();
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        b bVar = new b(0, dragEvent);
        int action = dragEvent.getAction();
        w1 w1Var = w1.f7817d;
        o.f fVar = this.f1047b;
        g gVar = this.f1046a;
        switch (action) {
            case 1:
                o oVar = new o();
                e eVar = new e(bVar, gVar, oVar);
                if (eVar.i(gVar) == w1Var) {
                    w1.f.y(gVar, eVar);
                }
                boolean z3 = oVar.f6201d;
                fVar.getClass();
                o.a aVar = new o.a(fVar);
                while (aVar.hasNext()) {
                    ((g) aVar.next()).v0(bVar);
                }
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                gVar.u0(bVar);
                break;
            case i.LONG_FIELD_NUMBER /* 4 */:
                e eVar2 = new e(1, bVar);
                if (eVar2.i(gVar) == w1Var) {
                    w1.f.y(gVar, eVar2);
                }
                fVar.clear();
                break;
            case 5:
                gVar.s0(bVar);
                break;
            case 6:
                gVar.t0(bVar);
                break;
        }
        return false;
    }
}
