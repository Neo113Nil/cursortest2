package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class z5 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(Looper looper, int i3) {
        super(looper);
        switch (i3) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                break;
            case 2:
            default:
                Looper.getMainLooper();
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                super(looper);
                Looper.getMainLooper();
                break;
        }
    }

    public z5(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
