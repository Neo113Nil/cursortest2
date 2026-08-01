package f0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2163a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0114y f2164b;

    public a0(C0114y c0114y) {
        this.f2164b = c0114y;
    }

    @Override // f0.L
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2163a) {
            this.f2163a = false;
            this.f2164b.f();
        }
    }

    @Override // f0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2163a = true;
    }
}
