package com.google.android.gms.ads.internal.util;

import a3.w0;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.work.a;
import androidx.work.b;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.io0;
import d0.b;
import d0.k;
import d0.l;
import d0.t;
import x3.b;

/* loaded from: classes.dex */
public class WorkManagerUtil extends w0 {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void s6(Context context) {
        try {
            t.e(context.getApplicationContext(), new a.b().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // a3.x0
    public final void zze(@RecentlyNonNull x3.a aVar) {
        Context context = (Context) b.O0(aVar);
        s6(context);
        try {
            t d7 = t.d(context);
            d7.a("offline_ping_sender_work");
            d7.b(new l.a(OfflinePingSender.class).e(new b.a().b(k.CONNECTED).a()).a("offline_ping_sender_work").b());
        } catch (IllegalStateException e7) {
            io0.h("Failed to instantiate WorkManager.", e7);
        }
    }

    @Override // a3.x0
    public final boolean zzf(@RecentlyNonNull x3.a aVar, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        Context context = (Context) x3.b.O0(aVar);
        s6(context);
        d0.b a7 = new b.a().b(k.CONNECTED).a();
        try {
            t.d(context).b(new l.a(OfflineNotificationPoster.class).e(a7).f(new b.a().e("uri", str).e("gws_query_id", str2).a()).a("offline_notification_work").b());
            return true;
        } catch (IllegalStateException e7) {
            io0.h("Failed to instantiate WorkManager.", e7);
            return false;
        }
    }
}
