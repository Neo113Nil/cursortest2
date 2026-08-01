package androidx.lifecycle;

import b0.C0081c;

/* loaded from: classes.dex */
public interface N {
    default M a(Class cls, C0081c c0081c) {
        return b(cls);
    }

    default M b(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
