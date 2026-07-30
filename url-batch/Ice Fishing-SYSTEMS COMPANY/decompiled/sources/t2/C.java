package t2;

import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC2666Ma;
import com.google.android.gms.internal.ads.AbstractC3298hB;
import com.google.android.gms.internal.ads.InterfaceC3352iB;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class C extends u2.i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f40822b = 0;

    public static void k(String str) {
        if (!m()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        com.bumptech.glide.manager.o oVar = u2.i.f41243a;
        Iterator g9 = ((InterfaceC3352iB) oVar.f23625w).g(oVar, str);
        boolean z8 = true;
        while (true) {
            AbstractC3298hB abstractC3298hB = (AbstractC3298hB) g9;
            if (!abstractC3298hB.hasNext()) {
                return;
            }
            String str2 = (String) abstractC3298hB.next();
            if (z8) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z8 = false;
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        return u2.i.j(2) && ((Boolean) AbstractC2666Ma.f26351a.r()).booleanValue();
    }
}
