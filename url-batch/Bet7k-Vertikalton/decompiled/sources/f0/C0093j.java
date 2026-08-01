package f0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093j extends L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0095l f2099a;

    public C0093j(C0095l c0095l) {
        this.f2099a = c0095l;
    }

    @Override // f0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0095l c0095l = this.f2099a;
        int computeVerticalScrollRange = c0095l.f2121s.computeVerticalScrollRange();
        int i3 = c0095l.f2120r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0095l.f2106a;
        c0095l.f2122t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0095l.f2121s.computeHorizontalScrollRange();
        int i6 = c0095l.f2119q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0095l.f2123u = z2;
        boolean z3 = c0095l.f2122t;
        if (!z3 && !z2) {
            if (c0095l.f2124v != 0) {
                c0095l.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0095l.f2114l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0095l.f2113k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0095l.f2123u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0095l.f2117o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0095l.f2116n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0095l.f2124v;
        if (i7 == 0 || i7 == 1) {
            c0095l.f(1);
        }
    }
}
