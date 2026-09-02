package d5;

import N.p;
import Q4.n;
import a5.C0232b;
import c4.u;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: d5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335e implements u {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f3966d = Logger.getLogger(C0335e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final n f3967a = new n(f3966d);

    /* renamed from: b, reason: collision with root package name */
    public final C0232b f3968b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3969c;

    public C0335e(C0232b c0232b, ArrayList arrayList) {
        this.f3968b = c0232b;
        this.f3969c = arrayList;
    }

    @Override // c4.u
    public final void a() {
        this.f3967a.a(Level.FINE, p.b(new StringBuilder("Measurement recorded for instrument "), this.f3968b.f3148b, " outside callback registered to instrument. Dropping measurement."), null);
    }
}
