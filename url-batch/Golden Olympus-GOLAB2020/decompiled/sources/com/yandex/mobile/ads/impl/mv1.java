package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.v01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mv1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f29281a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final v01 f29282b;

    public mv1(@NotNull Context context, @NotNull v01 integrationChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(integrationChecker, "integrationChecker");
        this.f29281a = context;
        this.f29282b = integrationChecker;
    }

    @NotNull
    public final nx a() {
        v01 v01Var = this.f29282b;
        Context context = this.f29281a;
        v01Var.getClass();
        v01.a a4 = v01.a(context);
        if (Intrinsics.areEqual(a4, v01.a.C0204a.f33458a)) {
            return new nx(true, CollectionsKt.emptyList());
        }
        if (!(a4 instanceof v01.a.b)) {
            throw new W1.m();
        }
        List<jo0> a5 = ((v01.a.b) a4).a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a5, 10));
        Iterator<T> it = a5.iterator();
        while (it.hasNext()) {
            arrayList.add(((jo0) it.next()).getMessage());
        }
        return new nx(false, arrayList);
    }
}
