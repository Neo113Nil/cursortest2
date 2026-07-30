package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Hj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2590Hj implements InterfaceC3005br {

    /* renamed from: a, reason: collision with root package name */
    public final List f25413a;

    public C2590Hj(List list) {
        this.f25413a = list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3005br
    public final void m() {
        for (J3.a aVar : this.f25413a) {
            C2837Wb c2837Wb = new C2837Wb(28);
            aVar.c(new MD(0, aVar, c2837Wb), HD.f25326n);
        }
    }

    public C2590Hj(AbstractC2539Ej abstractC2539Ej) {
        this.f25413a = Collections.singletonList(C3686oN.c(abstractC2539Ej));
    }
}
