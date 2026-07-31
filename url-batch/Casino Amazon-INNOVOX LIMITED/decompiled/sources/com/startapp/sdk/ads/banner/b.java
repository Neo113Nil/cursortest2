package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.internal.h1;
import com.startapp.sdk.internal.i1;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class b implements BannerCreator {

    /* renamed from: a, reason: collision with root package name */
    public boolean f73a;
    public final /* synthetic */ c b;

    public b(c cVar) {
        this.b = cVar;
    }

    @Override // com.startapp.sdk.ads.banner.BannerCreator
    public final View create(Context context, BannerListener bannerListener) {
        BannerStandard mrec;
        if (this.f73a) {
            throw new IllegalStateException();
        }
        int i = i1.f269a[this.b.b.ordinal()];
        if (i == 1) {
            c cVar = this.b;
            mrec = new Mrec(context, false, cVar.c, cVar.d);
        } else if (i != 2) {
            c cVar2 = this.b;
            mrec = new Banner(context, false, cVar2.c, cVar2.d);
        } else {
            c cVar3 = this.b;
            mrec = new Cover(context, false, cVar3.c, cVar3.d);
        }
        mrec.setBannerListener(bannerListener);
        mrec.addOnAttachStateChangeListener(new h1(this, mrec));
        this.f73a = true;
        return mrec;
    }
}
