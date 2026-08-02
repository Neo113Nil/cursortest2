package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import c3.C0292d;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class M3 extends P5 {

    /* renamed from: q, reason: collision with root package name */
    public HashMap f10622q;

    /* renamed from: r, reason: collision with root package name */
    public Xm f10623r;

    /* renamed from: s, reason: collision with root package name */
    public Um f10624s;

    /* renamed from: t, reason: collision with root package name */
    public Um f10625t;

    /* renamed from: u, reason: collision with root package name */
    public Z2 f10626u;
    public Xm v;

    public M3(PublicLogger publicLogger) {
        this.f10622q = new HashMap();
        a(publicLogger);
    }

    public static P5 b(String str, String str2) {
        P5 p5 = new P5("", 0);
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        p5.f10797d = 5376;
        p5.a(str, str2);
        return p5;
    }

    public static P5 n() {
        P5 p5 = new P5("", 0);
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        p5.f10797d = 5632;
        return p5;
    }

    public static P5 o() {
        P5 p5 = new P5("", 0);
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        p5.f10797d = 40961;
        return p5;
    }

    public final void a(String str, String str2, L3 l32) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.f10622q.remove(l32);
        } else {
            this.f10622q.put(l32, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.f10622q.values().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((Integer) it.next()).intValue();
        }
        this.f10800g = i4;
    }

    @Override // io.appmetrica.analytics.impl.P5
    public final void c(String str) {
        Xm xm = this.v;
        xm.getClass();
        this.f10801h = xm.a(str);
    }

    public final String d(String str) {
        Xm xm = this.f10623r;
        xm.getClass();
        String a3 = xm.a(str);
        a(str, a3, L3.NAME);
        return a3;
    }

    public final String e(String str) {
        Um um = this.f10624s;
        um.getClass();
        String a3 = um.a(str);
        a(str, a3, L3.VALUE);
        return a3;
    }

    public final M3 f(String str) {
        Um um = this.f10625t;
        um.getClass();
        String a3 = um.a(str);
        a(str, a3, L3.VALUE);
        this.f10795b = a3;
        return this;
    }

    public final HashMap<L3, Integer> p() {
        return this.f10622q;
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(String str) {
        this.f10794a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(String str) {
        this.f10795b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        a(bArr);
    }

    public M3(String str, int i4, PublicLogger publicLogger) {
        this("", str, i4, publicLogger);
    }

    public M3(String str, String str2, int i4, PublicLogger publicLogger) {
        this(str, str2, i4, 0, publicLogger);
    }

    public M3(String str, String str2, int i4, int i5, PublicLogger publicLogger) {
        this.f10622q = new HashMap();
        a(publicLogger);
        this.f10795b = e(str);
        this.f10794a = d(str2);
        setType(i4);
        setCustomType(i5);
    }

    public final M3 a(HashMap<L3, Integer> hashMap) {
        this.f10622q = hashMap;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.f10623r = new Xm(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "event name", publicLogger);
        this.f10624s = new Um(245760, "event value", publicLogger);
        this.f10625t = new Um(1024000, "event extended value", publicLogger);
        this.f10626u = new Z2(245760, "event value bytes", publicLogger);
        this.v = new Xm(200, "user profile id", publicLogger);
    }

    public M3(byte[] bArr, String str, int i4, PublicLogger publicLogger) {
        this.f10622q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.f10794a = d(str);
        setType(i4);
    }

    public final void a(byte[] bArr) {
        Z2 z22 = this.f10626u;
        z22.getClass();
        byte[] a3 = z22.a(bArr);
        L3 l32 = L3.VALUE;
        if (bArr.length != a3.length) {
            this.f10622q.put(l32, Integer.valueOf(bArr.length - a3.length));
        } else {
            this.f10622q.remove(l32);
        }
        Iterator it = this.f10622q.values().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((Integer) it.next()).intValue();
        }
        this.f10800g = i4;
        super.setValueBytes(a3);
    }

    public static P5 a(C0701io c0701io) {
        P5 o = o();
        o.setValue(new String(Base64.encode(MessageNano.toByteArray(c0701io), 0)));
        return o;
    }

    public static M3 a(PublicLogger publicLogger, Oi oi) {
        int i4;
        M3 m32 = new M3(publicLogger);
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        m32.f10797d = 40976;
        Mi mi = new Mi();
        mi.f10665b = oi.f10758a.currency.getCurrencyCode().getBytes();
        mi.f10669f = oi.f10758a.priceMicros;
        mi.f10666c = StringUtils.stringToBytesForProtobuf(new Xm(200, "revenue productID", oi.f10762e).a(oi.f10758a.productID));
        mi.f10664a = ((Integer) WrapUtils.getOrDefault(oi.f10758a.quantity, 1)).intValue();
        Um um = oi.f10759b;
        String str = oi.f10758a.payload;
        um.getClass();
        mi.f10667d = StringUtils.stringToBytesForProtobuf(um.a(str));
        if (AbstractC0779lo.a(oi.f10758a.receipt)) {
            Hi hi = new Hi();
            String str2 = (String) oi.f10760c.a(oi.f10758a.receipt.data);
            i4 = !StringUtils.equalsNullSafety(oi.f10758a.receipt.data, str2) ? oi.f10758a.receipt.data.length() : 0;
            String str3 = (String) oi.f10761d.a(oi.f10758a.receipt.signature);
            hi.f10377a = StringUtils.stringToBytesForProtobuf(str2);
            hi.f10378b = StringUtils.stringToBytesForProtobuf(str3);
            mi.f10668e = hi;
        } else {
            i4 = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(mi), Integer.valueOf(i4));
        m32.f10795b = m32.e(new String(Base64.encode((byte[]) pair.first, 0)));
        m32.f10800g = ((Integer) pair.second).intValue();
        return m32;
    }

    public static M3 a(PublicLogger publicLogger, E e4) {
        M3 m32 = new M3(publicLogger);
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        m32.f10797d = 40977;
        C0292d a3 = e4.a();
        m32.f10795b = m32.e(new String(Base64.encode((byte[]) a3.f5724a, 0)));
        m32.f10800g = ((Integer) a3.f5725b).intValue();
        return m32;
    }
}
