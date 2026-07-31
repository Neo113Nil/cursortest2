package com.ironsource;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class dw {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<AbstractC1424a0> f15937a;

    /* JADX WARN: Multi-variable type inference failed */
    public dw(@NotNull List<? extends AbstractC1424a0> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        this.f15937a = instances;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ dw a(dw dwVar, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = dwVar.f15937a;
        }
        return dwVar.a(list);
    }

    @NotNull
    public final List<AbstractC1424a0> b() {
        return this.f15937a;
    }

    public final int c() {
        return this.f15937a.size();
    }

    @NotNull
    public final String d() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC1424a0 abstractC1424a0 : this.f15937a) {
            arrayList.add(a(abstractC1424a0.h(), abstractC1424a0.q()));
        }
        return CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dw) && Intrinsics.areEqual(this.f15937a, ((dw) obj).f15937a);
    }

    public int hashCode() {
        return this.f15937a.hashCode();
    }

    @NotNull
    public String toString() {
        return "WaterfallInstances(instances=" + this.f15937a + ')';
    }

    @NotNull
    public final dw a(@NotNull List<? extends AbstractC1424a0> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        return new dw(instances);
    }

    private final String a(C1513m5 c1513m5, int i4) {
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        String format = String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i4), c1513m5.c()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    @NotNull
    public final List<AbstractC1424a0> a() {
        return this.f15937a;
    }
}
