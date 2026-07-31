package com.chartboost.sdk.impl;

import android.content.ActivityNotFoundException;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.unified.UnifiedMediationParams;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class pd {
    public final yi a;
    public final fj b;
    public d9 c;
    public float d;
    public oa e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[qd.values().length];
            try {
                iArr[qd.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qd.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qd.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qd.h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[qd.i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[qd.j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[qd.k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[qd.l.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[qd.m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[qd.n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[qd.o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[qd.p.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[qd.q.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[qd.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[qd.s.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[qd.t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[qd.u.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[qd.v.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[qd.w.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[qd.x.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[qd.y.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[qd.z.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[qd.A.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[qd.B.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[qd.C.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[qd.D.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[qd.E.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[qd.F.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[qd.G.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[qd.H.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[qd.I.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[qd.J.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[qd.K.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[qd.L.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[qd.M.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[qd.R.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[qd.N.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[qd.O.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[qd.P.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[qd.Q.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            a = iArr;
        }
    }

    public pd(yi uiPost, fj urlParser) {
        Intrinsics.checkNotNullParameter(uiPost, "uiPost");
        Intrinsics.checkNotNullParameter(urlParser, "urlParser");
        this.a = uiPost;
        this.b = urlParser;
    }

    public final void a() {
        this.e = null;
    }

    public static final class l extends Lambda implements Function0 {
        public final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(JSONObject jSONObject) {
            super(0);
            this.c = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            oa oaVar = pd.this.e;
            if (oaVar != null) {
                oaVar.b(pd.this.b.b(this.c));
            }
        }
    }

    public static final class v extends Lambda implements Function0 {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            oa oaVar = pd.this.e;
            if (oaVar != null) {
                oaVar.t();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Impression interface is missing in template close", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public static final class w extends Lambda implements Function0 {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            oa oaVar = pd.this.e;
            if (oaVar != null) {
                oaVar.a(ek.k);
            }
        }
    }

    public static final class x extends Lambda implements Function0 {
        public x() {
            super(0);
        }

        public final void a() {
            pd.this.g();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class y extends Lambda implements Function0 {
        public y() {
            super(0);
        }

        public final void a() {
            pd.this.f();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class z extends Lambda implements Function0 {
        public z() {
            super(0);
        }

        public final void a() {
            pd.this.e();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class a0 extends Lambda implements Function0 {
        public static final a0 b = new a0();

        public a0() {
            super(0);
        }

        public final void a() {
            xb.b("Video replay command is run", (Throwable) null, 2, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class b0 extends Lambda implements Function0 {
        public final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(JSONObject jSONObject) {
            super(0);
            this.c = jSONObject;
        }

        public final void a() {
            pd.this.a(this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class c0 extends Lambda implements Function0 {
        public final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(JSONObject jSONObject) {
            super(0);
            this.c = jSONObject;
        }

        public final void a() {
            pd.this.i(this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            oa oaVar = pd.this.e;
            if (oaVar != null) {
                oaVar.u();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Impression interface is missing in template show", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public static final class c extends Lambda implements Function0 {
        public final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject) {
            super(0);
            this.c = jSONObject;
        }

        public final void a() {
            pd.this.c(this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JSONObject jSONObject) {
            super(0);
            this.c = jSONObject;
        }

        public final void a() {
            pd.this.k(this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function0 {
        public final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONObject jSONObject) {
            super(0);
            this.c = jSONObject;
        }

        public final void a() {
            pd.this.b(this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function0 {
        public final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(JSONObject jSONObject) {
            super(0);
            this.c = jSONObject;
        }

        public final void a() {
            pd.this.j(this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function0 {
        public final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(JSONObject jSONObject) {
            super(0);
            this.c = jSONObject;
        }

        public final void a() {
            pd.this.e(this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function0 {
        public final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(JSONObject jSONObject) {
            super(0);
            this.c = jSONObject;
        }

        public final void a() {
            pd.this.h(this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        public final void a() {
            oa oaVar = pd.this.e;
            if (oaVar != null) {
                oaVar.A();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            oa oaVar = pd.this.e;
            if (oaVar != null) {
                oaVar.q();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Impression interface is missing in template rewarded video completed", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public static final class k extends Lambda implements Function0 {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            oa oaVar = pd.this.e;
            if (oaVar != null) {
                oaVar.v();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Impression interface is missing in template play video", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public static final class m extends Lambda implements Function0 {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            oa oaVar = pd.this.e;
            if (oaVar != null) {
                oaVar.k();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Impression interface is missing in template pause video", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public static final class n extends Lambda implements Function0 {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            oa oaVar = pd.this.e;
            if (oaVar != null) {
                oaVar.z();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Impression interface is missing in template close video", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public static final class o extends Lambda implements Function0 {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            oa oaVar = pd.this.e;
            if (oaVar != null) {
                oaVar.f();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Impression interface is missing in template mute video", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public static final class p extends Lambda implements Function0 {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            oa oaVar = pd.this.e;
            if (oaVar != null) {
                oaVar.b();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Impression interface is missing in template unmute video", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public static final class q extends Lambda implements Function0 {
        public final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(JSONObject jSONObject) {
            super(0);
            this.c = jSONObject;
        }

        public final void a() {
            pd.this.f(this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class r extends Lambda implements Function0 {
        public final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(JSONObject jSONObject) {
            super(0);
            this.c = jSONObject;
        }

        public final void a() {
            pd.this.g(this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class s extends Lambda implements Function0 {
        public s() {
            super(0);
        }

        public final void a() {
            pd.this.c();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class t extends Lambda implements Function0 {
        public t() {
            super(0);
        }

        public final void a() {
            pd.this.b();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class u extends Lambda implements Function0 {
        public u() {
            super(0);
        }

        public final void a() {
            pd.this.d();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public final void i(JSONObject jSONObject) {
        float optDouble;
        Unit unit;
        if (jSONObject != null) {
            try {
                optDouble = (float) jSONObject.optDouble(IronSourceConstants.EVENTS_DURATION, 0.0d);
            } catch (Exception e2) {
                k(new JSONObject().put("message", "Parsing exception unknown field for total player duration: " + e2));
                return;
            }
        } else {
            optDouble = 0.0f;
        }
        float f2 = optDouble * 1000;
        xb.a("######### JS->Native Video total player duration" + f2, (Throwable) null, 2, (Object) null);
        this.d = f2;
        oa oaVar = this.e;
        if (oaVar != null) {
            oaVar.b(f2);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("Impression interface is missing in totalVideoDuration", (Throwable) null, 2, (Object) null);
        }
    }

    public final void k(JSONObject jSONObject) {
        String string;
        xb.a("Javascript warning occurred", (Throwable) null, 2, (Object) null);
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("message");
            } catch (Exception unused) {
                oa oaVar = this.e;
                if (oaVar != null) {
                    oaVar.c("Warning message is empty");
                    return;
                }
                return;
            }
        } else {
            string = null;
        }
        if (string == null) {
            string = "Missing message argument";
        }
        xb.a("JS->Native Warning message: " + string, (Throwable) null, 2, (Object) null);
        oa oaVar2 = this.e;
        if (oaVar2 != null) {
            oaVar2.c(string);
        }
    }

    public final void c(JSONObject jSONObject) {
        xb.a("Javascript Error occurred " + jSONObject, (Throwable) null, 2, (Object) null);
        d(jSONObject);
        try {
            oa oaVar = this.e;
            if (oaVar != null) {
                oaVar.i();
                if (oaVar.d(b(jSONObject, "JS->Native Error message: ")) != null) {
                    return;
                }
            }
            xb.a("Impression interface is missing in error", (Throwable) null, 2, (Object) null);
            Unit unit = Unit.INSTANCE;
        } catch (Exception unused) {
            xb.b("Error message is empty", (Throwable) null, 2, (Object) null);
            oa oaVar2 = this.e;
            if (oaVar2 != null) {
                oaVar2.d("");
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        float f2;
        Unit unit;
        if (jSONObject != null) {
            try {
                f2 = (float) jSONObject.getDouble(IronSourceConstants.EVENTS_DURATION);
            } catch (Exception e2) {
                k(new JSONObject().put("message", "Parsing exception unknown field for current player duration: " + e2));
                return;
            }
        } else {
            f2 = 0.0f;
        }
        if (f2 > 0.0f) {
            float f3 = f2 * 1000;
            xb.a("######### JS->Native Video current player duration: " + f3, (Throwable) null, 2, (Object) null);
            oa oaVar = this.e;
            if (oaVar != null) {
                oaVar.a(f3);
                oaVar.a(this.d, f3);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Impression interface is missing in currentVideoDuration", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public final String a(JSONObject jSONObject, String functionName) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        qd a2 = qd.c.a(functionName);
        if (a2 == null) {
            xb.e("Native event unknown: " + functionName, null, 2, null);
            return "Function name not recognized.";
        }
        xb.a("TEMPLATE EVENT: " + a2.c(), (Throwable) null, 2, (Object) null);
        return a(jSONObject, a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0035 A[Catch: Exception -> 0x0016, TRY_LEAVE, TryCatch #0 {Exception -> 0x0016, blocks: (B:15:0x0004, B:17:0x000c, B:19:0x0010, B:21:0x001b, B:22:0x002f, B:5:0x0035), top: B:14:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(JSONObject jSONObject) {
        Unit unit;
        Unit unit2;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("event");
                if (string != null) {
                    oa oaVar = this.e;
                    if (oaVar != null) {
                        oaVar.e(string);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        xb.a("JS->Native Track VAST event message: " + string, (Throwable) null, 2, (Object) null);
                    }
                    unit2 = Unit.INSTANCE;
                    if (unit2 != null) {
                        xb.b("Tracking command received but event is missing!", (Throwable) null, 2, (Object) null);
                        return;
                    }
                    return;
                }
            } catch (Exception e2) {
                xb.b("Exception while parsing webview VAST tracking", e2);
                return;
            }
        }
        unit2 = null;
        if (unit2 != null) {
        }
    }

    public final void b(JSONObject jSONObject) {
        try {
            xb.a("Debug message: " + b(jSONObject, "JS->Native Debug message: "), (Throwable) null, 2, (Object) null);
        } catch (Exception e2) {
            xb.b("Exception occurred while parsing the message for webview debug track event", e2);
        }
    }

    public final void e(JSONObject jSONObject) {
        Unit unit;
        try {
            oa oaVar = this.e;
            if (oaVar != null) {
                oaVar.c(this.b.b(jSONObject));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Impression interface is missing in openUrl", (Throwable) null, 2, (Object) null);
            }
        } catch (ActivityNotFoundException e2) {
            xb.b("ActivityNotFoundException occured when opening a url in a browser", e2);
        } catch (Exception e3) {
            xb.b("Exception while opening a browser view with MRAID url", e3);
        }
    }

    public final void h(JSONObject jSONObject) {
        Unit unit;
        boolean z2 = true;
        if (jSONObject != null) {
            try {
                z2 = jSONObject.optBoolean("allowOrientationChange", true);
            } catch (Exception unused) {
                xb.b("Invalid set orientation command", (Throwable) null, 2, (Object) null);
                return;
            }
        }
        String str = "none";
        String optString = jSONObject != null ? jSONObject.optString("forceOrientation", "none") : null;
        if (optString != null) {
            str = optString;
        }
        oa oaVar = this.e;
        if (oaVar != null) {
            oaVar.a(z2, str);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("Impression interface is missing in setOrientation", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0083 A[Catch: Exception -> 0x0017, TRY_LEAVE, TryCatch #0 {Exception -> 0x0017, blocks: (B:15:0x0004, B:17:0x000c, B:19:0x0012, B:20:0x0061, B:22:0x006b, B:24:0x0078, B:25:0x007d, B:5:0x0083, B:27:0x001a, B:28:0x0032, B:30:0x0038, B:32:0x005d), top: B:14:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(JSONObject jSONObject) {
        List list;
        Unit unit;
        Unit unit2;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("resources");
                if (string != null) {
                    if (string.length() == 0) {
                        list = CollectionsKt.emptyList();
                    } else {
                        List<JSONObject> asList = q8.asList(new JSONArray(string));
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asList, 10));
                        for (JSONObject jSONObject2 : asList) {
                            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(jSONObject2.getString("vendorKey"), new URL(jSONObject2.getString("url")), jSONObject2.getString("params")));
                        }
                        list = CollectionsKt.toList(arrayList);
                    }
                    int optInt = jSONObject.optInt(UnifiedMediationParams.KEY_SKIP_OFFSET);
                    oa oaVar = this.e;
                    if (oaVar != null) {
                        oaVar.a(list, Integer.valueOf(optInt));
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        xb.a("Impression interface is missing in runOmResources", (Throwable) null, 2, (Object) null);
                    }
                    unit2 = Unit.INSTANCE;
                    if (unit2 != null) {
                        xb.b("Invalid om resources command: missing json", (Throwable) null, 2, (Object) null);
                        return;
                    }
                    return;
                }
            } catch (Exception e2) {
                xb.b("Invalid om resources command", e2);
                return;
            }
        }
        unit2 = null;
        if (unit2 != null) {
        }
    }

    public final void a(d9 d9Var) {
        this.c = d9Var;
    }

    public final void a(oa impressionInterface) {
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        this.e = impressionInterface;
    }

    public final void g(JSONObject jSONObject) {
        Unit unit;
        double d2 = 0.0d;
        if (jSONObject != null) {
            try {
                d2 = jSONObject.optDouble(IronSourceConstants.EVENTS_DURATION, 0.0d);
            } catch (Exception e2) {
                xb.b("Invalid start command", e2);
                return;
            }
        }
        this.d = (float) d2;
        oa oaVar = this.e;
        if (oaVar != null) {
            oaVar.a(ek.b);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("Impression interface is missing in runStart", (Throwable) null, 2, (Object) null);
        }
    }

    public final String a(JSONObject jSONObject, qd qdVar) {
        String j2;
        String h2;
        String B;
        String s2;
        String w2;
        String C;
        switch (a.a[qdVar.ordinal()]) {
            case 1:
                xb.a("JavaScript to native " + qdVar.c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                oa oaVar = this.e;
                return (oaVar == null || (j2 = oaVar.j()) == null) ? "" : j2;
            case 2:
                xb.a("JavaScript to native " + qdVar.c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                oa oaVar2 = this.e;
                return (oaVar2 == null || (h2 = oaVar2.h()) == null) ? "" : h2;
            case 3:
                xb.a("JavaScript to native " + qdVar.c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                oa oaVar3 = this.e;
                return (oaVar3 == null || (B = oaVar3.B()) == null) ? "" : B;
            case 4:
                xb.a("JavaScript to native " + qdVar.c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                oa oaVar4 = this.e;
                return (oaVar4 == null || (s2 = oaVar4.s()) == null) ? "" : s2;
            case 5:
                xb.a("JavaScript to native " + qdVar.c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                oa oaVar5 = this.e;
                return (oaVar5 == null || (w2 = oaVar5.w()) == null) ? "" : w2;
            case 6:
                xb.a("JavaScript to native " + qdVar.c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                oa oaVar6 = this.e;
                return (oaVar6 == null || (C = oaVar6.C()) == null) ? "" : C;
            case 7:
                this.a.a(new l(jSONObject));
                return "Native function successfully called.";
            case 8:
                this.a.a(new v());
                return "Native function successfully called.";
            case 9:
                this.a.a(new w());
                return "Native function successfully called.";
            case 10:
                this.a.a(new x());
                return "Native function successfully called.";
            case 11:
                this.a.a(new y());
                return "Native function successfully called.";
            case 12:
                this.a.a(new z());
                return "Native function successfully called.";
            case 13:
                this.a.a(a0.b);
                return "Native function successfully called.";
            case 14:
                this.a.a(new b0(jSONObject));
                return "Native function successfully called.";
            case 15:
                this.a.a(new c0(jSONObject));
                return "Native function successfully called.";
            case 16:
                this.a.a(new b());
                return "Native function successfully called.";
            case 17:
                this.a.a(new c(jSONObject));
                return "Native function successfully called.";
            case 18:
                this.a.a(new d(jSONObject));
                return "Native function successfully called.";
            case 19:
                this.a.a(new e(jSONObject));
                return "Native function successfully called.";
            case 20:
                this.a.a(new f(jSONObject));
                return "Native function successfully called.";
            case 21:
                this.a.a(new g(jSONObject));
                return "Native function successfully called.";
            case 22:
                this.a.a(new h(jSONObject));
                return "Native function successfully called.";
            case 23:
                this.a.a(new i());
                return "Native function successfully called.";
            case 24:
                this.a.a(new j());
                return "Native function successfully called.";
            case 25:
                this.a.a(new k());
                return "Native function successfully called.";
            case 26:
                this.a.a(new m());
                return "Native function successfully called.";
            case 27:
                this.a.a(new n());
                return "Native function successfully called.";
            case 28:
                this.a.a(new o());
                return "Native function successfully called.";
            case 29:
                this.a.a(new p());
                return "Native function successfully called.";
            case 30:
                this.a.a(new q(jSONObject));
                return "Native function successfully called.";
            case 31:
                this.a.a(new r(jSONObject));
                return "Native function successfully called.";
            case 32:
                this.a.a(new s());
                return "Native function successfully called.";
            case 33:
                this.a.a(new t());
                return "Native function successfully called.";
            case 34:
                this.a.a(new u());
                return "Native function successfully called.";
            default:
                return "Native function successfully called.";
        }
    }

    public final void d() {
        Unit unit;
        try {
            oa oaVar = this.e;
            if (oaVar != null) {
                oaVar.a(ek.j);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Impression interface is missing in runVideoFinished", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e2) {
            xb.b("Invalid buffer end command", e2);
        }
    }

    public final void d(JSONObject jSONObject) {
        String optString;
        if (pg.a.d() && jSONObject != null && (optString = jSONObject.optString("msg")) != null && Intrinsics.areEqual(optString, "crash sdk")) {
            throw new RuntimeException("test crash");
        }
    }

    public final void e() {
        Unit unit;
        oa oaVar = this.e;
        if (oaVar != null) {
            oaVar.a(xe.f);
            oaVar.a(ek.d);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("Impression interface is missing in runVideoResumedCommand", (Throwable) null, 2, (Object) null);
        }
    }

    public final void g() {
        Unit unit;
        d9 d9Var = this.c;
        if (d9Var != null) {
            d9Var.onHideCustomView();
        }
        oa oaVar = this.e;
        if (oaVar != null) {
            oaVar.a(xe.d);
            oaVar.l();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("Impression interface is missing in videoCompleted", (Throwable) null, 2, (Object) null);
        }
    }

    public final void c() {
        Unit unit;
        try {
            oa oaVar = this.e;
            if (oaVar != null) {
                oaVar.a(ek.e);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Impression interface is missing in runBufferStart", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e2) {
            xb.b("Invalid bufer start command", e2);
        }
    }

    public final String b(JSONObject jSONObject, String str) {
        String string = jSONObject != null ? jSONObject.getString("message") : null;
        if (string == null) {
            string = "";
        }
        xb.a(str + string, (Throwable) null, 2, (Object) null);
        return string;
    }

    public final void f() {
        Unit unit;
        oa oaVar = this.e;
        if (oaVar != null) {
            oaVar.a(ek.c);
            oaVar.a(xe.e);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("Impression interface is missing in runVideoResumedCommand", (Throwable) null, 2, (Object) null);
        }
    }

    public final void b() {
        Unit unit;
        try {
            oa oaVar = this.e;
            if (oaVar != null) {
                oaVar.a(ek.f);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Impression interface is missing in runBufferEnd", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e2) {
            xb.b("Invalid buffer end command", e2);
        }
    }
}
