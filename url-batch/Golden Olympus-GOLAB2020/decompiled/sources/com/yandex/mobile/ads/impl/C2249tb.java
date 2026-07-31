package com.yandex.mobile.ads.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.tb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2249tb implements ig0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2065lb f32271a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<InterfaceC2181qb> f32272b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private InterfaceC2295vb f32273c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private String f32274d;

    /* renamed from: com.yandex.mobile.ads.impl.tb$a */
    private final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2249tb.a(C2249tb.this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tb$b */
    private final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2249tb.this.f32271a.a(C2249tb.this.f32274d);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tb$c */
    private final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC2295vb interfaceC2295vb = C2249tb.this.f32273c;
            if (interfaceC2295vb != null) {
                interfaceC2295vb.a();
            }
        }
    }

    public C2249tb(@NotNull C2065lb optOutRenderer) {
        Intrinsics.checkNotNullParameter(optOutRenderer, "optOutRenderer");
        this.f32271a = optOutRenderer;
        this.f32272b = a();
    }

    public static final void a(C2249tb c2249tb) {
        InterfaceC2295vb interfaceC2295vb = c2249tb.f32273c;
        if (interfaceC2295vb != null) {
            interfaceC2295vb.b();
        }
    }

    public final void b(@Nullable String str) {
        this.f32274d = str;
    }

    public final void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            URI uri = new URI(url);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (InterfaceC2181qb interfaceC2181qb : this.f32272b) {
                if (interfaceC2181qb.a(scheme, host)) {
                    interfaceC2181qb.a();
                    return;
                }
            }
            InterfaceC2295vb interfaceC2295vb = this.f32273c;
            if (interfaceC2295vb != null) {
                interfaceC2295vb.a(url);
            }
        } catch (URISyntaxException unused) {
            ap0.f(new Object[0]);
            InterfaceC2295vb interfaceC2295vb2 = this.f32273c;
            if (interfaceC2295vb2 != null) {
                interfaceC2295vb2.b();
            }
        }
    }

    public final void a(@NotNull InterfaceC2295vb adtuneWebViewListener) {
        Intrinsics.checkNotNullParameter(adtuneWebViewListener, "adtuneWebViewListener");
        this.f32273c = adtuneWebViewListener;
    }

    @Override // com.yandex.mobile.ads.impl.ig0
    public final void a(int i4) {
        InterfaceC2295vb interfaceC2295vb;
        if (!new C2272ub().a(i4) || (interfaceC2295vb = this.f32273c) == null) {
            return;
        }
        interfaceC2295vb.b();
    }

    private final List<InterfaceC2181qb> a() {
        return CollectionsKt.listOf((Object[]) new C2318wb[]{new C2318wb("adtuneRendered", new c()), new C2318wb("adtuneClosed", new a()), new C2318wb("openOptOut", new b())});
    }
}
