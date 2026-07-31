package okhttp3.internal.http;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

@Metadata
/* loaded from: classes3.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a, reason: collision with root package name */
    private final RealCall f42839a;

    /* renamed from: b, reason: collision with root package name */
    private final List f42840b;

    /* renamed from: c, reason: collision with root package name */
    private final int f42841c;

    /* renamed from: d, reason: collision with root package name */
    private final Exchange f42842d;

    /* renamed from: e, reason: collision with root package name */
    private final Request f42843e;

    /* renamed from: f, reason: collision with root package name */
    private final int f42844f;

    /* renamed from: g, reason: collision with root package name */
    private final int f42845g;

    /* renamed from: h, reason: collision with root package name */
    private final int f42846h;

    /* renamed from: i, reason: collision with root package name */
    private int f42847i;

    public RealInterceptorChain(RealCall call, List interceptors, int i4, Exchange exchange, Request request, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f42839a = call;
        this.f42840b = interceptors;
        this.f42841c = i4;
        this.f42842d = exchange;
        this.f42843e = request;
        this.f42844f = i5;
        this.f42845g = i6;
        this.f42846h = i7;
    }

    public static /* synthetic */ RealInterceptorChain d(RealInterceptorChain realInterceptorChain, int i4, Exchange exchange, Request request, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i4 = realInterceptorChain.f42841c;
        }
        if ((i8 & 2) != 0) {
            exchange = realInterceptorChain.f42842d;
        }
        if ((i8 & 4) != 0) {
            request = realInterceptorChain.f42843e;
        }
        if ((i8 & 8) != 0) {
            i5 = realInterceptorChain.f42844f;
        }
        if ((i8 & 16) != 0) {
            i6 = realInterceptorChain.f42845g;
        }
        if ((i8 & 32) != 0) {
            i7 = realInterceptorChain.f42846h;
        }
        int i9 = i6;
        int i10 = i7;
        return realInterceptorChain.c(i4, exchange, request, i5, i9, i10);
    }

    @Override // okhttp3.Interceptor.Chain
    public Response a(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f42841c >= this.f42840b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f42847i++;
        Exchange exchange = this.f42842d;
        if (exchange != null) {
            if (!exchange.j().g(request.j())) {
                throw new IllegalStateException(("network interceptor " + this.f42840b.get(this.f42841c - 1) + " must retain the same host and port").toString());
            }
            if (this.f42847i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f42840b.get(this.f42841c - 1) + " must call proceed() exactly once").toString());
            }
        }
        RealInterceptorChain d4 = d(this, this.f42841c + 1, null, request, 0, 0, 0, 58, null);
        Interceptor interceptor = (Interceptor) this.f42840b.get(this.f42841c);
        Response a4 = interceptor.a(d4);
        if (a4 == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (this.f42842d != null && this.f42841c + 1 < this.f42840b.size() && d4.f42847i != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
        }
        if (a4.m() != null) {
            return a4;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    @Override // okhttp3.Interceptor.Chain
    public Request b() {
        return this.f42843e;
    }

    public final RealInterceptorChain c(int i4, Exchange exchange, Request request, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new RealInterceptorChain(this.f42839a, this.f42840b, i4, exchange, request, i5, i6, i7);
    }

    @Override // okhttp3.Interceptor.Chain
    public Call call() {
        return this.f42839a;
    }

    public final RealCall e() {
        return this.f42839a;
    }

    public final int f() {
        return this.f42844f;
    }

    public final Exchange g() {
        return this.f42842d;
    }

    public final int h() {
        return this.f42845g;
    }

    public final Request i() {
        return this.f42843e;
    }

    public final int j() {
        return this.f42846h;
    }

    public int k() {
        return this.f42845g;
    }
}
