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
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final AdRevenue f817a;
    public final boolean b;
    public final InterfaceC0514t c;
    public final Ym d;
    public final Vm e;

    public E(AdRevenue adRevenue, boolean z, C0210gn c0210gn, PublicLogger publicLogger) {
        this.f817a = adRevenue;
        this.b = z;
        this.c = c0210gn;
        this.d = new Ym(100, "ad revenue strings", publicLogger);
        this.e = new Vm(30720, "ad revenue payload", publicLogger);
    }

    public final Pair a() {
        Map linkedHashMap;
        C0489s c0489s = new C0489s();
        int i = 0;
        for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(this.f817a.adNetwork, new C0614x(c0489s)), TuplesKt.to(this.f817a.adPlacementId, new C0639y(c0489s)), TuplesKt.to(this.f817a.adPlacementName, new C0664z(c0489s)), TuplesKt.to(this.f817a.adUnitId, new A(c0489s)), TuplesKt.to(this.f817a.adUnitName, new B(c0489s)), TuplesKt.to(this.f817a.precision, new C(c0489s)), TuplesKt.to(this.f817a.currency.getCurrencyCode(), new D(c0489s))})) {
            String str = (String) pair.getFirst();
            Function1 function1 = (Function1) pair.getSecond();
            Ym ym = this.d;
            ym.getClass();
            String a2 = ym.a(str);
            byte[] stringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] stringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(a2);
            function1.invoke(stringToBytesForProtobuf2);
            i += stringToBytesForProtobuf.length - stringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) F.f835a.get(this.f817a.adType);
        c0489s.d = num != null ? num.intValue() : 0;
        r rVar = new r();
        BigDecimal bigDecimal = this.f817a.adRevenue;
        BigInteger bigInteger = AbstractC0647y7.f1580a;
        int i2 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(AbstractC0647y7.f1580a) <= 0 && unscaledValue.compareTo(AbstractC0647y7.b) >= 0) {
                break;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i2++;
        }
        Pair pair2 = TuplesKt.to(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i2));
        long longValue = ((Number) pair2.getFirst()).longValue();
        int intValue = ((Number) pair2.getSecond()).intValue();
        rVar.f1460a = longValue;
        rVar.b = intValue;
        c0489s.b = rVar;
        Map<String, String> map = this.f817a.payload;
        InterfaceC0514t interfaceC0514t = this.c;
        if (map == null || (linkedHashMap = MapsKt.toMutableMap(map)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        String b = AbstractC0224hb.b(interfaceC0514t.a(linkedHashMap));
        Vm vm = this.e;
        vm.getClass();
        byte[] stringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(vm.a(b));
        c0489s.k = stringToBytesForProtobuf3;
        int length = (StringUtils.stringToBytesForProtobuf(b).length - stringToBytesForProtobuf3.length) + i;
        if (this.b) {
            c0489s.f1474a = "autocollected".getBytes(Charsets.UTF_8);
        }
        return TuplesKt.to(MessageNano.toByteArray(c0489s), Integer.valueOf(length));
    }
}
