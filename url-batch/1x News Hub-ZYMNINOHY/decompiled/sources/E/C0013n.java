package E;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* renamed from: E.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013n {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0012m f294a;

    public C0013n(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f294a = new C0011l(nestedScrollView);
        } else {
            this.f294a = new K0.j(2);
        }
    }
}
