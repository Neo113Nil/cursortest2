package D0;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import e2.InterfaceC0426e;
import z.C1256t;

/* renamed from: D0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0065c f842a = new C0065c();

    /* JADX WARN: Type inference failed for: r0v2, types: [D0.b] */
    public final int[] a(G g3, RectF rectF, int i3, final InterfaceC0426e interfaceC0426e) {
        SegmentFinder f3;
        int[] rangeForRect;
        if (i3 == 1) {
            f3 = E0.b.f1023a.a(new C1256t(g3.f827f.getText(), 2, g3.j()));
        } else {
            AbstractC0063a.m();
            f3 = AbstractC0063a.f(AbstractC0063a.e(g3.f827f.getText(), g3.f822a));
        }
        rangeForRect = g3.f827f.getRangeForRect(rectF, f3, new Layout.TextInclusionStrategy() { // from class: D0.b
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) InterfaceC0426e.this.h(rectF2, rectF3)).booleanValue();
            }
        });
        return rangeForRect;
    }
}
