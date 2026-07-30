package D5;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class r extends a implements J4.l {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f381d = Logger.getLogger(r.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final x5.n f382b;

    /* renamed from: c, reason: collision with root package name */
    public final t f383c;

    public r(H5.b bVar, t tVar) {
        super(bVar);
        this.f382b = new x5.n(f381d);
        this.f383c = tVar;
    }

    @Override // J4.l
    public final void a(long j, C4.f fVar) {
        M4.a a7 = M4.a.a();
        if (j >= 0) {
            this.f383c.b(j, fVar, a7);
            return;
        }
        this.f382b.a(Level.WARNING, r4.f.f(new StringBuilder("Counters can only increase. Instrument "), this.f357a.f999b, " has recorded a negative value."), null);
    }
}
