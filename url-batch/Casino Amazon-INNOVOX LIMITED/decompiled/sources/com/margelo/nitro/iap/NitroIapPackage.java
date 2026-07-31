package com.margelo.nitro.iap;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class NitroIapPackage extends TurboReactPackage {
    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: com.margelo.nitro.iap.NitroIapPackage$$ExternalSyntheticLambda0
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return NitroIapPackage.lambda$getReactModuleInfoProvider$0();
            }
        };
    }

    static /* synthetic */ Map lambda$getReactModuleInfoProvider$0() {
        return new HashMap();
    }

    static {
        NitroIapOnLoad.initializeNative();
    }
}
