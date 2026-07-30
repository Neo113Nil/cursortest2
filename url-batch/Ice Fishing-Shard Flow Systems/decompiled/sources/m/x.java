package m;

import I.T;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6476a;

    /* renamed from: b, reason: collision with root package name */
    public final m f6477b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6478c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6479d;

    /* renamed from: e, reason: collision with root package name */
    public View f6480e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6482g;

    /* renamed from: h, reason: collision with root package name */
    public y f6483h;

    /* renamed from: i, reason: collision with root package name */
    public u f6484i;
    public PopupWindow.OnDismissListener j;

    /* renamed from: f, reason: collision with root package name */
    public int f6481f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final v f6485k = new v(this);

    public x(Context context, m mVar, View view, boolean z7, int i2, int i5) {
        this.f6476a = context;
        this.f6477b = mVar;
        this.f6480e = view;
        this.f6478c = z7;
        this.f6479d = i2;
    }

    public final u a() {
        u e7;
        if (this.f6484i == null) {
            Context context = this.f6476a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            w.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                e7 = new g(context, this.f6480e, this.f6479d, this.f6478c);
            } else {
                e7 = new E(this.f6476a, this.f6477b, this.f6480e, this.f6479d, this.f6478c);
            }
            e7.l(this.f6477b);
            e7.r(this.f6485k);
            e7.n(this.f6480e);
            e7.j(this.f6483h);
            e7.o(this.f6482g);
            e7.p(this.f6481f);
            this.f6484i = e7;
        }
        return this.f6484i;
    }

    public final boolean b() {
        u uVar = this.f6484i;
        return uVar != null && uVar.b();
    }

    public void c() {
        this.f6484i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i2, int i5, boolean z7, boolean z8) {
        u a7 = a();
        a7.s(z8);
        if (z7) {
            int i7 = this.f6481f;
            View view = this.f6480e;
            WeakHashMap weakHashMap = T.f1153a;
            if ((Gravity.getAbsoluteGravity(i7, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f6480e.getWidth();
            }
            a7.q(i2);
            a7.t(i5);
            int i8 = (int) ((this.f6476a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a7.f6474d = new Rect(i2 - i8, i5 - i8, i2 + i8, i5 + i8);
        }
        a7.c();
    }
}
