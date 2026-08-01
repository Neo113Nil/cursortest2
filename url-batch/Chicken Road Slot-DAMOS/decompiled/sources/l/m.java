package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.appsflyer.R;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5709a;

    /* renamed from: b, reason: collision with root package name */
    public final i f5710b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5711c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5712d;

    /* renamed from: e, reason: collision with root package name */
    public View f5713e;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public n f5715h;

    /* renamed from: i, reason: collision with root package name */
    public k f5716i;
    public PopupWindow.OnDismissListener j;

    /* renamed from: f, reason: collision with root package name */
    public int f5714f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final l f5717k = new l(this);

    public m(Context context, i iVar, View view, boolean z10, int i3, int i10) {
        this.f5709a = context;
        this.f5710b = iVar;
        this.f5713e = view;
        this.f5711c = z10;
        this.f5712d = i3;
    }

    public final k a() {
        k rVar;
        if (this.f5716i == null) {
            Context context = this.f5709a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.f5709a;
            if (min >= dimensionPixelSize) {
                rVar = new f(context2, this.f5713e, this.f5712d, this.f5711c);
            } else {
                rVar = new r(context2, this.f5710b, this.f5713e, this.f5712d, this.f5711c);
            }
            rVar.l(this.f5710b);
            rVar.r(this.f5717k);
            rVar.n(this.f5713e);
            rVar.e(this.f5715h);
            rVar.o(this.g);
            rVar.p(this.f5714f);
            this.f5716i = rVar;
        }
        return this.f5716i;
    }

    public final boolean b() {
        k kVar = this.f5716i;
        return kVar != null && kVar.j();
    }

    public void c() {
        this.f5716i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i3, int i10, boolean z10, boolean z11) {
        k a9 = a();
        a9.s(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f5714f, this.f5713e.getLayoutDirection()) & 7) == 5) {
                i3 -= this.f5713e.getWidth();
            }
            a9.q(i3);
            a9.t(i10);
            int i11 = (int) ((this.f5709a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a9.f5707d = new Rect(i3 - i11, i10 - i11, i3 + i11, i10 + i11);
        }
        a9.a();
    }
}
