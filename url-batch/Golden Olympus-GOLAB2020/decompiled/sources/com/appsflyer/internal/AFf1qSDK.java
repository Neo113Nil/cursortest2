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
public final class AFf1qSDK extends AFe1sSDK<AFf1nSDK> {
    public final AFf1mSDK areAllFieldsValid;
    public AFf1nSDK component1;
    private final AFf1pSDK component2;
    public AFi1vSDK component3;
    private final AFc1pSDK component4;
    private final AFf1gSDK copy;
    private final AFf1lSDK copydefault;
    private final String equals;
    private final AFf1iSDK hashCode;
    private final AFd1oSDK toString;

    public AFf1qSDK(AFf1pSDK aFf1pSDK, AFc1pSDK aFc1pSDK, AFf1gSDK aFf1gSDK, AFf1lSDK aFf1lSDK, AFd1oSDK aFd1oSDK, AFf1iSDK aFf1iSDK, String str, AFf1mSDK aFf1mSDK) {
        super(AFe1mSDK.RC_CDN, new AFe1mSDK[0], "UpdateRemoteConfiguration");
        this.component1 = null;
        this.component2 = aFf1pSDK;
        this.component4 = aFc1pSDK;
        this.copy = aFf1gSDK;
        this.copydefault = aFf1lSDK;
        this.toString = aFd1oSDK;
        this.hashCode = aFf1iSDK;
        this.equals = str;
        this.areAllFieldsValid = aFf1mSDK;
    }

    private void AFAdRevenueData(String str, long j4, AFi1ySDK aFi1ySDK, String str2, AFd1aSDK<AFi1wSDK> aFd1aSDK) {
        getRevenue(str, j4, aFd1aSDK, aFd1aSDK != null ? aFd1aSDK.getBody() : null, aFi1ySDK, str2 != null ? str2 : null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFf1nSDK component1() {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.equals;
        String mediationNetwork = this.copy.getMediationNetwork();
        if (mediationNetwork == null || mediationNetwork.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else if (str2 == null) {
            AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
        } else {
            str = AFj1cSDK.getRevenue(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str2, this.component4.getRevenue.getMonetizationNetwork.getPackageName()}), mediationNetwork);
            if (str != null) {
                AFLogger.INSTANCE.v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1nSDK.FAILURE;
            }
            try {
                if (!this.hashCode.getMediationNetwork()) {
                    AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                    return AFf1nSDK.USE_CACHED;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
                aFLogger.i(aFg1cSDK, "Cached config is expired, updating...");
                AFd1aSDK<AFi1wSDK> mediationNetwork2 = ((AFd1nSDK) AFd1oSDK.getCurrencyIso4217Code(new Object[]{this.toString, Boolean.valueOf(this.hashCode.getMonetizationNetwork()), Boolean.valueOf(this.hashCode.getRevenue()), str, 1500}, 662152322, -662152320, 1500)).getMediationNetwork();
                if (!mediationNetwork2.isSuccessful()) {
                    AFAdRevenueData(str, currentTimeMillis, null, null, mediationNetwork2);
                    StringBuilder sb = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                    sb.append(mediationNetwork2.getStatusCode());
                    aFLogger.w(aFg1cSDK, sb.toString());
                    return AFf1nSDK.FAILURE;
                }
                AFi1wSDK body = mediationNetwork2.getBody();
                String currencyIso4217Code = mediationNetwork2.getCurrencyIso4217Code("x-amz-meta-af-auth-v1");
                String currencyIso4217Code2 = mediationNetwork2.getCurrencyIso4217Code("CF-Cache-Status");
                String mediationNetwork3 = this.copy.getMediationNetwork();
                if (mediationNetwork3 == null || mediationNetwork3.trim().length() == 0) {
                    aFLogger.w(aFg1cSDK, "Dev key is not set, SDK is not started.");
                    return AFf1nSDK.FAILURE;
                }
                AFi1uSDK revenue = this.component2.getRevenue(body, currencyIso4217Code, str, mediationNetwork3);
                if (!revenue.getRevenue()) {
                    AFAdRevenueData(str, currentTimeMillis, revenue.AFAdRevenueData, currencyIso4217Code2, mediationNetwork2);
                    aFLogger.w(aFg1cSDK, "fetched config is not valid (MITM?) refuse to use it.");
                    return AFf1nSDK.FAILURE;
                }
                long AFAdRevenueData = this.hashCode.AFAdRevenueData();
                StringBuilder sb2 = new StringBuilder("using max-age fallback: ");
                sb2.append(AFAdRevenueData);
                sb2.append(" seconds");
                aFLogger.v(aFg1cSDK, sb2.toString());
                long currentTimeMillis2 = System.currentTimeMillis();
                AFf1lSDK aFf1lSDK = this.copydefault;
                String str3 = str;
                try {
                } catch (IOException e4) {
                    e = e4;
                    str = str3;
                } catch (Throwable th) {
                    th = th;
                    str = str3;
                }
                try {
                    aFf1lSDK.getMonetizationNetwork.getMediationNetwork("af_remote_config", Base64.encodeToString(body.getCurrencyIso4217Code.getBytes(Charset.defaultCharset()), 2));
                    aFf1lSDK.AFAdRevenueData = aFf1lSDK.getCurrencyIso4217Code;
                    aFf1lSDK.getMonetizationNetwork.getMonetizationNetwork("af_rc_timestamp", currentTimeMillis2);
                    aFf1lSDK.getMonetizationNetwork.getMonetizationNetwork("af_rc_max_age", AFAdRevenueData);
                    aFf1lSDK.getCurrencyIso4217Code = body;
                    aFf1lSDK.getMediationNetwork = currentTimeMillis2;
                    aFf1lSDK.getRevenue = AFAdRevenueData;
                    StringBuilder sb3 = new StringBuilder("Config successfully updated, timeToLive: ");
                    sb3.append(AFAdRevenueData);
                    sb3.append(" seconds");
                    aFLogger.d(aFg1cSDK, sb3.toString());
                    AFAdRevenueData(str3, currentTimeMillis, revenue.AFAdRevenueData, currencyIso4217Code2, mediationNetwork2);
                    return AFf1nSDK.SUCCESS;
                } catch (IOException e5) {
                    e = e5;
                    str = str3;
                    currentTimeMillis = currentTimeMillis;
                    IOException iOException = e;
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.REMOTE_CONTROL;
                    StringBuilder sb4 = new StringBuilder("failed to fetch remote config: ");
                    sb4.append(iOException.getMessage());
                    aFLogger2.e(aFg1cSDK2, sb4.toString(), iOException, true, false, false);
                    getRevenue(str, currentTimeMillis, iOException instanceof ParsingException ? ((ParsingException) iOException).getRawResponse() : null, null, null, null, iOException);
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
                    getRevenue(str, currentTimeMillis, null, null, null, null, th3);
                    if (th3.getCause() instanceof InterruptedException) {
                        throw ((InterruptedException) th3.getCause());
                    }
                    return AFf1nSDK.FAILURE;
                }
            } catch (IOException e6) {
                e = e6;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    private void getRevenue(String str, long j4, AFd1aSDK<?> aFd1aSDK, AFi1wSDK aFi1wSDK, AFi1ySDK aFi1ySDK, String str2, Throwable th) {
        long j5;
        int i4;
        Throwable th2;
        if (aFd1aSDK != null) {
            j5 = aFd1aSDK.getRevenue.getRevenue;
            i4 = aFd1aSDK.getStatusCode();
        } else {
            j5 = 0;
            i4 = 0;
        }
        int i5 = i4;
        if (th instanceof HttpException) {
            Throwable cause = th.getCause();
            j5 = ((HttpException) th).getMetrics().getRevenue;
            th2 = cause;
        } else {
            th2 = th;
        }
        this.component3 = new AFi1vSDK(aFi1wSDK != null ? aFi1wSDK.getRevenue : null, str, j5, System.currentTimeMillis() - j4, i5, aFi1ySDK, str2, th2);
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final AFe1rSDK getCurrencyIso4217Code() {
        try {
            AFf1nSDK component1 = component1();
            this.component1 = component1;
            return component1 == AFf1nSDK.FAILURE ? AFe1rSDK.FAILURE : AFe1rSDK.SUCCESS;
        } catch (InterruptedIOException e4) {
            e = e4;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component1 = AFf1nSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        } catch (InterruptedException e5) {
            e = e5;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component1 = AFf1nSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component1 = AFf1nSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return 1500L;
    }
}
