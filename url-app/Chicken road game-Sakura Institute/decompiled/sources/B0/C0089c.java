package B0;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import kotlin.jvm.functions.Function2;

/* renamed from: B0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0089c f920a = new C0089c();

    /* JADX WARN: Type inference failed for: r0v2, types: [B0.b] */
    public final int[] a(F f4, RectF rectF, int i2, final Function2<? super RectF, ? super RectF, Boolean> function2) {
        SegmentFinder g4;
        int[] rangeForRect;
        if (i2 == 1) {
            g4 = C0.b.f1151a.a(new y.t(f4.f905f.getText(), 3, f4.j()));
        } else {
            AbstractC0087a.m();
            g4 = AbstractC0087a.g(AbstractC0087a.f(f4.f905f.getText(), f4.f900a));
        }
        rangeForRect = f4.f905f.getRangeForRect(rectF, g4, new Layout.TextInclusionStrategy() { // from class: B0.b
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) Function2.this.h(rectF2, rectF3)).booleanValue();
            }
        });
        return rangeForRect;
    }
}
