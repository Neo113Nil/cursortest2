package X;

import android.widget.EditText;
import java.lang.ref.WeakReference;
import m.W0;

/* loaded from: classes.dex */
public final class h extends V.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f977a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f978b;

    public h(EditText editText) {
        this.f978b = new WeakReference(editText);
    }

    @Override // V.h
    public void a() {
        switch (this.f977a) {
            case 1:
                W0 w02 = (W0) this.f978b.get();
                if (w02 != null) {
                    w02.c();
                    break;
                }
                break;
        }
    }

    @Override // V.h
    public final void b() {
        switch (this.f977a) {
            case 0:
                i.a((EditText) this.f978b.get(), 1);
                break;
            default:
                W0 w02 = (W0) this.f978b.get();
                if (w02 != null) {
                    w02.c();
                    break;
                }
                break;
        }
    }

    public h(W0 w02) {
        this.f978b = new WeakReference(w02);
    }
}
