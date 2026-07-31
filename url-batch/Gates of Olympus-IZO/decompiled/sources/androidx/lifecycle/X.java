package androidx.lifecycle;

import n1.C0675b;

/* loaded from: classes.dex */
public interface X {
    default V a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default V b(Class cls, C0675b c0675b) {
        return a(cls);
    }

    default V c(Z1.d dVar, C0675b c0675b) {
        return b(I2.d.A(dVar), c0675b);
    }
}
