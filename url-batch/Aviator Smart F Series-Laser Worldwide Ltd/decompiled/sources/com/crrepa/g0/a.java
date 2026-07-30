package com.crrepa.g0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.crrepa.ble.CRPBleClient;
import com.crrepa.ble.R;
import com.crrepa.ble.conn.callback.CRPDeviceUIVersionCodeCallback;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.sifli.dfu.DFUImagePath;
import com.crrepa.ble.sifli.dfu.SifliDFUService;
import com.crrepa.ble.trans.upgrade.bean.FirmwareVersionInfo;
import com.crrepa.ble.trans.upgrade.presenter.FirmwareUpgradePresenter;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.o;
import com.crrepa.m.f;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: h, reason: collision with root package name */
    private static final int f12887h = 200;

    /* renamed from: i, reason: collision with root package name */
    private static final int f12888i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private static final String f12889j = "ctrl_packet.bin";

    /* renamed from: k, reason: collision with root package name */
    private static final String f12890k = "outcom_app.bin";

    /* renamed from: l, reason: collision with root package name */
    private static final String f12891l = "outapp.bin";

    /* renamed from: m, reason: collision with root package name */
    private static final String f12892m = "outfont.bin";

    /* renamed from: n, reason: collision with root package name */
    private static final String f12893n = "outimg.bin";

    /* renamed from: o, reason: collision with root package name */
    private static final String f12894o = "outlcpu.bin";

    /* renamed from: p, reason: collision with root package name */
    private static final String f12895p = "outcom_patch.bin";

    /* renamed from: q, reason: collision with root package name */
    public static final String f12896q = "0";

    /* renamed from: a, reason: collision with root package name */
    private Context f12897a;

    /* renamed from: b, reason: collision with root package name */
    private CRPBleFirmwareUpgradeListener f12898b;

    /* renamed from: d, reason: collision with root package name */
    private String f12900d;

    /* renamed from: c, reason: collision with root package name */
    private d f12899c = new d(this);

    /* renamed from: e, reason: collision with root package name */
    private int f12901e = 200;

    /* renamed from: f, reason: collision with root package name */
    private Timer f12902f = new Timer();

    /* renamed from: g, reason: collision with root package name */
    private int f12903g = 0;

    /* renamed from: com.crrepa.g0.a$a, reason: collision with other inner class name */
    class C0218a implements m4.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f12904a;

        C0218a(boolean z7) {
            this.f12904a = z7;
        }

        @Override // m4.a
        public void onComplete(String str) {
            BleLog.d("FirmwareFile path: " + str);
            if (this.f12904a) {
                a.this.a(str);
            } else {
                a.this.a(str, "0");
            }
        }
    }

    class b implements CRPDeviceUIVersionCodeCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12906a;

        b(String str) {
            this.f12906a = str;
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceUIVersionCodeCallback
        public void onUIVersionCode(String str) {
            BleLog.d("queryUIVersionCode: " + str);
            com.crrepa.g0.b.b().a();
            a.this.a(this.f12906a, str);
        }
    }

    class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    private static class d extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<a> f12909a;

        public d(a aVar) {
            this.f12909a = new WeakReference<>(aVar);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            char c8;
            a aVar = this.f12909a.get();
            String action = intent.getAction();
            if (aVar == null || aVar.f12898b == null || TextUtils.isEmpty(action)) {
                return;
            }
            aVar.d();
            action.hashCode();
            switch (action.hashCode()) {
                case -1936294892:
                    if (action.equals(SifliDFUService.BROADCAST_DFU_PROGRESS)) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 888644493:
                    if (action.equals(SifliDFUService.BROADCAST_DFU_STATE)) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1761809728:
                    if (action.equals(SifliDFUService.BROADCAST_DFU_LOG)) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            switch (c8) {
                case 0:
                    int intExtra = intent.getIntExtra(SifliDFUService.EXTRA_DFU_PROGRESS, -1);
                    if (intExtra > 0) {
                        aVar.f12898b.onUpgradeProgressChanged(intExtra, 0.0f);
                        break;
                    }
                    break;
                case 1:
                    int intExtra2 = intent.getIntExtra(SifliDFUService.EXTRA_DFU_STATE, -1);
                    int intExtra3 = intent.getIntExtra(SifliDFUService.EXTRA_DFU_STATE_RESULT, -1);
                    BleLog.d("Sifli dfu state: " + intExtra2);
                    BleLog.d("Sifli dfu state result: " + intExtra3);
                    if (intExtra2 == 100) {
                        aVar.f();
                        if (intExtra3 != 0) {
                            aVar.a(23, "file trans failed");
                            break;
                        } else {
                            aVar.f12898b.onUpgradeCompleted();
                            break;
                        }
                    }
                    break;
                case 2:
                    BleLog.d("Sifli dfu log: " + intent.getStringExtra(SifliDFUService.EXTRA_LOG_MESSAGE));
                    break;
            }
        }
    }

    public a(Context context) {
        this.f12897a = context;
        c();
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SifliDFUService.BROADCAST_DFU_LOG);
        intentFilter.addAction(SifliDFUService.BROADCAST_DFU_STATE);
        intentFilter.addAction(SifliDFUService.BROADCAST_DFU_PROGRESS);
        LocalBroadcastManager.getInstance(this.f12897a).registerReceiver(this.f12899c, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        this.f12903g = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Timer timer = this.f12902f;
        if (timer != null) {
            timer.cancel();
            this.f12902f = null;
        }
    }

    public void a() {
        BleLog.d("abort");
        f();
        this.f12897a.stopService(new Intent(this.f12897a, (Class<?>) SifliDFUService.class));
    }

    protected void e() {
        if (this.f12902f == null) {
            this.f12902f = new Timer();
        }
        d();
        this.f12902f.schedule(new c(), 1000L, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        try {
            BleLog.d("waitTime: " + this.f12903g);
            int i8 = this.f12903g;
            if (i8 < this.f12901e) {
                this.f12903g = i8 + 1;
            } else {
                BleLog.d("trans time out!");
                f();
                a(23, com.crrepa.g1.d.a().getString(R.string.dfu_status_error_msg));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(int i8) {
        if (200 < i8) {
            this.f12901e = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i8, String str) {
        this.f12898b.onError(i8, str);
    }

    public void b(String str) {
        a(str, false);
    }

    public void c(String str) {
        a(str, true);
    }

    public void a(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.f12898b = cRPBleFirmwareUpgradeListener;
    }

    public void a(String str) {
        if (!CRPBleClient.create(this.f12897a).getBleDevice(this.f12900d).isConnected()) {
            a(str, "0");
        } else {
            com.crrepa.g0.b.b().a(new b(str));
            f.e().c(com.crrepa.f.a.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, String str2) {
        File file;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z7;
        char c8;
        BleLog.d("startUpgrade uiVersion: " + str2);
        try {
            file = o.a(new File(str));
        } catch (Exception e8) {
            e8.printStackTrace();
            file = null;
        }
        if (file == null || file.listFiles() == null || 1 >= file.listFiles().length) {
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
        } else {
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            String str9 = null;
            String str10 = null;
            for (File file2 : file.listFiles()) {
                String name = file2.getName();
                BleLog.d("file name: " + name);
                if (!TextUtils.isEmpty(name)) {
                    String path = file2.getPath();
                    name.hashCode();
                    switch (name.hashCode()) {
                        case -1849490260:
                            if (name.equals(f12891l)) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -1196519275:
                            if (name.equals(f12895p)) {
                                c8 = 1;
                                break;
                            } else {
                                c8 = 65535;
                                break;
                            }
                        case -676093707:
                            if (name.equals(f12889j)) {
                                c8 = 2;
                                break;
                            } else {
                                c8 = 65535;
                                break;
                            }
                        case 861372750:
                            if (name.equals(f12893n)) {
                                c8 = 3;
                                break;
                            } else {
                                c8 = 65535;
                                break;
                            }
                        case 1814254318:
                            if (name.equals(f12890k)) {
                                c8 = 4;
                                break;
                            } else {
                                c8 = 65535;
                                break;
                            }
                        case 1902789411:
                            if (name.equals(f12894o)) {
                                c8 = 5;
                                break;
                            } else {
                                c8 = 65535;
                                break;
                            }
                        case 2037789750:
                            if (name.equals(f12892m)) {
                                c8 = 6;
                                break;
                            } else {
                                c8 = 65535;
                                break;
                            }
                        default:
                            c8 = 65535;
                            break;
                    }
                    switch (c8) {
                        case 0:
                        case 4:
                            str6 = path;
                            break;
                        case 1:
                            str10 = path;
                            break;
                        case 2:
                            str5 = path;
                            break;
                        case 3:
                            str8 = path;
                            break;
                        case 5:
                            str9 = path;
                            break;
                        case 6:
                            str7 = path;
                            break;
                    }
                }
            }
            str3 = str9;
            str4 = str10;
        }
        if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
            FirmwareVersionInfo a8 = com.crrepa.l.b.b().a();
            if (a8 != null) {
                BleLog.d("getSf_ui_ver: " + a8.getSf_ui_ver());
                z7 = TextUtils.equals(a8.getSf_ui_ver(), str2) ^ true;
            } else {
                z7 = true;
            }
            BleLog.d("uiChanged: " + z7);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new DFUImagePath(str5, null, -1));
            arrayList.add(new DFUImagePath(str6, null, 0));
            if (z7) {
                if (!TextUtils.isEmpty(str7)) {
                    BleLog.d("add foot File");
                    arrayList.add(new DFUImagePath(str7, null, 4));
                }
                if (!TextUtils.isEmpty(str8)) {
                    BleLog.d("add ui File");
                    arrayList.add(new DFUImagePath(str8, null, 3));
                }
            }
            if (!TextUtils.isEmpty(str3)) {
                BleLog.d("add lcpuFile");
                arrayList.add(new DFUImagePath(str3, null, 1));
            }
            if (!TextUtils.isEmpty(str4)) {
                BleLog.d("add pathFile");
                arrayList.add(new DFUImagePath(str4, null, 2));
            }
            BleLog.d("startService");
            SifliDFUService.startActionDFUNor(this.f12897a, this.f12900d, arrayList, 3, 0);
            this.f12898b.onUpgradeProgressStarting(false);
            e();
            return;
        }
        a(17, "Firmware is null!");
    }

    private void a(String str, boolean z7) {
        if (TextUtils.isEmpty(str)) {
            a(18, "The device's Mac address is null!");
        } else {
            this.f12900d = str;
            a(z7);
        }
    }

    private void a(boolean z7) {
        BleLog.d("downloadFirmwareFile: " + z7);
        if (CRPBleClient.create(this.f12897a).isBluetoothEnable()) {
            FirmwareUpgradePresenter.getInstance().downloadNewFirmware(this.f12898b, new C0218a(z7));
        } else {
            a(23, "file trans failed");
        }
    }
}
