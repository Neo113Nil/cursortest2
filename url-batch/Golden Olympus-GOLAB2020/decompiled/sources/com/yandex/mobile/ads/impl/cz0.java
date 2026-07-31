package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0307f;
import C2.C0313i;
import C2.C0343x0;
import C2.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;
import z2.AbstractC3551a;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class cz0 {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3527b[] f24360e = {null, null, null, new C0307f(c.a.f24370a)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f24361a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f24362b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f24363c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<c> f24364d;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f24365a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f24366b;

        static {
            a aVar = new a();
            f24365a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData", aVar, 4);
            c0343x0.l("name", false);
            c0343x0.l("id", false);
            c0343x0.l("version", false);
            c0343x0.l("adapters", false);
            f24366b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            InterfaceC3527b[] interfaceC3527bArr = cz0.f24360e;
            C2.M0 m02 = C2.M0.f224a;
            return new InterfaceC3527b[]{m02, m02, AbstractC3551a.t(m02), interfaceC3527bArr[3]};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            String str;
            String str2;
            String str3;
            List list;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f24366b;
            B2.c b4 = decoder.b(c0343x0);
            InterfaceC3527b[] interfaceC3527bArr = cz0.f24360e;
            String str4 = null;
            if (b4.v()) {
                String h4 = b4.h(c0343x0, 0);
                String h5 = b4.h(c0343x0, 1);
                String str5 = (String) b4.B(c0343x0, 2, C2.M0.f224a, null);
                list = (List) b4.y(c0343x0, 3, interfaceC3527bArr[3], null);
                str = h4;
                str3 = str5;
                i4 = 15;
                str2 = h5;
            } else {
                boolean z4 = true;
                int i5 = 0;
                String str6 = null;
                String str7 = null;
                List list2 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else if (t4 == 0) {
                        str4 = b4.h(c0343x0, 0);
                        i5 |= 1;
                    } else if (t4 == 1) {
                        str6 = b4.h(c0343x0, 1);
                        i5 |= 2;
                    } else if (t4 == 2) {
                        str7 = (String) b4.B(c0343x0, 2, C2.M0.f224a, str7);
                        i5 |= 4;
                    } else {
                        if (t4 != 3) {
                            throw new y2.o(t4);
                        }
                        list2 = (List) b4.y(c0343x0, 3, interfaceC3527bArr[3], list2);
                        i5 |= 8;
                    }
                }
                i4 = i5;
                str = str4;
                str2 = str6;
                str3 = str7;
                list = list2;
            }
            b4.c(c0343x0);
            return new cz0(i4, str, str2, str3, list);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f24366b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            cz0 value = (cz0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f24366b;
            B2.d b4 = encoder.b(c0343x0);
            cz0.a(value, b4, c0343x0);
            b4.c(c0343x0);
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] typeParametersSerializers() {
            return L.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        @NotNull
        public final InterfaceC3527b serializer() {
            return a.f24365a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    @InterfaceC3533h
    public static final class c {

        @NotNull
        public static final b Companion = new b(0);

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f24367a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f24368b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f24369c;

        public static final class a implements C2.L {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f24370a;

            /* renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ C0343x0 f24371b;

            static {
                a aVar = new a();
                f24370a = aVar;
                C0343x0 c0343x0 = new C0343x0("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData.MediationAdapterData", aVar, 3);
                c0343x0.l("format", false);
                c0343x0.l("version", false);
                c0343x0.l("isIntegrated", false);
                f24371b = c0343x0;
            }

            private a() {
            }

            @Override // C2.L
            @NotNull
            public final InterfaceC3527b[] childSerializers() {
                C2.M0 m02 = C2.M0.f224a;
                return new InterfaceC3527b[]{m02, AbstractC3551a.t(m02), C0313i.f292a};
            }

            @Override // y2.InterfaceC3526a
            public final Object deserialize(B2.e decoder) {
                boolean z4;
                int i4;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                C0343x0 c0343x0 = f24371b;
                B2.c b4 = decoder.b(c0343x0);
                if (b4.v()) {
                    str = b4.h(c0343x0, 0);
                    str2 = (String) b4.B(c0343x0, 1, C2.M0.f224a, null);
                    z4 = b4.x(c0343x0, 2);
                    i4 = 7;
                } else {
                    boolean z5 = true;
                    boolean z6 = false;
                    String str3 = null;
                    String str4 = null;
                    int i5 = 0;
                    while (z5) {
                        int t4 = b4.t(c0343x0);
                        if (t4 == -1) {
                            z5 = false;
                        } else if (t4 == 0) {
                            str3 = b4.h(c0343x0, 0);
                            i5 |= 1;
                        } else if (t4 == 1) {
                            str4 = (String) b4.B(c0343x0, 1, C2.M0.f224a, str4);
                            i5 |= 2;
                        } else {
                            if (t4 != 2) {
                                throw new y2.o(t4);
                            }
                            z6 = b4.x(c0343x0, 2);
                            i5 |= 4;
                        }
                    }
                    z4 = z6;
                    i4 = i5;
                    str = str3;
                    str2 = str4;
                }
                b4.c(c0343x0);
                return new c(i4, str, str2, z4);
            }

            @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
            @NotNull
            public final A2.f getDescriptor() {
                return f24371b;
            }

            @Override // y2.InterfaceC3535j
            public final void serialize(B2.f encoder, Object obj) {
                c value = (c) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                C0343x0 c0343x0 = f24371b;
                B2.d b4 = encoder.b(c0343x0);
                c.a(value, b4, c0343x0);
                b4.c(c0343x0);
            }

            @Override // C2.L
            @NotNull
            public final InterfaceC3527b[] typeParametersSerializers() {
                return L.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            @NotNull
            public final InterfaceC3527b serializer() {
                return a.f24370a;
            }

            public /* synthetic */ b(int i4) {
                this();
            }
        }

        public /* synthetic */ c(int i4, String str, String str2, boolean z4) {
            if (7 != (i4 & 7)) {
                AbstractC0341w0.a(i4, 7, a.f24370a.getDescriptor());
            }
            this.f24367a = str;
            this.f24368b = str2;
            this.f24369c = z4;
        }

        @NotNull
        public final String a() {
            return this.f24367a;
        }

        @Nullable
        public final String b() {
            return this.f24368b;
        }

        public final boolean c() {
            return this.f24369c;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f24367a, cVar.f24367a) && Intrinsics.areEqual(this.f24368b, cVar.f24368b) && this.f24369c == cVar.f24369c;
        }

        public final int hashCode() {
            int hashCode = this.f24367a.hashCode() * 31;
            String str = this.f24368b;
            return Boolean.hashCode(this.f24369c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public final String toString() {
            return "MediationAdapterData(format=" + this.f24367a + ", version=" + this.f24368b + ", isIntegrated=" + this.f24369c + ")";
        }

        public c(@NotNull String format, @Nullable String str, boolean z4) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.f24367a = format;
            this.f24368b = str;
            this.f24369c = z4;
        }

        public static final /* synthetic */ void a(c cVar, B2.d dVar, C0343x0 c0343x0) {
            dVar.n(c0343x0, 0, cVar.f24367a);
            dVar.x(c0343x0, 1, C2.M0.f224a, cVar.f24368b);
            dVar.k(c0343x0, 2, cVar.f24369c);
        }
    }

    public /* synthetic */ cz0(int i4, String str, String str2, String str3, List list) {
        if (15 != (i4 & 15)) {
            AbstractC0341w0.a(i4, 15, a.f24365a.getDescriptor());
        }
        this.f24361a = str;
        this.f24362b = str2;
        this.f24363c = str3;
        this.f24364d = list;
    }

    public static final /* synthetic */ void a(cz0 cz0Var, B2.d dVar, C0343x0 c0343x0) {
        InterfaceC3527b[] interfaceC3527bArr = f24360e;
        dVar.n(c0343x0, 0, cz0Var.f24361a);
        dVar.n(c0343x0, 1, cz0Var.f24362b);
        dVar.x(c0343x0, 2, C2.M0.f224a, cz0Var.f24363c);
        dVar.m(c0343x0, 3, interfaceC3527bArr[3], cz0Var.f24364d);
    }

    @NotNull
    public final List<c> b() {
        return this.f24364d;
    }

    @NotNull
    public final String c() {
        return this.f24362b;
    }

    @NotNull
    public final String d() {
        return this.f24361a;
    }

    @Nullable
    public final String e() {
        return this.f24363c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz0)) {
            return false;
        }
        cz0 cz0Var = (cz0) obj;
        return Intrinsics.areEqual(this.f24361a, cz0Var.f24361a) && Intrinsics.areEqual(this.f24362b, cz0Var.f24362b) && Intrinsics.areEqual(this.f24363c, cz0Var.f24363c) && Intrinsics.areEqual(this.f24364d, cz0Var.f24364d);
    }

    public final int hashCode() {
        int a4 = C1842c3.a(this.f24362b, this.f24361a.hashCode() * 31, 31);
        String str = this.f24363c;
        return this.f24364d.hashCode() + ((a4 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "MediationNetworkData(name=" + this.f24361a + ", id=" + this.f24362b + ", version=" + this.f24363c + ", adapters=" + this.f24364d + ")";
    }

    public cz0(@NotNull String name, @NotNull String id, @Nullable String str, @NotNull ArrayList adapters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.f24361a = name;
        this.f24362b = id;
        this.f24363c = str;
        this.f24364d = adapters;
    }
}
