package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: classes.dex */
class b implements d {
    b() {
    }

    private e p(c cVar) {
        return (e) cVar.d();
    }

    @Override // p.d
    public void a(c cVar, ColorStateList colorStateList) {
        p(cVar).f(colorStateList);
    }

    @Override // p.d
    public ColorStateList b(c cVar) {
        return p(cVar).b();
    }

    @Override // p.d
    public float c(c cVar) {
        return j(cVar) * 2.0f;
    }

    @Override // p.d
    public void d(c cVar) {
        if (!cVar.c()) {
            cVar.f(0, 0, 0, 0);
            return;
        }
        float f4 = f(cVar);
        float j4 = j(cVar);
        int ceil = (int) Math.ceil(f.a(f4, j4, cVar.b()));
        int ceil2 = (int) Math.ceil(f.b(f4, j4, cVar.b()));
        cVar.f(ceil, ceil2, ceil, ceil2);
    }

    @Override // p.d
    public float e(c cVar) {
        return cVar.e().getElevation();
    }

    @Override // p.d
    public float f(c cVar) {
        return p(cVar).c();
    }

    @Override // p.d
    public void g(c cVar, float f4) {
        cVar.e().setElevation(f4);
    }

    @Override // p.d
    public void h(c cVar) {
        n(cVar, f(cVar));
    }

    @Override // p.d
    public void i(c cVar, Context context, ColorStateList colorStateList, float f4, float f5, float f6) {
        cVar.a(new e(colorStateList, f4));
        View e4 = cVar.e();
        e4.setClipToOutline(true);
        e4.setElevation(f5);
        n(cVar, f6);
    }

    @Override // p.d
    public float j(c cVar) {
        return p(cVar).d();
    }

    @Override // p.d
    public void k(c cVar) {
        n(cVar, f(cVar));
    }

    @Override // p.d
    public float m(c cVar) {
        return j(cVar) * 2.0f;
    }

    @Override // p.d
    public void n(c cVar, float f4) {
        p(cVar).g(f4, cVar.c(), cVar.b());
        d(cVar);
    }

    @Override // p.d
    public void o(c cVar, float f4) {
        p(cVar).h(f4);
    }

    @Override // p.d
    public void l() {
    }
}
