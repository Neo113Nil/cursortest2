package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4116a;

    /* renamed from: b, reason: collision with root package name */
    public final i f4117b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4118c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4119d;

    /* renamed from: e, reason: collision with root package name */
    public View f4120e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4122g;

    /* renamed from: h, reason: collision with root package name */
    public n f4123h;
    public k i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4124j;

    /* renamed from: f, reason: collision with root package name */
    public int f4121f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final l f4125k = new l(this);

    public m(Context context, i iVar, View view, boolean z3, int i, int i8) {
        this.f4116a = context;
        this.f4117b = iVar;
        this.f4120e = view;
        this.f4118c = z3;
        this.f4119d = i;
    }

    public final k a() {
        k rVar;
        if (this.i == null) {
            Context context = this.f4116a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                rVar = new f(context, this.f4120e, this.f4119d, this.f4118c);
            } else {
                rVar = new r(this.f4116a, this.f4117b, this.f4120e, this.f4119d, this.f4118c);
            }
            rVar.l(this.f4117b);
            rVar.r(this.f4125k);
            rVar.n(this.f4120e);
            rVar.h(this.f4123h);
            rVar.o(this.f4122g);
            rVar.p(this.f4121f);
            this.i = rVar;
        }
        return this.i;
    }

    public final boolean b() {
        k kVar = this.i;
        return kVar != null && kVar.k();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f4124j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i8, boolean z3, boolean z7) {
        k a8 = a();
        a8.s(z7);
        if (z3) {
            if ((Gravity.getAbsoluteGravity(this.f4121f, this.f4120e.getLayoutDirection()) & 7) == 5) {
                i -= this.f4120e.getWidth();
            }
            a8.q(i);
            a8.t(i8);
            int i9 = (int) ((this.f4116a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a8.f4114d = new Rect(i - i9, i8 - i9, i + i9, i8 + i9);
        }
        a8.d();
    }
}
