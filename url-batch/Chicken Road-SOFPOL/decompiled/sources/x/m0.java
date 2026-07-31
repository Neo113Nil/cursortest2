package x;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f8248a = new m0();

    public static y0.m a(m0 m0Var, y0.m mVar) {
        m0Var.getClass();
        if (1.0f <= 0.0d) {
            y.a.a("invalid weight; must be greater than zero");
        }
        return mVar.d(new LayoutWeightElement(1.0f, true));
    }
}
