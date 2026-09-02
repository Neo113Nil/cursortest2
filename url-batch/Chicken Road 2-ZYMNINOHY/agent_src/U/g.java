package U;

import W.J;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class g implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3036a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f3037b;

    public g(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f3037b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = J.f3263a;
        this.f3036a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i4) {
        J.Q(this.f3036a, new f(i4, 0, this));
    }
}
