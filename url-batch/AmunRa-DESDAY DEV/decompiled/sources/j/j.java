package j;

import K.Z;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f2522c;
    public s1.d d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2523e;

    /* renamed from: b, reason: collision with root package name */
    public long f2521b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f2524f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2520a = new ArrayList();

    public final void a() {
        if (this.f2523e) {
            Iterator it = this.f2520a.iterator();
            while (it.hasNext()) {
                ((Z) it.next()).b();
            }
            this.f2523e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2523e) {
            return;
        }
        Iterator it = this.f2520a.iterator();
        while (it.hasNext()) {
            Z z2 = (Z) it.next();
            long j2 = this.f2521b;
            if (j2 >= 0) {
                z2.c(j2);
            }
            BaseInterpolator baseInterpolator = this.f2522c;
            if (baseInterpolator != null && (view = (View) z2.f371a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.d != null) {
                z2.d(this.f2524f);
            }
            View view2 = (View) z2.f371a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2523e = true;
    }
}
