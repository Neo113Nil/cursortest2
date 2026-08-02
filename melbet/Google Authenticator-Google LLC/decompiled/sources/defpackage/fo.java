package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fo {
    yv b;
    public boolean c;
    private Interpolator e;
    private long d = -1;
    private final yw f = new fn(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((brn) arrayList.get(i)).M();
            }
            this.c = false;
        }
    }

    public final void b() {
        View view;
        if (this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            brn brnVar = (brn) arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                brnVar.O(j);
            }
            Interpolator interpolator = this.e;
            if (interpolator != null && (view = (View) ((WeakReference) brnVar.a).get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.b != null) {
                brnVar.P(this.f);
            }
            View view2 = (View) ((WeakReference) brnVar.a).get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.c = true;
    }

    public final void c() {
        if (this.c) {
            return;
        }
        this.d = 250L;
    }

    public final void d(Interpolator interpolator) {
        if (this.c) {
            return;
        }
        this.e = interpolator;
    }

    public final void e(yv yvVar) {
        if (this.c) {
            return;
        }
        this.b = yvVar;
    }

    public final void f(brn brnVar) {
        if (this.c) {
            return;
        }
        this.a.add(brnVar);
    }
}
