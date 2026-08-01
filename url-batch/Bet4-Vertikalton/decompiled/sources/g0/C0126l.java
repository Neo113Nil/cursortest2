package g0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126l extends O {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0128n f2421a;

    public C0126l(C0128n c0128n) {
        this.f2421a = c0128n;
    }

    @Override // g0.O
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0128n c0128n = this.f2421a;
        int computeVerticalScrollRange = c0128n.f2450s.computeVerticalScrollRange();
        int i3 = c0128n.f2449r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0128n.f2435a;
        c0128n.f2451t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0128n.f2450s.computeHorizontalScrollRange();
        int i6 = c0128n.f2448q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0128n.f2452u = z2;
        boolean z3 = c0128n.f2451t;
        if (!z3 && !z2) {
            if (c0128n.f2453v != 0) {
                c0128n.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0128n.f2443l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0128n.f2442k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0128n.f2452u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0128n.f2446o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0128n.f2445n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0128n.f2453v;
        if (i7 == 0 || i7 == 1) {
            c0128n.f(1);
        }
    }
}
