package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class el0 implements nb3<Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cc3 f4655a;

    el0(fl0 fl0Var, cc3 cc3Var) {
        this.f4655a = cc3Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(Void r22) {
        List list;
        list = fl0.f5137m;
        list.remove(this.f4655a);
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        List list;
        list = fl0.f5137m;
        list.remove(this.f4655a);
    }
}
