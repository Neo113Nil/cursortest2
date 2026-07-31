package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final AdRevenue f37328a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37329b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2947s f37330c;

    /* renamed from: d, reason: collision with root package name */
    public final Wm f37331d;

    /* renamed from: e, reason: collision with root package name */
    public final Um f37332e;

    public D(AdRevenue adRevenue, boolean z4, C2607en c2607en, PublicLogger publicLogger) {
        this.f37328a = adRevenue;
        this.f37329b = z4;
        this.f37330c = c2607en;
        this.f37331d = new Wm(100, "ad revenue strings", publicLogger);
        this.f37332e = new Um(30720, "ad revenue payload", publicLogger);
    }

    public final Pair a() {
        Map linkedHashMap;
        r rVar = new r();
        int i4 = 0;
        for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(this.f37328a.adNetwork, new C3051w(rVar)), TuplesKt.to(this.f37328a.adPlacementId, new C3077x(rVar)), TuplesKt.to(this.f37328a.adPlacementName, new C3103y(rVar)), TuplesKt.to(this.f37328a.adUnitId, new C3129z(rVar)), TuplesKt.to(this.f37328a.adUnitName, new A(rVar)), TuplesKt.to(this.f37328a.precision, new B(rVar)), TuplesKt.to(this.f37328a.currency.getCurrencyCode(), new C(rVar))})) {
            String str = (String) pair.getFirst();
            Function1 function1 = (Function1) pair.getSecond();
            Wm wm = this.f37331d;
            wm.getClass();
            String a4 = wm.a(str);
            byte[] stringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] stringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(a4);
            function1.invoke(stringToBytesForProtobuf2);
            i4 += stringToBytesForProtobuf.length - stringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) E.f37392a.get(this.f37328a.adType);
        rVar.f39685d = num != null ? num.intValue() : 0;
        C2896q c2896q = new C2896q();
        BigDecimal bigDecimal = this.f37328a.adRevenue;
        BigInteger bigInteger = T7.f38297a;
        int i5 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(T7.f38297a) <= 0 && unscaledValue.compareTo(T7.f38298b) >= 0) {
                break;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i5++;
        }
        Pair pair2 = TuplesKt.to(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i5));
        long longValue = ((Number) pair2.getFirst()).longValue();
        int intValue = ((Number) pair2.getSecond()).intValue();
        c2896q.f39640a = longValue;
        c2896q.f39641b = intValue;
        rVar.f39683b = c2896q;
        Map<String, String> map = this.f37328a.payload;
        InterfaceC2947s interfaceC2947s = this.f37330c;
        if (map == null || (linkedHashMap = MapsKt.toMutableMap(map)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        String b4 = Bb.b(interfaceC2947s.a(linkedHashMap));
        Um um = this.f37332e;
        um.getClass();
        byte[] stringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(um.a(b4));
        rVar.f39692k = stringToBytesForProtobuf3;
        int length = (StringUtils.stringToBytesForProtobuf(b4).length - stringToBytesForProtobuf3.length) + i4;
        if (this.f37329b) {
            rVar.f39682a = "autocollected".getBytes(Charsets.UTF_8);
        }
        return TuplesKt.to(MessageNano.toByteArray(rVar), Integer.valueOf(length));
    }
}
