package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2306w {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f33842a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f33843b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final np1 f33844c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final f91 f33845d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final v61 f33846e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final e51 f33847f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final m71 f33848g;

    public C2306w(@NotNull C2286v2 adConfiguration, @NotNull C2360y7 adResponse, @NotNull po reporter, @NotNull f91 nativeOpenUrlHandlerCreator, @NotNull v61 nativeAdViewAdapter, @NotNull e51 nativeAdEventController, @Nullable m71 m71Var) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nativeOpenUrlHandlerCreator, "nativeOpenUrlHandlerCreator");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        this.f33842a = adConfiguration;
        this.f33843b = adResponse;
        this.f33844c = reporter;
        this.f33845d = nativeOpenUrlHandlerCreator;
        this.f33846e = nativeAdViewAdapter;
        this.f33847f = nativeAdEventController;
        this.f33848g = m71Var;
    }

    @Nullable
    public final InterfaceC2283v<? extends InterfaceC2237t> a(@NotNull Context context, @NotNull InterfaceC2237t action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        e91 a4 = this.f33845d.a(this.f33844c);
        String a5 = action.a();
        switch (a5.hashCode()) {
            case -1895850168:
                if (!a5.equals("social_action")) {
                    return null;
                }
                C2360y7<?> c2360y7 = this.f33843b;
                C2286v2 c2286v2 = this.f33842a;
                m71 m71Var = this.f33848g;
                c2286v2.p().f();
                wx1 wx1Var = new wx1(context, c2360y7, c2286v2, m71Var, C1900ed.a(context, zm2.f35627a, c2286v2.p().b()));
                C2286v2 c2286v22 = this.f33842a;
                C2360y7<?> c2360y72 = this.f33843b;
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                n41 n41Var = new n41(context, c2286v22, c2360y72, applicationContext);
                C2286v2 c2286v23 = this.f33842a;
                C2360y7<?> c2360y73 = this.f33843b;
                e51 e51Var = this.f33847f;
                v61 v61Var = this.f33846e;
                return new l02(wx1Var, new t02(context, c2286v23, c2360y73, n41Var, e51Var, v61Var, this.f33845d, new z02(new qi0(context, new r81(c2360y73), v61Var.e(), wc1.f34002c.a(context).b())), new dj1()));
            case -1422015845:
                if (a5.equals("adtune")) {
                    return new C1826bb(new C2158pb(this.f33847f, a4), new C1920f9(context, this.f33842a), this.f33844c);
                }
                return null;
            case -191501435:
                if (a5.equals("feedback")) {
                    return new fa0(new oa0(this.f33842a, this.f33844c, this.f33846e, this.f33847f, new na0()));
                }
                return null;
            case 94756344:
                if (a5.equals("close")) {
                    return new zo(this.f33844c, this.f33847f);
                }
                return null;
            case 629233382:
                if (!a5.equals("deeplink")) {
                    return null;
                }
                C2286v2 c2286v24 = this.f33842a;
                C2360y7<?> c2360y74 = this.f33843b;
                return new ky(new ny(c2286v24, c2360y74, this.f33844c, a4, this.f33847f, new vj1(c2286v24, c2360y74)));
            default:
                return null;
        }
    }
}
