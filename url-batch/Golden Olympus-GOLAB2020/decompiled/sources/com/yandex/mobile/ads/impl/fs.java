package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fs {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f25905a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final C2200r8 f25906b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f25907c;

    public fs(@NotNull String adUnitId, @Nullable C2200r8 c2200r8, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f25905a = adUnitId;
        this.f25906b = c2200r8;
        this.f25907c = str;
    }

    @Nullable
    public final C2200r8 a() {
        return this.f25906b;
    }

    @NotNull
    public final String b() {
        return this.f25905a;
    }

    @Nullable
    public final String c() {
        return this.f25907c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs)) {
            return false;
        }
        fs fsVar = (fs) obj;
        return Intrinsics.areEqual(this.f25905a, fsVar.f25905a) && Intrinsics.areEqual(this.f25906b, fsVar.f25906b) && Intrinsics.areEqual(this.f25907c, fsVar.f25907c);
    }

    public final int hashCode() {
        int hashCode = this.f25905a.hashCode() * 31;
        C2200r8 c2200r8 = this.f25906b;
        int hashCode2 = (hashCode + (c2200r8 == null ? 0 : c2200r8.hashCode())) * 31;
        String str = this.f25907c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CoreAdInfo(adUnitId=" + this.f25905a + ", adSize=" + this.f25906b + ", data=" + this.f25907c + ")";
    }
}
