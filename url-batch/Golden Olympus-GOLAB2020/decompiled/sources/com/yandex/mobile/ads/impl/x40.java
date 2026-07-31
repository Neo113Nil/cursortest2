package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.impl.C3139z9;
import java.util.List;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3333i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class x40 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f34373a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1834bj f34374b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2110n9 f34375c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final zc1 f34376d;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.mediation.bidding.EncodedHeaderBiddingDataLoader", f = "EncodedHeaderBiddingDataLoader.kt", l = {C3139z9.f40333J, IronSourceConstants.APP_ENTER_BACKGROUND}, m = "loadEncodedBiddingData")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        x40 f34377b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34378c;

        /* renamed from: e, reason: collision with root package name */
        int f34380e;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34378c = obj;
            this.f34380e |= Integer.MIN_VALUE;
            return x40.this.a(null, this);
        }
    }

    public x40(@NotNull C2286v2 adConfiguration, @NotNull C2144ok biddingSettings, @NotNull C1834bj base64Encoder, @NotNull C2110n9 adUnitIdHeaderBiddingSettingsProvider, @NotNull qx0 mediatedAdapterReporter, @NotNull zc1 networksHeaderBiddingDataLoader) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(biddingSettings, "biddingSettings");
        Intrinsics.checkNotNullParameter(base64Encoder, "base64Encoder");
        Intrinsics.checkNotNullParameter(adUnitIdHeaderBiddingSettingsProvider, "adUnitIdHeaderBiddingSettingsProvider");
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        Intrinsics.checkNotNullParameter(networksHeaderBiddingDataLoader, "networksHeaderBiddingDataLoader");
        this.f34373a = adConfiguration;
        this.f34374b = base64Encoder;
        this.f34375c = adUnitIdHeaderBiddingSettingsProvider;
        this.f34376d = networksHeaderBiddingDataLoader;
    }

    private final String a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.ironsource.ge.f16516z1, jSONArray);
            C1834bj c1834bj = this.f34374b;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            c1834bj.getClass();
            return C1834bj.a(jSONObject2);
        } catch (JSONException unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Context context, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        x40 x40Var;
        x40 x40Var2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f34380e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f34380e = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f34378c;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f34380e;
                if (i4 == 0) {
                    if (i4 == 1) {
                        x40Var2 = aVar.f34377b;
                        ResultKt.a(obj);
                        return x40Var2.a((JSONArray) obj);
                    }
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x40Var = aVar.f34377b;
                    ResultKt.a(obj);
                    return x40Var.a((JSONArray) obj);
                }
                ResultKt.a(obj);
                C2063l9 a4 = this.f34375c.a(this.f34373a.c());
                if (a4 == null) {
                    return null;
                }
                List<xy0> f5 = a4.f();
                if (this.f34373a.b() == gs.f26280d) {
                    vy1 q4 = this.f34373a.q();
                    if (q4 != null) {
                        zc1 zc1Var = this.f34376d;
                        aVar.f34377b = this;
                        aVar.f34380e = 1;
                        zc1Var.getClass();
                        obj = AbstractC3333i.g(o2.Z.c().p(), new yc1(zc1Var, context, q4, f5, null), aVar);
                        if (obj != f4) {
                            x40Var2 = this;
                            return x40Var2.a((JSONArray) obj);
                        }
                    } else {
                        ap0.b(new Object[0]);
                        return null;
                    }
                } else {
                    zc1 zc1Var2 = this.f34376d;
                    aVar.f34377b = this;
                    aVar.f34380e = 2;
                    zc1Var2.getClass();
                    obj = AbstractC3333i.g(o2.Z.c().p(), new yc1(zc1Var2, context, null, f5, null), aVar);
                    if (obj != f4) {
                        x40Var = this;
                        return x40Var.a((JSONArray) obj);
                    }
                }
                return f4;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f34378c;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f34380e;
        if (i4 == 0) {
        }
    }
}
