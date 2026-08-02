package com.withpersona.sdk2.inquiry.network.core;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.device.DeviceInfoProvider;
import com.withpersona.sdk2.inquiry.device.DeviceVendorIDProvider;
import com.withpersona.sdk2.inquiry.device.RealDeviceInfoProvider;
import com.withpersona.sdk2.inquiry.device.RealDeviceVendorIDProvider;
import com.withpersona.sdk2.inquiry.logger.Logger;
import com.withpersona.sdk2.inquiry.logger.SubsystemLogger;
import com.withpersona.sdk2.inquiry.logger.SubsystemLogger_Factory_Impl;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.sandbox.SandboxModule$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.UnsignedKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.TrailersSource;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal._UtilJvmKt$$ExternalSyntheticLambda0;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* loaded from: classes9.dex */
public final class NetworkCoreModule {
    public static final Companion Companion = new Companion(null);
    private String certificateFingerprint;
    private String environmentId;
    private final String locale;
    private String organizationId;
    private final String styleVariant;
    private final boolean useServerStyle;

    public static final class NetworkConstants {
        public static final String HEADER_KEY_PERSONA_ENVIRONMENT_ID = "Persona-Organization-Id";
        public static final String HEADER_KEY_PERSONA_ORGANIZATION_ID = "Persona-Environment-Id";
        public static final NetworkConstants INSTANCE = new NetworkConstants();

        private NetworkConstants() {
        }
    }

    public NetworkCoreModule(boolean z, String str, String str2, String str3) {
        this.useServerStyle = z;
        this.environmentId = str;
        this.locale = str2;
        this.styleVariant = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response interceptor$lambda$10(Moshi moshi, Interceptor.Chain chain) {
        Interceptor.Chain chain2;
        String str;
        HttpUrl.Companion companion = TrailersSource.EMPTY;
        try {
            chain2 = chain;
            try {
                return chain2.proceed(chain.request());
            } catch (ConnectException e) {
                e = e;
                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.EMPTY;
                ArrayList arrayList = new ArrayList(20);
                Request request = chain2.request();
                request.getClass();
                Protocol protocol = Protocol.HTTP_2;
                String localizedMessage = e.getLocalizedMessage();
                str = localizedMessage != null ? localizedMessage : "";
                moshi.getClass();
                String json = moshi.adapter(ErrorResponse.class, Util.NO_ANNOTATIONS, null).toJson(ErrorResponse.Companion.create(e.getLocalizedMessage()));
                Regex regex = MediaType.TYPE_SUBTYPE;
                return new Response(request, protocol, str, 0, null, new Headers((String[]) arrayList.toArray(new String[0])), DurationKt.create(json, UnsignedKt.get("application/json")), null, null, null, null, 0L, 0L, null, companion);
            } catch (SocketTimeoutException e2) {
                e = e2;
                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$12 = ResponseBody.EMPTY;
                ArrayList arrayList2 = new ArrayList(20);
                Request request2 = chain2.request();
                request2.getClass();
                Protocol protocol2 = Protocol.HTTP_2;
                String localizedMessage2 = e.getLocalizedMessage();
                str = localizedMessage2 != null ? localizedMessage2 : "";
                moshi.getClass();
                String json2 = moshi.adapter(ErrorResponse.class, Util.NO_ANNOTATIONS, null).toJson(ErrorResponse.Companion.create(e.getLocalizedMessage()));
                Regex regex2 = MediaType.TYPE_SUBTYPE;
                return new Response(request2, protocol2, str, 0, null, new Headers((String[]) arrayList2.toArray(new String[0])), DurationKt.create(json2, UnsignedKt.get("application/json")), null, null, null, null, 0L, 0L, null, companion);
            } catch (UnknownHostException e3) {
                e = e3;
                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$13 = ResponseBody.EMPTY;
                ArrayList arrayList3 = new ArrayList(20);
                Request request3 = chain2.request();
                request3.getClass();
                Protocol protocol3 = Protocol.HTTP_2;
                String localizedMessage3 = e.getLocalizedMessage();
                str = localizedMessage3 != null ? localizedMessage3 : "";
                moshi.getClass();
                String json3 = moshi.adapter(ErrorResponse.class, Util.NO_ANNOTATIONS, null).toJson(ErrorResponse.Companion.create(e.getLocalizedMessage()));
                Regex regex3 = MediaType.TYPE_SUBTYPE;
                return new Response(request3, protocol3, str, 0, null, new Headers((String[]) arrayList3.toArray(new String[0])), DurationKt.create(json3, UnsignedKt.get("application/json")), null, null, null, null, 0L, 0L, null, companion);
            } catch (IOException e4) {
                e = e4;
                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$14 = ResponseBody.EMPTY;
                ArrayList arrayList4 = new ArrayList(20);
                Request request4 = chain2.request();
                request4.getClass();
                Protocol protocol4 = Protocol.HTTP_2;
                String localizedMessage4 = e.getLocalizedMessage();
                str = localizedMessage4 != null ? localizedMessage4 : "";
                moshi.getClass();
                String json4 = moshi.adapter(ErrorResponse.class, Util.NO_ANNOTATIONS, null).toJson(ErrorResponse.Companion.create(e.getLocalizedMessage()));
                Regex regex4 = MediaType.TYPE_SUBTYPE;
                return new Response(request4, protocol4, str, 0, null, new Headers((String[]) arrayList4.toArray(new String[0])), DurationKt.create(json4, UnsignedKt.get("application/json")), null, null, null, null, 0L, 0L, null, companion);
            }
        } catch (ConnectException e5) {
            e = e5;
            chain2 = chain;
        } catch (SocketTimeoutException e6) {
            e = e6;
            chain2 = chain;
        } catch (UnknownHostException e7) {
            e = e7;
            chain2 = chain;
        } catch (IOException e8) {
            e = e8;
            chain2 = chain;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit okhttpClient$lambda$0(NetworkCoreModule networkCoreModule, String str) {
        networkCoreModule.certificateFingerprint = str;
        return Unit.INSTANCE;
    }

    public static final Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
        return Companion.provideMoshiJsonAdapterFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response responseInterceptor$lambda$9(NetworkCoreModule networkCoreModule, Interceptor.Chain chain) {
        Response proceed = chain.proceed(chain.request());
        String str = proceed.headers.get(NetworkConstants.HEADER_KEY_PERSONA_ORGANIZATION_ID);
        if (str != null) {
            networkCoreModule.organizationId = str;
        }
        String str2 = proceed.headers.get(NetworkConstants.HEADER_KEY_PERSONA_ENVIRONMENT_ID);
        if (str2 != null) {
            networkCoreModule.environmentId = str2;
        }
        return proceed;
    }

    public final Interceptor interceptor(Moshi moshi) {
        return new SandboxModule$$ExternalSyntheticLambda0(moshi, 2);
    }

    public final String keyInflection() {
        return "camel";
    }

    public final Moshi moshi(Set<Object> set, Set<JsonAdapterBinding<?>> set2, Set<JsonAdapter.Factory> set3) {
        Moshi.Builder builder = new Moshi.Builder();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            builder.add(it.next());
        }
        Iterator<T> it2 = set2.iterator();
        while (it2.hasNext()) {
            JsonAdapterBinding jsonAdapterBinding = (JsonAdapterBinding) it2.next();
            builder.add(jsonAdapterBinding.getClazz(), jsonAdapterBinding.getJsonAdapter());
        }
        Iterator<T> it3 = set3.iterator();
        while (it3.hasNext()) {
            builder.add((JsonAdapter.Factory) it3.next());
        }
        return new Moshi(builder);
    }

    public final OkHttpClient okhttpClient(Set<Interceptor> set, final Map<String, String> map, final Context context, final DeviceVendorIDProvider deviceVendorIDProvider, final DeviceInfoProvider deviceInfoProvider, final SubsystemLogger.Factory factory) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.eventListenerFactory = new _UtilJvmKt$$ExternalSyntheticLambda0(new b(new HCaptcha$$ExternalSyntheticLambda2(this, 27)));
        builder.networkInterceptors.add(new Interceptor() { // from class: com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                Request.Builder newBuilder = chain.request().newBuilder();
                Headers headers = chain.request().headers;
                headers.getClass();
                StringCompanionObject.INSTANCE.getClass();
                Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                comparator.getClass();
                TreeSet treeSet = new TreeSet(comparator);
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    treeSet.add(headers.name(i));
                }
                Set unmodifiableSet = Collections.unmodifiableSet(treeSet);
                unmodifiableSet.getClass();
                if (!unmodifiableSet.contains("Accept")) {
                    newBuilder.header("Accept", "application/json");
                }
                newBuilder.header("Persona-Version", "2025-11-18");
                ((RealDeviceInfoProvider) DeviceInfoProvider.this).getClass();
                String str6 = Build.MANUFACTURER;
                str6.getClass();
                newBuilder.header("Persona-Device-Manufacturer", str6);
                ((RealDeviceInfoProvider) DeviceInfoProvider.this).getClass();
                String str7 = Build.MODEL;
                str7.getClass();
                newBuilder.header("Persona-Device-Model", str7);
                newBuilder.header("Persona-Device-OS", "Android");
                ((RealDeviceInfoProvider) DeviceInfoProvider.this).getClass();
                String str8 = Build.VERSION.RELEASE;
                str8.getClass();
                newBuilder.header("Persona-Device-OS-Version", str8);
                RealDeviceVendorIDProvider realDeviceVendorIDProvider = (RealDeviceVendorIDProvider) deviceVendorIDProvider;
                String str9 = realDeviceVendorIDProvider.androidId;
                if (StringsKt.isBlank(str9)) {
                    if (realDeviceVendorIDProvider.appSetId.length() == 0) {
                        realDeviceVendorIDProvider.refreshDeviceVendorId();
                    }
                    str9 = realDeviceVendorIDProvider.appSetId;
                }
                newBuilder.header("Persona-Device-Vendor-Id", str9);
                ((RealDeviceInfoProvider) DeviceInfoProvider.this).getClass();
                newBuilder.header("VTDGJLGG", String.valueOf(Debug.isDebuggerConnected() || Debug.waitingForDebugger()));
                str = this.styleVariant;
                if (str == null) {
                    str = (context.getResources().getConfiguration().uiMode & 48) == 32 ? "dark" : "light";
                }
                newBuilder.header("Persona-Style-Variant", str);
                str2 = this.locale;
                if (str2 == null) {
                    str2 = Locale.getDefault().toString();
                }
                newBuilder.header("Persona-Device-Locale", str2);
                newBuilder.header("Persona-App-Bundle", context.getPackageName());
                str3 = this.organizationId;
                if (str3 != null) {
                    newBuilder.header(NetworkCoreModule.NetworkConstants.HEADER_KEY_PERSONA_ORGANIZATION_ID, str3);
                }
                str4 = this.environmentId;
                if (str4 != null) {
                    newBuilder.header(NetworkCoreModule.NetworkConstants.HEADER_KEY_PERSONA_ENVIRONMENT_ID, str4);
                }
                for (Map.Entry entry : map.entrySet()) {
                    newBuilder.header((String) entry.getKey(), (String) entry.getValue());
                }
                str5 = this.certificateFingerprint;
                if (str5 != null) {
                    newBuilder.header("BMRWJMTB", str5);
                }
                return chain.proceed(a.a(a.a, new Request(newBuilder), new SubsystemLogger((Logger) ((SubsystemLogger_Factory_Impl) factory).delegateFactory.loggerProvider.get(), NetworkUtilsKt.SUBSYSTEM), 0L, 2, (Object) null));
            }
        });
        TimeUnit timeUnit = TimeUnit.MINUTES;
        builder.readTimeout(1L, timeUnit);
        builder.writeTimeout = _UtilJvmKt.checkDuration("timeout", 1L, timeUnit);
        builder.connectTimeout = _UtilJvmKt.checkDuration("timeout", 1L, timeUnit);
        for (Interceptor interceptor : set) {
            interceptor.getClass();
            builder.interceptors.add(interceptor);
        }
        return new OkHttpClient(builder);
    }

    public final Interceptor responseInterceptor() {
        return new SandboxModule$$ExternalSyntheticLambda0(this, 1);
    }

    public final Retrofit retrofit(String str, OkHttpClient okHttpClient, Moshi moshi) {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.client(okHttpClient);
        builder.baseUrl(str);
        ((ArrayList) builder.converterFactories).add(MoshiConverterFactory.create(moshi));
        return builder.build();
    }

    public final String useServerStyles() {
        return String.valueOf(this.useServerStyle);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
            return ArraysKt___ArraysKt.toSet(new JsonAdapter.Factory[]{ErrorResponse.Companion.getAdapter(), InternalErrorInfo.Companion.createAdapter()});
        }

        private Companion() {
        }
    }

    public /* synthetic */ NetworkCoreModule(boolean z, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, str2, str3);
    }
}
