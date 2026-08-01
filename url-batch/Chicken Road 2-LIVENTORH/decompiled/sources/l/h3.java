package l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2337a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2338b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f2339c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2340e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2341f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2342g;

    public h3(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, Button button4, Button button5, Button button6) {
        this.f2337a = constraintLayout;
        this.f2338b = button;
        this.f2339c = button2;
        this.d = button3;
        this.f2340e = button4;
        this.f2341f = button5;
        this.f2342g = button6;
    }

    public h3(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.d = layoutParams;
        this.f2340e = new Rect();
        this.f2341f = new int[2];
        this.f2342g = new int[2];
        this.f2337a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f2338b = inflate;
        this.f2339c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(h3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
