package q;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* renamed from: q.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1010N implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1010N f9200a = new C1010N();

    @Override // q.g0
    public final S.o a(S.o oVar, boolean z4) {
        if (1.0f > 0.0d) {
            return oVar.h(new LayoutWeightElement(kotlin.ranges.b.b(1.0f, Float.MAX_VALUE), z4));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
