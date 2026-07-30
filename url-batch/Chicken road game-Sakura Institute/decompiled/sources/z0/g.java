package z0;

import android.os.Build;
import com.android.installreferrer.R;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements c0 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f9991d = true;

    /* renamed from: a, reason: collision with root package name */
    public final s1.r f9992a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9993b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public d1.b f9994c;

    public g(s1.r rVar) {
        this.f9992a = rVar;
    }

    @Override // z0.c0
    public final void a(c1.c cVar) {
        synchronized (this.f9993b) {
            if (!cVar.f1545r) {
                cVar.f1545r = true;
                cVar.b();
            }
        }
    }

    @Override // z0.c0
    public final c1.c b() {
        c1.e jVar;
        c1.c cVar;
        synchronized (this.f9993b) {
            try {
                s1.r rVar = this.f9992a;
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 29) {
                    f.a(rVar);
                }
                if (i7 >= 29) {
                    jVar = new c1.h();
                } else if (f9991d) {
                    try {
                        jVar = new c1.f(this.f9992a, new s(), new b1.c());
                    } catch (Throwable unused) {
                        f9991d = false;
                        jVar = new c1.j(c(this.f9992a));
                    }
                } else {
                    jVar = new c1.j(c(this.f9992a));
                }
                cVar = new c1.c(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public final d1.a c(s1.r rVar) {
        d1.b bVar = this.f9994c;
        if (bVar != null) {
            return bVar;
        }
        d1.b bVar2 = new d1.b(rVar.getContext());
        bVar2.setClipChildren(false);
        bVar2.setClipToPadding(false);
        bVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        rVar.addView(bVar2, -1);
        this.f9994c = bVar2;
        return bVar2;
    }
}
