package a;

import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements h3.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f0f;

    @Override // h3.a
    public final Object a() {
        switch (this.f0f) {
            case 0:
                int i = ImmLeaksCleaner.f250a;
                try {
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    return new b0();
                } catch (NoSuchFieldException unused) {
                    return b0.f3o;
                }
            default:
                k3.a aVar = k3.e.f2386f;
                return Integer.valueOf(k3.e.f2386f.a().nextInt(2147418112) + 65536);
        }
    }
}
