package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ks {
    public final hs a;
    public final gs b;
    public final View c;

    public ks(gs gsVar, View view) {
        int i = Build.VERSION.SDK_INT;
        this.a = i >= 34 ? new js() : i >= 33 ? new hs() : null;
        this.b = gsVar;
        this.c = view;
    }
}
