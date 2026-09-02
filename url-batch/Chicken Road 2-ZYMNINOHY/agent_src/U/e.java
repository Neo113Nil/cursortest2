package U;

import E1.C0033i;
import T.C0086d;
import W.E;
import W.F;
import a0.M;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final u2.m f3025a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3026b;

    /* renamed from: c, reason: collision with root package name */
    public M f3027c;

    /* renamed from: d, reason: collision with root package name */
    public C0086d f3028d;

    /* renamed from: e, reason: collision with root package name */
    public int f3029e;

    /* renamed from: f, reason: collision with root package name */
    public int f3030f;

    /* renamed from: g, reason: collision with root package name */
    public float f3031g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public h f3032h;

    public e(Context context, Looper looper, M m4) {
        d dVar = new d(context, 0);
        this.f3025a = dVar instanceof Serializable ? new u2.n(dVar) : new u2.o(dVar);
        this.f3027c = m4;
        this.f3026b = new Handler(looper);
        this.f3029e = 0;
    }

    public final void a() {
        int i4 = this.f3029e;
        if (i4 == 1 || i4 == 0 || this.f3032h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f3025a.get();
        h hVar = this.f3032h;
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(hVar.f3039b);
            return;
        }
        Object obj = hVar.f3043f;
        obj.getClass();
        audioManager.abandonAudioFocusRequest(C.a.n(obj));
    }

    public final void b(int i4) {
        M m4 = this.f3027c;
        if (m4 != null) {
            F f4 = m4.f3962h;
            f4.getClass();
            E b4 = F.b();
            b4.f3255a = f4.f3257a.obtainMessage(33, i4, 0);
            b4.b();
        }
    }

    public final void c(int i4) {
        if (this.f3029e == i4) {
            return;
        }
        this.f3029e = i4;
        float f4 = i4 == 4 ? 0.2f : 1.0f;
        if (this.f3031g == f4) {
            return;
        }
        this.f3031g = f4;
        M m4 = this.f3027c;
        if (m4 != null) {
            m4.f3962h.e(34);
        }
    }

    public final int d(int i4, boolean z) {
        int i5;
        int requestAudioFocus;
        C0033i c0033i;
        boolean z4 = false;
        if (i4 == 1 || (i5 = this.f3030f) != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z) {
            int i6 = this.f3029e;
            if (i6 == 1) {
                return -1;
            }
            if (i6 == 3) {
                return 0;
            }
        } else if (this.f3029e != 2) {
            h hVar = this.f3032h;
            if (hVar == null) {
                if (hVar == null) {
                    c0033i = new C0033i();
                    c0033i.f621c = C0086d.f2771c;
                    c0033i.f619a = i5;
                } else {
                    C0033i c0033i2 = new C0033i();
                    c0033i2.f619a = hVar.f3038a;
                    c0033i2.f621c = hVar.f3041d;
                    c0033i2.f620b = hVar.f3042e;
                    c0033i = c0033i2;
                }
                C0086d c0086d = this.f3028d;
                if (c0086d != null && c0086d.f2772a == 1) {
                    z4 = true;
                }
                c0086d.getClass();
                c0033i.f621c = c0086d;
                c0033i.f620b = z4;
                c cVar = new c(0, this);
                Handler handler = this.f3026b;
                handler.getClass();
                this.f3032h = new h(c0033i.f619a, cVar, handler, (C0086d) c0033i.f621c, c0033i.f620b);
            }
            AudioManager audioManager = (AudioManager) this.f3025a.get();
            h hVar2 = this.f3032h;
            if (Build.VERSION.SDK_INT >= 26) {
                Object obj = hVar2.f3043f;
                obj.getClass();
                requestAudioFocus = audioManager.requestAudioFocus(C.a.n(obj));
            } else {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = hVar2.f3039b;
                hVar2.f3041d.getClass();
                requestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, hVar2.f3038a);
            }
            if (requestAudioFocus == 1) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }
}
