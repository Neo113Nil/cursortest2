package k;

import L.C0005c0;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f2728c;
    public A1.m d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2729e;

    /* renamed from: b, reason: collision with root package name */
    public long f2727b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f2730f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2726a = new ArrayList();

    public final void a() {
        if (this.f2729e) {
            Iterator it = this.f2726a.iterator();
            while (it.hasNext()) {
                ((C0005c0) it.next()).b();
            }
            this.f2729e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2729e) {
            return;
        }
        Iterator it = this.f2726a.iterator();
        while (it.hasNext()) {
            C0005c0 c0005c0 = (C0005c0) it.next();
            long j2 = this.f2727b;
            if (j2 >= 0) {
                c0005c0.c(j2);
            }
            BaseInterpolator baseInterpolator = this.f2728c;
            if (baseInterpolator != null && (view = (View) c0005c0.f510a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.d != null) {
                c0005c0.d(this.f2730f);
            }
            View view2 = (View) c0005c0.f510a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2729e = true;
    }
}
