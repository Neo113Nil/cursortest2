package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lu extends kt {
    boolean a = false;
    final /* synthetic */ lb b;

    public lu(lb lbVar) {
        this.b = lbVar;
    }

    @Override // defpackage.kt
    public final void L(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }

    @Override // defpackage.kt
    public final void z(int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }
}
