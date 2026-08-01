package X;

import android.widget.EditText;
import java.lang.ref.WeakReference;
import n.V0;

/* loaded from: classes.dex */
public final class h extends V.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1361a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f1362b;

    public h(EditText editText) {
        this.f1362b = new WeakReference(editText);
    }

    @Override // V.h
    public void a() {
        switch (this.f1361a) {
            case 1:
                V0 v02 = (V0) this.f1362b.get();
                if (v02 != null) {
                    v02.c();
                    break;
                }
                break;
        }
    }

    @Override // V.h
    public final void b() {
        switch (this.f1361a) {
            case 0:
                i.a((EditText) this.f1362b.get(), 1);
                break;
            default:
                V0 v02 = (V0) this.f1362b.get();
                if (v02 != null) {
                    v02.c();
                    break;
                }
                break;
        }
    }

    public h(V0 v02) {
        this.f1362b = new WeakReference(v02);
    }
}
