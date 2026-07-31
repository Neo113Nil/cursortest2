package r0;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import r0.d;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f20566a;

    /* renamed from: b, reason: collision with root package name */
    private final a f20567b;

    /* renamed from: c, reason: collision with root package name */
    private b f20568c;

    /* renamed from: d, reason: collision with root package name */
    private t0.e f20569d;

    /* renamed from: f, reason: collision with root package name */
    private int f20571f;

    /* renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f20573h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20574i;

    /* renamed from: g, reason: collision with root package name */
    private float f20572g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f20570e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: f, reason: collision with root package name */
        private final Handler f20575f;

        public a(Handler handler) {
            this.f20575f = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i7) {
            d.this.h(i7);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i7) {
            this.f20575f.post(new Runnable() { // from class: r0.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.a.this.b(i7);
                }
            });
        }
    }

    public interface b {
        void G(float f7);

        void a(int i7);
    }

    public d(Context context, Handler handler, b bVar) {
        this.f20566a = (AudioManager) o2.a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f20568c = bVar;
        this.f20567b = new a(handler);
    }

    private void a() {
        this.f20566a.abandonAudioFocus(this.f20567b);
    }

    private void b() {
        if (this.f20570e == 0) {
            return;
        }
        if (o2.m0.f19752a >= 26) {
            c();
        } else {
            a();
        }
        n(0);
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f20573h;
        if (audioFocusRequest != null) {
            this.f20566a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private static int e(t0.e eVar) {
        if (eVar == null) {
            return 0;
        }
        switch (eVar.f21710h) {
            case 0:
                o2.r.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (eVar.f21708f == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case c4.w0.f2149o /* 7 */:
            case c4.w0.f2150p /* 8 */:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                o2.r.i("AudioFocusManager", "Unidentified audio usage: " + eVar.f21710h);
                return 0;
            case 16:
                return o2.m0.f19752a >= 19 ? 4 : 2;
        }
    }

    private void f(int i7) {
        b bVar = this.f20568c;
        if (bVar != null) {
            bVar.a(i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i7) {
        int i8;
        if (i7 == -3 || i7 == -2) {
            if (i7 == -2 || q()) {
                f(0);
                i8 = 2;
            } else {
                i8 = 3;
            }
            n(i8);
            return;
        }
        if (i7 == -1) {
            f(-1);
            b();
        } else if (i7 == 1) {
            n(1);
            f(1);
        } else {
            o2.r.i("AudioFocusManager", "Unknown focus change type: " + i7);
        }
    }

    private int j() {
        if (this.f20570e == 1) {
            return 1;
        }
        if ((o2.m0.f19752a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    private int k() {
        return this.f20566a.requestAudioFocus(this.f20567b, o2.m0.f0(((t0.e) o2.a.e(this.f20569d)).f21710h), this.f20571f);
    }

    private int l() {
        AudioFocusRequest audioFocusRequest = this.f20573h;
        if (audioFocusRequest == null || this.f20574i) {
            this.f20573h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f20571f) : new AudioFocusRequest.Builder(this.f20573h)).setAudioAttributes(((t0.e) o2.a.e(this.f20569d)).b().f21714a).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f20567b).build();
            this.f20574i = false;
        }
        return this.f20566a.requestAudioFocus(this.f20573h);
    }

    private void n(int i7) {
        if (this.f20570e == i7) {
            return;
        }
        this.f20570e = i7;
        float f7 = i7 == 3 ? 0.2f : 1.0f;
        if (this.f20572g == f7) {
            return;
        }
        this.f20572g = f7;
        b bVar = this.f20568c;
        if (bVar != null) {
            bVar.G(f7);
        }
    }

    private boolean o(int i7) {
        return i7 == 1 || this.f20571f != 1;
    }

    private boolean q() {
        t0.e eVar = this.f20569d;
        return eVar != null && eVar.f21708f == 1;
    }

    public float g() {
        return this.f20572g;
    }

    public void i() {
        this.f20568c = null;
        b();
    }

    public void m(t0.e eVar) {
        if (o2.m0.c(this.f20569d, eVar)) {
            return;
        }
        this.f20569d = eVar;
        int e7 = e(eVar);
        this.f20571f = e7;
        boolean z6 = true;
        if (e7 != 1 && e7 != 0) {
            z6 = false;
        }
        o2.a.b(z6, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int p(boolean z6, int i7) {
        if (o(i7)) {
            b();
            return z6 ? 1 : -1;
        }
        if (z6) {
            return j();
        }
        return -1;
    }
}
