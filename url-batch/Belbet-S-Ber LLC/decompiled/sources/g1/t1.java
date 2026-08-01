package g1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class t1 extends d1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1796a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f1797b;

    public t1(m0 m0Var) {
        this.f1797b = m0Var;
    }

    @Override // g1.d1
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f1796a) {
            this.f1796a = false;
            this.f1797b.f();
        }
    }

    @Override // g1.d1
    public final void b(RecyclerView recyclerView, int i, int i4) {
        if (i == 0 && i4 == 0) {
            return;
        }
        this.f1796a = true;
    }
}
