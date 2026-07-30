package defpackage;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import defpackage.n9;
import defpackage.ul1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n9 implements View.OnDragListener, tc0 {
    public final uc0 a;
    public final ii b;
    public final AndroidDragAndDropManager$modifier$1 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public n9() {
        uc0 uc0Var = new uc0();
        uc0Var.C = 0L;
        this.a = uc0Var;
        this.b = new ii(0);
        this.c = new cm1() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return n9.this.a.hashCode();
            }

            @Override // defpackage.cm1
            public final ul1 i() {
                return n9.this.a;
            }

            @Override // defpackage.cm1
            public final /* bridge */ /* synthetic */ void m(ul1 ul1Var) {
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        ar0 ar0Var = new ar0(24, dragEvent);
        int action = dragEvent.getAction();
        ii iiVar = this.b;
        uc0 uc0Var = this.a;
        switch (action) {
            case 1:
                y72 y72Var = new y72();
                lu luVar = new lu(ar0Var, uc0Var, y72Var);
                if (luVar.invoke(uc0Var) == qz2.m) {
                    nk2.p(uc0Var, luVar);
                }
                boolean z = y72Var.m;
                iiVar.getClass();
                di diVar = new di(iiVar);
                while (diVar.hasNext()) {
                    ((uc0) diVar.next()).K0();
                }
                break;
            case 2:
                uc0Var.J0(ar0Var);
                break;
            case 4:
                j6 j6Var = new j6(14, ar0Var);
                if (j6Var.invoke(uc0Var) == qz2.m) {
                    nk2.p(uc0Var, j6Var);
                }
                iiVar.clear();
                break;
            case 5:
                uc0Var.H0();
                break;
            case 6:
                uc0Var.I0();
                break;
        }
        return false;
    }
}
