package f0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096j extends L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0098l f2208a;

    public C0096j(C0098l c0098l) {
        this.f2208a = c0098l;
    }

    @Override // f0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0098l c0098l = this.f2208a;
        int computeVerticalScrollRange = c0098l.f2230s.computeVerticalScrollRange();
        int i3 = c0098l.f2229r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0098l.f2215a;
        c0098l.f2231t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0098l.f2230s.computeHorizontalScrollRange();
        int i6 = c0098l.f2228q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0098l.f2232u = z2;
        boolean z3 = c0098l.f2231t;
        if (!z3 && !z2) {
            if (c0098l.f2233v != 0) {
                c0098l.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0098l.f2223l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0098l.f2222k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0098l.f2232u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0098l.f2226o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0098l.f2225n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0098l.f2233v;
        if (i7 == 0 || i7 == 1) {
            c0098l.f(1);
        }
    }
}
