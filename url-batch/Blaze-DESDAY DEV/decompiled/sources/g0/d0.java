package g0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class d0 extends M {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2394a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0141z f2395b;

    public d0(C0141z c0141z) {
        this.f2395b = c0141z;
    }

    @Override // g0.M
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2394a) {
            this.f2394a = false;
            this.f2395b.f();
        }
    }

    @Override // g0.M
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2394a = true;
    }
}
