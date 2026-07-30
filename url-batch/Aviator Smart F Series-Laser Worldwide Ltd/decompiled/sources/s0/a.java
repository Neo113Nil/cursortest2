package s0;

import com.openharmony.watch.aidl.Device;
import com.openharmony.watch.aidl.e;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class a extends e.a {
    public a() {
        com.crrepa.band.my.ble.watchconnect.manager.e.queryAvailableKbytes();
    }

    @Override // com.openharmony.watch.aidl.e.a, com.openharmony.watch.aidl.e
    public long getAvailableKbytes(Device device) {
        int availableKbytes = com.crrepa.band.my.ble.watchconnect.manager.e.getAvailableKbytes();
        com.orhanobut.logger.f.d("DeviceClientBinder::getAvailableKBytes：" + availableKbytes);
        return availableKbytes;
    }

    @Override // com.openharmony.watch.aidl.e.a, com.openharmony.watch.aidl.e
    public void getBondedDevices(com.openharmony.watch.aidl.d dVar) {
        if (dVar != null) {
            Device bondedDevices = com.crrepa.band.my.ble.watchconnect.manager.e.getInstance().getBondedDevices();
            if (bondedDevices == null) {
                dVar.onGetResult(new ArrayList());
                com.orhanobut.logger.f.d("DeviceClientBinder::getBondedDevices,device is null");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bondedDevices);
            com.orhanobut.logger.f.d("DeviceClientBinder::getBondedDevices, device: " + bondedDevices);
            dVar.onGetResult(arrayList);
        }
    }

    @Override // com.openharmony.watch.aidl.e.a, com.openharmony.watch.aidl.e
    public void registerDeviceConnectionCallback(com.openharmony.watch.aidl.f fVar) {
        com.orhanobut.logger.f.d("DeviceClientBinder::registerDeviceConnectionCallback");
        com.crrepa.band.my.ble.watchconnect.manager.e.getInstance().register(fVar);
    }

    @Override // com.openharmony.watch.aidl.e.a, com.openharmony.watch.aidl.e
    public void unregisterDeviceConnectionCallback(com.openharmony.watch.aidl.f fVar) {
        com.orhanobut.logger.f.d("DeviceClientBinder::unregisterDeviceConnectionCallback");
        com.crrepa.band.my.ble.watchconnect.manager.e.getInstance().unregister(fVar);
    }
}
