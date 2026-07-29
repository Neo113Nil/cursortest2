package com.youappi.sdk.logic.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.a.a.a.e;
import com.a.a.a.f;
import com.youappi.sdk.AdActivity;
import com.youappi.sdk.AdType;
import com.youappi.sdk.BaseAd;
import com.youappi.sdk.YAErrorCode;
import com.youappi.sdk.ads.YAAdRequest;
import com.youappi.sdk.logic.IAdEventListener;
import com.youappi.sdk.logic.Logger;
import com.youappi.sdk.logic.impl.cache.d;
import com.youappi.sdk.net.model.AdItem;
import com.youappi.sdk.net.model.ConfigurationItem;
import com.youappi.sdk.net.model.DeviceOrientation;
import com.youappi.sdk.net.model.ProductItem;
import com.youappi.sdk.net.model.VastError;
import com.youappi.sdk.net.model.VastResponseWrapper;
import com.youappi.sdk.net.model.VideoItem;
import com.youappi.sdk.ui.model.AdViewModel;
import com.youappi.sdk.ui.views.IAdView;
import com.youappi.sdk.utils.g;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements IAdEventListener {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9424a = "a";

    /* renamed from: b, reason: collision with root package name */
    private com.youappi.sdk.net.a f9425b;

    /* renamed from: c, reason: collision with root package name */
    private Logger f9426c;

    /* renamed from: d, reason: collision with root package name */
    private d f9427d;
    private Context e;
    private Handler f;

    /* renamed from: com.youappi.sdk.logic.impl.a$a, reason: collision with other inner class name */
    public interface InterfaceC0411a<T> {
        void a(YAErrorCode yAErrorCode, Exception exc);

        void a(T t);
    }

    public a(Context context, com.youappi.sdk.net.a aVar, d dVar, Logger logger, Handler handler) {
        this.e = context;
        this.f9425b = aVar;
        this.f9427d = dVar;
        this.f9426c = logger;
        this.f = handler;
    }

    public static AdViewModel a(AdItem adItem, ConfigurationItem configurationItem) {
        try {
            return adItem.getAdType().getAdViewModelClass().getDeclaredConstructor(adItem.getClass(), ConfigurationItem.class).newInstance(adItem, configurationItem);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void b(String str, String str2) {
        Log.i(f9424a, "onGotEvent : eventUrl = " + str + " eventName = " + str2);
        this.f9426c.log(f9424a, str2);
        this.f9425b.a(str);
    }

    public e a(AdType adType, final String str, YAAdRequest yAAdRequest, final InterfaceC0411a<AdViewModel> interfaceC0411a) {
        return this.f9425b.a(new com.a.a.a.b<ProductItem<? extends AdItem>>() { // from class: com.youappi.sdk.logic.impl.a.1
            @Override // com.a.a.a.b
            public boolean onNetError(com.a.a.a.d dVar) {
                if (interfaceC0411a == null) {
                    return false;
                }
                if (dVar.b() != null && Exception.class.isAssignableFrom(dVar.b().getClass())) {
                    interfaceC0411a.a(YAErrorCode.SERVER_ERROR, (Exception) dVar.b());
                    return false;
                }
                YAErrorCode yAErrorCode = YAErrorCode.OTHER;
                if (dVar.c() == 401) {
                    yAErrorCode = YAErrorCode.INVALID_TOKEN;
                }
                interfaceC0411a.a(yAErrorCode, new Exception("Error loading ad due to: " + dVar.b() + ". HTTP response code: " + dVar.c()));
                return false;
            }

            @Override // com.a.a.a.b
            public boolean onNetFinished(f<ProductItem<? extends AdItem>> fVar) {
                List<? extends AdItem> productList = fVar.b().getProductList();
                if (productList != null && !productList.isEmpty()) {
                    ConfigurationItem configuration = fVar.b().getConfiguration();
                    String responseId = fVar.b().getResponseId();
                    if (!TextUtils.isEmpty(configuration.getLogLevel())) {
                        a.this.f9426c.setServerLogLevel(configuration.getLogLevel());
                    }
                    g.a(a.this.e, configuration.getAppRequestIntervalMin());
                    AdItem adItem = productList.get(0);
                    adItem.setResponseId(responseId);
                    adItem.setAdUnitID(str);
                    if (adItem instanceof VideoItem) {
                        VideoItem videoItem = (VideoItem) adItem;
                        if (videoItem.getVideoConfig().getVastRawString() != null) {
                            videoItem.getVideoConfig();
                            new VastResponseWrapper(videoItem, configuration, interfaceC0411a, com.youappi.sdk.utils.c.a(a.this.e), a.this.f9425b, a.this).start();
                        }
                    }
                    AdViewModel a2 = a.a(adItem, configuration);
                    if (interfaceC0411a != null) {
                        interfaceC0411a.a(a2);
                    }
                } else if (interfaceC0411a != null) {
                    interfaceC0411a.a(YAErrorCode.NO_FILL, null);
                }
                return false;
            }
        }, adType, str, yAAdRequest);
    }

    public IAdView a(AdItem adItem) {
        IAdView iAdView = null;
        try {
            IAdView newInstance = adItem.getAdType().getViewClass().getDeclaredConstructor(Context.class).newInstance(this.e.getApplicationContext());
            try {
                newInstance.setInternalEventListener(this);
                newInstance.setAssetResolver(this.f9427d);
                return newInstance;
            } catch (Exception e) {
                iAdView = newInstance;
                e = e;
                e.printStackTrace();
                return iAdView;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void a(int i, String str, Throwable th) {
        this.f9426c.logException(i, str, th);
    }

    public void a(AdViewModel adViewModel, final InterfaceC0411a<AdItem> interfaceC0411a) {
        try {
            this.f9427d.a(adViewModel.getAdItem(), adViewModel.getAssetUrls(), new com.youappi.sdk.logic.impl.cache.a() { // from class: com.youappi.sdk.logic.impl.a.2
                @Override // com.youappi.sdk.logic.impl.cache.a
                public void a(AdItem adItem) {
                    a.this.f9426c.log(a.f9424a, adItem.getAdType() + " Ad is available.");
                    if (interfaceC0411a != null) {
                        interfaceC0411a.a(adItem);
                    }
                }

                @Override // com.youappi.sdk.logic.impl.cache.a
                public void a(AdItem adItem, String str, int i, Throwable th) {
                    a.this.f9426c.log(a.f9424a, adItem.getAdType() + " Ad failed to load. asset url: " + str);
                    a.this.onGotEvent("error", VastError.VAST_ERROR_PRELOADING_ASSETS, "asset url: " + str, g.c(a.this.e), 0, adItem);
                    if (interfaceC0411a != null) {
                        String str2 = "Ad failed to load, asset url: " + str + ", errorCode " + i;
                        interfaceC0411a.a(YAErrorCode.PRELOAD_ERROR, th != null ? new Exception(str2, th) : new Exception(str2));
                    }
                    a.this.f9427d.a(adItem);
                }
            });
        } catch (Exception e) {
            if (interfaceC0411a != null) {
                interfaceC0411a.a(YAErrorCode.PRELOAD_ERROR, e);
            }
        }
    }

    public void a(Runnable runnable) {
        this.f.post(runnable);
    }

    public void a(String str, String str2) {
        this.f9426c.log(str, str2);
    }

    public boolean a() {
        return this.e != null;
    }

    public <T extends BaseAd> boolean b(AdItem adItem) {
        try {
            this.f9426c.log(f9424a, "showAd : ad = " + adItem.getAdType());
            Intent putExtra = new Intent(this.e, (Class<?>) AdActivity.class).putExtra(AdActivity.EXTRA_AD_TYPE, adItem);
            putExtra.addFlags(268435456);
            this.e.startActivity(putExtra);
            return true;
        } catch (Exception e) {
            this.f9426c.logException(e);
            throw e;
        }
    }

    @Override // com.youappi.sdk.logic.IAdEventListener
    public void onGotEvent(String str, VastError vastError, String str2, DeviceOrientation deviceOrientation, int i, AdItem adItem) {
        if (com.youappi.sdk.utils.d.a(str, adItem)) {
            Iterator<String> it = adItem.getEventUrls().get(str).iterator();
            while (it.hasNext()) {
                b(com.youappi.sdk.utils.d.a(com.youappi.sdk.utils.d.a(it.next(), deviceOrientation, i), vastError, str2), str);
            }
        }
    }
}
