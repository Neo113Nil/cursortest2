package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.b9;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class sh {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f19588a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f19589b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f19590c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f19591d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final Drawable f19592e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final WebView f19593f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final View f19594g;

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ji f19595a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final InterfaceC1434b3 f19596b;

        public a(@NotNull ji imageLoader, @NotNull InterfaceC1434b3 adViewManagement) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
            this.f19595a = imageLoader;
            this.f19596b = adViewManagement;
        }

        private final Result<Drawable> b(String str) {
            if (str == null) {
                return null;
            }
            return Result.a(this.f19595a.a(str));
        }

        @NotNull
        public final b a(@NotNull Context activityContext, @NotNull JSONObject json) {
            String str;
            String str2;
            String str3;
            String str4;
            String b4;
            String b5;
            String b6;
            String b7;
            Intrinsics.checkNotNullParameter(activityContext, "activityContext");
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject optJSONObject = json.optJSONObject(b9.h.f15436D0);
            if (optJSONObject != null) {
                b7 = th.b(optJSONObject, b9.h.f15450K0);
                str = b7;
            } else {
                str = null;
            }
            JSONObject optJSONObject2 = json.optJSONObject(b9.h.f15440F0);
            if (optJSONObject2 != null) {
                b6 = th.b(optJSONObject2, b9.h.f15450K0);
                str2 = b6;
            } else {
                str2 = null;
            }
            JSONObject optJSONObject3 = json.optJSONObject(b9.h.f15438E0);
            if (optJSONObject3 != null) {
                b5 = th.b(optJSONObject3, b9.h.f15450K0);
                str3 = b5;
            } else {
                str3 = null;
            }
            JSONObject optJSONObject4 = json.optJSONObject(b9.h.f15442G0);
            if (optJSONObject4 != null) {
                b4 = th.b(optJSONObject4, b9.h.f15450K0);
                str4 = b4;
            } else {
                str4 = null;
            }
            JSONObject optJSONObject5 = json.optJSONObject(b9.h.f15444H0);
            String b8 = optJSONObject5 != null ? th.b(optJSONObject5, "url") : null;
            JSONObject optJSONObject6 = json.optJSONObject(b9.h.f15446I0);
            String b9 = optJSONObject6 != null ? th.b(optJSONObject6, "adViewId") : null;
            JSONObject optJSONObject7 = json.optJSONObject(b9.h.f15448J0);
            return new b(new b.a(str, str2, str3, str4, b(b8), a(b9), vp.f20115a.a(activityContext, optJSONObject7 != null ? th.b(optJSONObject7, "url") : null, this.f19595a)));
        }

        private final Result<WebView> a(String str) {
            Object m243constructorimpl;
            if (str == null) {
                return null;
            }
            wh a4 = this.f19596b.a(str);
            WebView presentingView = a4 != null ? a4.getPresentingView() : null;
            if (presentingView == null) {
                Result.Companion companion = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(new Exception("missing adview for id: '" + str + '\'')));
            } else {
                m243constructorimpl = Result.m243constructorimpl(presentingView);
            }
            return Result.a(m243constructorimpl);
        }
    }

    @Metadata
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f19597a;

        @Metadata
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @Nullable
            private final String f19598a;

            /* renamed from: b, reason: collision with root package name */
            @Nullable
            private final String f19599b;

            /* renamed from: c, reason: collision with root package name */
            @Nullable
            private final String f19600c;

            /* renamed from: d, reason: collision with root package name */
            @Nullable
            private final String f19601d;

            /* renamed from: e, reason: collision with root package name */
            @Nullable
            private final Result<Drawable> f19602e;

            /* renamed from: f, reason: collision with root package name */
            @Nullable
            private final Result<WebView> f19603f;

            /* renamed from: g, reason: collision with root package name */
            @NotNull
            private final View f19604g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Result<? extends Drawable> result, @Nullable Result<? extends WebView> result2, @NotNull View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                this.f19598a = str;
                this.f19599b = str2;
                this.f19600c = str3;
                this.f19601d = str4;
                this.f19602e = result;
                this.f19603f = result2;
                this.f19604g = privacyIcon;
            }

            public static /* synthetic */ a a(a aVar, String str, String str2, String str3, String str4, Result result, Result result2, View view, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = aVar.f19598a;
                }
                if ((i4 & 2) != 0) {
                    str2 = aVar.f19599b;
                }
                if ((i4 & 4) != 0) {
                    str3 = aVar.f19600c;
                }
                if ((i4 & 8) != 0) {
                    str4 = aVar.f19601d;
                }
                if ((i4 & 16) != 0) {
                    result = aVar.f19602e;
                }
                if ((i4 & 32) != 0) {
                    result2 = aVar.f19603f;
                }
                if ((i4 & 64) != 0) {
                    view = aVar.f19604g;
                }
                Result result3 = result2;
                View view2 = view;
                Result result4 = result;
                String str5 = str3;
                return aVar.a(str, str2, str5, str4, result4, result3, view2);
            }

            @Nullable
            public final String b() {
                return this.f19599b;
            }

            @Nullable
            public final String c() {
                return this.f19600c;
            }

            @Nullable
            public final String d() {
                return this.f19601d;
            }

            @Nullable
            public final Result<Drawable> e() {
                return this.f19602e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f19598a, aVar.f19598a) && Intrinsics.areEqual(this.f19599b, aVar.f19599b) && Intrinsics.areEqual(this.f19600c, aVar.f19600c) && Intrinsics.areEqual(this.f19601d, aVar.f19601d) && Intrinsics.areEqual(this.f19602e, aVar.f19602e) && Intrinsics.areEqual(this.f19603f, aVar.f19603f) && Intrinsics.areEqual(this.f19604g, aVar.f19604g);
            }

            @Nullable
            public final Result<WebView> f() {
                return this.f19603f;
            }

            @NotNull
            public final View g() {
                return this.f19604g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final sh h() {
                Drawable drawable;
                String str = this.f19598a;
                String str2 = this.f19599b;
                String str3 = this.f19600c;
                String str4 = this.f19601d;
                Result<Drawable> result = this.f19602e;
                if (result != null) {
                    Object h4 = result.h();
                    if (Result.m244isFailureimpl(h4)) {
                        h4 = null;
                    }
                    drawable = (Drawable) h4;
                } else {
                    drawable = null;
                }
                Result<WebView> result2 = this.f19603f;
                if (result2 != null) {
                    Object h5 = result2.h();
                    r6 = Result.m244isFailureimpl(h5) ? null : h5;
                }
                return new sh(str, str2, str3, str4, drawable, r6, this.f19604g);
            }

            public int hashCode() {
                String str = this.f19598a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f19599b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f19600c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f19601d;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Result<Drawable> result = this.f19602e;
                int e4 = (hashCode4 + (result == null ? 0 : Result.e(result.h()))) * 31;
                Result<WebView> result2 = this.f19603f;
                return ((e4 + (result2 != null ? Result.e(result2.h()) : 0)) * 31) + this.f19604g.hashCode();
            }

            @Nullable
            public final String i() {
                return this.f19599b;
            }

            @Nullable
            public final String j() {
                return this.f19600c;
            }

            @Nullable
            public final String k() {
                return this.f19601d;
            }

            @Nullable
            public final Result<Drawable> l() {
                return this.f19602e;
            }

            @Nullable
            public final Result<WebView> m() {
                return this.f19603f;
            }

            @NotNull
            public final View n() {
                return this.f19604g;
            }

            @Nullable
            public final String o() {
                return this.f19598a;
            }

            @NotNull
            public String toString() {
                return "Data(title=" + this.f19598a + ", advertiser=" + this.f19599b + ", body=" + this.f19600c + ", cta=" + this.f19601d + ", icon=" + this.f19602e + ", media=" + this.f19603f + ", privacyIcon=" + this.f19604g + ')';
            }

            @NotNull
            public final a a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Result<? extends Drawable> result, @Nullable Result<? extends WebView> result2, @NotNull View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                return new a(str, str2, str3, str4, result, result2, privacyIcon);
            }

            @Nullable
            public final String a() {
                return this.f19598a;
            }
        }

        public b(@NotNull a data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f19597a = data;
        }

        @NotNull
        public final a a() {
            return this.f19597a;
        }

        @NotNull
        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            if (this.f19597a.o() != null) {
                a(jSONObject, b9.h.f15436D0);
            }
            if (this.f19597a.i() != null) {
                a(jSONObject, b9.h.f15440F0);
            }
            if (this.f19597a.j() != null) {
                a(jSONObject, b9.h.f15438E0);
            }
            if (this.f19597a.k() != null) {
                a(jSONObject, b9.h.f15442G0);
            }
            Result<Drawable> l4 = this.f19597a.l();
            if (l4 != null) {
                a(jSONObject, b9.h.f15444H0, l4.h());
            }
            Result<WebView> m4 = this.f19597a.m();
            if (m4 != null) {
                a(jSONObject, b9.h.f15446I0, m4.h());
            }
            return jSONObject;
        }

        private static final void a(JSONObject jSONObject, String str) {
            jSONObject.put(str, new JSONObject().put("success", true));
        }

        private static final <T> void a(JSONObject jSONObject, String str, Object obj) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", Result.f(obj));
            Throwable d4 = Result.d(obj);
            if (d4 != null) {
                String message = d4.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObject2.put("reason", message);
            }
            Unit unit = Unit.f41027a;
            jSONObject.put(str, jSONObject2);
        }
    }

    public sh(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Drawable drawable, @Nullable WebView webView, @NotNull View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        this.f19588a = str;
        this.f19589b = str2;
        this.f19590c = str3;
        this.f19591d = str4;
        this.f19592e = drawable;
        this.f19593f = webView;
        this.f19594g = privacyIcon;
    }

    public static /* synthetic */ sh a(sh shVar, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = shVar.f19588a;
        }
        if ((i4 & 2) != 0) {
            str2 = shVar.f19589b;
        }
        if ((i4 & 4) != 0) {
            str3 = shVar.f19590c;
        }
        if ((i4 & 8) != 0) {
            str4 = shVar.f19591d;
        }
        if ((i4 & 16) != 0) {
            drawable = shVar.f19592e;
        }
        if ((i4 & 32) != 0) {
            webView = shVar.f19593f;
        }
        if ((i4 & 64) != 0) {
            view = shVar.f19594g;
        }
        WebView webView2 = webView;
        View view2 = view;
        Drawable drawable2 = drawable;
        String str5 = str3;
        return shVar.a(str, str2, str5, str4, drawable2, webView2, view2);
    }

    @Nullable
    public final String b() {
        return this.f19589b;
    }

    @Nullable
    public final String c() {
        return this.f19590c;
    }

    @Nullable
    public final String d() {
        return this.f19591d;
    }

    @Nullable
    public final Drawable e() {
        return this.f19592e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh)) {
            return false;
        }
        sh shVar = (sh) obj;
        return Intrinsics.areEqual(this.f19588a, shVar.f19588a) && Intrinsics.areEqual(this.f19589b, shVar.f19589b) && Intrinsics.areEqual(this.f19590c, shVar.f19590c) && Intrinsics.areEqual(this.f19591d, shVar.f19591d) && Intrinsics.areEqual(this.f19592e, shVar.f19592e) && Intrinsics.areEqual(this.f19593f, shVar.f19593f) && Intrinsics.areEqual(this.f19594g, shVar.f19594g);
    }

    @Nullable
    public final WebView f() {
        return this.f19593f;
    }

    @NotNull
    public final View g() {
        return this.f19594g;
    }

    @Nullable
    public final String h() {
        return this.f19589b;
    }

    public int hashCode() {
        String str = this.f19588a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19589b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19590c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19591d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.f19592e;
        int hashCode5 = (hashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.f19593f;
        return ((hashCode5 + (webView != null ? webView.hashCode() : 0)) * 31) + this.f19594g.hashCode();
    }

    @Nullable
    public final String i() {
        return this.f19590c;
    }

    @Nullable
    public final String j() {
        return this.f19591d;
    }

    @Nullable
    public final Drawable k() {
        return this.f19592e;
    }

    @Nullable
    public final WebView l() {
        return this.f19593f;
    }

    @NotNull
    public final View m() {
        return this.f19594g;
    }

    @Nullable
    public final String n() {
        return this.f19588a;
    }

    @NotNull
    public String toString() {
        return "ISNNativeAdData(title=" + this.f19588a + ", advertiser=" + this.f19589b + ", body=" + this.f19590c + ", cta=" + this.f19591d + ", icon=" + this.f19592e + ", mediaView=" + this.f19593f + ", privacyIcon=" + this.f19594g + ')';
    }

    @NotNull
    public final sh a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Drawable drawable, @Nullable WebView webView, @NotNull View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        return new sh(str, str2, str3, str4, drawable, webView, privacyIcon);
    }

    @Nullable
    public final String a() {
        return this.f19588a;
    }
}
