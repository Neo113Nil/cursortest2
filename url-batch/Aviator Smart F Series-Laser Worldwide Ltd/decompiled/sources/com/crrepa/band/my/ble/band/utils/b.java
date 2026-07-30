package com.crrepa.band.my.ble.band.utils;

import android.content.Context;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.moyoung.dafit.module.common.utils.y0;

/* loaded from: classes2.dex */
public class b {
    private int currentVolume;
    private boolean started;

    /* renamed from: com.crrepa.band.my.ble.band.utils.b$b, reason: collision with other inner class name */
    private static class C0159b {
        private static final b INSTANCE = new b();

        private C0159b() {
        }
    }

    public static b getInstance() {
        return C0159b.INSTANCE;
    }

    public void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        Context context = com.moyoung.dafit.module.common.utils.d.get();
        y0.getInstance().vibrate(context, new long[]{200, 500, 200}, true);
        c cVar = c.getInstance(context);
        this.currentVolume = cVar.getRealCurrentVolume();
        com.orhanobut.logger.f.d("maxtVolume: " + this.currentVolume);
        int realMaxVolume = cVar.getRealMaxVolume();
        com.orhanobut.logger.f.d("maxtVolume: " + realMaxVolume);
        cVar.setStreamVolume(realMaxVolume);
        f.getInstance().playFindPhoneSound(context);
        m1.a.showFindPhoneNotidication(context);
        i4.getInstance().startFindPhone();
    }

    public void stop() {
        if (this.started) {
            this.started = false;
            Context context = com.moyoung.dafit.module.common.utils.d.get();
            y0.getInstance().cancel();
            f.getInstance().stopFindPhoneSound();
            m1.a.hideFindPhoneNotidication(context);
            i4.getInstance().stopFindPhone();
            c.getInstance(context).setStreamVolume(this.currentVolume);
        }
    }

    private b() {
        this.started = false;
    }
}
