package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cz0;
import com.yandex.mobile.ads.impl.yy0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class io0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mz0 f27302a;

    public /* synthetic */ io0() {
        this(new mz0());
    }

    @NotNull
    public final ArrayList a() {
        mz0 mz0Var = this.f27302a;
        int i4 = yy0.f35386e;
        ArrayList a4 = mz0Var.a(yy0.a.a());
        ArrayList arrayList = new ArrayList();
        int size = a4.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = a4.get(i5);
            i5++;
            List<cz0.c> b4 = ((cz0) obj).b();
            if (!(b4 instanceof Collection) || !b4.isEmpty()) {
                Iterator<T> it = b4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((cz0.c) it.next()).c()) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public io0(@NotNull mz0 mediationNetworksDataProvider) {
        Intrinsics.checkNotNullParameter(mediationNetworksDataProvider, "mediationNetworksDataProvider");
        this.f27302a = mediationNetworksDataProvider;
    }
}
