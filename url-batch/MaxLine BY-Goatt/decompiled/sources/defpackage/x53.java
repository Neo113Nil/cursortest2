package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x53 {
    public Interpolator c;
    public y53 d;
    public boolean e;
    public long b = -1;
    public final jy2 f = new jy2(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((w53) obj).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w53 w53Var = (w53) obj;
            long j = this.b;
            if (j >= 0) {
                w53Var.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) w53Var.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                w53Var.d(this.f);
            }
            View view2 = (View) w53Var.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
