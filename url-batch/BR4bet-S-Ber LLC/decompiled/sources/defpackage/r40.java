package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class r40 {
    public final q40 a;

    public r40(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new p40(nestedScrollView);
        } else {
            this.a = new ky(12);
        }
    }
}
