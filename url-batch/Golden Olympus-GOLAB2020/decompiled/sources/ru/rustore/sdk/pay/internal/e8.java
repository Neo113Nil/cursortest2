package ru.rustore.sdk.pay.internal;

import com.huawei.hms.support.api.entity.pay.PayStatusCodes;
import f2.AbstractC2420c;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.BuildConfig;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleMapErrorKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

/* loaded from: classes3.dex */
public final class e8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final mj f44002a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final SSLSocketFactory f44003b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final y4 f44004c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final b0 f44005d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final o6 f44006e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final q7 f44007f;

    public static final class a extends kotlin.jvm.internal.s implements Function0<u7> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f44009b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ki f44010c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ki kiVar) {
            super(0);
            this.f44009b = str;
            this.f44010c = kiVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return e8.a(e8.this, this.f44009b, this.f44010c);
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements Function1<Throwable, Throwable> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Throwable throwable = (Throwable) obj;
            Intrinsics.checkNotNullParameter(throwable, "error");
            e8.this.f44007f.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (throwable instanceof SocketTimeoutException) {
                return new RuStorePaymentException.RuStorePaymentNetworkException("TIMEOUT_ERROR", "", "Connection timeout: " + throwable.getMessage(), throwable);
            }
            if (throwable instanceof UnknownHostException) {
                return new RuStorePaymentException.RuStorePaymentNetworkException("NO_CONNECTION", "", "No internet connection: " + throwable.getMessage(), throwable);
            }
            return new RuStorePaymentException.RuStorePaymentNetworkException("NETWORK_ERROR", "", "Network error: " + throwable.getMessage(), throwable);
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function1<u7, u7> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            u7 result = (u7) obj;
            Intrinsics.checkNotNullParameter(result, "result");
            int i4 = result.f45084b;
            if (i4 < 400 && i4 > 0) {
                return result;
            }
            e8.this.f44007f.getClass();
            throw q7.a(result);
        }
    }

    public e8(@NotNull mj sdkInfoRepository, @NotNull SSLSocketFactory internalSsLSocketFactory, @NotNull y4 deviceIdProvider, @NotNull b0 appVersionProvider, @NotNull o6 logger, @NotNull q7 exceptionMapper) {
        Intrinsics.checkNotNullParameter(sdkInfoRepository, "sdkInfoRepository");
        Intrinsics.checkNotNullParameter(internalSsLSocketFactory, "internalSsLSocketFactory");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(appVersionProvider, "appVersionProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        this.f44002a = sdkInfoRepository;
        this.f44003b = internalSsLSocketFactory;
        this.f44004c = deviceIdProvider;
        this.f44005d = appVersionProvider;
        this.f44006e = logger;
        this.f44007f = exceptionMapper;
    }

    @NotNull
    public final Single<u7> a(@NotNull String host, @NotNull ki type) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(type, "type");
        return SingleSubscribeOnKt.subscribeOn(SingleMapKt.map(SingleMapErrorKt.mapError(Single.Companion.from(new a(host, type)), new b()), new c()), Dispatchers.INSTANCE.getIo());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final u7 a(e8 e8Var, String str, ki kiVar) {
        HttpsURLConnection httpsURLConnection;
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            URL url = new URL(str + kiVar.a());
            URLConnection openConnection = url.openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setConnectTimeout(PayStatusCodes.PAY_STATE_CANCEL);
            httpsURLConnection.setReadTimeout(PayStatusCodes.PAY_STATE_CANCEL);
            httpsURLConnection.setHostnameVerifier(sm.a(url));
            httpsURLConnection.setSSLSocketFactory(e8Var.f44003b);
            httpsURLConnection.setRequestMethod(kiVar.b());
            Intrinsics.checkNotNullParameter(httpsURLConnection, "<this>");
            httpsURLConnection.setRequestProperty("content-type", com.ironsource.cc.f15719L);
            ij sdkInfo = e8Var.f44002a.a();
            Intrinsics.checkNotNullParameter(httpsURLConnection, "<this>");
            Intrinsics.checkNotNullParameter(sdkInfo, "sdkInfo");
            httpsURLConnection.setRequestProperty("Sdk-Version", BuildConfig.SDK_VERSION);
            httpsURLConnection.setRequestProperty("Sdk-Type", sdkInfo.f44347a);
            String deviceId = e8Var.f44004c.a();
            Intrinsics.checkNotNullParameter(httpsURLConnection, "<this>");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            httpsURLConnection.setRequestProperty("Device-Id", deviceId);
            Long l4 = (Long) e8Var.f44005d.f43840b.getValue();
            if (l4 != null) {
                long longValue = l4.longValue();
                Intrinsics.checkNotNullParameter(httpsURLConnection, "<this>");
                httpsURLConnection.setRequestProperty("App-Version", String.valueOf(longValue));
            }
            for (Map.Entry<String, String> entry : kiVar.c().entrySet()) {
                httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            ki.b bVar = kiVar instanceof ki.b ? (ki.b) kiVar : null;
            String str2 = bVar != null ? bVar.f44487c : null;
            e8Var.f44006e.a(httpsURLConnection);
            if (str2 != null) {
                httpsURLConnection.setDoOutput(true);
                OutputStream outputStream = httpsURLConnection.getOutputStream();
                try {
                    byte[] bytes = str2.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    outputStream.flush();
                    Unit unit = Unit.f41027a;
                    AbstractC2420c.a(outputStream, null);
                } finally {
                }
            } else {
                httpsURLConnection.setDoOutput(false);
            }
        } catch (Throwable th) {
            th = th;
            if (httpsURLConnection2 != null) {
                httpsURLConnection2.disconnect();
            }
            throw th;
        }
        try {
            u7 a4 = n6.a(httpsURLConnection, e8Var.f44006e);
            httpsURLConnection.disconnect();
            return a4;
        } catch (Throwable th2) {
            th = th2;
            httpsURLConnection2 = httpsURLConnection;
            if (httpsURLConnection2 != null) {
            }
            throw th;
        }
    }
}
