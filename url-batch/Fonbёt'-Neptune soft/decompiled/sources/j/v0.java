package j;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.neptunesoft.languesbacdz.R;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3081a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3082b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f3083c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f3084d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f3085e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f3086f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3087g;

    public v0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f3084d = layoutParams;
        this.f3085e = new Rect();
        this.f3086f = new int[2];
        this.f3087g = new int[2];
        this.f3081a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f3082b = inflate;
        this.f3083c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(v0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
