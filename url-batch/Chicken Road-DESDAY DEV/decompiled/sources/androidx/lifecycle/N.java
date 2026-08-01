package androidx.lifecycle;

import a0.C0058c;

/* loaded from: classes.dex */
public interface N {
    default M a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default M b(Class cls, C0058c c0058c) {
        return a(cls);
    }
}
