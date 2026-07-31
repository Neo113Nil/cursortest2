package okhttp3.internal.http;

import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import okio.B;
import okio.z;

@Metadata
/* loaded from: classes3.dex */
public interface ExchangeCodec {

    @Metadata
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f42835a = new Companion();

        private Companion() {
        }
    }

    void a();

    void b(Request request);

    B c(Response response);

    void cancel();

    Response.Builder d(boolean z4);

    RealConnection e();

    void f();

    long g(Response response);

    z h(Request request, long j4);
}
