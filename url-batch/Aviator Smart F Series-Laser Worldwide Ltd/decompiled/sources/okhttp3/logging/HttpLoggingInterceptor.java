package okhttp3.logging;

import cn.hutool.core.text.l;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.collections.v;
import kotlin.collections.x0;
import kotlin.io.b;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;
import kotlin.text.t;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okio.c;
import okio.e;
import okio.o;

/* loaded from: classes5.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface Logger {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String message) {
                    s.checkNotNullParameter(message, "message");
                    Platform.log$default(Platform.Companion.get(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }

        void log(String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || t.equals(str, "identity", true) || t.equals(str, "gzip", true)) ? false : true;
    }

    private final void logHeader(Headers headers, int i8) {
        String value = this.headersToRedact.contains(headers.name(i8)) ? "██" : headers.value(i8);
        this.logger.log(headers.name(i8) + ": " + value);
    }

    /* renamed from: -deprecated_level, reason: not valid java name */
    public final Level m1438deprecated_level() {
        return this.level;
    }

    public final Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        String str;
        char c8;
        String sb;
        Charset charset;
        Long l8;
        s.checkNotNullParameter(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z7 = level == Level.BODY;
        boolean z8 = z7 || level == Level.HEADERS;
        RequestBody body = request.body();
        Connection connection = chain.connection();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--> ");
        sb2.append(request.method());
        sb2.append(' ');
        sb2.append(request.url());
        sb2.append(connection != null ? s.stringPlus(l.SPACE, connection.protocol()) : "");
        String sb3 = sb2.toString();
        if (!z8 && body != null) {
            sb3 = sb3 + " (" + body.contentLength() + "-byte body)";
        }
        this.logger.log(sb3);
        if (z8) {
            Headers headers = request.headers();
            if (body != null) {
                MediaType contentType = body.contentType();
                if (contentType != null && headers.get("Content-Type") == null) {
                    this.logger.log(s.stringPlus("Content-Type: ", contentType));
                }
                if (body.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.logger.log(s.stringPlus("Content-Length: ", Long.valueOf(body.contentLength())));
                }
            }
            int size = headers.size();
            for (int i8 = 0; i8 < size; i8++) {
                logHeader(headers, i8);
            }
            if (!z7 || body == null) {
                this.logger.log(s.stringPlus("--> END ", request.method()));
            } else if (bodyHasUnknownEncoding(request.headers())) {
                this.logger.log("--> END " + request.method() + " (encoded body omitted)");
            } else if (body.isDuplex()) {
                this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
            } else if (body.isOneShot()) {
                this.logger.log("--> END " + request.method() + " (one-shot body omitted)");
            } else {
                c cVar = new c();
                body.writeTo(cVar);
                MediaType contentType2 = body.contentType();
                Charset UTF_8 = contentType2 == null ? null : contentType2.charset(StandardCharsets.UTF_8);
                if (UTF_8 == null) {
                    UTF_8 = StandardCharsets.UTF_8;
                    s.checkNotNullExpressionValue(UTF_8, "UTF_8");
                }
                this.logger.log("");
                if (Utf8Kt.isProbablyUtf8(cVar)) {
                    this.logger.log(cVar.readString(UTF_8));
                    this.logger.log("--> END " + request.method() + " (" + body.contentLength() + "-byte body)");
                } else {
                    this.logger.log("--> END " + request.method() + " (binary " + body.contentLength() + "-byte body omitted)");
                }
            }
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            s.checkNotNull(body2);
            long contentLength = body2.contentLength();
            String str2 = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
            Logger logger = this.logger;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<-- ");
            sb4.append(proceed.code());
            if (proceed.message().length() == 0) {
                str = "-byte body omitted)";
                sb = "";
                c8 = ' ';
            } else {
                String message = proceed.message();
                StringBuilder sb5 = new StringBuilder();
                str = "-byte body omitted)";
                c8 = ' ';
                sb5.append(' ');
                sb5.append(message);
                sb = sb5.toString();
            }
            sb4.append(sb);
            sb4.append(c8);
            sb4.append(proceed.request().url());
            sb4.append(" (");
            sb4.append(millis);
            sb4.append("ms");
            sb4.append(z8 ? "" : ", " + str2 + " body");
            sb4.append(')');
            logger.log(sb4.toString());
            if (z8) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    logHeader(headers2, i9);
                }
                if (!z7 || !HttpHeaders.promisesBody(proceed)) {
                    this.logger.log("<-- END HTTP");
                } else if (bodyHasUnknownEncoding(proceed.headers())) {
                    this.logger.log("<-- END HTTP (encoded body omitted)");
                } else {
                    e source = body2.source();
                    source.request(Long.MAX_VALUE);
                    c buffer = source.getBuffer();
                    if (t.equals("gzip", headers2.get("Content-Encoding"), true)) {
                        l8 = Long.valueOf(buffer.size());
                        o oVar = new o(buffer.clone());
                        try {
                            buffer = new c();
                            buffer.writeAll(oVar);
                            charset = null;
                            b.closeFinally(oVar, null);
                        } finally {
                        }
                    } else {
                        charset = null;
                        l8 = null;
                    }
                    MediaType contentType3 = body2.contentType();
                    Charset UTF_82 = contentType3 == null ? charset : contentType3.charset(StandardCharsets.UTF_8);
                    if (UTF_82 == null) {
                        UTF_82 = StandardCharsets.UTF_8;
                        s.checkNotNullExpressionValue(UTF_82, "UTF_8");
                    }
                    if (!Utf8Kt.isProbablyUtf8(buffer)) {
                        this.logger.log("");
                        this.logger.log("<-- END HTTP (binary " + buffer.size() + str);
                        return proceed;
                    }
                    if (contentLength != 0) {
                        this.logger.log("");
                        this.logger.log(buffer.clone().readString(UTF_82));
                    }
                    if (l8 != null) {
                        this.logger.log("<-- END HTTP (" + buffer.size() + "-byte, " + l8 + "-gzipped-byte body)");
                    } else {
                        this.logger.log("<-- END HTTP (" + buffer.size() + "-byte body)");
                    }
                }
            }
            return proceed;
        } catch (Exception e8) {
            this.logger.log(s.stringPlus("<-- HTTP FAILED: ", e8));
            throw e8;
        }
    }

    public final void level(Level level) {
        s.checkNotNullParameter(level, "<set-?>");
        this.level = level;
    }

    public final void redactHeader(String name) {
        Comparator case_insensitive_order;
        s.checkNotNullParameter(name, "name");
        case_insensitive_order = t.getCASE_INSENSITIVE_ORDER(w.INSTANCE);
        TreeSet treeSet = new TreeSet(case_insensitive_order);
        v.addAll(treeSet, this.headersToRedact);
        treeSet.add(name);
        this.headersToRedact = treeSet;
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        s.checkNotNullParameter(level, "level");
        level(level);
        return this;
    }

    public HttpLoggingInterceptor(Logger logger) {
        Set<String> emptySet;
        s.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        emptySet = x0.emptySet();
        this.headersToRedact = emptySet;
        this.level = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i8, kotlin.jvm.internal.o oVar) {
        this((i8 & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
