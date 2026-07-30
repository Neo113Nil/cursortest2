package com.anythink.rewardvideo.a;

import android.content.Context;
import com.anythink.core.api.ATCommonImpressionListener;
import com.anythink.core.api.ATNetworkConfirmInfo;

/* loaded from: classes.dex */
public abstract class d implements ATCommonImpressionListener {

    /* renamed from: a, reason: collision with root package name */
    private boolean f23452a;

    /* renamed from: b, reason: collision with root package name */
    private int f23453b;

    /* renamed from: c, reason: collision with root package name */
    protected final f f23454c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f23455d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f23456e = false;

    public d(f fVar, boolean z8, int i) {
        this.f23454c = fVar;
        this.f23452a = z8;
        this.f23453b = i;
    }

    private boolean a() {
        return this.f23453b == 1;
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdClick() {
        if (!this.f23452a || this.f23454c == null) {
            return;
        }
        if (this.f23453b != 1) {
            onAdReward();
        }
        this.f23454c.onRewardedVideoAdPlayClicked();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdDismiss() {
        if (!this.f23452a || this.f23454c == null) {
            return;
        }
        if (!this.f23455d) {
            this.f23455d = true;
            this.f23454c.onRewardedVideoAdPlayEnd();
        }
        onAdReward();
        this.f23454c.onRewardedVideoAdClosed();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdImpression() {
        f fVar;
        if (!this.f23452a || (fVar = this.f23454c) == null) {
            return;
        }
        fVar.onRewardedVideoAdPlayStart();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdReward() {
        if (this.f23454c == null || this.f23456e) {
            return;
        }
        this.f23456e = true;
        this.f23454c.onReward();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdRewardFailed() {
        if (this.f23454c == null || this.f23456e) {
            return;
        }
        this.f23456e = true;
        this.f23454c.onRewardFailed();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdShowFail(String str, String str2) {
        f fVar;
        if (!this.f23452a || (fVar = this.f23454c) == null) {
            return;
        }
        fVar.onRewardedVideoAdPlayFailed(str, str2);
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdVideoPlayEnd() {
        if (!this.f23452a || this.f23454c == null || this.f23455d) {
            return;
        }
        this.f23455d = true;
        this.f23454c.onRewardedVideoAdPlayEnd();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdVideoPlayStart() {
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onDeeplinkCallback(boolean z8) {
        f fVar = this.f23454c;
        if (fVar != null) {
            fVar.onDeeplinkCallback(z8);
        }
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        f fVar = this.f23454c;
        if (fVar != null) {
            fVar.onDownloadConfirm(context, aTNetworkConfirmInfo);
        }
    }
}
