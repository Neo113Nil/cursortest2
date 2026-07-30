package m0;

import android.window.BackEvent;
import e0.h0;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f766a;

    public a(g0.b bVar, int i2) {
        switch (i2) {
            case 1:
                c0.b bVar2 = new c0.b(9);
                h0 h0Var = new h0(bVar, "flutter/navigation", n0.g.f932b);
                this.f766a = h0Var;
                h0Var.h(bVar2);
                break;
            default:
                c0.b bVar3 = new c0.b(6);
                h0 h0Var2 = new h0(bVar, "flutter/backgesture", n0.m.f936a);
                this.f766a = h0Var2;
                h0Var2.h(bVar3);
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
