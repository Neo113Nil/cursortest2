package o1;

import java.io.IOException;
import m1.m;
import m1.p;
import v1.k;
import v1.q;
import v1.w;
import v1.y;

/* loaded from: classes.dex */
public abstract class a implements w {

    /* renamed from: a, reason: collision with root package name */
    public final k f3723a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3725c;

    public a(p pVar) {
        this.f3725c = pVar;
        this.f3723a = new k(((q) pVar.f3609d).f4505a.a());
    }

    @Override // v1.w
    public final y a() {
        return this.f3723a;
    }

    @Override // v1.w
    public long c(v1.f fVar, long j2) {
        p pVar = this.f3725c;
        X0.f.e(fVar, "sink");
        try {
            return ((q) pVar.f3609d).c(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f3608c).k();
            g();
            throw e2;
        }
    }

    public final void g() {
        p pVar = this.f3725c;
        int i = pVar.f3606a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f3606a);
        }
        k kVar = this.f3723a;
        y yVar = kVar.f4489e;
        kVar.f4489e = y.f4521d;
        yVar.a();
        yVar.b();
        pVar.f3606a = 6;
    }
}
