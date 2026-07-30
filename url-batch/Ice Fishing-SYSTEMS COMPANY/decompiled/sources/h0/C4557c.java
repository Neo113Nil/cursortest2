package h0;

import androidx.lifecycle.N;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import kotlin.jvm.internal.h;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4557c implements V {

    /* renamed from: a, reason: collision with root package name */
    public final C4559e[] f38144a;

    public C4557c(C4559e... initializers) {
        h.e(initializers, "initializers");
        this.f38144a = initializers;
    }

    @Override // androidx.lifecycle.V
    public final S b(Class cls, C4558d c4558d) {
        N n9 = null;
        for (C4559e c4559e : this.f38144a) {
            if (c4559e.f38145a.equals(cls)) {
                n9 = new N();
            }
        }
        if (n9 != null) {
            return n9;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
