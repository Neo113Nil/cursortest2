package org.fmod;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* loaded from: classes3.dex */
public class FmodAndroidAudioManager {

    /* renamed from: f, reason: collision with root package name */
    private static FmodAndroidAudioManager f43325f;

    /* renamed from: a, reason: collision with root package name */
    private volatile Activity f43326a = null;

    /* renamed from: b, reason: collision with root package name */
    private volatile AudioManager f43327b = null;

    /* renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f43328c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f43329d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f43330e = false;

    private FmodAndroidAudioManager() {
    }

    public static FmodAndroidAudioManager getInstance() {
        if (f43325f == null) {
            f43325f = new FmodAndroidAudioManager();
        }
        return f43325f;
    }

    public int getBluetoothInputDeviceId() {
        for (AudioDeviceInfo audioDeviceInfo : this.f43327b.getDevices(1)) {
            if (audioDeviceInfo.getType() == 7) {
                return audioDeviceInfo.getId();
            }
        }
        return -1;
    }

    public boolean isBluetoothInputDeviceAvailable() {
        for (AudioDeviceInfo audioDeviceInfo : this.f43327b.getDevices(1)) {
            if (audioDeviceInfo.getType() == 7) {
                return true;
            }
        }
        return false;
    }

    public boolean isBluetoothScoConnected() {
        return this.f43330e;
    }

    public boolean isBuiltinInputDeviceAvailable() {
        for (AudioDeviceInfo audioDeviceInfo : this.f43327b.getDevices(1)) {
            if (audioDeviceInfo.getType() == 15) {
                return true;
            }
        }
        return false;
    }

    public boolean isBuiltinSpeakerDevice(int i4) {
        for (AudioDeviceInfo audioDeviceInfo : this.f43327b.getDevices(2)) {
            if (audioDeviceInfo.getId() == i4 && audioDeviceInfo.getType() == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean isInputSampleRateAvailable(int i4) {
        for (AudioDeviceInfo audioDeviceInfo : this.f43327b.getDevices(1)) {
            if ((this.f43329d && audioDeviceInfo.getType() == 7) || (!this.f43329d && audioDeviceInfo.getType() == 15)) {
                for (int i5 : audioDeviceInfo.getSampleRates()) {
                    if (i5 == i4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void setActivity(Activity activity) {
        if (this.f43326a != activity) {
            if (this.f43328c != null) {
                this.f43326a.unregisterReceiver(this.f43328c);
                this.f43328c = null;
                this.f43330e = false;
            }
            this.f43326a = activity;
            this.f43327b = this.f43326a != null ? (AudioManager) this.f43326a.getSystemService("audio") : null;
        }
    }

    public void setUseBluetooth(boolean z4) {
        this.f43329d = z4;
    }

    public void startBluetoothSco() {
        if (this.f43328c == null) {
            this.f43328c = new BroadcastReceiver() { // from class: org.fmod.FmodAndroidAudioManager.1
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                    if (intExtra == 0) {
                        FmodAndroidAudioManager.this.f43330e = false;
                    } else {
                        if (intExtra != 1) {
                            return;
                        }
                        FmodAndroidAudioManager.this.f43330e = true;
                    }
                }
            };
            this.f43326a.registerReceiver(this.f43328c, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        }
        this.f43327b.startBluetoothSco();
    }

    public void stopBluetoothSco() {
        this.f43327b.stopBluetoothSco();
    }
}
