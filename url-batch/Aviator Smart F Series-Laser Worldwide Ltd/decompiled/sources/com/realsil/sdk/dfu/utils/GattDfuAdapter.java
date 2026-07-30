package com.realsil.sdk.dfu.utils;

import android.content.Context;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.ConnectionException;
import com.realsil.sdk.dfu.m.o;
import com.realsil.sdk.dfu.utils.DfuAdapter;

/* loaded from: classes4.dex */
public class GattDfuAdapter extends a implements o {
    public static volatile GattDfuAdapter T;

    public GattDfuAdapter(Context context) {
        super(context);
    }

    public static GattDfuAdapter getInstance(Context context) {
        if (T == null) {
            synchronized (GattDfuAdapter.class) {
                try {
                    if (T == null) {
                        T = new GattDfuAdapter(context.getApplicationContext(), null);
                    }
                } finally {
                }
            }
        }
        return T;
    }

    @Override // com.realsil.sdk.dfu.utils.a, com.realsil.sdk.dfu.utils.BluetoothDfuAdapter, com.realsil.sdk.dfu.utils.DfuAdapter
    public void destroy() {
        super.destroy();
        T = null;
    }

    @Override // com.realsil.sdk.dfu.utils.BluetoothDfuAdapter
    public void processHidStateChanged(int i8) {
        super.processHidStateChanged(i8);
        if (i8 == 0) {
            ZLogger.v(this.f16381h, " Broadcast: RCU Disconnected!");
            if (this.f16389p == 529) {
                a((DfuException) new ConnectionException(0), false);
                return;
            }
            return;
        }
        if (i8 == 1) {
            ZLogger.v(this.f16382i, "RCU Connecting!");
            return;
        }
        if (i8 != 2) {
            if (i8 != 3) {
                return;
            }
            ZLogger.v(this.f16381h, " Broadcast: RCU Disconnecting!");
        } else {
            ZLogger.v(this.f16381h, "RCU Connected!");
            if (this.f16389p == 529) {
                a(this.D);
            }
        }
    }

    public GattDfuAdapter(Context context, DfuAdapter.DfuHelperCallback dfuHelperCallback) {
        super(context, dfuHelperCallback);
    }

    public static GattDfuAdapter getInstance(Context context, DfuAdapter.DfuHelperCallback dfuHelperCallback) {
        if (T == null) {
            synchronized (GattDfuAdapter.class) {
                try {
                    if (T == null) {
                        T = new GattDfuAdapter(context.getApplicationContext(), dfuHelperCallback);
                    }
                } finally {
                }
            }
        }
        return T;
    }
}
