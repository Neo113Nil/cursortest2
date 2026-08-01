package e0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2191a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0136y f2192b;

    public a0(C0136y c0136y) {
        this.f2192b = c0136y;
    }

    @Override // e0.L
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2191a) {
            this.f2191a = false;
            this.f2192b.f();
        }
    }

    @Override // e0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2191a = true;
    }
}
