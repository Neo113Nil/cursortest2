package com.anythink.network.onlineapi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.d;
import com.anythink.basead.d.f;
import com.anythink.basead.f.a;
import com.anythink.basead.g.j;
import com.anythink.basead.ui.OwnNativeATView;
import com.anythink.core.common.h.n;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.anythink.network.adx.AdxAppInfo;

/* loaded from: classes.dex */
public class OnlineApiATNativeAd extends CustomNativeAd {

    /* renamed from: a, reason: collision with root package name */
    a f23366a;

    /* renamed from: b, reason: collision with root package name */
    Context f23367b;

    /* renamed from: c, reason: collision with root package name */
    View f23368c;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
    
        if (r3 != 4) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OnlineApiATNativeAd(Context context, a aVar) {
        this.f23367b = context.getApplicationContext();
        this.f23366a = aVar;
        aVar.a(new com.anythink.basead.g.a() { // from class: com.anythink.network.onlineapi.OnlineApiATNativeAd.1
            @Override // com.anythink.basead.g.a
            public final void onAdClick(j jVar) {
                n detail = OnlineApiATNativeAd.this.getDetail();
                if (detail != null) {
                    detail.I(jVar.f9139a);
                    detail.J(jVar.f9140b);
                }
                OnlineApiATNativeAd.this.notifyAdClicked();
            }

            @Override // com.anythink.basead.g.a
            public final void onAdClosed() {
            }

            @Override // com.anythink.basead.g.a
            public final void onAdShow(j jVar) {
                OnlineApiATNativeAd.this.notifyAdImpression();
            }

            @Override // com.anythink.basead.g.a
            public final void onDeeplinkCallback(boolean z8) {
                OnlineApiATNativeAd.this.notifyDeeplinkCallback(z8);
            }

            @Override // com.anythink.basead.g.a
            public final void onShowFailed(f fVar) {
            }
        });
        setNetworkInfoMap(d.a(this.f23366a.a()));
        setAdChoiceIconUrl(this.f23366a.h());
        setTitle(this.f23366a.c());
        setDescriptionText(this.f23366a.d());
        setIconImageUrl(this.f23366a.f());
        setMainImageUrl(this.f23366a.g());
        setCallToActionText(this.f23366a.e());
        if (this.f23366a.o()) {
            setAdAppInfo(new AdxAppInfo(this.f23366a));
        }
        int z8 = this.f23366a.z();
        if (z8 != 1) {
            if (z8 == 2 || z8 == 3) {
                setNativeInteractionType(2);
            }
            setMainImageWidth(this.f23366a.x());
            setMainImageHeight(this.f23366a.y());
        }
        setNativeInteractionType(1);
        setMainImageWidth(this.f23366a.x());
        setMainImageHeight(this.f23366a.y());
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
        a aVar = this.f23366a;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        a aVar = this.f23366a;
        if (aVar != null) {
            aVar.a((com.anythink.basead.g.a) null);
            this.f23366a.r();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.f23368c == null) {
            this.f23368c = this.f23366a.a(this.f23367b, false, null);
        }
        return this.f23368c;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        if (this.f23366a != null) {
            return new OwnNativeATView(this.f23367b);
        }
        return null;
    }

    @Override // com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public int getDownloadStatus() {
        int A8;
        a aVar = this.f23366a;
        if (aVar == null || (A8 = aVar.A()) < 0) {
            return 0;
        }
        return A8;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.f23366a != null) {
            this.f23366a.a(view, aTNativePrepareInfo.getClickViewList(), aTNativePrepareInfo instanceof ATNativePrepareExInfo ? ((ATNativePrepareExInfo) aTNativePrepareInfo).getCreativeClickViewList() : null, aTNativePrepareInfo.getChoiceViewLayoutParams(), aTNativePrepareInfo.getCloseView());
        }
    }
}
