package com.sifli.serialtransport;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.UUID;

/* loaded from: classes4.dex */
public class serialTransService extends Service {
    private static final int A0 = 3;
    private static final int B0 = 4;
    private static boolean C0 = true;
    protected static final int H = 0;
    protected static final int I = 1;
    protected static final int J = 2;
    protected static final int K = 3;
    protected static final int L = 4;
    protected static final int M = 5;
    public static final int N = 0;
    public static final int O = 100;
    public static final int P = 101;
    public static final int Q = 102;
    public static final int R = 103;
    public static final int S = 104;
    public static final int T = 105;
    public static final int U = 106;
    public static final int V = 107;
    public static final int W = 108;
    public static final int X = 109;
    public static final int Y = 110;
    public static final int Z = 111;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f16475a0 = 112;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f16476b0 = 120;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f16477c0 = 121;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f16478d0 = 130;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f16479e0 = 131;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f16480f0 = 132;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f16481g0 = 133;

    /* renamed from: h0, reason: collision with root package name */
    private static final int f16482h0 = 23;

    /* renamed from: i0, reason: collision with root package name */
    private static final int f16483i0 = 247;

    /* renamed from: j0, reason: collision with root package name */
    private static final int f16484j0 = 0;

    /* renamed from: k0, reason: collision with root package name */
    private static final int f16485k0 = 1;

    /* renamed from: l0, reason: collision with root package name */
    private static final int f16486l0 = 5000;

    /* renamed from: m0, reason: collision with root package name */
    private static final int f16487m0 = 40000;

    /* renamed from: n0, reason: collision with root package name */
    private static final int f16488n0 = 7000;

    /* renamed from: o0, reason: collision with root package name */
    public static final String f16489o0 = "00002902-0000-1000-8000-00805f9b34fb";

    /* renamed from: p0, reason: collision with root package name */
    private static final String f16490p0 = "00000000-0000-0000-6473-5f696c666973";

    /* renamed from: q0, reason: collision with root package name */
    private static final String f16491q0 = "00000000-0000-0100-6473-5f696c666973";

    /* renamed from: r0, reason: collision with root package name */
    public static final String f16492r0 = "00000000-0000-0200-6473-5f696c666973";

    /* renamed from: s0, reason: collision with root package name */
    public static final String f16493s0 = "Sifli.serialTrans.broadcast.EXTRA_SERIAL_TRANS_MSG";

    /* renamed from: t0, reason: collision with root package name */
    public static final String f16494t0 = "Sifli.serialTrans.broadcast.EXTRA_SERIAL_TRANS_STATUS";

    /* renamed from: u0, reason: collision with root package name */
    public static final String f16495u0 = "Sifli.serialTrans.EXTRA_DEVICE_ADDRESS";

    /* renamed from: v0, reason: collision with root package name */
    public static final String f16496v0 = "Sifli.serialTrans.broadcast.BROADCAST_SERIAL_TRANS";

    /* renamed from: w0, reason: collision with root package name */
    private static final String f16497w0 = "sifli-serial";

    /* renamed from: x0, reason: collision with root package name */
    private static final int f16498x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    private static final int f16499y0 = 1;

    /* renamed from: z0, reason: collision with root package name */
    private static final int f16500z0 = 2;
    String B;
    boolean C;

    /* renamed from: a, reason: collision with root package name */
    private g f16501a;

    /* renamed from: b, reason: collision with root package name */
    private BluetoothAdapter f16502b;

    /* renamed from: c, reason: collision with root package name */
    private BluetoothDevice f16503c;

    /* renamed from: d, reason: collision with root package name */
    private BluetoothGatt f16504d;

    /* renamed from: e, reason: collision with root package name */
    private BluetoothGattCharacteristic f16505e;

    /* renamed from: f, reason: collision with root package name */
    protected int f16506f;

    /* renamed from: i, reason: collision with root package name */
    private int f16509i;

    /* renamed from: j, reason: collision with root package name */
    private int f16510j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16511k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16512l;

    /* renamed from: n, reason: collision with root package name */
    private int f16514n;

    /* renamed from: p, reason: collision with root package name */
    private int f16516p;

    /* renamed from: q, reason: collision with root package name */
    private int f16517q;

    /* renamed from: u, reason: collision with root package name */
    private Handler f16521u;

    /* renamed from: v, reason: collision with root package name */
    private l4.a f16522v;

    /* renamed from: x, reason: collision with root package name */
    private int f16524x;

    /* renamed from: y, reason: collision with root package name */
    private int f16525y;

    /* renamed from: z, reason: collision with root package name */
    private int f16526z;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16507g = false;

    /* renamed from: h, reason: collision with root package name */
    private final Object f16508h = new Object();

    /* renamed from: m, reason: collision with root package name */
    private int f16513m = 0;

    /* renamed from: o, reason: collision with root package name */
    private Handler f16515o = new Handler();

    /* renamed from: r, reason: collision with root package name */
    private byte[] f16518r = new byte[0];

    /* renamed from: s, reason: collision with root package name */
    private final ByteOrder f16519s = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: t, reason: collision with root package name */
    private final String f16520t = "Sifli.serial.BLE_DATA";

    /* renamed from: w, reason: collision with root package name */
    private String f16523w = "1.2.19";
    ArrayList<String> A = new ArrayList<>();
    private BluetoothGattCallback D = new a();
    private final Runnable E = new b();
    private final Runnable F = new c();
    private final Runnable G = new d();

    class a extends BluetoothGattCallback {
        a() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            StringBuilder sb;
            l4.a aVar;
            if (!bluetoothGattCharacteristic.getUuid().toString().equals("00000000-0000-0200-6473-5f696c666973")) {
                Log.d(serialTransService.f16497w0, "other notify");
                return;
            }
            byte[] value = bluetoothGattCharacteristic.getValue();
            byte b8 = value[0];
            byte b9 = value[1];
            if (b9 == 0) {
                int a8 = serialTransService.this.a(value, 2);
                byte[] bArr = new byte[a8];
                System.arraycopy(value, 4, bArr, 0, a8);
                serialTransService.this.f16522v.a(b8, bArr);
                return;
            }
            if (b9 == 1) {
                int a9 = serialTransService.this.a(value, 2);
                serialTransService.this.f16516p = a9;
                serialTransService.this.f16517q = 0;
                serialTransService.this.f16518r = new byte[a9];
                int length = value.length - 4;
                System.arraycopy(value, 4, serialTransService.this.f16518r, serialTransService.this.f16517q, length);
                serialTransService.g(serialTransService.this, length);
                return;
            }
            int i8 = 120;
            if (b9 == 2) {
                int length2 = value.length - 2;
                if (serialTransService.this.f16516p == 0) {
                    Log.e(serialTransService.f16497w0, "not receive first packet!");
                    aVar = serialTransService.this.f16522v;
                    i8 = 121;
                    aVar.b(i8);
                }
                if (serialTransService.this.f16517q + length2 <= serialTransService.this.f16516p) {
                    System.arraycopy(value, 2, serialTransService.this.f16518r, serialTransService.this.f16517q, length2);
                    serialTransService.g(serialTransService.this, length2);
                    return;
                } else {
                    sb = new StringBuilder();
                    sb.append("continue packet len error, dataLen: ");
                    sb.append(length2);
                }
            } else {
                if (b9 != 3) {
                    return;
                }
                int length3 = value.length - 2;
                if (serialTransService.this.f16517q + length3 == serialTransService.this.f16516p) {
                    System.arraycopy(value, 2, serialTransService.this.f16518r, serialTransService.this.f16517q, length3);
                    serialTransService.g(serialTransService.this, length3);
                    serialTransService.this.f16522v.a(b8, serialTransService.this.f16518r);
                    return;
                } else {
                    sb = new StringBuilder();
                    sb.append("last packet len error, dataLen: ");
                    sb.append(length3);
                }
            }
            sb.append(", serial index: ");
            sb.append(serialTransService.this.f16517q);
            sb.append(", serial len: ");
            sb.append(serialTransService.this.f16516p);
            Log.e(serialTransService.f16497w0, sb.toString());
            aVar = serialTransService.this.f16522v;
            aVar.b(i8);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
            if (i8 != 0) {
                Log.e(serialTransService.f16497w0, "Write fail: " + i8);
                serialTransService.this.f16509i = i8;
            }
            serialTransService.this.f16511k = true;
            synchronized (serialTransService.this.f16508h) {
                serialTransService.this.f16508h.notifyAll();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i8, int i9) {
            super.onConnectionStateChange(bluetoothGatt, i8, i9);
            Log.d(serialTransService.f16497w0, "serial onConnectionStateChange status " + i8 + ", newState " + i9);
            StringBuilder sb = new StringBuilder();
            sb.append("serial state ");
            sb.append(serialTransService.this.f16506f);
            Log.d(serialTransService.f16497w0, sb.toString());
            if (i9 == 2) {
                serialTransService serialtransservice = serialTransService.this;
                serialtransservice.f16506f = 2;
                serialtransservice.a(500L);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 31 && ContextCompat.checkSelfPermission(serialTransService.this, "android.permission.BLUETOOTH_CONNECT") != 0) {
                    Log.e(serialTransService.f16497w0, "no Permission");
                    serialTransService.this.f16509i = 112;
                    synchronized (serialTransService.this.f16508h) {
                        serialTransService.this.f16508h.notifyAll();
                    }
                    return;
                }
                bluetoothGatt.requestMtu(247);
                if (serialTransService.C0) {
                    Log.i(serialTransService.f16497w0, "wait more after mtu change");
                    serialTransService.this.a(1000L);
                    bluetoothGatt.requestConnectionPriority(1);
                    serialTransService.this.a(500L);
                    if (i10 >= 26) {
                        bluetoothGatt.setPreferredPhy(2, 2, 0);
                    }
                }
                serialTransService.this.a(1000L);
                Log.i(serialTransService.f16497w0, "Connected to GATT server.");
            } else if (i9 == 0) {
                Log.d(serialTransService.f16497w0, "Bluetooth disconnect with: " + i8 + ", new state: " + i9);
                serialTransService.this.f16509i = 105;
                serialTransService.this.f16510j = i8;
                serialTransService serialtransservice2 = serialTransService.this;
                serialtransservice2.f16506f = 0;
                serialtransservice2.f16522v.b(130);
                serialTransService.this.f16522v.a(0);
            }
            synchronized (serialTransService.this.f16508h) {
                serialTransService.this.f16508h.notifyAll();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
            Log.i(serialTransService.f16497w0, "onDescriptorWrite");
            serialTransService.this.f16512l = true;
            synchronized (serialTransService.this.f16508h) {
                serialTransService.this.f16508h.notifyAll();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i8, int i9) {
            serialTransService serialtransservice;
            int i10;
            Log.d(serialTransService.f16497w0, "status " + i9 + ", mtu " + i8);
            serialTransService.this.f16514n = i8;
            String str = Build.MODEL;
            if (str.length() > 3) {
                str = str.substring(0, 3);
            }
            if (serialTransService.this.A.contains(str)) {
                Log.w(serialTransService.f16497w0, "mtu issue " + str);
                serialTransService.this.f16514n = 23;
                serialtransservice = serialTransService.this;
                i10 = serialtransservice.f16514n - 3;
            } else if (i8 > 247) {
                serialtransservice = serialTransService.this;
                i10 = 244;
            } else {
                serialtransservice = serialTransService.this;
                i10 = i8 - 3;
            }
            serialtransservice.f16513m = i10;
            serialTransService.this.f16522v.d(i8);
            serialTransService serialtransservice2 = serialTransService.this;
            if (serialtransservice2.C) {
                return;
            }
            serialtransservice2.C = true;
            if (Build.VERSION.SDK_INT < 31 || ContextCompat.checkSelfPermission(serialtransservice2, "android.permission.BLUETOOTH_CONNECT") == 0) {
                bluetoothGatt.discoverServices();
                serialTransService.this.f16515o.postDelayed(serialTransService.this.E, 40000L);
                return;
            }
            Log.e(serialTransService.f16497w0, "no Permission");
            serialTransService.this.f16509i = 112;
            synchronized (serialTransService.this.f16508h) {
                serialTransService.this.f16508h.notifyAll();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
        
            if (r0 == false) goto L17;
         */
        @Override // android.bluetooth.BluetoothGattCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i8) {
            serialTransService.this.f16515o.removeCallbacks(serialTransService.this.E);
            if (i8 == 0) {
                Log.d(serialTransService.f16497w0, "onServicesDiscovered");
                boolean z7 = false;
                for (int i9 = 0; i9 < bluetoothGatt.getServices().size(); i9++) {
                    for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGatt.getServices().get(i9).getCharacteristics()) {
                        Log.e(serialTransService.f16497w0, "find uuid: " + bluetoothGattCharacteristic.getUuid().toString() + ", expect: 00000000-0000-0200-6473-5f696c666973");
                        if (bluetoothGattCharacteristic.getUuid().toString().equals("00000000-0000-0200-6473-5f696c666973")) {
                            Log.i(serialTransService.f16497w0, "find serial trans UUID");
                            serialTransService.this.f16505e = bluetoothGattCharacteristic;
                            serialTransService.this.f16506f = 3;
                            z7 = true;
                        }
                    }
                }
            } else {
                Log.w(serialTransService.f16497w0, "onServicesDiscovered received: " + i8);
                serialTransService.this.f16509i = 106;
                serialTransService.this.f16510j = i8;
                serialTransService.this.a(109, i8);
            }
            Log.e(serialTransService.f16497w0, "fail to find target uuid");
            serialTransService.this.a(110);
            serialTransService.this.f16506f = 4;
            synchronized (serialTransService.this.f16508h) {
                serialTransService.this.f16508h.notifyAll();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.e(serialTransService.f16497w0, "discovery timeout");
            serialTransService.this.f16509i = 102;
            synchronized (serialTransService.this.f16508h) {
                serialTransService.this.f16508h.notifyAll();
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.e(serialTransService.f16497w0, "write time out");
            serialTransService.this.f16509i = 104;
            synchronized (serialTransService.this.f16508h) {
                serialTransService.this.f16508h.notifyAll();
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.e(serialTransService.f16497w0, "write descriptor timeout");
            serialTransService.this.f16509i = 103;
            synchronized (serialTransService.this.f16508h) {
                serialTransService.this.f16508h.notifyAll();
            }
        }
    }

    public class e extends Binder {
        public e() {
        }

        public serialTransService a() {
            return serialTransService.this;
        }
    }

    class f implements Handler.Callback {
        f() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 0 || i8 == 1) {
                byte[] byteArray = message.getData().getByteArray("Sifli.serial.BLE_DATA");
                if (serialTransService.this.f16505e == null) {
                    return false;
                }
                byte b8 = byteArray[1];
                int length = (b8 == 0 || b8 == 1) ? byteArray.length - 4 : byteArray.length - 2;
                if (serialTransService.this.f16507g) {
                    Log.d(serialTransService.f16497w0, "message type " + message.what);
                }
                if (message.what == 1) {
                    serialTransService.this.f16522v.c(length);
                }
                serialTransService.this.f16505e.setValue(byteArray);
                serialTransService.this.f16505e.setWriteType(1);
                serialTransService.this.f16511k = false;
                if (serialTransService.this.f16504d == null) {
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 31 && ContextCompat.checkSelfPermission(serialTransService.this, "android.permission.BLUETOOTH_CONNECT") != 0) {
                    Log.e(serialTransService.f16497w0, "no Permission");
                    serialTransService.this.f16509i = 112;
                    synchronized (serialTransService.this.f16508h) {
                        serialTransService.this.f16508h.notifyAll();
                    }
                    return false;
                }
                serialTransService.this.f16504d.writeCharacteristic(serialTransService.this.f16505e);
                serialTransService.this.f16515o.postDelayed(serialTransService.this.F, 5000L);
                synchronized (serialTransService.this.f16508h) {
                    while (!serialTransService.this.f16511k && serialTransService.this.f16509i == 0) {
                        try {
                            serialTransService.this.f16508h.wait();
                        } catch (InterruptedException e8) {
                            e8.printStackTrace();
                        }
                    }
                    serialTransService.this.f16515o.removeCallbacks(serialTransService.this.F);
                }
                serialTransService.this.f16522v.b(serialTransService.this.f16509i);
            }
            if (!serialTransService.this.f16521u.hasMessages(0) && !serialTransService.this.f16521u.hasMessages(1)) {
                serialTransService.this.f16522v.a();
            }
            return true;
        }
    }

    public class g extends e {
        public g() {
            super();
        }

        public void a(int i8) {
            Log.i(serialTransService.f16497w0, "serialTransSetMtu " + i8);
            if (i8 < 23) {
                i8 = 23;
            }
            serialTransService.this.f16513m = i8 - 3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:97:0x01ee, code lost:
        
            if (r11.f16533b.f16509i == 0) goto L88;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void b() {
            int i8;
            int a8;
            int a9;
            String str;
            String str2;
            Log.e(serialTransService.f16497w0, "connectBluetooth");
            BluetoothManager bluetoothManager = (BluetoothManager) serialTransService.this.getSystemService("bluetooth");
            if (bluetoothManager == null) {
                str = serialTransService.f16497w0;
                str2 = "Unable to initialize BluetoothManager.";
            } else {
                if (serialTransService.b(serialTransService.this.B)) {
                    serialTransService.this.f16502b = bluetoothManager.getAdapter();
                    serialTransService serialtransservice = serialTransService.this;
                    if (serialtransservice.a(serialtransservice.B, serialtransservice.D)) {
                        serialTransService.this.a(1500L);
                        serialTransService serialtransservice2 = serialTransService.this;
                        int a10 = serialtransservice2.a(serialtransservice2.f16504d, serialTransService.this.f16505e);
                        i8 = 0;
                        if (a10 == 2) {
                            int i9 = 0;
                            do {
                                i9++;
                                Log.i(serialTransService.f16497w0, "retry write cccd " + i9);
                                serialTransService.this.a(((long) i9) * 500);
                                serialTransService serialtransservice3 = serialTransService.this;
                                a9 = serialtransservice3.a(serialtransservice3.f16504d, serialTransService.this.f16505e);
                                if (a9 != 2) {
                                    break;
                                }
                            } while (i9 < 3);
                            a10 = a9;
                        }
                        if (a10 == 2) {
                            serialTransService.this.f16509i = 133;
                        }
                        if (a10 == 1) {
                            Log.d(serialTransService.f16497w0, "write cccd ret 1");
                            serialTransService.this.f16509i = 133;
                        }
                        synchronized (serialTransService.this.f16508h) {
                            while (!serialTransService.this.f16512l && serialTransService.this.f16509i == 0) {
                                try {
                                    serialTransService.this.f16508h.wait();
                                } catch (InterruptedException e8) {
                                    e8.printStackTrace();
                                }
                            }
                        }
                        serialTransService.this.f16515o.removeCallbacks(serialTransService.this.G);
                        if (serialTransService.this.f16509i == 103) {
                            Log.w(serialTransService.f16497w0, "retry with timeout");
                            serialTransService.this.f16509i = 0;
                            serialTransService serialtransservice4 = serialTransService.this;
                            serialtransservice4.b(serialtransservice4.f16504d, serialTransService.this.f16505e);
                            synchronized (serialTransService.this.f16508h) {
                                while (!serialTransService.this.f16512l && serialTransService.this.f16509i == 0) {
                                    try {
                                        serialTransService.this.f16508h.wait();
                                    } catch (InterruptedException e9) {
                                        e9.printStackTrace();
                                    }
                                }
                            }
                            if (serialTransService.this.f16509i == 103) {
                                serialTransService.this.f16509i = 0;
                            }
                            serialTransService serialtransservice5 = serialTransService.this;
                            int a11 = serialtransservice5.a(serialtransservice5.f16504d, serialTransService.this.f16505e);
                            if (a11 == 2) {
                                int i10 = 0;
                                do {
                                    i10++;
                                    Log.i(serialTransService.f16497w0, "retry write cccd " + i10);
                                    serialTransService.this.a(((long) i10) * 500);
                                    serialTransService serialtransservice6 = serialTransService.this;
                                    a8 = serialtransservice6.a(serialtransservice6.f16504d, serialTransService.this.f16505e);
                                    if (a8 != 2) {
                                        break;
                                    }
                                } while (i10 < 3);
                                a11 = a8;
                            }
                            if (a11 == 2) {
                                serialTransService.this.f16509i = 133;
                            }
                            if (a11 == 1) {
                                Log.d(serialTransService.f16497w0, "write cccd ret 1");
                                serialTransService.this.f16509i = 133;
                            }
                            synchronized (serialTransService.this.f16508h) {
                                while (!serialTransService.this.f16512l && serialTransService.this.f16509i == 0) {
                                    try {
                                        serialTransService.this.f16508h.wait();
                                    } catch (InterruptedException e10) {
                                        e10.printStackTrace();
                                    }
                                }
                            }
                            serialTransService.this.f16515o.removeCallbacks(serialTransService.this.G);
                        }
                    } else {
                        serialTransService.this.a(111);
                        Log.d(serialTransService.f16497w0, "fail to connect");
                    }
                    i8 = 132;
                    serialTransService.this.f16522v.e(i8);
                }
                str = serialTransService.f16497w0;
                str2 = "deviceAddress is empty";
            }
            Log.e(str, str2);
            i8 = 132;
            serialTransService.this.f16522v.e(i8);
        }

        public void c() {
            Log.e(serialTransService.f16497w0, "do task");
            serialTransService.this.f16522v.b(0);
        }

        public void d() {
            serialTransService.this.f16507g = true;
        }

        public void e() {
            int i8 = serialTransService.this.f16513m - 4;
            serialTransService.this.a(new byte[i8], i8, 0, 0);
        }

        public void f() {
            serialTransService serialtransservice = serialTransService.this;
            int i8 = serialtransservice.f16506f;
            if (i8 == 2 && i8 == 3) {
                BluetoothGatt unused = serialtransservice.f16504d;
            } else {
                Log.w(serialTransService.f16497w0, "connection state error");
            }
        }

        public void a(Boolean bool) {
            boolean unused = serialTransService.C0 = bool.booleanValue();
            b();
        }

        public void b(byte[] bArr, int i8) {
            serialTransService.this.a(bArr, bArr.length, i8, 1);
        }

        public void a(byte[] bArr, int i8) {
            serialTransService.this.a(bArr, bArr.length, i8, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT >= 31 && ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") != 0) {
            Log.e(f16497w0, "no Permission");
            this.f16509i = 112;
            synchronized (this.f16508h) {
                this.f16508h.notifyAll();
            }
            return 1;
        }
        if (bluetoothGattCharacteristic == null) {
            str = f16497w0;
            str2 = "writeCCCD gattCharacteristic null";
        } else {
            bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb"));
            if (descriptor != null) {
                this.f16512l = false;
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                Log.d(f16497w0, "Write descriptor");
                this.f16515o.postDelayed(this.G, 7000L);
                if (bluetoothGatt.writeDescriptor(descriptor)) {
                    return 0;
                }
                this.f16515o.removeCallbacks(this.G);
                Log.e(f16497w0, "writeDescriptor fail");
                return 2;
            }
            str = f16497w0;
            str2 = "desc null!!!";
        }
        Log.e(str, str2);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (Build.VERSION.SDK_INT >= 31 && ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") != 0) {
            Log.e(f16497w0, "no Permission");
            this.f16509i = 112;
            synchronized (this.f16508h) {
                this.f16508h.notifyAll();
            }
            return 1;
        }
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, false);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb"));
        if (descriptor == null) {
            Log.e(f16497w0, "desc null!!!");
            return 1;
        }
        this.f16512l = false;
        descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        Log.d(f16497w0, "Write descriptor disable");
        this.f16515o.postDelayed(this.G, 7000L);
        if (bluetoothGatt.writeDescriptor(descriptor)) {
            return 0;
        }
        this.f16515o.removeCallbacks(this.G);
        Log.e(f16497w0, "writeDescriptor fail");
        return 2;
    }

    static /* synthetic */ int g(serialTransService serialtransservice, int i8) {
        int i9 = serialtransservice.f16517q + i8;
        serialtransservice.f16517q = i9;
        return i9;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        g gVar = this.f16501a;
        if (gVar != null) {
            return gVar;
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.d(f16497w0, "version " + this.f16523w);
        C0 = true;
        this.f16501a = new g();
        this.A.clear();
        this.A.add("V23");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        BluetoothGatt bluetoothGatt = this.f16504d;
        if (bluetoothGatt != null) {
            a(bluetoothGatt);
        }
        Log.d(f16497w0, "on destroy");
        this.f16515o.removeCallbacks(this.E);
        this.f16515o.removeCallbacks(this.F);
        this.f16515o.removeCallbacks(this.G);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        Log.d(f16497w0, "onStartCommand");
        if (intent == null) {
            return 2;
        }
        this.B = intent.getStringExtra(f16495u0);
        this.f16514n = 23;
        this.C = false;
        HandlerThread handlerThread = new HandlerThread("BleWrite");
        handlerThread.start();
        this.f16521u = new Handler(handlerThread.getLooper(), new f());
        return 2;
    }

    protected void c(BluetoothGatt bluetoothGatt) {
        try {
            Log.i(f16497w0, "Refreshing result: " + ((Boolean) bluetoothGatt.getClass().getMethod("refresh", new Class[0]).invoke(bluetoothGatt, new Object[0])).booleanValue());
        } catch (Exception e8) {
            Log.e(f16497w0, "An exception occurred while refreshing device", e8);
        }
    }

    protected void d(@NonNull BluetoothGatt bluetoothGatt) {
        if (this.f16506f != 0) {
            b(bluetoothGatt);
        }
        a(bluetoothGatt);
        a(600L);
    }

    protected void b() {
        try {
            synchronized (this.f16508h) {
                while (this.f16506f != 0) {
                    try {
                        this.f16508h.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException unused) {
            Log.e(f16497w0, "Sleeping interrupted");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(byte[] bArr, int i8) {
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, i8, bArr2, 0, 2);
        return ByteBuffer.wrap(bArr2, 0, 2).order(this.f16519s).getShort();
    }

    protected void b(BluetoothGatt bluetoothGatt) {
        if (this.f16506f == 0) {
            return;
        }
        Log.d(f16497w0, "Disconnecting");
        this.f16506f = 4;
        if (Build.VERSION.SDK_INT < 31 || ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") == 0) {
            bluetoothGatt.disconnect();
            b();
            return;
        }
        Log.e(f16497w0, "no Permission");
        this.f16509i = 112;
        synchronized (this.f16508h) {
            this.f16508h.notifyAll();
        }
    }

    void b(byte[] bArr, int i8) {
        Message message = new Message();
        message.what = i8;
        Bundle bundle = new Bundle();
        bundle.putByteArray("Sifli.serial.BLE_DATA", bArr);
        message.setData(bundle);
        this.f16521u.sendMessage(message);
    }

    private BluetoothGatt a(BluetoothDevice bluetoothDevice, BluetoothGattCallback bluetoothGattCallback) {
        BluetoothGatt connectGatt;
        if (!this.f16502b.isEnabled()) {
            return null;
        }
        this.f16506f = 1;
        Log.i(f16497w0, "connecting to " + bluetoothDevice);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31 && ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") != 0) {
            Log.e(f16497w0, "no Permission");
            this.f16509i = 112;
            synchronized (this.f16508h) {
                this.f16508h.notifyAll();
            }
            return null;
        }
        if (i8 >= 26) {
            Log.d(f16497w0, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE, preferredPhy = LE_1M | LE_2M)");
            connectGatt = this.f16503c.connectGatt(this, false, bluetoothGattCallback, 2, 3);
        } else if (i8 >= 23) {
            Log.d(f16497w0, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE)");
            connectGatt = this.f16503c.connectGatt(this, false, bluetoothGattCallback, 2);
        } else {
            Log.d(f16497w0, "gatt = device.connectGatt(autoConnect = false)");
            connectGatt = this.f16503c.connectGatt(this, false, bluetoothGattCallback);
        }
        try {
            synchronized (this.f16508h) {
                while (true) {
                    try {
                        int i9 = this.f16506f;
                        if ((i9 == 1 || i9 == 2) && this.f16509i == 0) {
                            this.f16508h.wait();
                        }
                    } finally {
                    }
                }
            }
        } catch (InterruptedException unused) {
            Log.e(f16497w0, "Sleeping interrupted");
        }
        return connectGatt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str) {
        if (str == null || str.length() != 17) {
            return false;
        }
        for (int i8 = 0; i8 < 17; i8++) {
            char charAt = str.charAt(i8);
            int i9 = i8 % 3;
            if (i9 == 0 || i9 == 1) {
                if ((charAt < '0' || charAt > '9') && (charAt < 'A' || charAt > 'F')) {
                    return false;
                }
            } else if (i9 == 2 && charAt != ':') {
                return false;
            }
        }
        return true;
    }

    void a(int i8) {
        Intent intent = new Intent(f16496v0);
        intent.putExtra(f16493s0, i8);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    void a(int i8, int i9) {
        Intent intent = new Intent(f16496v0);
        intent.putExtra(f16493s0, i8);
        intent.putExtra(f16494t0, i9);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    protected void a(long j8) {
        synchronized (this.f16508h) {
            try {
                Log.d(f16497w0, "wait(" + j8 + ")");
                this.f16508h.wait(j8);
            } catch (InterruptedException unused) {
                Log.e(f16497w0, "Sleeping interrupted");
            }
        }
    }

    protected void a(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null) {
            return;
        }
        if (C0) {
            if (Build.VERSION.SDK_INT >= 31 && ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") != 0) {
                Log.e(f16497w0, "no Permission");
                this.f16509i = 112;
                synchronized (this.f16508h) {
                    this.f16508h.notifyAll();
                }
                return;
            }
            bluetoothGatt.requestConnectionPriority(2);
        }
        Log.d(f16497w0, "Cleaning up...");
        Log.d(f16497w0, "gatt.disconnect()");
        bluetoothGatt.disconnect();
        Log.d(f16497w0, "gatt.close()");
        bluetoothGatt.close();
        this.f16506f = 5;
    }

    public void a(l4.a aVar) {
        this.f16522v = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byte[] bArr, int i8, int i9, int i10) {
        this.f16525y = i8;
        this.f16526z = 0;
        int i11 = this.f16514n;
        int i12 = i11 - 3;
        if (i11 > 247) {
            i12 = 244;
        }
        int i13 = this.f16513m;
        if (i13 != 0 && i12 > i13) {
            i12 = i13;
        }
        int i14 = i8 + 4;
        if (i14 > 65535) {
            Log.e(f16497w0, "serial length over");
            return;
        }
        if (i14 <= i12) {
            byte[] bArr2 = new byte[i14];
            bArr2[0] = (byte) i9;
            bArr2[1] = 0;
            byte[] a8 = a(i8, bArr2, 2);
            System.arraycopy(bArr, 0, a8, 4, i8);
            b(a8, i10);
            return;
        }
        byte[] bArr3 = new byte[i12];
        byte b8 = (byte) i9;
        bArr3[0] = b8;
        bArr3[1] = 1;
        byte[] a9 = a(i8, bArr3, 2);
        int i15 = i12 - 4;
        System.arraycopy(bArr, 0, a9, 4, i15);
        b(a9, i10);
        while (i15 < i8) {
            int i16 = i8 - i15;
            int i17 = i12 - 2;
            if (i16 > i17) {
                byte[] bArr4 = new byte[i12];
                bArr4[0] = b8;
                bArr4[1] = 2;
                System.arraycopy(bArr, i15, bArr4, 2, i17);
                i15 += i17;
                b(bArr4, i10);
            } else {
                byte[] bArr5 = new byte[i16 + 2];
                bArr5[0] = b8;
                bArr5[1] = 3;
                System.arraycopy(bArr, i15, bArr5, 2, i16);
                b(bArr5, i10);
                i15 = i8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, BluetoothGattCallback bluetoothGattCallback) {
        String str2;
        StringBuilder sb;
        String str3;
        this.f16503c = this.f16502b.getRemoteDevice(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f16504d = a(this.f16503c, bluetoothGattCallback);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        int i8 = this.f16509i;
        if (i8 > 0) {
            int i9 = this.f16510j;
            if (i8 == 105) {
                Log.i(f16497w0, "Connection error after: " + (elapsedRealtime2 - elapsedRealtime) + " ms");
                if (i9 != 133 || elapsedRealtime2 <= elapsedRealtime + 25000) {
                    sb = new StringBuilder();
                    str3 = "An error occurred while connecting to the device:";
                    sb.append(str3);
                    sb.append(i9);
                    str2 = sb.toString();
                } else {
                    str2 = "Device not reachable. Check if the device with address " + str + " is in range, is advertising and is connectable";
                }
            } else if (i8 == 107) {
                str2 = "error discovery not start";
            } else if (i8 == 102) {
                str2 = "discovery time out";
            } else {
                sb = new StringBuilder();
                str3 = "An error occurred during discovering services:";
                sb.append(str3);
                sb.append(i9);
                str2 = sb.toString();
            }
        } else {
            if (this.f16506f != 0) {
                return true;
            }
            this.f16509i = 105;
            str2 = "Disconnect due to state disconnect";
        }
        Log.e(f16497w0, str2);
        d(this.f16504d);
        return false;
    }

    private byte[] a(int i8, byte[] bArr, int i9) {
        System.arraycopy(ByteBuffer.allocate(2).order(this.f16519s).putShort((short) i8).array(), 0, bArr, i9, 2);
        return bArr;
    }
}
