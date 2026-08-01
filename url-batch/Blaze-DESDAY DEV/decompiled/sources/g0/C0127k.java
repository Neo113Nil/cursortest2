package g0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127k extends M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0129m f2455a;

    public C0127k(C0129m c0129m) {
        this.f2455a = c0129m;
    }

    @Override // g0.M
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0129m c0129m = this.f2455a;
        int computeVerticalScrollRange = c0129m.f2480s.computeVerticalScrollRange();
        int i3 = c0129m.f2479r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0129m.f2465a;
        c0129m.f2481t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0129m.f2480s.computeHorizontalScrollRange();
        int i6 = c0129m.f2478q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0129m.f2482u = z2;
        boolean z3 = c0129m.f2481t;
        if (!z3 && !z2) {
            if (c0129m.f2483v != 0) {
                c0129m.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0129m.f2473l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0129m.f2472k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0129m.f2482u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0129m.f2476o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0129m.f2475n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0129m.f2483v;
        if (i7 == 0 || i7 == 1) {
            c0129m.f(1);
        }
    }
}
