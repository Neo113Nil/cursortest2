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
    public final k f3727a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3729c;

    public a(p pVar) {
        this.f3729c = pVar;
        this.f3727a = new k(((q) pVar.f3613d).f4509a.a());
    }

    @Override // v1.w
    public final y a() {
        return this.f3727a;
    }

    @Override // v1.w
    public long c(v1.f fVar, long j2) {
        p pVar = this.f3729c;
        X0.f.e(fVar, "sink");
        try {
            return ((q) pVar.f3613d).c(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f3612c).k();
            g();
            throw e2;
        }
    }

    public final void g() {
        p pVar = this.f3729c;
        int i = pVar.f3610a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f3610a);
        }
        k kVar = this.f3727a;
        y yVar = kVar.f4493e;
        kVar.f4493e = y.f4525d;
        yVar.a();
        yVar.b();
        pVar.f3610a = 6;
    }
}
