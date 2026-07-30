package com.github.dart_lang.jni;

import o4.b;
import o4.c;

/* loaded from: classes.dex */
public class JniPlugin implements c {
    static {
        System.loadLibrary("dartjni");
        setClassLoader(JniPlugin.class.getClassLoader());
    }

    public static native void setClassLoader(ClassLoader classLoader);

    @Override // o4.c
    public void onAttachedToEngine(b bVar) {
    }

    @Override // o4.c
    public void onDetachedFromEngine(b bVar) {
    }
}
