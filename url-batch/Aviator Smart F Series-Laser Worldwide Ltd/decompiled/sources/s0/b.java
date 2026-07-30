package s0;

import com.openharmony.watch.aidl.Device;
import com.openharmony.watch.aidl.Notification;
import com.openharmony.watch.aidl.i;

/* loaded from: classes2.dex */
public class b extends i.a {
    @Override // com.openharmony.watch.aidl.i.a, com.openharmony.watch.aidl.i
    public void notify(Device device, Notification notification, com.openharmony.watch.aidl.h hVar) {
        com.orhanobut.logger.f.d("NotifyClientBinder::notify");
        if (hVar == null) {
            return;
        }
        hVar.onError(notification, 206, "device notify error");
    }
}
