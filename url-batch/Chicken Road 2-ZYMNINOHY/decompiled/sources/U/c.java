package U;

import E.AbstractC0005f;
import T.C0086d;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3022b;

    public /* synthetic */ c(int i4, Object obj) {
        this.f3021a = i4;
        this.f3022b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i4) {
        C0086d c0086d;
        switch (this.f3021a) {
            case 0:
                e eVar = (e) this.f3022b;
                eVar.getClass();
                if (i4 != -3 && i4 != -2) {
                    if (i4 == -1) {
                        eVar.b(-1);
                        eVar.a();
                        eVar.c(1);
                        break;
                    } else if (i4 == 1) {
                        eVar.c(2);
                        eVar.b(1);
                        break;
                    } else {
                        AbstractC0005f.u(i4, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else if (i4 != -2 && ((c0086d = eVar.f3028d) == null || c0086d.f2772a != 1)) {
                    eVar.c(4);
                    break;
                } else {
                    eVar.b(0);
                    eVar.c(3);
                    break;
                }
                break;
            case 1:
                ((X3.a) this.f3022b).D(i4);
                break;
            default:
                ((X3.a) this.f3022b).D(i4);
                break;
        }
    }
}
