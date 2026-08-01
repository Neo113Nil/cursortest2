package j;

import K.C0009e0;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f2866c;

    /* renamed from: d, reason: collision with root package name */
    public q1.d f2867d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2868e;

    /* renamed from: b, reason: collision with root package name */
    public long f2865b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final j f2869f = new j(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2864a = new ArrayList();

    public final void a() {
        if (this.f2868e) {
            Iterator it = this.f2864a.iterator();
            while (it.hasNext()) {
                ((C0009e0) it.next()).b();
            }
            this.f2868e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2868e) {
            return;
        }
        Iterator it = this.f2864a.iterator();
        while (it.hasNext()) {
            C0009e0 c0009e0 = (C0009e0) it.next();
            long j2 = this.f2865b;
            if (j2 >= 0) {
                c0009e0.c(j2);
            }
            BaseInterpolator baseInterpolator = this.f2866c;
            if (baseInterpolator != null && (view = (View) c0009e0.f438a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f2867d != null) {
                c0009e0.d(this.f2869f);
            }
            View view2 = (View) c0009e0.f438a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2868e = true;
    }
}
