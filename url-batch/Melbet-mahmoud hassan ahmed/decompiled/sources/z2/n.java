package z2;

import a3.g2;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class n extends a3.b0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f23656c;

    /* synthetic */ n(o oVar, m mVar) {
        this.f23656c = oVar;
    }

    @Override // a3.b0
    public final void a() {
        Bitmap a7 = y2.t.v().a(Integer.valueOf(this.f23656c.f23659g.f2423t.f23418k));
        if (a7 != null) {
            a3.f r7 = y2.t.r();
            o oVar = this.f23656c;
            Activity activity = oVar.f23658f;
            y2.j jVar = oVar.f23659g.f2423t;
            final Drawable c7 = r7.c(activity, a7, jVar.f23416i, jVar.f23417j);
            g2.f72i.post(new Runnable() { // from class: z2.l
                @Override // java.lang.Runnable
                public final void run() {
                    n nVar = n.this;
                    nVar.f23656c.f23658f.getWindow().setBackgroundDrawable(c7);
                }
            });
        }
    }
}
