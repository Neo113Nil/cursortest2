package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* loaded from: classes.dex */
public final class Jd implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Xg f6206a;

    /* renamed from: b, reason: collision with root package name */
    public final F0 f6207b;

    /* renamed from: c, reason: collision with root package name */
    public final Sd f6208c;

    public Jd(Xg xg, F0 f02, Sd sd) {
        this.f6206a = xg;
        this.f6207b = f02;
        this.f6208c = sd;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(String str) {
        Xg xg = this.f6206a;
        F0 f02 = this.f6207b;
        String str2 = f02.f5972a;
        String str3 = f02.f5973b;
        Integer valueOf = Integer.valueOf(f02.f5975d);
        F0 f03 = this.f6207b;
        X3 x3 = new X3(str2, str3, valueOf, f03.f5976e, f03.f5974c);
        Sd sd = this.f6208c;
        EnumC0567ib enumC0567ib = sd.f6640b;
        E0 e02 = sd.f6639a;
        String str4 = e02.f5918c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(e02.f.f5972a);
        Set set = D9.f5886a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        U3 u3 = new U3("", "", enumC0567ib.f7560a, orCreatePublicLogger);
        if (str != null) {
            u3.f(str);
        }
        u3.f6826m = bundle;
        u3.f6817c = sd.f6639a.f.f;
        xg.a(x3, u3, new C0922w4(new C0449dm(), new C0896v4(), null));
    }
}
