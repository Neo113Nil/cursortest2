package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class jo extends l80 {
    public final /* synthetic */ ko a;

    public jo(ko koVar) {
        this.a = koVar;
    }

    @Override // defpackage.l80
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        ko koVar = this.a;
        int i3 = koVar.a;
        int computeVerticalScrollRange = koVar.s.computeVerticalScrollRange();
        int i4 = koVar.r;
        koVar.t = computeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int computeHorizontalScrollRange = koVar.s.computeHorizontalScrollRange();
        int i5 = koVar.q;
        boolean z = computeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        koVar.u = z;
        boolean z2 = koVar.t;
        if (!z2 && !z) {
            if (koVar.v != 0) {
                koVar.j(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            koVar.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            koVar.k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
        }
        if (koVar.u) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i5;
            koVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            koVar.n = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
        }
        int i6 = koVar.v;
        if (i6 == 0 || i6 == 1) {
            koVar.j(1);
        }
    }
}
