package com.google.android.gms.internal.ads;

import java.util.Objects;
import k2.C4643n;
import v2.AbstractC5123a;
import v2.AbstractC5124b;

/* renamed from: com.google.android.gms.internal.ads.Wo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2850Wo extends AbstractC5124b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f28468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC2948ap f28469f;

    public C2850Wo(BinderC2948ap binderC2948ap, String str) {
        this.f28468e = str;
        Objects.requireNonNull(binderC2948ap);
        this.f28469f = binderC2948ap;
    }

    @Override // k2.x
    public final void onAdFailedToLoad(C4643n c4643n) {
        this.f28469f.H3(BinderC2948ap.K3(c4643n));
    }

    @Override // k2.x
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        this.f28469f.G3((AbstractC5123a) obj, this.f28468e);
    }
}
