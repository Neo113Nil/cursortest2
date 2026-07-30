package androidx.lifecycle;

import android.app.Activity;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class p {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, d dVar) {
        j a2;
        dVar.getClass();
        if (!(activity instanceof i) || (a2 = ((i) activity).a()) == null) {
            return;
        }
        a2.a(dVar);
    }
}
