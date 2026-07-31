package com.yandex.mobile.ads.impl;

import D2.AbstractC0348a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sk0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC0348a f31817a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1834bj f31818b;

    public sk0(@NotNull AbstractC0348a jsonSerializer, @NotNull C1834bj dataEncoder) {
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        Intrinsics.checkNotNullParameter(dataEncoder, "dataEncoder");
        this.f31817a = jsonSerializer;
        this.f31818b = dataEncoder;
    }

    @NotNull
    public final String a(@NotNull hx reportData) {
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        AbstractC0348a abstractC0348a = this.f31817a;
        AbstractC0348a.f371d.a();
        String b4 = abstractC0348a.b(hx.Companion.serializer(), reportData);
        this.f31818b.getClass();
        String a4 = C1834bj.a(b4);
        if (a4 == null) {
            a4 = "";
        }
        List plus = CollectionsKt.plus((Iterable) new kotlin.ranges.b('A', 'Z'), (Iterable) new kotlin.ranges.b('a', 'z'));
        IntRange intRange = new IntRange(1, 3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator it = intRange.iterator();
        while (it.hasNext()) {
            ((kotlin.collections.E) it).a();
            Character ch = (Character) CollectionsKt.random(plus, kotlin.random.e.f41170b);
            ch.getClass();
            arrayList.add(ch);
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null) + a4;
    }
}
