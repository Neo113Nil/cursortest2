package retrofit2;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.e2ee.trifle.RealTrifleLogger$logAction$1;
import com.squareup.cash.eligibility.backend.api.EligibilityRefresher;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.keystore.AttestedKeyMetrics$ActionType;
import com.squareup.cash.keystore.AttestedKeyMetrics$ErrorType;
import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.keystore.RealAttestedKeyService;
import com.squareup.cash.notification.photo.NotificationPhotoLookupKeyRegistry;
import com.squareup.cash.notification.photo.NotificationPhotoResolver$resolve$1;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.GenericDatadogError;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.internal.GrpcKt$readFromResponseBodyCallback$1$onResponse$1;
import com.squareup.wire.internal.RealGrpcStreamingCall;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.BaseDoubleCheckKt;
import dev.zacsweers.metro.internal.SetFactory;
import io.noties.markwon.MarkwonImpl;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.TrailersSource;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.RealBufferedSource;
import okio.Timeout;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.AppStart$AppStartData;
import papa.AppUpdateData;
import papa.AppUpdateStartStatus;
import papa.Handlers;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.Handlers$$ExternalSyntheticLambda1;
import papa.InteractionTrigger;
import papa.SafeTrace;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda1;
import retrofit2.DefaultCallAdapterFactory;
import retrofit2.RequestBuilder;

/* loaded from: classes3.dex */
public final class OkHttpCall implements Call {
    public final Object[] args;
    public final Call.Factory callFactory;
    public volatile boolean canceled;
    public Throwable creationFailure;
    public boolean executed;
    public final Object instance;
    public okhttp3.Call rawCall;
    public final RequestFactory requestFactory;
    public final Converter responseConverter;

    public final class ExceptionCatchingResponseBody extends ResponseBody {
        public final ResponseBody delegate;
        public final RealBufferedSource delegateSource;
        public IOException thrownException;

        public ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.delegate = responseBody;
            this.delegateSource = new RealBufferedSource(new ForwardingSource(responseBody.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // okio.ForwardingSource, okio.Source
                public final long read(Buffer buffer, long j) {
                    try {
                        return super.read(buffer, j);
                    } catch (IOException e) {
                        ExceptionCatchingResponseBody.this.thrownException = e;
                        throw e;
                    }
                }
            });
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.delegate.close();
        }

        @Override // okhttp3.ResponseBody
        public final long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public final MediaType contentType() {
            return this.delegate.contentType();
        }

        @Override // okhttp3.ResponseBody
        public final BufferedSource source() {
            return this.delegateSource;
        }
    }

    public final class NoContentResponseBody extends ResponseBody {
        public final long contentLength;
        public final MediaType contentType;

        public NoContentResponseBody(MediaType mediaType, long j) {
            this.contentType = mediaType;
            this.contentLength = j;
        }

        @Override // okhttp3.ResponseBody
        public final long contentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        public final MediaType contentType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        public final BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(RequestFactory requestFactory, Object obj, Object[] objArr, Call.Factory factory, Converter converter) {
        this.requestFactory = requestFactory;
        this.instance = obj;
        this.args = objArr;
        this.callFactory = factory;
        this.responseConverter = converter;
    }

    @Override // retrofit2.Call
    public final void cancel() {
        okhttp3.Call call;
        this.canceled = true;
        synchronized (this) {
            call = this.rawCall;
        }
        if (call != null) {
            ((RealCall) call).cancel();
        }
    }

    public final Object clone() {
        return new OkHttpCall(this.requestFactory, this.instance, this.args, this.callFactory, this.responseConverter);
    }

    public final okhttp3.Call createRawCall() {
        HttpUrl resolve;
        RequestFactory requestFactory = this.requestFactory;
        Utils[] utilsArr = (Utils[]) requestFactory.parameterHandlers;
        Object[] objArr = this.args;
        int length = objArr.length;
        if (length != utilsArr.length) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(utilsArr.length, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(length, "Argument count (", ") doesn't match expected count (")));
            return null;
        }
        RequestBuilder requestBuilder = new RequestBuilder((String) requestFactory.httpMethod, (HttpUrl) requestFactory.baseUrl, (String) requestFactory.relativeUrl, (Headers) requestFactory.headers, (MediaType) requestFactory.contentType, requestFactory.hasBody, requestFactory.isFormEncoded, requestFactory.isMultipart);
        if (requestFactory.isKotlinSuspendFunction) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            utilsArr[i].apply(requestBuilder, objArr[i]);
        }
        HttpUrl.Builder builder = requestBuilder.urlBuilder;
        if (builder != null) {
            resolve = builder.build();
        } else {
            String str = requestBuilder.relativeUrl;
            HttpUrl httpUrl = requestBuilder.baseUrl;
            resolve = httpUrl.resolve(str);
            if (resolve == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(httpUrl);
                Handlers$$ExternalSyntheticBUOutline0.m(sb, ", Relative: ", requestBuilder.relativeUrl);
                return null;
            }
        }
        RequestBody requestBody = requestBuilder.body;
        if (requestBody == null) {
            FormBody.Builder builder2 = requestBuilder.formBuilder;
            if (builder2 != null) {
                requestBody = builder2.build();
            } else {
                MarkwonImpl markwonImpl = requestBuilder.multipartBuilder;
                if (markwonImpl != null) {
                    requestBody = markwonImpl.build();
                } else if (requestBuilder.hasBody) {
                    requestBody = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = requestBuilder.contentType;
        Headers.Builder builder3 = requestBuilder.headersBuilder;
        if (mediaType != null) {
            if (requestBody != null) {
                requestBody = new RequestBuilder.ContentTypeOverridingRequestBody(requestBody, mediaType);
            } else {
                builder3.add("Content-Type", mediaType.mediaType);
            }
        }
        Request.Builder builder4 = requestBuilder.requestBuilder;
        builder4.getClass();
        builder4.url = resolve;
        builder4.headers = builder3.build().newBuilder();
        builder4.method(requestBuilder.method, requestBody);
        builder4.tag(Invocation.class, new Invocation((Class) requestFactory.service, this.instance, (Method) requestFactory.method, arrayList));
        okhttp3.Call newCall = this.callFactory.newCall(new Request(builder4));
        if (newCall != null) {
            return newCall;
        }
        a$$ExternalSyntheticBUOutline0.m$2("Call.Factory returned null.");
        return null;
    }

    @Override // retrofit2.Call
    public final void enqueue(Callback callback) {
        okhttp3.Call call;
        Throwable th;
        synchronized (this) {
            try {
                if (this.executed) {
                    throw new IllegalStateException("Already executed.");
                }
                this.executed = true;
                call = this.rawCall;
                th = this.creationFailure;
                if (call == null && th == null) {
                    try {
                        okhttp3.Call createRawCall = createRawCall();
                        this.rawCall = createRawCall;
                        call = createRawCall;
                    } catch (Throwable th2) {
                        th = th2;
                        Utils.throwIfFatal(th);
                        this.creationFailure = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            ((RealCall) call).cancel();
        }
        ((RealCall) call).enqueue(new AnonymousClass1(this, callback));
    }

    @Override // retrofit2.Call
    public final Response execute() {
        okhttp3.Call rawCall;
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            rawCall = getRawCall();
        }
        if (this.canceled) {
            ((RealCall) rawCall).cancel();
        }
        return parseResponse(((RealCall) rawCall).execute());
    }

    public final okhttp3.Call getRawCall() {
        okhttp3.Call call = this.rawCall;
        if (call != null) {
            return call;
        }
        Throwable th = this.creationFailure;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            okhttp3.Call createRawCall = createRawCall();
            this.rawCall = createRawCall;
            return createRawCall;
        } catch (IOException | Error | RuntimeException e) {
            Utils.throwIfFatal(e);
            this.creationFailure = e;
            throw e;
        }
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        boolean z = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            okhttp3.Call call = this.rawCall;
            if (call == null || !((RealCall) call).canceled) {
                z = false;
            }
        }
        return z;
    }

    @Override // retrofit2.Call
    public final synchronized boolean isExecuted() {
        return this.executed;
    }

    public final Response parseResponse(okhttp3.Response response) {
        ResponseBody responseBody = response.body;
        Response.Builder newBuilder = response.newBuilder();
        newBuilder.body = new NoContentResponseBody(responseBody.contentType(), responseBody.contentLength());
        okhttp3.Response build = newBuilder.build();
        int i = build.code;
        if (i < 200 || i >= 300) {
            try {
                Buffer buffer = new Buffer();
                responseBody.source().readAll(buffer);
                MediaType contentType = responseBody.contentType();
                long contentLength = responseBody.contentLength();
                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.EMPTY;
                return Response.error(new ResponseBody$Companion$asResponseBody$1(contentType, contentLength, buffer), build);
            } finally {
                responseBody.close();
            }
        }
        if (i == 204 || i == 205) {
            responseBody.close();
            return Response.success(null, build);
        }
        ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(responseBody);
        try {
            return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), build);
        } catch (RuntimeException e) {
            IOException iOException = exceptionCatchingResponseBody.thrownException;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // retrofit2.Call
    public final synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return ((RealCall) getRawCall()).originalRequest;
    }

    @Override // retrofit2.Call
    public final synchronized Timeout timeout() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create call.", e);
        }
        return ((RealCall) getRawCall()).timeout;
    }

    @Override // retrofit2.Call
    /* renamed from: clone */
    public final Call m2176clone() {
        return new OkHttpCall(this.requestFactory, this.instance, this.args, this.callFactory, this.responseConverter);
    }

    /* renamed from: retrofit2.OkHttpCall$1, reason: invalid class name */
    public final class AnonymousClass1 implements EligibilityRefresher, okhttp3.Callback, TrailersSource, ReadOnlyProperty, CallAdapter {
        public final /* synthetic */ int $r8$classId;
        public Object this$0;
        public final Object val$callback;

        public AnonymousClass1(SharedPreferences sharedPreferences, CoroutineContext coroutineContext, Context context, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
            this.$r8$classId = 11;
            sharedPreferences.getClass();
            coroutineContext.getClass();
            context.getClass();
            supportSQLiteOpenHelper.getClass();
            this.val$callback = sharedPreferences;
            this.this$0 = coroutineContext;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x015a  */
        /* JADX WARN: Type inference failed for: r4v1, types: [papa.internal.AppUpdateDetector$$ExternalSyntheticLambda1] */
        /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Long] */
        /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Long] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final AppUpdateDetector$$ExternalSyntheticLambda1 access$readAndUpdate(AnonymousClass1 anonymousClass1) {
            PackageInfo packageInfo;
            Object valueOf;
            String str;
            AppUpdateStartStatus appUpdateStartStatus;
            Boolean bool;
            Boolean bool2;
            long j;
            Boolean bool3;
            AppUpdateStartStatus appUpdateStartStatus2;
            Boolean bool4;
            String str2;
            Boolean bool5;
            final List split$default;
            List split$default2;
            Boolean bool6;
            Boolean bool7;
            AppUpdateStartStatus appUpdateStartStatus3;
            Boolean bool8;
            Application application = (Application) anonymousClass1.val$callback;
            PackageInfo packageInfo2 = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            packageInfo2.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long currentTimeMillis = System.currentTimeMillis();
            String str3 = packageInfo2.versionName;
            if (str3 == null) {
                str3 = "null";
            }
            long longVersionCode = packageInfo2.getLongVersionCode();
            String valueOf2 = String.valueOf(longVersionCode);
            Boolean bool9 = null;
            if (anonymousClass1.getPreferences().contains("app_version_name")) {
                if (anonymousClass1.getPreferences().contains("app_long_version_code")) {
                    packageInfo = packageInfo2;
                    valueOf = Long.valueOf(anonymousClass1.getPreferences().getLong("app_long_version_code", -1L));
                } else {
                    packageInfo = packageInfo2;
                    valueOf = Integer.valueOf(anonymousClass1.getPreferences().getInt("app_version_code", -1));
                }
                String string2 = anonymousClass1.getPreferences().getString("app_all_version_names", str3);
                string2.getClass();
                String string3 = anonymousClass1.getPreferences().getString("app_all_version_codes", valueOf2);
                string3.getClass();
                str = "app_all_version_codes";
                if (valueOf.equals(Long.valueOf(longVersionCode))) {
                    appUpdateStartStatus = AppUpdateStartStatus.NORMAL_START;
                    valueOf2 = string3;
                } else {
                    appUpdateStartStatus = AppUpdateStartStatus.FIRST_START_AFTER_UPGRADE;
                    string2 = Recorder$$ExternalSyntheticOutline2.m(str3, ", ", string2);
                    valueOf2 = Recorder$$ExternalSyntheticOutline2.m(valueOf2, ", ", string3);
                }
                AppUpdateStartStatus appUpdateStartStatus4 = appUpdateStartStatus;
                String string4 = anonymousClass1.getPreferences().getString("build_fingerprint", "UNKNOWN_BUILD_FINGERPRINT");
                string4.getClass();
                Boolean valueOf3 = string4.equals("UNKNOWN_BUILD_FINGERPRINT") ? null : Boolean.valueOf(!string4.equals(Build.FINGERPRINT));
                String str4 = string2;
                long j2 = anonymousClass1.getPreferences().getLong("elapsed_realtime", -1L);
                if (j2 != -1) {
                    long j3 = elapsedRealtime - j2;
                    if (j3 <= 0) {
                        bool5 = Boolean.TRUE;
                    } else {
                        long j4 = currentTimeMillis - anonymousClass1.getPreferences().getLong("current_time", currentTimeMillis);
                        if (j4 > 0) {
                            long j5 = j4 - j3;
                            if (Math.abs(j5) < 30000) {
                                bool5 = Boolean.FALSE;
                            } else if (j5 > 0) {
                                bool5 = Boolean.TRUE;
                            }
                        }
                    }
                    bool = bool5;
                    bool2 = bool;
                    j = anonymousClass1.getPreferences().getLong("crash_realtime", -2L);
                    ?? valueOf4 = Long.valueOf(j);
                    if (j != -2) {
                        bool9 = Boolean.valueOf(j != -1);
                    }
                    bool3 = bool9;
                    appUpdateStartStatus2 = appUpdateStartStatus4;
                    bool9 = valueOf4;
                    bool4 = valueOf3;
                    str2 = str4;
                }
                bool = null;
                bool2 = bool;
                j = anonymousClass1.getPreferences().getLong("crash_realtime", -2L);
                ?? valueOf42 = Long.valueOf(j);
                if (j != -2) {
                }
                bool3 = bool9;
                appUpdateStartStatus2 = appUpdateStartStatus4;
                bool9 = valueOf42;
                bool4 = valueOf3;
                str2 = str4;
            } else {
                if (packageInfo2.firstInstallTime != packageInfo2.lastUpdateTime) {
                    appUpdateStartStatus3 = AppUpdateStartStatus.FIRST_START_AFTER_CLEAR_DATA;
                    bool8 = null;
                    bool6 = null;
                    bool7 = null;
                } else {
                    bool6 = Boolean.FALSE;
                    bool7 = bool6;
                    appUpdateStartStatus3 = AppUpdateStartStatus.FIRST_START_AFTER_FRESH_INSTALL;
                    bool8 = bool7;
                }
                bool2 = bool8;
                appUpdateStartStatus2 = appUpdateStartStatus3;
                bool4 = bool6;
                packageInfo = packageInfo2;
                bool3 = bool7;
                str = "app_all_version_codes";
                str2 = str3;
            }
            final Boolean bool10 = bool4;
            final AppUpdateStartStatus appUpdateStartStatus5 = appUpdateStartStatus2;
            anonymousClass1.getPreferences().edit().putLong("app_long_version_code", longVersionCode).putString("app_version_name", str3).putString("app_all_version_names", str2).putString(str, valueOf2).putLong("elapsed_realtime", elapsedRealtime).putLong("current_time", currentTimeMillis).putLong("crash_realtime", -1L).putString("build_fingerprint", Build.FINGERPRINT).apply();
            split$default = StringsKt__StringsKt.split$default(str2, new String[]{", "}, false, 0, 6, null);
            split$default2 = StringsKt__StringsKt.split$default(valueOf2, new String[]{", "}, false, 0, 6, null);
            List list = split$default2;
            final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            final Boolean bool11 = bool3;
            final PackageInfo packageInfo3 = packageInfo;
            final ?? r7 = bool9;
            final Boolean bool12 = bool2;
            return new Function1() { // from class: papa.internal.AppUpdateDetector$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Long l;
                    AppStart$AppStartData appStart$AppStartData = (AppStart$AppStartData) obj;
                    appStart$AppStartData.getClass();
                    Boolean bool13 = Boolean.TRUE;
                    Boolean bool14 = bool11;
                    boolean areEqual = Intrinsics.areEqual(bool14, bool13);
                    Boolean bool15 = bool12;
                    if (areEqual && Intrinsics.areEqual(bool15, Boolean.FALSE)) {
                        long j6 = appStart$AppStartData.processStartRealtimeMillis;
                        Long l2 = r7;
                        l2.getClass();
                        l = Long.valueOf(j6 - l2.longValue());
                    } else {
                        l = null;
                    }
                    Long l3 = l;
                    PackageInfo packageInfo4 = packageInfo3;
                    return AppStart$AppStartData.copy$default(appStart$AppStartData, null, new AppUpdateData.RealAppUpdateData(appUpdateStartStatus5, packageInfo4.firstInstallTime, packageInfo4.lastUpdateTime, split$default, arrayList, bool10, bool15, bool14, l3), null, null, null, null, null, null, null, null, null, null, null, null, -131073);
                }
            };
        }

        public static Map getMetadataForAttempt(AttestedKeyService attestedKeyService, RealAttestedKeyService.GenerationAttempt generationAttempt) {
            Pair pair = new Pair("keyAlgorithm", generationAttempt.f1168type.name());
            Pair pair2 = new Pair("withStrongBox", Boolean.valueOf(generationAttempt.withStrongBox));
            Pair pair3 = new Pair("withDeviceProperties", Boolean.valueOf(generationAttempt.withDeviceProperties));
            Pair pair4 = new Pair("keySize", Integer.valueOf(generationAttempt.keySize));
            Pair pair5 = new Pair("timeoutInMillis", String.valueOf(Duration.m4167getInWholeMillisecondsimpl(generationAttempt.timeout)));
            Pair pair6 = new Pair("fromFF", Boolean.valueOf(generationAttempt.fromFF));
            Pair pair7 = new Pair("attempt", generationAttempt.identifier);
            Pair pair8 = new Pair("keyAlias", ((RealAttestedKeyService) attestedKeyService).keyAlias);
            AttestedKeyService.GenerationMode generationMode = AttestedKeyService.GenerationMode.RECREATE_AT_STARTUP;
            return MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("generationMode", "RECREATE_AT_STARTUP"));
        }

        @Override // retrofit2.CallAdapter
        public Object adapt(Call call) {
            Executor executor = (Executor) this.this$0;
            return executor == null ? call : new DefaultCallAdapterFactory.ExecutorCallbackCall(executor, call, 0);
        }

        public void addProvider(Provider provider) {
            provider.getClass();
            ((ArrayList) this.val$callback).add(provider);
        }

        public SetFactory build() {
            ArrayList arrayList = (ArrayList) this.this$0;
            ArrayList arrayList2 = (ArrayList) this.val$callback;
            if (BaseDoubleCheckKt.hasDuplicates(arrayList2)) {
                a$$ExternalSyntheticBUOutline0.m$1("Codegen error? Duplicates in the provider list");
                return null;
            }
            if (!BaseDoubleCheckKt.hasDuplicates(arrayList)) {
                return new SetFactory(0, arrayList2, arrayList);
            }
            a$$ExternalSyntheticBUOutline0.m$1("Codegen error? Duplicates in the provider list");
            return null;
        }

        @Override // okhttp3.TrailersSource
        public Headers get() {
            RealBufferedSource realBufferedSource = ((RealResponseBody) this.this$0).source;
            if (!realBufferedSource.closed) {
                TimeZone timeZone = _UtilJvmKt.UTC;
                while (!realBufferedSource.exhausted()) {
                    realBufferedSource.skip(realBufferedSource.bufferField.size);
                }
            }
            Headers peekTrailers = ((ExchangeCodec) ((Exchange) this.val$callback).codec).peekTrailers();
            if (peekTrailers != null) {
                return peekTrailers;
            }
            a$$ExternalSyntheticBUOutline0.m$1("null trailers after exhausting response body?!");
            return null;
        }

        public SharedPreferences getPreferences() {
            return (SharedPreferences) ((Lazy) this.this$0).getValue();
        }

        @Override // kotlin.properties.ReadOnlyProperty
        public Object getValue(Object obj, KProperty kProperty) {
            kProperty.getClass();
            Object obj2 = this.this$0;
            if (obj2 != null) {
                return obj2;
            }
            Object invoke = ((Handlers$$ExternalSyntheticLambda1) this.val$callback).invoke();
            this.this$0 = invoke;
            Handlers.onCurrentMainThreadMessageFinished(new AppUpdateDetector$$ExternalSyntheticLambda0(this, 15));
            return invoke;
        }

        @Override // okhttp3.Callback
        public void onFailure(okhttp3.Call call, IOException iOException) {
            int i = this.$r8$classId;
            Object obj = this.val$callback;
            switch (i) {
                case 0:
                    try {
                        ((Callback) obj).onFailure((OkHttpCall) this.this$0, iOException);
                        break;
                    } catch (Throwable th) {
                        Utils.throwIfFatal(th);
                        th.printStackTrace();
                        return;
                    }
                default:
                    ((BufferedChannel) obj).closeOrCancelImpl(iOException, false);
                    break;
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(okhttp3.Call call, okhttp3.Response response) {
            int i = this.$r8$classId;
            Object obj = this.val$callback;
            switch (i) {
                case 0:
                    Callback callback = (Callback) obj;
                    OkHttpCall okHttpCall = (OkHttpCall) this.this$0;
                    try {
                        try {
                            callback.onResponse(okHttpCall, okHttpCall.parseResponse(response));
                            break;
                        } catch (Throwable th) {
                            Utils.throwIfFatal(th);
                            th.printStackTrace();
                            return;
                        }
                    } catch (Throwable th2) {
                        Utils.throwIfFatal(th2);
                        try {
                            callback.onFailure(okHttpCall, th2);
                            return;
                        } catch (Throwable th3) {
                            Utils.throwIfFatal(th3);
                            th3.printStackTrace();
                            return;
                        }
                    }
                default:
                    MapsKt__MapsKt.toMap(response.headers);
                    JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new GrpcKt$readFromResponseBodyCallback$1$onResponse$1(response, (ProtoAdapter) this.this$0, (BufferedChannel) obj, null));
                    break;
            }
        }

        public void recordAction(RealAttestedKeyService realAttestedKeyService, AttestedKeyMetrics$ActionType attestedKeyMetrics$ActionType) {
            ((RealObservabilityManager) this.val$callback).addAction(new RealTrifleLogger$logAction$1(realAttestedKeyService, attestedKeyMetrics$ActionType.getDataDogIdentifier()));
        }

        public void recordError(RealAttestedKeyService realAttestedKeyService, AttestedKeyMetrics$ErrorType attestedKeyMetrics$ErrorType, Exception exc) {
            exc.getClass();
            ErrorReporter errorReporter = (ErrorReporter) this.this$0;
            String concat = attestedKeyMetrics$ErrorType.getDataDogIdentifier().concat("Error");
            Set of = SetsKt__SetsJVMKt.setOf(ErrorFeature.AttestedKey.INSTANCE);
            Pair pair = new Pair("keyAlias", realAttestedKeyService.keyAlias);
            AttestedKeyService.GenerationMode generationMode = AttestedKeyService.GenerationMode.RECREATE_AT_STARTUP;
            errorReporter.report(new GenericDatadogError(of, concat, BalanceFeedKt$$ExternalSyntheticOutline0.m("AttestedKey", MapsKt__MapsKt.mapOf(pair, new Pair("generationMode", "RECREATE_AT_STARTUP"))), exc), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Comparable resolve(Uri uri, ContinuationImpl continuationImpl) {
            NotificationPhotoResolver$resolve$1 notificationPhotoResolver$resolve$1;
            int i;
            String str;
            if (continuationImpl instanceof NotificationPhotoResolver$resolve$1) {
                notificationPhotoResolver$resolve$1 = (NotificationPhotoResolver$resolve$1) continuationImpl;
                int i2 = notificationPhotoResolver$resolve$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    notificationPhotoResolver$resolve$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = notificationPhotoResolver$resolve$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = notificationPhotoResolver$resolve$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!uri.getQueryParameterNames().isEmpty()) {
                            String queryParameter = uri.getQueryParameter("photoUrl");
                            if (queryParameter != null && !StringsKt.isBlank(queryParameter)) {
                                return Uri.parse(queryParameter);
                            }
                            String queryParameter2 = uri.getQueryParameter("customerId");
                            if (queryParameter2 != null && ((PermissionChecker) this.val$callback).hasContacts()) {
                                NotificationPhotoLookupKeyRegistry notificationPhotoLookupKeyRegistry = (NotificationPhotoLookupKeyRegistry) this.this$0;
                                notificationPhotoResolver$resolve$1.label = 1;
                                obj = notificationPhotoLookupKeyRegistry.getValidLookupKeys(queryParameter2, notificationPhotoResolver$resolve$1);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                        return null;
                    }
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    str = (String) CollectionsKt.firstOrNull((List) obj);
                    if (str != null) {
                        return Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_LOOKUP_URI, str);
                    }
                    return null;
                }
            }
            notificationPhotoResolver$resolve$1 = new NotificationPhotoResolver$resolve$1(this, continuationImpl);
            Object obj2 = notificationPhotoResolver$resolve$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = notificationPhotoResolver$resolve$1.label;
            if (i != 0) {
            }
            str = (String) CollectionsKt.firstOrNull((List) obj2);
            if (str != null) {
            }
            return null;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return (Type) this.val$callback;
        }

        public AnonymousClass1(Handlers$$ExternalSyntheticLambda1 handlers$$ExternalSyntheticLambda1) {
            this.$r8$classId = 22;
            this.val$callback = handlers$$ExternalSyntheticLambda1;
        }

        public AnonymousClass1(Context context, CoroutineScope coroutineScope) {
            this.$r8$classId = 16;
            context.getClass();
            this.val$callback = coroutineScope;
            this.this$0 = context.getApplicationContext();
        }

        public /* synthetic */ AnonymousClass1(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.val$callback = obj;
            this.this$0 = obj2;
        }

        public AnonymousClass1(Application application) {
            this.$r8$classId = 23;
            this.val$callback = application;
            this.this$0 = LazyKt.lazy(new AppUpdateDetector$$ExternalSyntheticLambda0(this, 0));
        }

        public AnonymousClass1(RealFeatureFlagManager realFeatureFlagManager, CoroutineScope coroutineScope) {
            this.$r8$classId = 2;
            this.val$callback = realFeatureFlagManager;
            this.this$0 = new AtomicBoolean();
        }

        public AnonymousClass1(Context context) {
            this.$r8$classId = 15;
            this.val$callback = (TelephonyManager) context.getSystemService("phone");
        }

        public AnonymousClass1(int i, int i2) {
            this.$r8$classId = 18;
            this.val$callback = BaseDoubleCheckKt.presizedList(i);
            this.this$0 = BaseDoubleCheckKt.presizedList(i2);
        }

        public AnonymousClass1(BufferedChannel bufferedChannel, RealGrpcStreamingCall realGrpcStreamingCall, ProtoAdapter protoAdapter) {
            this.$r8$classId = 17;
            this.val$callback = bufferedChannel;
            this.this$0 = protoAdapter;
        }

        public AnonymousClass1(InteractionTrigger interactionTrigger, List list) {
            this.$r8$classId = 21;
            list.getClass();
            this.val$callback = interactionTrigger;
            this.this$0 = list;
        }

        public AnonymousClass1(OkHttpCall okHttpCall, Callback callback) {
            this.$r8$classId = 0;
            this.this$0 = okHttpCall;
            this.val$callback = callback;
        }
    }
}
