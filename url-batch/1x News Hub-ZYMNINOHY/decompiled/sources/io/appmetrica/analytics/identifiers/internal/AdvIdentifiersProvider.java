package io.appmetrica.analytics.identifiers.internal;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.identifiers.impl.a;
import io.appmetrica.analytics.identifiers.impl.b;
import io.appmetrica.analytics.identifiers.impl.c;
import io.appmetrica.analytics.identifiers.impl.d;

/* loaded from: classes.dex */
public class AdvIdentifiersProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5615a = 0;
    private static final d retriever = new d();

    public static Bundle requestIdentifiers(Context context, Bundle bundle) {
        c a3;
        b bVar = (b) retriever.f5598a.get(bundle.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
        if (bVar == null || (a3 = bVar.a(context)) == null) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        a aVar = a3.f5596b;
        if (aVar != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", aVar.f5592a);
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.ID", aVar.f5593b);
            Boolean bool = aVar.f5594c;
            if (bool != null) {
                bundle3.putBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED", bool.booleanValue());
            }
            bundle2.putBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO", bundle3);
        }
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.STATUS", a3.f5595a.getValue());
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE", a3.f5597c);
        return bundle2;
    }
}
