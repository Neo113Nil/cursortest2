package com.github.dart_lang.jni;

import H5.F;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public class PortContinuation<T> implements InterfaceC0564d {
    private final long port;

    static {
        System.loadLibrary("dartjni");
    }

    public PortContinuation(long j4) {
        this.port = j4;
    }

    private native void _resumeWith(long j4, Object obj);

    @Override // o5.InterfaceC0564d
    public InterfaceC0569i getContext() {
        return F.f1029c;
    }

    @Override // o5.InterfaceC0564d
    public void resumeWith(Object obj) {
        _resumeWith(this.port, obj);
    }
}
