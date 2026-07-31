package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class Y8 extends Gf {

    /* renamed from: a, reason: collision with root package name */
    public final C0508si f1128a;
    public final HashMap b;
    public final C0469r4 c;

    public Y8(Y4 y4) {
        C0508si c0508si = new C0508si(y4);
        this.f1128a = c0508si;
        this.c = new C0469r4(c0508si);
        this.b = a();
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0095cb.EVENT_TYPE_ACTIVATION, new C0212h(this.f1128a));
        hashMap.put(EnumC0095cb.EVENT_TYPE_START, new Fl(this.f1128a));
        hashMap.put(EnumC0095cb.EVENT_TYPE_REGULAR, new Hg(this.f1128a));
        C0275jb c0275jb = new C0275jb(this.f1128a);
        hashMap.put(EnumC0095cb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c0275jb);
        hashMap.put(EnumC0095cb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c0275jb);
        hashMap.put(EnumC0095cb.EVENT_TYPE_SEND_REFERRER, c0275jb);
        hashMap.put(EnumC0095cb.EVENT_TYPE_CUSTOM_EVENT, c0275jb);
        EnumC0095cb enumC0095cb = EnumC0095cb.EVENT_TYPE_SET_SESSION_EXTRA;
        C0508si c0508si = this.f1128a;
        hashMap.put(enumC0095cb, new Al(c0508si, c0508si.t));
        hashMap.put(EnumC0095cb.EVENT_TYPE_APP_OPEN, new Og(this.f1128a));
        hashMap.put(EnumC0095cb.EVENT_TYPE_PURGE_BUFFER, new Sf(this.f1128a));
        hashMap.put(EnumC0095cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C0521t6(this.f1128a));
        hashMap.put(EnumC0095cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new C0605wf(this.f1128a));
        hashMap.put(EnumC0095cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Wn(this.f1128a));
        hashMap.put(EnumC0095cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new C0630xf(this.f1128a));
        hashMap.put(EnumC0095cb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new Vn(this.f1128a));
        hashMap.put(EnumC0095cb.EVENT_TYPE_ANR, c0275jb);
        EnumC0095cb enumC0095cb2 = EnumC0095cb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C0508si c0508si2 = this.f1128a;
        hashMap.put(enumC0095cb2, new Al(c0508si2, c0508si2.e));
        EnumC0095cb enumC0095cb3 = EnumC0095cb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C0508si c0508si3 = this.f1128a;
        hashMap.put(enumC0095cb3, new Al(c0508si3, c0508si3.f));
        hashMap.put(EnumC0095cb.EVENT_TYPE_SEND_USER_PROFILE, c0275jb);
        EnumC0095cb enumC0095cb4 = EnumC0095cb.EVENT_TYPE_SET_USER_PROFILE_ID;
        C0508si c0508si4 = this.f1128a;
        hashMap.put(enumC0095cb4, new Al(c0508si4, c0508si4.k));
        hashMap.put(EnumC0095cb.EVENT_TYPE_SEND_REVENUE_EVENT, c0275jb);
        hashMap.put(EnumC0095cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c0275jb);
        hashMap.put(EnumC0095cb.EVENT_TYPE_CLEANUP, c0275jb);
        hashMap.put(EnumC0095cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c0275jb);
        hashMap.put(EnumC0095cb.EVENT_TYPE_WEBVIEW_SYNC, c0275jb);
        hashMap.put(EnumC0095cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new F9(this.f1128a));
        return hashMap;
    }

    public final C0508si b() {
        return this.f1128a;
    }

    public final void a(EnumC0095cb enumC0095cb, AbstractC0426pa abstractC0426pa) {
        this.b.put(enumC0095cb, abstractC0426pa);
    }

    @Override // io.appmetrica.analytics.impl.Gf
    public final X8 a(int i) {
        LinkedList linkedList = new LinkedList();
        EnumC0095cb a2 = EnumC0095cb.a(i);
        C0469r4 c0469r4 = this.c;
        if (c0469r4 != null) {
            c0469r4.a(a2, linkedList);
        }
        AbstractC0426pa abstractC0426pa = (AbstractC0426pa) this.b.get(a2);
        if (abstractC0426pa != null) {
            abstractC0426pa.a(linkedList);
        }
        return new W8(linkedList);
    }

    public final AbstractC0426pa a(EnumC0095cb enumC0095cb) {
        return (AbstractC0426pa) this.b.get(enumC0095cb);
    }
}
