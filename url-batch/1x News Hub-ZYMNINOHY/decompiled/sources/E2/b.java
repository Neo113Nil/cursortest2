package E2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final class b extends C2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f425b;

    /* renamed from: c, reason: collision with root package name */
    public final p f426c;

    /* renamed from: d, reason: collision with root package name */
    public final n f427d;

    /* renamed from: e, reason: collision with root package name */
    public final o f428e;
    public D2.a f;

    /* renamed from: g, reason: collision with root package name */
    public Object f429g;

    public b(p player, n nVar, o oVar, int i3) {
        this.f425b = i3;
        switch (i3) {
            case 1:
                kotlin.jvm.internal.j.e(player, "player");
                this.f426c = player;
                this.f427d = nVar;
                this.f428e = oVar;
                this.f = player.f461c;
                J();
                break;
            default:
                kotlin.jvm.internal.j.e(player, "player");
                this.f426c = player;
                this.f427d = nVar;
                this.f428e = oVar;
                this.f = player.f461c;
                J();
                break;
        }
    }

    @Override // C2.b
    public final void C() {
        int requestAudioFocus;
        switch (this.f425b) {
            case 0:
                u(s().f459a.a().requestAudioFocus((a) this.f429g, 3, this.f.f229e));
                break;
            default:
                AudioManager a3 = s().f459a.a();
                AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.f429g;
                kotlin.jvm.internal.j.b(audioFocusRequest);
                requestAudioFocus = a3.requestAudioFocus(audioFocusRequest);
                u(requestAudioFocus);
                break;
        }
    }

    @Override // C2.b
    public final void D(D2.a aVar) {
        switch (this.f425b) {
            case 0:
                this.f = aVar;
                break;
            default:
                this.f = aVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [E2.a] */
    @Override // C2.b
    public final void J() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder onAudioFocusChangeListener2;
        AudioFocusRequest build;
        switch (this.f425b) {
            case 0:
                if (this.f.f229e == 0) {
                    onAudioFocusChangeListener = null;
                } else {
                    final int i3 = 0;
                    onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: E2.a
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i4) {
                            switch (i3) {
                                case 0:
                                    ((b) this).u(i4);
                                    break;
                                default:
                                    ((b) this).u(i4);
                                    break;
                            }
                        }
                    };
                }
                this.f429g = onAudioFocusChangeListener;
                break;
            default:
                if (this.f.f229e == 0) {
                    build = null;
                } else {
                    C.a.s();
                    audioAttributes = C.a.j(this.f.f229e).setAudioAttributes(this.f.a());
                    final int i4 = 1;
                    onAudioFocusChangeListener2 = audioAttributes.setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: E2.a
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i42) {
                            switch (i4) {
                                case 0:
                                    ((b) this).u(i42);
                                    break;
                                default:
                                    ((b) this).u(i42);
                                    break;
                            }
                        }
                    });
                    build = onAudioFocusChangeListener2.build();
                }
                this.f429g = build;
                break;
        }
    }

    @Override // C2.b
    public final D2.a n() {
        switch (this.f425b) {
        }
        return this.f;
    }

    @Override // C2.b
    public final l2.a p() {
        switch (this.f425b) {
        }
        return this.f427d;
    }

    @Override // C2.b
    public final l2.l q() {
        switch (this.f425b) {
        }
        return this.f428e;
    }

    @Override // C2.b
    public final p s() {
        switch (this.f425b) {
        }
        return this.f426c;
    }

    @Override // C2.b
    public final void v() {
        AudioFocusRequest audioFocusRequest;
        switch (this.f425b) {
            case 0:
                if (w()) {
                    s().f459a.a().abandonAudioFocus((a) this.f429g);
                    break;
                }
                break;
            default:
                if (w() && (audioFocusRequest = (AudioFocusRequest) this.f429g) != null) {
                    s().f459a.a().abandonAudioFocusRequest(audioFocusRequest);
                    break;
                }
                break;
        }
    }

    @Override // C2.b
    public final boolean w() {
        switch (this.f425b) {
            case 0:
                if (((a) this.f429g) != null) {
                }
                break;
            default:
                if (((AudioFocusRequest) this.f429g) != null) {
                }
                break;
        }
        return false;
    }
}
