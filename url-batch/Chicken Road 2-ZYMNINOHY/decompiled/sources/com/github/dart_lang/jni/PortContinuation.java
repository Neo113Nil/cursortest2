package com.github.dart_lang.jni;

import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import x3.AbstractC1528C;

/* loaded from: classes.dex */
public class PortContinuation<T> implements InterfaceC0425c {
    private final long port;

    static {
        System.loadLibrary("dartjni");
    }

    public PortContinuation(long j4) {
        this.port = j4;
    }

    private native void _resumeWith(long j4, Object obj);

    @Override // f3.InterfaceC0425c
    public InterfaceC0430h getContext() {
        return AbstractC1528C.f15990b;
    }

    @Override // f3.InterfaceC0425c
    public void resumeWith(Object obj) {
        _resumeWith(this.port, obj);
    }
}
