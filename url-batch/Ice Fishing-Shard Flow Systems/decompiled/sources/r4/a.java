package r4;

import android.window.BackEvent;
import j4.C0573b;
import java.util.Arrays;
import java.util.HashMap;
import s4.w;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final s4.q f7461a;

    public a(C0573b c0573b, int i2) {
        switch (i2) {
            case 1:
                d dVar = new d();
                s4.q qVar = new s4.q(c0573b, "flutter/navigation", s4.l.f7766a);
                this.f7461a = qVar;
                qVar.b(dVar);
                break;
            default:
                c2.e eVar = new c2.e();
                s4.q qVar2 = new s4.q(c0573b, "flutter/backgesture", w.f7775a);
                this.f7461a = qVar2;
                qVar2.b(eVar);
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
