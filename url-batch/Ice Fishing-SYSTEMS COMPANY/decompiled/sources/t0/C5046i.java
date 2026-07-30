package t0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5046i extends AbstractC5022F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5048k f40712a;

    public C5046i(C5048k c5048k) {
        this.f40712a = c5048k;
    }

    @Override // t0.AbstractC5022F
    public final void b(RecyclerView recyclerView, int i, int i4) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C5048k c5048k = this.f40712a;
        int computeVerticalScrollRange = c5048k.f40736s.computeVerticalScrollRange();
        int i9 = c5048k.f40735r;
        int i10 = computeVerticalScrollRange - i9;
        int i11 = c5048k.f40719a;
        c5048k.f40737t = i10 > 0 && i9 >= i11;
        int computeHorizontalScrollRange = c5048k.f40736s.computeHorizontalScrollRange();
        int i12 = c5048k.f40734q;
        boolean z8 = computeHorizontalScrollRange - i12 > 0 && i12 >= i11;
        c5048k.f40738u = z8;
        boolean z9 = c5048k.f40737t;
        if (!z9 && !z8) {
            if (c5048k.f40739v != 0) {
                c5048k.f(0);
                return;
            }
            return;
        }
        if (z9) {
            float f6 = i9;
            c5048k.f40729l = (int) ((((f6 / 2.0f) + computeVerticalScrollOffset) * f6) / computeVerticalScrollRange);
            c5048k.f40728k = Math.min(i9, (i9 * i9) / computeVerticalScrollRange);
        }
        if (c5048k.f40738u) {
            float f9 = computeHorizontalScrollOffset;
            float f10 = i12;
            c5048k.f40732o = (int) ((((f10 / 2.0f) + f9) * f10) / computeHorizontalScrollRange);
            c5048k.f40731n = Math.min(i12, (i12 * i12) / computeHorizontalScrollRange);
        }
        int i13 = c5048k.f40739v;
        if (i13 == 0 || i13 == 1) {
            c5048k.f(1);
        }
    }
}
