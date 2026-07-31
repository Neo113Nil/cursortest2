package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class Ln {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f942a;
    public final Eo b;
    public final ConjunctiveCompositeThreadSafeToggle c;

    public Ln(Toggle toggle) {
        F3 f3 = new F3(C0401oa.k().y());
        this.f942a = f3;
        Eo eo = new Eo();
        this.b = eo;
        Toggle[] toggleArr = new Toggle[3];
        toggleArr[0] = f3;
        toggleArr[1] = eo;
        toggleArr[2] = toggle == null ? new wo() : toggle;
        this.c = new ConjunctiveCompositeThreadSafeToggle(CollectionsKt.listOf((Object[]) toggleArr), "loc-def");
    }
}
