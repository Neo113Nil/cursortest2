package X3;

import a.AbstractC0124a;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import o3.InterfaceC1328a;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class a extends AbstractC0124a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3614a;

    /* renamed from: b, reason: collision with root package name */
    public final o f3615b;

    /* renamed from: c, reason: collision with root package name */
    public final m f3616c;

    /* renamed from: d, reason: collision with root package name */
    public final n f3617d;

    /* renamed from: e, reason: collision with root package name */
    public W3.a f3618e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3619f;

    public a(o oVar, m mVar, n nVar, int i4) {
        this.f3614a = i4;
        switch (i4) {
            case 1:
                this.f3615b = oVar;
                this.f3616c = mVar;
                this.f3617d = nVar;
                this.f3618e = oVar.f3654c;
                S();
                break;
            default:
                this.f3615b = oVar;
                this.f3616c = mVar;
                this.f3617d = nVar;
                this.f3618e = oVar.f3654c;
                S();
                break;
        }
    }

    @Override // a.AbstractC0124a
    public final InterfaceC1328a A() {
        switch (this.f3614a) {
        }
        return this.f3616c;
    }

    @Override // a.AbstractC0124a
    public final InterfaceC1339l B() {
        switch (this.f3614a) {
        }
        return this.f3617d;
    }

    @Override // a.AbstractC0124a
    public final o C() {
        switch (this.f3614a) {
        }
        return this.f3615b;
    }

    @Override // a.AbstractC0124a
    public final void E() {
        AudioFocusRequest audioFocusRequest;
        switch (this.f3614a) {
            case 0:
                if (F()) {
                    C().f3652a.a().abandonAudioFocus((U.c) this.f3619f);
                    break;
                }
                break;
            default:
                if (F() && (audioFocusRequest = (AudioFocusRequest) this.f3619f) != null) {
                    C().f3652a.a().abandonAudioFocusRequest(audioFocusRequest);
                    break;
                }
                break;
        }
    }

    @Override // a.AbstractC0124a
    public final boolean F() {
        switch (this.f3614a) {
            case 0:
                if (((U.c) this.f3619f) != null) {
                }
                break;
            default:
                if (((AudioFocusRequest) this.f3619f) != null) {
                }
                break;
        }
        return false;
    }

    @Override // a.AbstractC0124a
    public final void M() {
        int requestAudioFocus;
        switch (this.f3614a) {
            case 0:
                D(C().f3652a.a().requestAudioFocus((U.c) this.f3619f, 3, this.f3618e.f3469e));
                break;
            default:
                AudioManager a3 = C().f3652a.a();
                AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.f3619f;
                kotlin.jvm.internal.i.b(audioFocusRequest);
                requestAudioFocus = a3.requestAudioFocus(audioFocusRequest);
                D(requestAudioFocus);
                break;
        }
    }

    @Override // a.AbstractC0124a
    public final void N(W3.a aVar) {
        switch (this.f3614a) {
            case 0:
                this.f3618e = aVar;
                break;
            default:
                this.f3618e = aVar;
                break;
        }
    }

    @Override // a.AbstractC0124a
    public final void S() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        switch (this.f3614a) {
            case 0:
                this.f3619f = this.f3618e.f3469e == 0 ? null : new U.c(1, this);
                break;
            default:
                if (this.f3618e.f3469e == 0) {
                    build = null;
                } else {
                    C.a.s();
                    audioAttributes = C.a.h(this.f3618e.f3469e).setAudioAttributes(this.f3618e.a());
                    onAudioFocusChangeListener = audioAttributes.setOnAudioFocusChangeListener(new U.c(2, this));
                    build = onAudioFocusChangeListener.build();
                }
                this.f3619f = build;
                break;
        }
    }

    @Override // a.AbstractC0124a
    public final W3.a y() {
        switch (this.f3614a) {
        }
        return this.f3618e;
    }
}
