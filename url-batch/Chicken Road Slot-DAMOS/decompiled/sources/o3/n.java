package o3;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final m f7423a;

    public n(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f7423a = new l(nestedScrollView);
        } else {
            this.f7423a = new k5.c(9);
        }
    }
}
