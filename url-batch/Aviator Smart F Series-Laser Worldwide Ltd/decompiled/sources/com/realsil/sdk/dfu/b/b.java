package com.realsil.sdk.dfu.b;

import android.content.Context;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.ConnectionException;
import com.realsil.sdk.dfu.m.o;
import com.realsil.sdk.dfu.utils.DfuAdapter;

/* loaded from: classes4.dex */
public class b extends com.realsil.sdk.dfu.utils.a implements o {
    public b(Context context, DfuAdapter.DfuHelperCallback dfuHelperCallback) {
        super(context, dfuHelperCallback);
    }

    @Override // com.realsil.sdk.dfu.utils.a, com.realsil.sdk.dfu.utils.BluetoothDfuAdapter, com.realsil.sdk.dfu.utils.DfuAdapter
    public void destroy() {
        super.destroy();
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
}
