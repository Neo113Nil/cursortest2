package h;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.aurifaber.valuta.rotatus.signum.modulus.R;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2298a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2299b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f2300c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f2301d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f2302e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2303f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2304g;

    public t0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2301d = layoutParams;
        this.f2302e = new Rect();
        this.f2303f = new int[2];
        this.f2304g = new int[2];
        this.f2298a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f2299b = inflate;
        this.f2300c = (TextView) inflate.findViewById(R.id.message);
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
