package H6;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g implements T6.w {

    /* renamed from: d, reason: collision with root package name */
    public final T6.w f1043d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1044e;

    /* renamed from: i, reason: collision with root package name */
    public long f1045i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1046l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1047m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1048n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f1049o;

    public g(h hVar, T6.w delegate, long j) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f1049o = hVar;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f1043d = delegate;
        this.f1044e = j;
        this.f1046l = true;
        if (j == 0) {
            d(null);
        }
    }

    public final void a() {
        this.f1043d.close();
    }

    @Override // T6.w
    public final T6.y b() {
        return this.f1043d.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1048n) {
            return;
        }
        this.f1048n = true;
        try {
            a();
            d(null);
        } catch (IOException e7) {
            IOException d7 = d(e7);
            Intrinsics.b(d7);
            throw d7;
        }
    }

    public final IOException d(IOException iOException) {
        if (this.f1047m) {
            return iOException;
        }
        this.f1047m = true;
        h hVar = this.f1049o;
        if (iOException == null && this.f1046l) {
            this.f1046l = false;
            hVar.getClass();
            q call = (q) hVar.f1052c;
            Intrinsics.checkNotNullParameter(call, "call");
        }
        return h.a(hVar, iOException, 4);
    }

    @Override // T6.w
    public final long o(long j, T6.f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f1048n) {
            throw new IllegalStateException("closed");
        }
        try {
            long o7 = this.f1043d.o(8192L, sink);
            boolean z7 = this.f1046l;
            h hVar = this.f1049o;
            if (z7) {
                this.f1046l = false;
                hVar.getClass();
                q call = (q) hVar.f1052c;
                Intrinsics.checkNotNullParameter(call, "call");
            }
            if (o7 == -1) {
                d(null);
                return -1L;
            }
            long j7 = this.f1045i + o7;
            long j8 = this.f1044e;
            if (j8 == -1 || j7 <= j8) {
                this.f1045i = j7;
                if (((I6.g) hVar.f1054e).b()) {
                    d(null);
                }
                return o7;
            }
            throw new ProtocolException("expected " + j8 + " bytes but received " + j7);
        } catch (IOException e7) {
            IOException d7 = d(e7);
            Intrinsics.b(d7);
            throw d7;
        }
    }

    public final String toString() {
        return g.class.getSimpleName() + '(' + this.f1043d + ')';
    }
}
