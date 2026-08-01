package j;

import K.Z;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f3073c;
    public H1.l d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3074e;

    /* renamed from: b, reason: collision with root package name */
    public long f3072b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f3075f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3071a = new ArrayList();

    public final void a() {
        if (this.f3074e) {
            Iterator it = this.f3071a.iterator();
            while (it.hasNext()) {
                ((Z) it.next()).b();
            }
            this.f3074e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f3074e) {
            return;
        }
        Iterator it = this.f3071a.iterator();
        while (it.hasNext()) {
            Z z2 = (Z) it.next();
            long j2 = this.f3072b;
            if (j2 >= 0) {
                z2.c(j2);
            }
            BaseInterpolator baseInterpolator = this.f3073c;
            if (baseInterpolator != null && (view = (View) z2.f591a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.d != null) {
                z2.d(this.f3075f);
            }
            View view2 = (View) z2.f591a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f3074e = true;
    }
}
