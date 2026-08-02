package com.startapp.sdk.internal;

import com.startapp.sdk.ads.external.config.AdUnitConfig;

/* loaded from: classes.dex */
public final /* synthetic */ class G implements l2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l2.l f3525b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o7 f3526c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f3527d;

    public /* synthetic */ G(l2.l lVar, o7 o7Var, AdUnitConfig adUnitConfig, int i3) {
        this.f3524a = i3;
        this.f3525b = lVar;
        this.f3526c = o7Var;
        this.f3527d = adUnitConfig;
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        int i3 = this.f3524a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i3) {
            case 0:
                return o7.b(this.f3525b, this.f3526c, this.f3527d, booleanValue);
            default:
                return o7.a(this.f3525b, this.f3526c, this.f3527d, booleanValue);
        }
    }
}
