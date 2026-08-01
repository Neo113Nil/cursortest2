package g0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class f0 extends O {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2368a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0109A f2369b;

    public f0(C0109A c0109a) {
        this.f2369b = c0109a;
    }

    @Override // g0.O
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2368a) {
            this.f2368a = false;
            this.f2369b.f();
        }
    }

    @Override // g0.O
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2368a = true;
    }
}
