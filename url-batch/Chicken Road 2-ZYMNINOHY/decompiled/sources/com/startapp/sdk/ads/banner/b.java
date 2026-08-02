package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.internal.k1;
import com.startapp.sdk.internal.n1;

/* loaded from: classes.dex */
public final class b implements BannerCreator {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f6074b;

    public b(c cVar) {
        this.f6074b = cVar;
    }

    @Override // com.startapp.sdk.ads.banner.BannerCreator
    public final View create(Context context, BannerListener bannerListener) {
        BannerStandard mrec;
        if (this.f6073a) {
            throw new IllegalStateException();
        }
        int i4 = n1.f7311a[this.f6074b.f6142b.ordinal()];
        if (i4 == 1) {
            c cVar = this.f6074b;
            mrec = new Mrec(context, false, cVar.f6143c, cVar.f6144d);
        } else if (i4 != 2) {
            c cVar2 = this.f6074b;
            mrec = new Banner(context, false, cVar2.f6143c, cVar2.f6144d);
        } else {
            c cVar3 = this.f6074b;
            mrec = new Cover(context, false, cVar3.f6143c, cVar3.f6144d);
        }
        mrec.setBannerListener(bannerListener);
        mrec.addOnAttachStateChangeListener(new k1(this, mrec));
        this.f6073a = true;
        return mrec;
    }
}
