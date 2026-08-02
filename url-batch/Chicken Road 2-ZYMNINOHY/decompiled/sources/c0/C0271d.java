package c0;

import T.C0086d;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271d extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O2.d f5547a;

    public C0271d(O2.d dVar) {
        this.f5547a = dVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        O2.d dVar = this.f5547a;
        dVar.a(C0270c.b((Context) dVar.f2047b, (C0086d) dVar.f2055j, (AudioDeviceInfo) dVar.f2054i));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        O2.d dVar = this.f5547a;
        if (W.J.m(audioDeviceInfoArr, (AudioDeviceInfo) dVar.f2054i)) {
            dVar.f2054i = null;
        }
        dVar.a(C0270c.b((Context) dVar.f2047b, (C0086d) dVar.f2055j, (AudioDeviceInfo) dVar.f2054i));
    }
}
