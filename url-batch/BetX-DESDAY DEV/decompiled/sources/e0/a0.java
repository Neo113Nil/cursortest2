package e0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2195a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0137y f2196b;

    public a0(C0137y c0137y) {
        this.f2196b = c0137y;
    }

    @Override // e0.L
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2195a) {
            this.f2195a = false;
            this.f2196b.f();
        }
    }

    @Override // e0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2195a = true;
    }
}
