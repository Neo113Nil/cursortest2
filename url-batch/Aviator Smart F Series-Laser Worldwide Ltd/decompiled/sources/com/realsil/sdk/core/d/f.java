package com.realsil.sdk.core.d;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.ParcelUuid;
import android.text.TextUtils;
import com.realsil.sdk.core.RtkCore;
import com.realsil.sdk.core.bluetooth.BluetoothProfileManager;
import com.realsil.sdk.core.bluetooth.compat.BluetoothAdapterCompat;
import com.realsil.sdk.core.bluetooth.compat.BluetoothClassCompat;
import com.realsil.sdk.core.bluetooth.compat.BluetoothDeviceCompat;
import com.realsil.sdk.core.bluetooth.compat.BluetoothUuidCompat;
import com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice;
import com.realsil.sdk.core.bluetooth.scanner.ScannerCallback;
import com.realsil.sdk.core.bluetooth.scanner.ScannerParams;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.compat.RtkContextCompat;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.core.utility.StringUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public abstract class f {
    public static final int STATE_DISCOVERY_FINISHED = 3;
    public static final int STATE_DISCOVERY_STARTED = 2;
    public static final int STATE_DISCOVERY_START_PROCESS = 1;
    public static final int STATE_IDLE = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final ParcelUuid f15652s = ParcelUuid.fromString("6A24EEAB-4B65-4693-986B-3C26C352264F");

    /* renamed from: d, reason: collision with root package name */
    public Context f15656d;

    /* renamed from: e, reason: collision with root package name */
    public ScannerParams f15657e;

    /* renamed from: f, reason: collision with root package name */
    public ScannerCallback f15658f;

    /* renamed from: g, reason: collision with root package name */
    public HandlerThread f15659g;

    /* renamed from: h, reason: collision with root package name */
    public Handler f15660h;

    /* renamed from: i, reason: collision with root package name */
    public BluetoothAdapter f15661i;

    /* renamed from: a, reason: collision with root package name */
    public boolean f15653a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15654b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15655c = false;

    /* renamed from: j, reason: collision with root package name */
    public int f15662j = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15663k = false;

    /* renamed from: l, reason: collision with root package name */
    public long f15664l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final ConcurrentHashMap f15665m = new ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final b f15666n = new b(this);

    /* renamed from: o, reason: collision with root package name */
    public final c f15667o = new c(this);

    /* renamed from: p, reason: collision with root package name */
    public final d f15668p = new d(this);

    /* renamed from: q, reason: collision with root package name */
    public boolean f15669q = false;

    /* renamed from: r, reason: collision with root package name */
    public final e f15670r = new e(this);

    public final void a(int i8) {
        int i9 = this.f15662j;
        if (i9 != i8) {
            if (this.f15653a) {
                ZLogger.d(String.format(Locale.US, "ScanState 0x%02X >> 0x%02X", Integer.valueOf(i9), Integer.valueOf(i8)));
            }
            this.f15662j = i8;
            ScannerCallback scannerCallback = this.f15658f;
            if (scannerCallback != null) {
                scannerCallback.onScanStateChanged(i8);
            } else {
                ZLogger.v(this.f15654b, "no callback registered");
            }
        }
        int i10 = this.f15662j;
        if (i10 == 0 || i10 == 3) {
            Handler handler = this.f15660h;
            if (handler != null) {
                handler.removeCallbacks(this.f15668p);
                this.f15660h.removeCallbacks(this.f15667o);
                this.f15660h.removeCallbacks(this.f15670r);
            }
            boolean z7 = this.f15669q;
            if (z7) {
                if (this.f15660h != null) {
                    ZLogger.v(this.f15653a, "wait to start auto scan");
                    this.f15660h.postDelayed(this.f15670r, this.f15657e.getAutoScanDelay());
                    return;
                }
                return;
            }
            if (this.f15654b) {
                ZLogger.v("continousScanEnabled=" + z7);
            }
        }
    }

    public abstract boolean a(BluetoothDevice bluetoothDevice);

    public abstract boolean b();

    public BluetoothDevice getPairedDevice(String str) {
        BluetoothAdapter bluetoothAdapter;
        if (StringUtils.isEmpty(str) || (bluetoothAdapter = this.f15661i) == null) {
            return null;
        }
        for (BluetoothDevice bluetoothDevice : bluetoothAdapter.getBondedDevices()) {
            if (str.equals(bluetoothDevice.getAddress())) {
                return bluetoothDevice;
            }
        }
        return null;
    }

    public List getPairedDevices() {
        ArrayList arrayList = new ArrayList();
        if (this.f15661i != null) {
            if (!this.f15657e.isReusePairedDeviceEnabled()) {
                ZLogger.v(this.f15653a, "don't reuse paired device");
                return arrayList;
            }
            for (BluetoothDevice bluetoothDevice : this.f15661i.getBondedDevices()) {
                if (a(bluetoothDevice, -1000)) {
                    arrayList.add(new ExtendedBluetoothDevice(bluetoothDevice, bluetoothDevice.getName(), -1000, bluetoothDevice.getBondState() == 12, false));
                }
            }
        }
        return arrayList;
    }

    public List getPairedDevicesByProfile(int i8) {
        if (i8 != 1) {
            return getPairedDevices();
        }
        ParcelUuid[] parcelUuidArr = BluetoothUuidCompat.HEADSET_PROFILE_UUIDS;
        ArrayList arrayList = new ArrayList();
        BluetoothAdapter bluetoothAdapter = this.f15661i;
        if (bluetoothAdapter != null) {
            for (BluetoothDevice bluetoothDevice : bluetoothAdapter.getBondedDevices()) {
                if (BluetoothUuidCompat.containsAnyUuid(bluetoothDevice.getUuids(), parcelUuidArr)) {
                    boolean isConnected = BluetoothDeviceCompat.isConnected(bluetoothDevice);
                    arrayList.add(new ExtendedBluetoothDevice(bluetoothDevice, bluetoothDevice.getName(), -1000, bluetoothDevice.getBondState() == 12, isConnected ? isConnected : BluetoothProfileManager.getInstance().getConnectionState(1, bluetoothDevice) == 2 || BluetoothProfileManager.getInstance().getConnectionState(2, bluetoothDevice) == 2));
                }
            }
        }
        return arrayList;
    }

    public boolean isBluetoothEnabled() {
        BluetoothAdapter bluetoothAdapter = this.f15661i;
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    public abstract boolean isScanning();

    public void onDestroy() {
        ZLogger.d(this.f15653a, "onDestroy");
        Context context = this.f15656d;
        if (context != null) {
            try {
                context.unregisterReceiver(this.f15666n);
            } catch (Exception unused) {
            }
        }
        this.f15658f = null;
        stopScan();
        Handler handler = this.f15660h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f15660h = null;
        }
        HandlerThread handlerThread = this.f15659g;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f15659g = null;
        }
        this.f15663k = false;
        ZLogger.v("scan presenter destroyed");
    }

    public synchronized boolean startScan() {
        if (!this.f15663k) {
            ZLogger.w("presenter not initialized");
            return false;
        }
        if (!isBluetoothEnabled()) {
            ZLogger.w("Bluetooth not enabled, ignore scan process.");
            return false;
        }
        int i8 = this.f15662j;
        if (i8 != 1 && i8 != 2) {
            a(1);
            Handler handler = this.f15660h;
            if (handler != null) {
                handler.removeCallbacks(this.f15668p);
                this.f15660h.removeCallbacks(this.f15667o);
                this.f15660h.removeCallbacks(this.f15670r);
            }
            this.f15664l = 0L;
            ScannerParams scannerParams = this.f15657e;
            if (scannerParams != null) {
                if (this.f15653a) {
                    ZLogger.v(scannerParams.toString());
                }
                this.f15669q = this.f15657e.isAutoDiscovery();
            } else {
                this.f15669q = false;
            }
            this.f15665m.clear();
            if (!startScanImpl()) {
                ZLogger.v("scanLeDevice failed");
                stopScan();
                return false;
            }
            if (this.f15660h != null) {
                if (this.f15655c) {
                    Locale locale = Locale.US;
                    ZLogger.v("wait to check scan period(30000)");
                }
                this.f15660h.removeCallbacks(this.f15667o);
                this.f15660h.postDelayed(this.f15667o, 30000L);
            } else {
                ZLogger.v(this.f15655c, "mHandler == null");
            }
            return true;
        }
        ZLogger.w(this.f15653a, "scan procedure is already started.");
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis < this.f15664l) {
            this.f15664l = 0L;
        }
        if (timeInMillis - this.f15664l > 30000) {
            Locale locale2 = Locale.US;
            ZLogger.d("exceed 30000 ms , no scan response received since last time");
            b();
        } else if (this.f15660h != null) {
            if (this.f15655c) {
                Locale locale3 = Locale.US;
                ZLogger.v("wait to check scan period(30000)");
            }
            this.f15660h.removeCallbacks(this.f15667o);
            this.f15660h.postDelayed(this.f15667o, 30000L);
        } else {
            ZLogger.v(this.f15655c, "mHandler == null");
        }
        return true;
    }

    public abstract boolean startScanImpl();

    public abstract boolean stopScan();

    public final void a(BluetoothDevice bluetoothDevice, int i8, byte[] bArr) {
        this.f15664l = Calendar.getInstance().getTimeInMillis();
        int i9 = this.f15662j;
        if (i9 == 1) {
            a(2);
        } else if (i9 != 2) {
            ZLogger.v(String.format("stop to calibration state: 0x%04X", Integer.valueOf(i9)));
            b();
            return;
        }
        if (bluetoothDevice == null) {
            ZLogger.d("ignore, device is null");
            return;
        }
        String address = bluetoothDevice.getAddress();
        ExtendedBluetoothDevice extendedBluetoothDevice = new ExtendedBluetoothDevice(bluetoothDevice, bluetoothDevice.getName(), i8, bluetoothDevice.getBondState() == 12, false, bArr);
        if (this.f15657e.isDuplicateCheckEnabled() && this.f15665m.containsKey(address)) {
            if (!this.f15657e.isExpirationCheckEnabled()) {
                this.f15665m.put(address, extendedBluetoothDevice);
                boolean z7 = this.f15654b;
                Locale locale = Locale.US;
                ZLogger.v(z7, "ignore duplicate device:" + BluetoothHelper.formatAddress(address, true) + "(" + extendedBluetoothDevice.updateTime + ")");
                return;
            }
            ExtendedBluetoothDevice extendedBluetoothDevice2 = (ExtendedBluetoothDevice) this.f15665m.get(address);
            if (extendedBluetoothDevice2 != null && !extendedBluetoothDevice2.isUpdateExpired(this.f15657e.getExpirationTimeout())) {
                boolean z8 = this.f15654b;
                Locale locale2 = Locale.US;
                ZLogger.v(z8, "ignore not expired device:" + BluetoothHelper.formatAddress(address, true) + "(" + extendedBluetoothDevice.updateTime + ")");
                return;
            }
        }
        if (a(bluetoothDevice, i8)) {
            this.f15665m.put(address, extendedBluetoothDevice);
            if (this.f15654b) {
                Locale locale3 = Locale.US;
                ZLogger.v("notifyNewDeviceFound(" + extendedBluetoothDevice.updateTime + "): " + BluetoothHelper.dumpBluetoothDevice(extendedBluetoothDevice.device));
            }
            ScannerCallback scannerCallback = this.f15658f;
            if (scannerCallback != null) {
                scannerCallback.onNewDevice(extendedBluetoothDevice);
            } else {
                ZLogger.v(this.f15655c, "no callback registered");
            }
            if (this.f15657e.getScanMechanism() == 1) {
                ZLogger.d(this.f15653a, "SCAN_MECHANISM_FILTER_ONE > scanDevice(false)");
                b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List getPairedDevices(int i8) {
        boolean z7;
        ArrayList arrayList = new ArrayList();
        BluetoothAdapter bluetoothAdapter = this.f15661i;
        if (bluetoothAdapter != null) {
            for (BluetoothDevice bluetoothDevice : bluetoothAdapter.getBondedDevices()) {
                if (bluetoothDevice.getBluetoothClass().getMajorDeviceClass() == i8 || (1024 == i8 && BluetoothClassCompat.doesClassMatch(bluetoothDevice.getBluetoothClass(), 0, false))) {
                    if (1024 == i8) {
                        int connectionState = BluetoothProfileManager.getInstance().getConnectionState(1, bluetoothDevice);
                        int connectionState2 = BluetoothProfileManager.getInstance().getConnectionState(2, bluetoothDevice);
                        Locale locale = Locale.US;
                        ZLogger.v(bluetoothDevice.getAddress() + ", hfpState= " + connectionState + ",a2dpState= " + connectionState2);
                        if (2 == connectionState || 2 == connectionState2) {
                            z7 = true;
                            arrayList.add(new ExtendedBluetoothDevice(bluetoothDevice, bluetoothDevice.getName(), -1000, bluetoothDevice.getBondState() == 12, z7));
                        }
                    }
                    z7 = false;
                    arrayList.add(new ExtendedBluetoothDevice(bluetoothDevice, bluetoothDevice.getName(), -1000, bluetoothDevice.getBondState() == 12, z7));
                }
            }
        }
        return arrayList;
    }

    public boolean a() {
        if (this.f15663k) {
            ZLogger.w("please call ScannerPresenter.onDestroy() method first");
            return false;
        }
        this.f15653a = RtkCore.DEBUG;
        this.f15654b = RtkCore.VDBG;
        this.f15655c = RtkCore.TDBG;
        this.f15661i = BluetoothAdapterCompat.getBluetoothAdapter(this.f15656d);
        if (this.f15657e == null) {
            ZLogger.v(this.f15654b, "create new ScannerParams");
            this.f15657e = new ScannerParams();
        }
        if (this.f15660h == null) {
            HandlerThread handlerThread = new HandlerThread("ScannerPresenter");
            this.f15659g = handlerThread;
            handlerThread.start();
            this.f15660h = new Handler(this.f15659g.getLooper());
        }
        if (this.f15658f == null) {
            ZLogger.v(this.f15654b, "callback is null");
        }
        RtkContextCompat.registerReceiver(this.f15656d, this.f15666n, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        this.f15663k = true;
        ZLogger.v(this.f15653a, "scan presenter initialized");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x009b, code lost:
    
        if (r4.f15657e.isNameNullable() == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(BluetoothDevice bluetoothDevice, int i8) {
        BluetoothClass bluetoothClass;
        ZLogger.v(this.f15653a, BluetoothHelper.dumpBluetoothDevice(bluetoothDevice));
        if (this.f15657e.getRssiFilter() > -1000 && this.f15657e.getRssiFilter() > i8) {
            boolean z7 = this.f15653a;
            Locale locale = Locale.US;
            ZLogger.v(z7, "low rssi:(" + i8 + ") < " + this.f15657e.getRssiFilter());
            return false;
        }
        String name = bluetoothDevice.getName();
        if (TextUtils.isEmpty(this.f15657e.getNameFilter())) {
            if (TextUtils.isEmpty(name)) {
            }
            if (TextUtils.isEmpty(this.f15657e.getAddressFilter())) {
            }
            bluetoothClass = bluetoothDevice.getBluetoothClass();
            if (7936 != bluetoothClass.getMajorDeviceClass()) {
                if (bluetoothClass.getMajorDeviceClass() != this.f15657e.getMajorDeviceClass()) {
                }
            }
            return a(bluetoothDevice);
        }
        if (!TextUtils.isEmpty(name)) {
            if (!DataConverter.equals(this.f15657e.getNameFilter(), name) && (!this.f15657e.isNameFuzzyMatchEnable() || !name.contains(this.f15657e.getNameFilter()))) {
                if (this.f15654b) {
                    ZLogger.v("conflict name: " + name);
                }
            }
            if (TextUtils.isEmpty(this.f15657e.getAddressFilter()) && !DataConverter.equals(this.f15657e.getAddressFilter(), bluetoothDevice.getAddress())) {
                if (this.f15654b) {
                    ZLogger.v("address not match:" + BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true));
                }
                return false;
            }
            bluetoothClass = bluetoothDevice.getBluetoothClass();
            if (7936 != bluetoothClass.getMajorDeviceClass() && bluetoothClass.getMajorDeviceClass() != 0) {
                if (bluetoothClass.getMajorDeviceClass() != this.f15657e.getMajorDeviceClass()) {
                    if (this.f15654b) {
                        ZLogger.v("major device class matched");
                    }
                } else if (this.f15657e.getMajorDeviceClass() == 1024 && !BluetoothClassCompat.doesClassMatch(bluetoothClass, 0, false) && !BluetoothClassCompat.doesClassMatch(bluetoothClass, 1, false) && !BluetoothUuidCompat.containsAnyUuid(bluetoothDevice.getUuids(), new ParcelUuid[]{f15652s})) {
                    if (this.f15654b) {
                        ZLogger.v("major device class filter failed");
                    }
                    return false;
                }
            }
            return a(bluetoothDevice);
        }
        return false;
    }
}
