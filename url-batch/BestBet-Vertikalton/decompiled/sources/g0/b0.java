package g0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class b0 extends K {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2802a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0159x f2803b;

    public b0(C0159x c0159x) {
        this.f2803b = c0159x;
    }

    @Override // g0.K
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2802a) {
            this.f2802a = false;
            this.f2803b.f();
        }
    }

    @Override // g0.K
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2802a = true;
    }
}
