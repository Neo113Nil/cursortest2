package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class O4 {

    /* renamed from: a, reason: collision with root package name */
    public final C0645y5 f982a;
    public final Fc b;
    public final Fc c;

    public O4(M6 m6, Rg rg) {
        C0554ue c0554ue = new C0554ue(m6);
        this.f982a = new C0645y5(m6);
        this.b = new Fc(c0554ue, new N4(rg));
        this.c = new Fc(c0554ue, M4.f948a);
    }

    public final List<G8> a() {
        return CollectionsKt.listOf((Object[]) new G8[]{this.f982a, this.b});
    }

    public final List<G8> b() {
        return CollectionsKt.listOf(this.c);
    }
}
