package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.e9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461e9 extends Kf {

    /* renamed from: a, reason: collision with root package name */
    public final C0936wi f7258a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7259b;

    /* renamed from: c, reason: collision with root package name */
    public final C0948x4 f7260c;

    public C0461e9(C0457e5 c0457e5) {
        C0936wi c0936wi = new C0936wi(c0457e5);
        this.f7258a = c0936wi;
        this.f7260c = new C0948x4(c0936wi);
        this.f7259b = a();
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0567ib.EVENT_TYPE_ACTIVATION, new C0529h(this.f7258a));
        hashMap.put(EnumC0567ib.EVENT_TYPE_START, new Il(this.f7258a));
        hashMap.put(EnumC0567ib.EVENT_TYPE_REGULAR, new Lg(this.f7258a));
        C0748pb c0748pb = new C0748pb(this.f7258a);
        hashMap.put(EnumC0567ib.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c0748pb);
        hashMap.put(EnumC0567ib.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c0748pb);
        hashMap.put(EnumC0567ib.EVENT_TYPE_SEND_REFERRER, c0748pb);
        hashMap.put(EnumC0567ib.EVENT_TYPE_CUSTOM_EVENT, c0748pb);
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_SET_SESSION_EXTRA;
        C0936wi c0936wi = this.f7258a;
        hashMap.put(enumC0567ib, new Dl(c0936wi, c0936wi.f8592t));
        hashMap.put(EnumC0567ib.EVENT_TYPE_APP_OPEN, new Sg(this.f7258a));
        hashMap.put(EnumC0567ib.EVENT_TYPE_PURGE_BUFFER, new Wf(this.f7258a));
        hashMap.put(EnumC0567ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C1000z6(this.f7258a));
        hashMap.put(EnumC0567ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new Af(this.f7258a));
        hashMap.put(EnumC0567ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Xn(this.f7258a));
        hashMap.put(EnumC0567ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new Bf(this.f7258a));
        hashMap.put(EnumC0567ib.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new Wn(this.f7258a));
        hashMap.put(EnumC0567ib.EVENT_TYPE_ANR, c0748pb);
        EnumC0567ib enumC0567ib2 = EnumC0567ib.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C0936wi c0936wi2 = this.f7258a;
        hashMap.put(enumC0567ib2, new Dl(c0936wi2, c0936wi2.f8579e));
        EnumC0567ib enumC0567ib3 = EnumC0567ib.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C0936wi c0936wi3 = this.f7258a;
        hashMap.put(enumC0567ib3, new Dl(c0936wi3, c0936wi3.f));
        hashMap.put(EnumC0567ib.EVENT_TYPE_SEND_USER_PROFILE, c0748pb);
        EnumC0567ib enumC0567ib4 = EnumC0567ib.EVENT_TYPE_SET_USER_PROFILE_ID;
        C0936wi c0936wi4 = this.f7258a;
        hashMap.put(enumC0567ib4, new Dl(c0936wi4, c0936wi4.f8584k));
        hashMap.put(EnumC0567ib.EVENT_TYPE_SEND_REVENUE_EVENT, c0748pb);
        hashMap.put(EnumC0567ib.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c0748pb);
        hashMap.put(EnumC0567ib.EVENT_TYPE_CLEANUP, c0748pb);
        hashMap.put(EnumC0567ib.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c0748pb);
        hashMap.put(EnumC0567ib.EVENT_TYPE_WEBVIEW_SYNC, c0748pb);
        hashMap.put(EnumC0567ib.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new L9(this.f7258a));
        return hashMap;
    }

    public final C0936wi b() {
        return this.f7258a;
    }

    public final void a(EnumC0567ib enumC0567ib, AbstractC0902va abstractC0902va) {
        this.f7259b.put(enumC0567ib, abstractC0902va);
    }

    @Override // io.appmetrica.analytics.impl.Kf
    public final AbstractC0436d9 a(int i3) {
        LinkedList linkedList = new LinkedList();
        EnumC0567ib a3 = EnumC0567ib.a(i3);
        C0948x4 c0948x4 = this.f7260c;
        if (c0948x4 != null) {
            c0948x4.a(a3, linkedList);
        }
        AbstractC0902va abstractC0902va = (AbstractC0902va) this.f7259b.get(a3);
        if (abstractC0902va != null) {
            abstractC0902va.a(linkedList);
        }
        return new C0410c9(linkedList);
    }

    public final AbstractC0902va a(EnumC0567ib enumC0567ib) {
        return (AbstractC0902va) this.f7259b.get(enumC0567ib);
    }
}
