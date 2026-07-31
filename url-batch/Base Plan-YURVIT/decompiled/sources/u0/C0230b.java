package u0;

import B0.C0008i;
import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;
import v0.C0244i;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230b {

    /* renamed from: a, reason: collision with root package name */
    public final C0008i f2986a;

    public C0230b(m0.b bVar, int i2) {
        switch (i2) {
            case 1:
                C0229a c0229a = new C0229a(3);
                C0008i c0008i = new C0008i(bVar, "flutter/navigation", C0244i.f3088a, 12);
                this.f2986a = c0008i;
                c0008i.I(c0229a);
                break;
            default:
                C0229a c0229a2 = new C0229a(0);
                C0008i c0008i2 = new C0008i(bVar, "flutter/backgesture", v0.o.f3092a, 12);
                this.f2986a = c0008i2;
                c0008i2.I(c0229a2);
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
