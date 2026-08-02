package com.google.apps.tiktok.media;

import android.content.Context;
import defpackage.azj;
import defpackage.bac;
import defpackage.bkr;
import defpackage.bku;
import defpackage.gnm;
import defpackage.hnu;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TikTokAppGlideModule extends bkr {
    @Override // defpackage.bku, defpackage.bkw
    public final void c(Context context, azj azjVar, bac bacVar) {
        Iterator it = ((gnm) hnu.bp(context, gnm.class)).o().iterator();
        while (it.hasNext()) {
            ((bku) it.next()).c(context, azjVar, bacVar);
        }
    }
}
