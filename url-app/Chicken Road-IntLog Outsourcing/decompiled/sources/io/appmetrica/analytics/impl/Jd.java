package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* loaded from: classes.dex */
public final class Jd implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Xg f7008a;

    /* renamed from: b, reason: collision with root package name */
    public final F0 f7009b;

    /* renamed from: c, reason: collision with root package name */
    public final Sd f7010c;

    public Jd(Xg xg, F0 f02, Sd sd) {
        this.f7008a = xg;
        this.f7009b = f02;
        this.f7010c = sd;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(String str) {
        Xg xg = this.f7008a;
        F0 f02 = this.f7009b;
        String str2 = f02.f6761a;
        String str3 = f02.f6762b;
        Integer valueOf = Integer.valueOf(f02.f6764d);
        F0 f03 = this.f7009b;
        X3 x32 = new X3(str2, str3, valueOf, f03.f6765e, f03.f6763c);
        Sd sd = this.f7010c;
        EnumC0718ib enumC0718ib = sd.f7466b;
        E0 e02 = sd.f7465a;
        String str4 = e02.f6704c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(e02.f6707f.f6761a);
        Set set = D9.f6670a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        U3 u32 = new U3("", "", enumC0718ib.f8449a, orCreatePublicLogger);
        if (str != null) {
            u32.f(str);
        }
        u32.f7660m = bundle;
        u32.f7650c = sd.f7465a.f6707f.f6766f;
        xg.a(x32, u32, new C1073w4(new C0600dm(), new C1047v4(), null));
    }
}
