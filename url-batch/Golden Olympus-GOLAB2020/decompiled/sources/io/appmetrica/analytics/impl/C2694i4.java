package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.i4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2694i4 extends C2773l6 {

    /* renamed from: q, reason: collision with root package name */
    public HashMap f39171q;

    /* renamed from: r, reason: collision with root package name */
    public Wm f39172r;

    /* renamed from: s, reason: collision with root package name */
    public Um f39173s;

    /* renamed from: t, reason: collision with root package name */
    public Um f39174t;

    /* renamed from: u, reason: collision with root package name */
    public C3029v3 f39175u;

    /* renamed from: v, reason: collision with root package name */
    public Wm f39176v;

    public C2694i4(@NonNull PublicLogger publicLogger) {
        this.f39171q = new HashMap();
        a(publicLogger);
    }

    public static C2773l6 b(String str, String str2) {
        C2773l6 c2773l6 = new C2773l6("", 0);
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        c2773l6.f39379d = 5376;
        c2773l6.a(str, str2);
        return c2773l6;
    }

    public static C2773l6 n() {
        C2773l6 c2773l6 = new C2773l6("", 0);
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        c2773l6.f39379d = 5632;
        return c2773l6;
    }

    public static C2773l6 o() {
        C2773l6 c2773l6 = new C2773l6("", 0);
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        c2773l6.f39379d = 40961;
        return c2773l6;
    }

    public final void a(String str, String str2, EnumC2668h4 enumC2668h4) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.f39171q.remove(enumC2668h4);
        } else {
            this.f39171q.put(enumC2668h4, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.f39171q.values().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((Integer) it.next()).intValue();
        }
        this.f39382g = i4;
    }

    @Override // io.appmetrica.analytics.impl.C2773l6
    @NonNull
    public final void c(String str) {
        Wm wm = this.f39176v;
        wm.getClass();
        this.f39383h = wm.a(str);
    }

    public final String d(String str) {
        Wm wm = this.f39172r;
        wm.getClass();
        String a4 = wm.a(str);
        a(str, a4, EnumC2668h4.NAME);
        return a4;
    }

    public final String e(String str) {
        Um um = this.f39173s;
        um.getClass();
        String a4 = um.a(str);
        a(str, a4, EnumC2668h4.VALUE);
        return a4;
    }

    public final C2694i4 f(@NonNull String str) {
        Um um = this.f39174t;
        um.getClass();
        String a4 = um.a(str);
        a(str, a4, EnumC2668h4.VALUE);
        this.f39377b = a4;
        return this;
    }

    @NonNull
    public final HashMap<EnumC2668h4, Integer> p() {
        return this.f39171q;
    }

    @Override // io.appmetrica.analytics.impl.C2773l6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(String str) {
        this.f39376a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.C2773l6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(String str) {
        this.f39377b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.C2773l6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        a(bArr);
    }

    public C2694i4(String str, int i4, @NonNull PublicLogger publicLogger) {
        this("", str, i4, publicLogger);
    }

    public C2694i4(String str, String str2, int i4, @NonNull PublicLogger publicLogger) {
        this(str, str2, i4, 0, publicLogger);
    }

    public C2694i4(String str, String str2, int i4, int i5, @NonNull PublicLogger publicLogger) {
        this.f39171q = new HashMap();
        a(publicLogger);
        this.f39377b = e(str);
        this.f39376a = d(str2);
        setType(i4);
        setCustomType(i5);
    }

    public final C2694i4 a(@NonNull HashMap<EnumC2668h4, Integer> hashMap) {
        this.f39171q = hashMap;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.f39172r = new Wm(1000, "event name", publicLogger);
        this.f39173s = new Um(245760, "event value", publicLogger);
        this.f39174t = new Um(1024000, "event extended value", publicLogger);
        this.f39175u = new C3029v3(245760, "event value bytes", publicLogger);
        this.f39176v = new Wm(200, "user profile id", publicLogger);
    }

    public C2694i4(byte[] bArr, String str, int i4, @NonNull PublicLogger publicLogger) {
        this.f39171q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.f39376a = d(str);
        setType(i4);
    }

    public final void a(byte[] bArr) {
        C3029v3 c3029v3 = this.f39175u;
        c3029v3.getClass();
        byte[] a4 = c3029v3.a(bArr);
        EnumC2668h4 enumC2668h4 = EnumC2668h4.VALUE;
        if (bArr.length != a4.length) {
            this.f39171q.put(enumC2668h4, Integer.valueOf(bArr.length - a4.length));
        } else {
            this.f39171q.remove(enumC2668h4);
        }
        Iterator it = this.f39171q.values().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((Integer) it.next()).intValue();
        }
        this.f39382g = i4;
        super.setValueBytes(a4);
    }

    public static C2773l6 a(@NonNull C2635fo c2635fo) {
        C2773l6 o4 = o();
        o4.setValue(new String(Base64.encode(MessageNano.toByteArray(c2635fo), 0)));
        return o4;
    }

    public static C2694i4 a(PublicLogger publicLogger, C2523bj c2523bj) {
        int i4;
        C2694i4 c2694i4 = new C2694i4(publicLogger);
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        c2694i4.f39379d = 40976;
        Zi zi = new Zi();
        zi.f38633b = c2523bj.f38732a.currency.getCurrencyCode().getBytes();
        zi.f38637f = c2523bj.f38732a.priceMicros;
        zi.f38634c = StringUtils.stringToBytesForProtobuf(new Wm(200, "revenue productID", c2523bj.f38736e).a(c2523bj.f38732a.productID));
        zi.f38632a = ((Integer) WrapUtils.getOrDefault(c2523bj.f38732a.quantity, 1)).intValue();
        Um um = c2523bj.f38733b;
        String str = c2523bj.f38732a.payload;
        um.getClass();
        zi.f38635d = StringUtils.stringToBytesForProtobuf(um.a(str));
        if (AbstractC2713io.a(c2523bj.f38732a.receipt)) {
            Ui ui = new Ui();
            String str2 = (String) c2523bj.f38734c.a(c2523bj.f38732a.receipt.data);
            i4 = !StringUtils.equalsNullSafety(c2523bj.f38732a.receipt.data, str2) ? c2523bj.f38732a.receipt.data.length() : 0;
            String str3 = (String) c2523bj.f38735d.a(c2523bj.f38732a.receipt.signature);
            ui.f38375a = StringUtils.stringToBytesForProtobuf(str2);
            ui.f38376b = StringUtils.stringToBytesForProtobuf(str3);
            zi.f38636e = ui;
        } else {
            i4 = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(zi), Integer.valueOf(i4));
        c2694i4.f39377b = c2694i4.e(new String(Base64.encode((byte[]) pair.first, 0)));
        c2694i4.f39382g = ((Integer) pair.second).intValue();
        return c2694i4;
    }

    public static C2694i4 a(PublicLogger publicLogger, D d4) {
        C2694i4 c2694i4 = new C2694i4(publicLogger);
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        c2694i4.f39379d = 40977;
        kotlin.Pair a4 = d4.a();
        c2694i4.f39377b = c2694i4.e(new String(Base64.encode((byte[]) a4.getFirst(), 0)));
        c2694i4.f39382g = ((Integer) a4.getSecond()).intValue();
        return c2694i4;
    }
}
