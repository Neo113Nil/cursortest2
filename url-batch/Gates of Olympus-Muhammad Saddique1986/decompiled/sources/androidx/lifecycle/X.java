package androidx.lifecycle;

import a.AbstractC0235a;
import q1.C0812b;

/* loaded from: classes.dex */
public interface X {
    default V a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default V b(Class cls, C0812b c0812b) {
        return a(cls);
    }

    default V c(f2.d dVar, C0812b c0812b) {
        return b(AbstractC0235a.y(dVar), c0812b);
    }
}
