package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class qo implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ro f10773f;

    qo(ro roVar) {
        this.f10773f = roVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z6;
        boolean z7;
        List list;
        obj = this.f10773f.f11286h;
        synchronized (obj) {
            z6 = this.f10773f.f11287i;
            if (z6) {
                z7 = this.f10773f.f11288j;
                if (z7) {
                    this.f10773f.f11287i = false;
                    io0.b("App went background");
                    list = this.f10773f.f11289k;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((so) it.next()).c(false);
                        } catch (Exception e7) {
                            io0.e("", e7);
                        }
                    }
                }
            }
            io0.b("App is still foreground");
        }
    }
}
