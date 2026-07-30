package defpackage;

import android.os.Build;
import android.view.View;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ba implements ym0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ba(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.ym0
    public final Object d(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                t21 t21Var = (t21) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    le.a.a(t21Var.y(), (View) t21Var.n);
                }
                break;
            case 1:
                a41 a41Var = (a41) obj;
                fn2 fn2Var = (fn2) obj2;
                if (a41Var instanceof cy0) {
                    fn2Var.add(a41Var);
                } else if (a41Var instanceof dy0) {
                    fn2Var.remove(((dy0) a41Var).a);
                } else if (a41Var instanceof jo0) {
                    fn2Var.add(a41Var);
                } else if (a41Var instanceof ko0) {
                    fn2Var.remove(((ko0) a41Var).a);
                } else if (a41Var instanceof u42) {
                    fn2Var.add(a41Var);
                } else if (a41Var instanceof v42) {
                    fn2Var.remove(((v42) a41Var).a);
                } else if (a41Var instanceof t42) {
                    fn2Var.remove(((t42) a41Var).a);
                }
                break;
            case 2:
                i70 i70Var = (i70) obj2;
                if (!(i70Var.t.b() instanceof zl0)) {
                    Object e = i70.e(i70Var, true, o30Var);
                    if (e != b50.m) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                ((gm1) obj2).m.i(((Number) obj).floatValue());
                break;
        }
        return Unit.a;
    }
}
