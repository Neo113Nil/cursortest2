package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.hh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2681hh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39148a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2498al f39149b;

    /* renamed from: c, reason: collision with root package name */
    public final Ib f39150c = new Ib();

    /* renamed from: d, reason: collision with root package name */
    public final K4 f39151d = new K4(new Zl(), new J4(), null);

    /* renamed from: e, reason: collision with root package name */
    public final Consumer f39152e;

    public C2681hh(Context context, final InterfaceC3136z6 interfaceC3136z6, final EnumC3063wb enumC3063wb, InterfaceC2498al interfaceC2498al) {
        this.f39148a = context;
        this.f39149b = interfaceC2498al;
        this.f39152e = new Consumer() { // from class: io.appmetrica.analytics.impl.lp
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                C2681hh.a(EnumC3063wb.this, interfaceC3136z6, this, (Eb) obj);
            }
        };
    }

    public static final void a(EnumC3063wb enumC3063wb, InterfaceC3136z6 interfaceC3136z6, C2681hh c2681hh, Eb eb) {
        String str = eb.f37436h;
        C2771l4 c2771l4 = new C2771l4(str, eb.f37433e, eb.f37434f, eb.f37435g, eb.f37437i);
        String str2 = eb.f37430b;
        byte[] bArr = eb.f37429a;
        int i4 = eb.f37431c;
        HashMap hashMap = eb.f37432d;
        String str3 = eb.f37438j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = R9.f38186a;
        C2694i4 c2694i4 = new C2694i4(bArr, str2, enumC3063wb.f40073a, orCreatePublicLogger);
        c2694i4.f39171q = hashMap;
        c2694i4.f39382g = i4;
        c2694i4.f39378c = str3;
        ((C2628fh) interfaceC3136z6).a(c2771l4, c2694i4, c2681hh.f39151d);
    }
}
