package okhttp3.internal.ws;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;
import okio.f;
import okio.h;

@Metadata
/* loaded from: classes3.dex */
public final class WebSocketWriter implements Closeable, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f43239b;

    /* renamed from: c, reason: collision with root package name */
    private final f f43240c;

    /* renamed from: d, reason: collision with root package name */
    private final Random f43241d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f43242e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f43243f;

    /* renamed from: g, reason: collision with root package name */
    private final long f43244g;

    /* renamed from: h, reason: collision with root package name */
    private final C3372e f43245h;

    /* renamed from: i, reason: collision with root package name */
    private final C3372e f43246i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f43247j;

    /* renamed from: k, reason: collision with root package name */
    private MessageDeflater f43248k;

    /* renamed from: l, reason: collision with root package name */
    private final byte[] f43249l;

    /* renamed from: m, reason: collision with root package name */
    private final C3372e.a f43250m;

    public WebSocketWriter(boolean z4, f sink, Random random, boolean z5, boolean z6, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f43239b = z4;
        this.f43240c = sink;
        this.f43241d = random;
        this.f43242e = z5;
        this.f43243f = z6;
        this.f43244g = j4;
        this.f43245h = new C3372e();
        this.f43246i = sink.q();
        this.f43249l = z4 ? new byte[4] : null;
        this.f43250m = z4 ? new C3372e.a() : null;
    }

    private final void b(int i4, h hVar) {
        if (this.f43247j) {
            throw new IOException("closed");
        }
        int v4 = hVar.v();
        if (v4 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f43246i.w(i4 | UserVerificationMethods.USER_VERIFY_PATTERN);
        if (this.f43239b) {
            this.f43246i.w(v4 | UserVerificationMethods.USER_VERIFY_PATTERN);
            Random random = this.f43241d;
            byte[] bArr = this.f43249l;
            Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.f43246i.L(this.f43249l);
            if (v4 > 0) {
                long l02 = this.f43246i.l0();
                this.f43246i.M(hVar);
                C3372e c3372e = this.f43246i;
                C3372e.a aVar = this.f43250m;
                Intrinsics.checkNotNull(aVar);
                c3372e.c0(aVar);
                this.f43250m.p(l02);
                WebSocketProtocol.f43222a.b(this.f43250m, this.f43249l);
                this.f43250m.close();
            }
        } else {
            this.f43246i.w(v4);
            this.f43246i.M(hVar);
        }
        this.f43240c.flush();
    }

    public final void a(int i4, h hVar) {
        h hVar2 = h.f43271f;
        if (i4 != 0 || hVar != null) {
            if (i4 != 0) {
                WebSocketProtocol.f43222a.c(i4);
            }
            C3372e c3372e = new C3372e();
            c3372e.s(i4);
            if (hVar != null) {
                c3372e.M(hVar);
            }
            hVar2 = c3372e.e0();
        }
        try {
            b(8, hVar2);
        } finally {
            this.f43247j = true;
        }
    }

    public final void c(int i4, h data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f43247j) {
            throw new IOException("closed");
        }
        this.f43245h.M(data);
        int i5 = i4 | UserVerificationMethods.USER_VERIFY_PATTERN;
        if (this.f43242e && data.v() >= this.f43244g) {
            MessageDeflater messageDeflater = this.f43248k;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.f43243f);
                this.f43248k = messageDeflater;
            }
            messageDeflater.a(this.f43245h);
            i5 = i4 | 192;
        }
        long l02 = this.f43245h.l0();
        this.f43246i.w(i5);
        int i6 = this.f43239b ? UserVerificationMethods.USER_VERIFY_PATTERN : 0;
        if (l02 <= 125) {
            this.f43246i.w(i6 | ((int) l02));
        } else if (l02 <= 65535) {
            this.f43246i.w(i6 | 126);
            this.f43246i.s((int) l02);
        } else {
            this.f43246i.w(i6 | 127);
            this.f43246i.w0(l02);
        }
        if (this.f43239b) {
            Random random = this.f43241d;
            byte[] bArr = this.f43249l;
            Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.f43246i.L(this.f43249l);
            if (l02 > 0) {
                C3372e c3372e = this.f43245h;
                C3372e.a aVar = this.f43250m;
                Intrinsics.checkNotNull(aVar);
                c3372e.c0(aVar);
                this.f43250m.p(0L);
                WebSocketProtocol.f43222a.b(this.f43250m, this.f43249l);
                this.f43250m.close();
            }
        }
        this.f43246i.write(this.f43245h, l02);
        this.f43240c.r();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.f43248k;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final void e(h payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        b(9, payload);
    }

    public final void f(h payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        b(10, payload);
    }
}
