package com.yasirkula.unity;

/* loaded from: classes.dex */
public interface NativeShareResultReceiver {
    boolean HasManagedCallback();

    void OnShareCompleted(int result, String shareTarget);
}
