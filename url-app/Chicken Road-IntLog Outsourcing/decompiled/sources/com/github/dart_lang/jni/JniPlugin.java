package com.github.dart_lang.jni;

import D2.b;

/* loaded from: classes.dex */
public class JniPlugin implements b {
    static {
        System.loadLibrary("dartjni");
        setClassLoader(JniPlugin.class.getClassLoader());
    }

    public static native void setClassLoader(ClassLoader classLoader);

    @Override // D2.b
    public void onAttachedToEngine(D2.a aVar) {
    }

    @Override // D2.b
    public void onDetachedFromEngine(D2.a aVar) {
    }
}
