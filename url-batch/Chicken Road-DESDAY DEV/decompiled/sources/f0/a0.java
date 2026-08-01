package f0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2096a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0115y f2097b;

    public a0(C0115y c0115y) {
        this.f2097b = c0115y;
    }

    @Override // f0.L
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2096a) {
            this.f2096a = false;
            this.f2097b.f();
        }
    }

    @Override // f0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2096a = true;
    }
}
