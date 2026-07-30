package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class AFf1vSDK extends AFe1uSDK<AFf1nSDK> {
    private final AFc1gSDK AFKeystoreWrapper;
    private final AFf1qSDK areAllFieldsValid;
    public AFi1vSDK component1;
    private final AFc1kSDK component2;
    public AFf1nSDK component3;
    public final AFf1uSDK component4;
    private final String copy;
    private final AFf1oSDK copydefault;
    private final AFf1kSDK equals;
    private final AFf1pSDK hashCode;
    private final AFd1mSDK toString;

    public AFf1vSDK(AFf1qSDK aFf1qSDK, AFc1kSDK aFc1kSDK, AFf1kSDK aFf1kSDK, AFf1pSDK aFf1pSDK, AFd1mSDK aFd1mSDK, AFf1oSDK aFf1oSDK, String str, AFf1uSDK aFf1uSDK, AFc1gSDK aFc1gSDK) {
        super(AFe1lSDK.RC_CDN, new AFe1lSDK[0], "UpdateRemoteConfiguration");
        this.component3 = null;
        this.areAllFieldsValid = aFf1qSDK;
        this.component2 = aFc1kSDK;
        this.equals = aFf1kSDK;
        this.hashCode = aFf1pSDK;
        this.toString = aFd1mSDK;
        this.copydefault = aFf1oSDK;
        this.copy = str;
        this.component4 = aFf1uSDK;
        this.AFKeystoreWrapper = aFc1gSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFf1nSDK areAllFieldsValid() {
        String str;
        String AFAdRevenueData;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.copy;
        String monetizationNetwork = this.equals.getMonetizationNetwork();
        if (monetizationNetwork == null || monetizationNetwork.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else if (str2 == null) {
            AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
        } else {
            str = AFj1jSDK.getCurrencyIso4217Code(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str2, this.component2.getRevenue.getCurrencyIso4217Code.getPackageName()}), monetizationNetwork);
            if (str != null) {
                AFLogger.INSTANCE.v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1nSDK.FAILURE;
            }
            try {
                if (!this.copydefault.getMonetizationNetwork()) {
                    AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                    return AFf1nSDK.USE_CACHED;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
                aFLogger.i(aFg1cSDK, "Cached config is expired or net token is null, updating...");
                AFe1ySDK<AFh1cSDK> revenue = this.toString.AFAdRevenueData(this.copydefault.AFAdRevenueData(), this.copydefault.getCurrencyIso4217Code(), str, 1500).getRevenue();
                if (!revenue.isSuccessful()) {
                    getMonetizationNetwork(str, currentTimeMillis, null, null, revenue);
                    StringBuilder sb = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                    sb.append(revenue.getStatusCode());
                    aFLogger.w(aFg1cSDK, sb.toString());
                    return AFf1nSDK.FAILURE;
                }
                if (this.AFKeystoreWrapper != null && (AFAdRevenueData = revenue.AFAdRevenueData("af-net-tkn")) != null && !AFAdRevenueData.isEmpty()) {
                    this.AFKeystoreWrapper.hashCode = AFAdRevenueData;
                    aFLogger.d(aFg1cSDK, "Network token saved");
                }
                AFh1cSDK body = revenue.getBody();
                String AFAdRevenueData2 = revenue.AFAdRevenueData("x-amz-meta-af-auth-v1");
                String AFAdRevenueData3 = revenue.AFAdRevenueData("CF-Cache-Status");
                String monetizationNetwork2 = this.equals.getMonetizationNetwork();
                if (monetizationNetwork2 == null || monetizationNetwork2.trim().length() == 0) {
                    aFLogger.w(aFg1cSDK, "Dev key is not set, SDK is not started.");
                    return AFf1nSDK.FAILURE;
                }
                AFi1uSDK monetizationNetwork3 = this.areAllFieldsValid.getMonetizationNetwork(body, AFAdRevenueData2, str, monetizationNetwork2);
                if (!monetizationNetwork3.getMonetizationNetwork()) {
                    getMonetizationNetwork(str, currentTimeMillis, monetizationNetwork3.getMediationNetwork, AFAdRevenueData3, revenue);
                    aFLogger.w(aFg1cSDK, "fetched config is not valid (MITM?) refuse to use it.");
                    return AFf1nSDK.FAILURE;
                }
                long revenue2 = this.copydefault.getRevenue();
                StringBuilder sb2 = new StringBuilder("using max-age fallback: ");
                sb2.append(revenue2);
                sb2.append(" seconds");
                aFLogger.v(aFg1cSDK, sb2.toString());
                long currentTimeMillis2 = System.currentTimeMillis();
                AFf1pSDK aFf1pSDK = this.hashCode;
                String str3 = str;
                try {
                } catch (IOException e7) {
                    e = e7;
                    str = str3;
                } catch (Throwable th) {
                    th = th;
                    str = str3;
                }
                try {
                    aFf1pSDK.getCurrencyIso4217Code.getMediationNetwork("af_remote_config", Base64.encodeToString(body.getRevenue.getBytes(Charset.defaultCharset()), 2));
                    aFf1pSDK.getMonetizationNetwork = aFf1pSDK.AFAdRevenueData;
                    aFf1pSDK.getCurrencyIso4217Code.getRevenue("af_rc_timestamp", currentTimeMillis2);
                    aFf1pSDK.getCurrencyIso4217Code.getRevenue("af_rc_max_age", revenue2);
                    aFf1pSDK.AFAdRevenueData = body;
                    aFf1pSDK.getRevenue = currentTimeMillis2;
                    aFf1pSDK.getMediationNetwork = revenue2;
                    StringBuilder sb3 = new StringBuilder("Config successfully updated, timeToLive: ");
                    sb3.append(revenue2);
                    sb3.append(" seconds");
                    aFLogger.d(aFg1cSDK, sb3.toString());
                    getMonetizationNetwork(str3, currentTimeMillis, monetizationNetwork3.getMediationNetwork, AFAdRevenueData3, revenue);
                    return AFf1nSDK.SUCCESS;
                } catch (IOException e8) {
                    e = e8;
                    str = str3;
                    currentTimeMillis = currentTimeMillis;
                    IOException iOException = e;
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.REMOTE_CONTROL;
                    StringBuilder sb4 = new StringBuilder("failed to fetch remote config: ");
                    sb4.append(iOException.getMessage());
                    aFLogger2.e(aFg1cSDK2, sb4.toString(), iOException, true, false, false);
                    getCurrencyIso4217Code(str, currentTimeMillis, iOException instanceof ParsingException ? ((ParsingException) iOException).getRawResponse() : null, null, null, null, iOException);
                    if (iOException.getCause() instanceof InterruptedIOException) {
                        throw ((InterruptedIOException) iOException.getCause());
                    }
                    return AFf1nSDK.FAILURE;
                } catch (Throwable th2) {
                    th = th2;
                    str = str3;
                    currentTimeMillis = currentTimeMillis;
                    Throwable th3 = th;
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK3 = AFg1cSDK.REMOTE_CONTROL;
                    StringBuilder sb5 = new StringBuilder("failed to update remote config: ");
                    sb5.append(th3.getMessage());
                    aFLogger3.e(aFg1cSDK3, sb5.toString(), th3, true, false, false);
                    getCurrencyIso4217Code(str, currentTimeMillis, null, null, null, null, th3);
                    if (th3.getCause() instanceof InterruptedException) {
                        throw ((InterruptedException) th3.getCause());
                    }
                    return AFf1nSDK.FAILURE;
                }
            } catch (IOException e9) {
                e = e9;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    private void getCurrencyIso4217Code(String str, long j, AFe1ySDK<?> aFe1ySDK, AFh1cSDK aFh1cSDK, AFi1ySDK aFi1ySDK, String str2, Throwable th) {
        long j7;
        int i2;
        Throwable th2;
        if (aFe1ySDK != null) {
            j7 = aFe1ySDK.AFAdRevenueData.AFAdRevenueData;
            i2 = aFe1ySDK.getStatusCode();
        } else {
            j7 = 0;
            i2 = 0;
        }
        int i5 = i2;
        if (th instanceof HttpException) {
            Throwable cause = th.getCause();
            j7 = ((HttpException) th).getMetrics().AFAdRevenueData;
            th2 = cause;
        } else {
            th2 = th;
        }
        this.component1 = new AFi1vSDK(aFh1cSDK != null ? aFh1cSDK.AFAdRevenueData : null, str, j7, System.currentTimeMillis() - j, i5, aFi1ySDK, str2, th2);
    }

    private void getMonetizationNetwork(String str, long j, AFi1ySDK aFi1ySDK, String str2, AFe1ySDK<AFh1cSDK> aFe1ySDK) {
        getCurrencyIso4217Code(str, j, aFe1ySDK, aFe1ySDK != null ? aFe1ySDK.getBody() : null, aFi1ySDK, str2 != null ? str2 : null, null);
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final AFe1rSDK getMediationNetwork() {
        try {
            AFf1nSDK areAllFieldsValid = areAllFieldsValid();
            this.component3 = areAllFieldsValid;
            return areAllFieldsValid == AFf1nSDK.FAILURE ? AFe1rSDK.FAILURE : AFe1rSDK.SUCCESS;
        } catch (InterruptedIOException e7) {
            e = e7;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1nSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        } catch (InterruptedException e8) {
            e = e8;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1nSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component3 = AFf1nSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final long getRevenue() {
        return 1500L;
    }
}
