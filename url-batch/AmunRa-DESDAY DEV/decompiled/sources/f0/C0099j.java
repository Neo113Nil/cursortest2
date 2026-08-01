package f0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099j extends L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0101l f2165a;

    public C0099j(C0101l c0101l) {
        this.f2165a = c0101l;
    }

    @Override // f0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0101l c0101l = this.f2165a;
        int computeVerticalScrollRange = c0101l.f2187s.computeVerticalScrollRange();
        int i3 = c0101l.f2186r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0101l.f2172a;
        c0101l.f2188t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0101l.f2187s.computeHorizontalScrollRange();
        int i6 = c0101l.f2185q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0101l.f2189u = z2;
        boolean z3 = c0101l.f2188t;
        if (!z3 && !z2) {
            if (c0101l.f2190v != 0) {
                c0101l.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0101l.f2180l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0101l.f2179k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0101l.f2189u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0101l.f2183o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0101l.f2182n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0101l.f2190v;
        if (i7 == 0 || i7 == 1) {
            c0101l.f(1);
        }
    }
}
