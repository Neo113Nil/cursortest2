package com.anythink.basead.mixad.e;

import android.util.Log;
import com.anythink.core.api.ATAdAppInfo;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.y;
import com.anythink.core.common.l.g.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public class a extends w implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final String f9715a = "a";

    public a(d dVar) {
        o(dVar.getIconImageUrl());
        Double starRating = dVar.getStarRating();
        if (starRating != null) {
            i(starRating.intValue());
        }
        q(dVar.getMainImageUrl());
        m(dVar.getTitle());
        s(dVar.getCallToActionText());
        n(dVar.getDescriptionText());
        r(dVar.getAdChoiceIconUrl());
        a(dVar.getAdLogo());
        G(dVar.getAdFrom());
        F(dVar.getWarning());
        E(dVar.getDomain());
        ATAdAppInfo adAppInfo = dVar.getAdAppInfo();
        if (adAppInfo != null) {
            if (t.b().F()) {
                Log.i("a", "AdAppInfo:" + dVar.getAdAppInfo().toString());
            }
            z(adAppInfo.getPublisher());
            A(adAppInfo.getAppVersion());
            B(adAppInfo.getAppPrivacyUrl());
            C(adAppInfo.getAppPermissonUrl());
            c(adAppInfo.getFunctionUrl());
        }
        c(new c(dVar));
    }

    @Override // com.anythink.core.common.h.w
    public final List<String> a(y yVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(B());
        return arrayList;
    }

    @Override // com.anythink.core.common.h.w
    public final int b() {
        return 10;
    }

    @Override // com.anythink.core.common.h.w
    public final boolean c() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ThirdPartyAdContent{, offerId='");
        sb.append(this.f14295m);
        sb.append("', creativeId='");
        sb.append(this.f14296n);
        sb.append("', title='");
        sb.append(this.f14297o);
        sb.append("', desc='");
        sb.append(this.f14298p);
        sb.append("', iconUrl='");
        sb.append(this.f14299q);
        sb.append("', mainImageUrl='");
        sb.append(this.f14300r);
        sb.append("', endCardImageUrl='");
        sb.append(this.f14301s);
        sb.append("', adChoiceUrl='");
        sb.append(this.f14302t);
        sb.append("', ctaText='");
        sb.append(this.f14303u);
        sb.append("', videoUrl='");
        sb.append(this.f14304v);
        sb.append("', previewUrl='");
        sb.append(this.f14305w);
        sb.append("', deeplinkUrl='");
        sb.append(this.f14306x);
        sb.append("', clickUrl='");
        sb.append(this.f14307y);
        sb.append("', pkgName='");
        sb.append(this.f14308z);
        sb.append("', unitType=");
        sb.append(this.f14268A);
        sb.append(", clickType=");
        sb.append(this.f14269D);
        sb.append(", rating=");
        sb.append(this.f14270E);
        sb.append(", adLogoTitle='");
        sb.append(this.f14271F);
        sb.append("', offerNetworkFirmId=");
        sb.append(this.f14272G);
        sb.append(", jumpUrl='");
        sb.append(this.f14273H);
        sb.append("', publisher='");
        sb.append(this.f14274I);
        sb.append("', appVersion='");
        sb.append(this.J);
        sb.append("', privacyUrl='");
        sb.append(this.f14275K);
        sb.append("', permissionUrl='");
        sb.append(this.f14276L);
        sb.append("', functionUrl='");
        sb.append(this.f14277M);
        sb.append("', templateVersion='");
        sb.append(this.f14278N);
        sb.append("', adLogo=");
        sb.append(this.f14279O);
        sb.append(", baseAdSetting=");
        sb.append(this.f14280P);
        sb.append(", requestId='");
        sb.append(this.f14281Q);
        sb.append("', webControlObject='");
        sb.append(this.f14282R);
        sb.append("', protocolType=");
        sb.append(this.f14283S);
        sb.append(", offerHtml='");
        sb.append(this.f14284T);
        sb.append("', offerUrl='");
        sb.append(this.f14285U);
        sb.append("', wxUserName='");
        sb.append(this.f14286V);
        sb.append("', wxPath='");
        sb.append(this.f14287W);
        sb.append("', offerWidth=");
        sb.append(this.f14288X);
        sb.append(", offerHeight=");
        sb.append(this.Y);
        sb.append(", mApkDownloadStatus=");
        sb.append(this.f14289Z);
        sb.append(", mNativeMainImageWidth=");
        sb.append(this.aa);
        sb.append(", mNativeMainImageHeight=");
        sb.append(this.ab);
        sb.append(", mVideoWidth=");
        sb.append(this.ac);
        sb.append(", mVideoHeight=");
        sb.append(this.ad);
        sb.append(", mVideoDuration=");
        sb.append(this.ae);
        sb.append(", deeplinkPackageInstallState=");
        sb.append(this.af);
        sb.append(", mraidJSUrl='");
        return AbstractC5051n.g(sb, this.ah, "'}");
    }

    @Override // com.anythink.core.common.h.w
    public final List<String> b(y yVar) {
        return new ArrayList();
    }

    @Override // com.anythink.core.common.h.w
    public final String a() {
        return "";
    }
}
