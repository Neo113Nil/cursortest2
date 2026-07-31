package com.iab.omid.library.startio.internal;

import android.view.View;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class b extends d {
    private static b d = new b();

    private b() {
    }

    public static b g() {
        return d;
    }

    @Override // com.iab.omid.library.startio.internal.d
    public void b(boolean z) {
        Iterator it = c.c().b().iterator();
        while (it.hasNext()) {
            ((com.iab.omid.library.startio.adsession.a) it.next()).d().a(z);
        }
    }

    @Override // com.iab.omid.library.startio.internal.d
    public boolean d() {
        Iterator it = c.c().a().iterator();
        while (it.hasNext()) {
            View e = ((com.iab.omid.library.startio.adsession.a) it.next()).e();
            if (e != null && e.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
