package h0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class e0 extends M {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2491a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0143z f2492b;

    public e0(C0143z c0143z) {
        this.f2492b = c0143z;
    }

    @Override // h0.M
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2491a) {
            this.f2491a = false;
            this.f2492b.f();
        }
    }

    @Override // h0.M
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2491a = true;
    }
}
