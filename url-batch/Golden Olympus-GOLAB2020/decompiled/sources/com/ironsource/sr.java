package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class sr {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f19638a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f19639b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<IronSource.AD_UNIT> f19640c;

    public sr(@NotNull String appKey, @Nullable String str, @NotNull List<IronSource.AD_UNIT> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        this.f19638a = appKey;
        this.f19639b = str;
        this.f19640c = legacyAdFormats;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ sr a(sr srVar, String str, String str2, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = srVar.f19638a;
        }
        if ((i4 & 2) != 0) {
            str2 = srVar.f19639b;
        }
        if ((i4 & 4) != 0) {
            list = srVar.f19640c;
        }
        return srVar.a(str, str2, list);
    }

    @Nullable
    public final String b() {
        return this.f19639b;
    }

    @NotNull
    public final List<IronSource.AD_UNIT> c() {
        return this.f19640c;
    }

    @NotNull
    public final String d() {
        return this.f19638a;
    }

    @NotNull
    public final List<IronSource.AD_UNIT> e() {
        return this.f19640c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr)) {
            return false;
        }
        sr srVar = (sr) obj;
        return Intrinsics.areEqual(this.f19638a, srVar.f19638a) && Intrinsics.areEqual(this.f19639b, srVar.f19639b) && Intrinsics.areEqual(this.f19640c, srVar.f19640c);
    }

    @Nullable
    public final String f() {
        return this.f19639b;
    }

    public int hashCode() {
        int hashCode = this.f19638a.hashCode() * 31;
        String str = this.f19639b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f19640c.hashCode();
    }

    @NotNull
    public String toString() {
        return "SdkInitRequest(appKey=" + this.f19638a + ", userId=" + this.f19639b + ", legacyAdFormats=" + this.f19640c + ')';
    }

    public /* synthetic */ sr(String str, String str2, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : str2, list);
    }

    @NotNull
    public final sr a(@NotNull String appKey, @Nullable String str, @NotNull List<IronSource.AD_UNIT> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        return new sr(appKey, str, legacyAdFormats);
    }

    @NotNull
    public final String a() {
        return this.f19638a;
    }

    public final void a(@NotNull List<? extends IronSource.AD_UNIT> adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f19640c.clear();
        this.f19640c.addAll(adFormats);
    }
}
