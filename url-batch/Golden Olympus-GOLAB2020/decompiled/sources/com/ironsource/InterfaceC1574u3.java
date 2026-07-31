package com.ironsource;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.b9;
import com.ironsource.fh;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1574u3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f19862a = b.f19878a;

    @Metadata
    /* renamed from: com.ironsource.u3$a */
    public interface a extends InterfaceC1574u3 {

        @Metadata
        /* renamed from: com.ironsource.u3$a$a, reason: collision with other inner class name */
        public static final class C0165a implements a {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f19863b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f19864c;

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            private final fh.e f19865d;

            /* renamed from: e, reason: collision with root package name */
            @NotNull
            private final String f19866e;

            /* renamed from: f, reason: collision with root package name */
            @NotNull
            private final String f19867f;

            /* renamed from: g, reason: collision with root package name */
            @NotNull
            private final C0166a f19868g;

            /* renamed from: h, reason: collision with root package name */
            private final int f19869h;

            /* renamed from: i, reason: collision with root package name */
            private final int f19870i;

            @Metadata
            /* renamed from: com.ironsource.u3$a$a$a, reason: collision with other inner class name */
            public static final class C0166a {

                /* renamed from: a, reason: collision with root package name */
                private final int f19871a;

                /* renamed from: b, reason: collision with root package name */
                private final int f19872b;

                public C0166a(int i4, int i5) {
                    this.f19871a = i4;
                    this.f19872b = i5;
                }

                public final int a() {
                    return this.f19871a;
                }

                public final int b() {
                    return this.f19872b;
                }

                public final int c() {
                    return this.f19871a;
                }

                public final int d() {
                    return this.f19872b;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0166a)) {
                        return false;
                    }
                    C0166a c0166a = (C0166a) obj;
                    return this.f19871a == c0166a.f19871a && this.f19872b == c0166a.f19872b;
                }

                public int hashCode() {
                    return (Integer.hashCode(this.f19871a) * 31) + Integer.hashCode(this.f19872b);
                }

                @NotNull
                public String toString() {
                    return "Coordinates(x=" + this.f19871a + ", y=" + this.f19872b + ')';
                }

                @NotNull
                public final C0166a a(int i4, int i5) {
                    return new C0166a(i4, i5);
                }

                public static /* synthetic */ C0166a a(C0166a c0166a, int i4, int i5, int i6, Object obj) {
                    if ((i6 & 1) != 0) {
                        i4 = c0166a.f19871a;
                    }
                    if ((i6 & 2) != 0) {
                        i5 = c0166a.f19872b;
                    }
                    return c0166a.a(i4, i5);
                }
            }

            public C0165a(@NotNull String successCallback, @NotNull String failCallback, @NotNull fh.e productType, @NotNull String demandSourceName, @NotNull String url, @NotNull C0166a coordinates, int i4, int i5) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                this.f19863b = successCallback;
                this.f19864c = failCallback;
                this.f19865d = productType;
                this.f19866e = demandSourceName;
                this.f19867f = url;
                this.f19868g = coordinates;
                this.f19869h = i4;
                this.f19870i = i5;
            }

            public static /* synthetic */ C0165a a(C0165a c0165a, String str, String str2, fh.e eVar, String str3, String str4, C0166a c0166a, int i4, int i5, int i6, Object obj) {
                if ((i6 & 1) != 0) {
                    str = c0165a.f19863b;
                }
                if ((i6 & 2) != 0) {
                    str2 = c0165a.f19864c;
                }
                if ((i6 & 4) != 0) {
                    eVar = c0165a.f19865d;
                }
                if ((i6 & 8) != 0) {
                    str3 = c0165a.f19866e;
                }
                if ((i6 & 16) != 0) {
                    str4 = c0165a.f19867f;
                }
                if ((i6 & 32) != 0) {
                    c0166a = c0165a.f19868g;
                }
                if ((i6 & 64) != 0) {
                    i4 = c0165a.f19869h;
                }
                if ((i6 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    i5 = c0165a.f19870i;
                }
                int i7 = i4;
                int i8 = i5;
                String str5 = str4;
                C0166a c0166a2 = c0166a;
                return c0165a.a(str, str2, eVar, str3, str5, c0166a2, i7, i8);
            }

            @Override // com.ironsource.InterfaceC1574u3
            @NotNull
            public fh.e b() {
                return this.f19865d;
            }

            @Override // com.ironsource.InterfaceC1574u3
            @NotNull
            public String c() {
                return this.f19863b;
            }

            @Override // com.ironsource.InterfaceC1574u3
            @NotNull
            public String d() {
                return this.f19866e;
            }

            @NotNull
            public final String e() {
                return this.f19863b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0165a)) {
                    return false;
                }
                C0165a c0165a = (C0165a) obj;
                return Intrinsics.areEqual(this.f19863b, c0165a.f19863b) && Intrinsics.areEqual(this.f19864c, c0165a.f19864c) && this.f19865d == c0165a.f19865d && Intrinsics.areEqual(this.f19866e, c0165a.f19866e) && Intrinsics.areEqual(this.f19867f, c0165a.f19867f) && Intrinsics.areEqual(this.f19868g, c0165a.f19868g) && this.f19869h == c0165a.f19869h && this.f19870i == c0165a.f19870i;
            }

            @NotNull
            public final String f() {
                return this.f19864c;
            }

            @NotNull
            public final fh.e g() {
                return this.f19865d;
            }

            @Override // com.ironsource.InterfaceC1574u3.a
            @NotNull
            public String getUrl() {
                return this.f19867f;
            }

            @NotNull
            public final String h() {
                return this.f19866e;
            }

            public int hashCode() {
                return (((((((((((((this.f19863b.hashCode() * 31) + this.f19864c.hashCode()) * 31) + this.f19865d.hashCode()) * 31) + this.f19866e.hashCode()) * 31) + this.f19867f.hashCode()) * 31) + this.f19868g.hashCode()) * 31) + Integer.hashCode(this.f19869h)) * 31) + Integer.hashCode(this.f19870i);
            }

            @NotNull
            public final String i() {
                return this.f19867f;
            }

            @NotNull
            public final C0166a j() {
                return this.f19868g;
            }

            public final int k() {
                return this.f19869h;
            }

            public final int l() {
                return this.f19870i;
            }

            public final int m() {
                return this.f19869h;
            }

            @NotNull
            public final C0166a n() {
                return this.f19868g;
            }

            public final int o() {
                return this.f19870i;
            }

            @NotNull
            public String toString() {
                return "Click(successCallback=" + this.f19863b + ", failCallback=" + this.f19864c + ", productType=" + this.f19865d + ", demandSourceName=" + this.f19866e + ", url=" + this.f19867f + ", coordinates=" + this.f19868g + ", action=" + this.f19869h + ", metaState=" + this.f19870i + ')';
            }

            @NotNull
            public final C0165a a(@NotNull String successCallback, @NotNull String failCallback, @NotNull fh.e productType, @NotNull String demandSourceName, @NotNull String url, @NotNull C0166a coordinates, int i4, int i5) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                return new C0165a(successCallback, failCallback, productType, demandSourceName, url, coordinates, i4, i5);
            }

            @Override // com.ironsource.InterfaceC1574u3
            @NotNull
            public String a() {
                return this.f19864c;
            }
        }

        @Metadata
        /* renamed from: com.ironsource.u3$a$b */
        public static final class b implements a {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f19873b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f19874c;

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            private final fh.e f19875d;

            /* renamed from: e, reason: collision with root package name */
            @NotNull
            private final String f19876e;

            /* renamed from: f, reason: collision with root package name */
            @NotNull
            private final String f19877f;

            public b(@NotNull String successCallback, @NotNull String failCallback, @NotNull fh.e productType, @NotNull String demandSourceName, @NotNull String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                this.f19873b = successCallback;
                this.f19874c = failCallback;
                this.f19875d = productType;
                this.f19876e = demandSourceName;
                this.f19877f = url;
            }

            public static /* synthetic */ b a(b bVar, String str, String str2, fh.e eVar, String str3, String str4, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = bVar.f19873b;
                }
                if ((i4 & 2) != 0) {
                    str2 = bVar.f19874c;
                }
                if ((i4 & 4) != 0) {
                    eVar = bVar.f19875d;
                }
                if ((i4 & 8) != 0) {
                    str3 = bVar.f19876e;
                }
                if ((i4 & 16) != 0) {
                    str4 = bVar.f19877f;
                }
                String str5 = str4;
                fh.e eVar2 = eVar;
                return bVar.a(str, str2, eVar2, str3, str5);
            }

            @Override // com.ironsource.InterfaceC1574u3
            @NotNull
            public fh.e b() {
                return this.f19875d;
            }

            @Override // com.ironsource.InterfaceC1574u3
            @NotNull
            public String c() {
                return this.f19873b;
            }

            @Override // com.ironsource.InterfaceC1574u3
            @NotNull
            public String d() {
                return this.f19876e;
            }

            @NotNull
            public final String e() {
                return this.f19873b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f19873b, bVar.f19873b) && Intrinsics.areEqual(this.f19874c, bVar.f19874c) && this.f19875d == bVar.f19875d && Intrinsics.areEqual(this.f19876e, bVar.f19876e) && Intrinsics.areEqual(this.f19877f, bVar.f19877f);
            }

            @NotNull
            public final String f() {
                return this.f19874c;
            }

            @NotNull
            public final fh.e g() {
                return this.f19875d;
            }

            @Override // com.ironsource.InterfaceC1574u3.a
            @NotNull
            public String getUrl() {
                return this.f19877f;
            }

            @NotNull
            public final String h() {
                return this.f19876e;
            }

            public int hashCode() {
                return (((((((this.f19873b.hashCode() * 31) + this.f19874c.hashCode()) * 31) + this.f19875d.hashCode()) * 31) + this.f19876e.hashCode()) * 31) + this.f19877f.hashCode();
            }

            @NotNull
            public final String i() {
                return this.f19877f;
            }

            @NotNull
            public String toString() {
                return "Impression(successCallback=" + this.f19873b + ", failCallback=" + this.f19874c + ", productType=" + this.f19875d + ", demandSourceName=" + this.f19876e + ", url=" + this.f19877f + ')';
            }

            @NotNull
            public final b a(@NotNull String successCallback, @NotNull String failCallback, @NotNull fh.e productType, @NotNull String demandSourceName, @NotNull String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                return new b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.ironsource.InterfaceC1574u3
            @NotNull
            public String a() {
                return this.f19874c;
            }
        }

        @NotNull
        String getUrl();
    }

    @Metadata
    /* renamed from: com.ironsource.u3$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f19878a = new b();

        private b() {
        }

        private final a a(JSONObject jSONObject) {
            String successCallback = jSONObject.getString("success");
            String failCallback = jSONObject.getString(b9.f.f15370e);
            String demandSourceName = jSONObject.getString("demandSourceName");
            String string = jSONObject.getString(b9.h.f15490m);
            Intrinsics.checkNotNullExpressionValue(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            fh.e valueOf = fh.e.valueOf(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String url = jSONObject2.getString("url");
            String optString = jSONObject2.optString("type");
            if (Intrinsics.areEqual(optString, c9.f15700d)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(c9.f15702f);
                int i4 = jSONObject3.getInt(c9.f15703g);
                int i5 = jSONObject3.getInt(c9.f15704h);
                int optInt = jSONObject2.optInt("action", 0);
                int optInt2 = jSONObject2.optInt(c9.f15706j, 0);
                Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                return new a.C0165a(successCallback, failCallback, valueOf, demandSourceName, url, new a.C0165a.C0166a(i4, i5), optInt, optInt2);
            }
            if (!Intrinsics.areEqual(optString, c9.f15701e)) {
                throw new IllegalArgumentException("JSON does not contain valid type: " + jSONObject2.optString("type"));
            }
            Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
            Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
            Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
            Intrinsics.checkNotNullExpressionValue(url, "url");
            return new a.b(successCallback, failCallback, valueOf, demandSourceName, url);
        }

        @NotNull
        public final InterfaceC1574u3 a(@NotNull String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            String optString = jSONObject.optString("type", "none");
            if (Intrinsics.areEqual(optString, c9.f15699c)) {
                return a(jSONObject);
            }
            throw new IllegalArgumentException("unsupported message type: " + optString);
        }
    }

    @NotNull
    static InterfaceC1574u3 a(@NotNull String str) {
        return f19862a.a(str);
    }

    @NotNull
    String a();

    @NotNull
    fh.e b();

    @NotNull
    String c();

    @NotNull
    String d();
}
