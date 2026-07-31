package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gw {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f26305a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f26306b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26307c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f26308d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f26309e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f26310f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final a f26311g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final List<String> f26312h;

    public interface a {

        /* renamed from: com.yandex.mobile.ads.impl.gw$a$a, reason: collision with other inner class name */
        public static final class C0190a implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0190a f26313a = new C0190a();

            private C0190a() {
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final ez0 f26314a;

            public b() {
                ez0 error = ez0.f25524b;
                Intrinsics.checkNotNullParameter(error, "error");
                this.f26314a = error;
            }

            @NotNull
            public final ez0 a() {
                return this.f26314a;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f26314a == ((b) obj).f26314a;
            }

            public final int hashCode() {
                return this.f26314a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "InvalidIntegration(error=" + this.f26314a + ")";
            }
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f26315a = new c();

            private c() {
            }
        }
    }

    public gw(@NotNull String name, @Nullable String str, boolean z4, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull a adapterStatus, @Nullable ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(adapterStatus, "adapterStatus");
        this.f26305a = name;
        this.f26306b = str;
        this.f26307c = z4;
        this.f26308d = str2;
        this.f26309e = str3;
        this.f26310f = str4;
        this.f26311g = adapterStatus;
        this.f26312h = arrayList;
    }

    @NotNull
    public final a a() {
        return this.f26311g;
    }

    @Nullable
    public final String b() {
        return this.f26308d;
    }

    @Nullable
    public final String c() {
        return this.f26309e;
    }

    @Nullable
    public final String d() {
        return this.f26306b;
    }

    @NotNull
    public final String e() {
        return this.f26305a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw)) {
            return false;
        }
        gw gwVar = (gw) obj;
        return Intrinsics.areEqual(this.f26305a, gwVar.f26305a) && Intrinsics.areEqual(this.f26306b, gwVar.f26306b) && this.f26307c == gwVar.f26307c && Intrinsics.areEqual(this.f26308d, gwVar.f26308d) && Intrinsics.areEqual(this.f26309e, gwVar.f26309e) && Intrinsics.areEqual(this.f26310f, gwVar.f26310f) && Intrinsics.areEqual(this.f26311g, gwVar.f26311g) && Intrinsics.areEqual(this.f26312h, gwVar.f26312h);
    }

    @Nullable
    public final String f() {
        return this.f26310f;
    }

    public final int hashCode() {
        int hashCode = this.f26305a.hashCode() * 31;
        String str = this.f26306b;
        int a4 = C1965h6.a(this.f26307c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f26308d;
        int hashCode2 = (a4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26309e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26310f;
        int hashCode4 = (this.f26311g.hashCode() + ((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        List<String> list = this.f26312h;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelAdapterData(name=" + this.f26305a + ", logoUrl=" + this.f26306b + ", adapterIntegrationStatus=" + this.f26307c + ", adapterVersion=" + this.f26308d + ", latestAdapterVersion=" + this.f26309e + ", sdkVersion=" + this.f26310f + ", adapterStatus=" + this.f26311g + ", formats=" + this.f26312h + ")";
    }
}
