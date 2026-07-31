package e5;

import Q4.n;
import a5.C0232b;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: e5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348c implements W4.b, Y4.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0348c f4012a = new C0348c();

    /* renamed from: b, reason: collision with root package name */
    public static final n f4013b = new n(Logger.getLogger(C0348c.class.getName()));

    @Override // Y4.b
    public final boolean a(C0232b c0232b) {
        Y4.b bVar;
        switch (c0232b.f3151e.ordinal()) {
            case 0:
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
            case 3:
            case 4:
                bVar = C0353h.f4019a;
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                bVar = C0350e.f4015b;
                break;
            case 5:
            case 6:
                bVar = C0351f.f4017a;
                break;
            default:
                f4013b.a(Level.WARNING, "Unable to find default aggregation for instrument: " + c0232b, null);
                bVar = C0349d.f4014a;
                break;
        }
        return bVar.a(c0232b);
    }

    public final String toString() {
        return "DefaultAggregation";
    }
}
