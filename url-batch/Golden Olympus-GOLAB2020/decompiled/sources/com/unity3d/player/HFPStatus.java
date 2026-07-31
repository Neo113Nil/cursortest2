package com.unity3d.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;

/* loaded from: classes2.dex */
public class HFPStatus {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22023a;

    /* renamed from: d, reason: collision with root package name */
    public final AudioManager f22026d;

    /* renamed from: b, reason: collision with root package name */
    public BroadcastReceiver f22024b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22025c = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22027e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f22028f = 1;

    public HFPStatus(Context context) {
        this.f22026d = null;
        this.f22023a = context;
        this.f22026d = (AudioManager) context.getSystemService("audio");
        initHFPStatusJni();
    }

    private final native void deinitHFPStatusJni();

    private final native void initHFPStatusJni();

    public final void a() {
        if (this.f22027e) {
            this.f22027e = false;
            this.f22026d.stopBluetoothSco();
        }
    }

    public final void b() {
        clearHFPStat();
        deinitHFPStatusJni();
    }

    public void clearHFPStat() {
        BroadcastReceiver broadcastReceiver = this.f22024b;
        if (broadcastReceiver != null) {
            this.f22023a.unregisterReceiver(broadcastReceiver);
            this.f22024b = null;
        }
        this.f22028f = 1;
        a();
    }

    public boolean getHFPStat() {
        return this.f22028f == 2;
    }

    public void requestHFPStat() {
        clearHFPStat();
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.unity3d.player.HFPStatus.1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1) != 1) {
                    return;
                }
                HFPStatus hFPStatus = HFPStatus.this;
                hFPStatus.f22028f = 2;
                hFPStatus.a();
                HFPStatus hFPStatus2 = HFPStatus.this;
                if (hFPStatus2.f22025c) {
                    hFPStatus2.f22026d.setMode(3);
                }
            }
        };
        this.f22024b = broadcastReceiver;
        this.f22023a.registerReceiver(broadcastReceiver, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        try {
            this.f22027e = true;
            this.f22026d.startBluetoothSco();
        } catch (NullPointerException unused) {
            h1.T.a(5, "startBluetoothSco() failed. no bluetooth device connected.");
        }
    }

    public void setHFPRecordingStat(boolean z4) {
        this.f22025c = z4;
        if (z4) {
            return;
        }
        this.f22026d.setMode(0);
    }
}
