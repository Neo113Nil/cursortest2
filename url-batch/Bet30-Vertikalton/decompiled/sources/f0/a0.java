package f0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2031a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0107y f2032b;

    public a0(C0107y c0107y) {
        this.f2032b = c0107y;
    }

    @Override // f0.L
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2031a) {
            this.f2031a = false;
            this.f2032b.f();
        }
    }

    @Override // f0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2031a = true;
    }
}
