package retrofit2;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.j0;
import okio.x0;
import okio.y0;

/* loaded from: classes5.dex */
final class o implements retrofit2.b {
    private final Object[] args;
    private final Call.Factory callFactory;
    private volatile boolean canceled;

    @GuardedBy("this")
    @Nullable
    private Throwable creationFailure;

    @GuardedBy("this")
    private boolean executed;

    @GuardedBy("this")
    @Nullable
    private Call rawCall;
    private final t requestFactory;
    private final i responseConverter;

    class a implements Callback {
        final /* synthetic */ d val$callback;

        a(d dVar) {
            this.val$callback = dVar;
        }

        private void callFailure(Throwable th) {
            try {
                this.val$callback.onFailure(o.this, th);
            } catch (Throwable th2) {
                z.throwIfFatal(th2);
                th2.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            callFailure(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                try {
                    this.val$callback.onResponse(o.this, o.this.parseResponse(response));
                } catch (Throwable th) {
                    z.throwIfFatal(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                z.throwIfFatal(th2);
                callFailure(th2);
            }
        }
    }

    static final class b extends ResponseBody {
        private final ResponseBody delegate;
        private final okio.e delegateSource;

        @Nullable
        IOException thrownException;

        class a extends okio.m {
            a(x0 x0Var) {
                super(x0Var);
            }

            @Override // okio.m, okio.x0
            public long read(okio.c cVar, long j8) {
                try {
                    return super.read(cVar, j8);
                } catch (IOException e8) {
                    b.this.thrownException = e8;
                    throw e8;
                }
            }
        }

        b(ResponseBody responseBody) {
            this.delegate = responseBody;
            this.delegateSource = j0.buffer(new a(responseBody.source()));
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.delegate.contentType();
        }

        @Override // okhttp3.ResponseBody
        public okio.e source() {
            return this.delegateSource;
        }

        void throwIfCaught() {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    static final class c extends ResponseBody {
        private final long contentLength;

        @Nullable
        private final MediaType contentType;

        c(@Nullable MediaType mediaType, long j8) {
            this.contentType = mediaType;
            this.contentLength = j8;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        public okio.e source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    o(t tVar, Object[] objArr, Call.Factory factory, i iVar) {
        this.requestFactory = tVar;
        this.args = objArr;
        this.callFactory = factory;
        this.responseConverter = iVar;
    }

    private Call createRawCall() {
        Call newCall = this.callFactory.newCall(this.requestFactory.create(this.args));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @GuardedBy("this")
    private Call getRawCall() {
        Call call = this.rawCall;
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
            Call createRawCall = createRawCall();
            this.rawCall = createRawCall;
            return createRawCall;
        } catch (IOException | Error | RuntimeException e8) {
            z.throwIfFatal(e8);
            this.creationFailure = e8;
            throw e8;
        }
    }

    @Override // retrofit2.b
    public void cancel() {
        Call call;
        this.canceled = true;
        synchronized (this) {
            call = this.rawCall;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // retrofit2.b
    public void enqueue(d dVar) {
        Call call;
        Throwable th;
        Objects.requireNonNull(dVar, "callback == null");
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
                        Call createRawCall = createRawCall();
                        this.rawCall = createRawCall;
                        call = createRawCall;
                    } catch (Throwable th2) {
                        th = th2;
                        z.throwIfFatal(th);
                        this.creationFailure = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            dVar.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            call.cancel();
        }
        call.enqueue(new a(dVar));
    }

    @Override // retrofit2.b
    public u execute() {
        Call rawCall;
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            rawCall = getRawCall();
        }
        if (this.canceled) {
            rawCall.cancel();
        }
        return parseResponse(rawCall.execute());
    }

    @Override // retrofit2.b
    public boolean isCanceled() {
        boolean z7 = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.rawCall;
                if (call == null || !call.isCanceled()) {
                    z7 = false;
                }
            } finally {
            }
        }
        return z7;
    }

    @Override // retrofit2.b
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    u parseResponse(Response response) {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new c(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                return u.error(z.buffer(body), build);
            } finally {
                body.close();
            }
        }
        if (code == 204 || code == 205) {
            body.close();
            return u.success((Object) null, build);
        }
        b bVar = new b(body);
        try {
            return u.success(this.responseConverter.convert(bVar), build);
        } catch (RuntimeException e8) {
            bVar.throwIfCaught();
            throw e8;
        }
    }

    @Override // retrofit2.b
    public synchronized Request request() {
        try {
        } catch (IOException e8) {
            throw new RuntimeException("Unable to create request.", e8);
        }
        return getRawCall().request();
    }

    @Override // retrofit2.b
    public synchronized y0 timeout() {
        try {
        } catch (IOException e8) {
            throw new RuntimeException("Unable to create call.", e8);
        }
        return getRawCall().timeout();
    }

    @Override // retrofit2.b
    public o clone() {
        return new o(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }
}
