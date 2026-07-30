package defpackage;

import com.majelw.libystne.R;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l4 implements bc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bc0
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                h4 h4Var = ((c4) obj).a;
                if (h4Var != null) {
                    h4Var.c();
                    break;
                } else {
                    lh.g("Launcher has not been initialized");
                    break;
                }
            case 1:
                ((fc0) obj).n.invoke();
                break;
            case 2:
                eb0 eb0Var = (eb0) obj;
                eb0Var.dismiss();
                ya0 ya0Var = eb0Var.t;
                g93 g93Var = ya0Var.o;
                if (g93Var != null) {
                    g93Var.a();
                }
                ya0Var.o = null;
                ya0Var.requestLayout();
                break;
            case 3:
                m32 m32Var = (m32) obj;
                g93 g93Var2 = m32Var.o;
                if (g93Var2 != null) {
                    g93Var2.a();
                }
                m32Var.o = null;
                m32Var.requestLayout();
                m32Var.setTag(R.id.view_tree_lifecycle_owner, null);
                m32Var.z.removeViewImmediate(m32Var);
                break;
            case 4:
                ((gv2) obj).k();
                break;
            case 5:
                ((jb1) obj).d = null;
                break;
            case 6:
                ((xb1) obj).c = null;
                break;
            default:
                tb1 tb1Var = (tb1) obj;
                int h = tb1Var.d.h();
                for (int i2 = 0; i2 < h; i2++) {
                    tb1Var.b();
                }
                break;
        }
    }
}
