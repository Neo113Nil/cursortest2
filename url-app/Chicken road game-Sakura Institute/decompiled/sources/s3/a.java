package s3;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import q3.i;
import q3.l;
import z3.C1448f;
import z3.F;
import z3.H;
import z3.n;
import z3.z;

/* loaded from: classes.dex */
public abstract class a implements F {

    /* renamed from: d, reason: collision with root package name */
    public final n f10593d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10594e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f10595i;

    public a(l lVar) {
        this.f10595i = lVar;
        this.f10593d = new n(((z) lVar.f9429d).f12044d.c());
    }

    public final void a() {
        l lVar = this.f10595i;
        int i2 = lVar.f9426a;
        if (i2 == 6) {
            return;
        }
        if (i2 == 5) {
            l.i(lVar, this.f10593d);
            lVar.f9426a = 6;
        } else {
            throw new IllegalStateException("state: " + lVar.f9426a);
        }
    }

    @Override // z3.F
    public final H c() {
        return this.f10593d;
    }

    @Override // z3.F
    public long l(C1448f sink, long j4) {
        l lVar = this.f10595i;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            return ((z) lVar.f9429d).l(sink, j4);
        } catch (IOException e4) {
            ((i) lVar.f9428c).k();
            a();
            throw e4;
        }
    }
}
