package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class qu {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private String f18888a;

    /* JADX WARN: Multi-variable type inference failed */
    public qu() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ qu a(qu quVar, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = quVar.f18888a;
        }
        return quVar.a(str);
    }

    @Nullable
    public final String b() {
        return this.f18888a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qu) && Intrinsics.areEqual(this.f18888a, ((qu) obj).f18888a);
    }

    public int hashCode() {
        String str = this.f18888a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.f18888a + ')';
    }

    public qu(@Nullable String str) {
        this.f18888a = str;
    }

    @NotNull
    public final qu a(@Nullable String str) {
        return new qu(str);
    }

    public final void b(@Nullable String str) {
        this.f18888a = str;
    }

    public /* synthetic */ qu(String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str);
    }

    @Nullable
    public final String a() {
        return this.f18888a;
    }
}
