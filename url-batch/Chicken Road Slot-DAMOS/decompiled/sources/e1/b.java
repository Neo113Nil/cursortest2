package e1;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import c2.g0;
import d2.v;
import i1.t;
import j2.o;
import s.h0;
import s.x;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends i implements i1.f {

    /* renamed from: d, reason: collision with root package name */
    public final d9.c f3771d;

    /* renamed from: e, reason: collision with root package name */
    public final o f3772e;

    /* renamed from: i, reason: collision with root package name */
    public final v f3773i;

    /* renamed from: r, reason: collision with root package name */
    public final k2.b f3774r;

    /* renamed from: s, reason: collision with root package name */
    public final String f3775s;

    /* renamed from: t, reason: collision with root package name */
    public final AutofillId f3776t;

    /* renamed from: u, reason: collision with root package name */
    public final x f3777u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3778v;

    public b(d9.c cVar, o oVar, v vVar, k2.b bVar, String str) {
        this.f3771d = cVar;
        this.f3772e = oVar;
        this.f3773i = vVar;
        this.f3774r = bVar;
        this.f3775s = str;
        new Rect();
        vVar.setImportantForAutofill(1);
        f2.a s3 = w.s(vVar);
        AutofillId g = s3 != null ? f1.b.g(s3.f4064d) : null;
        if (g == null) {
            throw v4.a.h("Required value was null.");
        }
        this.f3776t = g;
        this.f3777u = new x();
    }

    @Override // i1.f
    public final void b(t tVar, t tVar2) {
        g0 u2;
        j2.j u10;
        g0 u11;
        j2.j u12;
        if (tVar != null && (u11 = c2.k.u(tVar)) != null && (u12 = u11.u()) != null) {
            h0 h0Var = u12.f4975d;
            if (h0Var.b(j2.i.f4956f) || h0Var.b(j2.i.g)) {
                ((AutofillManager) this.f3771d.f3701e).notifyViewExited(this.f3773i, u11.f1550e);
            }
        }
        if (tVar2 == null || (u2 = c2.k.u(tVar2)) == null || (u10 = u2.u()) == null) {
            return;
        }
        h0 h0Var2 = u10.f4975d;
        if (h0Var2.b(j2.i.f4956f) || h0Var2.b(j2.i.g)) {
            int i3 = u2.f1550e;
            this.f3774r.f5362b.j(i3, new a(this, i3));
        }
    }
}
