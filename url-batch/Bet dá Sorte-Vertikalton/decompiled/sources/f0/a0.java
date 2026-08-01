package f0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2138a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0110y f2139b;

    public a0(C0110y c0110y) {
        this.f2139b = c0110y;
    }

    @Override // f0.L
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2138a) {
            this.f2138a = false;
            this.f2139b.f();
        }
    }

    @Override // f0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2138a = true;
    }
}
