package io.appmetrica.analytics.impl;

import c3.C0292d;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import o3.InterfaceC1339l;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final AdRevenue f10228a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10229b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0961t f10230c;

    /* renamed from: d, reason: collision with root package name */
    public final Xm f10231d;

    /* renamed from: e, reason: collision with root package name */
    public final Um f10232e;

    public E(AdRevenue adRevenue, boolean z, C0623fn c0623fn, PublicLogger publicLogger) {
        this.f10228a = adRevenue;
        this.f10229b = z;
        this.f10230c = c0623fn;
        this.f10231d = new Xm(100, "ad revenue strings", publicLogger);
        this.f10232e = new Um(30720, "ad revenue payload", publicLogger);
    }

    public final C0292d a() {
        C0935s c0935s = new C0935s();
        int i4 = 0;
        for (C0292d c0292d : d3.j.W(new C0292d(this.f10228a.adNetwork, new C1065x(c0935s)), new C0292d(this.f10228a.adPlacementId, new C1091y(c0935s)), new C0292d(this.f10228a.adPlacementName, new C1117z(c0935s)), new C0292d(this.f10228a.adUnitId, new A(c0935s)), new C0292d(this.f10228a.adUnitName, new B(c0935s)), new C0292d(this.f10228a.precision, new C(c0935s)), new C0292d(this.f10228a.currency.getCurrencyCode(), new D(c0935s)))) {
            String str = (String) c0292d.f5724a;
            InterfaceC1339l interfaceC1339l = (InterfaceC1339l) c0292d.f5725b;
            Xm xm = this.f10231d;
            xm.getClass();
            String a3 = xm.a(str);
            byte[] stringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] stringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(a3);
            interfaceC1339l.invoke(stringToBytesForProtobuf2);
            i4 += stringToBytesForProtobuf.length - stringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) F.f10265a.get(this.f10228a.adType);
        c0935s.f12702d = num != null ? num.intValue() : 0;
        r rVar = new r();
        BigDecimal bigDecimal = this.f10228a.adRevenue;
        BigInteger bigInteger = AbstractC1073x7.f13018a;
        int i5 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(AbstractC1073x7.f13018a) <= 0 && unscaledValue.compareTo(AbstractC1073x7.f13019b) >= 0) {
                break;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i5++;
        }
        Long valueOf = Long.valueOf(unscaledValue.longValue());
        Integer valueOf2 = Integer.valueOf(i5);
        long longValue = valueOf.longValue();
        int intValue = valueOf2.intValue();
        rVar.f12633a = longValue;
        rVar.f12634b = intValue;
        c0935s.f12700b = rVar;
        Map<String, String> map = this.f10228a.payload;
        String b4 = AbstractC0637gb.b(this.f10230c.a(map != null ? d3.t.H(map) : new LinkedHashMap()));
        Um um = this.f10232e;
        um.getClass();
        byte[] stringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(um.a(b4));
        c0935s.f12709k = stringToBytesForProtobuf3;
        int length = (StringUtils.stringToBytesForProtobuf(b4).length - stringToBytesForProtobuf3.length) + i4;
        if (this.f10229b) {
            c0935s.f12699a = "autocollected".getBytes(AbstractC1504a.f15936a);
        }
        return new C0292d(MessageNano.toByteArray(c0935s), Integer.valueOf(length));
    }
}
