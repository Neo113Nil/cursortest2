package f0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104j extends K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0106l f2282a;

    public C0104j(C0106l c0106l) {
        this.f2282a = c0106l;
    }

    @Override // f0.K
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0106l c0106l = this.f2282a;
        int computeVerticalScrollRange = c0106l.f2304s.computeVerticalScrollRange();
        int i3 = c0106l.f2303r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0106l.f2289a;
        c0106l.f2305t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0106l.f2304s.computeHorizontalScrollRange();
        int i6 = c0106l.f2302q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0106l.f2306u = z2;
        boolean z3 = c0106l.f2305t;
        if (!z3 && !z2) {
            if (c0106l.f2307v != 0) {
                c0106l.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0106l.f2297l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0106l.f2296k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0106l.f2306u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0106l.f2300o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0106l.f2299n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0106l.f2307v;
        if (i7 == 0 || i7 == 1) {
            c0106l.f(1);
        }
    }
}
