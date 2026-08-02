package j;

import E.H;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.rockchicken.pump.up.road.R;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13692a;

    /* renamed from: b, reason: collision with root package name */
    public final j f13693b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13694c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13695d;

    /* renamed from: e, reason: collision with root package name */
    public View f13696e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13698g;

    /* renamed from: h, reason: collision with root package name */
    public o f13699h;

    /* renamed from: i, reason: collision with root package name */
    public l f13700i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f13701j;

    /* renamed from: f, reason: collision with root package name */
    public int f13697f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final m f13702k = new m(this);

    public n(Context context, j jVar, View view, boolean z, int i4, int i5) {
        this.f13692a = context;
        this.f13693b = jVar;
        this.f13696e = view;
        this.f13694c = z;
        this.f13695d = i4;
    }

    public final l a() {
        l sVar;
        if (this.f13700i == null) {
            Context context = this.f13692a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new g(context, this.f13696e, this.f13695d, this.f13694c);
            } else {
                sVar = new s(this.f13692a, this.f13693b, this.f13696e, this.f13695d, this.f13694c);
            }
            sVar.k(this.f13693b);
            sVar.q(this.f13702k);
            sVar.m(this.f13696e);
            sVar.e(this.f13699h);
            sVar.n(this.f13698g);
            sVar.o(this.f13697f);
            this.f13700i = sVar;
        }
        return this.f13700i;
    }

    public final boolean b() {
        l lVar = this.f13700i;
        return lVar != null && lVar.c();
    }

    public void c() {
        this.f13700i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f13701j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i4, int i5, boolean z, boolean z4) {
        l a3 = a();
        a3.r(z4);
        if (z) {
            int i6 = this.f13697f;
            View view = this.f13696e;
            Field field = H.f375a;
            if ((Gravity.getAbsoluteGravity(i6, view.getLayoutDirection()) & 7) == 5) {
                i4 -= this.f13696e.getWidth();
            }
            a3.p(i4);
            a3.s(i5);
            int i7 = (int) ((this.f13692a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a3.f13690a = new Rect(i4 - i7, i5 - i7, i4 + i7, i5 + i7);
        }
        a3.show();
    }
}
