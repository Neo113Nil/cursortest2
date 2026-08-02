package m0;

import a0.C0144j;
import d2.C0389g;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import v2.a0;

/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f14470g = StandardCharsets.UTF_8;

    /* renamed from: a, reason: collision with root package name */
    public final C0389g f14471a;

    /* renamed from: b, reason: collision with root package name */
    public final u0.n f14472b = new u0.n("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: c, reason: collision with root package name */
    public final Map f14473c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d, reason: collision with root package name */
    public x f14474d;

    /* renamed from: e, reason: collision with root package name */
    public Socket f14475e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f14476f;

    public y(C0389g c0389g) {
        this.f14471a = c0389g;
    }

    public final void a(Socket socket) {
        this.f14475e = socket;
        this.f14474d = new x(this, socket.getOutputStream());
        this.f14472b.f(new w(this, socket.getInputStream()), new C0144j(23, this), 0);
    }

    public final void b(a0 a0Var) {
        this.f14474d.getClass();
        x xVar = this.f14474d;
        xVar.getClass();
        xVar.f14469c.post(new g0.p(xVar, new C3.v(z.f14484h).c(a0Var).getBytes(f14470g), a0Var, 10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f14476f) {
            return;
        }
        try {
            x xVar = this.f14474d;
            if (xVar != null) {
                xVar.close();
            }
            this.f14472b.e(null);
            Socket socket = this.f14475e;
            if (socket != null) {
                socket.close();
            }
            this.f14476f = true;
        } catch (Throwable th) {
            this.f14476f = true;
            throw th;
        }
    }
}
