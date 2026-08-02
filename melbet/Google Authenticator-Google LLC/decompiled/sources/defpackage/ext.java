package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ext implements exv {
    @Override // defpackage.exv
    public final boolean b(bst bstVar) {
        Method method = fam.a;
        Object obj = bstVar.a;
        String str = "false";
        try {
            str = (String) fam.a.invoke(null, obj, "false");
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
        }
        return str.equals("true");
    }

    @Override // defpackage.exv
    public final void a() {
    }
}
