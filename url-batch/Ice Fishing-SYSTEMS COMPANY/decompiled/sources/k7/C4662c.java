package k7;

import W6.l;
import e7.InterfaceC4480b;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: k7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4662c implements c7.b, InterfaceC4480b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4662c f38818a = new C4662c();

    /* renamed from: b, reason: collision with root package name */
    public static final l f38819b = new l(Logger.getLogger(C4662c.class.getName()));

    @Override // e7.InterfaceC4480b
    public final boolean a(g7.b bVar) {
        InterfaceC4480b interfaceC4480b;
        switch (bVar.f37943e.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
                interfaceC4480b = C4667h.f38825a;
                break;
            case 2:
                interfaceC4480b = C4664e.f38821b;
                break;
            case 5:
            case 6:
                interfaceC4480b = C4665f.f38823a;
                break;
            default:
                f38819b.a(Level.WARNING, "Unable to find default aggregation for instrument: " + bVar, null);
                interfaceC4480b = C4663d.f38820a;
                break;
        }
        return interfaceC4480b.a(bVar);
    }

    public final String toString() {
        return "DefaultAggregation";
    }
}
