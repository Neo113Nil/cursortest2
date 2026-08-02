package com.startapp.sdk.internal;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerCreator;
import com.startapp.sdk.ads.banner.BannerListener;

/* loaded from: classes.dex */
public final class m1 implements BannerCreator {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.banner.d f4124c;

    public m1(com.startapp.sdk.ads.banner.d dVar, View view) {
        this.f4124c = dVar;
        this.f4123b = view;
    }

    @Override // com.startapp.sdk.ads.banner.BannerCreator
    public final View create(Context context, BannerListener bannerListener) {
        if (this.f4122a) {
            throw new IllegalStateException();
        }
        com.startapp.sdk.ads.banner.d dVar = this.f4124c;
        dVar.f3065a = bannerListener;
        View view = this.f4123b;
        dVar.f3066b = view;
        view.addOnAttachStateChangeListener(new l1(this));
        this.f4122a = true;
        return this.f4123b;
    }
}
