package j;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import n0.t0;
import n0.u0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f2126c;
    public u0 d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2127e;

    /* renamed from: b, reason: collision with root package name */
    public long f2125b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f2128f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2124a = new ArrayList();

    public final void a() {
        if (this.f2127e) {
            ArrayList arrayList = this.f2124a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((t0) obj).b();
            }
            this.f2127e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2127e) {
            return;
        }
        ArrayList arrayList = this.f2124a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            t0 t0Var = (t0) obj;
            long j2 = this.f2125b;
            if (j2 >= 0) {
                t0Var.c(j2);
            }
            Interpolator interpolator = this.f2126c;
            if (interpolator != null && (view = (View) t0Var.f2835a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                t0Var.d(this.f2128f);
            }
            View view2 = (View) t0Var.f2835a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2127e = true;
    }
}
