package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yy0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lz0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mz0 f28811a;

    public lz0(@NotNull mz0 networksDataProvider) {
        Intrinsics.checkNotNullParameter(networksDataProvider, "networksDataProvider");
        this.f28811a = networksDataProvider;
    }

    @NotNull
    public final ArrayList a(@NotNull List mediationNetworks) {
        Intrinsics.checkNotNullParameter(mediationNetworks, "mediationNetworks");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mediationNetworks, 10));
        Iterator it = mediationNetworks.iterator();
        while (it.hasNext()) {
            fx fxVar = (fx) it.next();
            List<String> b4 = fxVar.b();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b4, 10));
            for (String str : b4) {
                List D02 = StringsKt.D0(str, new char[]{JwtParser.SEPARATOR_CHAR}, false, 0, 6, null);
                String str2 = (String) CollectionsKt.getOrNull(D02, CollectionsKt.getLastIndex(D02) - 1);
                if (str2 == null) {
                    str2 = "";
                }
                arrayList2.add(new yy0.b(str2, str));
            }
            String f4 = fxVar.f();
            String c4 = fxVar.c();
            if (c4 == null) {
                c4 = StringUtils.UNDEFINED;
            }
            arrayList.add(new yy0(f4, c4, arrayList2));
        }
        return this.f28811a.a(arrayList);
    }
}
