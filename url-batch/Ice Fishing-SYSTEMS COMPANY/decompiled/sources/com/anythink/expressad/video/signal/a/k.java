package com.anythink.expressad.video.signal.a;

import android.content.res.Configuration;
import com.anythink.expressad.video.module.AnythinkContainerView;

/* loaded from: classes.dex */
public final class k extends d {

    /* renamed from: k, reason: collision with root package name */
    private AnythinkContainerView f21983k;

    public k(AnythinkContainerView anythinkContainerView) {
        this.f21983k = anythinkContainerView;
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void configurationChanged(int i, int i4, int i9) {
        super.configurationChanged(i, i4, i9);
        try {
            AnythinkContainerView anythinkContainerView = this.f21983k;
            if (anythinkContainerView != null) {
                anythinkContainerView.configurationChanged(i, i4, i9);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final boolean endCardShowing() {
        try {
            AnythinkContainerView anythinkContainerView = this.f21983k;
            if (anythinkContainerView != null) {
                return anythinkContainerView.endCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.endCardShowing();
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void hideAlertWebview() {
        super.hideAlertWebview();
        AnythinkContainerView anythinkContainerView = this.f21983k;
        if (anythinkContainerView != null) {
            anythinkContainerView.hideAlertWebview();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.h
    public final void install(com.anythink.expressad.foundation.d.d dVar) {
        super.install(dVar);
        try {
            AnythinkContainerView anythinkContainerView = this.f21983k;
            if (anythinkContainerView != null) {
                anythinkContainerView.install(dVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void ivRewardAdsWithoutVideo(String str) {
        super.ivRewardAdsWithoutVideo(str);
        AnythinkContainerView anythinkContainerView = this.f21983k;
        if (anythinkContainerView != null) {
            anythinkContainerView.ivRewardAdsWithoutVideo(str);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final boolean miniCardLoaded() {
        try {
            AnythinkContainerView anythinkContainerView = this.f21983k;
            if (anythinkContainerView != null) {
                return anythinkContainerView.miniCardLoaded();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.miniCardLoaded();
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final boolean miniCardShowing() {
        try {
            AnythinkContainerView anythinkContainerView = this.f21983k;
            if (anythinkContainerView != null) {
                return anythinkContainerView.miniCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.miniCardShowing();
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.h
    public final void orientation(Configuration configuration) {
        super.orientation(configuration);
        try {
            AnythinkContainerView anythinkContainerView = this.f21983k;
            if (anythinkContainerView != null) {
                anythinkContainerView.orientation(configuration);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.f
    public final void preLoadData(com.anythink.expressad.video.signal.factory.b bVar) {
        super.preLoadData(bVar);
        try {
            AnythinkContainerView anythinkContainerView = this.f21983k;
            if (anythinkContainerView != null) {
                anythinkContainerView.preLoadData(bVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public final void readyStatus(int i) {
        try {
            AnythinkContainerView anythinkContainerView = this.f21983k;
            if (anythinkContainerView != null) {
                anythinkContainerView.readyStatus(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.readyStatus(i);
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void resizeMiniCard(int i, int i4, int i9) {
        super.resizeMiniCard(i, i4, i9);
        try {
            AnythinkContainerView anythinkContainerView = this.f21983k;
            if (anythinkContainerView != null) {
                anythinkContainerView.resizeMiniCard(i, i4, i9);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final boolean showAlertWebView() {
        super.showAlertWebView();
        AnythinkContainerView anythinkContainerView = this.f21983k;
        if (anythinkContainerView != null) {
            return anythinkContainerView.showAlertWebView();
        }
        return false;
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void showEndcard(int i) {
        super.showEndcard(i);
        try {
            AnythinkContainerView anythinkContainerView = this.f21983k;
            if (anythinkContainerView != null) {
                anythinkContainerView.showEndcard(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void showMiniCard(int i, int i4, int i9, int i10, int i11) {
        super.showMiniCard(i, i4, i9, i10, i11);
        try {
            AnythinkContainerView anythinkContainerView = this.f21983k;
            if (anythinkContainerView != null) {
                anythinkContainerView.showMiniCard(i, i4, i9, i10, i11);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void showPlayableView() {
        super.showPlayableView();
        try {
            AnythinkContainerView anythinkContainerView = this.f21983k;
            if (anythinkContainerView != null) {
                anythinkContainerView.showPlayableView();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void showVideoClickView(int i) {
        super.showVideoClickView(i);
        AnythinkContainerView anythinkContainerView = this.f21983k;
        if (anythinkContainerView != null) {
            anythinkContainerView.showVideoClickView(i);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.h
    public final void toggleCloseBtn(int i) {
        super.toggleCloseBtn(i);
        try {
            AnythinkContainerView anythinkContainerView = this.f21983k;
            if (anythinkContainerView != null) {
                anythinkContainerView.toggleCloseBtn(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.h
    public final void webviewshow() {
        super.webviewshow();
        try {
            AnythinkContainerView anythinkContainerView = this.f21983k;
            if (anythinkContainerView != null) {
                anythinkContainerView.webviewshow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
