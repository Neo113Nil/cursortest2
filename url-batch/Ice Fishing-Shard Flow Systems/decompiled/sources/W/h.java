package W;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h extends U.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2780a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f2781b;

    public h(EditText editText) {
        this.f2781b = new WeakReference(editText);
    }

    @Override // U.h
    public void a() {
        switch (this.f2780a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f2781b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }

    @Override // U.h
    public final void b() {
        switch (this.f2780a) {
            case 0:
                i.a((EditText) this.f2781b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f2781b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }

    public h(SwitchCompat switchCompat) {
        this.f2781b = new WeakReference(switchCompat);
    }
}
