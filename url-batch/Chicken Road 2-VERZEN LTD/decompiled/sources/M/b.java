package M;

import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C.b f266a;

    public b(F.b bVar, int i2) {
        switch (i2) {
            case 1:
                B.b bVar2 = new B.b(8);
                C.b bVar3 = new C.b(bVar, "flutter/navigation", N.h.f349b);
                this.f266a = bVar3;
                bVar3.i(bVar2);
                break;
            default:
                B.b bVar4 = new B.b(6);
                C.b bVar5 = new C.b(bVar, "flutter/backgesture", N.n.f353a);
                this.f266a = bVar5;
                bVar5.i(bVar4);
                break;
        }
    }

    public static HashMap a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }
}
