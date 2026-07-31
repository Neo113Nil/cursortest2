package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zf2 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final List<String> f35582c = CollectionsKt.listOf((Object[]) new String[]{"clickTracking", com.ironsource.c9.f15701e});

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ge2 f35583a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final h82 f35584b;

    public zf2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35583a = new ge2(context);
        this.f35584b = new h82(context);
    }

    public final void a(@NotNull yf2 trackable, @NotNull String eventName) {
        Intrinsics.checkNotNullParameter(trackable, "trackable");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        List<String> list = trackable.a().get(eventName);
        if (f35582c.contains(eventName)) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f35584b.a((String) it.next()));
                }
                list = arrayList;
            } else {
                list = null;
            }
        }
        if (list != null) {
            this.f35583a.a(list, null);
        }
    }

    public final void a(@NotNull yf2 trackable, @NotNull String eventName, @NotNull Map<String, String> macros) {
        Intrinsics.checkNotNullParameter(trackable, "trackable");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        List<String> list = trackable.a().get(eventName);
        if (list != null) {
            this.f35583a.a(list, macros);
        }
    }
}
