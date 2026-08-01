package j;

import K.C0001a0;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f2599c;
    public q1.l d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2600e;

    /* renamed from: b, reason: collision with root package name */
    public long f2598b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f2601f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2597a = new ArrayList();

    public final void a() {
        if (this.f2600e) {
            Iterator it = this.f2597a.iterator();
            while (it.hasNext()) {
                ((C0001a0) it.next()).b();
            }
            this.f2600e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2600e) {
            return;
        }
        Iterator it = this.f2597a.iterator();
        while (it.hasNext()) {
            C0001a0 c0001a0 = (C0001a0) it.next();
            long j2 = this.f2598b;
            if (j2 >= 0) {
                c0001a0.c(j2);
            }
            BaseInterpolator baseInterpolator = this.f2599c;
            if (baseInterpolator != null && (view = (View) c0001a0.f391a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.d != null) {
                c0001a0.d(this.f2601f);
            }
            View view2 = (View) c0001a0.f391a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2600e = true;
    }
}
