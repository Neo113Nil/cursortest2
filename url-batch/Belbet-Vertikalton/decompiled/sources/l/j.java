package l;

import M.W;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f3243c;

    /* renamed from: d, reason: collision with root package name */
    public H1.d f3244d;
    public boolean e;

    /* renamed from: b, reason: collision with root package name */
    public long f3242b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f3245f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3241a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.f3241a.iterator();
            while (it.hasNext()) {
                ((W) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator it = this.f3241a.iterator();
        while (it.hasNext()) {
            W w2 = (W) it.next();
            long j = this.f3242b;
            if (j >= 0) {
                w2.c(j);
            }
            BaseInterpolator baseInterpolator = this.f3243c;
            if (baseInterpolator != null && (view = (View) w2.f718a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f3244d != null) {
                w2.d(this.f3245f);
            }
            View view2 = (View) w2.f718a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
