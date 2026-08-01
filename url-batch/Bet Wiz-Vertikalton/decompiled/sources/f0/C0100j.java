package f0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100j extends L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0102l f2233a;

    public C0100j(C0102l c0102l) {
        this.f2233a = c0102l;
    }

    @Override // f0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0102l c0102l = this.f2233a;
        int computeVerticalScrollRange = c0102l.f2255s.computeVerticalScrollRange();
        int i3 = c0102l.f2254r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0102l.f2240a;
        c0102l.f2256t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0102l.f2255s.computeHorizontalScrollRange();
        int i6 = c0102l.f2253q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0102l.f2257u = z2;
        boolean z3 = c0102l.f2256t;
        if (!z3 && !z2) {
            if (c0102l.f2258v != 0) {
                c0102l.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0102l.f2248l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0102l.f2247k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0102l.f2257u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0102l.f2251o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0102l.f2250n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0102l.f2258v;
        if (i7 == 0 || i7 == 1) {
            c0102l.f(1);
        }
    }
}
