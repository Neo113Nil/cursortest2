package q;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* renamed from: q.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042u {

    /* renamed from: a, reason: collision with root package name */
    public static final C1042u f9344a = new C1042u();

    public final S.o a(boolean z4) {
        if (1.0f > 0.0d) {
            return new LayoutWeightElement(kotlin.ranges.b.b(1.0f, Float.MAX_VALUE), z4);
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
