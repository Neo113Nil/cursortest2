package h1;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import com.unity3d.player.AudioVolumeHandler;

/* loaded from: classes2.dex */
public final class B extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final AudioVolumeHandler f36702a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f36703b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36704c;

    /* renamed from: d, reason: collision with root package name */
    public int f36705d;

    public B(Handler handler, AudioManager audioManager, AudioVolumeHandler audioVolumeHandler) {
        super(handler);
        this.f36703b = audioManager;
        this.f36704c = 3;
        this.f36702a = audioVolumeHandler;
        this.f36705d = audioManager.getStreamVolume(3);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4, Uri uri) {
        int streamVolume;
        AudioManager audioManager = this.f36703b;
        if (audioManager == null || this.f36702a == null || (streamVolume = audioManager.getStreamVolume(this.f36704c)) == this.f36705d) {
            return;
        }
        this.f36705d = streamVolume;
        this.f36702a.onAudioVolumeChanged(streamVolume);
    }
}
