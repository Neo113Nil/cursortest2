package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class sw2 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw2(Looper looper, int i) {
        super(looper);
        switch (i) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
