package q;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* loaded from: classes.dex */
public final class h0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f9258a = new h0();

    @Override // q.g0
    public final S.o a(S.o oVar, boolean z4) {
        if (1.0f > 0.0d) {
            return oVar.h(new LayoutWeightElement(kotlin.ranges.b.b(1.0f, Float.MAX_VALUE), z4));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
