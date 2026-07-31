package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class wc0 {

    /* renamed from: b, reason: collision with root package name */
    private static wc0 f13790b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f13791a = new AtomicBoolean(false);

    wc0() {
    }

    public static wc0 a() {
        if (f13790b == null) {
            f13790b = new wc0();
        }
        return f13790b;
    }

    public final Thread b(final Context context, final String str) {
        if (!this.f13791a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.uc0
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                String str2 = str;
                m10.c(context2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) sw.c().b(m10.f8169c0)).booleanValue());
                if (((Boolean) sw.c().b(m10.f8225j0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((aw0) no0.b(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new lo0() { // from class: com.google.android.gms.internal.ads.tc0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.internal.ads.lo0
                        public final Object c(Object obj) {
                            return zv0.s6(obj);
                        }
                    })).X2(x3.b.B3(context2), new sc0(f4.a.k(context2, "FA-Ads", "am", str2, bundle)));
                } catch (RemoteException | mo0 | NullPointerException e7) {
                    io0.i("#007 Could not call remote method.", e7);
                }
            }
        });
        thread.start();
        return thread;
    }
}
