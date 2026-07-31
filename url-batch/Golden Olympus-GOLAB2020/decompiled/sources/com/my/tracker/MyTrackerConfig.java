package com.my.tracker;

import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import com.my.tracker.config.AntiFraudConfig;
import com.my.tracker.obfuscated.C1712z2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final class MyTrackerConfig {

    @NonNull
    private final C1712z2 trackerConfig;

    public interface InstalledPackagesProvider {
        List<PackageInfo> getInstalledPackages();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LocationTrackingMode {
        public static final int ACTIVE = 2;
        public static final int CACHED = 1;
        public static final int NONE = 0;
    }

    public interface OkHttpClientProvider {
        @NonNull
        OkHttpClient getOkHttpClient();
    }

    private MyTrackerConfig(@NonNull C1712z2 c1712z2) {
        this.trackerConfig = c1712z2;
    }

    @NonNull
    static MyTrackerConfig newConfig(@NonNull C1712z2 c1712z2) {
        return new MyTrackerConfig(c1712z2);
    }

    @NonNull
    public AntiFraudConfig getAntiFraudConfig() {
        return this.trackerConfig.a();
    }

    public String getApkPreinstallParams() {
        return this.trackerConfig.b();
    }

    public int getBufferingPeriod() {
        return this.trackerConfig.e();
    }

    public int getForcingPeriod() {
        return this.trackerConfig.f();
    }

    @NonNull
    public String getId() {
        return this.trackerConfig.g();
    }

    public int getLaunchTimeout() {
        return this.trackerConfig.i();
    }

    public int getLocationTrackingMode() {
        return this.trackerConfig.j();
    }

    @Deprecated
    public String getVendorAppPackage() {
        return this.trackerConfig.r();
    }

    public boolean isAutotrackingPurchaseEnabled() {
        return this.trackerConfig.s();
    }

    public boolean isTrackingEnvironmentEnabled() {
        return this.trackerConfig.t();
    }

    public boolean isTrackingLaunchEnabled() {
        return this.trackerConfig.u();
    }

    @Deprecated
    public boolean isTrackingLocationEnabled() {
        int j4 = this.trackerConfig.j();
        return j4 == 1 || j4 == 2;
    }

    public boolean isTrackingPreinstallEnabled() {
        return this.trackerConfig.v();
    }

    public boolean isTrackingPreinstallThirdPartyEnabled() {
        return this.trackerConfig.w();
    }

    public void setAntiFraudConfig(@NonNull AntiFraudConfig antiFraudConfig) {
        this.trackerConfig.a(antiFraudConfig);
    }

    @NonNull
    public MyTrackerConfig setApkPreinstallParams(String str) {
        this.trackerConfig.a(str);
        return this;
    }

    @NonNull
    public MyTrackerConfig setAutotrackingPurchaseEnabled(boolean z4) {
        this.trackerConfig.a(z4);
        return this;
    }

    @NonNull
    public MyTrackerConfig setBufferingPeriod(int i4) {
        this.trackerConfig.a(i4);
        return this;
    }

    @NonNull
    @Deprecated
    public MyTrackerConfig setDefaultVendorAppPackage() {
        this.trackerConfig.z();
        return this;
    }

    @NonNull
    public MyTrackerConfig setForcingPeriod(int i4) {
        this.trackerConfig.b(i4);
        return this;
    }

    @NonNull
    public MyTrackerConfig setInstalledPackagesProvider(InstalledPackagesProvider installedPackagesProvider) {
        this.trackerConfig.a(installedPackagesProvider);
        return this;
    }

    @NonNull
    public MyTrackerConfig setLaunchTimeout(int i4) {
        this.trackerConfig.c(i4);
        return this;
    }

    @NonNull
    public MyTrackerConfig setLocationTrackingMode(int i4) {
        this.trackerConfig.d(i4);
        return this;
    }

    @NonNull
    public MyTrackerConfig setOkHttpClientProvider(OkHttpClientProvider okHttpClientProvider) {
        this.trackerConfig.a(okHttpClientProvider);
        return this;
    }

    @NonNull
    public MyTrackerConfig setProxyHost(String str) {
        this.trackerConfig.c(str);
        return this;
    }

    @NonNull
    public MyTrackerConfig setTrackingEnvironmentEnabled(boolean z4) {
        this.trackerConfig.b(z4);
        return this;
    }

    @NonNull
    public MyTrackerConfig setTrackingLaunchEnabled(boolean z4) {
        this.trackerConfig.c(z4);
        return this;
    }

    @NonNull
    @Deprecated
    public MyTrackerConfig setTrackingLocationEnabled(boolean z4) {
        C1712z2 c1712z2;
        int i4;
        if (z4) {
            c1712z2 = this.trackerConfig;
            i4 = 1;
        } else {
            c1712z2 = this.trackerConfig;
            i4 = 0;
        }
        c1712z2.d(i4);
        return this;
    }

    @NonNull
    public MyTrackerConfig setTrackingPreinstallEnabled(boolean z4) {
        this.trackerConfig.d(z4);
        return this;
    }

    @NonNull
    public MyTrackerConfig setTrackingPreinstallThirdPartyEnabled(boolean z4) {
        this.trackerConfig.e(z4);
        return this;
    }

    @NonNull
    @Deprecated
    public MyTrackerConfig setVendorAppPackage(String str) {
        this.trackerConfig.e(str);
        return this;
    }
}
