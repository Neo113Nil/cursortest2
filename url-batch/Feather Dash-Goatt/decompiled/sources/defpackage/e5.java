package defpackage;

import android.view.DragEvent;
import android.view.View;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class e5 implements View.OnDragListener, et {
    public final ft a;
    public final t9 b;
    public final d5 c;

    public e5() {
        ft ftVar = new ft();
        ftVar.u = 0L;
        this.a = ftVar;
        this.b = new t9(0);
        this.c = new d5(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        s40 s40Var = new s40(22, dragEvent);
        int action = dragEvent.getAction();
        t9 t9Var = this.b;
        ft ftVar = this.a;
        switch (action) {
            case 1:
                v11 v11Var = new v11();
                a3 a3Var = new a3(s40Var, ftVar, v11Var);
                if (a3Var.invoke(ftVar) == jj1.d) {
                    ka0.J(ftVar, a3Var);
                }
                boolean z = v11Var.d;
                t9Var.getClass();
                o9 o9Var = new o9(t9Var);
                while (o9Var.hasNext()) {
                    ((ft) o9Var.next()).D0();
                }
                break;
            case 2:
                ftVar.C0(s40Var);
                break;
            case 4:
                a3 a3Var2 = new a3(11, s40Var);
                if (a3Var2.invoke(ftVar) == jj1.d) {
                    ka0.J(ftVar, a3Var2);
                }
                t9Var.clear();
                break;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                ftVar.A0();
                break;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                ftVar.B0();
                break;
        }
        return false;
    }
}
