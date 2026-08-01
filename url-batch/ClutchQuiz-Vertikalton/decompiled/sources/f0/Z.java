package f0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class Z extends K {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2210a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0117x f2211b;

    public Z(C0117x c0117x) {
        this.f2211b = c0117x;
    }

    @Override // f0.K
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2210a) {
            this.f2210a = false;
            this.f2211b.f();
        }
    }

    @Override // f0.K
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2210a = true;
    }
}
