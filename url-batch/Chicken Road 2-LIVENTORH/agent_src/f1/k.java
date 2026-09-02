package f1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k extends p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f1405a;

    public k(m mVar) {
        this.f1405a = mVar;
    }

    @Override // f1.p0
    public final void b(RecyclerView recyclerView, int i, int i4) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        m mVar = this.f1405a;
        int i5 = mVar.f1420a;
        int computeVerticalScrollRange = mVar.f1436s.computeVerticalScrollRange();
        int i6 = mVar.f1435r;
        mVar.f1437t = computeVerticalScrollRange - i6 > 0 && i6 >= i5;
        int computeHorizontalScrollRange = mVar.f1436s.computeHorizontalScrollRange();
        int i7 = mVar.f1434q;
        boolean z3 = computeHorizontalScrollRange - i7 > 0 && i7 >= i5;
        mVar.f1438u = z3;
        boolean z4 = mVar.f1437t;
        if (!z4 && !z3) {
            if (mVar.f1439v != 0) {
                mVar.f(0);
                return;
            }
            return;
        }
        if (z4) {
            float f2 = i6;
            mVar.f1429l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            mVar.f1428k = Math.min(i6, (i6 * i6) / computeVerticalScrollRange);
        }
        if (mVar.f1438u) {
            float f4 = computeHorizontalScrollOffset;
            float f5 = i7;
            mVar.f1432o = (int) ((((f5 / 2.0f) + f4) * f5) / computeHorizontalScrollRange);
            mVar.f1431n = Math.min(i7, (i7 * i7) / computeHorizontalScrollRange);
        }
        int i8 = mVar.f1439v;
        if (i8 == 0 || i8 == 1) {
            mVar.f(1);
        }
    }
}
