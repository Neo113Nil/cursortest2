package com.crrepa.band.my.ble.watchconnect;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.crrepa.band.my.ble.watchconnect.manager.e;
import com.openharmony.watch.aidl.g;
import com.orhanobut.logger.f;
import l0.d;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.greenrobot.eventbus.l;
import s0.b;
import s0.j;

/* loaded from: classes2.dex */
public class WatchConnectKitService extends Service {

    static class a extends g.a {
        a() {
        }

        @Override // com.openharmony.watch.aidl.g.a, com.openharmony.watch.aidl.g
        public IBinder generateBinder(int i8) {
            f.i("WatchConnectKitService::BinderFactory::generateBinder, binderType:" + i8, new Object[0]);
            if (i8 == 0) {
                return new s0.a();
            }
            if (i8 == 1) {
                return new j();
            }
            if (i8 == 2) {
                return new b();
            }
            f.e("WatchConnectKitService::BinderFactory::generateBinder, invalid binderType!!", new Object[0]);
            return null;
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandBoundStateChangeEvent(d dVar) {
        e.getInstance().updateDeviceStatus();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandConnectStateChangeEvent(m0.a aVar) {
        if (aVar.getState() == 2 || aVar.getState() == 0) {
            e.getInstance().updateDeviceStatus();
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        f.i("WatchConnectKitService::onBind", new Object[0]);
        return new a();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c.getDefault().register(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        c.getDefault().unregister(this);
    }
}
