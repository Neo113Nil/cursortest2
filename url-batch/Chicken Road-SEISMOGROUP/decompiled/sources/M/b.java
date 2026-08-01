package M;

import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final A.e f331a;

    public b(G.b bVar, int i2) {
        switch (i2) {
            case 1:
                A.b bVar2 = new A.b(8);
                A.e eVar = new A.e(bVar, "flutter/navigation", N.h.f407b, null);
                this.f331a = eVar;
                eVar.l(bVar2);
                break;
            default:
                A.b bVar3 = new A.b(6);
                A.e eVar2 = new A.e(bVar, "flutter/backgesture", N.n.f411a, null);
                this.f331a = eVar2;
                eVar2.l(bVar3);
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
