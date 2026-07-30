package com.realsil.sdk.core.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.realsil.sdk.core.RtkCore;
import com.realsil.sdk.core.bluetooth.compat.BluetoothAdapterCompat;
import com.realsil.sdk.core.bluetooth.compat.BluetoothDeviceCompat;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.compat.RtkContextCompat;
import com.realsil.sdk.core.f.a;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class RtkBluetoothManager {
    public static final String EXTRA_REASON = "android.bluetooth.device.extra.REASON";
    public static final int INDICATOR_ACL = 2;
    public static final int INDICATOR_BOND = 4;
    public static final int INDICATOR_BT = 1;
    public static final int INDICATOR_FULL = 255;

    /* renamed from: g, reason: collision with root package name */
    public static RtkBluetoothManager f15430g;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15431a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15432b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f15433c;

    /* renamed from: d, reason: collision with root package name */
    public CopyOnWriteArrayList f15434d;

    /* renamed from: e, reason: collision with root package name */
    public final BluetoothAdapter f15435e;

    /* renamed from: f, reason: collision with root package name */
    public final BluetoothBroadcastReceiver f15436f;

    public class BluetoothBroadcastReceiver extends BroadcastReceiver {
        public BluetoothBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (!"android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                if (BluetoothAdapterCompat.ACTION_BLE_ACL_CONNECTED.equals(action)) {
                    RtkBluetoothManager.a(RtkBluetoothManager.this, intent);
                    return;
                }
                if (BluetoothAdapterCompat.ACTION_BLE_ACL_DISCONNECTED.equals(action)) {
                    RtkBluetoothManager.b(RtkBluetoothManager.this, intent);
                    return;
                }
                if ("android.bluetooth.device.action.PAIRING_REQUEST".equals(action)) {
                    RtkBluetoothManager.c(RtkBluetoothManager.this, intent);
                    return;
                }
                if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(action)) {
                    RtkBluetoothManager.d(RtkBluetoothManager.this, intent);
                    return;
                } else if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action)) {
                    RtkBluetoothManager.e(RtkBluetoothManager.this, intent);
                    return;
                } else {
                    if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
                        RtkBluetoothManager.f(RtkBluetoothManager.this, intent);
                        return;
                    }
                    return;
                }
            }
            RtkBluetoothManager rtkBluetoothManager = RtkBluetoothManager.this;
            rtkBluetoothManager.getClass();
            String action2 = intent.getAction();
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1);
            boolean z7 = rtkBluetoothManager.f15431a;
            Locale locale = Locale.US;
            ZLogger.d(z7, "action=" + action2 + ", state: " + intExtra2 + "->" + intExtra);
            CopyOnWriteArrayList copyOnWriteArrayList = rtkBluetoothManager.f15434d;
            if (copyOnWriteArrayList == null) {
                ZLogger.v(rtkBluetoothManager.f15432b, "no callback registered");
                return;
            }
            ZLogger.v(rtkBluetoothManager.f15431a, "dispatch to " + copyOnWriteArrayList.size() + " receivers");
            Iterator it = rtkBluetoothManager.f15434d.iterator();
            while (it.hasNext()) {
                ((RtkBluetoothManagerCallback) it.next()).onBluetoothStateChanged(intExtra);
            }
        }
    }

    public RtkBluetoothManager(Context context) {
        this.f15431a = false;
        this.f15432b = false;
        this.f15436f = null;
        Context applicationContext = context.getApplicationContext();
        this.f15433c = applicationContext;
        this.f15431a = RtkCore.DEBUG;
        this.f15432b = RtkCore.VDBG;
        if (applicationContext == null) {
            ZLogger.w("not initialized");
            return;
        }
        if (this.f15435e == null) {
            BluetoothAdapter bluetoothAdapter = BluetoothAdapterCompat.getBluetoothAdapter(applicationContext);
            this.f15435e = bluetoothAdapter;
            if (bluetoothAdapter == null) {
                ZLogger.w("Unable to obtain a BluetoothAdapter.");
                return;
            }
        }
        if (this.f15435e == null) {
            ZLogger.w("mBluetoothAdapter == null");
            return;
        }
        BluetoothBroadcastReceiver bluetoothBroadcastReceiver = new BluetoothBroadcastReceiver();
        this.f15436f = bluetoothBroadcastReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction(BluetoothAdapterCompat.ACTION_BLE_ACL_CONNECTED);
        intentFilter.addAction(BluetoothAdapterCompat.ACTION_BLE_ACL_DISCONNECTED);
        intentFilter.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
        RtkContextCompat.registerReceiver(applicationContext, bluetoothBroadcastReceiver, intentFilter, 2);
    }

    public static void a(RtkBluetoothManager rtkBluetoothManager, Intent intent) {
        rtkBluetoothManager.getClass();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) a.a(intent, BluetoothDevice.class);
        if (bluetoothDevice == null) {
            return;
        }
        if (rtkBluetoothManager.f15431a) {
            Locale locale = Locale.US;
            ZLogger.v(BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true) + ": action=" + intent.getAction());
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rtkBluetoothManager.f15434d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((RtkBluetoothManagerCallback) it.next()).onBleAclConnectionStateChanged(bluetoothDevice, true);
            }
        }
    }

    public static void b(RtkBluetoothManager rtkBluetoothManager, Intent intent) {
        rtkBluetoothManager.getClass();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) a.a(intent, BluetoothDevice.class);
        if (bluetoothDevice == null) {
            return;
        }
        if (rtkBluetoothManager.f15431a) {
            Locale locale = Locale.US;
            ZLogger.v(BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true) + ": action=" + intent.getAction());
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rtkBluetoothManager.f15434d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((RtkBluetoothManagerCallback) it.next()).onBleAclConnectionStateChanged(bluetoothDevice, false);
            }
        }
    }

    public static void c(RtkBluetoothManager rtkBluetoothManager, Intent intent) {
        rtkBluetoothManager.getClass();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) a.a(intent, BluetoothDevice.class);
        if (bluetoothDevice == null) {
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", 0);
        if (rtkBluetoothManager.f15431a) {
            Locale locale = Locale.US;
            ZLogger.v(BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true) + ": action=" + intent.getAction());
            ZLogger.v("android.bluetooth.device.extra.PAIRING_VARIANT>> " + BluetoothDeviceCompat.pairingVariantToString(intExtra) + " (" + intExtra + ")");
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rtkBluetoothManager.f15434d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((RtkBluetoothManagerCallback) it.next()).onPairingRequestNotify(bluetoothDevice, intExtra);
            }
        }
        if (bluetoothDevice.getBondState() == 12) {
            ZLogger.d("device already bonded: " + BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true));
        }
    }

    public static void d(RtkBluetoothManager rtkBluetoothManager, Intent intent) {
        rtkBluetoothManager.getClass();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) a.a(intent, BluetoothDevice.class);
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
        int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
        int intExtra3 = intent.getIntExtra(EXTRA_REASON, -1);
        if (bluetoothDevice == null) {
            return;
        }
        Locale locale = Locale.US;
        ZLogger.d(BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true) + ": action=" + intent.getAction() + ", bondState:" + intExtra + "->" + intExtra2 + ", reason=" + intExtra3);
        CopyOnWriteArrayList copyOnWriteArrayList = rtkBluetoothManager.f15434d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((RtkBluetoothManagerCallback) it.next()).onBondStateChanged(bluetoothDevice, intExtra2);
            }
        }
    }

    public static void e(RtkBluetoothManager rtkBluetoothManager, Intent intent) {
        rtkBluetoothManager.getClass();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) a.a(intent, BluetoothDevice.class);
        if (bluetoothDevice == null) {
            return;
        }
        if (rtkBluetoothManager.f15431a) {
            Locale locale = Locale.US;
            ZLogger.v(BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true) + ": action=" + intent.getAction());
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rtkBluetoothManager.f15434d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((RtkBluetoothManagerCallback) it.next()).onAclConnectionStateChanged(bluetoothDevice, true);
            }
        }
    }

    public static void f(RtkBluetoothManager rtkBluetoothManager, Intent intent) {
        rtkBluetoothManager.getClass();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) a.a(intent, BluetoothDevice.class);
        if (bluetoothDevice == null) {
            return;
        }
        if (rtkBluetoothManager.f15431a) {
            Locale locale = Locale.US;
            ZLogger.v(BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true) + ": action=" + intent.getAction());
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rtkBluetoothManager.f15434d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((RtkBluetoothManagerCallback) it.next()).onAclConnectionStateChanged(bluetoothDevice, false);
            }
        }
    }

    public static RtkBluetoothManager getInstance() {
        return f15430g;
    }

    public static void initial(Context context) {
        if (f15430g == null) {
            synchronized (RtkBluetoothManager.class) {
                try {
                    if (f15430g == null) {
                        f15430g = new RtkBluetoothManager(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void addManagerCallback(RtkBluetoothManagerCallback rtkBluetoothManagerCallback) {
        if (this.f15434d == null) {
            this.f15434d = new CopyOnWriteArrayList();
        }
        if (this.f15434d.contains(rtkBluetoothManagerCallback)) {
            return;
        }
        this.f15434d.add(rtkBluetoothManagerCallback);
    }

    public void close() {
        ZLogger.v(this.f15431a, "close()");
        Context context = this.f15433c;
        if (context != null) {
            try {
                context.unregisterReceiver(this.f15436f);
            } catch (Exception e8) {
                ZLogger.w(e8.toString());
            }
        }
        f15430g = null;
    }

    public boolean isBleEnabled() {
        BluetoothAdapter bluetoothAdapter = this.f15435e;
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    public boolean isBleSupported() {
        return this.f15433c.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public void removeManagerCallback(RtkBluetoothManagerCallback rtkBluetoothManagerCallback) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15434d;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(rtkBluetoothManagerCallback);
        }
    }
}
