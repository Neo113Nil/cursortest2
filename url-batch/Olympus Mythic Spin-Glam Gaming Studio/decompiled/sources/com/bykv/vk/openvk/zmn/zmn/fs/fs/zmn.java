package com.bykv.vk.openvk.zmn.zmn.fs.fs;

import android.os.Looper;

/* loaded from: classes3.dex */
public final class zmn {
    public static boolean zmn() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
