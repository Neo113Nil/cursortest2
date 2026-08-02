package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gbg extends Handler {
    public gbg(Looper looper, byte[] bArr) {
        super(looper);
        Looper.getMainLooper();
    }

    public gbg(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
