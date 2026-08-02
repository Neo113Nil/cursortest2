package E;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* renamed from: E.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020v {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0019u f443a;

    public C0020v(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f443a = new C0018t(nestedScrollView);
        } else {
            this.f443a = new a2.i(1);
        }
    }
}
