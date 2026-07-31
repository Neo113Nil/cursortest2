package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.File;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public abstract class q3 implements q7 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public xe I;
    public cl J;
    public float K;
    public float L;
    public float M;
    public final x5 N;
    public final Context a;
    public final String b;
    public final jc c;
    public final String d;
    public final yi e;
    public final u8 f;
    public final i3 g;
    public final n3 h;
    public final Mediation i;
    public final String j;
    public final ge k;
    public final r0 l;
    public final xl m;
    public final q7 n;
    public final Function2 o;
    public String p;
    public long q;
    public long r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2 {
        public static final a b = new a();

        public a() {
            super(2, sa.class, "<init>", "<init>(Ljava/lang/String;Lcom/chartboost/sdk/tracking/EventTrackerExtensions;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sa invoke(String p0, q7 p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return new sa(p0, p1);
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ek.values().length];
            try {
                iArr[ek.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ek.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ek.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ek.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ek.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ek.g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ek.h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ek.i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ek.j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ek.k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ek.l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            a = iArr;
        }
    }

    public q3(Context context, String location, jc adUnitMType, String adTypeTraitsName, yi uiPoster, u8 fileCache, i3 i3Var, n3 n3Var, Mediation mediation, String str, ge openMeasurementImpressionCallback, r0 adUnitRendererCallback, xl webViewTimeoutInterface, q7 eventTracker, Function2 impressionTrackerRequestFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adUnitMType, "adUnitMType");
        Intrinsics.checkNotNullParameter(adTypeTraitsName, "adTypeTraitsName");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererCallback, "adUnitRendererCallback");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(impressionTrackerRequestFactory, "impressionTrackerRequestFactory");
        this.a = context;
        this.b = location;
        this.c = adUnitMType;
        this.d = adTypeTraitsName;
        this.e = uiPoster;
        this.f = fileCache;
        this.g = i3Var;
        this.h = n3Var;
        this.i = mediation;
        this.j = str;
        this.k = openMeasurementImpressionCallback;
        this.l = adUnitRendererCallback;
        this.m = webViewTimeoutInterface;
        this.n = eventTracker;
        this.o = impressionTrackerRequestFactory;
        this.G = true;
        this.H = -1;
        this.I = xe.e;
        this.N = new c();
    }

    public abstract cl b(Context context);

    @Override // com.chartboost.sdk.impl.p7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.n.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi clearFromStorage(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.n.clearFromStorage(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi persist(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.n.persist(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public mi refresh(mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        return this.n.refresh(miVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public ci store(ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        return this.n.store(ciVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi track(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.n.track(piVar);
    }

    public abstract void w();

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage */
    public void mo3218clearFromStorage(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.n.mo3218clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist */
    public void mo3219persist(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.n.mo3219persist(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh */
    public void mo3220refresh(mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.n.mo3220refresh(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store */
    public void mo3221store(ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.n.mo3221store(ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.n.mo3222track(event);
    }

    public final int b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (Intrinsics.areEqual(name, "portrait")) {
            return 1;
        }
        return Intrinsics.areEqual(name, "landscape") ? 0 : -1;
    }

    public final CBError.Impression c(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a(si.i.j, error);
        xb.b(error, (Throwable) null, 2, (Object) null);
        this.s = true;
        return CBError.Impression.WEB_VIEW_CLIENT_RECEIVED_ERROR;
    }

    public final String l() {
        return this.b;
    }

    public final String g() {
        return this.d;
    }

    public final yi r() {
        return this.e;
    }

    public final n3 q() {
        return this.h;
    }

    public final ge n() {
        return this.k;
    }

    public final String h() {
        return this.p;
    }

    public final cl u() {
        return this.J;
    }

    public final float s() {
        return this.K;
    }

    public final float t() {
        return this.L;
    }

    public final void a(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.v = webView.getWidth();
        this.w = webView.getHeight();
    }

    public final CBError.Impression A() {
        File file = this.f.a().a;
        if (file == null) {
            xb.b("External Storage path is unavailable or media not mounted", (Throwable) null, 2, (Object) null);
            return CBError.Impression.ERROR_LOADING_WEB_VIEW;
        }
        this.p = "file://" + file.getAbsolutePath() + "/";
        String str = this.j;
        if (str == null || str.length() != 0) {
            return null;
        }
        xb.b("Empty template being passed in the response", (Throwable) null, 2, (Object) null);
        return CBError.Impression.ERROR_DISPLAYING_VIEW;
    }

    public void z() {
        r3 webView;
        n3 n3Var;
        cl clVar = this.J;
        if (clVar == null || (webView = clVar.getWebView()) == null || (n3Var = this.h) == null) {
            return;
        }
        n3Var.b(webView, this.b, this.d);
        webView.onResume();
    }

    public void y() {
        r3 webView;
        n3 n3Var;
        cl clVar = this.J;
        if (clVar == null || (webView = clVar.getWebView()) == null || (n3Var = this.h) == null) {
            return;
        }
        n3Var.a(webView, this.b, this.d);
        webView.onPause();
    }

    public void f() {
        this.k.f();
        cl clVar = this.J;
        if (clVar != null) {
            this.e.a(1000L, new d(clVar));
        }
        this.J = null;
    }

    public static final class d extends Lambda implements Function0 {
        public final /* synthetic */ cl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(cl clVar) {
            super(0);
            this.b = clVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            this.b.a();
            this.b.removeAllViews();
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            if (q3.this.s) {
                return;
            }
            xb.a("Webview seems to be taking more time loading the html content, so closing the view.", (Throwable) null, 2, (Object) null);
            q3.this.a(si.i.g, "");
            q3.this.m.a();
        }
    }

    public final void B() {
        this.e.a(15000L, new e());
    }

    public void x() {
        r3 webView;
        Context context;
        this.s = true;
        long currentTimeMillis = System.currentTimeMillis();
        this.r = currentTimeMillis;
        xb.a("Total web view load response time " + ((currentTimeMillis - this.q) / 1000), (Throwable) null, 2, (Object) null);
        cl clVar = this.J;
        if (clVar != null && (context = clVar.getContext()) != null) {
            a(context);
        }
        cl clVar2 = this.J;
        if (clVar2 == null || (webView = clVar2.getWebView()) == null) {
            return;
        }
        a((WebView) webView);
        e();
    }

    public final void e() {
        cl clVar = this.J;
        if (clVar != null && this.s) {
            int[] iArr = new int[2];
            clVar.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1] - this.x;
            int width = clVar.getWidth();
            int height = clVar.getHeight();
            this.y = i;
            this.z = i2;
            int i3 = width + i;
            this.A = i3;
            int i4 = height + i2;
            this.B = i4;
            this.C = i;
            this.D = i2;
            this.E = i3;
            this.F = i4;
            xb.a("CalculatePosition: defaultXPos: " + i + " , currentXPos: " + i, (Throwable) null, 2, (Object) null);
            return;
        }
        this.C = this.y;
        this.D = this.z;
        this.E = this.A;
        this.F = this.B;
    }

    public final String o() {
        String jSONObject = b3.a(b3.a("allowOrientationChange", Boolean.valueOf(this.G)), b3.a("forceOrientation", a(this.H))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final void C() {
        this.l.a();
        this.G = true;
        this.H = -1;
    }

    public final String m() {
        String jSONObject = b3.a(b3.a("width", Integer.valueOf(this.v)), b3.a("height", Integer.valueOf(this.w))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final String p() {
        String jSONObject = b3.a(b3.a("width", Integer.valueOf(this.t)), b3.a("height", Integer.valueOf(this.u))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final String k() {
        e();
        return a(this.y, this.z, this.A, this.B);
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.t = displayMetrics.widthPixels;
        this.u = displayMetrics.heightPixels;
    }

    public final String i() {
        e();
        return a(this.C, this.D, this.E, this.F);
    }

    public final void d(String str) {
        i3 i3Var;
        if (str != null && str.length() != 0 && (i3Var = this.g) != null) {
            i3Var.a((e3) this.o.invoke(str, this.n));
            xb.a("###### Sending VAST Tracking Event: " + str, (Throwable) null, 2, (Object) null);
            return;
        }
        xb.a("###### Sending VAST Tracking Event Failed: " + str, (Throwable) null, 2, (Object) null);
    }

    public final void b(float f) {
        this.L = f;
    }

    public final void D() {
        this.M = 1.0f;
    }

    public final void v() {
        this.M = 0.0f;
    }

    public final x5 j() {
        return this.N;
    }

    public static final class c implements x5 {
        public c() {
        }

        @Override // com.chartboost.sdk.impl.x5
        public void a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            q3.this.c(message);
        }

        @Override // com.chartboost.sdk.impl.x5
        public void b() {
            cl u = q3.this.u();
            r3 webView = u != null ? u.getWebView() : null;
            if (q3.this.c == jc.e || webView == null) {
                return;
            }
            ge n = q3.this.n();
            jc jcVar = q3.this.c;
            List emptyList = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(emptyList, "emptyList(...)");
            n.a(jcVar, webView, null, emptyList);
        }

        @Override // com.chartboost.sdk.impl.x5
        public void a(View obstructionView) {
            Intrinsics.checkNotNullParameter(obstructionView, "obstructionView");
            q3.this.n().a(obstructionView);
        }

        @Override // com.chartboost.sdk.impl.x5
        public void d() {
            q3.this.B();
        }

        @Override // com.chartboost.sdk.impl.x5
        public void c() {
            q3.this.x();
        }

        @Override // com.chartboost.sdk.impl.x5
        public void a() {
            q3.this.q = System.currentTimeMillis();
        }
    }

    public /* synthetic */ q3(Context context, String str, jc jcVar, String str2, yi yiVar, u8 u8Var, i3 i3Var, n3 n3Var, Mediation mediation, String str3, ge geVar, r0 r0Var, xl xlVar, q7 q7Var, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, jcVar, str2, yiVar, u8Var, i3Var, n3Var, mediation, str3, geVar, r0Var, xlVar, q7Var, (i & 16384) != 0 ? a.b : function2);
    }

    public final String a(int i) {
        if (i == -1) {
            return "none";
        }
        if (i == 0) {
            return "landscape";
        }
        if (i != 1) {
            return "error";
        }
        return "portrait";
    }

    public final String a(int i, int i2, int i3, int i4) {
        String jSONObject = b3.a(b3.a(VastAttributes.HORIZONTAL_POSITION, Integer.valueOf(i)), b3.a(VastAttributes.VERTICAL_POSITION, Integer.valueOf(i2)), b3.a("width", Integer.valueOf(i3)), b3.a("height", Integer.valueOf(i4))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final void a(List verificationScriptResourceList, Integer num) {
        r3 webView;
        Intrinsics.checkNotNullParameter(verificationScriptResourceList, "verificationScriptResourceList");
        cl clVar = this.J;
        if (clVar == null || (webView = clVar.getWebView()) == null) {
            return;
        }
        this.k.a(this.c, webView, num, verificationScriptResourceList);
    }

    public final void a(float f, float f2) {
        float f3 = 4;
        float f4 = f / f3;
        float f5 = f / 2;
        float f6 = (f * 3) / f3;
        if (f2 >= f4 && f2 < f5) {
            a(ek.g);
            return;
        }
        if (f2 >= f5 && f2 < f6) {
            a(ek.h);
        } else if (f2 >= f6) {
            a(ek.i);
        }
    }

    public final void a(ek event) {
        Intrinsics.checkNotNullParameter(event, "event");
        xb.a("sendWebViewVastOmEvent: " + event.name(), (Throwable) null, 2, (Object) null);
        if (this.c != jc.e) {
        }
        ge geVar = this.k;
        switch (b.a[event.ordinal()]) {
            case 1:
                geVar.a(this.K, this.M);
                break;
            case 2:
                if (this.I == xe.f) {
                    geVar.e();
                    break;
                }
                break;
            case 3:
                geVar.a();
                break;
            case 4:
                geVar.a(true);
                break;
            case 5:
                geVar.a(false);
                break;
            case 6:
                geVar.a(nf.b);
                break;
            case 7:
                geVar.a(nf.c);
                break;
            case 8:
                geVar.a(nf.d);
                break;
            case 9:
                geVar.d();
                break;
            case 10:
                geVar.c();
                break;
            case 11:
                geVar.a(this.M);
                break;
        }
    }

    public final void a(boolean z, String forceOrientationString) {
        Intrinsics.checkNotNullParameter(forceOrientationString, "forceOrientationString");
        this.G = z;
        int b2 = b(forceOrientationString);
        this.H = b2;
        this.l.a(b2, z);
    }

    public final void a(float f) {
        this.K = f;
    }

    public final void a(si siVar, String str) {
        if (str == null) {
            str = "no message";
        }
        track((pi) new s5(siVar, str, this.d, this.b, this.i, null, 32, null));
    }

    public final CBError.Impression a(CBImpressionActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.J == null) {
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            this.J = b(applicationContext);
        }
        this.l.a(this.a);
        return null;
    }

    public final CBError.Impression a(ViewGroup viewGroup) {
        if (this.J == null) {
            if ((viewGroup != null ? viewGroup.getContext() : null) != null) {
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this.J = b(context);
            } else {
                return CBError.Impression.ERROR_CREATING_VIEW;
            }
        }
        return null;
    }

    public final void a(xe newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.I = newState;
    }
}
