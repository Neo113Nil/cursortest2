package L5;

import java.util.logging.Level;
import java.util.logging.Logger;
import x5.n;

/* loaded from: classes.dex */
public final class c implements D5.b, F5.b {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1690a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final n f1691b = new n(Logger.getLogger(c.class.getName()));

    @Override // F5.b
    public final boolean a(H5.b bVar) {
        F5.b bVar2;
        switch (bVar.f1002e.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
                bVar2 = h.f1697a;
                break;
            case 2:
                bVar2 = e.f1693b;
                break;
            case 5:
            case 6:
                bVar2 = f.f1695a;
                break;
            default:
                f1691b.a(Level.WARNING, "Unable to find default aggregation for instrument: " + bVar, null);
                bVar2 = d.f1692a;
                break;
        }
        return bVar2.a(bVar);
    }

    public final String toString() {
        return "DefaultAggregation";
    }
}
