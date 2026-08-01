package f0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101j extends L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0103l f2166a;

    public C0101j(C0103l c0103l) {
        this.f2166a = c0103l;
    }

    @Override // f0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0103l c0103l = this.f2166a;
        int computeVerticalScrollRange = c0103l.f2188s.computeVerticalScrollRange();
        int i3 = c0103l.f2187r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0103l.f2173a;
        c0103l.f2189t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0103l.f2188s.computeHorizontalScrollRange();
        int i6 = c0103l.f2186q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0103l.f2190u = z2;
        boolean z3 = c0103l.f2189t;
        if (!z3 && !z2) {
            if (c0103l.f2191v != 0) {
                c0103l.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0103l.f2181l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0103l.f2180k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0103l.f2190u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0103l.f2184o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0103l.f2183n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0103l.f2191v;
        if (i7 == 0 || i7 == 1) {
            c0103l.f(1);
        }
    }
}
