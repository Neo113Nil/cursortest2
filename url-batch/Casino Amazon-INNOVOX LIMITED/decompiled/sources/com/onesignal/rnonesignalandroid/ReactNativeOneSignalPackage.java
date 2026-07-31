package com.onesignal.rnonesignalandroid;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ReactNativeOneSignalPackage extends BaseReactPackage {
    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("OneSignal")) {
            return new RNOneSignal(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: com.onesignal.rnonesignalandroid.ReactNativeOneSignalPackage.1
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public Map<String, ReactModuleInfo> getReactModuleInfos() {
                HashMap hashMap = new HashMap();
                hashMap.put("OneSignal", new ReactModuleInfo("OneSignal", "OneSignal", false, false, false, true));
                return hashMap;
            }
        };
    }
}
