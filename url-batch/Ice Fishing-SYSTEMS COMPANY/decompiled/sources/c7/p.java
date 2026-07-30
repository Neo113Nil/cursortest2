package c7;

import java.util.logging.Level;
import java.util.logging.Logger;
import l6.C4694a;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public class p extends a implements i6.j {

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f5734w = Logger.getLogger(p.class.getName());

    /* renamed from: u, reason: collision with root package name */
    public final W6.l f5735u;

    /* renamed from: v, reason: collision with root package name */
    public final s f5736v;

    public p(g7.b bVar, s sVar) {
        super(bVar);
        this.f5735u = new W6.l(f5734w);
        this.f5736v = sVar;
    }

    @Override // i6.j
    public final void f(double d2, b6.c cVar) {
        C4694a a9 = C4694a.a();
        if (d2 >= 0.0d) {
            this.f5736v.a(d2, cVar, a9);
            return;
        }
        this.f5735u.a(Level.WARNING, AbstractC5051n.g(new StringBuilder("Histograms can only record non-negative values. Instrument "), this.f5714n.f37940b, " has recorded a negative value."), null);
    }
}
