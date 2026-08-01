package androidx.lifecycle;

import c0.C0103c;

/* loaded from: classes.dex */
public interface P {
    default O a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default O b(Class cls, C0103c c0103c) {
        return a(cls);
    }
}
