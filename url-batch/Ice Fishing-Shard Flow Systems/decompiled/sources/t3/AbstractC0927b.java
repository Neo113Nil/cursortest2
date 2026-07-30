package t3;

import java.util.List;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0927b {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object listNotificationsForOutstanding$default(d dVar, List list, V5.b bVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listNotificationsForOutstanding");
        }
        if ((i2 & 1) != 0) {
            list = null;
        }
        return dVar.listNotificationsForOutstanding(list, bVar);
    }

    public static /* synthetic */ Object markAsConsumed$default(d dVar, int i2, boolean z7, String str, boolean z8, V5.b bVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAsConsumed");
        }
        if ((i5 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i5 & 8) != 0) {
            z8 = true;
        }
        return dVar.markAsConsumed(i2, z7, str2, z8, bVar);
    }
}
