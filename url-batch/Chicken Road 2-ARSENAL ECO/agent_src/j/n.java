package j;

import D.D;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.strategylink.Row.Five.R;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4844a;

    /* renamed from: b, reason: collision with root package name */
    public final j f4845b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4846c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4847d;

    /* renamed from: e, reason: collision with root package name */
    public View f4848e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4850g;

    /* renamed from: h, reason: collision with root package name */
    public o f4851h;

    /* renamed from: i, reason: collision with root package name */
    public l f4852i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4853j;

    /* renamed from: f, reason: collision with root package name */
    public int f4849f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final m f4854k = new m(this);

    public n(Context context, j jVar, View view, boolean z5, int i7, int i8) {
        this.f4844a = context;
        this.f4845b = jVar;
        this.f4848e = view;
        this.f4846c = z5;
        this.f4847d = i7;
    }

    public final l a() {
        l sVar;
        if (this.f4852i == null) {
            Context context = this.f4844a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new g(context, this.f4848e, this.f4847d, this.f4846c);
            } else {
                sVar = new s(this.f4844a, this.f4845b, this.f4848e, this.f4847d, this.f4846c);
            }
            sVar.l(this.f4845b);
            sVar.r(this.f4854k);
            sVar.n(this.f4848e);
            sVar.j(this.f4851h);
            sVar.o(this.f4850g);
            sVar.p(this.f4849f);
            this.f4852i = sVar;
        }
        return this.f4852i;
    }

    public final boolean b() {
        l lVar = this.f4852i;
        return lVar != null && lVar.h();
    }

    public void c() {
        this.f4852i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f4853j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i7, int i8, boolean z5, boolean z6) {
        l a7 = a();
        a7.s(z6);
        if (z5) {
            int i9 = this.f4849f;
            View view = this.f4848e;
            Field field = D.f240a;
            if ((Gravity.getAbsoluteGravity(i9, view.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f4848e.getWidth();
            }
            a7.q(i7);
            a7.t(i8);
            int i10 = (int) ((this.f4844a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a7.f4842f = new Rect(i7 - i10, i8 - i10, i7 + i10, i8 + i10);
        }
        a7.b();
    }
}
