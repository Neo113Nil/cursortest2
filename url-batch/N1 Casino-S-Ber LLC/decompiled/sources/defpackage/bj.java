package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class bj extends bz {
    public final /* synthetic */ cj a;

    public bj(cj cjVar) {
        this.a = cjVar;
    }

    @Override // defpackage.bz
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        cj cjVar = this.a;
        int i3 = cjVar.a;
        int computeVerticalScrollRange = cjVar.s.computeVerticalScrollRange();
        int i4 = cjVar.r;
        cjVar.t = computeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int computeHorizontalScrollRange = cjVar.s.computeHorizontalScrollRange();
        int i5 = cjVar.q;
        boolean z = computeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        cjVar.u = z;
        boolean z2 = cjVar.t;
        if (!z2 && !z) {
            if (cjVar.v != 0) {
                cjVar.j(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            cjVar.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            cjVar.k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
        }
        if (cjVar.u) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i5;
            cjVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            cjVar.n = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
        }
        int i6 = cjVar.v;
        if (i6 == 0 || i6 == 1) {
            cjVar.j(1);
        }
    }
}
