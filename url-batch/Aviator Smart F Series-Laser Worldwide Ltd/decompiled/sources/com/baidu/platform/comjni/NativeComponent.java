package com.baidu.platform.comjni;

/* loaded from: classes2.dex */
public abstract class NativeComponent extends JNIBaseApi implements AutoCloseable {
    protected volatile long mNativePointer;

    @Override // java.lang.AutoCloseable
    public void close() {
        dispose();
    }

    public abstract long create();

    public abstract int dispose();
}
