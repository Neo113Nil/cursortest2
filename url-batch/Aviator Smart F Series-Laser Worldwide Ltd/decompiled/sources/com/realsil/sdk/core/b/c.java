package com.realsil.sdk.core.b;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.C;
import com.realsil.sdk.core.RtkCore;
import com.realsil.sdk.core.bluetooth.RtkBluetoothManager;
import com.realsil.sdk.core.bluetooth.compat.BluetoothAdapterCompat;
import com.realsil.sdk.core.bluetooth.compat.BluetoothGattCompat;
import com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat;
import com.realsil.sdk.core.bluetooth.gatt.RtkGattBearInterface;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.core.utility.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public abstract class c {
    public static final String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static boolean CLOSE_GATT_ENABLED = true;
    public static boolean DUMP_SERVICE = false;
    public static final int PHY_LE_1M_MASK = 1;
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_DISCONNECTED = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15400a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15401b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15402c;

    /* renamed from: d, reason: collision with root package name */
    public BluetoothManager f15403d;

    /* renamed from: e, reason: collision with root package name */
    public BluetoothAdapter f15404e;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f15409j;

    /* renamed from: l, reason: collision with root package name */
    public final Context f15411l;

    /* renamed from: m, reason: collision with root package name */
    public RtkBluetoothManager f15412m;

    /* renamed from: n, reason: collision with root package name */
    public RtkGattBearInterface f15413n;
    public static int SDK_INT = Build.VERSION.SDK_INT;
    public static final UUID CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: k, reason: collision with root package name */
    public final Object f15410k = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final a f15414o = new a(this);

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f15406g = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f15408i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f15407h = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f15405f = new CopyOnWriteArrayList();

    public c(Context context) {
        this.f15400a = false;
        this.f15401b = false;
        this.f15402c = false;
        this.f15411l = context;
        this.f15400a = RtkCore.DEBUG;
        this.f15401b = RtkCore.VDBG;
        this.f15402c = RtkCore.TDBG;
        a();
    }

    public static void a(c cVar, int i8) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (i8 != 10 || Build.VERSION.SDK_INT < 29 || (copyOnWriteArrayList = cVar.f15405f) == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        ZLogger.d(cVar.f15400a, "Bluetooth is turned off, disconnect all client connections");
        Iterator it = cVar.f15405f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            BluetoothGatt bluetoothGatt = cVar.getBluetoothGatt(str);
            if (cVar.isConnected(str)) {
                cVar.f15408i.put(str, 0);
                cVar.a(str, bluetoothGatt, 0, 0);
            }
        }
    }

    public void close(String str) {
        closeGatt(str, CLOSE_GATT_ENABLED);
    }

    public void closeAll() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15405f;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator it = this.f15405f.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                disconnect(str);
                close(str);
            }
        }
        RtkBluetoothManager rtkBluetoothManager = this.f15412m;
        if (rtkBluetoothManager != null) {
            rtkBluetoothManager.removeManagerCallback(this.f15414o);
        }
    }

    public synchronized void closeGatt(String str) {
        closeGatt(str, CLOSE_GATT_ENABLED);
    }

    public boolean connect(String str, int i8, int i9, BluetoothGattCallbackCompat bluetoothGattCallbackCompat) {
        return connect(str, false, i8, i9, bluetoothGattCallbackCompat);
    }

    public boolean disconnect(String str) {
        BluetoothGatt bluetoothGatt = getBluetoothGatt(str);
        if (bluetoothGatt == null) {
            return false;
        }
        if (!isConnected(str)) {
            if (this.f15400a) {
                ZLogger.v("connection already disconnected : " + BluetoothHelper.formatAddress(str, true));
            }
            a(str, bluetoothGatt, 0, 0);
            return true;
        }
        if (this.f15400a) {
            ZLogger.v("disconnect : " + BluetoothHelper.formatAddress(str, true));
        }
        bluetoothGatt.disconnect();
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e8) {
            ZLogger.w(this.f15401b, e8.toString());
        }
        return true;
    }

    public boolean disconnectGatt(String str) {
        return disconnect(str);
    }

    public BluetoothAdapter getBluetoothAdapter() {
        return this.f15404e;
    }

    public BluetoothDevice getBluetoothDevice(String str) {
        BluetoothGatt bluetoothGatt = getBluetoothGatt(str);
        if (bluetoothGatt != null) {
            return bluetoothGatt.getDevice();
        }
        if (!this.f15401b) {
            return null;
        }
        ZLogger.w("no bluetoothGatt exist for" + BluetoothHelper.formatAddress(str, true));
        return null;
    }

    public List<String> getBluetoothDeviceAddresss() {
        return this.f15405f;
    }

    public BluetoothGatt getBluetoothGatt(String str) {
        return (BluetoothGatt) this.f15406g.get(str);
    }

    public List<BluetoothGattCallbackCompat> getCallback(String str) {
        HashMap hashMap = this.f15407h;
        if (hashMap != null) {
            return (List) hashMap.get(str);
        }
        return null;
    }

    public BluetoothDevice getConnectedDevice() {
        Iterator it = this.f15405f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (isConnected(str)) {
                return getBluetoothGatt(str).getDevice();
            }
        }
        return null;
    }

    public ArrayList<BluetoothDevice> getConnectedDevices() {
        ArrayList<BluetoothDevice> arrayList = new ArrayList<>();
        Iterator it = this.f15405f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (isConnected(str)) {
                arrayList.add(getBluetoothGatt(str).getDevice());
            }
        }
        return arrayList;
    }

    public int getConnectionState(String str) {
        Integer num = (Integer) this.f15408i.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String getDeviceName(String str) {
        BluetoothDevice bluetoothDevice = getBluetoothDevice(str);
        return bluetoothDevice == null ? "" : bluetoothDevice.getName();
    }

    public BluetoothGattService getService(String str, UUID uuid) {
        BluetoothGattService bluetoothGattService = null;
        for (BluetoothGattService bluetoothGattService2 : getSupportedGattServices(str)) {
            if (bluetoothGattService2.getUuid().equals(uuid)) {
                bluetoothGattService = bluetoothGattService2;
            }
        }
        return bluetoothGattService;
    }

    public List<BluetoothGattService> getSupportedGattServices(String str) {
        ArrayList arrayList = new ArrayList();
        BluetoothGatt bluetoothGatt = getBluetoothGatt(str);
        return bluetoothGatt == null ? arrayList : bluetoothGatt.getServices();
    }

    public boolean isBluetoothSupported() {
        return this.f15404e != null || a();
    }

    public boolean isCallbackRegisted(String str, BluetoothGattCallbackCompat bluetoothGattCallbackCompat) {
        return isCallbackRegisterd(str, bluetoothGattCallbackCompat);
    }

    public boolean isCallbackRegisterd(String str, BluetoothGattCallbackCompat bluetoothGattCallbackCompat) {
        List<BluetoothGattCallbackCompat> callback = getCallback(str);
        return callback != null && callback.contains(bluetoothGattCallbackCompat);
    }

    public boolean isConnected(String str) {
        Integer num = (Integer) this.f15408i.get(str);
        return num != null && num.intValue() == 2;
    }

    public boolean isHostConnected(String str) {
        BluetoothManager bluetoothManager = this.f15403d;
        if (bluetoothManager == null) {
            if (this.f15400a) {
                ZLogger.w("mBluetoothManager == null");
            }
            return false;
        }
        List<BluetoothDevice> connectedDevices = bluetoothManager.getConnectedDevices(7);
        if (this.f15401b) {
            if (connectedDevices != null) {
                Iterator<BluetoothDevice> it = connectedDevices.iterator();
                while (it.hasNext()) {
                    if (it.next().getAddress().equals(str)) {
                        ZLogger.v("addr: " + BluetoothHelper.formatAddress(str, true) + ", Connected.");
                        return true;
                    }
                }
            }
            ZLogger.v("addr: " + BluetoothHelper.formatAddress(str, true) + ", Disconnected.");
        }
        return false;
    }

    public boolean readCharacteristic(String str, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String str2;
        if (this.f15404e == null) {
            str2 = "BluetoothAdapter not initialized";
        } else {
            BluetoothGatt bluetoothGatt = getBluetoothGatt(str);
            if (bluetoothGatt != null) {
                if (this.f15401b) {
                    ZLogger.v("readCharacteristic(" + BluetoothHelper.formatAddress(str, true) + ", " + bluetoothGattCharacteristic.getUuid().toString() + ")");
                }
                return bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
            }
            str2 = "unspecified address.";
        }
        ZLogger.w(str2);
        return false;
    }

    public synchronized boolean readCharacteristicSync(String str, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f15409j = false;
        if (!readCharacteristic(str, bluetoothGattCharacteristic)) {
            ZLogger.w("readCharacteristic failed");
            return false;
        }
        synchronized (this.f15410k) {
            if (!this.f15409j) {
                try {
                    this.f15410k.wait(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                } catch (InterruptedException unused) {
                }
                if (!this.f15409j && this.f15401b) {
                    Locale locale = Locale.US;
                    ZLogger.v("readCharacteristic timeout(3000 ms)");
                }
            }
        }
        return true;
    }

    public synchronized void registerCallback(String str, BluetoothGattCallbackCompat bluetoothGattCallbackCompat) {
        try {
            List<BluetoothGattCallbackCompat> callback = getCallback(str);
            if (callback == null) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                copyOnWriteArrayList.add(bluetoothGattCallbackCompat);
                if (this.f15402c) {
                    ZLogger.v("add callback for " + BluetoothHelper.formatAddress(str, true));
                }
                this.f15407h.put(str, copyOnWriteArrayList);
                return;
            }
            if (callback.contains(bluetoothGattCallbackCompat)) {
                return;
            }
            callback.add(bluetoothGattCallbackCompat);
            if (this.f15401b) {
                ZLogger.v("append callback for " + BluetoothHelper.formatAddress(str, true));
            }
            this.f15407h.put(str, callback);
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean requestConnectionPriority(String str, int i8) {
        String str2;
        if (StringUtils.isEmpty(str)) {
            str2 = "address can not be null or empty";
        } else if (i8 < 0 || i8 > 2) {
            str2 = "connectionPriority not within valid range";
        } else {
            BluetoothGatt bluetoothGatt = getBluetoothGatt(str);
            if (bluetoothGatt != null) {
                return bluetoothGatt.requestConnectionPriority(i8);
            }
            str2 = "no GATT client registered";
        }
        ZLogger.w(str2);
        return false;
    }

    public boolean setCharacteristicIndication(String str, BluetoothGattCharacteristic bluetoothGattCharacteristic, UUID uuid, boolean z7) {
        String str2;
        if (this.f15404e == null) {
            str2 = "BluetoothAdapter not initialized";
        } else {
            BluetoothGatt bluetoothGatt = getBluetoothGatt(str);
            if (bluetoothGatt == null) {
                str2 = "BluetoothGatt can not be null, address=" + BluetoothHelper.formatAddress(str, true);
            } else if (bluetoothGattCharacteristic == null) {
                str2 = "characteristic is null";
            } else {
                if (this.f15400a) {
                    ZLogger.d("address:=" + BluetoothHelper.formatAddress(str, true) + ", enabled=" + z7);
                }
                bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z7);
                BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(uuid);
                if (descriptor != null) {
                    return z7 ? BluetoothGattCompat.writeDescriptor(bluetoothGatt, descriptor, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE) : BluetoothGattCompat.writeDescriptor(bluetoothGatt, descriptor, BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                }
                str2 = "descriptor not found, uuid=" + uuid.toString();
            }
        }
        ZLogger.w(str2);
        return false;
    }

    public boolean setCharacteristicNotification(String str, BluetoothGattCharacteristic bluetoothGattCharacteristic, UUID uuid, boolean z7) {
        String str2;
        if (this.f15404e == null) {
            str2 = "BluetoothAdapter not initialized";
        } else {
            BluetoothGatt bluetoothGatt = getBluetoothGatt(str);
            if (bluetoothGatt == null) {
                str2 = "BluetoothGatt can not be null, addr=" + BluetoothHelper.formatAddress(str, true);
            } else {
                if (this.f15400a) {
                    ZLogger.d("addr:=" + BluetoothHelper.formatAddress(str, true) + ", enabled=" + z7);
                }
                bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z7);
                BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(uuid);
                if (descriptor != null) {
                    return z7 ? BluetoothGattCompat.writeDescriptor(bluetoothGatt, descriptor, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE) : BluetoothGattCompat.writeDescriptor(bluetoothGatt, descriptor, BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                }
                str2 = "descriptor not found, uuid=" + uuid.toString();
            }
        }
        ZLogger.w(str2);
        return false;
    }

    public boolean setCharacteristicNotificationSync(String str, BluetoothGattCharacteristic bluetoothGattCharacteristic, UUID uuid, boolean z7) {
        this.f15409j = false;
        if (!setCharacteristicNotification(str, bluetoothGattCharacteristic, uuid, z7)) {
            return false;
        }
        synchronized (this.f15410k) {
            if (!this.f15409j) {
                try {
                    this.f15410k.wait(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                } catch (InterruptedException unused) {
                }
                if (!this.f15409j && this.f15401b) {
                    Locale locale = Locale.US;
                    ZLogger.v("setCharacteristicNotification timeout(3000 ms)");
                }
            }
        }
        return true;
    }

    public void setGattBearInterface(RtkGattBearInterface rtkGattBearInterface) {
        this.f15413n = rtkGattBearInterface;
    }

    public void unRegisterAllCallback(String str) {
        if (this.f15407h.get(str) == null) {
            return;
        }
        if (this.f15400a) {
            ZLogger.v("clean callback for " + BluetoothHelper.formatAddress(str, true));
        }
        this.f15407h.remove(str);
    }

    public synchronized void unRegisterCallback(String str, BluetoothGattCallbackCompat bluetoothGattCallbackCompat) {
        List<BluetoothGattCallbackCompat> callback = getCallback(str);
        if (callback == null) {
            if (this.f15401b) {
                ZLogger.v("callback not registered, addr= " + BluetoothHelper.formatAddress(str, true));
            }
        } else if (callback.contains(bluetoothGattCallbackCompat)) {
            callback.remove(bluetoothGattCallbackCompat);
            if (this.f15400a) {
                ZLogger.v("remove callback for " + BluetoothHelper.formatAddress(str, true));
            }
            this.f15407h.put(str, callback);
        }
    }

    public boolean writeCharacteristic(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr) {
        if (this.f15404e == null) {
            ZLogger.w("BluetoothAdapter not initialized");
            return false;
        }
        if (this.f15402c) {
            ZLogger.v("<< (" + bArr.length + ") " + DataConverter.bytes2Hex(bArr));
        }
        return BluetoothGattCompat.writeCharacteristic(bluetoothGatt, bluetoothGattCharacteristic, bArr);
    }

    public synchronized boolean writeCharacteristicSync(String str, BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr) {
        this.f15409j = false;
        if (!writeCharacteristic(str, bluetoothGattCharacteristic, bArr)) {
            return false;
        }
        synchronized (this.f15410k) {
            if (!this.f15409j) {
                try {
                    this.f15410k.wait(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                } catch (InterruptedException unused) {
                }
                if (!this.f15409j && this.f15401b) {
                    Locale locale = Locale.US;
                    ZLogger.v("writeCharacteristic timeout(3000 ms)");
                }
            }
        }
        return true;
    }

    public boolean writeDescriptor(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattDescriptor bluetoothGattDescriptor, @NonNull byte[] bArr) {
        return BluetoothGattCompat.writeDescriptor(bluetoothGatt, bluetoothGattDescriptor, bArr);
    }

    public final void a(String str, BluetoothGatt bluetoothGatt, int i8, int i9) {
        List list = (List) this.f15407h.get(str);
        if (list == null || list.isEmpty()) {
            ZLogger.v(this.f15402c, "dispatchConnectionStateChanged.no callback registered for " + str);
            return;
        }
        boolean z7 = this.f15402c;
        Locale locale = Locale.US;
        ZLogger.v(z7, "dispatchConnectionStateChanged " + list.size() + " for " + str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BluetoothGattCallbackCompat) it.next()).onConnectionStateChange(bluetoothGatt, i8, i9);
        }
    }

    public synchronized void closeGatt(String str, boolean z7) {
        if (StringUtils.isEmpty(str)) {
            ZLogger.d(this.f15401b, "Invalid address");
            return;
        }
        BluetoothGatt bluetoothGatt = getBluetoothGatt(str);
        if (bluetoothGatt != null) {
            if (z7) {
                if (this.f15401b) {
                    ZLogger.v("closeGatt for " + BluetoothHelper.formatAddress(str, true));
                }
                bluetoothGatt.close();
            }
            this.f15406g.remove(str);
        }
        if (this.f15407h != null) {
            if (this.f15401b) {
                ZLogger.v("clean callback for " + BluetoothHelper.formatAddress(str, true));
            }
            this.f15407h.remove(str);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15405f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(str);
        }
    }

    public boolean connect(String str, int i8, BluetoothGattCallbackCompat bluetoothGattCallbackCompat) {
        return Build.VERSION.SDK_INT >= 26 ? connect(str, false, i8, 1, bluetoothGattCallbackCompat) : connect(str, false, i8, 1, bluetoothGattCallbackCompat);
    }

    public boolean setCharacteristicIndication(String str, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z7) {
        return setCharacteristicIndication(str, bluetoothGattCharacteristic, CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID, z7);
    }

    public boolean setCharacteristicNotification(String str, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z7) {
        return setCharacteristicNotification(str, bluetoothGattCharacteristic, CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID, z7);
    }

    public boolean writeCharacteristic(String str, BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr) {
        if (!isConnected(str)) {
            ZLogger.w(this.f15400a, "connection already disconnected");
            return false;
        }
        BluetoothGatt bluetoothGatt = getBluetoothGatt(str);
        if (bluetoothGatt == null) {
            return false;
        }
        return writeCharacteristic(bluetoothGatt, bluetoothGattCharacteristic, bArr);
    }

    public final boolean a() {
        String str;
        if (this.f15403d == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) this.f15411l.getSystemService("bluetooth");
            this.f15403d = bluetoothManager;
            if (bluetoothManager == null) {
                str = "BLUETOOTH_SERVICE not supported.";
                ZLogger.w(str);
                return false;
            }
        }
        if (this.f15404e == null) {
            BluetoothAdapter bluetoothAdapter = BluetoothAdapterCompat.getBluetoothAdapter(this.f15411l);
            this.f15404e = bluetoothAdapter;
            if (bluetoothAdapter == null) {
                str = "BluetoothAdapter is not supported";
                ZLogger.w(str);
                return false;
            }
        }
        RtkBluetoothManager rtkBluetoothManager = RtkBluetoothManager.getInstance();
        this.f15412m = rtkBluetoothManager;
        if (rtkBluetoothManager == null) {
            RtkBluetoothManager.initial(this.f15411l);
            this.f15412m = RtkBluetoothManager.getInstance();
        }
        RtkBluetoothManager rtkBluetoothManager2 = this.f15412m;
        if (rtkBluetoothManager2 != null) {
            rtkBluetoothManager2.addManagerCallback(this.f15414o);
        } else {
            ZLogger.w(this.f15400a, "RtkBluetoothManager not initialized");
        }
        ZLogger.v(this.f15401b, "initialize BluetoothGattClientManager success");
        return true;
    }

    public boolean connect(String str, BluetoothGattCallbackCompat bluetoothGattCallbackCompat) {
        int i8 = Build.VERSION.SDK_INT;
        return connect(str, 2, bluetoothGattCallbackCompat);
    }

    public boolean connect(String str, boolean z7, int i8, int i9, BluetoothGattCallbackCompat bluetoothGattCallbackCompat) {
        BluetoothGatt connectGatt;
        BluetoothGatt bluetoothGatt;
        if (str == null) {
            ZLogger.w("unspecified address.");
            return false;
        }
        BluetoothAdapter bluetoothAdapter = this.f15404e;
        BluetoothDevice bluetoothDevice = null;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            ZLogger.w("BT not enabled");
        } else {
            try {
                bluetoothDevice = this.f15404e.getRemoteDevice(str);
            } catch (Exception unused) {
            }
        }
        if (bluetoothDevice == null) {
            ZLogger.w("Device not found.  Unable to connect.");
            return false;
        }
        if (this.f15405f.contains(str) && (bluetoothGatt = getBluetoothGatt(str)) != null) {
            if (isConnected(str)) {
                if (this.f15401b) {
                    ZLogger.v(BluetoothHelper.formatAddress(str, true) + " already connected");
                }
                registerCallback(str, bluetoothGattCallbackCompat);
                if (bluetoothGattCallbackCompat != null) {
                    bluetoothGattCallbackCompat.onConnectionStateChange(bluetoothGatt, 0, 2);
                }
                return true;
            }
            if (z7) {
                registerCallback(str, bluetoothGattCallbackCompat);
                if (this.f15401b) {
                    ZLogger.v("re-connect previous device: " + BluetoothHelper.formatAddress(str, true));
                }
                if (bluetoothGatt.connect()) {
                    this.f15408i.put(str, 1);
                    return true;
                }
                ZLogger.d(this.f15400a, "reconnect failed.");
                closeGatt(str);
                return false;
            }
            ZLogger.d(this.f15400a, "clean old connection cache.");
            closeGatt(str);
        }
        if (this.f15400a) {
            ZLogger.v("create connection to " + BluetoothHelper.formatAddress(str, true));
        }
        registerCallback(str, bluetoothGattCallbackCompat);
        this.f15408i.put(str, 1);
        RtkGattBearInterface rtkGattBearInterface = this.f15413n;
        if (rtkGattBearInterface != null) {
            connectGatt = rtkGattBearInterface.connect(this.f15411l, bluetoothDevice, z7, i8, i9, new b(this));
        } else {
            int i10 = Build.VERSION.SDK_INT;
            connectGatt = i10 >= 26 ? bluetoothDevice.connectGatt(this.f15411l, z7, new b(this), i8, i9) : i10 >= 23 ? bluetoothDevice.connectGatt(this.f15411l, z7, new b(this), i8) : bluetoothDevice.connectGatt(this.f15411l, z7, new b(this));
        }
        if (connectGatt == null) {
            ZLogger.w(this.f15400a, "unable to connect gatt.");
            this.f15408i.put(str, 0);
            closeGatt(str);
            return false;
        }
        this.f15406g.put(str, connectGatt);
        if (!this.f15405f.contains(str)) {
            this.f15405f.add(str);
        }
        return true;
    }
}
