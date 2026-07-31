package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cz0;
import com.yandex.mobile.ads.impl.do1;
import com.yandex.mobile.ads.impl.yy0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class mz0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private String f29314a;

    @NotNull
    public final ArrayList a(@NotNull List networks) {
        com.monetization.ads.mediation.base.a aVar;
        cz0.c cVar;
        Intrinsics.checkNotNullParameter(networks, "networks");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(networks, 10));
        Iterator it = networks.iterator();
        while (it.hasNext()) {
            yy0 yy0Var = (yy0) it.next();
            List<yy0.b> b4 = yy0Var.b();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b4, 10));
            for (yy0.b bVar : b4) {
                try {
                    aVar = (com.monetization.ads.mediation.base.a) do1.a.a(bVar.a(), new Object[0]);
                } catch (Exception unused) {
                    aVar = null;
                }
                if (aVar == null) {
                    cVar = new cz0.c(bVar.b(), null, false);
                } else {
                    bx0 bx0Var = new bx0(aVar);
                    if (this.f29314a == null) {
                        this.f29314a = bx0Var.b().getNetworkSdkVersion();
                    }
                    cVar = new cz0.c(bVar.b(), bx0Var.b().getAdapterVersion(), true);
                }
                arrayList2.add(cVar);
            }
            String str = this.f29314a;
            this.f29314a = null;
            arrayList.add(new cz0(yy0Var.d(), yy0Var.c(), str, arrayList2));
        }
        return arrayList;
    }
}
