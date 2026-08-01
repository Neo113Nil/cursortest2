package h0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class b0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2457a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0137y f2458b;

    public b0(C0137y c0137y) {
        this.f2458b = c0137y;
    }

    @Override // h0.L
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2457a) {
            this.f2457a = false;
            this.f2458b.f();
        }
    }

    @Override // h0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2457a = true;
    }
}
