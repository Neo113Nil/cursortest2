package io.appmetrica.analytics.impl;

import b2.C0190d;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final AdRevenue f5911a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5912b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0839t f5913c;

    /* renamed from: d, reason: collision with root package name */
    public final C0372an f5914d;

    /* renamed from: e, reason: collision with root package name */
    public final Ym f5915e;

    public E(AdRevenue adRevenue, boolean z, C0578in c0578in, PublicLogger publicLogger) {
        this.f5911a = adRevenue;
        this.f5912b = z;
        this.f5913c = c0578in;
        this.f5914d = new C0372an(100, "ad revenue strings", publicLogger);
        this.f5915e = new Ym(30720, "ad revenue payload", publicLogger);
    }

    public final C0190d a() {
        C0813s c0813s = new C0813s();
        int i3 = 0;
        for (C0190d c0190d : c2.f.L(new C0190d(this.f5911a.adNetwork, new C0943x(c0813s)), new C0190d(this.f5911a.adPlacementId, new C0968y(c0813s)), new C0190d(this.f5911a.adPlacementName, new C0993z(c0813s)), new C0190d(this.f5911a.adUnitId, new A(c0813s)), new C0190d(this.f5911a.adUnitName, new B(c0813s)), new C0190d(this.f5911a.precision, new C(c0813s)), new C0190d(this.f5911a.currency.getCurrencyCode(), new D(c0813s)))) {
            String str = (String) c0190d.f2547a;
            l2.l lVar = (l2.l) c0190d.f2548b;
            C0372an c0372an = this.f5914d;
            c0372an.getClass();
            String a3 = c0372an.a(str);
            byte[] stringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] stringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(a3);
            lVar.invoke(stringToBytesForProtobuf2);
            i3 += stringToBytesForProtobuf.length - stringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) F.f5971a.get(this.f5911a.adType);
        c0813s.f8271d = num != null ? num.intValue() : 0;
        r rVar = new r();
        BigDecimal bigDecimal = this.f5911a.adRevenue;
        BigInteger bigInteger = F7.f5987a;
        int i4 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(F7.f5987a) <= 0 && unscaledValue.compareTo(F7.f5988b) >= 0) {
                break;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i4++;
        }
        Long valueOf = Long.valueOf(unscaledValue.longValue());
        Integer valueOf2 = Integer.valueOf(i4);
        long longValue = valueOf.longValue();
        int intValue = valueOf2.intValue();
        rVar.f8188a = longValue;
        rVar.f8189b = intValue;
        c0813s.f8269b = rVar;
        Map<String, String> map = this.f5911a.payload;
        String b3 = AbstractC0696nb.b(this.f5913c.a(map != null ? c2.p.g0(map) : new LinkedHashMap()));
        Ym ym = this.f5915e;
        ym.getClass();
        byte[] stringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(ym.a(b3));
        c0813s.f8277k = stringToBytesForProtobuf3;
        int length = (StringUtils.stringToBytesForProtobuf(b3).length - stringToBytesForProtobuf3.length) + i3;
        if (this.f5912b) {
            c0813s.f8268a = "autocollected".getBytes(s2.a.f10316a);
        }
        return new C0190d(MessageNano.toByteArray(c0813s), Integer.valueOf(length));
    }
}
