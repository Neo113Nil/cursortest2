package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import b2.C0190d;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class U3 extends W5 {

    /* renamed from: q, reason: collision with root package name */
    public HashMap f6747q;

    /* renamed from: r, reason: collision with root package name */
    public C0372an f6748r;

    /* renamed from: s, reason: collision with root package name */
    public Ym f6749s;

    /* renamed from: t, reason: collision with root package name */
    public Ym f6750t;

    /* renamed from: u, reason: collision with root package name */
    public C0533h3 f6751u;
    public C0372an v;

    public U3(PublicLogger publicLogger) {
        this.f6747q = new HashMap();
        a(publicLogger);
    }

    public static W5 b(String str, String str2) {
        W5 w5 = new W5("", 0);
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        w5.f6818d = 5376;
        w5.a(str, str2);
        return w5;
    }

    public static W5 n() {
        W5 w5 = new W5("", 0);
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        w5.f6818d = 5632;
        return w5;
    }

    public static W5 o() {
        W5 w5 = new W5("", 0);
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        w5.f6818d = 40961;
        return w5;
    }

    public final void a(String str, String str2, T3 t3) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.f6747q.remove(t3);
        } else {
            this.f6747q.put(t3, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.f6747q.values().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((Integer) it.next()).intValue();
        }
        this.f6820g = i3;
    }

    @Override // io.appmetrica.analytics.impl.W5
    public final void c(String str) {
        C0372an c0372an = this.v;
        c0372an.getClass();
        this.f6821h = c0372an.a(str);
    }

    public final String d(String str) {
        C0372an c0372an = this.f6748r;
        c0372an.getClass();
        String a3 = c0372an.a(str);
        a(str, a3, T3.NAME);
        return a3;
    }

    public final String e(String str) {
        Ym ym = this.f6749s;
        ym.getClass();
        String a3 = ym.a(str);
        a(str, a3, T3.VALUE);
        return a3;
    }

    public final U3 f(String str) {
        Ym ym = this.f6750t;
        ym.getClass();
        String a3 = ym.a(str);
        a(str, a3, T3.VALUE);
        this.f6816b = a3;
        return this;
    }

    public final HashMap<T3, Integer> p() {
        return this.f6747q;
    }

    @Override // io.appmetrica.analytics.impl.W5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(String str) {
        this.f6815a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.W5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(String str) {
        this.f6816b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.W5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        a(bArr);
    }

    public U3(String str, int i3, PublicLogger publicLogger) {
        this("", str, i3, publicLogger);
    }

    public U3(String str, String str2, int i3, PublicLogger publicLogger) {
        this(str, str2, i3, 0, publicLogger);
    }

    public U3(String str, String str2, int i3, int i4, PublicLogger publicLogger) {
        this.f6747q = new HashMap();
        a(publicLogger);
        this.f6816b = e(str);
        this.f6815a = d(str2);
        setType(i3);
        setCustomType(i4);
    }

    public final U3 a(HashMap<T3, Integer> hashMap) {
        this.f6747q = hashMap;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.f6748r = new C0372an(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "event name", publicLogger);
        this.f6749s = new Ym(245760, "event value", publicLogger);
        this.f6750t = new Ym(1024000, "event extended value", publicLogger);
        this.f6751u = new C0533h3(245760, "event value bytes", publicLogger);
        this.v = new C0372an(200, "user profile id", publicLogger);
    }

    public U3(byte[] bArr, String str, int i3, PublicLogger publicLogger) {
        this.f6747q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.f6815a = d(str);
        setType(i3);
    }

    public final void a(byte[] bArr) {
        C0533h3 c0533h3 = this.f6751u;
        c0533h3.getClass();
        byte[] a3 = c0533h3.a(bArr);
        T3 t3 = T3.VALUE;
        if (bArr.length != a3.length) {
            this.f6747q.put(t3, Integer.valueOf(bArr.length - a3.length));
        } else {
            this.f6747q.remove(t3);
        }
        Iterator it = this.f6747q.values().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((Integer) it.next()).intValue();
        }
        this.f6820g = i3;
        super.setValueBytes(a3);
    }

    public static W5 a(C0631ko c0631ko) {
        W5 o = o();
        o.setValue(new String(Base64.encode(MessageNano.toByteArray(c0631ko), 0)));
        return o;
    }

    public static U3 a(PublicLogger publicLogger, Ti ti) {
        int i3;
        U3 u3 = new U3(publicLogger);
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        u3.f6818d = 40976;
        Ri ri = new Ri();
        ri.f6567b = ti.f6714a.currency.getCurrencyCode().getBytes();
        ri.f = ti.f6714a.priceMicros;
        ri.f6568c = StringUtils.stringToBytesForProtobuf(new C0372an(200, "revenue productID", ti.f6718e).a(ti.f6714a.productID));
        ri.f6566a = ((Integer) WrapUtils.getOrDefault(ti.f6714a.quantity, 1)).intValue();
        Ym ym = ti.f6715b;
        String str = ti.f6714a.payload;
        ym.getClass();
        ri.f6569d = StringUtils.stringToBytesForProtobuf(ym.a(str));
        if (AbstractC0709no.a(ti.f6714a.receipt)) {
            Mi mi = new Mi();
            String str2 = (String) ti.f6716c.a(ti.f6714a.receipt.data);
            i3 = !StringUtils.equalsNullSafety(ti.f6714a.receipt.data, str2) ? ti.f6714a.receipt.data.length() : 0;
            String str3 = (String) ti.f6717d.a(ti.f6714a.receipt.signature);
            mi.f6344a = StringUtils.stringToBytesForProtobuf(str2);
            mi.f6345b = StringUtils.stringToBytesForProtobuf(str3);
            ri.f6570e = mi;
        } else {
            i3 = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(ri), Integer.valueOf(i3));
        u3.f6816b = u3.e(new String(Base64.encode((byte[]) pair.first, 0)));
        u3.f6820g = ((Integer) pair.second).intValue();
        return u3;
    }

    public static U3 a(PublicLogger publicLogger, E e3) {
        U3 u3 = new U3(publicLogger);
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        u3.f6818d = 40977;
        C0190d a3 = e3.a();
        u3.f6816b = u3.e(new String(Base64.encode((byte[]) a3.f2547a, 0)));
        u3.f6820g = ((Integer) a3.f2548b).intValue();
        return u3;
    }
}
