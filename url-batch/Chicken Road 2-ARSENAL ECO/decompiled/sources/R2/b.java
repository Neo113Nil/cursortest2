package R2;

import java.util.List;
import o5.InterfaceC0564d;

/* loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object listNotificationsForOutstanding$default(d dVar, List list, InterfaceC0564d interfaceC0564d, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listNotificationsForOutstanding");
        }
        if ((i7 & 1) != 0) {
            list = null;
        }
        return dVar.listNotificationsForOutstanding(list, interfaceC0564d);
    }

    public static /* synthetic */ Object markAsConsumed$default(d dVar, int i7, boolean z5, String str, boolean z6, InterfaceC0564d interfaceC0564d, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAsConsumed");
        }
        if ((i8 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i8 & 8) != 0) {
            z6 = true;
        }
        return dVar.markAsConsumed(i7, z5, str2, z6, interfaceC0564d);
    }
}
