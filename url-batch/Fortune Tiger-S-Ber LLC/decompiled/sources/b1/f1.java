package b1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f1 extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f780a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f781b;

    public f1(a0 a0Var) {
        this.f781b = a0Var;
    }

    @Override // b1.q0
    public final void a(RecyclerView recyclerView, int i4) {
        if (i4 == 0 && this.f780a) {
            this.f780a = false;
            this.f781b.f();
        }
    }

    @Override // b1.q0
    public final void b(RecyclerView recyclerView, int i4, int i5) {
        if (i4 == 0 && i5 == 0) {
            return;
        }
        this.f780a = true;
    }
}
