package j;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import n0.p0;
import n0.q0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f1883c;
    public q0 d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1884e;

    /* renamed from: b, reason: collision with root package name */
    public long f1882b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f1885f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1881a = new ArrayList();

    public final void a() {
        if (this.f1884e) {
            ArrayList arrayList = this.f1881a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((p0) obj).b();
            }
            this.f1884e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f1884e) {
            return;
        }
        ArrayList arrayList = this.f1881a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            p0 p0Var = (p0) obj;
            long j4 = this.f1882b;
            if (j4 >= 0) {
                p0Var.c(j4);
            }
            Interpolator interpolator = this.f1883c;
            if (interpolator != null && (view = (View) p0Var.f2772a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                p0Var.d(this.f1885f);
            }
            View view2 = (View) p0Var.f2772a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f1884e = true;
    }
}
