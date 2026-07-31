package r;

import androidx.compose.foundation.layout.LayoutWeightElement;
import e2.AbstractC0381e;

/* renamed from: r.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0824v {

    /* renamed from: a, reason: collision with root package name */
    public static final C0824v f7101a = new C0824v();

    public static U.l a(U.l lVar) {
        if (1.0f > 0.0d) {
            return lVar.e(new LayoutWeightElement(AbstractC0381e.o(1.0f, Float.MAX_VALUE), true));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
