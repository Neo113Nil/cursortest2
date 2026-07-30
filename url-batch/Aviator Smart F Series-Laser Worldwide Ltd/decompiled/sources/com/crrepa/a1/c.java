package com.crrepa.a1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.listener.CRPWatchFaceTransListener;
import com.crrepa.ble.util.BleLog;
import com.sifli.watchfacelibrary.SifliWatchfaceService;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private CRPFileTransListener f10834a;

    /* renamed from: b, reason: collision with root package name */
    private a f10835b = new a(this);

    private static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<c> f10836a;

        public a(c cVar) {
            this.f10836a = new WeakReference<>(cVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c cVar = this.f10836a.get();
            if (cVar == null) {
                return;
            }
            String action = intent.getAction();
            BleLog.d("sifli watchface action: " + action);
            if (TextUtils.isEmpty(action)) {
                return;
            }
            action.hashCode();
            if (!action.equals("com.sifli.watchfacelibrary.broadcast.BROADCAST_WATCHFACE_STATE")) {
                if (action.equals("com.sifli.watchfacelibrary.broadcast.BROADCAST_PROGRESS")) {
                    int intExtra = intent.getIntExtra("Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_PROGRESS", -1);
                    BleLog.d("sifli watchface percent: " + intExtra);
                    cVar.b(intExtra);
                    return;
                }
                return;
            }
            int intExtra2 = intent.getIntExtra("Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_STATE", -1);
            BleLog.d("sifli watchface state: " + intExtra2);
            if (intExtra2 == 0) {
                cVar.a();
            } else {
                int intExtra3 = intent.getIntExtra("Sifli.watchfacelibrary.broadcast.EXTRA_WATCHFACE_RESPONSE", 0);
                BleLog.d("sifli watchface errorCode: " + intExtra3);
                cVar.a(intExtra3);
            }
            cVar.a(context);
        }
    }

    public c() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        CRPFileTransListener cRPFileTransListener = this.f10834a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransCompleted();
            CRPFileTransListener cRPFileTransListener2 = this.f10834a;
            if (cRPFileTransListener2 instanceof CRPWatchFaceTransListener) {
                ((CRPWatchFaceTransListener) cRPFileTransListener2).onInstallStateChange(true);
            }
        }
    }

    private void b() {
        BleLog.d("registerReceiver WatchFaceBroadcast");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.sifli.watchfacelibrary.broadcast.BROADCAST_WATCHFACE_STATE");
        intentFilter.addAction("com.sifli.watchfacelibrary.broadcast.BROADCAST_PROGRESS");
        LocalBroadcastManager.getInstance(com.crrepa.g1.d.a()).registerReceiver(this.f10835b, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i8) {
        CRPFileTransListener cRPFileTransListener = this.f10834a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransProgressChanged(i8);
        }
    }

    protected void a(int i8) {
        CRPFileTransListener cRPFileTransListener = this.f10834a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onError(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        BleLog.d("unregisterReceiver WatchFaceBroadcast");
        LocalBroadcastManager.getInstance(context).unregisterReceiver(this.f10835b);
    }

    public void a(CRPFileTransListener cRPFileTransListener) {
        this.f10834a = cRPFileTransListener;
    }

    public void a(String str, int i8) {
        BleLog.d("sifli watchface start path: " + str + ", type: " + i8);
        SifliWatchfaceService.a(com.crrepa.g1.d.a(), str, com.crrepa.g1.d.b(), i8, 1);
    }
}
