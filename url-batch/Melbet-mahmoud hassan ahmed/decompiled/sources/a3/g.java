package a3;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f67a = false;

    /* renamed from: b, reason: collision with root package name */
    private float f68b = 1.0f;

    public static float b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    private final synchronized boolean f() {
        return this.f68b >= 0.0f;
    }

    public final synchronized float a() {
        if (!f()) {
            return 1.0f;
        }
        return this.f68b;
    }

    public final synchronized void c(boolean z6) {
        this.f67a = z6;
    }

    public final synchronized void d(float f7) {
        this.f68b = f7;
    }

    public final synchronized boolean e() {
        return this.f67a;
    }
}
