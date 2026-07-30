package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.AppLinkManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.ey;
import defpackage.lh;
import defpackage.li0;
import defpackage.tp2;
import defpackage.up2;
import defpackage.w6;
import defpackage.yt;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Utility {
    private static final String ARC_DEVICE_PATTERN = ".+_cheets|cheets_.+";
    public static final int DEFAULT_STREAM_BUFFER_SIZE = 8192;
    private static final String EXTRA_APP_EVENTS_INFO_FORMAT_VERSION = "a2";
    private static final String FACEBOOK_PROFILE_FIELDS = "id,name,first_name,middle_name,last_name";
    private static final String HASH_ALGORITHM_MD5 = "MD5";
    private static final String HASH_ALGORITHM_SHA1 = "SHA-1";
    private static final String HASH_ALGORITHM_SHA256 = "SHA-256";
    private static final String INSTAGRAM_PROFILE_FIELDS = "id,name,profile_picture";
    public static final String LOG_TAG = "FacebookSDK";
    private static final int REFRESH_TIME_FOR_EXTENDED_DEVICE_INFO_MILLIS = 1800000;
    private static final String URL_SCHEME = "https";
    private static final String UTF8 = "UTF-8";
    private static volatile Locale locale;
    private static volatile int numCPUCores;
    public static final Utility INSTANCE = new Utility();
    private static volatile long timestampOfLastCheck = -1;
    private static volatile long totalExternalStorageGB = -1;
    private static volatile long availableExternalStorageGB = -1;
    private static volatile String deviceTimezoneAbbreviation = BuildConfig.FLAVOR;
    private static volatile String deviceTimeZoneName = BuildConfig.FLAVOR;
    private static final String NO_CARRIER = "NoCarrier";
    private static volatile String carrierName = NO_CARRIER;
    private static volatile String versionName = BuildConfig.FLAVOR;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface GraphMeRequestWithCacheCallback {
        void onFailure(FacebookException facebookException);

        void onSuccess(JSONObject jSONObject);
    }

    private Utility() {
    }

    private final void appendAnonIdUnderCompliance(JSONObject jSONObject, AttributionIdentifiers attributionIdentifiers, String str, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !isGooglePlayServicesAvailable(context)) {
            jSONObject.put("anon_id", str);
        } else {
            if (attributionIdentifiers.isTrackingLimited()) {
                return;
            }
            jSONObject.put("anon_id", str);
        }
    }

    private final void appendAttributionIdUnderCompliance(JSONObject jSONObject, AttributionIdentifiers attributionIdentifiers, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !isGooglePlayServicesAvailable(context)) {
            jSONObject.put("attribution", attributionIdentifiers.getAttributionId());
        } else {
            if (attributionIdentifiers.isTrackingLimited()) {
                return;
            }
            jSONObject.put("attribution", attributionIdentifiers.getAttributionId());
        }
    }

    public static final <T> boolean areObjectsEqual(T t, T t2) {
        return t == null ? t2 == null : t.equals(t2);
    }

    public static final JSONObject awaitGetGraphMeRequestWithCache(String str) {
        str.getClass();
        JSONObject profileInformation = ProfileInformationCache.getProfileInformation(str);
        if (profileInformation != null) {
            return profileInformation;
        }
        GraphResponse executeAndWait = INSTANCE.getGraphMeRequestWithCache(str).executeAndWait();
        if (executeAndWait.getError() != null) {
            return null;
        }
        return executeAndWait.getJsonObject();
    }

    public static final Uri buildUri(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        build.getClass();
        return build;
    }

    private final void clearCookiesForDomain(Context context, String str) {
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : (String[]) up2.F(0, 6, cookie, new String[]{";"}).toArray(new String[0])) {
            String[] strArr = (String[]) up2.F(0, 6, str2, new String[]{"="}).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.c(str3.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                sb.append(str3.subSequence(i, length + 1).toString());
                sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb.toString());
            }
        }
        cookieManager.flush();
    }

    public static final void clearFacebookCookies(Context context) {
        context.getClass();
        try {
            Utility utility = INSTANCE;
            utility.clearCookiesForDomain(context, FacebookSdk.FACEBOOK_COM);
            utility.clearCookiesForDomain(context, ".facebook.com");
            utility.clearCookiesForDomain(context, "https://facebook.com");
            utility.clearCookiesForDomain(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final String coerceValueIfNullOrEmpty(String str, String str2) {
        return isNullOrEmpty(str) ? str2 : str;
    }

    private final long convertBytesToGB(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    public static final HashSet<String> convertJSONArrayToHashSet(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet<String> hashSet = new HashSet<>();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            string.getClass();
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final List<String> convertJSONArrayToList(JSONArray jSONArray) {
        jSONArray.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                string.getClass();
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final Map<String, Object> convertJSONObjectToHashMap(JSONObject jSONObject) {
        jSONObject.getClass();
        HashMap hashMap = new HashMap();
        JSONArray names = jSONObject.names();
        if (names != null) {
            int length = names.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = names.getString(i);
                    string.getClass();
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = convertJSONObjectToHashMap((JSONObject) obj);
                    }
                    obj.getClass();
                    hashMap.put(string, obj);
                } catch (JSONException e) {
                    logd(LOG_TAG, "Failed to convert JSONObject to HashMap", e);
                }
            }
        }
        return hashMap;
    }

    public static final Map<String, String> convertJSONObjectToStringMap(JSONObject jSONObject) {
        jSONObject.getClass();
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                next.getClass();
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    public static final int copyAndCloseInputStream(InputStream inputStream, OutputStream outputStream) {
        outputStream.getClass();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byte[] bArr = new byte[DEFAULT_STREAM_BUFFER_SIZE];
            int i = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    Unit unit = Unit.a;
                    bufferedInputStream.close();
                    return i;
                }
                outputStream.write(bArr, 0, read);
                i += read;
            }
        } finally {
        }
    }

    public static final void disconnectQuietly(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    private final boolean externalStorageExists() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static final String generateRandomString(int i) {
        String bigInteger = new BigInteger(i * 5, new SecureRandom()).toString(32);
        bigInteger.getClass();
        return bigInteger;
    }

    public static final String getActivityName(Context context) {
        return context == null ? "null" : context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    public static final String getAppName(Context context) {
        context.getClass();
        try {
            String applicationName = FacebookSdk.getApplicationName();
            if (applicationName != null) {
                return applicationName;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i);
            string.getClass();
            return string;
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public static final String getAppVersion() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final Date getBundleLongAsDate(Bundle bundle, String str, Date date) {
        long parseLong;
        date.getClass();
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                parseLong = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (parseLong == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((parseLong * 1000) + date.getTime());
    }

    public static final long getContentSize(Uri uri) {
        uri.getClass();
        Cursor cursor = null;
        try {
            cursor = FacebookSdk.getApplicationContext().getContentResolver().query(uri, null, null, null, null);
            if (cursor == null) {
                return 0L;
            }
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j = cursor.getLong(columnIndex);
            cursor.close();
            return j;
        } finally {
        }
    }

    public static final Locale getCurrentLocale() {
        Locale resourceLocale = getResourceLocale();
        if (resourceLocale != null) {
            return resourceLocale;
        }
        Locale locale2 = Locale.getDefault();
        locale2.getClass();
        return locale2;
    }

    private final String getCurrentTokenDomainWithDefault() {
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        return (currentAccessToken == null || currentAccessToken.getGraphDomain() == null) ? AccessToken.DEFAULT_GRAPH_DOMAIN : currentAccessToken.getGraphDomain();
    }

    public static final JSONObject getDataProcessingOptions() {
        if (CrashShieldHandler.isObjectCrashing(Utility.class)) {
            return null;
        }
        try {
            String string = FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.DATA_PROCESSING_OPTIONS_PREFERENCES, 0).getString(FacebookSdk.DATA_PROCESSING_OPTIONS, null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException e) {
                    logd(LOG_TAG, "Failed to parse data processing options", e);
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Utility.class);
            return null;
        }
    }

    public static final String getGraphDomainFromTokenDomain(String str) {
        String facebookDomain = FacebookSdk.getFacebookDomain();
        if (str != null) {
            if (str.equals(FacebookSdk.GAMING)) {
                return tp2.m(facebookDomain, FacebookSdk.FACEBOOK_COM, "fb.gg");
            }
            if (str.equals(FacebookSdk.INSTAGRAM)) {
                return tp2.m(facebookDomain, FacebookSdk.FACEBOOK_COM, FacebookSdk.INSTAGRAM_COM);
            }
        }
        return facebookDomain;
    }

    private final GraphRequest getGraphMeRequestWithCache(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(GraphRequest.FIELDS_PARAM, getProfileFieldsForGraphDomain(getCurrentTokenDomainWithDefault()));
        bundle.putString("access_token", str);
        GraphRequest newMeRequest = GraphRequest.Companion.newMeRequest(null, null);
        newMeRequest.setParameters(bundle);
        newMeRequest.setHttpMethod(HttpMethod.GET);
        return newMeRequest;
    }

    public static final void getGraphMeRequestWithCacheAsync(final String str, final GraphMeRequestWithCacheCallback graphMeRequestWithCacheCallback) {
        str.getClass();
        graphMeRequestWithCacheCallback.getClass();
        JSONObject profileInformation = ProfileInformationCache.getProfileInformation(str);
        if (profileInformation != null) {
            graphMeRequestWithCacheCallback.onSuccess(profileInformation);
            return;
        }
        GraphRequest.Callback callback = new GraphRequest.Callback() { // from class: o33
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                Utility.getGraphMeRequestWithCacheAsync$lambda$5(graphMeRequestWithCacheCallback, str, graphResponse);
            }
        };
        GraphRequest graphMeRequestWithCache = INSTANCE.getGraphMeRequestWithCache(str);
        graphMeRequestWithCache.setCallback(callback);
        graphMeRequestWithCache.executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getGraphMeRequestWithCacheAsync$lambda$5(GraphMeRequestWithCacheCallback graphMeRequestWithCacheCallback, String str, GraphResponse graphResponse) {
        graphMeRequestWithCacheCallback.getClass();
        str.getClass();
        graphResponse.getClass();
        if (graphResponse.getError() != null) {
            graphMeRequestWithCacheCallback.onFailure(graphResponse.getError().getException());
            return;
        }
        JSONObject jsonObject = graphResponse.getJsonObject();
        if (jsonObject == null) {
            lh.g("Required value was null.");
        } else {
            ProfileInformationCache.putProfileInformation(str, jsonObject);
            graphMeRequestWithCacheCallback.onSuccess(graphResponse.getJsonObject());
        }
    }

    public static final String getMetadataApplicationId(Context context) {
        Validate.notNull(context, "context");
        return FacebookSdk.getApplicationId();
    }

    public static final Method getMethodQuietly(String str, String str2, Class<?>... clsArr) {
        str.getClass();
        str2.getClass();
        clsArr.getClass();
        try {
            return getMethodQuietly(Class.forName(str), str2, (Class<?>[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final String getProfileFieldsForGraphDomain(String str) {
        return Intrinsics.b(str, FacebookSdk.INSTAGRAM) ? INSTAGRAM_PROFILE_FIELDS : FACEBOOK_PROFILE_FIELDS;
    }

    public static final Locale getResourceLocale() {
        try {
            return FacebookSdk.getApplicationContext().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object getStringPropertyAsJSON(JSONObject jSONObject, String str, String str2) {
        jSONObject.getClass();
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 == null) {
            ey.i("Got an unexpected non-JSON object.");
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, opt);
        return jSONObject2;
    }

    public static final String getUriString(Uri uri) {
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    private final String hashBytes(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        digest.getClass();
        for (byte b : digest) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString(b & 15));
        }
        return sb.toString();
    }

    private final String hashWithAlgorithm(String str, String str2) {
        byte[] bytes = str2.getBytes(yt.b);
        bytes.getClass();
        return hashWithAlgorithm(str, bytes);
    }

    public static final Object invokeMethodQuietly(Object obj, Method method, Object... objArr) {
        method.getClass();
        objArr.getClass();
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean isAutoAppLinkSetup() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1))));
            Context applicationContext = FacebookSdk.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            String packageName = applicationContext.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
            queryIntentActivities.getClass();
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                if (Intrinsics.b(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean isAutofillAvailable(Context context) {
        AutofillManager c;
        context.getClass();
        return Build.VERSION.SDK_INT >= 26 && (c = w6.c(context.getSystemService(w6.e()))) != null && c.isAutofillSupported() && c.isEnabled();
    }

    public static final boolean isChromeOS(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str == null) {
            return false;
        }
        str.getClass();
        return new Regex(ARC_DEVICE_PATTERN).a(str);
    }

    public static final boolean isContentUri(Uri uri) {
        return uri != null && FirebaseAnalytics.Param.CONTENT.equalsIgnoreCase(uri.getScheme());
    }

    public static final boolean isCurrentAccessToken(AccessToken accessToken) {
        return accessToken != null && accessToken.equals(AccessToken.Companion.getCurrentAccessToken());
    }

    public static final boolean isDataProcessingRestricted() {
        if (CrashShieldHandler.isObjectCrashing(Utility.class)) {
            return false;
        }
        try {
            JSONObject dataProcessingOptions = getDataProcessingOptions();
            if (dataProcessingOptions == null) {
                return false;
            }
            try {
                JSONArray jSONArray = dataProcessingOptions.getJSONArray(FacebookSdk.DATA_PROCESSING_OPTIONS);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    string.getClass();
                    String lowerCase = string.toLowerCase();
                    lowerCase.getClass();
                    if (Intrinsics.b(lowerCase, "ldu")) {
                        return true;
                    }
                }
            } catch (Exception e) {
                logd(LOG_TAG, "Failed to check data processing restriction", e);
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Utility.class);
            return false;
        }
    }

    public static final boolean isFileUri(Uri uri) {
        return uri != null && ShareInternalUtility.STAGING_PARAM.equalsIgnoreCase(uri.getScheme());
    }

    private final boolean isGooglePlayServicesAvailable(Context context) {
        Method methodQuietly = getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
        if (methodQuietly == null) {
            return false;
        }
        Object invokeMethodQuietly = invokeMethodQuietly(null, methodQuietly, context);
        return (invokeMethodQuietly instanceof Integer) && invokeMethodQuietly.equals(0);
    }

    public static final boolean isNullOrEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static final boolean isWebUri(Uri uri) {
        if (uri != null) {
            return "http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme());
        }
        return false;
    }

    public static final Set<String> jsonArrayToSet(JSONArray jSONArray) {
        jSONArray.getClass();
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            string.getClass();
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final List<String> jsonArrayToStringList(JSONArray jSONArray) {
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static final Map<String, String> jsonStrToMap(String str) {
        str.getClass();
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                next.getClass();
                String string = jSONObject.getString(next);
                string.getClass();
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final void logd(String str, Exception exc) {
        if (!FacebookSdk.isDebugEnabled() || str == null || exc == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
    }

    public static final String mapToJsonStr(Map<String, String> map) {
        map.getClass();
        boolean isEmpty = map.isEmpty();
        String str = BuildConfig.FLAVOR;
        if (isEmpty) {
            return BuildConfig.FLAVOR;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            str = jSONObject.toString();
        } catch (JSONException unused) {
        }
        str.getClass();
        return str;
    }

    public static final String md5hash(String str) {
        str.getClass();
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_MD5, str);
    }

    public static final boolean mustFixWindowParamsForAutofill(Context context) {
        context.getClass();
        return isAutofillAvailable(context);
    }

    public static final Bundle parseUrlQueryString(String str) {
        Bundle bundle = new Bundle();
        if (!isNullOrEmpty(str)) {
            if (str == null) {
                lh.g("Required value was null.");
                return null;
            }
            for (String str2 : (String[]) up2.F(0, 6, str, new String[]{"&"}).toArray(new String[0])) {
                String[] strArr = (String[]) up2.F(0, 6, str2, new String[]{"="}).toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], UTF8), URLDecoder.decode(strArr[1], UTF8));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], UTF8), BuildConfig.FLAVOR);
                    }
                } catch (UnsupportedEncodingException e) {
                    logd(LOG_TAG, e);
                }
            }
        }
        return bundle;
    }

    public static final void putCommaSeparatedStringList(Bundle bundle, String str, List<String> list) {
        bundle.getClass();
        if (list != null) {
            bundle.putString(str, TextUtils.join(",", list));
        }
    }

    public static final boolean putJSONValueInBundle(Bundle bundle, String str, Object obj) {
        bundle.getClass();
        if (obj == null) {
            bundle.remove(str);
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        }
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof JSONArray) {
            bundle.putString(str, ((JSONArray) obj).toString());
            return true;
        }
        if (!(obj instanceof JSONObject)) {
            return false;
        }
        bundle.putString(str, ((JSONObject) obj).toString());
        return true;
    }

    public static final void putNonEmptyString(Bundle bundle, String str, String str2) {
        bundle.getClass();
        if (isNullOrEmpty(str2)) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static final void putUri(Bundle bundle, String str, Uri uri) {
        bundle.getClass();
        if (uri != null) {
            putNonEmptyString(bundle, str, uri.toString());
        }
    }

    public static final Map<String, String> readNonnullStringMapFromParcel(Parcel parcel) {
        parcel.getClass();
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (readString != null && readString2 != null) {
                hashMap.put(readString, readString2);
            }
        }
        return hashMap;
    }

    public static final String readStreamToString(InputStream inputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(inputStream));
        try {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    String sb2 = sb.toString();
                    inputStreamReader.close();
                    return sb2;
                }
                sb.append(cArr, 0, read);
            }
        } finally {
        }
    }

    public static final Map<String, String> readStringMapFromParcel(Parcel parcel) {
        parcel.getClass();
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    private final void refreshAvailableExternalStorage() {
        try {
            if (externalStorageExists()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                availableExternalStorageGB = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            availableExternalStorageGB = convertBytesToGB(availableExternalStorageGB);
        } catch (Exception unused) {
        }
    }

    private final int refreshBestGuessNumberOfCPUCores() {
        if (numCPUCores > 0) {
            return numCPUCores;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new li0(4));
            if (listFiles != null) {
                numCPUCores = listFiles.length;
            }
        } catch (Exception e) {
            logd(LOG_TAG, "Failed to enumerate CPU cores", e);
        }
        if (numCPUCores <= 0) {
            numCPUCores = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return numCPUCores;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean refreshBestGuessNumberOfCPUCores$lambda$6(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    private final void refreshCarrierName(Context context) {
        if (Intrinsics.b(carrierName, NO_CARRIER)) {
            try {
                Object systemService = context.getSystemService("phone");
                systemService.getClass();
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                networkOperatorName.getClass();
                carrierName = networkOperatorName;
            } catch (Exception e) {
                logd(LOG_TAG, "Failed to refresh carrier name", e);
            }
        }
    }

    private final void refreshPeriodicExtendedDeviceInfo(Context context) {
        if (timestampOfLastCheck == -1 || System.currentTimeMillis() - timestampOfLastCheck >= 1800000) {
            timestampOfLastCheck = System.currentTimeMillis();
            refreshTimezone();
            refreshCarrierName(context);
            refreshTotalExternalStorage();
            refreshAvailableExternalStorage();
        }
    }

    private final void refreshTimezone() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            displayName.getClass();
            deviceTimezoneAbbreviation = displayName;
            String id = timeZone.getID();
            id.getClass();
            deviceTimeZoneName = id;
        } catch (AssertionError unused) {
        } catch (Exception e) {
            logd(LOG_TAG, "Failed to refresh timezone", e);
        }
    }

    private final void refreshTotalExternalStorage() {
        try {
            if (externalStorageExists()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                totalExternalStorageGB = statFs.getBlockCount() * statFs.getBlockSize();
            }
            totalExternalStorageGB = convertBytesToGB(totalExternalStorageGB);
        } catch (Exception unused) {
        }
    }

    public static final void runOnNonUiThread(Runnable runnable) {
        try {
            FacebookSdk.getExecutor().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static final String safeGetStringFromResponse(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return BuildConfig.FLAVOR;
        }
        String optString = jSONObject.optString(str, BuildConfig.FLAVOR);
        optString.getClass();
        return optString;
    }

    public static final void setAppEventAttributionParameters(JSONObject jSONObject, AttributionIdentifiers attributionIdentifiers, String str, boolean z, Context context) {
        jSONObject.getClass();
        context.getClass();
        FeatureManager.Feature feature = FeatureManager.Feature.ServiceUpdateCompliance;
        if (!FeatureManager.isEnabled(feature)) {
            jSONObject.put("anon_id", str);
        }
        jSONObject.put("application_tracking_enabled", !z);
        jSONObject.put("advertiser_id_collection_enabled", FacebookSdk.getAdvertiserIDCollectionEnabled());
        Boolean addToMessagingCustomerBaseForWhatsApp = FacebookSdk.getAddToMessagingCustomerBaseForWhatsApp();
        if (addToMessagingCustomerBaseForWhatsApp != null) {
            jSONObject.put("add_to_messaging_customer_base_for_whatsapp", addToMessagingCustomerBaseForWhatsApp.booleanValue() ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
        if (attributionIdentifiers != null) {
            if (FeatureManager.isEnabled(feature)) {
                INSTANCE.appendAnonIdUnderCompliance(jSONObject, attributionIdentifiers, str, context);
            }
            if (attributionIdentifiers.getAttributionId() != null) {
                if (FeatureManager.isEnabled(feature)) {
                    INSTANCE.appendAttributionIdUnderCompliance(jSONObject, attributionIdentifiers, context);
                } else {
                    jSONObject.put("attribution", attributionIdentifiers.getAttributionId());
                }
            }
            if (attributionIdentifiers.getAndroidAdvertiserId() != null) {
                jSONObject.put("advertiser_id", attributionIdentifiers.getAndroidAdvertiserId());
                jSONObject.put("advertiser_tracking_enabled", !attributionIdentifiers.isTrackingLimited());
            }
            if (!attributionIdentifiers.isTrackingLimited()) {
                String allHashedUserData = UserDataStore.getAllHashedUserData();
                if (allHashedUserData.length() != 0) {
                    jSONObject.put("ud", allHashedUserData);
                }
            }
            if (attributionIdentifiers.getAndroidInstallerPackage() != null) {
                jSONObject.put("installer_package", attributionIdentifiers.getAndroidInstallerPackage());
            }
        }
        AppLinkManager.Companion companion = AppLinkManager.Companion;
        AppLinkManager companion2 = companion.getInstance();
        Object info = companion2 != null ? companion2.getInfo(AppLinkManager.CAMPAIGN_IDS_KEY) : null;
        if (info != null) {
            jSONObject.put(AppLinkManager.CAMPAIGN_IDS_KEY, info);
        }
        AppLinkManager companion3 = companion.getInstance();
        Object info2 = companion3 != null ? companion3.getInfo(AppLinkManager.CLICK_ID_KEY) : null;
        if (info2 != null) {
            jSONObject.put(AppLinkManager.CLICK_ID_KEY, info2);
        }
    }

    public static final void setAppEventExtendedDeviceInfoParameters(JSONObject jSONObject, Context context) {
        Locale locale2;
        int i;
        Display display;
        PackageInfo packageInfo;
        jSONObject.getClass();
        context.getClass();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(EXTRA_APP_EVENTS_INFO_FORMAT_VERSION);
        INSTANCE.refreshPeriodicExtendedDeviceInfo(context);
        String packageName = context.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo == null) {
            return;
        }
        i3 = packageInfo.versionCode;
        versionName = packageInfo.versionName;
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(versionName);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale2 = context.getResources().getConfiguration().getLocales().get(0);
        } catch (Exception unused2) {
            locale2 = Locale.getDefault();
        }
        locale = locale2;
        StringBuilder sb = new StringBuilder();
        Locale locale3 = locale;
        String language = locale3 != null ? locale3.getLanguage() : null;
        String str = BuildConfig.FLAVOR;
        if (language == null) {
            language = BuildConfig.FLAVOR;
        }
        sb.append(language);
        sb.append('_');
        Locale locale4 = locale;
        String country = locale4 != null ? locale4.getCountry() : null;
        if (country != null) {
            str = country;
        }
        sb.append(str);
        jSONArray.put(sb.toString());
        jSONArray.put(deviceTimezoneAbbreviation);
        jSONArray.put(carrierName);
        double d = 0.0d;
        try {
            Object systemService = context.getSystemService("display");
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            display = displayManager != null ? displayManager.getDisplay(0) : null;
        } catch (Exception unused3) {
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i4 = displayMetrics.widthPixels;
            try {
                i2 = displayMetrics.heightPixels;
                d = displayMetrics.density;
            } catch (Exception unused4) {
            }
            i = i2;
            i2 = i4;
            jSONArray.put(i2);
            jSONArray.put(i);
            jSONArray.put(new DecimalFormat("#.##").format(d));
            jSONArray.put(INSTANCE.refreshBestGuessNumberOfCPUCores());
            jSONArray.put(totalExternalStorageGB);
            jSONArray.put(availableExternalStorageGB);
            jSONArray.put(deviceTimeZoneName);
            jSONObject.put(Constants.EXTINFO, jSONArray.toString());
        }
        i = 0;
        jSONArray.put(i2);
        jSONArray.put(i);
        jSONArray.put(new DecimalFormat("#.##").format(d));
        jSONArray.put(INSTANCE.refreshBestGuessNumberOfCPUCores());
        jSONArray.put(totalExternalStorageGB);
        jSONArray.put(availableExternalStorageGB);
        jSONArray.put(deviceTimeZoneName);
        jSONObject.put(Constants.EXTINFO, jSONArray.toString());
    }

    public static final String sha1hash(String str) {
        str.getClass();
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_SHA1, str);
    }

    public static final String sha256hash(String str) {
        if (str == null) {
            return null;
        }
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_SHA256, str);
    }

    public static final boolean stringsEqualOrEmpty(String str, String str2) {
        boolean z = str == null || str.length() == 0;
        boolean z2 = str2 == null || str2.length() == 0;
        if (z && z2) {
            return true;
        }
        if (z || z2) {
            return false;
        }
        return Intrinsics.b(str, str2);
    }

    public static final JSONArray tryGetJSONArrayFromResponse(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    public static final JSONObject tryGetJSONObjectFromResponse(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    public static final void writeNonnullStringMapToParcel(Parcel parcel, Map<String, String> map) {
        parcel.getClass();
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    public static final void writeStringMapToParcel(Parcel parcel, Map<String, String> map) {
        parcel.getClass();
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    public final long getAvailableExternalStorageGB() {
        return availableExternalStorageGB;
    }

    public final String getCarrierName() {
        return carrierName;
    }

    public final String getDeviceTimeZoneName() {
        return deviceTimeZoneName;
    }

    public final Locale getLocale() {
        return locale;
    }

    public final String getVersionName() {
        return versionName;
    }

    public final void setAvailableExternalStorageGB(long j) {
        availableExternalStorageGB = j;
    }

    public final void setCarrierName(String str) {
        str.getClass();
        carrierName = str;
    }

    public final void setDeviceTimeZoneName(String str) {
        str.getClass();
        deviceTimeZoneName = str;
    }

    public final void setLocale(Locale locale2) {
        locale = locale2;
    }

    public final void setVersionName(String str) {
        versionName = str;
    }

    public static final String sha1hash(byte[] bArr) {
        bArr.getClass();
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_SHA1, bArr);
    }

    public static final boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static final String sha256hash(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_SHA256, bArr);
    }

    private final String hashWithAlgorithm(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.getClass();
            return hashBytes(messageDigest, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Method getMethodQuietly(Class<?> cls, String str, Class<?>... clsArr) {
        cls.getClass();
        str.getClass();
        clsArr.getClass();
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static /* synthetic */ void isAutoAppLinkSetup$annotations() {
    }

    public static final void logd(String str, String str2) {
        if (!FacebookSdk.isDebugEnabled() || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    public static final void logd(String str, String str2, Throwable th) {
        if (!FacebookSdk.isDebugEnabled() || isNullOrEmpty(str)) {
            return;
        }
        Log.d(str, str2, th);
    }
}
