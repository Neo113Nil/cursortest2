package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.n4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2105n4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f29421a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qg1 f29422b = new qg1();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f29423c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f29424d = new ArrayList();

    public final void a() {
        synchronized (this.f29421a) {
            this.f29423c.clear();
            this.f29424d.clear();
            Unit unit = Unit.f41027a;
        }
    }

    @NotNull
    public final List<C2058l4> b() {
        List<C2058l4> list;
        synchronized (this.f29421a) {
            list = CollectionsKt.toList(this.f29424d);
        }
        return list;
    }

    public final void b(@NotNull EnumC2082m4 adLoadingPhaseType) {
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        a(adLoadingPhaseType, null);
    }

    public final void a(@NotNull EnumC2082m4 adLoadingPhaseType) {
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        qg1 parametersProvider = this.f29422b;
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        Intrinsics.checkNotNullParameter(parametersProvider, "parametersProvider");
        a(adLoadingPhaseType, parametersProvider, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000d, B:9:0x0033, B:10:0x0045, B:12:0x004f, B:13:0x0055, B:18:0x0018, B:20:0x0020), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000d, B:9:0x0033, B:10:0x0045, B:12:0x004f, B:13:0x0055, B:18:0x0018, B:20:0x0020), top: B:3:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NotNull EnumC2082m4 adLoadingPhaseType, @NotNull rg1 parametersProvider, @Nullable w92 w92Var) {
        Long l4;
        Long valueOf;
        Map map;
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        Intrinsics.checkNotNullParameter(parametersProvider, "parametersProvider");
        synchronized (this.f29421a) {
            try {
                Map map2 = (Map) this.f29423c.get(adLoadingPhaseType);
                if (map2 != null && (l4 = (Long) map2.get(w92Var)) != null) {
                    valueOf = Long.valueOf(SystemClock.elapsedRealtime() - l4.longValue());
                    if (valueOf != null) {
                        this.f29424d.add(new C2058l4(adLoadingPhaseType, parametersProvider.a(valueOf.longValue())));
                    }
                    map = (Map) this.f29423c.get(adLoadingPhaseType);
                    if (map != null) {
                    }
                    Unit unit = Unit.f41027a;
                }
                valueOf = null;
                if (valueOf != null) {
                }
                map = (Map) this.f29423c.get(adLoadingPhaseType);
                if (map != null) {
                }
                Unit unit2 = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(@NotNull EnumC2082m4 adLoadingPhaseType, @Nullable w92 w92Var) {
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        synchronized (this.f29421a) {
            try {
                Map map = (Map) this.f29423c.get(adLoadingPhaseType);
                if (map == null) {
                    map = new LinkedHashMap();
                }
                this.f29423c.put(adLoadingPhaseType, map);
                map.put(w92Var, Long.valueOf(SystemClock.elapsedRealtime()));
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
