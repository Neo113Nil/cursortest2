package com.startapp.sdk.internal;

import com.startapp.sdk.ads.external.config.AdUnitConfig;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final /* synthetic */ class I implements InterfaceC1339l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1339l f6625b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o7 f6626c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f6627d;

    public /* synthetic */ I(InterfaceC1339l interfaceC1339l, o7 o7Var, AdUnitConfig adUnitConfig, int i4) {
        this.f6624a = i4;
        this.f6625b = interfaceC1339l;
        this.f6626c = o7Var;
        this.f6627d = adUnitConfig;
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        int i4 = this.f6624a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i4) {
            case 0:
                return o7.b(this.f6625b, this.f6626c, this.f6627d, booleanValue);
            default:
                return o7.a(this.f6625b, this.f6626c, this.f6627d, booleanValue);
        }
    }
}
