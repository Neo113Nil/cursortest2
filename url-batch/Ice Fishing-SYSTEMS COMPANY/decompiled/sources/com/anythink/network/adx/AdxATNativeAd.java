package com.anythink.network.adx;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.d;
import com.anythink.basead.f.a;
import com.anythink.basead.g.e;
import com.anythink.basead.g.f;
import com.anythink.basead.g.j;
import com.anythink.basead.ui.BaseMediaATView;
import com.anythink.basead.ui.a;
import com.anythink.core.api.ATShakeViewListener;
import com.anythink.core.common.f.b;
import com.anythink.core.common.f.c;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AdxATNativeAd extends CustomNativeAd {

    /* renamed from: a, reason: collision with root package name */
    a f23183a;

    /* renamed from: b, reason: collision with root package name */
    x f23184b;

    /* renamed from: c, reason: collision with root package name */
    Context f23185c;

    /* renamed from: d, reason: collision with root package name */
    boolean f23186d;

    /* renamed from: e, reason: collision with root package name */
    boolean f23187e;

    /* renamed from: f, reason: collision with root package name */
    View f23188f;

    /* renamed from: g, reason: collision with root package name */
    e f23189g;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (r2 != 4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdxATNativeAd(final Context context, a aVar, x xVar, boolean z8, boolean z9) {
        this.f23185c = context.getApplicationContext();
        this.f23183a = aVar;
        this.f23184b = xVar;
        setNetworkInfoMap(d.a(aVar.a()));
        f fVar = new f(this.f23183a.a(), null) { // from class: com.anythink.network.adx.AdxATNativeAd.1
            @Override // com.anythink.basead.g.f
            public final void onATImproveClickViewRenderFail(int i) {
                if (AdxATNativeAd.this.f23183a.a() != null && AdxATNativeAd.this.f23183a.a().b() == 2 && (AdxATNativeAd.this.f23183a.a() instanceof bj)) {
                    com.anythink.core.common.u.e.a(AdxATNativeAd.this.getDetail(), ((bj) AdxATNativeAd.this.f23183a.a()).aD(), AdxATNativeAd.this.f23183a.a().v(), i);
                }
            }

            @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
            public final void onAdClick(j jVar) {
                super.onAdClick(jVar);
                AdxATNativeAd.this.notifyAdClicked();
                if (AdxATNativeAd.this.f23183a.a().t() == 67) {
                    if (AdxATNativeAd.this.f23183a.a(true, false)) {
                        c.a(context).a(AdxATNativeAd.this.f23183a.a().v(), 1, 0);
                    }
                    if (AdxATNativeAd.this.f23183a.a(false, false)) {
                        b.a(context).a(AdxATNativeAd.this.f23183a.a().v(), 1, 0);
                    }
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onAdClosed() {
                AdxATNativeAd.this.notifyAdDislikeClick();
            }

            @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
            public final void onAdShow(j jVar) {
                super.onAdShow(jVar);
                AdxATNativeAd.this.notifyAdImpression();
                if (AdxATNativeAd.this.f23183a.a().t() == 67) {
                    if (AdxATNativeAd.this.f23183a.a(true, true)) {
                        c.a(context).a(AdxATNativeAd.this.f23183a.a().v(), 0, 1);
                    }
                    if (AdxATNativeAd.this.f23183a.a(false, true)) {
                        b.a(context).a(AdxATNativeAd.this.f23183a.a().v(), 0, 1);
                    }
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onDeeplinkCallback(boolean z10) {
                y yVar;
                x xVar2 = AdxATNativeAd.this.f23184b;
                if (xVar2 == null || (yVar = xVar2.f14325o) == null || yVar.bI() <= 0) {
                    AdxATNativeAd.this.notifyDeeplinkCallback(z10);
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onShowFailed(com.anythink.basead.d.f fVar2) {
            }
        };
        this.f23189g = fVar;
        this.f23183a.a(fVar);
        this.f23183a.a(new a.InterfaceC0049a() { // from class: com.anythink.network.adx.AdxATNativeAd.2
            @Override // com.anythink.basead.ui.a.InterfaceC0049a
            public final void onProgressUpdate(long j9, long j10) {
                if (AdxATNativeAd.this.getVideoDuration() == 0.0d) {
                    AdxATNativeAd.this.setVideoDuration(j10 / 1000.0d);
                }
                AdxATNativeAd.this.notifyAdVideoPlayProgress((int) (j9 / 1000.0d));
            }

            @Override // com.anythink.basead.ui.a.InterfaceC0049a
            public final void onVideoAdComplete() {
                AdxATNativeAd.this.notifyAdVideoEnd();
            }

            @Override // com.anythink.basead.ui.a.InterfaceC0049a
            public final void onVideoAdStartPlay(long j9) {
                AdxATNativeAd.this.setVideoDuration(j9 / 1000.0d);
                AdxATNativeAd.this.notifyAdVideoStart();
            }

            @Override // com.anythink.basead.ui.a.InterfaceC0049a
            public final void onVideoError(String str, String str2) {
                AdxATNativeAd.this.notifyAdVideoVideoPlayFail(str, str2);
            }
        });
        this.f23186d = z8;
        this.f23187e = z9;
        int w9 = this.f23183a.w();
        if (w9 == 1) {
            this.mAdSourceType = "1";
        } else if (w9 == 2) {
            this.mAdSourceType = "2";
        }
        if (this.f23183a.p()) {
            return;
        }
        setAdChoiceIconUrl(this.f23183a.h());
        setTitle(this.f23183a.c());
        setDescriptionText(this.f23183a.d());
        setIconImageUrl(this.f23183a.f());
        String g9 = this.f23183a.g();
        setMainImageUrl(g9);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(g9)) {
            arrayList.add(g9);
        }
        setImageUrlList(arrayList);
        setCallToActionText(this.f23183a.e());
        if (this.f23183a.o()) {
            setAdAppInfo(new AdxAppInfo(this.f23183a));
        }
        int z10 = this.f23183a.z();
        if (z10 != 1) {
            if (z10 == 2 || z10 == 3) {
                setNativeInteractionType(2);
            }
            setMainImageWidth(this.f23183a.x());
            setMainImageHeight(this.f23183a.y());
            setVideoWidth(this.f23183a.D());
            setVideoHeight(this.f23183a.E());
            setVideoDuration(this.f23183a.F() / 1000.0d);
        }
        setNativeInteractionType(1);
        setMainImageWidth(this.f23183a.x());
        setMainImageHeight(this.f23183a.y());
        setVideoWidth(this.f23183a.D());
        setVideoHeight(this.f23183a.E());
        setVideoDuration(this.f23183a.F() / 1000.0d);
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
        com.anythink.basead.f.a aVar = this.f23183a;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        com.anythink.basead.f.a aVar = this.f23183a;
        if (aVar != null) {
            aVar.a((com.anythink.basead.g.a) null);
            this.f23183a.r();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.f23188f == null) {
            this.f23188f = this.f23183a.a(this.f23185c, this.f23187e, new BaseMediaATView.a() { // from class: com.anythink.network.adx.AdxATNativeAd.3
                @Override // com.anythink.basead.ui.BaseMediaATView.a
                public final void onClickCloseView() {
                    AdxATNativeAd.this.notifyAdDislikeClick();
                }
            });
        }
        return this.f23188f;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        return this.f23183a.b();
    }

    @Override // com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public int getDownloadStatus() {
        int A8;
        com.anythink.basead.f.a aVar = this.f23183a;
        if (aVar == null || (A8 = aVar.A()) < 0) {
            return 0;
        }
        return A8;
    }

    @Override // com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getShakeView(int i, int i4, ATShakeViewListener aTShakeViewListener) {
        return this.f23183a.B();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public double getVideoProgress() {
        return this.f23183a != null ? r0.C() / 1000.0d : super.getVideoProgress();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public boolean isNativeExpress() {
        return this.f23183a.p();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void onPause() {
        com.anythink.basead.f.a aVar = this.f23183a;
        if (aVar != null) {
            aVar.t();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void onResume() {
        com.anythink.basead.f.a aVar = this.f23183a;
        if (aVar != null) {
            aVar.s();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void pauseVideo() {
        this.f23183a.v();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        e eVar = this.f23189g;
        if (eVar != null) {
            eVar.updateTrackingInfo(getDetail());
            AdxATInitManager.getInstance();
            AdxATInitManager.a(getDetail(), this.f23184b);
        }
        com.anythink.basead.f.a aVar = this.f23183a;
        if (aVar != null) {
            aVar.s();
        }
        if (this.f23183a != null) {
            this.f23183a.a(view, aTNativePrepareInfo.getClickViewList(), aTNativePrepareInfo instanceof ATNativePrepareExInfo ? ((ATNativePrepareExInfo) aTNativePrepareInfo).getCreativeClickViewList() : null, aTNativePrepareInfo.getChoiceViewLayoutParams(), aTNativePrepareInfo.getCloseView());
            if (this.f23186d || this.f23183a.a() == null || this.f23183a.a().b() != 2 || !(this.f23183a.a() instanceof bj)) {
                return;
            }
            View view2 = this.f23188f;
            com.anythink.core.common.u.e.a(getDetail(), ((bj) this.f23183a.a()).aD(), this.f23183a.a().v(), (view2 == null || view2.getParent() == null) ? false : true);
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void resumeVideo() {
        this.f23183a.u();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void setVideoMute(boolean z8) {
        this.f23183a.b(z8);
    }
}
