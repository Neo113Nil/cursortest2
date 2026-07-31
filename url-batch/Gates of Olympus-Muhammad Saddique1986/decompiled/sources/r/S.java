package r;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public static final S f7990a = new S();

    public static U.q a(S s3, U.q qVar) {
        s3.getClass();
        if (1.0f > 0.0d) {
            return qVar.i(new LayoutWeightElement(O2.d.v(1.0f, Float.MAX_VALUE), true));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
    }
}
