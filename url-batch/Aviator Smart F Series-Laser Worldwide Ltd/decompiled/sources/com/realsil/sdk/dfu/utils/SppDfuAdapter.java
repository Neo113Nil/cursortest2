package com.realsil.sdk.dfu.utils;

import android.content.Context;

/* loaded from: classes4.dex */
public final class SppDfuAdapter extends b {
    public static volatile SppDfuAdapter O;

    public SppDfuAdapter(Context context) {
        super(context);
    }

    public static SppDfuAdapter getInstance(Context context) {
        if (O == null) {
            synchronized (SppDfuAdapter.class) {
                try {
                    if (O == null) {
                        O = new SppDfuAdapter(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return O;
    }

    @Override // com.realsil.sdk.dfu.utils.b, com.realsil.sdk.dfu.utils.BluetoothDfuAdapter, com.realsil.sdk.dfu.utils.DfuAdapter
    public void destroy() {
        super.destroy();
        O = null;
    }
}
