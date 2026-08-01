package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class tu {
    public final PathInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public n7 f;

    public tu(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = kr.W(context, R.attr.motionDurationMedium2, 300);
        this.d = kr.W(context, R.attr.motionDurationShort3, 150);
        this.e = kr.W(context, R.attr.motionDurationShort2, 100);
    }
}
