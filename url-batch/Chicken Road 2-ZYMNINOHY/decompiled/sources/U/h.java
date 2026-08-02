package U;

import T.C0086d;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f3038a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f3039b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f3040c;

    /* renamed from: d, reason: collision with root package name */
    public final C0086d f3041d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3042e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3043f;

    public h(int i4, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C0086d c0086d, boolean z) {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener2;
        AudioFocusRequest build;
        this.f3038a = i4;
        this.f3040c = handler;
        this.f3041d = c0086d;
        this.f3042e = z;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 26) {
            this.f3039b = new g(onAudioFocusChangeListener, handler);
        } else {
            this.f3039b = onAudioFocusChangeListener;
        }
        if (i5 < 26) {
            this.f3043f = null;
            return;
        }
        audioAttributes = C.a.h(i4).setAudioAttributes(c0086d.a());
        willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(z);
        onAudioFocusChangeListener2 = willPauseWhenDucked.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
        build = onAudioFocusChangeListener2.build();
        this.f3043f = build;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f3038a == hVar.f3038a && this.f3042e == hVar.f3042e && Objects.equals(this.f3039b, hVar.f3039b) && Objects.equals(this.f3040c, hVar.f3040c) && Objects.equals(this.f3041d, hVar.f3041d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3038a), this.f3039b, this.f3040c, this.f3041d, Boolean.valueOf(this.f3042e));
    }
}
