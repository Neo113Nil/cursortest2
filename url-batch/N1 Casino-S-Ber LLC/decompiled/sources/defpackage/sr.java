package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.derinko.gbini.n1casino.R;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class sr {
    public final PathInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public d7 f;

    public sr(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = o8.i0(context, R.attr.motionDurationMedium2, 300);
        this.d = o8.i0(context, R.attr.motionDurationShort3, 150);
        this.e = o8.i0(context, R.attr.motionDurationShort2, 100);
    }
}
