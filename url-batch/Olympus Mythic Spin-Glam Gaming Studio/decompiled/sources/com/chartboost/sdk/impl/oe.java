package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.ironsource.C4538a2;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;

/* loaded from: classes.dex */
public final class oe {
    public static final a d = new a(null);
    public final ig a;
    public final b0 b;
    public final he c;

    public static final class b extends Lambda implements Function1 {
        public static final b b = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(MatchResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return StringsKt.toIntOrNull(it.getValue());
        }
    }

    public oe(ig requestBodyFields, b0 b0Var, he heVar) {
        Intrinsics.checkNotNullParameter(requestBodyFields, "requestBodyFields");
        this.a = requestBodyFields;
        this.b = b0Var;
        this.c = heVar;
    }

    public final App b() {
        ig igVar = this.a;
        return new App(igVar.h, igVar.f);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final List e() {
        c0 a2;
        b0 b0Var = this.b;
        if (b0Var != null && (a2 = b0Var.a()) != null) {
            return CollectionsKt.listOf(new Imp(Intrinsics.areEqual(a2, c0.a.g) ? c() : null, (Intrinsics.areEqual(a2, c0.b.g) || Intrinsics.areEqual(a2, c0.c.g)) ? h() : null, "Chartboost-Android-SDK", this.a.g, Integer.valueOf(a2.e() ? 1 : 0), this.b.d(), 1));
        }
        return CollectionsKt.emptyList();
    }

    public final Banner c() {
        c0 a2;
        b0 b0Var = this.b;
        if (b0Var == null || (a2 = b0Var.a()) == null || !Intrinsics.areEqual(a2, c0.a.g)) {
            return null;
        }
        Integer e = this.b.e();
        Integer b2 = this.b.b();
        String b3 = a2.b();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = b3.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new Banner(e, b2, new BannerExt(lowerCase));
    }

    public final Video h() {
        c0 a2;
        b0 b0Var = this.b;
        if (b0Var == null || (a2 = b0Var.a()) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(a2, c0.b.g) && !Intrinsics.areEqual(a2, c0.c.g)) {
            return null;
        }
        int c = this.a.b().c();
        int a3 = this.a.b().a();
        Integer valueOf = Integer.valueOf(c);
        Integer valueOf2 = Integer.valueOf(a3);
        List a4 = a(c, a3);
        String b2 = a2.b();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = b2.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new Video(valueOf, valueOf2, 5, a4, new VideoExt(lowerCase));
    }

    public final Device d() {
        s9 c = this.a.c();
        Integer valueOf = Integer.valueOf(c.f().b());
        String a2 = kj.b.a();
        Integer e = this.a.e();
        ig igVar = this.a;
        String str = igVar.k;
        String str2 = igVar.a;
        String str3 = Build.VERSION.RELEASE;
        Integer valueOf2 = Integer.valueOf(igVar.b().a());
        Integer valueOf3 = Integer.valueOf(this.a.b().c());
        ig igVar2 = this.a;
        String str4 = igVar2.d;
        String str5 = igVar2.n;
        Integer valueOf4 = Integer.valueOf(igVar2.g().d().c());
        String a3 = c.a();
        Intrinsics.checkNotNull(c);
        return new Device(valueOf, a2, e, str, str2, "Android", str3, valueOf2, valueOf3, (Float) null, str4, str5, valueOf4, a3, a(c), 512, (DefaultConstructorMarker) null);
    }

    public final User g() {
        cf cfVar = this.a.r;
        String h = cfVar.h();
        Integer c = cfVar.c();
        Integer valueOf = Integer.valueOf(c != null ? c.intValue() : 0);
        b0 b0Var = this.b;
        return new User(h, new UserExt(valueOf, Integer.valueOf(b0Var != null ? b0Var.c() : 0), Long.valueOf(this.a.h().b())));
    }

    public final Regs f() {
        cf cfVar = this.a.r;
        Integer d2 = cfVar.d();
        Integer e = cfVar.e();
        String f = cfVar.f();
        if (f == null || StringsKt.isBlank(f) || Intrinsics.areEqual(f, C4538a2.f)) {
            f = null;
        }
        String str = f;
        String b2 = cfVar.b();
        List a2 = a(cfVar.a());
        Intrinsics.checkNotNull(cfVar);
        return new Regs(d2, e, str, b2, a2, a(cfVar));
    }

    public final JsonObject a(cf cfVar) {
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        List<DataUseConsent> i = cfVar.i();
        if (i != null) {
            for (DataUseConsent dataUseConsent : i) {
                if (!Intrinsics.areEqual(dataUseConsent.getPrivacyStandardName(), "coppa")) {
                    JsonElementBuildersKt.put(jsonObjectBuilder, dataUseConsent.getPrivacyStandardName(), dataUseConsent.getConsent().toString());
                }
            }
        }
        return jsonObjectBuilder.build();
    }

    public final List a(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        List list = SequencesKt.toList(SequencesKt.mapNotNull(Regex.findAll$default(new Regex("(?<!\\d)-?\\d+"), str, 0, 2, null), b.b));
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    public final BidRequest a() {
        return new BidRequest(e(), b(), d(), g(), 0, f());
    }

    public final List a(int i, int i2) {
        return CollectionsKt.listOf(new CompanionAd(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public final DeviceExt a(s9 s9Var) {
        return new DeviceExt(s9Var.d(), s9Var.e());
    }
}
