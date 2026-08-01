package b1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f829a;

    public k(n nVar) {
        this.f829a = nVar;
    }

    @Override // b1.q0
    public final void b(RecyclerView recyclerView, int i4, int i5) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        n nVar = this.f829a;
        int i6 = nVar.f851a;
        int computeVerticalScrollRange = nVar.f866s.computeVerticalScrollRange();
        int i7 = nVar.f865r;
        nVar.f867t = computeVerticalScrollRange - i7 > 0 && i7 >= i6;
        int computeHorizontalScrollRange = nVar.f866s.computeHorizontalScrollRange();
        int i8 = nVar.f864q;
        boolean z3 = computeHorizontalScrollRange - i8 > 0 && i8 >= i6;
        nVar.f868u = z3;
        boolean z4 = nVar.f867t;
        if (!z4 && !z3) {
            if (nVar.f869v != 0) {
                nVar.f(0);
                return;
            }
            return;
        }
        if (z4) {
            float f4 = i7;
            nVar.f859l = (int) ((((f4 / 2.0f) + computeVerticalScrollOffset) * f4) / computeVerticalScrollRange);
            nVar.f858k = Math.min(i7, (i7 * i7) / computeVerticalScrollRange);
        }
        if (nVar.f868u) {
            float f5 = computeHorizontalScrollOffset;
            float f6 = i8;
            nVar.f862o = (int) ((((f6 / 2.0f) + f5) * f6) / computeHorizontalScrollRange);
            nVar.f861n = Math.min(i8, (i8 * i8) / computeHorizontalScrollRange);
        }
        int i9 = nVar.f869v;
        if (i9 == 0 || i9 == 1) {
            nVar.f(1);
        }
    }
}
