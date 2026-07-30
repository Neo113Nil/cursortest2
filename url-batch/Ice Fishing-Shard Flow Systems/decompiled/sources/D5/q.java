package D5;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class q extends a implements J4.j {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f378d = Logger.getLogger(q.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final x5.n f379b;

    /* renamed from: c, reason: collision with root package name */
    public final t f380c;

    public q(H5.b bVar, t tVar) {
        super(bVar);
        this.f379b = new x5.n(f378d);
        this.f380c = tVar;
    }

    @Override // J4.j
    public final void g(double d7, C4.f fVar) {
        M4.a a7 = M4.a.a();
        if (d7 >= 0.0d) {
            this.f380c.a(d7, fVar, a7);
            return;
        }
        this.f379b.a(Level.WARNING, r4.f.f(new StringBuilder("Histograms can only record non-negative values. Instrument "), this.f357a.f999b, " has recorded a negative value."), null);
    }
}
