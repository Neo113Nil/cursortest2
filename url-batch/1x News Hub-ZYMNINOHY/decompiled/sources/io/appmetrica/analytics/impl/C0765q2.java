package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765q2 extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final zo f8117b;

    /* renamed from: c, reason: collision with root package name */
    public final C0421ck f8118c;

    public C0765q2(C0457e5 c0457e5) {
        this(c0457e5, c0457e5.u(), C0421ck.c());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        C0457e5 c0457e5 = this.f6835a;
        if (!this.f8117b.c() && !this.f8117b.d()) {
            if (((C0754ph) c0457e5.f7234k.a()).f8083e) {
                this.f8118c.b();
            }
            R8 r8 = this.f6835a.f7235l;
            if (r8.f6548c == null) {
                r8.a();
            }
            T8 t8 = r8.f6548c;
            t8.getClass();
            t8.f6692b = new HashSet();
            t8.f6694d = 0;
            T8 t82 = r8.f6548c;
            t82.f6691a = true;
            W8 w8 = r8.f6547b;
            IBinaryDataHelper iBinaryDataHelper = w8.f6831c;
            V8 v8 = w8.f6830b;
            w8.f6829a.getClass();
            iBinaryDataHelper.insert("event_hashes", v8.toByteArray((V8) U8.a(t82)));
        }
        return false;
    }

    public C0765q2(C0457e5 c0457e5, zo zoVar, C0421ck c0421ck) {
        super(c0457e5);
        this.f8117b = zoVar;
        this.f8118c = c0421ck;
    }
}
