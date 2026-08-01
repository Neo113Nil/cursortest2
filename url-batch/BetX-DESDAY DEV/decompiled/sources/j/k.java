package j;

import K.C0009e0;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f2870c;

    /* renamed from: d, reason: collision with root package name */
    public q1.d f2871d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2872e;

    /* renamed from: b, reason: collision with root package name */
    public long f2869b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final j f2873f = new j(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2868a = new ArrayList();

    public final void a() {
        if (this.f2872e) {
            Iterator it = this.f2868a.iterator();
            while (it.hasNext()) {
                ((C0009e0) it.next()).b();
            }
            this.f2872e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2872e) {
            return;
        }
        Iterator it = this.f2868a.iterator();
        while (it.hasNext()) {
            C0009e0 c0009e0 = (C0009e0) it.next();
            long j2 = this.f2869b;
            if (j2 >= 0) {
                c0009e0.c(j2);
            }
            BaseInterpolator baseInterpolator = this.f2870c;
            if (baseInterpolator != null && (view = (View) c0009e0.f439a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f2871d != null) {
                c0009e0.d(this.f2873f);
            }
            View view2 = (View) c0009e0.f439a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2872e = true;
    }
}
