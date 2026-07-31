package com.yandex.mobile.ads.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.nb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2112nb implements ig0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ye1 f29529a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<InterfaceC2181qb> f29530b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private InterfaceC2135ob f29531c;

    /* renamed from: com.yandex.mobile.ads.impl.nb$a */
    private final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2112nb.this.f29529a.b();
        }
    }

    public C2112nb(@NotNull ye1 optOutRepository) {
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        this.f29529a = optOutRepository;
        this.f29530b = a();
    }

    public final void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            URI uri = new URI(url);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (InterfaceC2181qb interfaceC2181qb : this.f29530b) {
                if (interfaceC2181qb.a(scheme, host)) {
                    interfaceC2181qb.a();
                    return;
                }
            }
        } catch (URISyntaxException unused) {
            ap0.f(new Object[0]);
        }
    }

    public final void a(@NotNull InterfaceC2135ob adtuneOptOutWebViewListener) {
        Intrinsics.checkNotNullParameter(adtuneOptOutWebViewListener, "adtuneOptOutWebViewListener");
        this.f29531c = adtuneOptOutWebViewListener;
    }

    private final List<InterfaceC2181qb> a() {
        return CollectionsKt.listOf(new C2318wb("noInterestAd", new a()));
    }

    @Override // com.yandex.mobile.ads.impl.ig0
    public final void a(int i4) {
        InterfaceC2135ob interfaceC2135ob;
        if (!new C2272ub().a(i4) || (interfaceC2135ob = this.f29531c) == null) {
            return;
        }
        interfaceC2135ob.a();
    }
}
