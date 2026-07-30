package com.github.dart_lang.jni;

import M0.B;
import w0.d;
import w0.i;

/* loaded from: classes.dex */
public class PortContinuation<T> implements d {
    private final long port;

    static {
        System.loadLibrary("dartjni");
    }

    public PortContinuation(long j2) {
        this.port = j2;
    }

    private native void _resumeWith(long j2, Object obj);

    @Override // w0.d
    public i getContext() {
        return B.f617b;
    }

    @Override // w0.d
    public void resumeWith(Object obj) {
        _resumeWith(this.port, obj);
    }
}
