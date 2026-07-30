package com.realsil.sdk.core.bluetooth.connection.legacy;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothSocket;
import com.realsil.sdk.core.bluetooth.BluetoothProfileManager;
import com.realsil.sdk.core.bluetooth.connection.BluetoothClient;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.c.a;
import com.realsil.sdk.core.c.b;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class BluetoothSpp extends BluetoothClient {
    public boolean initialized;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15504k;

    /* renamed from: l, reason: collision with root package name */
    public SppConnParameters f15505l;

    /* renamed from: m, reason: collision with root package name */
    public UUID f15506m;

    /* renamed from: n, reason: collision with root package name */
    public a f15507n;

    /* renamed from: o, reason: collision with root package name */
    public b f15508o;

    /* renamed from: p, reason: collision with root package name */
    public int f15509p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f15510q;

    /* renamed from: r, reason: collision with root package name */
    public volatile Boolean f15511r;

    /* renamed from: s, reason: collision with root package name */
    public static final UUID f15503s = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    public static boolean FLUSH_ENABLED = true;

    public BluetoothSpp(BluetoothSppCallback bluetoothSppCallback) {
        this(f15503s, bluetoothSppCallback);
    }

    public static void i(BluetoothSpp bluetoothSpp) {
        ZLogger.v(bluetoothSpp.DBG, "connectionLost");
        bluetoothSpp.updateConnectionState(0);
        synchronized (bluetoothSpp.f15510q) {
            bluetoothSpp.f15511r = Boolean.FALSE;
        }
        bluetoothSpp.start();
    }

    public static void l(BluetoothSpp bluetoothSpp) {
        if (bluetoothSpp.f15504k) {
            bluetoothSpp.f15504k = false;
            int i8 = bluetoothSpp.f15451c;
            if (i8 != 1) {
                ZLogger.v(bluetoothSpp.VDBG, String.format("mConnState=0x%04X", Integer.valueOf(i8)));
            } else {
                int bondState = bluetoothSpp.getBondState();
                ZLogger.v(bluetoothSpp.VDBG, String.format("bondState=0x%02X", Integer.valueOf(bondState)));
                if (bondState == 12) {
                    int connectionState = BluetoothProfileManager.getInstance().getConnectionState(1, bluetoothSpp.mDeviceAddress);
                    ZLogger.v(bluetoothSpp.VDBG, String.format("hfpState=0x%02X", Integer.valueOf(connectionState)));
                    if (connectionState == 2) {
                        bluetoothSpp.e();
                        return;
                    }
                }
            }
        }
        ZLogger.v(bluetoothSpp.DBG, "connectionFailed");
        bluetoothSpp.updateConnectionState(0);
        synchronized (bluetoothSpp.f15510q) {
            bluetoothSpp.f15511r = Boolean.FALSE;
        }
        bluetoothSpp.start();
    }

    public synchronized boolean connect(SppConnParameters sppConnParameters) {
        if (sppConnParameters == null) {
            ZLogger.v("connParameters can not be null or empty");
            return false;
        }
        if (sppConnParameters.getDeviceAddress() == null) {
            ZLogger.v("device can not be null or empty");
            return false;
        }
        String str = this.mDeviceAddress;
        if (str != null) {
            if (str.equals(sppConnParameters.getDeviceAddress())) {
                int i8 = this.f15451c;
                if (i8 == 2) {
                    ZLogger.v(this.DBG, "device already connected");
                    updateConnectionState(2);
                    return true;
                }
                if (i8 == 1) {
                    ZLogger.v(this.DBG, "device is already at connecting state");
                    updateConnectionState(1);
                    return true;
                }
            } else {
                int i9 = this.f15451c;
                if (i9 == 2) {
                    ZLogger.v(this.DBG, "other device already connected");
                    d();
                    return false;
                }
                if (i9 == 1) {
                    ZLogger.v(this.DBG, "other device is at connecting state");
                    d();
                    return false;
                }
            }
        }
        this.f15504k = true;
        return a(sppConnParameters);
    }

    public synchronized void connected(BluetoothSocket bluetoothSocket, String str) {
        ZLogger.d(this.DBG, "spp connected: " + str);
        this.mDeviceAddress = str;
        d();
        b bVar = new b(this, bluetoothSocket);
        this.f15508o = bVar;
        bVar.start();
    }

    public final void d() {
        ZLogger.v(this.VDBG, "cancelPreviousConnection");
        a aVar = this.f15507n;
        if (aVar != null) {
            aVar.a();
            this.f15507n.interrupt();
            this.f15507n = null;
        }
        b bVar = this.f15508o;
        if (bVar != null) {
            bVar.a();
            this.f15508o.interrupt();
            this.f15508o = null;
        }
    }

    @Override // com.realsil.sdk.core.bluetooth.connection.BluetoothClient
    public synchronized void destroy() {
        super.destroy();
        stop();
    }

    @Override // com.realsil.sdk.core.bluetooth.connection.BluetoothClient
    public synchronized void disconnect() {
        try {
            super.disconnect();
            if (this.f15451c == 2) {
                updateConnectionState(3);
            }
            a aVar = this.f15507n;
            if (aVar != null) {
                aVar.a();
                this.f15507n.interrupt();
                this.f15507n = null;
            }
            b bVar = this.f15508o;
            if (bVar != null) {
                bVar.a();
                this.f15508o.interrupt();
                this.f15508o = null;
            }
            synchronized (this.f15510q) {
                this.f15511r = Boolean.FALSE;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e() {
        Boolean bool;
        this.f15504k = false;
        synchronized (this.f15510q) {
            bool = Boolean.FALSE;
            this.f15511r = bool;
        }
        this.f15451c = 0;
        ZLogger.v(this.VDBG, "processAbnormalDisconnection ..");
        if (a(this.f15505l)) {
            return;
        }
        ZLogger.v(this.DBG, "processAbnormalDisconnection failed");
        updateConnectionState(0);
        synchronized (this.f15510q) {
            this.f15511r = bool;
        }
        start();
    }

    @Override // com.realsil.sdk.core.bluetooth.connection.BluetoothClient
    public boolean isConnected() {
        return this.f15451c == 2;
    }

    public synchronized void start() {
        start(true);
    }

    public synchronized void stop() {
        ZLogger.v(this.VDBG, "stop");
        disconnect();
    }

    public boolean write(byte[] bArr) {
        return write(bArr, true);
    }

    public BluetoothSpp(UUID uuid, BluetoothSppCallback bluetoothSppCallback) {
        this.f15504k = false;
        this.f15506m = f15503s;
        this.f15509p = -1;
        this.f15510q = new Object();
        this.f15511r = Boolean.FALSE;
        this.f15506m = uuid;
        this.mCallback = bluetoothSppCallback;
        ZLogger.v(this.DBG, "initialize...");
        c();
        BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
        if (bluetoothAdapter == null) {
            ZLogger.d("bluetoothAdapter not initialized ");
            this.initialized = false;
        } else if (bluetoothAdapter.isEnabled()) {
            this.initialized = true;
        } else {
            ZLogger.d("bluetooth is disabled");
            this.initialized = false;
        }
    }

    public final boolean a(SppConnParameters sppConnParameters) {
        String str;
        synchronized (this.f15510q) {
            try {
                if (this.f15511r.booleanValue()) {
                    ZLogger.w("device is busy");
                    return false;
                }
                this.f15511r = Boolean.TRUE;
                if (!this.initialized) {
                    ZLogger.v(this.DBG, "initialize...");
                    c();
                    BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
                    if (bluetoothAdapter == null) {
                        str = "bluetoothAdapter not initialized ";
                    } else if (bluetoothAdapter.isEnabled()) {
                        this.initialized = true;
                    } else {
                        str = "bluetooth is disabled";
                    }
                    ZLogger.d(str);
                    this.initialized = false;
                }
                ZLogger.v(this.DBG, "createNewConnection:" + sppConnParameters.toString());
                this.f15505l = sppConnParameters;
                this.mDeviceAddress = sppConnParameters.getDeviceAddress();
                this.f15506m = sppConnParameters.getUuid();
                if (sppConnParameters.getBluetoothSocket() != null) {
                    connected(sppConnParameters.getBluetoothSocket(), this.mDeviceAddress);
                } else {
                    d();
                    a aVar = new a(this, this.mDeviceAddress);
                    this.f15507n = aVar;
                    aVar.start();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void start(boolean z7) {
        try {
            ZLogger.v(this.DBG, "start secure: " + z7);
            a aVar = this.f15507n;
            if (aVar != null) {
                aVar.a();
                this.f15507n.interrupt();
                this.f15507n = null;
            }
            b bVar = this.f15508o;
            if (bVar != null) {
                bVar.a();
                this.f15508o.interrupt();
                this.f15508o = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean write(byte[] bArr, boolean z7) {
        synchronized (this) {
            try {
                if (this.f15451c != 2) {
                    ZLogger.d(this.DBG, "not connected");
                    return false;
                }
                b bVar = this.f15508o;
                if (bVar == null) {
                    ZLogger.d("ConnectedThread not created");
                    return false;
                }
                if (bVar.f15644c == null) {
                    return false;
                }
                try {
                    BluetoothSpp bluetoothSpp = bVar.f15645d;
                    if (bluetoothSpp.VDBG) {
                        Locale locale = Locale.US;
                        ZLogger.v("<< " + BluetoothHelper.formatAddress(bluetoothSpp.mDeviceAddress, true) + ": (" + bArr.length + ") " + DataConverter.bytes2Hex(bArr));
                    }
                    bVar.f15644c.write(bArr);
                    if (z7) {
                        bVar.f15644c.flush();
                    }
                    return true;
                } catch (IOException e8) {
                    ZLogger.w("Exception during write： " + e8);
                    return false;
                }
            } finally {
            }
        }
    }
}
