package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.i3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1986i3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C2195r3> f27076a;

    /* renamed from: b, reason: collision with root package name */
    private int f27077b;

    /* renamed from: c, reason: collision with root package name */
    private int f27078c;

    public C1986i3(@NotNull ArrayList adGroupPlaybackItems) {
        Intrinsics.checkNotNullParameter(adGroupPlaybackItems, "adGroupPlaybackItems");
        this.f27076a = adGroupPlaybackItems;
    }

    public final void a() {
        this.f27077b = this.f27076a.size();
        this.f27078c = this.f27076a.size();
    }

    @Nullable
    public final C2195r3 b() {
        return (C2195r3) CollectionsKt.getOrNull(this.f27076a, this.f27078c);
    }

    @Nullable
    public final ob2<on0> c() {
        C2195r3 c2195r3 = (C2195r3) CollectionsKt.getOrNull(this.f27076a, this.f27077b);
        if (c2195r3 != null) {
            return c2195r3.c();
        }
        return null;
    }

    @Nullable
    public final ln0 d() {
        C2195r3 c2195r3 = (C2195r3) CollectionsKt.getOrNull(this.f27076a, this.f27077b);
        if (c2195r3 != null) {
            return c2195r3.a();
        }
        return null;
    }

    @Nullable
    public final bg2 e() {
        C2195r3 c2195r3 = (C2195r3) CollectionsKt.getOrNull(this.f27076a, this.f27077b);
        if (c2195r3 != null) {
            return c2195r3.d();
        }
        return null;
    }

    @Nullable
    public final C2195r3 f() {
        return (C2195r3) CollectionsKt.getOrNull(this.f27076a, this.f27077b + 1);
    }

    @Nullable
    public final C2195r3 g() {
        this.f27078c = Math.max(this.f27078c + 1, this.f27077b + 1);
        return b();
    }

    @Nullable
    public final C2195r3 h() {
        int i4 = this.f27077b + 1;
        this.f27077b = i4;
        return (C2195r3) CollectionsKt.getOrNull(this.f27076a, i4);
    }

    @Nullable
    public final C2195r3 a(@NotNull ob2<on0> videoAdInfo) {
        Object obj;
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Iterator<T> it = this.f27076a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((C2195r3) obj).c(), videoAdInfo)) {
                break;
            }
        }
        return (C2195r3) obj;
    }
}
