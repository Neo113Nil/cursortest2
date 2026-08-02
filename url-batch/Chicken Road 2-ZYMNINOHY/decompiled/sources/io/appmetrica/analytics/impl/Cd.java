package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* loaded from: classes.dex */
public final class Cd implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Sg f10159a;

    /* renamed from: b, reason: collision with root package name */
    public final H0 f10160b;

    /* renamed from: c, reason: collision with root package name */
    public final Ld f10161c;

    public Cd(Sg sg, H0 h02, Ld ld) {
        this.f10159a = sg;
        this.f10160b = h02;
        this.f10161c = ld;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(String str) {
        Sg sg = this.f10159a;
        H0 h02 = this.f10160b;
        String str2 = h02.f10348a;
        String str3 = h02.f10349b;
        Integer valueOf = Integer.valueOf(h02.f10351d);
        H0 h03 = this.f10160b;
        P3 p32 = new P3(str2, str3, valueOf, h03.f10352e, h03.f10350c);
        Ld ld = this.f10161c;
        EnumC0508bb enumC0508bb = ld.f10596b;
        G0 g02 = ld.f10595a;
        String str4 = g02.f10302c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(g02.f10305f.f10348a);
        Set set = AbstractC1049w9.f12924a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        M3 m32 = new M3("", "", enumC0508bb.f11531a, orCreatePublicLogger);
        if (str != null) {
            m32.f(str);
        }
        m32.f10806m = bundle;
        m32.f10796c = ld.f10595a.f10305f.f10353f;
        sg.a(p32, m32, new C0863p4(new Zl(), new C0837o4(), null));
    }
}
