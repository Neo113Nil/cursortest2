package com.startapp.sdk.adsbase.periodic;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.startapp.sdk.internal.af;
import com.startapp.sdk.internal.f2;
import com.startapp.sdk.internal.k7;
import com.startapp.sdk.internal.m0;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.s1;
import com.startapp.sdk.internal.t1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a extends t1 {
    public final Context e;
    public final pa f;
    public final long g;
    public final long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, f2 f2Var, pa paVar, long j, long j2) {
        super(context, f2Var);
        context.getClass();
        paVar.getClass();
        this.e = context;
        this.f = paVar;
        this.g = j;
        this.h = j2;
    }

    @Override // com.startapp.sdk.internal.t1
    public final void a() {
        final k7 k7Var = new k7();
        boolean z = false;
        try {
            BluetoothAdapter a2 = a(this.e);
            if (a2 != null) {
                z = a(a2, k7Var);
            }
        } catch (Throwable th) {
            n8.a(th);
        }
        this.c.postDelayed(new Runnable() { // from class: com.startapp.sdk.adsbase.periodic.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                a.a(a.this, k7Var);
            }
        }, z ? this.g : 0L);
    }

    public static final void a(a aVar, k7 k7Var) {
        aVar.a(k7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.BroadcastReceiver, com.startapp.sdk.adsbase.periodic.GetBluetoothAsync$startUnsafe$1] */
    public final boolean a(BluetoothAdapter bluetoothAdapter, final k7 k7Var) {
        boolean a2;
        boolean a3;
        Set<BluetoothDevice> bondedDevices;
        try {
            int i = Build.VERSION.SDK_INT;
            Context context = this.e;
            if (i < 31) {
                a3 = m0.a(context, "android.permission.BLUETOOTH");
            } else {
                a3 = m0.a(context, "android.permission.BLUETOOTH_CONNECT");
            }
            if (a3 && (bondedDevices = bluetoothAdapter.getBondedDevices()) != null) {
                for (BluetoothDevice bluetoothDevice : bondedDevices) {
                    bluetoothDevice.getClass();
                    synchronized (k7Var) {
                        k7Var.f300a.add(bluetoothDevice);
                    }
                }
            }
        } catch (Throwable th) {
            n8.a(th);
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = currentTimeMillis - ((af) this.f.a()).getLong("lastBtDiscoveringTime", 0L) >= this.h;
        if (z) {
            ((af) this.f.a()).edit().putLong("lastBtDiscoveringTime", currentTimeMillis).apply();
        }
        if (!z) {
            return false;
        }
        ?? r1 = new BroadcastReceiver() { // from class: com.startapp.sdk.adsbase.periodic.GetBluetoothAsync$startUnsafe$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                context2.getClass();
                intent.getClass();
                if (!Intrinsics.areEqual("android.bluetooth.device.action.FOUND", intent.getAction())) {
                    if (Intrinsics.areEqual("android.bluetooth.adapter.action.DISCOVERY_FINISHED", intent.getAction())) {
                        a.this.a(k7Var);
                    }
                } else {
                    BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice2 != null) {
                        k7 k7Var2 = k7Var;
                        synchronized (k7Var2) {
                            k7Var2.b.add(bluetoothDevice2);
                        }
                    }
                }
            }
        };
        k7Var.c = r1;
        this.e.registerReceiver(r1, new IntentFilter("android.bluetooth.device.action.FOUND"));
        int i2 = Build.VERSION.SDK_INT;
        Context context2 = this.e;
        if (i2 < 31) {
            a2 = m0.a(context2, "android.permission.BLUETOOTH_ADMIN");
        } else {
            a2 = m0.a(context2, "android.permission.BLUETOOTH_SCAN");
        }
        if (a2) {
            return bluetoothAdapter.startDiscovery();
        }
        return false;
    }

    public final BluetoothAdapter a(Context context) {
        BluetoothAdapter adapter;
        Object systemService = context.getSystemService("bluetooth");
        if (!(systemService instanceof BluetoothManager) || (adapter = ((BluetoothManager) systemService).getAdapter()) == null) {
            return null;
        }
        if ((Build.VERSION.SDK_INT < 31 ? m0.a(this.e, "android.permission.BLUETOOTH") : true) && adapter.isEnabled()) {
            return adapter;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:20:0x003c, B:22:0x0044, B:24:0x004a, B:26:0x0059, B:31:0x0051), top: B:19:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(k7 k7Var) {
        BluetoothAdapter a2;
        boolean a3;
        s1 s1Var;
        JSONObject jSONObject;
        boolean a4;
        try {
            s1Var = this.b;
        } catch (Throwable th) {
            n8.a(th);
        }
        try {
            if (k7Var != null) {
                int i = Build.VERSION.SDK_INT;
                Context context = this.e;
                if (i < 31) {
                    a4 = m0.a(context, "android.permission.BLUETOOTH");
                } else {
                    a4 = m0.a(context, "android.permission.BLUETOOTH_CONNECT");
                }
                if (a4) {
                    jSONObject = k7Var.a();
                    s1Var.a(jSONObject);
                    if (k7Var != null) {
                        try {
                            GetBluetoothAsync$startUnsafe$1 getBluetoothAsync$startUnsafe$1 = k7Var.c;
                            if (getBluetoothAsync$startUnsafe$1 != null) {
                                k7Var.c = null;
                                this.e.unregisterReceiver(getBluetoothAsync$startUnsafe$1);
                            }
                        } catch (Throwable th2) {
                            n8.a(th2);
                        }
                    }
                    a2 = a(this.e);
                    if (a2 == null) {
                        int i2 = Build.VERSION.SDK_INT;
                        Context context2 = this.e;
                        if (i2 < 31) {
                            a3 = m0.a(context2, "android.permission.BLUETOOTH_ADMIN");
                        } else {
                            a3 = m0.a(context2, "android.permission.BLUETOOTH_SCAN");
                        }
                        if (a3) {
                            a2.cancelDiscovery();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            a2 = a(this.e);
            if (a2 == null) {
            }
        } catch (Throwable th3) {
            n8.a(th3);
            return;
        }
        jSONObject = null;
        s1Var.a(jSONObject);
        if (k7Var != null) {
        }
    }
}
