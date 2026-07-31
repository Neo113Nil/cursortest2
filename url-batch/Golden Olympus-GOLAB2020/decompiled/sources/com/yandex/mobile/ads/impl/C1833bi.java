package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.bi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1833bi {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f23817a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f23818b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f23819c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f23820d;

    public C1833bi(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f23817a = str;
        this.f23818b = str2;
        this.f23819c = str3;
        this.f23820d = str4;
    }

    @Nullable
    public final String a() {
        return this.f23820d;
    }

    @Nullable
    public final String b() {
        return this.f23819c;
    }

    @Nullable
    public final String c() {
        return this.f23818b;
    }

    @Nullable
    public final String d() {
        return this.f23817a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1833bi)) {
            return false;
        }
        C1833bi c1833bi = (C1833bi) obj;
        return Intrinsics.areEqual(this.f23817a, c1833bi.f23817a) && Intrinsics.areEqual(this.f23818b, c1833bi.f23818b) && Intrinsics.areEqual(this.f23819c, c1833bi.f23819c) && Intrinsics.areEqual(this.f23820d, c1833bi.f23820d);
    }

    public final int hashCode() {
        String str = this.f23817a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f23818b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f23819c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f23820d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "BackgroundColors(top=" + this.f23817a + ", right=" + this.f23818b + ", left=" + this.f23819c + ", bottom=" + this.f23820d + ")";
    }
}
