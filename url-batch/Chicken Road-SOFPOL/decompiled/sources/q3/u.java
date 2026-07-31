package q3;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final t f6159a;

    public u(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f6159a = new s(nestedScrollView);
        } else {
            this.f6159a = new p.b(1);
        }
    }
}
