package I0;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import b.C0089b;
import com.winpower.neonfit.R;
import com.winpower.neonfit.data.UserPreferences;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f580a;

    /* renamed from: b, reason: collision with root package name */
    public final View f581b;

    /* renamed from: c, reason: collision with root package name */
    public final int f582c;

    /* renamed from: d, reason: collision with root package name */
    public final int f583d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public C0089b f584f;

    public a(View view) {
        this.f581b = view;
        Context context = view.getContext();
        this.f580a = H1.l.U(context, R.attr.motionEasingStandardDecelerateInterpolator, O.a.b(0.0f, 0.0f, 0.0f, 1.0f));
        this.f582c = H1.l.T(context, R.attr.motionDurationMedium2, 300);
        this.f583d = H1.l.T(context, R.attr.motionDurationShort3, UserPreferences.DEFAULT_PROTEIN_GOAL);
        this.e = H1.l.T(context, R.attr.motionDurationShort2, 100);
    }
}
