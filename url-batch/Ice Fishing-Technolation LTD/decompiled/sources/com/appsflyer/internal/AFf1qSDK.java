package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class AFf1qSDK extends AFe1mSDK<AFf1pSDK> {
    public AFi1wSDK areAllFieldsValid;
    private final AFc1oSDK component1;
    public final AFf1mSDK component2;
    public AFf1pSDK component3;
    private final AFf1nSDK component4;
    private final AFd1nSDK copy;
    private final AFf1jSDK copydefault;
    private final String equals;
    private final AFf1hSDK hashCode;
    private final AFf1eSDK toString;

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    public AFf1qSDK(AFf1nSDK aFf1nSDK, AFc1oSDK aFc1oSDK, AFf1eSDK aFf1eSDK, AFf1hSDK aFf1hSDK, AFd1nSDK aFd1nSDK, AFf1jSDK aFf1jSDK, String str, AFf1mSDK aFf1mSDK) {
        super(AFe1pSDK.RC_CDN, new AFe1pSDK[0], "UpdateRemoteConfiguration");
        this.component3 = null;
        this.component4 = aFf1nSDK;
        this.component1 = aFc1oSDK;
        this.toString = aFf1eSDK;
        this.hashCode = aFf1hSDK;
        this.copy = aFd1nSDK;
        this.copydefault = aFf1jSDK;
        this.equals = str;
        this.component2 = aFf1mSDK;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() throws Exception {
        try {
            AFf1pSDK component3 = component3();
            this.component3 = component3;
            if (component3 == AFf1pSDK.FAILURE) {
                return AFe1uSDK.FAILURE;
            }
            return AFe1uSDK.SUCCESS;
        } catch (InterruptedIOException e) {
            e = e;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1pSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        } catch (InterruptedException e2) {
            e = e2;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1pSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component3 = AFf1pSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFf1pSDK component3() throws InterruptedException, InterruptedIOException {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.equals;
        String mediationNetwork = this.toString.getMediationNetwork();
        if (mediationNetwork == null || mediationNetwork.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else if (str2 == null) {
            AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
        } else {
            str = AFj1dSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str2, this.component1.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()}), mediationNetwork);
            if (str != null) {
                AFLogger.INSTANCE.v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1pSDK.FAILURE;
            }
            try {
                if (this.copydefault.AFAdRevenueData()) {
                    AFLogger.INSTANCE.i(AFg1cSDK.REMOTE_CONTROL, "Cached config is expired, updating...");
                    AFe1wSDK<AFi1vSDK> currencyIso4217Code = this.copy.getRevenue(this.copydefault.getMonetizationNetwork(), this.copydefault.getMediationNetwork(), str, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).getCurrencyIso4217Code();
                    if (currencyIso4217Code.isSuccessful()) {
                        AFi1vSDK body = currencyIso4217Code.getBody();
                        String revenue = currencyIso4217Code.getRevenue("x-amz-meta-af-auth-v1");
                        String revenue2 = currencyIso4217Code.getRevenue("CF-Cache-Status");
                        String mediationNetwork2 = this.toString.getMediationNetwork();
                        if (mediationNetwork2 != null && mediationNetwork2.trim().length() != 0) {
                            AFi1sSDK revenue3 = this.component4.getRevenue(body, revenue, str, mediationNetwork2);
                            if (revenue3.getCurrencyIso4217Code()) {
                                long currencyIso4217Code2 = this.copydefault.getCurrencyIso4217Code();
                                AFLogger.INSTANCE.v(AFg1cSDK.REMOTE_CONTROL, new StringBuilder("using max-age fallback: ").append(currencyIso4217Code2).append(" seconds").toString());
                                long currentTimeMillis2 = System.currentTimeMillis();
                                AFf1hSDK aFf1hSDK = this.hashCode;
                                aFf1hSDK.AFAdRevenueData.getRevenue("af_remote_config", Base64.encodeToString(body.getMediationNetwork.getBytes(Charset.defaultCharset()), 2));
                                aFf1hSDK.getMediationNetwork = aFf1hSDK.getCurrencyIso4217Code;
                                aFf1hSDK.AFAdRevenueData.AFAdRevenueData("af_rc_timestamp", currentTimeMillis2);
                                aFf1hSDK.AFAdRevenueData.AFAdRevenueData("af_rc_max_age", currencyIso4217Code2);
                                aFf1hSDK.getCurrencyIso4217Code = body;
                                aFf1hSDK.getRevenue = currentTimeMillis2;
                                aFf1hSDK.getMonetizationNetwork = currencyIso4217Code2;
                                AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, new StringBuilder("Config successfully updated, timeToLive: ").append(currencyIso4217Code2).append(" seconds").toString());
                                getCurrencyIso4217Code(str, currentTimeMillis, revenue3.getRevenue, revenue2, currencyIso4217Code);
                                return AFf1pSDK.SUCCESS;
                            }
                            getCurrencyIso4217Code(str, currentTimeMillis, revenue3.getRevenue, revenue2, currencyIso4217Code);
                            AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "fetched config is not valid (MITM?) refuse to use it.");
                            return AFf1pSDK.FAILURE;
                        }
                        AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
                        return AFf1pSDK.FAILURE;
                    }
                    getCurrencyIso4217Code(str, currentTimeMillis, null, null, currencyIso4217Code);
                    AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, new StringBuilder("failed to fetch remote config from CDN with status code: ").append(currencyIso4217Code.getStatusCode()).toString());
                    return AFf1pSDK.FAILURE;
                }
                AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                return AFf1pSDK.USE_CACHED;
            } catch (IOException e) {
                AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, new StringBuilder("failed to fetch remote config: ").append(e.getMessage()).toString(), e, true, false, false);
                getMonetizationNetwork(str, currentTimeMillis, e instanceof ParsingException ? ((ParsingException) e).getRawResponse() : null, null, null, null, e);
                if (e.getCause() instanceof InterruptedIOException) {
                    throw ((InterruptedIOException) e.getCause());
                }
                return AFf1pSDK.FAILURE;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, new StringBuilder("failed to update remote config: ").append(th.getMessage()).toString(), th, true, false, false);
                getMonetizationNetwork(str, currentTimeMillis, null, null, null, null, th);
                if (th.getCause() instanceof InterruptedException) {
                    throw ((InterruptedException) th.getCause());
                }
                return AFf1pSDK.FAILURE;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    private void getCurrencyIso4217Code(String str, long j, AFi1ySDK aFi1ySDK, String str2, AFe1wSDK<AFi1vSDK> aFe1wSDK) {
        getMonetizationNetwork(str, j, aFe1wSDK, aFe1wSDK != null ? aFe1wSDK.getBody() : null, aFi1ySDK, str2 != null ? str2 : null, null);
    }

    private void getMonetizationNetwork(String str, long j, AFe1wSDK<?> aFe1wSDK, AFi1vSDK aFi1vSDK, AFi1ySDK aFi1ySDK, String str2, Throwable th) {
        long j2;
        int i;
        Throwable th2;
        long j3;
        if (aFe1wSDK != null) {
            j2 = aFe1wSDK.getMonetizationNetwork.getMediationNetwork;
            i = aFe1wSDK.getStatusCode();
        } else {
            j2 = 0;
            i = 0;
        }
        int i2 = i;
        if (th instanceof HttpException) {
            th2 = th.getCause();
            j3 = ((HttpException) th).getMetrics().getMediationNetwork;
        } else {
            th2 = th;
            j3 = j2;
        }
        this.areAllFieldsValid = new AFi1wSDK(aFi1vSDK != null ? aFi1vSDK.AFAdRevenueData : null, str, j3, System.currentTimeMillis() - j, i2, aFi1ySDK, str2, th2);
    }
}
