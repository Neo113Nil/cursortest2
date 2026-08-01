package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.awerser.monnit.betplay.R;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class fs {
    public final PathInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public r7 f;

    public fs(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = vw.d0(context, R.attr.motionDurationMedium2, 300);
        this.d = vw.d0(context, R.attr.motionDurationShort3, 150);
        this.e = vw.d0(context, R.attr.motionDurationShort2, 100);
    }
}
