package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class X8 extends Ff {

    /* renamed from: a, reason: collision with root package name */
    public final C0928ri f11255a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f11256b;

    /* renamed from: c, reason: collision with root package name */
    public final C0889q4 f11257c;

    public X8(X4 x4) {
        C0928ri c0928ri = new C0928ri(x4);
        this.f11255a = c0928ri;
        this.f11257c = new C0889q4(c0928ri);
        this.f11256b = a();
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0508bb.EVENT_TYPE_ACTIVATION, new C0651h(this.f11255a));
        hashMap.put(EnumC0508bb.EVENT_TYPE_START, new El(this.f11255a));
        hashMap.put(EnumC0508bb.EVENT_TYPE_REGULAR, new Gg(this.f11255a));
        C0689ib c0689ib = new C0689ib(this.f11255a);
        hashMap.put(EnumC0508bb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c0689ib);
        hashMap.put(EnumC0508bb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c0689ib);
        hashMap.put(EnumC0508bb.EVENT_TYPE_SEND_REFERRER, c0689ib);
        hashMap.put(EnumC0508bb.EVENT_TYPE_CUSTOM_EVENT, c0689ib);
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_SET_SESSION_EXTRA;
        C0928ri c0928ri = this.f11255a;
        hashMap.put(enumC0508bb, new C1139zl(c0928ri, c0928ri.f12679t));
        hashMap.put(EnumC0508bb.EVENT_TYPE_APP_OPEN, new Ng(this.f11255a));
        hashMap.put(EnumC0508bb.EVENT_TYPE_PURGE_BUFFER, new Rf(this.f11255a));
        hashMap.put(EnumC0508bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C0942s6(this.f11255a));
        hashMap.put(EnumC0508bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new C1029vf(this.f11255a));
        hashMap.put(EnumC0508bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Vn(this.f11255a));
        hashMap.put(EnumC0508bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new C1055wf(this.f11255a));
        hashMap.put(EnumC0508bb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new Un(this.f11255a));
        hashMap.put(EnumC0508bb.EVENT_TYPE_ANR, c0689ib);
        EnumC0508bb enumC0508bb2 = EnumC0508bb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C0928ri c0928ri2 = this.f11255a;
        hashMap.put(enumC0508bb2, new C1139zl(c0928ri2, c0928ri2.f12666e));
        EnumC0508bb enumC0508bb3 = EnumC0508bb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C0928ri c0928ri3 = this.f11255a;
        hashMap.put(enumC0508bb3, new C1139zl(c0928ri3, c0928ri3.f12667f));
        hashMap.put(EnumC0508bb.EVENT_TYPE_SEND_USER_PROFILE, c0689ib);
        EnumC0508bb enumC0508bb4 = EnumC0508bb.EVENT_TYPE_SET_USER_PROFILE_ID;
        C0928ri c0928ri4 = this.f11255a;
        hashMap.put(enumC0508bb4, new C1139zl(c0928ri4, c0928ri4.f12672k));
        hashMap.put(EnumC0508bb.EVENT_TYPE_SEND_REVENUE_EVENT, c0689ib);
        hashMap.put(EnumC0508bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c0689ib);
        hashMap.put(EnumC0508bb.EVENT_TYPE_CLEANUP, c0689ib);
        hashMap.put(EnumC0508bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c0689ib);
        hashMap.put(EnumC0508bb.EVENT_TYPE_WEBVIEW_SYNC, c0689ib);
        hashMap.put(EnumC0508bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new E9(this.f11255a));
        return hashMap;
    }

    public final C0928ri b() {
        return this.f11255a;
    }

    public final void a(EnumC0508bb enumC0508bb, AbstractC0843oa abstractC0843oa) {
        this.f11256b.put(enumC0508bb, abstractC0843oa);
    }

    @Override // io.appmetrica.analytics.impl.Ff
    public final W8 a(int i4) {
        LinkedList linkedList = new LinkedList();
        EnumC0508bb a3 = EnumC0508bb.a(i4);
        C0889q4 c0889q4 = this.f11257c;
        if (c0889q4 != null) {
            c0889q4.a(a3, linkedList);
        }
        AbstractC0843oa abstractC0843oa = (AbstractC0843oa) this.f11256b.get(a3);
        if (abstractC0843oa != null) {
            abstractC0843oa.a(linkedList);
        }
        return new V8(linkedList);
    }

    public final AbstractC0843oa a(EnumC0508bb enumC0508bb) {
        return (AbstractC0843oa) this.f11256b.get(enumC0508bb);
    }
}
