package com.yandex.mobile.ads.impl;

import C2.C0343x0;
import C2.L;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.ironsource.b9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;
import z2.AbstractC3551a;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class jw {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f27871a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f27872b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f27873c;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f27874a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f27875b;

        static {
            a aVar = new a();
            f27874a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAlert", aVar, 3);
            c0343x0.l(b9.h.f15436D0, true);
            c0343x0.l(CrashHianalyticsData.MESSAGE, true);
            c0343x0.l("type", true);
            f27875b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            C2.M0 m02 = C2.M0.f224a;
            return new InterfaceC3527b[]{AbstractC3551a.t(m02), AbstractC3551a.t(m02), AbstractC3551a.t(m02)};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            String str;
            String str2;
            String str3;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f27875b;
            B2.c b4 = decoder.b(c0343x0);
            String str4 = null;
            if (b4.v()) {
                C2.M0 m02 = C2.M0.f224a;
                str = (String) b4.B(c0343x0, 0, m02, null);
                str2 = (String) b4.B(c0343x0, 1, m02, null);
                str3 = (String) b4.B(c0343x0, 2, m02, null);
                i4 = 7;
            } else {
                boolean z4 = true;
                int i5 = 0;
                String str5 = null;
                String str6 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else if (t4 == 0) {
                        str4 = (String) b4.B(c0343x0, 0, C2.M0.f224a, str4);
                        i5 |= 1;
                    } else if (t4 == 1) {
                        str5 = (String) b4.B(c0343x0, 1, C2.M0.f224a, str5);
                        i5 |= 2;
                    } else {
                        if (t4 != 2) {
                            throw new y2.o(t4);
                        }
                        str6 = (String) b4.B(c0343x0, 2, C2.M0.f224a, str6);
                        i5 |= 4;
                    }
                }
                i4 = i5;
                str = str4;
                str2 = str5;
                str3 = str6;
            }
            b4.c(c0343x0);
            return new jw(i4, str, str2, str3);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f27875b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            jw value = (jw) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f27875b;
            B2.d b4 = encoder.b(c0343x0);
            jw.a(value, b4, c0343x0);
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
            return a.f27874a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public jw() {
        this(0);
    }

    @Nullable
    public final String a() {
        return this.f27872b;
    }

    @Nullable
    public final String b() {
        return this.f27871a;
    }

    @Nullable
    public final String c() {
        return this.f27873c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw)) {
            return false;
        }
        jw jwVar = (jw) obj;
        return Intrinsics.areEqual(this.f27871a, jwVar.f27871a) && Intrinsics.areEqual(this.f27872b, jwVar.f27872b) && Intrinsics.areEqual(this.f27873c, jwVar.f27873c);
    }

    public final int hashCode() {
        String str = this.f27871a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f27872b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27873c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelAlert(title=" + this.f27871a + ", message=" + this.f27872b + ", type=" + this.f27873c + ")";
    }

    public /* synthetic */ jw(int i4) {
        this(null, null, null);
    }

    public static final /* synthetic */ void a(jw jwVar, B2.d dVar, C0343x0 c0343x0) {
        if (dVar.r(c0343x0, 0) || jwVar.f27871a != null) {
            dVar.x(c0343x0, 0, C2.M0.f224a, jwVar.f27871a);
        }
        if (dVar.r(c0343x0, 1) || jwVar.f27872b != null) {
            dVar.x(c0343x0, 1, C2.M0.f224a, jwVar.f27872b);
        }
        if (!dVar.r(c0343x0, 2) && jwVar.f27873c == null) {
            return;
        }
        dVar.x(c0343x0, 2, C2.M0.f224a, jwVar.f27873c);
    }

    public /* synthetic */ jw(int i4, String str, String str2, String str3) {
        if ((i4 & 1) == 0) {
            this.f27871a = null;
        } else {
            this.f27871a = str;
        }
        if ((i4 & 2) == 0) {
            this.f27872b = null;
        } else {
            this.f27872b = str2;
        }
        if ((i4 & 4) == 0) {
            this.f27873c = null;
        } else {
            this.f27873c = str3;
        }
    }

    public jw(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f27871a = str;
        this.f27872b = str2;
        this.f27873c = str3;
    }
}
