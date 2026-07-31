package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0313i;
import C2.C0343x0;
import C2.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;
import z2.AbstractC3551a;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class pw {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30588a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Boolean f30589b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final Boolean f30590c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30591d;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f30592a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f30593b;

        static {
            a aVar = new a();
            f30592a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelConsentsData", aVar, 4);
            c0343x0.l("has_location_consent", false);
            c0343x0.l("age_restricted_user", false);
            c0343x0.l("has_user_consent", false);
            c0343x0.l("has_cmp_value", false);
            f30593b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            C0313i c0313i = C0313i.f292a;
            return new InterfaceC3527b[]{c0313i, AbstractC3551a.t(c0313i), AbstractC3551a.t(c0313i), c0313i};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            boolean z4;
            boolean z5;
            int i4;
            Boolean bool;
            Boolean bool2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f30593b;
            B2.c b4 = decoder.b(c0343x0);
            if (b4.v()) {
                z4 = b4.x(c0343x0, 0);
                C0313i c0313i = C0313i.f292a;
                Boolean bool3 = (Boolean) b4.B(c0343x0, 1, c0313i, null);
                Boolean bool4 = (Boolean) b4.B(c0343x0, 2, c0313i, null);
                z5 = b4.x(c0343x0, 3);
                bool2 = bool4;
                bool = bool3;
                i4 = 15;
            } else {
                boolean z6 = true;
                z4 = false;
                int i5 = 0;
                Boolean bool5 = null;
                Boolean bool6 = null;
                boolean z7 = false;
                while (z6) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z6 = false;
                    } else if (t4 == 0) {
                        z4 = b4.x(c0343x0, 0);
                        i5 |= 1;
                    } else if (t4 == 1) {
                        bool5 = (Boolean) b4.B(c0343x0, 1, C0313i.f292a, bool5);
                        i5 |= 2;
                    } else if (t4 == 2) {
                        bool6 = (Boolean) b4.B(c0343x0, 2, C0313i.f292a, bool6);
                        i5 |= 4;
                    } else {
                        if (t4 != 3) {
                            throw new y2.o(t4);
                        }
                        z7 = b4.x(c0343x0, 3);
                        i5 |= 8;
                    }
                }
                z5 = z7;
                i4 = i5;
                bool = bool5;
                bool2 = bool6;
            }
            boolean z8 = z4;
            b4.c(c0343x0);
            return new pw(i4, z8, bool, bool2, z5);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f30593b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            pw value = (pw) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f30593b;
            B2.d b4 = encoder.b(c0343x0);
            pw.a(value, b4, c0343x0);
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
            return a.f30592a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ pw(int i4, boolean z4, Boolean bool, Boolean bool2, boolean z5) {
        if (15 != (i4 & 15)) {
            AbstractC0341w0.a(i4, 15, a.f30592a.getDescriptor());
        }
        this.f30588a = z4;
        this.f30589b = bool;
        this.f30590c = bool2;
        this.f30591d = z5;
    }

    @Nullable
    public final Boolean a() {
        return this.f30589b;
    }

    public final boolean b() {
        return this.f30591d;
    }

    public final boolean c() {
        return this.f30588a;
    }

    @Nullable
    public final Boolean d() {
        return this.f30590c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw)) {
            return false;
        }
        pw pwVar = (pw) obj;
        return this.f30588a == pwVar.f30588a && Intrinsics.areEqual(this.f30589b, pwVar.f30589b) && Intrinsics.areEqual(this.f30590c, pwVar.f30590c) && this.f30591d == pwVar.f30591d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f30588a) * 31;
        Boolean bool = this.f30589b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f30590c;
        return Boolean.hashCode(this.f30591d) + ((hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelConsentsData(hasLocationConsent=" + this.f30588a + ", ageRestrictedUser=" + this.f30589b + ", hasUserConsent=" + this.f30590c + ", hasCmpValue=" + this.f30591d + ")";
    }

    public pw(boolean z4, @Nullable Boolean bool, @Nullable Boolean bool2, boolean z5) {
        this.f30588a = z4;
        this.f30589b = bool;
        this.f30590c = bool2;
        this.f30591d = z5;
    }

    public static final /* synthetic */ void a(pw pwVar, B2.d dVar, C0343x0 c0343x0) {
        dVar.k(c0343x0, 0, pwVar.f30588a);
        C0313i c0313i = C0313i.f292a;
        dVar.x(c0343x0, 1, c0313i, pwVar.f30589b);
        dVar.x(c0343x0, 2, c0313i, pwVar.f30590c);
        dVar.k(c0343x0, 3, pwVar.f30591d);
    }
}
