package com.ironsource;

import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.b9;
import com.ironsource.rh;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class vh {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private rh f20058a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private View f20059b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private View f20060c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private View f20061d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private View f20062e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private View f20063f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private View f20064g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private View f20065h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private a f20066i;

    @Metadata
    public interface a {
        void a(@NotNull uv uvVar);

        void a(@NotNull b bVar);
    }

    @Metadata
    public enum b {
        Title(b9.h.f15436D0),
        Advertiser(b9.h.f15440F0),
        Body(b9.h.f15438E0),
        Cta(b9.h.f15442G0),
        Icon(b9.h.f15444H0),
        Container("container"),
        PrivacyIcon(b9.h.f15448J0);


        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f20075a;

        b(String str) {
            this.f20075a = str;
        }

        @NotNull
        public final String b() {
            return this.f20075a;
        }
    }

    @Metadata
    public static final class c implements rh.a {
        c() {
        }

        @Override // com.ironsource.rh.a
        public void a(@NotNull uv viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            a n4 = vh.this.n();
            if (n4 != null) {
                n4.a(viewVisibilityParams);
            }
        }
    }

    public vh(@NotNull rh containerView, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4, @Nullable View view5, @Nullable View view6, @NotNull View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        this.f20058a = containerView;
        this.f20059b = view;
        this.f20060c = view2;
        this.f20061d = view3;
        this.f20062e = view4;
        this.f20063f = view5;
        this.f20064g = view6;
        this.f20065h = privacyIconView;
        r();
        s();
    }

    private final void r() {
        a(this, this.f20059b, b.Title);
        a(this, this.f20060c, b.Advertiser);
        a(this, this.f20062e, b.Body);
        a(this, this.f20064g, b.Cta);
        a(this, this.f20061d, b.Icon);
        a(this, this.f20058a, b.Container);
        a(this, this.f20065h, b.PrivacyIcon);
    }

    private final void s() {
        this.f20058a.setListener$mediationsdk_release(new c());
    }

    @NotNull
    public final rh a() {
        return this.f20058a;
    }

    @Nullable
    public final View c() {
        return this.f20060c;
    }

    @Nullable
    public final View d() {
        return this.f20061d;
    }

    @Nullable
    public final View e() {
        return this.f20062e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh)) {
            return false;
        }
        vh vhVar = (vh) obj;
        return Intrinsics.areEqual(this.f20058a, vhVar.f20058a) && Intrinsics.areEqual(this.f20059b, vhVar.f20059b) && Intrinsics.areEqual(this.f20060c, vhVar.f20060c) && Intrinsics.areEqual(this.f20061d, vhVar.f20061d) && Intrinsics.areEqual(this.f20062e, vhVar.f20062e) && Intrinsics.areEqual(this.f20063f, vhVar.f20063f) && Intrinsics.areEqual(this.f20064g, vhVar.f20064g) && Intrinsics.areEqual(this.f20065h, vhVar.f20065h);
    }

    @Nullable
    public final View f() {
        return this.f20063f;
    }

    @Nullable
    public final View g() {
        return this.f20064g;
    }

    @NotNull
    public final View h() {
        return this.f20065h;
    }

    public int hashCode() {
        int hashCode = this.f20058a.hashCode() * 31;
        View view = this.f20059b;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f20060c;
        int hashCode3 = (hashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.f20061d;
        int hashCode4 = (hashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.f20062e;
        int hashCode5 = (hashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f20063f;
        int hashCode6 = (hashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.f20064g;
        return ((hashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31) + this.f20065h.hashCode();
    }

    @Nullable
    public final View i() {
        return this.f20060c;
    }

    @Nullable
    public final View j() {
        return this.f20062e;
    }

    @NotNull
    public final rh k() {
        return this.f20058a;
    }

    @Nullable
    public final View l() {
        return this.f20064g;
    }

    @Nullable
    public final View m() {
        return this.f20061d;
    }

    @Nullable
    public final a n() {
        return this.f20066i;
    }

    @Nullable
    public final View o() {
        return this.f20063f;
    }

    @NotNull
    public final View p() {
        return this.f20065h;
    }

    @Nullable
    public final View q() {
        return this.f20059b;
    }

    @NotNull
    public final JSONObject t() {
        JSONObject put = new JSONObject().put(b9.h.f15436D0, this.f20059b != null).put(b9.h.f15440F0, this.f20060c != null).put(b9.h.f15438E0, this.f20062e != null).put(b9.h.f15442G0, this.f20064g != null).put(b9.h.f15446I0, this.f20063f != null).put(b9.h.f15444H0, this.f20061d != null);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return put;
    }

    @NotNull
    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.f20058a + ", titleView=" + this.f20059b + ", advertiserView=" + this.f20060c + ", iconView=" + this.f20061d + ", bodyView=" + this.f20062e + ", mediaView=" + this.f20063f + ", ctaView=" + this.f20064g + ", privacyIconView=" + this.f20065h + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ vh(rh rhVar, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(rhVar, view, view2, view3, view4, view5, r9, r10);
        View view8;
        View view9;
        view = (i4 & 2) != 0 ? null : view;
        view2 = (i4 & 4) != 0 ? null : view2;
        view3 = (i4 & 8) != 0 ? null : view3;
        view4 = (i4 & 16) != 0 ? null : view4;
        view5 = (i4 & 32) != 0 ? null : view5;
        if ((i4 & 64) != 0) {
            view8 = view7;
            view9 = null;
        } else {
            view8 = view7;
            view9 = view6;
        }
    }

    @NotNull
    public final vh a(@NotNull rh containerView, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4, @Nullable View view5, @Nullable View view6, @NotNull View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        return new vh(containerView, view, view2, view3, view4, view5, view6, privacyIconView);
    }

    @Nullable
    public final View b() {
        return this.f20059b;
    }

    public final void c(@Nullable View view) {
        this.f20064g = view;
    }

    public final void d(@Nullable View view) {
        this.f20061d = view;
    }

    public final void e(@Nullable View view) {
        this.f20063f = view;
    }

    public final void f(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.f20065h = view;
    }

    public final void g(@Nullable View view) {
        this.f20059b = view;
    }

    public static /* synthetic */ vh a(vh vhVar, rh rhVar, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            rhVar = vhVar.f20058a;
        }
        if ((i4 & 2) != 0) {
            view = vhVar.f20059b;
        }
        if ((i4 & 4) != 0) {
            view2 = vhVar.f20060c;
        }
        if ((i4 & 8) != 0) {
            view3 = vhVar.f20061d;
        }
        if ((i4 & 16) != 0) {
            view4 = vhVar.f20062e;
        }
        if ((i4 & 32) != 0) {
            view5 = vhVar.f20063f;
        }
        if ((i4 & 64) != 0) {
            view6 = vhVar.f20064g;
        }
        if ((i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            view7 = vhVar.f20065h;
        }
        View view8 = view6;
        View view9 = view7;
        View view10 = view4;
        View view11 = view5;
        return vhVar.a(rhVar, view, view2, view3, view10, view11, view8, view9);
    }

    public final void b(@Nullable View view) {
        this.f20062e = view;
    }

    public final void a(@Nullable View view) {
        this.f20060c = view;
    }

    public final void a(@NotNull rh rhVar) {
        Intrinsics.checkNotNullParameter(rhVar, "<set-?>");
        this.f20058a = rhVar;
    }

    public final void a(@Nullable a aVar) {
        this.f20066i = aVar;
    }

    private static final void a(final vh vhVar, View view, final b bVar) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ironsource.O3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    vh.a(vh.this, bVar, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vh this$0, b viewName, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewName, "$viewName");
        a aVar = this$0.f20066i;
        if (aVar != null) {
            aVar.a(viewName);
        }
    }
}
