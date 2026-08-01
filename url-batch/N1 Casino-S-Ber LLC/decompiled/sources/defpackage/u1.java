package defpackage;

import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class u1 implements ml {
    public final /* synthetic */ int f;

    @Override // defpackage.ml
    public final Object a() {
        switch (this.f) {
            case 0:
                m mVar = zx.f;
                return Integer.valueOf(zx.f.a().nextInt(2147418112) + 65536);
            default:
                int i = ImmLeaksCleaner.a;
                try {
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    return new mo();
                } catch (NoSuchFieldException unused) {
                    return mo.i;
                }
        }
    }
}
