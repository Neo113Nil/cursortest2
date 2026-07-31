package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.AbstractC1317t;
import e.AbstractC2408d;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10429a;

    /* renamed from: b, reason: collision with root package name */
    private final e f10430b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10431c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10432d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10433e;

    /* renamed from: f, reason: collision with root package name */
    private View f10434f;

    /* renamed from: g, reason: collision with root package name */
    private int f10435g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10436h;

    /* renamed from: i, reason: collision with root package name */
    private j.a f10437i;

    /* renamed from: j, reason: collision with root package name */
    private h f10438j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f10439k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f10440l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z4, int i4) {
        this(context, eVar, view, z4, i4, 0);
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f10429a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f10429a.getResources().getDimensionPixelSize(AbstractC2408d.f36222a) ? new b(this.f10429a, this.f10434f, this.f10432d, this.f10433e, this.f10431c) : new l(this.f10429a, this.f10430b, this.f10434f, this.f10432d, this.f10433e, this.f10431c);
        bVar.i(this.f10430b);
        bVar.r(this.f10440l);
        bVar.m(this.f10434f);
        bVar.f(this.f10437i);
        bVar.o(this.f10436h);
        bVar.p(this.f10435g);
        return bVar;
    }

    private void l(int i4, int i5, boolean z4, boolean z5) {
        h c4 = c();
        c4.s(z5);
        if (z4) {
            if ((AbstractC1317t.b(this.f10435g, this.f10434f.getLayoutDirection()) & 7) == 5) {
                i4 -= this.f10434f.getWidth();
            }
            c4.q(i4);
            c4.t(i5);
            int i6 = (int) ((this.f10429a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c4.n(new Rect(i4 - i6, i5 - i6, i4 + i6, i5 + i6));
        }
        c4.show();
    }

    public void b() {
        if (d()) {
            this.f10438j.dismiss();
        }
    }

    public h c() {
        if (this.f10438j == null) {
            this.f10438j = a();
        }
        return this.f10438j;
    }

    public boolean d() {
        h hVar = this.f10438j;
        return hVar != null && hVar.isShowing();
    }

    protected void e() {
        this.f10438j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f10439k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f10434f = view;
    }

    public void g(boolean z4) {
        this.f10436h = z4;
        h hVar = this.f10438j;
        if (hVar != null) {
            hVar.o(z4);
        }
    }

    public void h(int i4) {
        this.f10435g = i4;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f10439k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f10437i = aVar;
        h hVar = this.f10438j;
        if (hVar != null) {
            hVar.f(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f10434f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i4, int i5) {
        if (d()) {
            return true;
        }
        if (this.f10434f == null) {
            return false;
        }
        l(i4, i5, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z4, int i4, int i5) {
        this.f10435g = 8388611;
        this.f10440l = new a();
        this.f10429a = context;
        this.f10430b = eVar;
        this.f10434f = view;
        this.f10431c = z4;
        this.f10432d = i4;
        this.f10433e = i5;
    }
}
