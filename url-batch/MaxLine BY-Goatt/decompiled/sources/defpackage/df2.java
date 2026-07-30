package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class df2 {
    public final cf2 a;

    public df2(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new bf2(nestedScrollView);
        } else {
            this.a = new nm1(26);
        }
    }
}
