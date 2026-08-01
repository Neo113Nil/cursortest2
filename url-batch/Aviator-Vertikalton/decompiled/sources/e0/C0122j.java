package e0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122j extends L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0124l f2272a;

    public C0122j(C0124l c0124l) {
        this.f2272a = c0124l;
    }

    @Override // e0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0124l c0124l = this.f2272a;
        int computeVerticalScrollRange = c0124l.f2295s.computeVerticalScrollRange();
        int i3 = c0124l.f2294r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0124l.f2279a;
        c0124l.f2296t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0124l.f2295s.computeHorizontalScrollRange();
        int i6 = c0124l.f2293q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0124l.f2297u = z2;
        boolean z3 = c0124l.f2296t;
        if (!z3 && !z2) {
            if (c0124l.f2298v != 0) {
                c0124l.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0124l.f2288l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0124l.f2287k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0124l.f2297u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0124l.f2291o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0124l.f2290n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0124l.f2298v;
        if (i7 == 0 || i7 == 1) {
            c0124l.f(1);
        }
    }
}
