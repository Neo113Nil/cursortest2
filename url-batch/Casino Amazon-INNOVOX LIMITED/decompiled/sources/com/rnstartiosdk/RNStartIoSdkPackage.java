package com.rnstartiosdk;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import com.margelo.nitro.rnstartiosdk.RNStartIoSdkOnLoad;
import com.margelo.nitro.rnstartiosdk.views.HybridRNStartIoBannerManager;
import com.margelo.nitro.rnstartiosdk.views.HybridRNStartIoNativeAdManager;
import com.margelo.nitro.rnstartiosdk.views.HybridRNStartIoNativeAdTouchAreaManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class RNStartIoSdkPackage extends BaseReactPackage {
    public static /* synthetic */ HashMap $r8$lambda$3FeBv4ixfZRVwH1mHN3bkI3bjpI() {
        return new HashMap();
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HybridRNStartIoBannerManager());
        arrayList.add(new HybridRNStartIoNativeAdManager());
        arrayList.add(new HybridRNStartIoNativeAdTouchAreaManager());
        return arrayList;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: com.rnstartiosdk.RNStartIoSdkPackage$$ExternalSyntheticLambda0
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return RNStartIoSdkPackage.$r8$lambda$3FeBv4ixfZRVwH1mHN3bkI3bjpI();
            }
        };
    }

    static {
        RNStartIoSdkOnLoad.initializeNative();
    }
}
