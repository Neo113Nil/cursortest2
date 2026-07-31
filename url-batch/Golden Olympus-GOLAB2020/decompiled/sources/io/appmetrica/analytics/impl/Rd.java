package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Rd implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final C2628fh f38198a;

    /* renamed from: b, reason: collision with root package name */
    public final C0 f38199b;

    /* renamed from: c, reason: collision with root package name */
    public final C2491ae f38200c;

    public Rd(@NotNull C2628fh c2628fh, @NotNull C0 c02, @NotNull C2491ae c2491ae) {
        this.f38198a = c2628fh;
        this.f38199b = c02;
        this.f38200c = c2491ae;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@NotNull String str) {
        C2628fh c2628fh = this.f38198a;
        C0 c02 = this.f38199b;
        String str2 = c02.f37266a;
        String str3 = c02.f37267b;
        Integer valueOf = Integer.valueOf(c02.f37269d);
        C0 c03 = this.f38199b;
        C2771l4 c2771l4 = new C2771l4(str2, str3, valueOf, c03.f37270e, c03.f37268c);
        C2491ae c2491ae = this.f38200c;
        EnumC3063wb enumC3063wb = c2491ae.f38674b;
        B0 b02 = c2491ae.f38673a;
        String str4 = b02.f37199c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(b02.f37202f.f37266a);
        Set set = R9.f38186a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        C2694i4 c2694i4 = new C2694i4("", "", enumC3063wb.f40073a, orCreatePublicLogger);
        if (str != null) {
            c2694i4.f(str);
        }
        c2694i4.f39388m = bundle;
        c2694i4.f39378c = c2491ae.f38673a.f37202f.f37271f;
        c2628fh.a(c2771l4, c2694i4, new K4(new Zl(), new J4(), null));
    }
}
