package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ba implements da, q4 {
    public final d0 a;
    public final ij b;
    public final hb c;
    public final n4 d;
    public final q4 e;
    public final qa f;
    public final ca g;
    public final ge h;
    public final r0 i;
    public final sg j;
    public boolean k;
    public Boolean l;
    public boolean m;

    public ba(d0 adUnit, ij urlResolver, hb intentResolver, n4 clickRequest, q4 clickTracking, qa mediaType, ca impressionCallback, ge openMeasurementImpressionCallback, r0 adUnitRendererImpressionCallback, sg sdkConfig) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(urlResolver, "urlResolver");
        Intrinsics.checkNotNullParameter(intentResolver, "intentResolver");
        Intrinsics.checkNotNullParameter(clickRequest, "clickRequest");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(impressionCallback, "impressionCallback");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.a = adUnit;
        this.b = urlResolver;
        this.c = intentResolver;
        this.d = clickRequest;
        this.e = clickTracking;
        this.f = mediaType;
        this.g = impressionCallback;
        this.h = openMeasurementImpressionCallback;
        this.i = adUnitRendererImpressionCallback;
        this.j = sdkConfig;
    }

    @Override // com.chartboost.sdk.impl.da
    public void a(String str, CBError.Click error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.i.a(this.a.m(), str, error);
    }

    @Override // com.chartboost.sdk.impl.da
    public void b(o3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        a(cbUrl.b(), cbUrl.a(), true);
    }

    @Override // com.chartboost.sdk.impl.da
    public void c(o3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        c(cbUrl.b());
    }

    @Override // com.chartboost.sdk.impl.da
    public void e(boolean z) {
        this.k = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ba(d0 d0Var, ij ijVar, hb hbVar, n4 n4Var, q4 q4Var, qa qaVar, ca caVar, ge geVar, r0 r0Var, sg sgVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, ijVar, hbVar, n4Var, q4Var, qaVar, caVar, geVar, r0Var, r11);
        sg sgVar2;
        if ((i & 512) != 0) {
            Object obj = f4.b.a().b().get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            sgVar2 = (sg) obj;
        } else {
            sgVar2 = sgVar;
        }
    }

    public static final class b implements o4 {
        @Override // com.chartboost.sdk.impl.o4
        public void a(String str) {
            xb.b("onClickRequestFailure " + str, (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.o4
        public void a(JSONObject jSONObject) {
            String str;
            if (jSONObject == null || (str = jSONObject.toString()) == null) {
                str = "";
            }
            xb.b("onClickRequestSuccess " + str, (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void d() {
        this.i.b(this.a.m());
        if (this.m) {
            this.g.D();
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void b(String location, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.d.a(new b(), new l4(location, this.a.a(), this.a.A(), this.a.g(), this.a.i(), f, f2, this.f, this.l));
    }

    @Override // com.chartboost.sdk.impl.q4
    public void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.e.b(message);
    }

    public static final class c extends Lambda implements Function1 {
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.c = str;
        }

        public final void a(ca notify) {
            Intrinsics.checkNotNullParameter(notify, "$this$notify");
            notify.d();
            ba.this.a("Url impression callback success: " + this.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ca) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class a extends Lambda implements Function1 {
        public final /* synthetic */ String b;
        public final /* synthetic */ CBError.Click c;
        public final /* synthetic */ ba d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, CBError.Click click, ba baVar) {
            super(1);
            this.b = str;
            this.c = click;
            this.d = baVar;
        }

        public final void a(ca notify) {
            Intrinsics.checkNotNullParameter(notify, "$this$notify");
            notify.a(this.b, this.c);
            this.d.b("Impression click callback for: " + this.b + " failed with error: " + this.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ca) obj);
            return Unit.INSTANCE;
        }
    }

    public final void d(String str) {
        this.b.a(str, this.a.h(), this.e, false);
    }

    public final void c(String str) {
        a(this.g, str, CBError.Click.LOAD_NOT_FINISHED);
    }

    public final void a(ca caVar, String str, CBError.Click click) {
        a(caVar, new a(str, click, this));
    }

    public boolean a() {
        return this.k;
    }

    public final void a(String str, Boolean bool, boolean z) {
        Unit unit;
        this.h.b();
        if (bool != null) {
            this.m = bool.booleanValue();
        }
        CBError.Click a2 = this.b.a(str, this.a.h(), this.e, z);
        if (a2 != null) {
            a(this.g, str, a2);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            a(this.g, str);
        }
    }

    public final void a(ca caVar, Function1 function1) {
        Unit unit;
        if (caVar != null) {
            caVar.a(false);
            function1.invoke(caVar);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.b("Impression callback is null", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public boolean a(String urlFromCreative, Boolean bool, ra impressionState) {
        Intrinsics.checkNotNullParameter(urlFromCreative, "urlFromCreative");
        Intrinsics.checkNotNullParameter(impressionState, "impressionState");
        if (bool != null) {
            this.m = bool.booleanValue();
        }
        if (impressionState != ra.e) {
            return false;
        }
        if (!this.j.A || StringsKt.isBlank(urlFromCreative)) {
            urlFromCreative = this.a.o();
        }
        String k = this.a.k();
        if (this.c.b(k)) {
            this.l = Boolean.TRUE;
            urlFromCreative = k;
        } else {
            this.l = Boolean.FALSE;
        }
        if (a()) {
            return false;
        }
        e(true);
        this.g.b(false);
        a(urlFromCreative, Boolean.valueOf(this.m), true);
        return true;
    }

    @Override // com.chartboost.sdk.impl.da
    public void a(o3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        d(cbUrl.b());
    }

    public final void a(ca caVar, String str) {
        a(caVar, new c(str));
    }

    @Override // com.chartboost.sdk.impl.q4
    public void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.e.a(message);
    }
}
