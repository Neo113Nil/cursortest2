package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class Hn {

    /* renamed from: a, reason: collision with root package name */
    public final C2481a4 f37675a;

    /* renamed from: b, reason: collision with root package name */
    public final C3154zo f37676b;

    /* renamed from: c, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f37677c;

    public Hn(Toggle toggle) {
        C2481a4 c2481a4 = new C2481a4(Ia.j().x());
        this.f37675a = c2481a4;
        C3154zo c3154zo = new C3154zo();
        this.f37676b = c3154zo;
        this.f37677c = new ConjunctiveCompositeThreadSafeToggle(CollectionsKt.listOf((Object[]) new Toggle[]{c2481a4, c3154zo, toggle == null ? new C2972so() : toggle}), "loc-def");
    }
}
