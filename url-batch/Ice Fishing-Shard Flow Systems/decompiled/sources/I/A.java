package I;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0129z f1133a;

    public A(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f1133a = new C0128y(nestedScrollView);
        } else {
            this.f1133a = new q1.h(3);
        }
    }
}
