package com.crrepa.band.my.ble.band.connect;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.crrepa.band.my.ble.band.bt.BtBluetoothDeviceManager;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ota.restore.RestoreFirmwareActivity;
import com.crrepa.band.my.health.water.util.WaterProvider;
import com.crrepa.band.my.home.device.model.BandPairStateChangeEvent;
import com.crrepa.band.my.home.device.model.BandPairingCodeChangeEvent;
import com.crrepa.band.my.model.band.provider.BandBondProvider;
import com.crrepa.band.my.model.band.provider.BandFirstConnectProvider;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.util.BandManger;
import com.crrepa.ble.CRPBleClient;
import com.crrepa.ble.conn.CRPBleConnection;
import com.crrepa.ble.conn.CRPBleDevice;
import com.crrepa.ble.conn.bean.CRPDeviceInfo;
import com.crrepa.ble.conn.callback.CRPDeviceBondStateCallback;
import com.crrepa.ble.conn.callback.CRPDeviceDfuStatusCallback;
import com.crrepa.ble.conn.callback.CRPDeviceInfoCallback;
import com.crrepa.ble.conn.listener.CRPBleConnectionStateListener;
import com.crrepa.ble.ota.goodix.RestoreDeviceChangeListener;
import com.crrepa.ble.ota.goodix.RestoreFirmwareController;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class f {
    private static final int QUERY_DFU_STATE_TIMEOUT = 5;
    private static final long RECONNECTION_DELAY = 3;
    private g bandDfuStatusCallback;
    private CRPBleClient bleClient;
    private CRPBleConnection bleConnection;
    private i bleConnectionStateListener;
    private CRPBleDevice bleDevice;
    private boolean closeGatt;
    private boolean connected;
    private boolean connecting;
    private Disposable deviceInfoSubscribe;
    private boolean queryDfuState;
    private boolean receiveDfuState;
    private boolean reconnect;
    private RestoreDeviceChangeListener restoreDeviceChangeListener;
    private boolean startDfu;
    private boolean unBond;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(String str) {
            f.this.connect(str);
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
            f.this.reconnect();
        }
    }

    class c implements ObservableOnSubscribe {
        c() {
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<String> observableEmitter) {
            String address = BandInfoManager.getAddress();
            if (TextUtils.isEmpty(address)) {
                com.orhanobut.logger.f.e("address is null!", new Object[0]);
            } else {
                observableEmitter.onNext(address);
            }
            observableEmitter.onComplete();
        }
    }

    class d implements Consumer {
        d() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            if (f.this.reconnect) {
                f.this.establishConnection();
            }
        }
    }

    class e implements Consumer {
        e() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            f.this.sendConnectMessage();
        }
    }

    /* renamed from: com.crrepa.band.my.ble.band.connect.f$f, reason: collision with other inner class name */
    class C0154f implements Consumer {
        C0154f() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            f.this.checkReceiveDfuState();
        }
    }

    static class g implements CRPDeviceDfuStatusCallback {
        private WeakReference<f> weakReference;

        public g(f fVar) {
            this.weakReference = new WeakReference<>(fVar);
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceDfuStatusCallback
        public void onDeviceDfuStatus(int i8) {
            f fVar = this.weakReference.get();
            fVar.receiveDfuState = true;
            com.orhanobut.logger.f.d("onDeviceDfuStatus:" + i8);
            if (i8 != 1) {
                fVar.init();
            }
            org.greenrobot.eventbus.c.getDefault().post(new l0.e(i8));
        }
    }

    private static class h {
        private static f INSTANCE = new f(null);

        private h() {
        }
    }

    static class i implements CRPBleConnectionStateListener {
        private WeakReference<f> weakReference;

        public i(f fVar) {
            this.weakReference = new WeakReference<>(fVar);
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleConnectionStateListener
        public void onConnectionStateChange(int i8) {
            com.orhanobut.logger.f.d("onConnectionStateChange: " + i8);
            f fVar = this.weakReference.get();
            if (i8 == 0) {
                fVar.handleDisconnected();
            } else if (i8 == 2) {
                fVar.handleConnected();
            }
            org.greenrobot.eventbus.c.getDefault().post(new m0.a(i8));
        }
    }

    static class j implements RestoreDeviceChangeListener {
        boolean startRestore = true;
        private WeakReference<f> weakReference;

        public j(f fVar) {
            this.weakReference = new WeakReference<>(fVar);
        }

        @Override // com.crrepa.ble.ota.goodix.RestoreDeviceChangeListener
        public void onRestoreDevice(String str) {
            f fVar = this.weakReference.get();
            if (fVar != null) {
                fVar.reconnect = false;
                if (this.startRestore) {
                    this.startRestore = false;
                    com.moyoung.dafit.module.common.utils.d.get().startActivity(RestoreFirmwareActivity.getCallingIntent(com.moyoung.dafit.module.common.utils.d.get(), str));
                }
            }
        }
    }

    /* synthetic */ f(a aVar) {
        this();
    }

    private boolean canConnect() {
        if (!isBluetoothEnable()) {
            com.orhanobut.logger.f.e("蓝牙未打开", new Object[0]);
            return false;
        }
        if (isConnected()) {
            com.orhanobut.logger.f.d("已连接");
            return false;
        }
        if (!isConnecting()) {
            return true;
        }
        com.orhanobut.logger.f.d("正在连接中...");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkReceiveDfuState() {
        com.orhanobut.logger.f.d("receiveDfuState: " + this.receiveDfuState);
        if (this.receiveDfuState) {
            return;
        }
        this.queryDfuState = false;
        init();
        org.greenrobot.eventbus.c.getDefault().post(new l0.e(2));
    }

    private void clearConnectState() {
        setConnecting(false);
        setConnected(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:3:0x0001, B:8:0x0009, B:10:0x002c, B:13:0x0041, B:15:0x0045, B:18:0x0056, B:19:0x0039), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:3:0x0001, B:8:0x0009, B:10:0x002c, B:13:0x0041, B:15:0x0045, B:18:0x0056, B:19:0x0039), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void connect(String str) {
        CRPBleDevice cRPBleDevice;
        try {
            if (canConnect()) {
                com.orhanobut.logger.f.d("connect: " + str);
                this.reconnect = true;
                this.closeGatt = true;
                this.startDfu = false;
                setConnecting(true);
                CRPBleDevice cRPBleDevice2 = this.bleDevice;
                if (cRPBleDevice2 != null) {
                    if (!TextUtils.equals(str, cRPBleDevice2.getMacAddress())) {
                    }
                    cRPBleDevice = this.bleDevice;
                    if (cRPBleDevice == null) {
                        CRPBleConnection connect = cRPBleDevice.connect();
                        this.bleConnection = connect;
                        connect.setConnectionStateListener(this.bleConnectionStateListener);
                        setBleConnection(this.bleConnection);
                    } else {
                        com.orhanobut.logger.f.e("bleDevice is null!", new Object[0]);
                    }
                }
                this.bleDevice = this.bleClient.getBleDevice(str);
                cRPBleDevice = this.bleDevice;
                if (cRPBleDevice == null) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void createBond() {
        final long bondTime = BandBondProvider.getBondTime();
        byte[] bondBytes = BandBondProvider.getBondBytes(bondTime);
        com.orhanobut.logger.f.d("bondTime: " + bondTime);
        i4.getInstance().createBond(bondBytes, new CRPDeviceBondStateCallback() { // from class: com.crrepa.band.my.ble.band.connect.c
            @Override // com.crrepa.ble.conn.callback.CRPDeviceBondStateCallback
            public final void onBondState(int i8) {
                f.this.lambda$createBond$2(bondTime, i8);
            }
        });
    }

    @SuppressLint({"CheckResult"})
    private void delayConnect() {
        Observable.timer(3L, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new d());
    }

    public static f getInstance() {
        return h.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleConnected() {
        setConnecting(false);
        setConnected(true);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isScanAndCodeBond()) {
            createBond(BandBondProvider.hasBondCode());
            return;
        }
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isBond()) {
            createBond();
            return;
        }
        if (!TextUtils.isEmpty(BandInfoManager.getFirmwareType())) {
            sendConnectMessage();
            return;
        }
        com.orhanobut.logger.f.d("FirmwareType: " + BandInfoManager.getFirmwareType());
        startQueryDeviceInfoTimer();
        i4.getInstance().queryDeviceInfo(new CRPDeviceInfoCallback() { // from class: com.crrepa.band.my.ble.band.connect.d
            @Override // com.crrepa.ble.conn.callback.CRPDeviceInfoCallback
            public final void onDeviceInfo(CRPDeviceInfo cRPDeviceInfo) {
                f.this.lambda$handleConnected$1(cRPDeviceInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleDisconnected() {
        com.orhanobut.logger.f.d("handleDisconnected");
        clearConnectState();
        com.crrepa.band.my.device.weather.timer.b.getInstance().stop(com.moyoung.dafit.module.common.utils.d.get());
        i4.getInstance().cancelTimer();
        reconnect();
        com.orhanobut.logger.f.d("handleDisconnected unBond: " + this.unBond);
        if (this.unBond) {
            this.unBond = false;
            BtBluetoothDeviceManager.getInstance().unBondDevice();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void init() {
        i4.getInstance().init(com.moyoung.dafit.module.common.utils.d.get());
        com.crrepa.band.my.ble.band.cmd.d.getInstance().init();
    }

    private boolean isBluetoothEnable() {
        return this.bleClient.isBluetoothEnable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createBond$2(long j8, int i8) {
        com.orhanobut.logger.f.d("onBondState: " + i8);
        org.greenrobot.eventbus.c.getDefault().post(new BandPairStateChangeEvent(i8));
        if (i8 == 0) {
            BandManger.removeBand(com.moyoung.dafit.module.common.utils.d.get());
        } else {
            if (i8 != 1) {
                return;
            }
            BandBondProvider.saveBondTime(j8);
            sendConnectMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createBond$3(int i8, long j8, int i9) {
        com.orhanobut.logger.f.d("onBondState: " + i9);
        org.greenrobot.eventbus.c.getDefault().post(new BandPairingCodeChangeEvent(i8, i9));
        if (i9 == 0) {
            BandManger.removeBand(com.moyoung.dafit.module.common.utils.d.get());
        } else {
            if (i9 != 1) {
                return;
            }
            BandBondProvider.saveBondTime(j8);
            BandBondProvider.saveBondCode(i8);
            sendConnectMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$disconnect$0(CRPBleDevice cRPBleDevice) {
        if (cRPBleDevice != null) {
            cRPBleDevice.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleConnected$1(CRPDeviceInfo cRPDeviceInfo) {
        com.orhanobut.logger.f.d("onDeviceInfo: " + cRPDeviceInfo);
        stopQueryDeviceInfoTimer();
        BandInfoManager.saveBandInfo(cRPDeviceInfo);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isScanAndCodeBond()) {
            createBond(BandBondProvider.hasBondCode());
        } else if (com.crrepa.band.my.ble.band.utils.a.getInstance().isBond()) {
            createBond();
        }
    }

    private void queryBandBattery() {
        i4.getInstance().queryBandBattery();
    }

    @SuppressLint({"CheckResult"})
    private void queryBandDfuState() {
        com.orhanobut.logger.f.d("queryDfuState: " + this.queryDfuState);
        if (!this.queryDfuState) {
            init();
            org.greenrobot.eventbus.c.getDefault().post(new l0.e(2));
        } else {
            this.receiveDfuState = false;
            i4.getInstance().queryBandDfuStatus(this.bandDfuStatusCallback);
            Observable.timer(5L, TimeUnit.SECONDS).subscribe(new C0154f());
        }
    }

    private void queryBandFirmwareVersion() {
        i4.getInstance().queryBandFirmwareVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reconnect() {
        com.orhanobut.logger.f.d("closeGatt: " + this.closeGatt);
        if (this.closeGatt) {
            closeGatt();
        }
        com.orhanobut.logger.f.d("reconnect: " + this.reconnect);
        if (this.reconnect) {
            delayConnect();
        }
    }

    private void sendBoundVibration() {
        if (BandFirstConnectProvider.isFirstConnected()) {
            i4.getInstance().sendBoundVibration();
            BandFirstConnectProvider.saveFirstConnected(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendConnectMessage() {
        i4.getInstance().sendCurrentTime();
        sendBoundVibration();
        queryBandBattery();
        queryBandDfuState();
        queryBandFirmwareVersion();
        com.crrepa.band.my.device.weather.timer.b.getInstance().start(com.moyoung.dafit.module.common.utils.d.get());
    }

    private void setBleConnection(CRPBleConnection cRPBleConnection) {
        i4.getInstance().setBleConnection(com.moyoung.dafit.module.common.utils.d.get(), cRPBleConnection);
        com.crrepa.band.my.ble.band.cmd.d.getInstance().setBleConnection(cRPBleConnection);
    }

    private void setConnected(boolean z7) {
        this.connected = z7;
        if (z7) {
            return;
        }
        WaterProvider.updateWaterConnectStatus(WaterProvider.WaterConnectStatus.NO_CONNECT);
    }

    private void setConnecting(boolean z7) {
        this.connecting = z7;
    }

    private void startQueryDeviceInfoTimer() {
        this.deviceInfoSubscribe = Observable.timer(3L, TimeUnit.SECONDS).subscribe(new e());
    }

    private void stopQueryDeviceInfoTimer() {
        Disposable disposable = this.deviceInfoSubscribe;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.deviceInfoSubscribe.dispose();
        this.deviceInfoSubscribe = null;
    }

    public void closeGatt() {
        if (this.bleConnection != null) {
            com.orhanobut.logger.f.d("closeGatt");
            this.bleConnection.close();
            this.bleDevice = null;
            this.bleConnection = null;
            clearConnectState();
        }
    }

    @SuppressLint({"CheckResult"})
    public synchronized void disconnect(boolean z7) {
        try {
            com.orhanobut.logger.f.d("disconnect: " + z7);
            this.reconnect = z7;
            if (!z7) {
                this.receiveDfuState = true;
            }
            clearConnectState();
            CRPBleDevice cRPBleDevice = this.bleDevice;
            if (cRPBleDevice != null) {
                Observable.just(cRPBleDevice).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.ble.band.connect.b
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        f.lambda$disconnect$0((CRPBleDevice) obj);
                    }
                }, new com.crrepa.band.my.ble.band.config.b());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"CheckResult"})
    public void establishConnection() {
        com.orhanobut.logger.f.d("establishConnection");
        Observable.create(new c()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(), new b());
    }

    public boolean isConnected() {
        CRPBleDevice cRPBleDevice = this.bleDevice;
        if (cRPBleDevice == null || this.bleConnection == null || !cRPBleDevice.isConnected()) {
            return false;
        }
        return this.connected;
    }

    public boolean isConnecting() {
        return this.connecting;
    }

    public boolean isDisConnected() {
        return !isConnected();
    }

    public boolean isStartDfu() {
        return this.startDfu;
    }

    public void startDfu(boolean z7) {
        com.orhanobut.logger.f.d("startDfu");
        this.startDfu = true;
        this.closeGatt = z7;
        this.reconnect = false;
    }

    public void startUnBond() {
        this.unBond = true;
        this.reconnect = false;
    }

    private f() {
        this.bleConnectionStateListener = new i(this);
        this.bandDfuStatusCallback = new g(this);
        this.restoreDeviceChangeListener = new j(this);
        this.connecting = false;
        this.connected = false;
        this.closeGatt = true;
        this.reconnect = true;
        this.startDfu = false;
        this.unBond = false;
        this.receiveDfuState = false;
        this.queryDfuState = true;
        this.bleClient = com.crrepa.band.my.ble.band.a.getBleClient();
        RestoreFirmwareController.getInstance().setRestoreDeviceChangeListener(this.restoreDeviceChangeListener);
    }

    private void createBond(boolean z7) {
        final long bondTime = BandBondProvider.getBondTime();
        byte[] bondBytes = BandBondProvider.getBondBytes(bondTime);
        com.orhanobut.logger.f.d("bondTime: " + bondTime);
        final int bondCode = BandBondProvider.getBondCode();
        com.orhanobut.logger.f.d("bond code: " + bondCode);
        i4.getInstance().createBond(bondBytes, z7, bondCode, new CRPDeviceBondStateCallback() { // from class: com.crrepa.band.my.ble.band.connect.e
            @Override // com.crrepa.ble.conn.callback.CRPDeviceBondStateCallback
            public final void onBondState(int i8) {
                f.this.lambda$createBond$3(bondCode, bondTime, i8);
            }
        });
    }
}
