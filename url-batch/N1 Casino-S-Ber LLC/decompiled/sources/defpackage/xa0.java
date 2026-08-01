package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class xa0 {
    public wa0 a;

    public xa0(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new va0(b0.i(i, interpolator, j));
        } else {
            this.a = new ta0(i, interpolator, j);
        }
    }
}
