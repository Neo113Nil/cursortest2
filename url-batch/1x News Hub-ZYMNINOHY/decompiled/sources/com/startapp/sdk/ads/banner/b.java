package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.internal.k1;
import com.startapp.sdk.internal.n1;

/* loaded from: classes.dex */
public final class b implements BannerCreator {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f2998b;

    public b(c cVar) {
        this.f2998b = cVar;
    }

    @Override // com.startapp.sdk.ads.banner.BannerCreator
    public final View create(Context context, BannerListener bannerListener) {
        BannerStandard mrec;
        if (this.f2997a) {
            throw new IllegalStateException();
        }
        int i3 = n1.f4180a[this.f2998b.f3062b.ordinal()];
        if (i3 == 1) {
            c cVar = this.f2998b;
            mrec = new Mrec(context, false, cVar.f3063c, cVar.f3064d);
        } else if (i3 != 2) {
            c cVar2 = this.f2998b;
            mrec = new Banner(context, false, cVar2.f3063c, cVar2.f3064d);
        } else {
            c cVar3 = this.f2998b;
            mrec = new Cover(context, false, cVar3.f3063c, cVar3.f3064d);
        }
        mrec.setBannerListener(bannerListener);
        mrec.addOnAttachStateChangeListener(new k1(this, mrec));
        this.f2997a = true;
        return mrec;
    }
}
