package com.github.dart_lang.jni;

import j0.C0177a;
import j0.InterfaceC0178b;

/* loaded from: classes.dex */
public class JniPlugin implements InterfaceC0178b {
    static {
        System.loadLibrary("dartjni");
        setClassLoader(JniPlugin.class.getClassLoader());
    }

    public static native void setClassLoader(ClassLoader classLoader);

    @Override // j0.InterfaceC0178b
    public void onAttachedToEngine(C0177a c0177a) {
    }

    @Override // j0.InterfaceC0178b
    public void onDetachedFromEngine(C0177a c0177a) {
    }
}
