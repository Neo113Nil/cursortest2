package m7;

import android.os.Looper;
import org.greenrobot.eventbus.e;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.k;

/* loaded from: classes5.dex */
public class d implements g {
    @Override // org.greenrobot.eventbus.g
    public k createPoster(org.greenrobot.eventbus.c cVar) {
        return new e(cVar, Looper.getMainLooper(), 10);
    }

    @Override // org.greenrobot.eventbus.g
    public boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
