package h0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: h0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159i extends AbstractC0144J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0161k f3046a;

    public C0159i(C0161k c0161k) {
        this.f3046a = c0161k;
    }

    @Override // h0.AbstractC0144J
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0161k c0161k = this.f3046a;
        int computeVerticalScrollRange = c0161k.f3068s.computeVerticalScrollRange();
        int i3 = c0161k.f3067r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0161k.f3053a;
        c0161k.f3069t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0161k.f3068s.computeHorizontalScrollRange();
        int i6 = c0161k.f3066q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0161k.f3070u = z2;
        boolean z3 = c0161k.f3069t;
        if (!z3 && !z2) {
            if (c0161k.f3071v != 0) {
                c0161k.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0161k.f3061l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0161k.f3060k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0161k.f3070u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0161k.f3064o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0161k.f3063n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0161k.f3071v;
        if (i7 == 0 || i7 == 1) {
            c0161k.f(1);
        }
    }
}
