package k;

import E.A;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.fc.barca.football.R;
import java.lang.reflect.Field;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1069n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9642a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC1065j f9643b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9644c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9645d;

    /* renamed from: e, reason: collision with root package name */
    public View f9646e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9647g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1070o f9648h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC1067l f9649i;

    /* renamed from: j, reason: collision with root package name */
    public C1068m f9650j;
    public int f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C1068m f9651k = new C1068m(this);

    public C1069n(int i3, Context context, View view, MenuC1065j menuC1065j, boolean z) {
        this.f9642a = context;
        this.f9643b = menuC1065j;
        this.f9646e = view;
        this.f9644c = z;
        this.f9645d = i3;
    }

    public final AbstractC1067l a() {
        AbstractC1067l viewOnKeyListenerC1074s;
        if (this.f9649i == null) {
            Context context = this.f9642a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1074s = new ViewOnKeyListenerC1062g(context, this.f9646e, this.f9645d, this.f9644c);
            } else {
                View view = this.f9646e;
                Context context2 = this.f9642a;
                boolean z = this.f9644c;
                viewOnKeyListenerC1074s = new ViewOnKeyListenerC1074s(this.f9645d, context2, view, this.f9643b, z);
            }
            viewOnKeyListenerC1074s.l(this.f9643b);
            viewOnKeyListenerC1074s.r(this.f9651k);
            viewOnKeyListenerC1074s.n(this.f9646e);
            viewOnKeyListenerC1074s.h(this.f9648h);
            viewOnKeyListenerC1074s.o(this.f9647g);
            viewOnKeyListenerC1074s.p(this.f);
            this.f9649i = viewOnKeyListenerC1074s;
        }
        return this.f9649i;
    }

    public final boolean b() {
        AbstractC1067l abstractC1067l = this.f9649i;
        return abstractC1067l != null && abstractC1067l.k();
    }

    public void c() {
        this.f9649i = null;
        C1068m c1068m = this.f9650j;
        if (c1068m != null) {
            c1068m.onDismiss();
        }
    }

    public final void d(int i3, int i4, boolean z, boolean z2) {
        AbstractC1067l a3 = a();
        a3.s(z2);
        if (z) {
            int i5 = this.f;
            View view = this.f9646e;
            Field field = A.f243a;
            if ((Gravity.getAbsoluteGravity(i5, view.getLayoutDirection()) & 7) == 5) {
                i3 -= this.f9646e.getWidth();
            }
            a3.q(i3);
            a3.t(i4);
            int i6 = (int) ((this.f9642a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a3.f9640a = new Rect(i3 - i6, i4 - i6, i3 + i6, i4 + i6);
        }
        a3.d();
    }
}
