package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class xc0 {
    public Interpolator c;
    public yc0 d;
    public boolean e;
    public long b = -1;
    public final r90 f = new r90(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((wc0) obj).b();
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
            wc0 wc0Var = (wc0) obj;
            long j = this.b;
            if (j >= 0) {
                wc0Var.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) wc0Var.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                wc0Var.d(this.f);
            }
            View view2 = (View) wc0Var.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
