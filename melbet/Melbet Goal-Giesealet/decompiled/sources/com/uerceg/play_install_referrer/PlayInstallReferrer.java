package com.uerceg.play_install_referrer;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public class PlayInstallReferrer extends ReactContextBaseJavaModule {
    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    public PlayInstallReferrer(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PlayInstallReferrer";
    }

    @ReactMethod
    public void getInstallReferrerInfo() {
        try {
            final InstallReferrerClient build = InstallReferrerClient.newBuilder(getReactApplicationContext()).build();
            build.startConnection(new InstallReferrerStateListener() { // from class: com.uerceg.play_install_referrer.PlayInstallReferrer.1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int i) {
                    if (i == -1) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("responseCode", "SERVICE_DISCONNECTED");
                        createMap.putString("message", "SERVICE_DISCONNECTED");
                        PlayInstallReferrer playInstallReferrer = PlayInstallReferrer.this;
                        playInstallReferrer.sendEvent(playInstallReferrer.getReactApplicationContext(), "play_install_referrer_error", createMap);
                        build.endConnection();
                        return;
                    }
                    if (i == 0) {
                        new Thread(new Runnable() { // from class: com.uerceg.play_install_referrer.PlayInstallReferrer.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    try {
                                        ReferrerDetails installReferrer = build.getInstallReferrer();
                                        if (installReferrer != null) {
                                            String installReferrer2 = installReferrer.getInstallReferrer();
                                            long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                                            long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                                            long referrerClickTimestampServerSeconds = installReferrer.getReferrerClickTimestampServerSeconds();
                                            long installBeginTimestampServerSeconds = installReferrer.getInstallBeginTimestampServerSeconds();
                                            String installVersion = installReferrer.getInstallVersion();
                                            boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                                            WritableMap createMap2 = Arguments.createMap();
                                            createMap2.putString("installReferrer", installReferrer2);
                                            createMap2.putString("referrerClickTimestampSeconds", Long.toString(referrerClickTimestampSeconds));
                                            createMap2.putString("installBeginTimestampSeconds", Long.toString(installBeginTimestampSeconds));
                                            createMap2.putString("referrerClickTimestampServerSeconds", Long.toString(referrerClickTimestampServerSeconds));
                                            createMap2.putString("installBeginTimestampServerSeconds", Long.toString(installBeginTimestampServerSeconds));
                                            createMap2.putString("installVersion", installVersion);
                                            createMap2.putString("googlePlayInstant", Boolean.toString(googlePlayInstantParam));
                                            PlayInstallReferrer.this.sendEvent(PlayInstallReferrer.this.getReactApplicationContext(), "play_install_referrer_value", createMap2);
                                        } else {
                                            WritableMap createMap3 = Arguments.createMap();
                                            createMap3.putString("message", "Response from install referrer library was null");
                                            PlayInstallReferrer.this.sendEvent(PlayInstallReferrer.this.getReactApplicationContext(), "play_install_referrer_error", createMap3);
                                        }
                                    } catch (RemoteException e) {
                                        WritableMap createMap4 = Arguments.createMap();
                                        createMap4.putString("message", "Exception while reading install referrer info: " + e.getMessage());
                                        PlayInstallReferrer.this.sendEvent(PlayInstallReferrer.this.getReactApplicationContext(), "play_install_referrer_error", createMap4);
                                    }
                                } finally {
                                    build.endConnection();
                                }
                            }
                        }).start();
                        return;
                    }
                    if (i == 1) {
                        WritableMap createMap2 = Arguments.createMap();
                        createMap2.putString("responseCode", "SERVICE_UNAVAILABLE");
                        createMap2.putString("message", "SERVICE_UNAVAILABLE");
                        PlayInstallReferrer playInstallReferrer2 = PlayInstallReferrer.this;
                        playInstallReferrer2.sendEvent(playInstallReferrer2.getReactApplicationContext(), "play_install_referrer_error", createMap2);
                        build.endConnection();
                        return;
                    }
                    if (i == 2) {
                        WritableMap createMap3 = Arguments.createMap();
                        createMap3.putString("responseCode", "FEATURE_NOT_SUPPORTED");
                        createMap3.putString("message", "FEATURE_NOT_SUPPORTED");
                        PlayInstallReferrer playInstallReferrer3 = PlayInstallReferrer.this;
                        playInstallReferrer3.sendEvent(playInstallReferrer3.getReactApplicationContext(), "play_install_referrer_error", createMap3);
                        build.endConnection();
                        return;
                    }
                    if (i != 3) {
                        return;
                    }
                    WritableMap createMap4 = Arguments.createMap();
                    createMap4.putString("responseCode", "DEVELOPER_ERROR");
                    createMap4.putString("message", "DEVELOPER_ERROR");
                    PlayInstallReferrer playInstallReferrer4 = PlayInstallReferrer.this;
                    playInstallReferrer4.sendEvent(playInstallReferrer4.getReactApplicationContext(), "play_install_referrer_error", createMap4);
                    build.endConnection();
                }
            });
        } catch (Throwable th) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("message", "Exception while starting connection with referrer client: " + th.getMessage());
            sendEvent(getReactApplicationContext(), "play_install_referrer_error", createMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str, @Nullable WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }
}
