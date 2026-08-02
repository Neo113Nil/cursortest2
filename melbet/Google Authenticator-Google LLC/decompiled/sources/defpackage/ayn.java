package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayn {
    static {
        asq.b("ProcessUtils");
    }

    public static final boolean a(Context context, arv arvVar) {
        String processName;
        context.getClass();
        arvVar.getClass();
        processName = Application.getProcessName();
        processName.getClass();
        String str = arvVar.i;
        return (str == null || str.length() == 0) ? ksp.b(processName, context.getApplicationInfo().processName) : ksp.b(processName, str);
    }
}
