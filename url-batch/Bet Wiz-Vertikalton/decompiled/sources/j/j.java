package j;

import K.Z;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f2578c;
    public x1.l d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2579e;

    /* renamed from: b, reason: collision with root package name */
    public long f2577b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f2580f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2576a = new ArrayList();

    public final void a() {
        if (this.f2579e) {
            Iterator it = this.f2576a.iterator();
            while (it.hasNext()) {
                ((Z) it.next()).b();
            }
            this.f2579e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2579e) {
            return;
        }
        Iterator it = this.f2576a.iterator();
        while (it.hasNext()) {
            Z z2 = (Z) it.next();
            long j2 = this.f2577b;
            if (j2 >= 0) {
                z2.c(j2);
            }
            BaseInterpolator baseInterpolator = this.f2578c;
            if (baseInterpolator != null && (view = (View) z2.f431a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.d != null) {
                z2.d(this.f2580f);
            }
            View view2 = (View) z2.f431a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2579e = true;
    }
}
