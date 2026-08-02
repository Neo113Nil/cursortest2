package okhttp3.internal.http;

import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.connection.RealCall;
import okio.Sink;
import okio.Socket;
import okio.Source;

/* loaded from: classes3.dex */
public interface ExchangeCodec {

    public interface Carrier {
        void cancel();

        Route getRoute();

        void noNewExchanges();

        void trackFailure(RealCall realCall, IOException iOException);
    }

    void cancel();

    Sink createRequestBody(Request request, long j);

    void finishRequest();

    void flushRequest();

    Carrier getCarrier();

    Socket getSocket();

    boolean isResponseComplete();

    Source openResponseBodySource(Response response);

    Headers peekTrailers();

    Response.Builder readResponseHeaders(boolean z);

    long reportedContentLength(Response response);

    void writeRequestHeaders(Request request);
}
