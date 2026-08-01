package i;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import k0.l0;
import k0.m0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j {
    public Interpolator c;

    /* renamed from: d, reason: collision with root package name */
    public m0 f2077d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2078e;

    /* renamed from: b, reason: collision with root package name */
    public long f2076b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f2079f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2075a = new ArrayList();

    public final void a() {
        if (this.f2078e) {
            ArrayList arrayList = this.f2075a;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((l0) obj).b();
            }
            this.f2078e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2078e) {
            return;
        }
        ArrayList arrayList = this.f2075a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            l0 l0Var = (l0) obj;
            long j4 = this.f2076b;
            if (j4 >= 0) {
                l0Var.c(j4);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) l0Var.f2758a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f2077d != null) {
                l0Var.d(this.f2079f);
            }
            View view2 = (View) l0Var.f2758a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2078e = true;
    }
}
