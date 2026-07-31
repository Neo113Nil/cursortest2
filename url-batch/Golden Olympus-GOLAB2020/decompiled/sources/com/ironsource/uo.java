package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class uo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f19936a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f19937b;

    public uo(@NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f19936a = url;
        this.f19937b = str;
    }

    public static /* synthetic */ uo a(uo uoVar, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = uoVar.f19936a;
        }
        if ((i4 & 2) != 0) {
            str2 = uoVar.f19937b;
        }
        return uoVar.a(str, str2);
    }

    @Nullable
    public final String b() {
        return this.f19937b;
    }

    @Nullable
    public final String c() {
        return this.f19937b;
    }

    @NotNull
    public final String d() {
        return this.f19936a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        return Intrinsics.areEqual(this.f19936a, uoVar.f19936a) && Intrinsics.areEqual(this.f19937b, uoVar.f19937b);
    }

    public int hashCode() {
        int hashCode = this.f19936a.hashCode() * 31;
        String str = this.f19937b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "OpenUrl(url=" + this.f19936a + ", packageName=" + this.f19937b + ')';
    }

    public /* synthetic */ uo(String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? "" : str2);
    }

    @NotNull
    public final uo a(@NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new uo(url, str);
    }

    @NotNull
    public final String a() {
        return this.f19936a;
    }
}
