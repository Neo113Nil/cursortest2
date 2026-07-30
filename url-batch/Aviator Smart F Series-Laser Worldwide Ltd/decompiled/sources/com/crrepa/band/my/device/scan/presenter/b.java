package com.crrepa.band.my.device.scan.presenter;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import com.crrepa.band.my.ble.band.cmd.parser.d;
import com.crrepa.band.my.ble.band.config.e;
import com.crrepa.band.my.ble.band.model.BluetoothStateChangeEvent;
import com.crrepa.band.my.common.receiver.BluetoothStateReceiver;
import com.crrepa.band.my.home.device.model.BandPairStateChangeEvent;
import com.crrepa.band.my.home.device.model.BandPairingCodeChangeEvent;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.util.BandManger;
import com.crrepa.band.my.model.db.proxy.DeviceScanRecordDaoProxy;
import com.crrepa.band.my.training.utils.i;
import com.crrepa.ble.scan.bean.CRPScanDevice;
import com.crrepa.ble.scan.callback.CRPScanCallback;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.s;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class b implements f {
    public static final int BAND_CONNECT_PERIOD = 60;
    private static final int DEFALUT_BOUND_DEVICE_RSSI = -50;
    private static final long SCAN_PERIOD = 20000;
    private Disposable bondSubscribe;
    private r1.a view;
    private DeviceScanRecordDaoProxy deviceScanRecordDaoProxy = new DeviceScanRecordDaoProxy();
    private a bandScanCallback = new a(this);
    private boolean bandScanning = false;
    private e bandModelConverter = new e();
    private AtomicBoolean hasFound = new AtomicBoolean(false);
    private List<BluetoothDevice> scanResults = new ArrayList();

    static class a implements CRPScanCallback {
        private WeakReference<b> weakReference;

        public a(b bVar) {
            this.weakReference = new WeakReference<>(bVar);
        }

        @Override // com.crrepa.ble.scan.callback.CRPScanCallback
        public void onScanComplete(List<CRPScanDevice> list) {
            b bVar = this.weakReference.get();
            if (bVar != null) {
                bVar.scanComplete();
            }
        }

        @Override // com.crrepa.ble.scan.callback.CRPScanCallback
        public void onScanning(CRPScanDevice cRPScanDevice) {
            b bVar = this.weakReference.get();
            if (bVar != null) {
                bVar.handleScanResult(cRPScanDevice, false);
            }
        }
    }

    public b() {
        c.getDefault().register(this);
    }

    private boolean checkBluetoothEnable() {
        return com.crrepa.band.my.ble.band.a.getBleClient().isBluetoothEnable();
    }

    private boolean checkLocationEnable(Context context) {
        return i.isLocationEnable(context);
    }

    private boolean checkSupportBLE(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleScanResult(CRPScanDevice cRPScanDevice, boolean z7) {
        BluetoothDevice device;
        String str;
        int i8;
        int i9;
        int i10;
        if (cRPScanDevice == null || this.bandModelConverter == null) {
            return;
        }
        String name = cRPScanDevice.getName();
        if (TextUtils.isEmpty(name) || (device = cRPScanDevice.getDevice()) == null) {
            return;
        }
        if (TextUtils.equals(name, "ble_dfu")) {
            stopScan();
            this.view.renderRestoreFirmware(device.getAddress());
            return;
        }
        synchronized (this) {
            try {
                this.hasFound.set(false);
                Iterator<BluetoothDevice> it = this.scanResults.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(device)) {
                        this.hasFound.set(true);
                    }
                }
                if (!this.hasFound.get()) {
                    this.scanResults.add(device);
                    String address = device.getAddress();
                    com.orhanobut.logger.f.d("onScanning:" + address);
                    byte[] scanRecord = cRPScanDevice.getScanRecord();
                    com.crrepa.band.my.ble.band.cmd.parser.c parseScanRecord = d.parseScanRecord(scanRecord);
                    if (parseScanRecord != null) {
                        str = parseScanRecord.getFirmwareType();
                        com.orhanobut.logger.f.d("firmwareType: " + str);
                        i9 = parseScanRecord.getFunction();
                        com.orhanobut.logger.f.d("bandFunction: " + i9);
                        i10 = parseScanRecord.getPlatform();
                        com.orhanobut.logger.f.d("mcuPlatform: " + i10);
                        i8 = parseScanRecord.getChipId();
                        com.orhanobut.logger.f.d("mcuChipId: " + i8);
                    } else {
                        str = null;
                        i8 = 0;
                        i9 = 0;
                        i10 = 0;
                    }
                    BaseBandModel convert = this.bandModelConverter.convert(name, address, str);
                    if (convert == null) {
                        return;
                    }
                    if (!z7) {
                        this.deviceScanRecordDaoProxy.insert(name, address, scanRecord);
                    }
                    convert.setBandFirmwareType(str);
                    convert.setFunction(i9);
                    convert.setMcuPlatform(i10);
                    convert.setMcuChipId(i8);
                    convert.setRssi(cRPScanDevice.getRssi());
                    r1.a aVar = this.view;
                    if (aVar != null) {
                        aVar.renderScanDevice(convert);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$establishConnection$0(Long l8) {
        if (this.view == null || com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            return;
        }
        BandManger.removeBand(com.moyoung.dafit.module.common.utils.d.get());
        this.view.renderBondFail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scanComplete() {
        this.bandScanning = false;
        r1.a aVar = this.view;
        if (aVar != null) {
            aVar.renderScanComplete();
        }
    }

    private void showBluetoothDisable() {
        this.view.renderBluetoothDisable();
    }

    private void showBondedDevices() {
        Set<BluetoothDevice> bondedDevices = com.crrepa.band.my.ble.band.a.getBleClient().getBondedDevices();
        if (bondedDevices == null) {
            return;
        }
        for (BluetoothDevice bluetoothDevice : bondedDevices) {
            String address = bluetoothDevice.getAddress();
            String name = bluetoothDevice.getName();
            com.orhanobut.logger.f.d("bonded device: " + name + "(" + address + ")");
            if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(address)) {
                byte[] scanRecordBytes = this.deviceScanRecordDaoProxy.getScanRecordBytes(name, address);
                com.orhanobut.logger.f.d("Scan Record Bytes: " + s.bean2Json(scanRecordBytes));
                handleScanResult(new CRPScanDevice(bluetoothDevice, scanRecordBytes, DEFALUT_BOUND_DEVICE_RSSI, name), true);
            }
        }
    }

    public void addBand(BaseBandModel baseBandModel) {
        BandManger.addBand(baseBandModel);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        this.bandScanning = false;
        this.bandModelConverter = null;
        this.scanResults.clear();
        c.getDefault().unregister(this);
        Disposable disposable = this.bondSubscribe;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.bondSubscribe.dispose();
    }

    public void establishConnection(boolean z7) {
        com.crrepa.band.my.ble.band.connect.a.startConnectService();
        if (z7) {
            this.bondSubscribe = Observable.timer(60L, TimeUnit.SECONDS).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.scan.presenter.a
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    b.this.lambda$establishConnection$0((Long) obj);
                }
            });
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBluetoothStateChangeEvent(BluetoothStateChangeEvent bluetoothStateChangeEvent) {
        if (bluetoothStateChangeEvent.isEnable()) {
            return;
        }
        stopScan();
        showBluetoothDisable();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBondCodeChangeEvent(BandPairingCodeChangeEvent bandPairingCodeChangeEvent) {
        int state = bandPairingCodeChangeEvent.getState();
        if (state == 0 || state == 1) {
            this.view.renderPairingCodeResult(bandPairingCodeChangeEvent.getName(), bandPairingCodeChangeEvent.isSuccess());
        } else {
            if (state != 2) {
                return;
            }
            this.view.renderPairingCode(bandPairingCodeChangeEvent.getCode());
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onUserBondStateChangeEvent(BandPairStateChangeEvent bandPairStateChangeEvent) {
        int state = bandPairStateChangeEvent.getState();
        if (state == 0) {
            this.view.renderBondFail();
        } else {
            if (state != 1) {
                return;
            }
            this.view.renderBondComplete();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    public void registerBluetoothStateReceiver(Context context) {
        BluetoothStateReceiver.register(context);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(r1.a aVar) {
        this.view = aVar;
    }

    public boolean startScan(Context context) {
        if (!checkSupportBLE(context)) {
            this.view.renderNotSupportBle();
            return false;
        }
        if (!checkBluetoothEnable()) {
            showBluetoothDisable();
            return false;
        }
        if (!checkLocationEnable(context)) {
            this.view.renderLocationServiceDisable();
            return false;
        }
        if (this.bandScanning) {
            return false;
        }
        showBondedDevices();
        boolean scanDevice = com.crrepa.band.my.ble.band.a.getBleClient().scanDevice(this.bandScanCallback, 20000L);
        if (scanDevice) {
            this.bandScanning = true;
        } else {
            this.view.renderScanFail();
        }
        return scanDevice;
    }

    public void stopScan() {
        if (this.bandScanning) {
            this.bandScanning = false;
            if (com.crrepa.band.my.ble.band.a.getBleClient().isBluetoothEnable()) {
                com.crrepa.band.my.ble.band.a.getBleClient().cancelScan();
            }
        }
    }

    public void unregisterBluetoothStateReceiver(Context context) {
        BluetoothStateReceiver.unregister(context);
    }
}
