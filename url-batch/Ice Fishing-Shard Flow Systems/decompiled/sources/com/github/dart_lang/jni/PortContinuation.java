package com.github.dart_lang.jni;

import V5.b;
import kotlin.coroutines.CoroutineContext;
import n6.F;
import u6.C0953e;
import u6.ExecutorC0952d;

/* loaded from: classes.dex */
public class PortContinuation<T> implements b {
    private final long port;

    static {
        System.loadLibrary("dartjni");
    }

    public PortContinuation(long j) {
        this.port = j;
    }

    private native void _resumeWith(long j, Object obj);

    @Override // V5.b
    public CoroutineContext getContext() {
        C0953e c0953e = F.f7011a;
        return ExecutorC0952d.f8106i;
    }

    @Override // V5.b
    public void resumeWith(Object obj) {
        _resumeWith(this.port, obj);
    }
}
