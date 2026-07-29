package com.youappi.sdk;

import com.youappi.sdk.ads.AdListener;
import com.youappi.sdk.ads.YAAdRequest;
import com.youappi.sdk.logic.impl.a;
import com.youappi.sdk.net.model.AdItem;
import com.youappi.sdk.ui.model.AdViewModel;
import com.youappi.sdk.ui.views.IAdView;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class BaseAd {
    private com.youappi.sdk.logic.impl.a _adImpl;
    private AdItem _adItem;
    public String _adUnitId;
    private AdViewModel _adViewModel;
    protected AdListener _listener;
    protected AdType _type;
    private YAAdRequest adRequest = DefaultAdRequest;
    private String deviceId;
    private boolean isLoading;
    private static Pattern PatternAdUnitId = Pattern.compile("^[a-zA-Z0-9_]*$");
    private static final YAAdRequest DefaultAdRequest = new YAAdRequest();

    public interface AdStateListener {
        void onAdClosed(IAdView iAdView);

        void onAdError(IAdView iAdView, int i, Throwable th);

        void onAdSkipped(IAdView iAdView);

        void requestOrientationChange(int i);
    }

    public interface a {
        void a();
    }

    private boolean hasSdkInitializedAdImpl() {
        return this._adImpl != null && this._adImpl.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAd() {
        if (hasSdkInitializedAdImpl()) {
            this._adImpl.a(this._type, this._adUnitId, this.adRequest, new a.InterfaceC0411a<AdViewModel>() { // from class: com.youappi.sdk.BaseAd.2
                @Override // com.youappi.sdk.logic.impl.a.InterfaceC0411a
                public void a(YAErrorCode yAErrorCode, Exception exc) {
                    BaseAd.this._listener.onLoadFailure(BaseAd.this._adUnitId, yAErrorCode, exc);
                    BaseAd.this.isLoading = false;
                }

                @Override // com.youappi.sdk.logic.impl.a.InterfaceC0411a
                public void a(AdViewModel adViewModel) {
                    BaseAd.this._adViewModel = adViewModel;
                    BaseAd.this._adImpl.a(adViewModel, new a.InterfaceC0411a<AdItem>() { // from class: com.youappi.sdk.BaseAd.2.1
                        @Override // com.youappi.sdk.logic.impl.a.InterfaceC0411a
                        public void a(YAErrorCode yAErrorCode, Exception exc) {
                            BaseAd.this._listener.onLoadFailure(BaseAd.this._adUnitId, yAErrorCode, exc);
                            BaseAd.this.isLoading = false;
                        }

                        @Override // com.youappi.sdk.logic.impl.a.InterfaceC0411a
                        public void a(AdItem adItem) {
                            BaseAd.this._adItem = adItem;
                            BaseAd.this._listener.onLoadSuccess(BaseAd.this._adUnitId);
                            BaseAd.this.isLoading = false;
                        }
                    });
                }
            });
        }
    }

    private void loadAdOrRegisterForLoadCallbackWhenDeviceIsInitialized(YAAdRequest yAAdRequest) {
        if (YouAPPi.getInstance().getLogicManager().h()) {
            loadAd();
        } else {
            YouAPPi.getInstance().getLogicManager().a(new a() { // from class: com.youappi.sdk.BaseAd.1
                @Override // com.youappi.sdk.BaseAd.a
                public void a() {
                    BaseAd.this.loadAd();
                }
            });
        }
    }

    IAdView createViewForAd(AdItem adItem) {
        if (!hasSdkInitializedAdImpl()) {
            return null;
        }
        IAdView a2 = this._adImpl.a(adItem);
        a2.setListener(this._listener);
        a2.setAdItem(this._adViewModel);
        a2.setDeviceId(this.deviceId);
        this._adViewModel = null;
        this._adItem = null;
        return a2;
    }

    public AdItem getAdItem() {
        return this._adItem;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public AdListener getListener() {
        return this._listener;
    }

    public AdType getType() {
        return this._type;
    }

    public boolean isAvailable() {
        return this._adItem != null;
    }

    public void load() {
        AdListener adListener;
        String str;
        YAErrorCode yAErrorCode;
        if (hasSdkInitializedAdImpl()) {
            if (!PatternAdUnitId.matcher(this._adUnitId).matches()) {
                adListener = this._listener;
                str = this._adUnitId;
                yAErrorCode = YAErrorCode.INVALID_AD_UNIT_ID;
            } else if (isAvailable()) {
                if (this._listener != null) {
                    this._listener.onLoadSuccess(this._adUnitId);
                    return;
                }
                return;
            } else if (!this.isLoading) {
                this.isLoading = true;
                loadAdOrRegisterForLoadCallbackWhenDeviceIsInitialized(this.adRequest);
                return;
            } else {
                if (this._listener == null) {
                    return;
                }
                adListener = this._listener;
                str = this._adUnitId;
                yAErrorCode = YAErrorCode.WARMING_UP;
            }
        } else {
            if (this._listener == null) {
                return;
            }
            adListener = this._listener;
            str = this._adUnitId;
            yAErrorCode = YAErrorCode.SDK_UNINITIALIZED;
        }
        adListener.onLoadFailure(str, yAErrorCode, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void logError(int i, String str, Throwable th) {
        if (hasSdkInitializedAdImpl()) {
            this._adImpl.a(i, str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void logEvent(String str, String str2) {
        if (hasSdkInitializedAdImpl()) {
            this._adImpl.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void runOnMainThread(Runnable runnable) {
        this._adImpl.a(runnable);
    }

    void setAdImpl(com.youappi.sdk.logic.impl.a aVar) {
        this._adImpl = aVar;
    }

    public void setAdRequest(YAAdRequest yAAdRequest) {
        this.adRequest = yAAdRequest;
    }

    public void setAdUnitId(String str) {
        this._adUnitId = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public boolean show() {
        YouAPPi.getInstance().getLogicManager().g();
        boolean z = false;
        if (!isAvailable()) {
            this._listener.onShowFailure(this._adUnitId, YAErrorCode.NO_LOAD, null);
            return false;
        }
        try {
            boolean a2 = YouAPPi.getInstance().getLogicManager().a(this._adItem, this);
            try {
                if (!a2) {
                    if (this._listener != null) {
                        this._listener.onShowFailure(this._adUnitId, YAErrorCode.AD_IS_ALREADY_SHOWING, null);
                    }
                    return a2;
                }
                boolean b2 = this._adImpl.b(this._adItem);
                try {
                    if (this._listener != null) {
                        this._listener.onAdStarted(this._adUnitId);
                    }
                    return b2;
                } catch (Exception e) {
                    e = e;
                    z = b2;
                    if (this._listener == null) {
                        return z;
                    }
                    this._listener.onShowFailure(this._adUnitId, YAErrorCode.OTHER, e);
                    return z;
                }
            } catch (Exception e2) {
                z = a2;
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}
