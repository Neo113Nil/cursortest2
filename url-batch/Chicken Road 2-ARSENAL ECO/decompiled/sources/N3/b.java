package N3;

import android.window.BackEvent;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final B0.c f1680a;

    public b(F3.b bVar, int i7) {
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                U0.h hVar = new U0.h(6);
                B0.c cVar = new B0.c((Object) bVar, "flutter/navigation", (Object) O3.g.f1770b, 12);
                this.f1680a = cVar;
                cVar.C(hVar);
                break;
            default:
                U0.h hVar2 = new U0.h(5);
                B0.c cVar2 = new B0.c((Object) bVar, "flutter/backgesture", (Object) O3.m.f1774a, 12);
                this.f1680a = cVar2;
                cVar2.C(hVar2);
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
