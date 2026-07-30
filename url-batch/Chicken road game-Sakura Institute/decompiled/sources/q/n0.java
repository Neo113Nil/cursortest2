package q;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f7313a = new n0();

    public static s0.o a() {
        if (1.0f > 0.0d) {
            return new LayoutWeightElement(1.0f, true);
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
    }
}
