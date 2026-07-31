package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class wi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f20199a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20200b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f20201c;

    public wi() {
        this(null, 0, null, 7, null);
    }

    public static /* synthetic */ wi a(wi wiVar, String str, int i4, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = wiVar.f20199a;
        }
        if ((i5 & 2) != 0) {
            i4 = wiVar.f20200b;
        }
        if ((i5 & 4) != 0) {
            str2 = wiVar.f20201c;
        }
        return wiVar.a(str, i4, str2);
    }

    public final int b() {
        return this.f20200b;
    }

    @Nullable
    public final String c() {
        return this.f20201c;
    }

    @Nullable
    public final String d() {
        return this.f20201c;
    }

    @NotNull
    public final String e() {
        return this.f20199a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi)) {
            return false;
        }
        wi wiVar = (wi) obj;
        return Intrinsics.areEqual(this.f20199a, wiVar.f20199a) && this.f20200b == wiVar.f20200b && Intrinsics.areEqual(this.f20201c, wiVar.f20201c);
    }

    public final int f() {
        return this.f20200b;
    }

    public int hashCode() {
        int hashCode = ((this.f20199a.hashCode() * 31) + Integer.hashCode(this.f20200b)) * 31;
        String str = this.f20201c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "InstanceInformation(instanceId=" + this.f20199a + ", instanceType=" + this.f20200b + ", dynamicDemandSourceId=" + this.f20201c + ')';
    }

    public wi(@NotNull String instanceId, int i4, @Nullable String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.f20199a = instanceId;
        this.f20200b = i4;
        this.f20201c = str;
    }

    @NotNull
    public final wi a(@NotNull String instanceId, int i4, @Nullable String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        return new wi(instanceId, i4, str);
    }

    public /* synthetic */ wi(String str, int i4, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 0 : i4, (i5 & 4) != 0 ? "" : str2);
    }

    @NotNull
    public final String a() {
        return this.f20199a;
    }
}
