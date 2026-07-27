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
    public final Context f7789a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0624el f7790b;

    /* renamed from: c, reason: collision with root package name */
    public final C1028ub f7791c = new C1028ub();

    /* renamed from: d, reason: collision with root package name */
    public final C1073w4 f7792d = new C1073w4(new C0600dm(), new C1047v4(), null);

    /* renamed from: e, reason: collision with root package name */
    public final Consumer f7793e;

    public Zg(Context context, final InterfaceC0764k6 interfaceC0764k6, final EnumC0718ib enumC0718ib, InterfaceC0624el interfaceC0624el) {
        this.f7789a = context;
        this.f7790b = interfaceC0624el;
        this.f7793e = new Consumer() { // from class: io.appmetrica.analytics.impl.Ro
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Zg.a(EnumC0718ib.this, interfaceC0764k6, this, (C0925qb) obj);
            }
        };
    }

    public static final void a(EnumC0718ib enumC0718ib, InterfaceC0764k6 interfaceC0764k6, Zg zg, C0925qb c0925qb) {
        String str = c0925qb.f9089h;
        X3 x32 = new X3(str, c0925qb.f9086e, c0925qb.f9087f, c0925qb.f9088g, c0925qb.f9090i);
        String str2 = c0925qb.f9083b;
        byte[] bArr = c0925qb.f9082a;
        int i2 = c0925qb.f9084c;
        HashMap hashMap = c0925qb.f9085d;
        String str3 = c0925qb.f9091j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = D9.f6670a;
        U3 u32 = new U3(bArr, str2, enumC0718ib.f8449a, orCreatePublicLogger);
        u32.f7578q = hashMap;
        u32.f7654g = i2;
        u32.f7650c = str3;
        ((Xg) interfaceC0764k6).a(x32, u32, zg.f7792d);
    }
}
