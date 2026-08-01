package defpackage;

import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;
import com.awerser.monnit.betplay.MainActivity;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class d2 implements vl {
    public final /* synthetic */ int f;

    public /* synthetic */ d2(int i) {
        this.f = i;
    }

    @Override // defpackage.vl
    public final Object a() {
        switch (this.f) {
            case 0:
                m mVar = py.f;
                return Integer.valueOf(py.f.a().nextInt(2147418112) + 65536);
            case 1:
                int i = ImmLeaksCleaner.a;
                try {
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    return new bp();
                } catch (NoSuchFieldException unused) {
                    return bp.o;
                }
            default:
                int i2 = MainActivity.L;
                return new bw(new aw());
        }
    }
}
