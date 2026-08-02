package com.stripe.android.stripe3ds2.observability;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.stripe.android.stripe3ds2.transaction.Logger;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class DefaultErrorReporter implements Serializable {
    public final Config config;
    public final Context context;
    public final String environment;
    public final String localeCountry;
    public final Logger logger;
    public final int osVersion;
    public final DefaultSentryConfig sentryConfig;
    public final CoroutineContext workContext;

    public interface Config {
        Map getCustomTags();
    }

    public final class EmptyConfig implements Config {
        public static final EmptyConfig INSTANCE = new EmptyConfig();
        public static final EmptyMap customTags;

        static {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            customTags = emptyMap;
        }

        @Override // com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.Config
        public final Map getCustomTags() {
            return customTags;
        }
    }

    static {
        StandardCharsets.UTF_8.name();
    }

    public DefaultErrorReporter(Context context, Stripe3ds2ErrorReporterConfig stripe3ds2ErrorReporterConfig, CoroutineContext coroutineContext, Logger logger, int i) {
        Config config = (i & 2) != 0 ? EmptyConfig.INSTANCE : stripe3ds2ErrorReporterConfig;
        if ((i & 4) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            coroutineContext = DefaultIoScheduler.INSTANCE;
        }
        logger = (i & 8) != 0 ? Logger.Noop.INSTANCE : logger;
        String country = Locale.getDefault().getCountry();
        country.getClass();
        int i2 = Build.VERSION.SDK_INT;
        context.getClass();
        coroutineContext.getClass();
        this.context = context;
        this.config = config;
        this.workContext = coroutineContext;
        this.logger = logger;
        this.sentryConfig = DefaultSentryConfig.INSTANCE;
        this.environment = "release";
        this.localeCountry = country;
        this.osVersion = i2;
    }

    public static final void access$send(DefaultErrorReporter defaultErrorReporter, JSONObject jSONObject) {
        defaultErrorReporter.sentryConfig.getClass();
        URLConnection openConnection = new URL("https://errors.stripe.com/api/426/store/").openConnection();
        openConnection.getClass();
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setDoOutput(true);
        Pair pair = new Pair("Content-Type", "application/json; charset=utf-8");
        Pair pair2 = new Pair("User-Agent", "Android3ds2Sdk 23.9.1");
        Pair pair3 = new Pair("sentry_key", "dcb428fea25c40e7b99f81ae5981ee6a");
        Pair pair4 = new Pair("sentry_version", "7");
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis / 1000;
        for (Map.Entry entry : MapsKt__MapsKt.mapOf(pair, pair2, new Pair("X-Sentry-Auth", CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Sentry", CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{pair3, pair4, new Pair("sentry_timestamp", j + "." + (currentTimeMillis - TimeUnit.SECONDS.toMillis(j))), new Pair("sentry_client", "Android3ds2Sdk 23.9.1")}), ", ", null, null, 0, null, new StripeApiRepository$$ExternalSyntheticLambda5(24), 30)}), " ", null, null, 0, null, null, 62))).entrySet()) {
            httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        OutputStream outputStream = httpsURLConnection.getOutputStream();
        try {
            outputStream.getClass();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
            try {
                outputStreamWriter.write(jSONObject.toString());
                outputStreamWriter.flush();
                outputStreamWriter.close();
                outputStream.close();
                httpsURLConnection.connect();
                httpsURLConnection.getResponseCode();
                httpsURLConnection.disconnect();
            } finally {
            }
        } finally {
        }
    }

    public final JSONObject createRequestBody$3ds2sdk_release(Throwable th) {
        List<StackTraceElement> mutableList;
        Object failure;
        ApplicationInfo applicationInfo;
        JSONObject put = new JSONObject().put("release", "com.stripe.android.stripe3ds2@23.9.1");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject put2 = new JSONObject().put("type", th.getClass().getCanonicalName());
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        JSONObject put3 = put2.put("value", message);
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray2 = new JSONArray();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        if (stackTrace.length == 0) {
            mutableList = EmptyList.INSTANCE;
        } else {
            mutableList = ArraysKt___ArraysKt.toMutableList(stackTrace);
            Collections.reverse(mutableList);
        }
        for (StackTraceElement stackTraceElement : mutableList) {
            jSONArray2.put(new JSONObject().put("lineno", stackTraceElement.getLineNumber()).put("filename", stackTraceElement.getClassName()).put("function", stackTraceElement.getMethodName()));
        }
        JSONObject put4 = jSONObject2.put("frames", jSONArray2);
        put4.getClass();
        JSONObject put5 = put.put("exception", jSONObject.put("values", jSONArray.put(put3.put("stacktrace", put4))));
        JSONObject put6 = new JSONObject().put("locale", this.localeCountry).put("environment", this.environment).put("android_os_version", this.osVersion);
        for (Map.Entry entry : this.config.getCustomTags().entrySet()) {
            put6.put((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject put7 = put5.put("tags", put6);
        Context context = this.context;
        try {
            Result.Companion companion = Result.Companion;
            failure = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th2);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        PackageInfo packageInfo = (PackageInfo) failure;
        CharSequence loadLabel = (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? null : applicationInfo.loadLabel(context.getPackageManager());
        JSONObject jSONObject3 = new JSONObject();
        JSONObject put8 = new JSONObject().put("app_identifier", context.getPackageName()).put("app_name", loadLabel);
        String str = packageInfo != null ? packageInfo.versionName : null;
        JSONObject put9 = jSONObject3.put("app", put8.put("app_version", str != null ? str : ""));
        JSONObject put10 = new JSONObject().put("name", "Android").put("version", Build.VERSION.RELEASE);
        String str2 = Build.TYPE;
        JSONObject put11 = put9.put("os", put10.put("type", str2).put("build", Build.DISPLAY));
        JSONObject put12 = new JSONObject().put("model_id", Build.ID).put("model", Build.MODEL).put("manufacturer", Build.MANUFACTURER).put("type", str2);
        JSONArray jSONArray3 = new JSONArray();
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        for (String str3 : strArr) {
            jSONArray3.put(str3);
        }
        JSONObject put13 = put11.put("device", put12.put("archs", jSONArray3));
        put13.getClass();
        JSONObject put14 = put7.put("contexts", put13);
        put14.getClass();
        return put14;
    }

    public final void reportError(Throwable th) {
        JobKt.launch$default(JobKt.CoroutineScope(this.workContext), null, null, new Logger$_log$2(this, th, (Continuation) null, 22), 3);
    }
}
