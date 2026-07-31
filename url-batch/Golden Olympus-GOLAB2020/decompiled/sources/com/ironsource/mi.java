package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class mi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f18049a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f18050b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private InterfaceC1577v0 f18051c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18052d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private String f18053e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private String f18054f;

    public mi(@NotNull String appKey, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f18049a = appKey;
        this.f18050b = userId;
    }

    public static /* synthetic */ mi a(mi miVar, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = miVar.f18049a;
        }
        if ((i4 & 2) != 0) {
            str2 = miVar.f18050b;
        }
        return miVar.a(str, str2);
    }

    @NotNull
    public final String b() {
        return this.f18050b;
    }

    public final boolean c() {
        return this.f18052d;
    }

    @NotNull
    public final String d() {
        return this.f18049a;
    }

    @Nullable
    public final InterfaceC1577v0 e() {
        return this.f18051c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi)) {
            return false;
        }
        mi miVar = (mi) obj;
        return Intrinsics.areEqual(this.f18049a, miVar.f18049a) && Intrinsics.areEqual(this.f18050b, miVar.f18050b);
    }

    @Nullable
    public final String f() {
        return this.f18054f;
    }

    @Nullable
    public final String g() {
        return this.f18053e;
    }

    @NotNull
    public final String h() {
        return this.f18050b;
    }

    public int hashCode() {
        return (this.f18049a.hashCode() * 31) + this.f18050b.hashCode();
    }

    @NotNull
    public String toString() {
        return "InitConfig(appKey=" + this.f18049a + ", userId=" + this.f18050b + ')';
    }

    @NotNull
    public final mi a(@NotNull String appKey, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new mi(appKey, userId);
    }

    public final void b(@Nullable String str) {
        this.f18053e = str;
    }

    public final <T> T a(@NotNull mm<mi, T> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }

    @NotNull
    public final String a() {
        return this.f18049a;
    }

    public final void a(@Nullable InterfaceC1577v0 interfaceC1577v0) {
        this.f18051c = interfaceC1577v0;
    }

    public final void a(@Nullable String str) {
        this.f18054f = str;
    }

    public final void a(boolean z4) {
        this.f18052d = z4;
    }
}
