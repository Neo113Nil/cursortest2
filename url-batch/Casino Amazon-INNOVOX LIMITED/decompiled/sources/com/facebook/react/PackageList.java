package com.facebook.react;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.BV.LinearGradient.LinearGradientPackage;
import com.facebook.react.shell.MainPackageConfig;
import com.facebook.react.shell.MainReactPackage;
import com.horcrux.svg.SvgPackage;
import com.margelo.nitro.NitroModulesPackage;
import com.margelo.nitro.iap.NitroIapPackage;
import com.onesignal.rnonesignalandroid.ReactNativeOneSignalPackage;
import com.rnstartiosdk.RNStartIoSdkPackage;
import com.swmansion.gesturehandler.RNGestureHandlerPackage;
import com.swmansion.rnscreens.RNScreensPackage;
import com.th3rdwave.safeareacontext.SafeAreaContextPackage;
import com.zmxv.RNSound.SoundPackage;
import io.appmetrica.analytics.reactnative.AppMetricaPackage;
import java.util.ArrayList;
import java.util.Arrays;
import org.asyncstorage.AsyncStoragePackage;

/* loaded from: classes2.dex */
public class PackageList {
    private Application application;
    private MainPackageConfig mConfig;
    private ReactNativeHost reactNativeHost;

    public PackageList(ReactNativeHost reactNativeHost) {
        this(reactNativeHost, (MainPackageConfig) null);
    }

    public PackageList(Application application) {
        this(application, (MainPackageConfig) null);
    }

    public PackageList(ReactNativeHost reactNativeHost, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = reactNativeHost;
        this.mConfig = mainPackageConfig;
    }

    public PackageList(Application application, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = null;
        this.application = application;
        this.mConfig = mainPackageConfig;
    }

    private ReactNativeHost getReactNativeHost() {
        return this.reactNativeHost;
    }

    private Resources getResources() {
        return getApplication().getResources();
    }

    private Application getApplication() {
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        return reactNativeHost == null ? this.application : reactNativeHost.getApplication();
    }

    private Context getApplicationContext() {
        return getApplication().getApplicationContext();
    }

    public ArrayList<ReactPackage> getPackages() {
        return new ArrayList<>(Arrays.asList(new MainReactPackage(this.mConfig), new AppMetricaPackage(), new AsyncStoragePackage(), new RNGestureHandlerPackage(), new NitroIapPackage(), new LinearGradientPackage(), new NitroModulesPackage(), new ReactNativeOneSignalPackage(), new SafeAreaContextPackage(), new RNScreensPackage(), new SoundPackage(), new RNStartIoSdkPackage(), new SvgPackage()));
    }
}
