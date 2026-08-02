package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jq extends kt {
    final /* synthetic */ js a;

    public jq(js jsVar) {
        this.a = jsVar;
    }

    @Override // defpackage.kt
    public final void L(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        js jsVar = this.a;
        int computeVerticalScrollRange = jsVar.l.computeVerticalScrollRange();
        int i3 = jsVar.k;
        jsVar.m = computeVerticalScrollRange - i3 > 0 && i3 >= jsVar.a;
        int computeHorizontalScrollRange = jsVar.l.computeHorizontalScrollRange();
        int i4 = jsVar.j;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= jsVar.a;
        jsVar.n = z;
        if (jsVar.m) {
            float f = i3;
            jsVar.e = (int) ((f * (computeVerticalScrollOffset + (f / 2.0f))) / computeVerticalScrollRange);
            jsVar.d = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        } else if (!z) {
            if (jsVar.o != 0) {
                jsVar.f(0);
                return;
            }
            return;
        }
        if (jsVar.n) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i4;
            jsVar.h = (int) ((f3 * (f2 + (f3 / 2.0f))) / computeHorizontalScrollRange);
            jsVar.g = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = jsVar.o;
        if (i5 == 0 || i5 == 1) {
            jsVar.f(1);
        }
    }
}
