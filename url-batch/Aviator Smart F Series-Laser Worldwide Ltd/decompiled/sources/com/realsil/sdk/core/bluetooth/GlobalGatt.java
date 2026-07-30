package com.realsil.sdk.core.bluetooth;

import android.annotation.TargetApi;
import android.content.Context;
import com.realsil.sdk.core.b.c;

@TargetApi(18)
/* loaded from: classes4.dex */
public final class GlobalGatt extends c {

    /* renamed from: p, reason: collision with root package name */
    public static GlobalGatt f15429p;

    public GlobalGatt(Context context) {
        super(context);
    }

    public static GlobalGatt getInstance() {
        return f15429p;
    }

    public static synchronized void initial(Context context) {
        synchronized (GlobalGatt.class) {
            if (f15429p == null) {
                synchronized (GlobalGatt.class) {
                    try {
                        if (f15429p == null) {
                            f15429p = new GlobalGatt(context.getApplicationContext());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
