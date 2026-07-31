package r;

import androidx.compose.foundation.layout.LayoutWeightElement;
import e2.AbstractC0381e;

/* renamed from: r.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803O {

    /* renamed from: a, reason: collision with root package name */
    public static final C0803O f7016a = new C0803O();

    public static U.l a(C0803O c0803o, U.l lVar) {
        c0803o.getClass();
        if (1.0f > 0.0d) {
            return lVar.e(new LayoutWeightElement(AbstractC0381e.o(1.0f, Float.MAX_VALUE), true));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
