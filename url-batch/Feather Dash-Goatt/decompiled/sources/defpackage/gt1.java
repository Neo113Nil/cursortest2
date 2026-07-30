package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class gt1 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt1(Looper looper, int i) {
        super(looper);
        switch (i) {
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
