package i;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.crane.slab.beam.R;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2313a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2314b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f2315c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f2316d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f2317e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2318f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2319g;

    public t0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2316d = layoutParams;
        this.f2317e = new Rect();
        this.f2318f = new int[2];
        this.f2319g = new int[2];
        this.f2313a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f2314b = inflate;
        this.f2315c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(t0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
