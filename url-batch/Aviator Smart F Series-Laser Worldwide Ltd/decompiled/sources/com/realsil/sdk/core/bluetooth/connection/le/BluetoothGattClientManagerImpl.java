package com.realsil.sdk.core.bluetooth.connection.le;

import android.annotation.TargetApi;
import android.content.Context;
import com.realsil.sdk.core.b.c;

@TargetApi(18)
/* loaded from: classes4.dex */
public final class BluetoothGattClientManagerImpl extends c {

    /* renamed from: p, reason: collision with root package name */
    public static BluetoothGattClientManagerImpl f15476p;

    public BluetoothGattClientManagerImpl(Context context) {
        super(context);
    }

    public static BluetoothGattClientManagerImpl getInstance() {
        return f15476p;
    }

    public static synchronized void initial(Context context) {
        synchronized (BluetoothGattClientManagerImpl.class) {
            if (f15476p == null) {
                synchronized (BluetoothGattClientManagerImpl.class) {
                    try {
                        if (f15476p == null) {
                            f15476p = new BluetoothGattClientManagerImpl(context.getApplicationContext());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
