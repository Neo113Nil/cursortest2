package g1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class u extends d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1798a;

    public u(x xVar) {
        this.f1798a = xVar;
    }

    @Override // g1.d1
    public final void b(RecyclerView recyclerView, int i, int i4) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        x xVar = this.f1798a;
        int i5 = xVar.f1820a;
        int computeVerticalScrollRange = xVar.f1835s.computeVerticalScrollRange();
        int i6 = xVar.f1834r;
        xVar.f1836t = computeVerticalScrollRange - i6 > 0 && i6 >= i5;
        int computeHorizontalScrollRange = xVar.f1835s.computeHorizontalScrollRange();
        int i7 = xVar.f1833q;
        boolean z4 = computeHorizontalScrollRange - i7 > 0 && i7 >= i5;
        xVar.f1837u = z4;
        boolean z5 = xVar.f1836t;
        if (!z5 && !z4) {
            if (xVar.f1838v != 0) {
                xVar.f(0);
                return;
            }
            return;
        }
        if (z5) {
            float f5 = i6;
            xVar.f1828l = (int) ((((f5 / 2.0f) + computeVerticalScrollOffset) * f5) / computeVerticalScrollRange);
            xVar.f1827k = Math.min(i6, (i6 * i6) / computeVerticalScrollRange);
        }
        if (xVar.f1837u) {
            float f6 = computeHorizontalScrollOffset;
            float f7 = i7;
            xVar.f1831o = (int) ((((f7 / 2.0f) + f6) * f7) / computeHorizontalScrollRange);
            xVar.f1830n = Math.min(i7, (i7 * i7) / computeHorizontalScrollRange);
        }
        int i8 = xVar.f1838v;
        if (i8 == 0 || i8 == 1) {
            xVar.f(1);
        }
    }
}
