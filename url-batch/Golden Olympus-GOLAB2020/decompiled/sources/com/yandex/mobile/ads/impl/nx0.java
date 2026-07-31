package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nx0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final jy0 f29783a;

    public nx0(@NotNull jy0 paramsParser) {
        Intrinsics.checkNotNullParameter(paramsParser, "paramsParser");
        this.f29783a = paramsParser;
    }

    @NotNull
    public final ArrayList a(@NotNull ArrayList mediatedNetworks) {
        Intrinsics.checkNotNullParameter(mediatedNetworks, "mediatedNetworks");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = mediatedNetworks.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = mediatedNetworks.get(i4);
            i4++;
            String b4 = this.f29783a.b((xy0) obj);
            Object obj2 = linkedHashMap.get(b4);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(b4, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            xy0 xy0Var = ((String) entry.getKey()) != null ? (xy0) CollectionsKt.first((List) entry.getValue()) : null;
            if (xy0Var != null) {
                arrayList.add(xy0Var);
            }
        }
        return arrayList;
    }
}
