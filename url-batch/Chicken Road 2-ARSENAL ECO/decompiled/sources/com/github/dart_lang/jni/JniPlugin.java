package com.github.dart_lang.jni;

import K3.b;

/* loaded from: classes.dex */
public class JniPlugin implements b {
    static {
        System.loadLibrary("dartjni");
        setClassLoader(JniPlugin.class.getClassLoader());
    }

    public static native void setClassLoader(ClassLoader classLoader);

    @Override // K3.b
    public void onAttachedToEngine(K3.a aVar) {
    }

    @Override // K3.b
    public void onDetachedFromEngine(K3.a aVar) {
    }
}
