package androidx.lifecycle;

import android.app.Activity;

/* loaded from: classes.dex */
public abstract class o {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, d dVar) {
        j a2;
        P0.h.e(dVar, "event");
        if (!(activity instanceof i) || (a2 = ((i) activity).a()) == null) {
            return;
        }
        a2.a(dVar);
    }
}
