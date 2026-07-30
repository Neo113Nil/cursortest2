package c7;

import java.util.logging.Level;
import java.util.logging.Logger;
import l6.C4694a;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public class q extends a implements i6.l {

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f5737w = Logger.getLogger(q.class.getName());

    /* renamed from: u, reason: collision with root package name */
    public final W6.l f5738u;

    /* renamed from: v, reason: collision with root package name */
    public final s f5739v;

    public q(g7.b bVar, s sVar) {
        super(bVar);
        this.f5738u = new W6.l(f5737w);
        this.f5739v = sVar;
    }

    @Override // i6.l
    public final void e(long j9, b6.c cVar) {
        C4694a a9 = C4694a.a();
        if (j9 >= 0) {
            this.f5739v.b(j9, cVar, a9);
            return;
        }
        this.f5738u.a(Level.WARNING, AbstractC5051n.g(new StringBuilder("Counters can only increase. Instrument "), this.f5714n.f37940b, " has recorded a negative value."), null);
    }
}
