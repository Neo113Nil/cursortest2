package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.impl.w;
import com.chartboost.sdk.internal.Model.CBError;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class se implements w, q7 {
    public final c0 a;
    public final a7 b;
    public final le c;
    public final Function1 d;
    public final Function0 e;
    public final /* synthetic */ q7 f;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public static final a b = new a();

        public a() {
            super(1, JSONObject.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject invoke(String str) {
            return new JSONObject(str);
        }
    }

    public static final class b extends Lambda implements Function0 {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo4828invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public se(c0 adType, a7 downloader, le openRTBAdUnitParser, Function1 jsonFactory, Function0 androidVersion, q7 eventTracker) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(openRTBAdUnitParser, "openRTBAdUnitParser");
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.a = adType;
        this.b = downloader;
        this.c = openRTBAdUnitParser;
        this.d = jsonFactory;
        this.e = androidVersion;
        this.f = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.p7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi clearFromStorage(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.f.clearFromStorage(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi persist(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.f.persist(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public mi refresh(mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        return this.f.refresh(miVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public ci store(ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        return this.f.store(ciVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi track(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.f.track(piVar);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage */
    public void mo3218clearFromStorage(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f.mo3218clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist */
    public void mo3219persist(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f.mo3219persist(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh */
    public void mo3220refresh(mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f.mo3220refresh(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store */
    public void mo3221store(ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f.mo3221store(ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f.mo3222track(event);
    }

    public /* synthetic */ se(c0 c0Var, a7 a7Var, le leVar, Function1 function1, Function0 function0, q7 q7Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0Var, a7Var, leVar, (i & 8) != 0 ? a.b : function1, (i & 16) != 0 ? b.b : function0, q7Var);
    }

    public final void c(Function1 function1, tb tbVar) {
        function1.invoke(new ub(tbVar.a(), null, new CBError(CBError.Internal.UNSUPPORTED_OS_VERSION, "Unsupported Android version " + Build.VERSION.SDK_INT), 0L, 0L, 26, null));
    }

    public final void b(Function1 function1, tb tbVar) {
        si.a aVar = si.a.h;
        String d = tbVar.a().d();
        String c = tbVar.a().c();
        if (c == null) {
            c = "";
        }
        a(aVar, d, c, "Invalid bid response");
        function1.invoke(new ub(tbVar.a(), null, new CBError(CBError.Internal.UNEXPECTED_RESPONSE, "Error parsing response"), 0L, 0L, 26, null));
    }

    public final void a(a7 a7Var, d0 d0Var, v1 v1Var) {
        Map d = d0Var.d();
        AtomicInteger atomicInteger = new AtomicInteger();
        a7Var.c();
        a7Var.a(af.d, d, atomicInteger, v1Var, this.a.b());
    }

    public String a(JSONObject jSONObject, String str, String str2) {
        return w.a.a(this, jSONObject, str, str2);
    }

    public final boolean a(tb tbVar) {
        String c;
        return tbVar.a().d().length() > 0 && (c = tbVar.a().c()) != null && c.length() > 0;
    }

    @Override // com.chartboost.sdk.impl.w
    public void a(tb params, Function1 callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (((Number) this.e.mo4828invoke()).intValue() < 21) {
            c(callback, params);
            return;
        }
        if (!a(params)) {
            b(callback, params);
            return;
        }
        try {
            String c = params.a().c();
            a(params, this.c.a(this.a, c != null ? (JSONObject) this.d.invoke(c) : null), callback);
        } catch (JSONException e) {
            a(callback, params, e);
        }
    }

    public final void a(Function1 function1, tb tbVar) {
        si.a aVar = si.a.i;
        String d = tbVar.a().d();
        String c = tbVar.a().c();
        if (c == null) {
            c = "";
        }
        a(aVar, d, c, "ASSETS_DOWNLOAD_FAILURE");
        function1.invoke(new ub(tbVar.a(), null, new CBError(CBError.Internal.INVALID_RESPONSE, "Error parsing response"), 0L, 0L, 26, null));
    }

    public final void a(Function1 function1, tb tbVar, Exception exc) {
        si.a aVar = si.a.h;
        String d = tbVar.a().d();
        String c = tbVar.a().c();
        if (c == null) {
            c = "";
        }
        a(aVar, d, c, exc.toString());
        function1.invoke(new ub(tbVar.a(), null, new CBError(CBError.Internal.INVALID_RESPONSE, "Error parsing response"), 0L, 0L, 26, null));
    }

    public final void a(Function1 function1, tb tbVar, d0 d0Var) {
        function1.invoke(new ub(tbVar.a(), d0Var, null, 0L, 0L, 24, null));
    }

    public final void a(final tb tbVar, final d0 d0Var, final Function1 function1) {
        a(this.b, d0Var, new v1() { // from class: com.chartboost.sdk.impl.se$$ExternalSyntheticLambda0
            @Override // com.chartboost.sdk.impl.v1
            public final void a(boolean z) {
                se.a(se.this, function1, tbVar, d0Var, z);
            }
        });
    }

    public static final void a(se this$0, Function1 callback, tb loaderParams, d0 openRTBAdUnit, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(loaderParams, "$loaderParams");
        Intrinsics.checkNotNullParameter(openRTBAdUnit, "$openRTBAdUnit");
        if (z) {
            this$0.a(callback, loaderParams, openRTBAdUnit);
        } else {
            this$0.a(callback, loaderParams);
        }
    }

    public final void a(si siVar, String str, String str2, String str3) {
        track((pi) new s5(siVar, a(new JSONObject(), str3, str2), this.a.b(), str, null, null, 48, null));
    }
}
