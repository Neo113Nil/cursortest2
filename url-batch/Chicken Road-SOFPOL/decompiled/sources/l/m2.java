package l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4341a;

    /* renamed from: b, reason: collision with root package name */
    public final View f4342b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f4343c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f4344d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f4345e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4346f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f4347g;

    public m2(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f4344d = layoutParams;
        this.f4345e = new Rect();
        this.f4346f = new int[2];
        this.f4347g = new int[2];
        this.f4341a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f4342b = inflate;
        this.f4343c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(m2.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
