package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xj0 implements wb0, je2, ck0, e11, wo1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f34591a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f34592b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f34593c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f34594d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f34595e = new LinkedHashSet();

    public final void a(@NotNull wb0 forceImpressionTrackingListener) {
        Intrinsics.checkNotNullParameter(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f34591a.add(forceImpressionTrackingListener);
    }

    public final void b(@NotNull yj0 impressionTrackingListener) {
        Intrinsics.checkNotNullParameter(impressionTrackingListener, "impressionTrackingListener");
        this.f34593c.add(impressionTrackingListener);
    }

    public final void c(@NotNull yj0 videoImpressionTrackingListener) {
        Intrinsics.checkNotNullParameter(videoImpressionTrackingListener, "videoImpressionTrackingListener");
        this.f34592b.add(videoImpressionTrackingListener);
    }

    @Override // com.yandex.mobile.ads.impl.je2
    public final void d() {
        Iterator it = this.f34592b.iterator();
        while (it.hasNext()) {
            ((je2) it.next()).d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.e11
    public final void e() {
        Iterator it = this.f34595e.iterator();
        while (it.hasNext()) {
            ((e11) it.next()).e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.wo1
    public final void f() {
        Iterator it = this.f34593c.iterator();
        while (it.hasNext()) {
            ((wo1) it.next()).f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ck0
    public final void g() {
        Iterator it = this.f34594d.iterator();
        while (it.hasNext()) {
            ((ck0) it.next()).g();
        }
    }

    @Override // com.yandex.mobile.ads.impl.je2
    public final void h() {
        Iterator it = this.f34592b.iterator();
        while (it.hasNext()) {
            ((je2) it.next()).h();
        }
    }

    public final void a(@NotNull e11 mobileAdsSchemeImpressionListener) {
        Intrinsics.checkNotNullParameter(mobileAdsSchemeImpressionListener, "mobileAdsSchemeImpressionListener");
        this.f34595e.add(mobileAdsSchemeImpressionListener);
    }

    @Override // com.yandex.mobile.ads.impl.e11
    public final void b() {
        Iterator it = this.f34595e.iterator();
        while (it.hasNext()) {
            ((e11) it.next()).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ck0
    public final void c() {
        Iterator it = this.f34594d.iterator();
        while (it.hasNext()) {
            ((ck0) it.next()).c();
        }
    }

    public final void a(@NotNull yj0 impressionTrackingListener) {
        Intrinsics.checkNotNullParameter(impressionTrackingListener, "impressionTrackingListener");
        this.f34594d.add(impressionTrackingListener);
    }

    @Override // com.yandex.mobile.ads.impl.wb0
    public final void a() {
        Iterator it = this.f34591a.iterator();
        while (it.hasNext()) {
            ((wb0) it.next()).a();
        }
    }
}
