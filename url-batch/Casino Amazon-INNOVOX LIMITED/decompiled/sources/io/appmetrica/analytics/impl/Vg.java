package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes3.dex */
public final class Vg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1091a;
    public final InterfaceC0079bl b;
    public final C0402ob c = new C0402ob();
    public final C0445q4 d = new C0445q4(new C0054am(), new C0420p4(), null);
    public final Consumer e;

    public Vg(Context context, final InterfaceC0141e6 interfaceC0141e6, final EnumC0095cb enumC0095cb, InterfaceC0079bl interfaceC0079bl) {
        this.f1091a = context;
        this.b = interfaceC0079bl;
        this.e = new Consumer() { // from class: io.appmetrica.analytics.impl.Vg$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Vg.a(EnumC0095cb.this, interfaceC0141e6, this, (C0301kb) obj);
            }
        };
    }

    public static final void a(EnumC0095cb enumC0095cb, InterfaceC0141e6 interfaceC0141e6, Vg vg, C0301kb c0301kb) {
        String str = c0301kb.h;
        Q3 q3 = new Q3(str, c0301kb.e, c0301kb.f, c0301kb.g, c0301kb.i);
        String str2 = c0301kb.b;
        byte[] bArr = c0301kb.f1340a;
        int i = c0301kb.c;
        HashMap hashMap = c0301kb.d;
        String str3 = c0301kb.j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = AbstractC0624x9.f1563a;
        N3 n3 = new N3(bArr, str2, enumC0095cb.f1195a, orCreatePublicLogger);
        n3.q = hashMap;
        n3.g = i;
        n3.c = str3;
        ((Tg) interfaceC0141e6).a(q3, n3, vg.d);
    }
}
