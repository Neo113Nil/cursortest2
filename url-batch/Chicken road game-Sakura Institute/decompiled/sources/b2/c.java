package b2;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1261a = new c();

    /* JADX WARN: Type inference failed for: r0v2, types: [b2.b] */
    public final int[] a(d0 d0Var, RectF rectF, int i7, final q6.e eVar) {
        SegmentFinder f9;
        int[] rangeForRect;
        if (i7 == 1) {
            f9 = c2.b.f1630a.a(new androidx.room.c(d0Var.f1267e.getText(), 3, d0Var.j()));
        } else {
            a.m();
            f9 = a.f(a.e(d0Var.f1267e.getText(), d0Var.f1263a));
        }
        rangeForRect = d0Var.f1267e.getRangeForRect(rectF, f9, new Layout.TextInclusionStrategy() { // from class: b2.b
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) q6.e.this.d(rectF2, rectF3)).booleanValue();
            }
        });
        return rangeForRect;
    }
}
