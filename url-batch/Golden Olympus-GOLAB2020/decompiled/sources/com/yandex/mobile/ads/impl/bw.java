package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bw {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f23929a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f23930b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<ex> f23931c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f23932d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f23933e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final a f23934f;

    public interface a {

        /* renamed from: com.yandex.mobile.ads.impl.bw$a$a, reason: collision with other inner class name */
        public static final class C0182a implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0182a f23935a = new C0182a();

            private C0182a() {
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Nullable
            private final ay f23936a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final List<zx> f23937b;

            public b(@Nullable ay ayVar, @NotNull List<zx> cpmFloors) {
                Intrinsics.checkNotNullParameter(cpmFloors, "cpmFloors");
                this.f23936a = ayVar;
                this.f23937b = cpmFloors;
            }

            @NotNull
            public final List<zx> a() {
                return this.f23937b;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f23936a, bVar.f23936a) && Intrinsics.areEqual(this.f23937b, bVar.f23937b);
            }

            public final int hashCode() {
                ay ayVar = this.f23936a;
                return this.f23937b.hashCode() + ((ayVar == null ? 0 : ayVar.hashCode()) * 31);
            }

            @NotNull
            public final String toString() {
                return "Waterfall(currency=" + this.f23936a + ", cpmFloors=" + this.f23937b + ")";
            }
        }
    }

    public bw(@Nullable String str, @NotNull String adapterName, @NotNull ArrayList parameters, @Nullable String str2, @Nullable String str3, @NotNull a type) {
        Intrinsics.checkNotNullParameter(adapterName, "adapterName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f23929a = str;
        this.f23930b = adapterName;
        this.f23931c = parameters;
        this.f23932d = str2;
        this.f23933e = str3;
        this.f23934f = type;
    }

    @Nullable
    public final String a() {
        return this.f23932d;
    }

    @NotNull
    public final String b() {
        return this.f23930b;
    }

    @Nullable
    public final String c() {
        return this.f23929a;
    }

    @Nullable
    public final String d() {
        return this.f23933e;
    }

    @NotNull
    public final List<ex> e() {
        return this.f23931c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) obj;
        return Intrinsics.areEqual(this.f23929a, bwVar.f23929a) && Intrinsics.areEqual(this.f23930b, bwVar.f23930b) && Intrinsics.areEqual(this.f23931c, bwVar.f23931c) && Intrinsics.areEqual(this.f23932d, bwVar.f23932d) && Intrinsics.areEqual(this.f23933e, bwVar.f23933e) && Intrinsics.areEqual(this.f23934f, bwVar.f23934f);
    }

    @NotNull
    public final a f() {
        return this.f23934f;
    }

    public final int hashCode() {
        String str = this.f23929a;
        int a4 = C2039k9.a(this.f23931c, C1842c3.a(this.f23930b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f23932d;
        int hashCode = (a4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f23933e;
        return this.f23934f.hashCode() + ((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelAdUnitMediationAdapterData(logoUrl=" + this.f23929a + ", adapterName=" + this.f23930b + ", parameters=" + this.f23931c + ", adUnitId=" + this.f23932d + ", networkAdUnitIdName=" + this.f23933e + ", type=" + this.f23934f + ")";
    }
}
