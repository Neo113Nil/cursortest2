package v0;

import I.C0079n;
import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;
import w0.p;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311a {

    /* renamed from: a, reason: collision with root package name */
    public final C0079n f3474a;

    public C0311a(o0.b bVar, int i2) {
        switch (i2) {
            case 1:
                t.k kVar = new t.k(3);
                C0079n c0079n = new C0079n(bVar, "flutter/navigation", w0.i.f3556a, null);
                this.f3474a = c0079n;
                c0079n.j(kVar);
                break;
            default:
                t.k kVar2 = new t.k(1);
                C0079n c0079n2 = new C0079n(bVar, "flutter/backgesture", p.f3564a, null);
                this.f3474a = c0079n2;
                c0079n2.j(kVar2);
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
