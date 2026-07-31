package com.chartboost.sdk.impl;

import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public abstract class bk {
    public final String a;

    public final void a(ck params, Integer num, Integer num2) {
        String e2;
        Unit unit;
        Intrinsics.checkNotNullParameter(params, "params");
        qi k2 = params.k();
        if (k2 == null || (e2 = k2.e()) == null) {
            xb.a("Failed to fire tracking URL for event `" + this.a + "`. URL is null in TrackingEvent.", (Throwable) null, 2, (Object) null);
            return;
        }
        String a2 = cc.a(e2, cc.a(params.b(), params.h(), params.g(), new t(num, num2, params)));
        i3 b2 = oj.a.b();
        if (b2 != null) {
            b2.a(new dk(a2));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.b("Failed to submit tracking request for " + a2 + ". Network service is null.", (Throwable) null, 2, (Object) null);
        }
        xb.c("Tracking URL for event `" + this.a + "` fired: " + a2 + " (raw: " + e2 + ")", null, 2, null);
    }

    public void b(ck params) {
        Intrinsics.checkNotNullParameter(params, "params");
        a(this, params, null, null, 6, null);
    }

    public bk(String str) {
        this.a = str;
    }

    public /* synthetic */ bk(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public static final class t extends Lambda implements Function1 {
        public final /* synthetic */ Integer b;
        public final /* synthetic */ Integer c;
        public final /* synthetic */ ck d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Integer num, Integer num2, ck ckVar) {
            super(1);
            this.b = num;
            this.c = num2;
            this.d = ckVar;
        }

        public final void a(ac macroContext) {
            Intrinsics.checkNotNullParameter(macroContext, "$this$macroContext");
            macroContext.a(this.b);
            macroContext.b(this.c);
            macroContext.a(this.d.n());
            macroContext.a(this.d.a());
            macroContext.c(this.d.l());
            macroContext.a(this.d.f());
            macroContext.b(this.d.d());
            macroContext.c(this.d.e());
            macroContext.d(this.d.i());
            macroContext.a(this.d.c());
            macroContext.b(this.d.j());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ac) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class p extends bk {
        public static final p b = new p();

        @Override // com.chartboost.sdk.impl.bk
        public void a(ck params) {
            Map b2;
            Map b3;
            Intrinsics.checkNotNullParameter(params, "params");
            qi k = params.k();
            Object obj = (k == null || (b3 = k.b()) == null) ? null : b3.get(IronSourceConstants.EVENTS_DURATION);
            Float f = obj instanceof Float ? (Float) obj : null;
            float floatValue = f != null ? f.floatValue() : 0.0f;
            if (floatValue < 1.0f) {
                floatValue = 30.0f;
            }
            qi k2 = params.k();
            Object obj2 = (k2 == null || (b2 = k2.b()) == null) ? null : b2.get("volume");
            Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
            float floatValue2 = f2 != null ? f2.floatValue() : 1.0f;
            ll m = params.m();
            if (m != null) {
                m.a(floatValue, floatValue2);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public int hashCode() {
            return 1826092554;
        }

        public String toString() {
            return "Start";
        }

        public p() {
            super("start", null);
        }
    }

    public static final class l extends bk {
        public static final l b = new l();

        @Override // com.chartboost.sdk.impl.bk
        public void a(ck params) {
            Intrinsics.checkNotNullParameter(params, "params");
            ll m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public int hashCode() {
            return 1822775198;
        }

        public String toString() {
            return "Pause";
        }

        public l() {
            super("pause", null);
        }
    }

    public static final class n extends bk {
        public static final n b = new n();

        @Override // com.chartboost.sdk.impl.bk
        public void a(ck params) {
            Intrinsics.checkNotNullParameter(params, "params");
            ll m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public int hashCode() {
            return 732351365;
        }

        public String toString() {
            return "Resume";
        }

        public n() {
            super("resume", null);
        }
    }

    public static final class k extends bk {
        public static final k b = new k();

        @Override // com.chartboost.sdk.impl.bk
        public void a(ck params) {
            Intrinsics.checkNotNullParameter(params, "params");
            ll m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public int hashCode() {
            return -1742386319;
        }

        public String toString() {
            return VastTagName.MUTE;
        }

        public k() {
            super("mute", null);
        }
    }

    public static final class r extends bk {
        public static final r b = new r();

        @Override // com.chartboost.sdk.impl.bk
        public void a(ck params) {
            Intrinsics.checkNotNullParameter(params, "params");
            ll m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public int hashCode() {
            return 826371978;
        }

        public String toString() {
            return "Unmute";
        }

        public r() {
            super("unmute", null);
        }
    }

    public static final class d extends bk {
        public static final d b = new d();

        @Override // com.chartboost.sdk.impl.bk
        public void a(ck params) {
            Intrinsics.checkNotNullParameter(params, "params");
            ll m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -848642415;
        }

        public String toString() {
            return "Complete";
        }

        public d() {
            super("complete", null);
        }
    }

    public static final class i extends bk {
        public static final i b = new i();

        @Override // com.chartboost.sdk.impl.bk
        public void a(ck params) {
            Intrinsics.checkNotNullParameter(params, "params");
            ll m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return 569258845;
        }

        public String toString() {
            return "Loaded";
        }

        public i() {
            super(X3.i.r, null);
        }
    }

    public static final class g extends bk {
        public static final g b = new g();

        @Override // com.chartboost.sdk.impl.bk
        public void a(ck params) {
            Intrinsics.checkNotNullParameter(params, "params");
            ll m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return 1356419579;
        }

        public String toString() {
            return "FirstQuartile";
        }

        public g() {
            super("firstQuartile", null);
        }
    }

    public static final class j extends bk {
        public static final j b = new j();

        @Override // com.chartboost.sdk.impl.bk
        public void a(ck params) {
            Intrinsics.checkNotNullParameter(params, "params");
            ll m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return -1888032352;
        }

        public String toString() {
            return "Midpoint";
        }

        public j() {
            super("midpoint", null);
        }
    }

    public static /* synthetic */ void a(bk bkVar, ck ckVar, Integer num, Integer num2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fireTracker");
        }
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            num2 = null;
        }
        bkVar.a(ckVar, num, num2);
    }

    public static final class q extends bk {
        public static final q b = new q();

        @Override // com.chartboost.sdk.impl.bk
        public void a(ck params) {
            Intrinsics.checkNotNullParameter(params, "params");
            ll m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public int hashCode() {
            return -541631054;
        }

        public String toString() {
            return "ThirdQuartile";
        }

        public q() {
            super("thirdQuartile", null);
        }
    }

    public static final class a extends bk {
        public static final a b = new a();

        @Override // com.chartboost.sdk.impl.bk
        public void a(ck params) {
            Intrinsics.checkNotNullParameter(params, "params");
            ll m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1811085104;
        }

        public String toString() {
            return "Click";
        }

        public a() {
            super("click", null);
        }
    }

    public static final class o extends bk {
        public static final o b = new o();

        @Override // com.chartboost.sdk.impl.bk
        public void a(ck params) {
            Intrinsics.checkNotNullParameter(params, "params");
            ll m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public int hashCode() {
            return -1742217513;
        }

        public String toString() {
            return "Skip";
        }

        public o() {
            super("skip", null);
        }
    }

    public static final class h extends bk {
        public static final h b = new h();

        @Override // com.chartboost.sdk.impl.bk
        public void a(ck params) {
            Intrinsics.checkNotNullParameter(params, "params");
            ll m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return 1160259937;
        }

        public String toString() {
            return "Impression";
        }

        public h() {
            super("impression", null);
        }
    }

    public static final class s extends bk {
        public static final s b = new s();

        @Override // com.chartboost.sdk.impl.bk
        public void b(ck params) {
            Intrinsics.checkNotNullParameter(params, "params");
            bk.a(this, params, null, null, 6, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public int hashCode() {
            return 2127335488;
        }

        public String toString() {
            return "ViewableImpression";
        }

        public s() {
            super("viewableimpression", null);
        }
    }

    public final String a() {
        return this.a;
    }

    public void a(ck params) {
        Intrinsics.checkNotNullParameter(params, "params");
    }

    public static final class b extends bk {
        public static final b b = new b();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1811091360;
        }

        public String toString() {
            return "Close";
        }

        public b() {
            super("close", null);
        }
    }

    public static final class c extends bk {
        public static final c b = new c();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 2126271205;
        }

        public String toString() {
            return "CloseLinear";
        }

        public c() {
            super("closeLinear", null);
        }
    }

    public static final class e extends bk {
        public static final e b = new e();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 141283404;
        }

        public String toString() {
            return "CreativeView";
        }

        public e() {
            super("creativeView", null);
        }
    }

    public static final class f extends bk {
        public static final f b = new f();

        @Override // com.chartboost.sdk.impl.bk
        public void a(ck params) {
            Intrinsics.checkNotNullParameter(params, "params");
            ll m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        @Override // com.chartboost.sdk.impl.bk
        public void b(ck params) {
            Map b2;
            Intrinsics.checkNotNullParameter(params, "params");
            qi k = params.k();
            Object obj = (k == null || (b2 = k.b()) == null) ? null : b2.get("VAST_ERROR_CODE");
            bk.a(this, params, obj instanceof Integer ? (Integer) obj : null, null, 4, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 1813119920;
        }

        public String toString() {
            return "Error";
        }

        public f() {
            super("error", null);
        }
    }

    public static final class m extends bk {
        public final int b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.b == ((m) obj).b;
        }

        public int hashCode() {
            return Integer.hashCode(this.b);
        }

        public String toString() {
            return "Progress(offsetSeconds=" + this.b + ")";
        }

        public m(int i) {
            super("progress" + i, null);
            this.b = i;
        }
    }
}
