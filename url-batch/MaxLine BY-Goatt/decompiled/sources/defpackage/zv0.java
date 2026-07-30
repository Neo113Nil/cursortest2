package defpackage;

import com.facebook.appevents.AppEvent;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class zv0 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;
    public final /* synthetic */ AppEvent o;

    public /* synthetic */ zv0(String str, AppEvent appEvent, int i) {
        this.m = i;
        this.n = str;
        this.o = appEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                GpsAraTriggersManager.registerTriggerAsync$lambda$0(this.n, this.o);
                break;
            default:
                OnDeviceProcessingManager.sendCustomEventAsync$lambda$1(this.n, this.o);
                break;
        }
    }
}
