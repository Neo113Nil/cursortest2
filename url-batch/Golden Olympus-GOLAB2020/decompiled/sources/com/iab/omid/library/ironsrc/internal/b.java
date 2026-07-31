package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b extends d {

    /* renamed from: d, reason: collision with root package name */
    private static b f14535d = new b();

    private b() {
    }

    public static b g() {
        return f14535d;
    }

    @Override // com.iab.omid.library.ironsrc.internal.d
    public void b(boolean z4) {
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z4);
        }
    }

    @Override // com.iab.omid.library.ironsrc.internal.d
    public boolean d() {
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            View c4 = it.next().c();
            if (c4 != null && c4.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
