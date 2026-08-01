package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class yz {
    public final PathInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public z7 f;

    public yz(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = d50.R(context, R.attr.motionDurationMedium2, 300);
        this.d = d50.R(context, R.attr.motionDurationShort3, 150);
        this.e = d50.R(context, R.attr.motionDurationShort2, 100);
    }
}
