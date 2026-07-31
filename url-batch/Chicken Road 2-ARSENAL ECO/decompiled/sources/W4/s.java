package W4;

import a5.C0232b;
import f4.C0374a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class s extends a implements c4.l {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f2827i = Logger.getLogger(s.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public final Q4.n f2828g;

    /* renamed from: h, reason: collision with root package name */
    public final u f2829h;

    public s(C0232b c0232b, u uVar) {
        super(c0232b);
        this.f2828g = new Q4.n(f2827i);
        this.f2829h = uVar;
    }

    @Override // c4.l
    public final void d(long j4, V3.c cVar) {
        C0374a a7 = C0374a.a();
        if (j4 >= 0) {
            this.f2829h.b(j4, cVar, a7);
            return;
        }
        this.f2828g.a(Level.WARNING, N.p.b(new StringBuilder("Counters can only increase. Instrument "), this.f2802f.f3148b, " has recorded a negative value."), null);
    }
}
