package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.y3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2356y3 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f34784c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private static volatile C2356y3 f34785d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f34786e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f34787a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f34788b;

    /* renamed from: com.yandex.mobile.ads.impl.y3$a */
    public static final class a {
        @NotNull
        public static C2356y3 a() {
            C2356y3 c2356y3;
            C2356y3 c2356y32 = C2356y3.f34785d;
            if (c2356y32 != null) {
                return c2356y32;
            }
            synchronized (C2356y3.f34784c) {
                c2356y3 = C2356y3.f34785d;
                if (c2356y3 == null) {
                    c2356y3 = new C2356y3(0);
                    C2356y3.f34785d = c2356y3;
                }
            }
            return c2356y3;
        }
    }

    private C2356y3() {
        this.f34787a = new ArrayList();
        this.f34788b = new ArrayList();
    }

    public final void b(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (f34784c) {
            this.f34787a.remove(id);
            this.f34787a.add(id);
        }
    }

    @NotNull
    public final List<String> c() {
        List<String> list;
        synchronized (f34784c) {
            list = CollectionsKt.toList(this.f34788b);
        }
        return list;
    }

    @NotNull
    public final List<String> d() {
        List<String> list;
        synchronized (f34784c) {
            list = CollectionsKt.toList(this.f34787a);
        }
        return list;
    }

    public final void a(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (f34784c) {
            this.f34788b.remove(id);
            this.f34788b.add(id);
        }
    }

    public /* synthetic */ C2356y3(int i4) {
        this();
    }
}
