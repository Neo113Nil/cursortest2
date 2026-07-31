package W4;

import a5.C0232b;
import f4.C0374a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class r extends a implements c4.j {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f2824i = Logger.getLogger(r.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public final Q4.n f2825g;

    /* renamed from: h, reason: collision with root package name */
    public final u f2826h;

    public r(C0232b c0232b, u uVar) {
        super(c0232b);
        this.f2825g = new Q4.n(f2824i);
        this.f2826h = uVar;
    }

    @Override // c4.j
    public final void g(double d7, V3.c cVar) {
        C0374a a7 = C0374a.a();
        if (d7 >= 0.0d) {
            this.f2826h.a(d7, cVar, a7);
            return;
        }
        this.f2825g.a(Level.WARNING, N.p.b(new StringBuilder("Histograms can only record non-negative values. Instrument "), this.f2802f.f3148b, " has recorded a negative value."), null);
    }
}
