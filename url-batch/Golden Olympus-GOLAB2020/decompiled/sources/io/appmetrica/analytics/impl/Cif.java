package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.if, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cif implements InterfaceC2806md {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39194a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39195b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39196c;

    public Cif(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        this.f39194a = context;
        this.f39195b = str;
        this.f39196c = str2;
    }

    @NotNull
    public final Cif a(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        return new Cif(context, str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cif)) {
            return false;
        }
        Cif cif = (Cif) obj;
        return Intrinsics.areEqual(this.f39194a, cif.f39194a) && Intrinsics.areEqual(this.f39195b, cif.f39195b) && Intrinsics.areEqual(this.f39196c, cif.f39196c);
    }

    public final int hashCode() {
        return this.f39196c.hashCode() + ((this.f39195b.hashCode() + (this.f39194a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "PreferencesBasedModuleEntryPoint(context=" + this.f39194a + ", prefName=" + this.f39195b + ", prefValueName=" + this.f39196c + ')';
    }

    public static Cif a(Cif cif, Context context, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            context = cif.f39194a;
        }
        if ((i4 & 2) != 0) {
            str = cif.f39195b;
        }
        if ((i4 & 4) != 0) {
            str2 = cif.f39196c;
        }
        cif.getClass();
        return new Cif(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2806md
    @NotNull
    public final String a() {
        String string = this.f39194a.getSharedPreferences(this.f39195b, 0).getString(this.f39196c, "");
        return string == null ? "" : string;
    }
}
