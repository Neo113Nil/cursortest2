package okhttp3;

import f6.l;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.s;
import okhttp3.Interceptor;

/* loaded from: classes5.dex */
public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request);

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i8, TimeUnit timeUnit);

        Chain withReadTimeout(int i8, TimeUnit timeUnit);

        Chain withWriteTimeout(int i8, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(final l block) {
            s.checkNotNullParameter(block, "block");
            return new Interceptor() { // from class: okhttp3.Interceptor$Companion$invoke$1
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain it) {
                    s.checkNotNullParameter(it, "it");
                    return (Response) l.this.invoke(it);
                }
            };
        }
    }

    Response intercept(Chain chain);
}
