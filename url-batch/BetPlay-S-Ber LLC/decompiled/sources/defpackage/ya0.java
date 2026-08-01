package defpackage;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ya0 {
    public final ip a;
    public final ip b;

    public ya0(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        lowerBound = bounds.getLowerBound();
        this.a = ip.d(lowerBound);
        upperBound = bounds.getUpperBound();
        this.b = ip.d(upperBound);
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }

    public ya0(ip ipVar, ip ipVar2) {
        this.a = ipVar;
        this.b = ipVar2;
    }
}
