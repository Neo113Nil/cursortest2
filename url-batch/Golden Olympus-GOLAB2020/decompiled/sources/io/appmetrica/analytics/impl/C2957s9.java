package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.s9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2957s9 extends Qf {

    /* renamed from: a, reason: collision with root package name */
    public final Ei f39788a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f39789b;

    /* renamed from: c, reason: collision with root package name */
    public final L4 f39790c;

    public C2957s9(C2953s5 c2953s5) {
        Ei ei = new Ei(c2953s5);
        this.f39788a = ei;
        this.f39790c = new L4(ei);
        this.f39789b = a();
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC3063wb.EVENT_TYPE_ACTIVATION, new C2663h(this.f39788a));
        hashMap.put(EnumC3063wb.EVENT_TYPE_START, new El(this.f39788a));
        hashMap.put(EnumC3063wb.EVENT_TYPE_REGULAR, new Tg(this.f39788a));
        Db db = new Db(this.f39788a);
        hashMap.put(EnumC3063wb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, db);
        hashMap.put(EnumC3063wb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, db);
        hashMap.put(EnumC3063wb.EVENT_TYPE_SEND_REFERRER, db);
        hashMap.put(EnumC3063wb.EVENT_TYPE_CUSTOM_EVENT, db);
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_SET_SESSION_EXTRA;
        Ei ei = this.f39788a;
        hashMap.put(enumC3063wb, new C3151zl(ei, ei.f37471t));
        hashMap.put(EnumC3063wb.EVENT_TYPE_APP_OPEN, new C2494ah(this.f39788a));
        hashMap.put(EnumC3063wb.EVENT_TYPE_PURGE_BUFFER, new C2600eg(this.f39788a));
        hashMap.put(EnumC3063wb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new N6(this.f39788a));
        hashMap.put(EnumC3063wb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new Jf(this.f39788a));
        hashMap.put(EnumC3063wb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Sn(this.f39788a));
        hashMap.put(EnumC3063wb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new Kf(this.f39788a));
        hashMap.put(EnumC3063wb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new Rn(this.f39788a));
        hashMap.put(EnumC3063wb.EVENT_TYPE_ANR, db);
        EnumC3063wb enumC3063wb2 = EnumC3063wb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        Ei ei2 = this.f39788a;
        hashMap.put(enumC3063wb2, new C3151zl(ei2, ei2.f37456e));
        EnumC3063wb enumC3063wb3 = EnumC3063wb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        Ei ei3 = this.f39788a;
        hashMap.put(enumC3063wb3, new C3151zl(ei3, ei3.f37457f));
        hashMap.put(EnumC3063wb.EVENT_TYPE_SEND_USER_PROFILE, db);
        EnumC3063wb enumC3063wb4 = EnumC3063wb.EVENT_TYPE_SET_USER_PROFILE_ID;
        Ei ei4 = this.f39788a;
        hashMap.put(enumC3063wb4, new C3151zl(ei4, ei4.f37462k));
        hashMap.put(EnumC3063wb.EVENT_TYPE_SEND_REVENUE_EVENT, db);
        hashMap.put(EnumC3063wb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, db);
        hashMap.put(EnumC3063wb.EVENT_TYPE_CLEANUP, db);
        hashMap.put(EnumC3063wb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, db);
        hashMap.put(EnumC3063wb.EVENT_TYPE_WEBVIEW_SYNC, db);
        hashMap.put(EnumC3063wb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new Z9(this.f39788a));
        return hashMap;
    }

    public final Ei b() {
        return this.f39788a;
    }

    public final void a(EnumC3063wb enumC3063wb, Ja ja) {
        this.f39789b.put(enumC3063wb, ja);
    }

    @Override // io.appmetrica.analytics.impl.Qf
    public final AbstractC2931r9 a(int i4) {
        LinkedList linkedList = new LinkedList();
        EnumC3063wb a4 = EnumC3063wb.a(i4);
        L4 l4 = this.f39790c;
        if (l4 != null) {
            l4.a(a4, linkedList);
        }
        Ja ja = (Ja) this.f39789b.get(a4);
        if (ja != null) {
            ja.a(linkedList);
        }
        return new C2906q9(linkedList);
    }

    public final Ja a(EnumC3063wb enumC3063wb) {
        return (Ja) this.f39789b.get(enumC3063wb);
    }
}
