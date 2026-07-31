package a3;

import android.content.Context;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.ho0;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.zo0;

/* loaded from: classes.dex */
public final class q1 {
    public static void a(Context context) {
        if (ho0.k(context) && !ho0.m()) {
            cc3<?> b7 = new c1(context).b();
            io0.f("Updating ad debug logging enablement.");
            zo0.a(b7, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
