package g0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146j extends K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0148l f2869a;

    public C0146j(C0148l c0148l) {
        this.f2869a = c0148l;
    }

    @Override // g0.K
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0148l c0148l = this.f2869a;
        int computeVerticalScrollRange = c0148l.f2891s.computeVerticalScrollRange();
        int i3 = c0148l.f2890r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0148l.f2876a;
        c0148l.f2892t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0148l.f2891s.computeHorizontalScrollRange();
        int i6 = c0148l.f2889q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0148l.f2893u = z2;
        boolean z3 = c0148l.f2892t;
        if (!z3 && !z2) {
            if (c0148l.f2894v != 0) {
                c0148l.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0148l.f2884l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0148l.f2883k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0148l.f2893u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0148l.f2887o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0148l.f2886n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0148l.f2894v;
        if (i7 == 0 || i7 == 1) {
            c0148l.f(1);
        }
    }
}
