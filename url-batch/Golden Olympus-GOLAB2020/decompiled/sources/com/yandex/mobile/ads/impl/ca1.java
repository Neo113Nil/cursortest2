package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ca1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ow0 f24144a = new ow0();

    public final boolean a(@NotNull h41 nativeAdBlock) {
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        List<u31> e4 = nativeAdBlock.c().e();
        ArrayList arrayList = new ArrayList();
        for (u31 u31Var : e4) {
            this.f24144a.getClass();
            CollectionsKt.addAll(arrayList, ow0.a(u31Var));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ab2 c4 = ((mw0) obj).c();
            List<ob2<ya1>> c5 = c4 != null ? c4.c() : null;
            if (c5 == null) {
                c5 = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList2, c5);
        }
        if (!arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                if (!((ob2) obj2).g().d().isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
}
