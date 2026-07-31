package com.ironsource;

import com.ironsource.C1539q1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1494k0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f16883a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<C1480i0> f16884b = new CopyOnWriteArrayList();

    public C1494k0(int i4) {
        this.f16883a = i4;
    }

    private final boolean b() {
        return this.f16883a == 0;
    }

    private final boolean c() {
        return this.f16883a != -1;
    }

    public final void a(@Nullable C1480i0 c1480i0) {
        if (b()) {
            return;
        }
        if (a()) {
            CollectionsKt.removeFirstOrNull(this.f16884b);
        }
        if (c1480i0 == null) {
            c1480i0 = new C1480i0(C1539q1.a.NotPartOfWaterfall);
        }
        this.f16884b.add(c1480i0);
    }

    @NotNull
    public final String d() {
        List<C1480i0> list = this.f16884b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((C1480i0) it.next()).b().ordinal()));
        }
        return CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }

    private final boolean a() {
        return c() && this.f16884b.size() >= this.f16883a;
    }
}
