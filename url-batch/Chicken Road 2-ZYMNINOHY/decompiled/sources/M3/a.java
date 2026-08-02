package M3;

import T3.k;
import T3.v;
import T3.x;
import java.io.IOException;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public final k f1761a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f1763c;

    public a(g gVar) {
        this.f1763c = gVar;
        this.f1761a = new k(gVar.f1779c.d());
    }

    public final void a() {
        g gVar = this.f1763c;
        int i4 = gVar.f1781e;
        if (i4 == 6) {
            return;
        }
        if (i4 != 5) {
            throw new IllegalStateException(i.h(Integer.valueOf(gVar.f1781e), "state: "));
        }
        k kVar = this.f1761a;
        x xVar = kVar.f2980e;
        kVar.f2980e = x.f3010d;
        xVar.a();
        xVar.b();
        gVar.f1781e = 6;
    }

    @Override // T3.v
    public final x d() {
        return this.f1761a;
    }

    @Override // T3.v
    public long j(T3.g sink, long j4) {
        g gVar = this.f1763c;
        i.e(sink, "sink");
        try {
            return gVar.f1779c.j(sink, j4);
        } catch (IOException e4) {
            gVar.f1778b.k();
            a();
            throw e4;
        }
    }
}
