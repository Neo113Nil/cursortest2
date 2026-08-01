package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ee0 extends l80 {
    public boolean a = false;
    public final /* synthetic */ j50 b;

    public ee0(j50 j50Var) {
        this.b = j50Var;
    }

    @Override // defpackage.l80
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }

    @Override // defpackage.l80
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
