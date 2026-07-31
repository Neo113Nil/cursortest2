package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media.AudioAttributesCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    static final AudioAttributesCompat f960g = new AudioAttributesCompat.a().e(1).a();

    /* renamed from: a, reason: collision with root package name */
    private final int f961a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f962b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f963c;

    /* renamed from: d, reason: collision with root package name */
    private final AudioAttributesCompat f964d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f965e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f966f;

    /* renamed from: androidx.media.a$a, reason: collision with other inner class name */
    private static class C0017a {
        static AudioFocusRequest a(int i7, AudioAttributes audioAttributes, boolean z6, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i7).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z6).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f967a;

        /* renamed from: b, reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f968b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f969c;

        /* renamed from: d, reason: collision with root package name */
        private AudioAttributesCompat f970d = a.f960g;

        /* renamed from: e, reason: collision with root package name */
        private boolean f971e;

        public b(int i7) {
            d(i7);
        }

        private static boolean b(int i7) {
            return i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4;
        }

        public a a() {
            if (this.f968b != null) {
                return new a(this.f967a, this.f968b, this.f969c, this.f970d, this.f971e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b c(AudioAttributesCompat audioAttributesCompat) {
            Objects.requireNonNull(audioAttributesCompat, "Illegal null AudioAttributes");
            this.f970d = audioAttributesCompat;
            return this;
        }

        public b d(int i7) {
            if (!b(i7)) {
                throw new IllegalArgumentException("Illegal audio focus gain type " + i7);
            }
            if (Build.VERSION.SDK_INT < 19 && i7 == 4) {
                i7 = 2;
            }
            this.f967a = i7;
            return this;
        }

        public b e(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return f(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        public b f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            if (onAudioFocusChangeListener == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            }
            if (handler == null) {
                throw new IllegalArgumentException("Handler must not be null");
            }
            this.f968b = onAudioFocusChangeListener;
            this.f969c = handler;
            return this;
        }

        public b g(boolean z6) {
            this.f971e = z6;
            return this;
        }
    }

    private static class c implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

        /* renamed from: f, reason: collision with root package name */
        private final Handler f972f;

        /* renamed from: g, reason: collision with root package name */
        private final AudioManager.OnAudioFocusChangeListener f973g;

        c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f973g = onAudioFocusChangeListener;
            this.f972f = new Handler(handler.getLooper(), this);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 2782386) {
                return false;
            }
            this.f973g.onAudioFocusChange(message.arg1);
            return true;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i7) {
            Handler handler = this.f972f;
            handler.sendMessage(Message.obtain(handler, 2782386, i7, 0));
        }
    }

    a(int i7, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z6) {
        this.f961a = i7;
        this.f963c = handler;
        this.f964d = audioAttributesCompat;
        this.f965e = z6;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.f962b = onAudioFocusChangeListener;
        } else {
            this.f962b = new c(onAudioFocusChangeListener, handler);
        }
        this.f966f = i8 >= 26 ? C0017a.a(i7, a(), z6, this.f962b, handler) : null;
    }

    AudioAttributes a() {
        AudioAttributesCompat audioAttributesCompat = this.f964d;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.d();
        }
        return null;
    }

    public AudioAttributesCompat b() {
        return this.f964d;
    }

    AudioFocusRequest c() {
        return (AudioFocusRequest) this.f966f;
    }

    public int d() {
        return this.f961a;
    }

    public AudioManager.OnAudioFocusChangeListener e() {
        return this.f962b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f961a == aVar.f961a && this.f965e == aVar.f965e && q.d.a(this.f962b, aVar.f962b) && q.d.a(this.f963c, aVar.f963c) && q.d.a(this.f964d, aVar.f964d);
    }

    public int hashCode() {
        return q.d.b(Integer.valueOf(this.f961a), this.f962b, this.f963c, this.f964d, Boolean.valueOf(this.f965e));
    }
}
