package com.startapp.sdk.internal;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerCreator;
import com.startapp.sdk.ads.banner.BannerListener;

/* loaded from: classes.dex */
public final class m1 implements BannerCreator {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.banner.d f7252c;

    public m1(com.startapp.sdk.ads.banner.d dVar, View view) {
        this.f7252c = dVar;
        this.f7251b = view;
    }

    @Override // com.startapp.sdk.ads.banner.BannerCreator
    public final View create(Context context, BannerListener bannerListener) {
        if (this.f7250a) {
            throw new IllegalStateException();
        }
        com.startapp.sdk.ads.banner.d dVar = this.f7252c;
        dVar.f6145a = bannerListener;
        View view = this.f7251b;
        dVar.f6146b = view;
        view.addOnAttachStateChangeListener(new l1(this));
        this.f7250a = true;
        return this.f7251b;
    }
}
