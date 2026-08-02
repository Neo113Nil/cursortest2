package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwd {
    public static boolean a(Context context) {
        Set n = ((jpz) imr.a(context, jpz.class)).n();
        hjb hjbVar = (hjb) n;
        iwi.a(hjbVar.e <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (n.isEmpty()) {
            return true;
        }
        return ((Boolean) hjbVar.iterator().next()).booleanValue();
    }
}
