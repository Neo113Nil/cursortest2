package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.PackageName;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final v f44191a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Url f44192b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final PackageName f44193c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final j2 f44194d;

    public h1(@NotNull v name, @NotNull Url logoUrl, @NotNull PackageName packageName, @NotNull j2 schema) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(schema, "schema");
        this.f44191a = name;
        this.f44192b = logoUrl;
        this.f44193c = packageName;
        this.f44194d = schema;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.areEqual(this.f44191a, h1Var.f44191a) && Intrinsics.areEqual(this.f44192b, h1Var.f44192b) && Intrinsics.areEqual(this.f44193c, h1Var.f44193c) && Intrinsics.areEqual(this.f44194d, h1Var.f44194d);
    }

    public final int hashCode() {
        return this.f44194d.f44355a.hashCode() + ((this.f44193c.hashCode() + ((this.f44192b.hashCode() + (this.f44191a.f45112a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "BankApp(name=" + this.f44191a + ", logoUrl=" + this.f44192b + ", packageName=" + this.f44193c + ", schema=" + this.f44194d + ')';
    }
}
