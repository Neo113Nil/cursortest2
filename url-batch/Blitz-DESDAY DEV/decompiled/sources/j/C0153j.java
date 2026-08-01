package j;

import M.Y;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f2675c;
    public z1.l d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2676e;

    /* renamed from: b, reason: collision with root package name */
    public long f2674b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final C0152i f2677f = new C0152i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2673a = new ArrayList();

    public final void a() {
        if (this.f2676e) {
            Iterator it = this.f2673a.iterator();
            while (it.hasNext()) {
                ((Y) it.next()).b();
            }
            this.f2676e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2676e) {
            return;
        }
        Iterator it = this.f2673a.iterator();
        while (it.hasNext()) {
            Y y2 = (Y) it.next();
            long j2 = this.f2674b;
            if (j2 >= 0) {
                y2.c(j2);
            }
            BaseInterpolator baseInterpolator = this.f2675c;
            if (baseInterpolator != null && (view = (View) y2.f522a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.d != null) {
                y2.d(this.f2677f);
            }
            View view2 = (View) y2.f522a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2676e = true;
    }
}
