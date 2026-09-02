package a;

import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements e3.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f0f;

    @Override // e3.a
    public final Object a() {
        switch (this.f0f) {
            case 0:
                int i = ImmLeaksCleaner.f117f;
                try {
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    return new b0();
                } catch (NoSuchFieldException unused) {
                    return b0.f4n;
                }
            default:
                h3.a aVar = h3.e.f1808f;
                return Integer.valueOf(h3.e.f1808f.a().nextInt(2147418112) + 65536);
        }
    }
}
