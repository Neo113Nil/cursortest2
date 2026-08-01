package h0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: h0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129k extends M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0131m f2546a;

    public C0129k(C0131m c0131m) {
        this.f2546a = c0131m;
    }

    @Override // h0.M
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0131m c0131m = this.f2546a;
        int computeVerticalScrollRange = c0131m.f2576s.computeVerticalScrollRange();
        int i3 = c0131m.f2575r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0131m.f2560a;
        c0131m.f2577t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0131m.f2576s.computeHorizontalScrollRange();
        int i6 = c0131m.f2574q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0131m.f2578u = z2;
        boolean z3 = c0131m.f2577t;
        if (!z3 && !z2) {
            if (c0131m.f2579v != 0) {
                c0131m.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0131m.f2569l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0131m.f2568k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0131m.f2578u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0131m.f2572o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0131m.f2571n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0131m.f2579v;
        if (i7 == 0 || i7 == 1) {
            c0131m.f(1);
        }
    }
}
