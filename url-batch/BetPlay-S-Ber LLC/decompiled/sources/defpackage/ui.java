package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ui extends qz {
    public final /* synthetic */ wi a;

    public ui(wi wiVar) {
        this.a = wiVar;
    }

    @Override // defpackage.qz
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        wi wiVar = this.a;
        int i3 = wiVar.a;
        int computeVerticalScrollRange = wiVar.s.computeVerticalScrollRange();
        int i4 = wiVar.r;
        wiVar.t = computeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int computeHorizontalScrollRange = wiVar.s.computeHorizontalScrollRange();
        int i5 = wiVar.q;
        boolean z = computeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        wiVar.u = z;
        boolean z2 = wiVar.t;
        if (!z2 && !z) {
            if (wiVar.v != 0) {
                wiVar.f(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            wiVar.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            wiVar.k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
        }
        if (wiVar.u) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i5;
            wiVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            wiVar.n = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
        }
        int i6 = wiVar.v;
        if (i6 == 0 || i6 == 1) {
            wiVar.f(1);
        }
    }
}
