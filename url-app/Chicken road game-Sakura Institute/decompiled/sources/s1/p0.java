package s1;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p0 implements c7.x {

    /* renamed from: f, reason: collision with root package name */
    public final View f8340f;

    /* renamed from: g, reason: collision with root package name */
    public final g2.x f8341g;

    /* renamed from: h, reason: collision with root package name */
    public final c7.x f8342h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f8343i = new AtomicReference(null);

    public p0(View view, g2.x xVar, c7.x xVar2) {
        this.f8340f = view;
        this.f8341g = xVar;
        this.f8342h = xVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(y.u uVar, j6.c cVar) {
        o0 o0Var;
        int i7;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i8 = o0Var.f8335h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                o0Var.f8335h = i8 - Integer.MIN_VALUE;
                Object obj = o0Var.f8333f;
                i7 = o0Var.f8335h;
                if (i7 != 0) {
                    d6.a.e(obj);
                    q.t0 t0Var = new q.t0(uVar, 4, this);
                    a0.e0 e0Var = new a0.e0(this, (h6.d) null, 23);
                    o0Var.f8335h = 1;
                    if (c7.a0.d(new androidx.lifecycle.g0(t0Var, this.f8343i, e0Var, (h6.d) null), o0Var) == i6.a.f4956f) {
                        return;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                throw new b4.c();
            }
        }
        o0Var = new o0(this, cVar);
        Object obj2 = o0Var.f8333f;
        i7 = o0Var.f8335h;
        if (i7 != 0) {
        }
        throw new b4.c();
    }

    @Override // c7.x
    public final h6.i k() {
        return this.f8342h.k();
    }
}
