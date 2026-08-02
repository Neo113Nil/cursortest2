package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class Zg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6949a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0473el f6950b;

    /* renamed from: c, reason: collision with root package name */
    public final C0877ub f6951c = new C0877ub();

    /* renamed from: d, reason: collision with root package name */
    public final C0922w4 f6952d = new C0922w4(new C0449dm(), new C0896v4(), null);

    /* renamed from: e, reason: collision with root package name */
    public final Consumer f6953e;

    public Zg(Context context, final InterfaceC0613k6 interfaceC0613k6, final EnumC0567ib enumC0567ib, InterfaceC0473el interfaceC0473el) {
        this.f6949a = context;
        this.f6950b = interfaceC0473el;
        this.f6953e = new Consumer() { // from class: io.appmetrica.analytics.impl.Ro
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Zg.a(EnumC0567ib.this, interfaceC0613k6, this, (C0774qb) obj);
            }
        };
    }

    public static final void a(EnumC0567ib enumC0567ib, InterfaceC0613k6 interfaceC0613k6, Zg zg, C0774qb c0774qb) {
        String str = c0774qb.f8156h;
        X3 x3 = new X3(str, c0774qb.f8154e, c0774qb.f, c0774qb.f8155g, c0774qb.f8157i);
        String str2 = c0774qb.f8151b;
        byte[] bArr = c0774qb.f8150a;
        int i3 = c0774qb.f8152c;
        HashMap hashMap = c0774qb.f8153d;
        String str3 = c0774qb.f8158j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = D9.f5886a;
        U3 u3 = new U3(bArr, str2, enumC0567ib.f7560a, orCreatePublicLogger);
        u3.f6747q = hashMap;
        u3.f6820g = i3;
        u3.f6817c = str3;
        ((Xg) interfaceC0613k6).a(x3, u3, zg.f6952d);
    }
}
