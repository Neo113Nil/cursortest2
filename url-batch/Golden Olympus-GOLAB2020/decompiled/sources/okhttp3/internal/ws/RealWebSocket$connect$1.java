package okhttp3.internal.ws;

import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.ws.RealWebSocket;

@Metadata
/* loaded from: classes3.dex */
public final class RealWebSocket$connect$1 implements Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RealWebSocket f43213a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Request f43214b;

    @Override // okhttp3.Callback
    public void a(Call call, Response response) {
        boolean q4;
        ArrayDeque arrayDeque;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        Exchange N3 = response.N();
        try {
            this.f43213a.k(response, N3);
            Intrinsics.checkNotNull(N3);
            RealWebSocket.Streams n4 = N3.n();
            WebSocketExtensions a4 = WebSocketExtensions.f43215g.a(response.W());
            this.f43213a.f43180d = a4;
            q4 = this.f43213a.q(a4);
            if (!q4) {
                RealWebSocket realWebSocket = this.f43213a;
                synchronized (realWebSocket) {
                    arrayDeque = realWebSocket.f43191o;
                    arrayDeque.clear();
                    realWebSocket.l(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                this.f43213a.p(Util.f42597i + " WebSocket " + this.f43214b.j().n(), n4);
                this.f43213a.o().f(this.f43213a, response);
                this.f43213a.r();
            } catch (Exception e4) {
                this.f43213a.n(e4, null);
            }
        } catch (IOException e5) {
            this.f43213a.n(e5, response);
            Util.l(response);
            if (N3 != null) {
                N3.v();
            }
        }
    }

    @Override // okhttp3.Callback
    public void b(Call call, IOException e4) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e4, "e");
        this.f43213a.n(e4, null);
    }
}
