package com.adjust.sdk.network;

import android.content.Context;
import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.AdjustSigner;
import com.adjust.sdk.Constants;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.PackageBuilder;
import com.adjust.sdk.ResponseData;
import com.adjust.sdk.SharedPreferencesManager;
import com.adjust.sdk.TrackingState;
import com.adjust.sdk.Util;
import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.network.UtilNetworking;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadExecutor;
import com.imaginationoverflow.unity.referrer.BuildConfig;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ActivityPackageSender implements IActivityPackageSender {
    private String basePath;
    private String clientSdk;
    private int connectionTimeout;
    private Context context;
    private String gdprPath;
    private String purchaseVerificationPath;
    private String subscriptionPath;
    private UrlStrategy urlStrategy;
    private ILogger logger = AdjustFactory.getLogger();
    private ThreadExecutor executor = new SingleThreadCachedScheduler("ActivityPackageSender");
    private UtilNetworking.IHttpsURLConnectionProvider httpsURLConnectionProvider = AdjustFactory.getHttpsURLConnectionProvider();
    private UtilNetworking.IConnectionOptions connectionOptions = AdjustFactory.getConnectionOptions();

    public ActivityPackageSender(List<String> list, boolean z, String str, String str2, String str3, String str4, String str5, int i, Context context) {
        this.basePath = str;
        this.gdprPath = str2;
        this.subscriptionPath = str3;
        this.purchaseVerificationPath = str4;
        this.clientSdk = str5;
        this.connectionTimeout = i;
        this.context = context;
        this.urlStrategy = new UrlStrategy(AdjustFactory.getBaseUrl(), AdjustFactory.getGdprUrl(), AdjustFactory.getSubscriptionUrl(), AdjustFactory.getPurchaseVerificationUrl(), list, z);
    }

    private DataOutputStream configConnectionForGET(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        return null;
    }

    private DataOutputStream configConnectionForPOST(HttpsURLConnection httpsURLConnection, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        httpsURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        String generatePOSTBodyString = generatePOSTBodyString(map, map2, map3);
        if (generatePOSTBodyString == null) {
            return null;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(generatePOSTBodyString);
        return dataOutputStream;
    }

    private String errorMessage(Throwable th, String str, ActivityPackage activityPackage) {
        return Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), Util.getReasonString(str, th));
    }

    private static String extractAuthorizationHeader(Map<String, String> map) {
        return map.remove("authorization");
    }

    private static String extractTargetUrl(Map<String, String> map, ActivityKind activityKind, UrlStrategy urlStrategy) {
        String remove = map.remove("endpoint");
        return remove != null ? remove : urlStrategy.targetUrlByActivityKind(activityKind);
    }

    private String generatePOSTBodyString(Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        StringBuilder sb = new StringBuilder();
        if (map3 == null || map3.isEmpty()) {
            if (map != null && !map.isEmpty()) {
                injectParametersToPOSTStringBuilder(map, sb);
            }
            if (map2 != null && !map2.isEmpty()) {
                injectParametersToPOSTStringBuilder(map2, sb);
            }
        } else {
            injectParametersToPOSTStringBuilder(map3, sb);
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '&') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private String generateUrlStringForGET(ActivityKind activityKind, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        URL url = new URL(urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map3, activityKind, this.urlStrategy)));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(url.getProtocol());
        builder.encodedAuthority(url.getAuthority());
        builder.path(url.getPath());
        builder.appendPath(str);
        this.logger.debug("Making request to url: %s", builder.toString());
        if (map3 == null || map3.isEmpty()) {
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            if (map2 != null) {
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    builder.appendQueryParameter(entry2.getKey(), entry2.getValue());
                }
            }
        } else {
            for (Map.Entry<String, String> entry3 : map3.entrySet()) {
                builder.appendQueryParameter(entry3.getKey(), entry3.getValue());
            }
        }
        return builder.build().toString();
    }

    private String generateUrlStringForPOST(ActivityKind activityKind, String str, Map<String, String> map) {
        String formatString = Util.formatString("%s%s", urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map, activityKind, this.urlStrategy)), str);
        this.logger.debug("Making request to url : %s", formatString);
        return formatString;
    }

    private void injectParametersToPOSTStringBuilder(Map<String, String> map, StringBuilder sb) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String encode = URLEncoder.encode(entry.getKey(), Constants.ENCODING);
            String value = entry.getValue();
            String encode2 = value != null ? URLEncoder.encode(value, Constants.ENCODING) : BuildConfig.FLAVOR;
            sb.append(encode);
            sb.append("=");
            sb.append(encode2);
            sb.append("&");
        }
    }

    private void localError(Throwable th, String str, ResponseData responseData, int i) {
        String errorMessage = errorMessage(th, str, responseData.activityPackage);
        this.logger.error(errorMessage, new Object[0]);
        responseData.message = errorMessage;
        responseData.willRetry = false;
        responseData.activityPackage.addError(i);
    }

    private void parseResponse(ResponseData responseData, String str) {
        JSONObject jSONObject;
        if (str.length() == 0) {
            this.logger.error("Empty response string", new Object[0]);
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            this.logger.error(errorMessage(e, "Failed to parse JSON response", responseData.activityPackage), new Object[0]);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        responseData.jsonResponse = jSONObject;
        responseData.message = UtilNetworking.extractJsonString(jSONObject, "message");
        responseData.adid = UtilNetworking.extractJsonString(jSONObject, "adid");
        responseData.timestamp = UtilNetworking.extractJsonString(jSONObject, "timestamp");
        String extractJsonString = UtilNetworking.extractJsonString(jSONObject, "tracking_state");
        if (extractJsonString != null && extractJsonString.equals("opted_out")) {
            responseData.trackingState = TrackingState.OPTED_OUT;
        }
        responseData.askIn = UtilNetworking.extractJsonLong(jSONObject, "ask_in");
        responseData.retryIn = UtilNetworking.extractJsonLong(jSONObject, "retry_in");
        responseData.continueIn = UtilNetworking.extractJsonLong(jSONObject, "continue_in");
        responseData.attribution = Util.attributionFromJson(jSONObject.optJSONObject("attribution"), Util.getSdkPrefixPlatform(this.clientSdk));
        responseData.resolvedDeeplink = UtilNetworking.extractJsonString(jSONObject, "resolved_click_url");
        responseData.controlParams = jSONObject.optJSONObject("control_params");
    }

    private void remoteError(Throwable th, String str, ResponseData responseData, Integer num) {
        String str2 = errorMessage(th, str, responseData.activityPackage) + " Will retry later";
        this.logger.error(str2, new Object[0]);
        responseData.message = str2;
        responseData.willRetry = true;
        responseData.activityPackage.addError(num.intValue());
    }

    private boolean shouldRetryToSendWithUrlStrategy(ResponseData responseData) {
        if (responseData.jsonResponse != null) {
            this.logger.debug("Will not retry with current url strategy, already got a valid json response", new Object[0]);
            this.urlStrategy.resetAfterSuccess();
            return false;
        }
        if (this.urlStrategy.shouldRetryAfterFailure(responseData.activityKind)) {
            this.logger.error("Failed with current url strategy, but it will retry with new", new Object[0]);
            return true;
        }
        this.logger.error("Failed with current url strategy and it will not retry", new Object[0]);
        return false;
    }

    private Map<String, String> signParameters(ActivityPackage activityPackage, Map<String, String> map) {
        HashMap hashMap = new HashMap(activityPackage.getParameters());
        if (map != null) {
            hashMap.putAll(map);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("client_sdk", activityPackage.getClientSdk());
        hashMap2.put("activity_kind", activityPackage.getActivityKind().toString());
        hashMap2.put("endpoint", this.urlStrategy.targetUrlByActivityKind(activityPackage.getActivityKind()));
        JSONObject controlParamsJson = SharedPreferencesManager.getDefaultInstance(this.context).getControlParamsJson();
        if (controlParamsJson != null) {
            Iterator<String> keys = controlParamsJson.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (controlParamsJson.get(next) instanceof String) {
                        hashMap2.put(next, (String) controlParamsJson.get(next));
                    }
                } catch (JSONException unused) {
                    this.logger.error("JSONException while iterating control params", new Object[0]);
                }
            }
        }
        return AdjustSigner.sign(hashMap, hashMap2, this.context, this.logger);
    }

    private void tryToGetResponse(ResponseData responseData) {
        DataOutputStream dataOutputStream = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                String extractAuthorizationHeader = extractAuthorizationHeader(responseData.signedParameters);
                                boolean z = true;
                                this.logger.verbose("authorizationHeader: %s", extractAuthorizationHeader);
                                boolean z2 = responseData.activityPackage.getActivityKind() == ActivityKind.ATTRIBUTION;
                                HttpsURLConnection generateHttpsURLConnection = this.httpsURLConnectionProvider.generateHttpsURLConnection(new URL(z2 ? generateUrlStringForGET(responseData.activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters) : generateUrlStringForPOST(responseData.activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.signedParameters)));
                                this.connectionOptions.applyConnectionOptions(generateHttpsURLConnection, this.clientSdk, this.connectionTimeout);
                                if (extractAuthorizationHeader != null) {
                                    generateHttpsURLConnection.setRequestProperty("Authorization", extractAuthorizationHeader);
                                }
                                DataOutputStream configConnectionForGET = z2 ? configConnectionForGET(generateHttpsURLConnection) : configConnectionForPOST(generateHttpsURLConnection, responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters);
                                Integer readConnectionResponse = readConnectionResponse(generateHttpsURLConnection, responseData);
                                responseData.success = responseData.jsonResponse != null && responseData.retryIn == null && readConnectionResponse != null && readConnectionResponse.intValue() == 200;
                                JSONObject jSONObject = responseData.jsonResponse;
                                if (jSONObject != null && responseData.retryIn == null) {
                                    z = false;
                                }
                                responseData.willRetry = z;
                                if (jSONObject == null) {
                                    responseData.activityPackage.addError(1000);
                                } else if (responseData.retryIn != null) {
                                    responseData.activityPackage.addError(1001);
                                }
                                if (configConnectionForGET != null) {
                                    try {
                                        configConnectionForGET.flush();
                                        configConnectionForGET.close();
                                    } catch (IOException e) {
                                        this.logger.error(errorMessage(e, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                                    }
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    try {
                                        dataOutputStream.flush();
                                        dataOutputStream.close();
                                    } catch (IOException e2) {
                                        this.logger.error(errorMessage(e2, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            localError(th2, "Sending SDK package", responseData, ErrorCodes.THROWABLE);
                            if (0 != 0) {
                                try {
                                    dataOutputStream.flush();
                                    dataOutputStream.close();
                                } catch (IOException e3) {
                                    this.logger.error(errorMessage(e3, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                                }
                            }
                        }
                    } catch (ProtocolException e4) {
                        localError(e4, "Protocol Error", responseData, 1004);
                        if (0 != 0) {
                            try {
                                dataOutputStream.flush();
                                dataOutputStream.close();
                            } catch (IOException e5) {
                                this.logger.error(errorMessage(e5, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                            }
                        }
                    }
                } catch (SSLHandshakeException e6) {
                    remoteError(e6, "Certificate failed", responseData, 1006);
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                        } catch (IOException e7) {
                            this.logger.error(errorMessage(e7, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                        }
                    }
                }
            } catch (MalformedURLException e8) {
                localError(e8, "Malformed URL", responseData, 1003);
                if (0 != 0) {
                    try {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (IOException e9) {
                        this.logger.error(errorMessage(e9, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                    }
                }
            } catch (IOException e10) {
                remoteError(e10, "Request failed", responseData, 1007);
                if (0 != 0) {
                    try {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (IOException e11) {
                        this.logger.error(errorMessage(e11, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                    }
                }
            }
        } catch (UnsupportedEncodingException e12) {
            localError(e12, "Failed to encode parameters", responseData, 1002);
            if (0 != 0) {
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (IOException e13) {
                    this.logger.error(errorMessage(e13, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (SocketTimeoutException e14) {
            remoteError(e14, "Request timed out", responseData, Integer.valueOf(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION));
            if (0 != 0) {
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (IOException e15) {
                    this.logger.error(errorMessage(e15, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        }
    }

    private Map<String, String> updateSendingParameters(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        PackageBuilder.addString(map, "sent_at", Util.dateFormatter.format(Long.valueOf(System.currentTimeMillis())));
        return map;
    }

    private String urlWithExtraPathByActivityKind(ActivityKind activityKind, String str) {
        if (activityKind == ActivityKind.GDPR) {
            if (this.gdprPath != null) {
                return str + this.gdprPath;
            }
        } else if (activityKind == ActivityKind.SUBSCRIPTION) {
            if (this.subscriptionPath != null) {
                return str + this.subscriptionPath;
            }
        } else if (activityKind == ActivityKind.PURCHASE_VERIFICATION) {
            if (this.purchaseVerificationPath != null) {
                return str + this.purchaseVerificationPath;
            }
        } else if (this.basePath != null) {
            return str + this.basePath;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0046, code lost:
    
        if (r7 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer readConnectionResponse(HttpsURLConnection httpsURLConnection, ResponseData responseData) {
        StringBuilder sb = new StringBuilder();
        Integer num = null;
        try {
            try {
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                num = Integer.valueOf(responseCode);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(responseCode >= 400 ? httpsURLConnection.getErrorStream() : httpsURLConnection.getInputStream()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
            } catch (IOException e) {
                this.logger.error(errorMessage(e, "Connecting and reading response", responseData.activityPackage), new Object[0]);
            }
            httpsURLConnection.disconnect();
            if (sb.length() == 0) {
                this.logger.error("Empty response string buffer", new Object[0]);
                return num;
            }
            if (num.intValue() == 429) {
                this.logger.error("Too frequent requests to the endpoint (429)", new Object[0]);
                return num;
            }
            String sb2 = sb.toString();
            this.logger.debug("Response string: %s", sb2);
            parseResponse(responseData, sb2);
            if (responseData.controlParams != null) {
                SharedPreferencesManager.getDefaultInstance(this.context).saveControlParams(responseData.controlParams);
            }
            String str = responseData.message;
            if (str != null) {
                if (num.intValue() == 200) {
                    this.logger.info("Response message: %s", str);
                } else {
                    this.logger.error("Response message: %s", str);
                }
            }
            return num;
        } catch (Throwable th) {
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            throw th;
        }
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender
    public void sendActivityPackage(final ActivityPackage activityPackage, final Map<String, String> map, final IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.network.ActivityPackageSender.1
            @Override // java.lang.Runnable
            public final void run() {
                responseDataCallbackSubscriber.onResponseDataCallback(ActivityPackageSender.this.sendActivityPackageSync(activityPackage, map));
            }
        });
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender
    public ResponseData sendActivityPackageSync(ActivityPackage activityPackage, Map<String, String> map) {
        ResponseData buildResponseData;
        do {
            Map<String, String> updateSendingParameters = updateSendingParameters(map);
            buildResponseData = ResponseData.buildResponseData(activityPackage, updateSendingParameters, signParameters(activityPackage, updateSendingParameters));
            tryToGetResponse(buildResponseData);
        } while (shouldRetryToSendWithUrlStrategy(buildResponseData));
        return buildResponseData;
    }
}
