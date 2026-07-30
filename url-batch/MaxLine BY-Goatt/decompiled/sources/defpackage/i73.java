package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i73 {
    public h73 a;

    public i73(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new g73(e73.b(i, interpolator, j));
        } else {
            this.a = new d73(i, interpolator, j);
        }
    }
}
