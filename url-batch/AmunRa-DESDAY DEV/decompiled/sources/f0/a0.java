package f0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2095a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0113y f2096b;

    public a0(C0113y c0113y) {
        this.f2096b = c0113y;
    }

    @Override // f0.L
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2095a) {
            this.f2095a = false;
            this.f2096b.f();
        }
    }

    @Override // f0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2095a = true;
    }
}
