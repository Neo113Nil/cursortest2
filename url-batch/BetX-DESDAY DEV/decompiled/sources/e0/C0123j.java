package e0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123j extends L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0125l f2276a;

    public C0123j(C0125l c0125l) {
        this.f2276a = c0125l;
    }

    @Override // e0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0125l c0125l = this.f2276a;
        int computeVerticalScrollRange = c0125l.f2299s.computeVerticalScrollRange();
        int i3 = c0125l.f2298r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0125l.f2283a;
        c0125l.f2300t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0125l.f2299s.computeHorizontalScrollRange();
        int i6 = c0125l.f2297q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0125l.f2301u = z2;
        boolean z3 = c0125l.f2300t;
        if (!z3 && !z2) {
            if (c0125l.f2302v != 0) {
                c0125l.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0125l.f2292l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0125l.f2291k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0125l.f2301u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0125l.f2295o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0125l.f2294n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0125l.f2302v;
        if (i7 == 0 || i7 == 1) {
            c0125l.f(1);
        }
    }
}
