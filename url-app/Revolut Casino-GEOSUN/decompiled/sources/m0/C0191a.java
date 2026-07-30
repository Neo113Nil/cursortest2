package m0;

import L.C0026b;
import android.window.BackEvent;
import e0.C0114b;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191a {

    /* renamed from: a, reason: collision with root package name */
    public final C0026b f2703a;

    public C0191a(C0114b c0114b, int i2) {
        switch (i2) {
            case 1:
                E.a aVar = new E.a(22);
                C0026b c0026b = new C0026b(c0114b, "flutter/navigation", n0.i.f2785a, 8);
                this.f2703a = c0026b;
                c0026b.J(aVar);
                break;
            default:
                E.a aVar2 = new E.a(20);
                C0026b c0026b2 = new C0026b(c0114b, "flutter/backgesture", n0.o.f2789a, 8);
                this.f2703a = c0026b2;
                c0026b2.J(aVar2);
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
