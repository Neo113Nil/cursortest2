package K5;

import J4.u;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import r4.f;
import x5.n;

/* loaded from: classes.dex */
public final class e implements u {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f1470d = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final n f1471a = new n(f1470d);

    /* renamed from: b, reason: collision with root package name */
    public final H5.b f1472b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1473c;

    public e(H5.b bVar, ArrayList arrayList) {
        this.f1472b = bVar;
        this.f1473c = arrayList;
    }

    @Override // J4.u
    public final void a() {
        this.f1471a.a(Level.FINE, f.f(new StringBuilder("Measurement recorded for instrument "), this.f1472b.f999b, " outside callback registered to instrument. Dropping measurement."), null);
    }
}
