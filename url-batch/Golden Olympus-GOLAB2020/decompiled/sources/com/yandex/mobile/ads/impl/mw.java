package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0343x0;
import C2.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class mw {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29283a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f29284b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f29285c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f29286d;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f29287a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f29288b;

        static {
            a aVar = new a();
            f29287a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelAppData", aVar, 4);
            c0343x0.l("app_id", false);
            c0343x0.l("app_version", false);
            c0343x0.l("system", false);
            c0343x0.l("api_level", false);
            f29288b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            C2.M0 m02 = C2.M0.f224a;
            return new InterfaceC3527b[]{m02, m02, m02, m02};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            String str;
            String str2;
            String str3;
            String str4;
            int i4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f29288b;
            B2.c b4 = decoder.b(c0343x0);
            if (b4.v()) {
                str = b4.h(c0343x0, 0);
                String h4 = b4.h(c0343x0, 1);
                String h5 = b4.h(c0343x0, 2);
                str2 = b4.h(c0343x0, 3);
                str3 = h5;
                str4 = h4;
                i4 = 15;
            } else {
                str = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                boolean z4 = true;
                int i5 = 0;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else if (t4 == 0) {
                        str = b4.h(c0343x0, 0);
                        i5 |= 1;
                    } else if (t4 == 1) {
                        str7 = b4.h(c0343x0, 1);
                        i5 |= 2;
                    } else if (t4 == 2) {
                        str6 = b4.h(c0343x0, 2);
                        i5 |= 4;
                    } else {
                        if (t4 != 3) {
                            throw new y2.o(t4);
                        }
                        str5 = b4.h(c0343x0, 3);
                        i5 |= 8;
                    }
                }
                str2 = str5;
                str3 = str6;
                str4 = str7;
                i4 = i5;
            }
            String str8 = str;
            b4.c(c0343x0);
            return new mw(i4, str8, str4, str3, str2);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f29288b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            mw value = (mw) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f29288b;
            B2.d b4 = encoder.b(c0343x0);
            mw.a(value, b4, c0343x0);
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
            return a.f29287a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ mw(int i4, String str, String str2, String str3, String str4) {
        if (15 != (i4 & 15)) {
            AbstractC0341w0.a(i4, 15, a.f29287a.getDescriptor());
        }
        this.f29283a = str;
        this.f29284b = str2;
        this.f29285c = str3;
        this.f29286d = str4;
    }

    @NotNull
    public final String a() {
        return this.f29286d;
    }

    @NotNull
    public final String b() {
        return this.f29283a;
    }

    @NotNull
    public final String c() {
        return this.f29284b;
    }

    @NotNull
    public final String d() {
        return this.f29285c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw)) {
            return false;
        }
        mw mwVar = (mw) obj;
        return Intrinsics.areEqual(this.f29283a, mwVar.f29283a) && Intrinsics.areEqual(this.f29284b, mwVar.f29284b) && Intrinsics.areEqual(this.f29285c, mwVar.f29285c) && Intrinsics.areEqual(this.f29286d, mwVar.f29286d);
    }

    public final int hashCode() {
        return this.f29286d.hashCode() + C1842c3.a(this.f29285c, C1842c3.a(this.f29284b, this.f29283a.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelAppData(appId=" + this.f29283a + ", appVersion=" + this.f29284b + ", system=" + this.f29285c + ", androidApiLevel=" + this.f29286d + ")";
    }

    public mw(@NotNull String appId, @NotNull String appVersion, @NotNull String system, @NotNull String androidApiLevel) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(system, "system");
        Intrinsics.checkNotNullParameter(androidApiLevel, "androidApiLevel");
        this.f29283a = appId;
        this.f29284b = appVersion;
        this.f29285c = system;
        this.f29286d = androidApiLevel;
    }

    public static final /* synthetic */ void a(mw mwVar, B2.d dVar, C0343x0 c0343x0) {
        dVar.n(c0343x0, 0, mwVar.f29283a);
        dVar.n(c0343x0, 1, mwVar.f29284b);
        dVar.n(c0343x0, 2, mwVar.f29285c);
        dVar.n(c0343x0, 3, mwVar.f29286d);
    }
}
