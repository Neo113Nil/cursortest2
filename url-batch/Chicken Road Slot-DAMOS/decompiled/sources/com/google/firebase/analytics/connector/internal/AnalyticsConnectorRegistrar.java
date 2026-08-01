package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import c7.c0;
import com.google.android.gms.internal.measurement.d7;
import com.google.firebase.components.ComponentRegistrar;
import d6.n;
import g8.g;
import i8.a;
import i8.b;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.i0;
import l8.c;
import l8.j;
import l8.l;
import u8.d;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static a lambda$getComponents$0(c cVar) {
        boolean z10;
        g gVar = (g) cVar.a(g.class);
        Context context = (Context) cVar.a(Context.class);
        t8.c cVar2 = (t8.c) cVar.a(t8.c.class);
        c0.g(gVar);
        c0.g(context);
        c0.g(cVar2);
        c0.g(context.getApplicationContext());
        if (b.f4670b == null) {
            synchronized (b.class) {
                if (b.f4670b == null) {
                    Bundle bundle = new Bundle(1);
                    gVar.a();
                    if ("[DEFAULT]".equals(gVar.f4301b)) {
                        ((l) cVar2).a(n.f3647e, d.f9693r);
                        gVar.a();
                        b9.a aVar = (b9.a) gVar.g.get();
                        synchronized (aVar) {
                            z10 = aVar.f1468a;
                        }
                        bundle.putBoolean("dataCollectionDefaultEnabled", z10);
                    }
                    b.f4670b = new b(d7.c(context, bundle).f2226b);
                }
            }
        }
        return b.f4670b;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<l8.b> getComponents() {
        l8.a a9 = l8.b.a(a.class);
        a9.a(j.a(g.class));
        a9.a(j.a(Context.class));
        a9.a(j.a(t8.c.class));
        a9.f5897f = d.f9694s;
        if (a9.f5895d == 0) {
            a9.f5895d = 2;
            return Arrays.asList(a9.b(), i7.a.I("fire-analytics", "23.2.0"));
        }
        i0.l("Instantiation type has already been set.");
        return null;
    }
}
