package com.chartboost.sdk.impl;

import android.content.Context;
import com.ironsource.C4538a2;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class cc {
    public static final Map a = MapsKt.mapOf(TuplesKt.to(vj.e, i.b), TuplesKt.to(vj.f, j.b), TuplesKt.to(vj.g, k.b), TuplesKt.to(vj.h, l.b), TuplesKt.to(vj.i, m.b), TuplesKt.to(vj.j, n.b), TuplesKt.to(vj.k, o.b), TuplesKt.to(vj.l, p.b), TuplesKt.to(vj.m, q.b), TuplesKt.to(vj.n, c.b), TuplesKt.to(vj.o, d.b), TuplesKt.to(vj.p, e.b), TuplesKt.to(vj.q, f.b), TuplesKt.to(vj.r, g.b), TuplesKt.to(vj.s, h.b));

    public static final class a extends Lambda implements Function1 {
        public final /* synthetic */ zb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zb zbVar) {
            super(1);
            this.b = zbVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(MatchResult match) {
            String str;
            String b;
            Intrinsics.checkNotNullParameter(match, "match");
            String value = match.getValue();
            vj a = vj.c.a(value);
            if (a == null) {
                return cc.b(value);
            }
            zb zbVar = this.b;
            Function1 function1 = (Function1) cc.a.get(a);
            return (function1 == null || (str = (String) function1.invoke(zbVar)) == null || (b = cc.b(str)) == null) ? C4538a2.f : b;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public static final c b = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zb context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.e();
        }
    }

    public static final class d extends Lambda implements Function1 {
        public static final d b = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zb context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.k();
        }
    }

    public static final class e extends Lambda implements Function1 {
        public static final e b = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zb context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.b();
        }
    }

    public static final class f extends Lambda implements Function1 {
        public static final f b = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zb context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Long l = context.l();
            if (l != null) {
                return cc.a(l.longValue());
            }
            return null;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public static final g b = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zb context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Long l = context.l();
            if (l != null) {
                return cc.a(l.longValue());
            }
            return null;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public static final h b = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zb context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Long l = context.l();
            if (l != null) {
                return cc.a(l.longValue());
            }
            return null;
        }
    }

    public static final class i extends Lambda implements Function1 {
        public static final i b = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zb context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return cc.b(context.f());
        }
    }

    public static final class j extends Lambda implements Function1 {
        public static final j b = new j();

        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zb context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return StringsKt.padStart(String.valueOf(context.c()), 8, '0');
        }
    }

    public static final class k extends Lambda implements Function1 {
        public static final k b = new k();

        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zb context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Integer g = context.g();
            return String.valueOf(g != null ? g.intValue() : -1);
        }
    }

    public static final class l extends Lambda implements Function1 {
        public static final l b = new l();

        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zb context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Integer m = context.m();
            return String.valueOf(m != null ? m.intValue() : -1);
        }
    }

    public static final class m extends Lambda implements Function1 {
        public static final m b = new m();

        public m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zb context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return String.valueOf(context.i());
        }
    }

    public static final class n extends Lambda implements Function1 {
        public static final n b = new n();

        public n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zb context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.a();
        }
    }

    public static final class o extends Lambda implements Function1 {
        public static final o b = new o();

        public o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zb context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.j();
        }
    }

    public static final class p extends Lambda implements Function1 {
        public static final p b = new p();

        public p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zb context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.h();
        }
    }

    public static final class q extends Lambda implements Function1 {
        public static final q b = new q();

        public q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zb context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.d();
        }
    }

    public static final class b extends Lambda implements Function1 {
        public static final b b = new b();

        public b() {
            super(1);
        }

        public final void a(ac acVar) {
            Intrinsics.checkNotNullParameter(acVar, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ac) obj);
            return Unit.INSTANCE;
        }
    }

    public static final String b(long j2) {
        Instant ofEpochMilli;
        ZoneId systemDefault;
        ZonedDateTime atZone;
        DateTimeFormatter ofPattern;
        String format;
        ofEpochMilli = Instant.ofEpochMilli(j2);
        systemDefault = ZoneId.systemDefault();
        atZone = ofEpochMilli.atZone(systemDefault);
        ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        format = atZone.format(ofPattern);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final String a(Boolean bool, u uVar, Long l2, Long l3) {
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            arrayList.add("mautoplayed");
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            arrayList.add("autoplayed");
        }
        if (uVar == u.d) {
            arrayList.add("optin");
        }
        Long valueOf = l2 != null ? Long.valueOf(l2.longValue() / 1000) : null;
        if (valueOf != null && l3 != null && valueOf.longValue() > l3.longValue()) {
            arrayList.add("skippable");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }

    public static final String a(String str, zb context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new Regex("\\[[A-Z0-9]+]").replace(str, new a(context));
    }

    public static final String b(String str) {
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            Intrinsics.checkNotNull(encode);
            return encode;
        } catch (UnsupportedEncodingException e2) {
            xb.b("Failed to encode macro value: " + str, e2);
            return str;
        }
    }

    public static final String a(long j2) {
        long coerceAtLeast = RangesKt.coerceAtLeast(j2, 0L);
        long j3 = 1000;
        long j4 = coerceAtLeast / j3;
        long j5 = coerceAtLeast % j3;
        long j6 = 3600;
        long j7 = 60;
        String format = String.format("%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(j4 / j6), Long.valueOf((j4 % j6) / j7), Long.valueOf(j4 % j7), Long.valueOf(j5)}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final zb a(Context context, he openMeasurementManager, y2 identity, Function1 block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(block, "block");
        ac acVar = new ac(context, openMeasurementManager, identity);
        block.invoke(acVar);
        return acVar.a();
    }

    public static /* synthetic */ zb a(Context context, he heVar, y2 y2Var, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function1 = b.b;
        }
        return a(context, heVar, y2Var, function1);
    }
}
