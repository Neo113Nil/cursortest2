package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fkd {
    public final View a;
    public final int b;
    public final int c;
    protected final int d;
    public mx e;
    private final TimeInterpolator f = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    public fkd(View view) {
        this.a = view;
        Context context = view.getContext();
        this.b = fny.i(context, R.attr.motionDurationMedium2, 300);
        this.c = fny.i(context, R.attr.motionDurationShort3, 150);
        this.d = fny.i(context, R.attr.motionDurationShort2, 100);
    }

    public final float a(float f) {
        return this.f.getInterpolation(f);
    }

    protected final mx b() {
        if (this.e == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        mx mxVar = this.e;
        this.e = null;
        return mxVar;
    }

    public final mx c() {
        mx mxVar = this.e;
        this.e = null;
        return mxVar;
    }

    protected final mx d(mx mxVar) {
        if (this.e == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        mx mxVar2 = this.e;
        this.e = mxVar;
        return mxVar2;
    }
}
