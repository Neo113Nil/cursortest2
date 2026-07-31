package ru.rustore.sdk.pay.internal;

import com.huawei.hms.support.api.entity.pay.PayStatusCodes;
import f2.AbstractC2420c;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.BuildConfig;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final mj f44862a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final bk f44863b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final SSLSocketFactory f44864c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final y4 f44865d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final b0 f44866e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final cl f44867f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final o6 f44868g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final q7 f44869h;

    public static final class a extends kotlin.jvm.internal.s implements Function1<ak, u7> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ki f44871b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ki kiVar) {
            super(1);
            this.f44871b = kiVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ak session = (ak) obj;
            Intrinsics.checkNotNullParameter(session, "session");
            return r0.a(r0.this, this.f44871b, session);
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements Function1<u7, Single<u7>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ki f44873b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ki kiVar) {
            super(1);
            this.f44873b = kiVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            u7 response = (u7) obj;
            Intrinsics.checkNotNullParameter(response, "response");
            r0 r0Var = r0.this;
            ki kiVar = this.f44873b;
            if (response.f45084b != 401) {
                return Single.Companion.from(new w0(response));
            }
            bk bkVar = r0Var.f44863b;
            bkVar.getClass();
            return SingleFlatMapKt.flatMap(bkVar.a(new jk(bkVar)), new u0(r0Var, response, r0Var, kiVar));
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function1<u7, Single<u7>> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            u7 response = (u7) obj;
            Intrinsics.checkNotNullParameter(response, "result");
            if (response.f45084b >= 400) {
                return Single.Companion.from(new v0(r0.this, response));
            }
            cl clVar = r0.this.f44867f;
            clVar.getClass();
            Intrinsics.checkNotNullParameter(response, "response");
            return SingleSubscribeOnKt.subscribeOn(SingleFlatMapKt.flatMap(Single.Companion.from(new zk(clVar, response)), new al(clVar, response)), Dispatchers.INSTANCE.getIo());
        }
    }

    public r0(@NotNull mj sdkInfoRepository, @NotNull bk sessionManager, @NotNull SSLSocketFactory internalSsLSocketFactory, @NotNull y4 deviceIdProvider, @NotNull b0 appVersionProvider, @NotNull cl signatureVerifier, @NotNull o6 logger, @NotNull q7 exceptionMapper) {
        Intrinsics.checkNotNullParameter(sdkInfoRepository, "sdkInfoRepository");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(internalSsLSocketFactory, "internalSsLSocketFactory");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(appVersionProvider, "appVersionProvider");
        Intrinsics.checkNotNullParameter(signatureVerifier, "signatureVerifier");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        this.f44862a = sdkInfoRepository;
        this.f44863b = sessionManager;
        this.f44864c = internalSsLSocketFactory;
        this.f44865d = deviceIdProvider;
        this.f44866e = appVersionProvider;
        this.f44867f = signatureVerifier;
        this.f44868g = logger;
        this.f44869h = exceptionMapper;
    }

    @NotNull
    public final Single<u7> a(@NotNull ki type) {
        Intrinsics.checkNotNullParameter(type, "type");
        bk bkVar = this.f44863b;
        bkVar.getClass();
        return SingleSubscribeOnKt.subscribeOn(SingleFlatMapKt.flatMap(SingleFlatMapKt.flatMap(SingleMapKt.map(bkVar.a(new jk(bkVar)), new a(type)), new b(type)), new c()), Dispatchers.INSTANCE.getIo());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final u7 a(r0 r0Var, ki kiVar, ak akVar) {
        HttpsURLConnection httpsURLConnection = null;
        try {
            URL url = new URL(akVar.a() + kiVar.a());
            URLConnection openConnection = url.openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) openConnection;
            httpsURLConnection2.setConnectTimeout(PayStatusCodes.PAY_STATE_CANCEL);
            httpsURLConnection2.setReadTimeout(PayStatusCodes.PAY_STATE_CANCEL);
            httpsURLConnection2.setHostnameVerifier(sm.a(url));
            httpsURLConnection2.setSSLSocketFactory(r0Var.f44864c);
            httpsURLConnection2.setRequestMethod(kiVar.b());
            Intrinsics.checkNotNullParameter(httpsURLConnection2, "<this>");
            httpsURLConnection2.setRequestProperty("content-type", com.ironsource.cc.f15719L);
            String token = akVar.c();
            Intrinsics.checkNotNullParameter(httpsURLConnection2, "<this>");
            Intrinsics.checkNotNullParameter(token, "token");
            httpsURLConnection2.setRequestProperty("RuStore-Payment-Token", token);
            ij sdkInfo = r0Var.f44862a.a();
            Intrinsics.checkNotNullParameter(httpsURLConnection2, "<this>");
            Intrinsics.checkNotNullParameter(sdkInfo, "sdkInfo");
            httpsURLConnection2.setRequestProperty("Sdk-Version", BuildConfig.SDK_VERSION);
            httpsURLConnection2.setRequestProperty("Sdk-Type", sdkInfo.f44347a);
            String deviceId = r0Var.f44865d.a();
            Intrinsics.checkNotNullParameter(httpsURLConnection2, "<this>");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            httpsURLConnection2.setRequestProperty("Device-Id", deviceId);
            Long l4 = (Long) r0Var.f44866e.f43840b.getValue();
            if (l4 != null) {
                long longValue = l4.longValue();
                Intrinsics.checkNotNullParameter(httpsURLConnection2, "<this>");
                httpsURLConnection2.setRequestProperty("App-Version", String.valueOf(longValue));
            }
            for (Map.Entry<String, String> entry : kiVar.c().entrySet()) {
                httpsURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
            }
            ki.b bVar = kiVar instanceof ki.b ? (ki.b) kiVar : null;
            String str = bVar != null ? bVar.f44487c : null;
            r0Var.f44868g.a(httpsURLConnection2);
            if (str != null) {
                httpsURLConnection2.setDoOutput(true);
                OutputStream outputStream = httpsURLConnection2.getOutputStream();
                try {
                    byte[] bytes = str.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    outputStream.flush();
                    Unit unit = Unit.f41027a;
                    AbstractC2420c.a(outputStream, null);
                } finally {
                }
            } else {
                httpsURLConnection2.setDoOutput(false);
            }
            try {
                u7 a4 = n6.a(httpsURLConnection2, r0Var.f44868g);
                httpsURLConnection2.disconnect();
                return a4;
            } catch (Throwable th) {
                th = th;
                httpsURLConnection = httpsURLConnection2;
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (httpsURLConnection != null) {
            }
            throw th;
        }
    }
}
