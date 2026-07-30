package com.realsil.sdk.core.bluetooth.connection;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.android.exoplayer2.C;
import com.realsil.sdk.core.RtkCore;
import com.realsil.sdk.core.bluetooth.BluetoothProfileCallback;
import com.realsil.sdk.core.bluetooth.BluetoothProfileManager;
import com.realsil.sdk.core.bluetooth.RtkBluetoothManager;
import com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback;
import com.realsil.sdk.core.bluetooth.compat.BluetoothAdapterCompat;
import com.realsil.sdk.core.bluetooth.compat.BluetoothDeviceCompat;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.Locale;

/* loaded from: classes4.dex */
public class BluetoothClient {
    public static final int STATE_BONDING = 5;
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_DISCONNECTING = 3;
    public static final int STATE_LISTEN = 4;
    public static final int STATE_NONE = 0;

    /* renamed from: g, reason: collision with root package name */
    public RtkBluetoothManager f15455g;

    @Keep
    protected BluetoothAdapter mBluetoothAdapter;

    @Keep
    protected BluetoothManager mBluetoothManager;

    @Keep
    protected BluetoothClientCallback mCallback;

    @Keep
    protected Context mContext;

    @Keep
    protected boolean DBG = false;

    @Keep
    protected boolean VDBG = false;

    @Keep
    protected boolean TVDBG = false;

    @Keep
    protected String mDeviceAddress = "";

    @Keep
    protected int mBondState = 10;

    /* renamed from: a, reason: collision with root package name */
    public final Object f15449a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Object f15450b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public int f15451c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15452d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f15453e = 20;

    /* renamed from: f, reason: collision with root package name */
    public final DeviceConfigInfo f15454f = new DeviceConfigInfo();

    /* renamed from: h, reason: collision with root package name */
    public final Object f15456h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final BluetoothProfileCallback f15457i = new BluetoothProfileCallback() { // from class: com.realsil.sdk.core.bluetooth.connection.BluetoothClient.1
        @Override // com.realsil.sdk.core.bluetooth.BluetoothProfileCallback
        public void onA2dpStateChanged(BluetoothDevice bluetoothDevice, int i8) {
            super.onA2dpStateChanged(bluetoothDevice, i8);
            if (BluetoothClient.this.isDeviceChanged(bluetoothDevice)) {
                return;
            }
            if (i8 == 2) {
                ZLogger.v(BluetoothClient.this.DBG, "A2DP connected");
                synchronized (BluetoothClient.this.f15449a) {
                    BluetoothClient.this.f15449a.notifyAll();
                }
                return;
            }
            if (i8 == 0) {
                ZLogger.v(BluetoothClient.this.DBG, "A2DP disconnected");
                synchronized (BluetoothClient.this.f15449a) {
                    BluetoothClient.this.f15449a.notifyAll();
                }
            }
        }

        @Override // com.realsil.sdk.core.bluetooth.BluetoothProfileCallback
        public void onHfpConnectionStateChanged(BluetoothDevice bluetoothDevice, int i8) {
            super.onHfpConnectionStateChanged(bluetoothDevice, i8);
            if (BluetoothClient.this.isDeviceChanged(bluetoothDevice)) {
                return;
            }
            if (i8 == 2) {
                ZLogger.v(BluetoothClient.this.DBG, "HFP connected");
                synchronized (BluetoothClient.this.f15450b) {
                    BluetoothClient.this.f15450b.notifyAll();
                }
                return;
            }
            if (i8 == 0) {
                ZLogger.v(BluetoothClient.this.DBG, "HFP disconnected");
                synchronized (BluetoothClient.this.f15450b) {
                    BluetoothClient.this.f15450b.notifyAll();
                }
            }
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public final RtkBluetoothManagerCallback f15458j = new RtkBluetoothManagerCallback() { // from class: com.realsil.sdk.core.bluetooth.connection.BluetoothClient.2
        @Override // com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback
        public void onBondStateChanged(BluetoothDevice bluetoothDevice, int i8) {
            super.onBondStateChanged(bluetoothDevice, i8);
            BluetoothClient.this.processBondStateChanged(bluetoothDevice, i8);
        }
    };

    public final BluetoothDevice a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
        if (bluetoothAdapter == null) {
            ZLogger.w(this.VDBG, "mBluetoothAdapter == null");
            return null;
        }
        try {
            return bluetoothAdapter.getRemoteDevice(str);
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z7;
        int connectionState = BluetoothProfileManager.getInstance().getConnectionState(1, this.mDeviceAddress);
        if (2 != connectionState) {
            if (1 == connectionState) {
                ZLogger.d(this.DBG, "HFP already connecting..., wait create hfp result");
                synchronized (this.f15450b) {
                    try {
                        this.f15450b.wait(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                    } catch (InterruptedException e8) {
                        ZLogger.w(e8.getMessage());
                    }
                }
                connectionState = BluetoothProfileManager.getInstance().getConnectionState(1, this.mDeviceAddress);
                ZLogger.v(this.VDBG, String.format("hfpState = 0x%02X", Integer.valueOf(connectionState)));
                if (2 != connectionState) {
                    ZLogger.d("hfp back connect failed");
                }
            }
            z7 = true;
            if (z7) {
                return;
            }
            ZLogger.v(this.VDBG, String.format("hfpState = 0x%02X", Integer.valueOf(connectionState)));
            if (!BluetoothProfileManager.getInstance().connectHfpAg(this.mDeviceAddress)) {
                ZLogger.w("connect Hfp failed");
                return;
            }
            ZLogger.v(this.VDBG, "wait create hfp result");
            int connectionState2 = BluetoothProfileManager.getInstance().getConnectionState(1, this.mDeviceAddress);
            ZLogger.v(this.VDBG, String.format("hfpState = 0x%02X", Integer.valueOf(connectionState2)));
            if (2 != connectionState2) {
                ZLogger.d("hfp connect failed");
                return;
            }
            return;
        }
        ZLogger.v("HFP already connected");
        z7 = false;
        if (z7) {
        }
    }

    public void c() {
        this.DBG = RtkCore.DEBUG;
        this.VDBG = RtkCore.VDBG;
        this.TVDBG = RtkCore.TDBG;
        this.mBluetoothAdapter = BluetoothAdapterCompat.getBluetoothAdapter(this.mContext);
        this.f15451c = 0;
        RtkBluetoothManager rtkBluetoothManager = RtkBluetoothManager.getInstance();
        this.f15455g = rtkBluetoothManager;
        if (rtkBluetoothManager == null) {
            RtkBluetoothManager.initial(this.mContext);
            this.f15455g = RtkBluetoothManager.getInstance();
        }
        RtkBluetoothManager rtkBluetoothManager2 = this.f15455g;
        if (rtkBluetoothManager2 != null) {
            rtkBluetoothManager2.addManagerCallback(this.f15458j);
        } else {
            ZLogger.w(this.DBG, "RtkBluetoothManager not initialized");
        }
        BluetoothProfileManager.getInstance().addManagerCallback(this.f15457i);
    }

    public synchronized void destroy() {
        try {
            if (this.VDBG) {
                ZLogger.v("destroy bluetooth client");
            }
            this.mCallback = null;
            RtkBluetoothManager rtkBluetoothManager = this.f15455g;
            if (rtkBluetoothManager != null) {
                rtkBluetoothManager.removeManagerCallback(this.f15458j);
            }
            BluetoothProfileManager.getInstance().removeManagerCallback(this.f15457i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void disconnect() {
        this.f15452d = false;
    }

    public void dispatchDataReceived(byte[] bArr) {
        BluetoothClientCallback bluetoothClientCallback = this.mCallback;
        if (bluetoothClientCallback != null) {
            bluetoothClientCallback.onDataReceive(this, bArr);
        }
    }

    public int getBondState() {
        BluetoothDevice a8 = a(this.mDeviceAddress);
        if (a8 == null) {
            return 10;
        }
        return a8.getBondState();
    }

    public int getConnectionState() {
        return this.f15451c;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDeviceAddress() {
        return this.mDeviceAddress;
    }

    public DeviceConfigInfo getDeviceConfigInfo() {
        return this.f15454f;
    }

    public int getMtuSize() {
        return this.f15453e;
    }

    public boolean isConnected() {
        return false;
    }

    public boolean isDeviceChanged(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return false;
        }
        if (this.mDeviceAddress == null) {
            return true;
        }
        return !r0.equals(bluetoothDevice.getAddress());
    }

    public void processBondStateChanged(BluetoothDevice bluetoothDevice, int i8) {
    }

    public synchronized void updateConnectionState(int i8) {
        updateConnectionState(i8, 0);
    }

    public final void a() {
        int connectionState = BluetoothProfileManager.getInstance().getConnectionState(2, this.mDeviceAddress);
        if (2 == connectionState) {
            ZLogger.v("A2DP already connected");
            return;
        }
        if (1 == connectionState) {
            synchronized (this.f15449a) {
                try {
                    ZLogger.d(this.DBG, "A2DP already connecting...");
                    this.f15449a.wait(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                } catch (InterruptedException e8) {
                    ZLogger.w(e8.getMessage());
                }
            }
            int connectionState2 = BluetoothProfileManager.getInstance().getConnectionState(2, this.mDeviceAddress);
            ZLogger.v(this.VDBG, String.format("a2dpState = 0x%02X", Integer.valueOf(connectionState2)));
            if (2 == connectionState2) {
                return;
            } else {
                ZLogger.d("A2DP back connect failed");
            }
        } else {
            ZLogger.v(this.VDBG, String.format("a2dpState = 0x%02X", Integer.valueOf(connectionState)));
        }
        if (!BluetoothProfileManager.getInstance().connectA2dpSource(this.mDeviceAddress)) {
            ZLogger.w("connect A2DP failed");
            return;
        }
        ZLogger.v(this.VDBG, "wait create A2DP result");
        synchronized (this.f15449a) {
            try {
                this.f15449a.wait(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
            } catch (InterruptedException e9) {
                ZLogger.w(e9.getMessage());
            }
        }
        int connectionState3 = BluetoothProfileManager.getInstance().getConnectionState(2, this.mDeviceAddress);
        ZLogger.v(this.VDBG, String.format("a2dpState = 0x%02X", Integer.valueOf(connectionState3)));
        if (2 != connectionState3) {
            ZLogger.w(this.DBG, "A2DP connect failed");
        }
    }

    public final boolean b(String str) {
        if (this.mDeviceAddress == null) {
            return true;
        }
        return !r0.equals(str);
    }

    @Deprecated
    public boolean isConnected(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return false;
        }
        return isConnected(bluetoothDevice.getAddress());
    }

    public synchronized void updateConnectionState(int i8, int i9) {
        try {
            int i10 = this.f15451c;
            if (i8 != i10) {
                ZLogger.v(String.format(Locale.US, "connection sate changed: %02X -> %02X(%d)", Integer.valueOf(i10), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            this.f15451c = i8;
            BluetoothClientCallback bluetoothClientCallback = this.mCallback;
            if (bluetoothClientCallback != null) {
                bluetoothClientCallback.onConnectionStateChanged(this, i8, i9);
            } else {
                ZLogger.v(this.VDBG, "no channel callback");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean a(BluetoothDevice bluetoothDevice) {
        return bluetoothDevice != null && bluetoothDevice.getBondState() == 12;
    }

    public boolean isConnected(String str) {
        String str2 = this.mDeviceAddress;
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        return isConnected();
    }

    public final boolean a(BluetoothDevice bluetoothDevice, int i8) {
        updateConnectionState(5);
        ZLogger.v(this.DBG, "pending to create bond");
        boolean createBond = BluetoothDeviceCompat.createBond(bluetoothDevice, i8);
        if (createBond) {
            try {
                synchronized (this.f15456h) {
                    try {
                        if (!a(bluetoothDevice)) {
                            ZLogger.v(this.VDBG, "wait bond result");
                            this.f15456h.wait(30000L);
                        }
                    } finally {
                    }
                }
                return createBond;
            } catch (InterruptedException e8) {
                ZLogger.w(e8.getMessage());
            }
        } else if (this.DBG) {
            ZLogger.d("createBond failed, maybe need to confirm pair dialog");
            return createBond;
        }
        return createBond;
    }
}
