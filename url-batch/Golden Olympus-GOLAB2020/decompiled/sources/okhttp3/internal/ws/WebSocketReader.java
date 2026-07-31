package okhttp3.internal.ws;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.C3372e;
import okio.g;
import okio.h;

@Metadata
/* loaded from: classes3.dex */
public final class WebSocketReader implements Closeable, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f43223b;

    /* renamed from: c, reason: collision with root package name */
    private final g f43224c;

    /* renamed from: d, reason: collision with root package name */
    private final FrameCallback f43225d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f43226e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f43227f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f43228g;

    /* renamed from: h, reason: collision with root package name */
    private int f43229h;

    /* renamed from: i, reason: collision with root package name */
    private long f43230i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f43231j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f43232k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f43233l;

    /* renamed from: m, reason: collision with root package name */
    private final C3372e f43234m;

    /* renamed from: n, reason: collision with root package name */
    private final C3372e f43235n;

    /* renamed from: o, reason: collision with root package name */
    private MessageInflater f43236o;

    /* renamed from: p, reason: collision with root package name */
    private final byte[] f43237p;

    /* renamed from: q, reason: collision with root package name */
    private final C3372e.a f43238q;

    @Metadata
    public interface FrameCallback {
        void a(h hVar);

        void b(String str);

        void c(h hVar);

        void d(h hVar);

        void e(int i4, String str);
    }

    public WebSocketReader(boolean z4, g source, FrameCallback frameCallback, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f43223b = z4;
        this.f43224c = source;
        this.f43225d = frameCallback;
        this.f43226e = z5;
        this.f43227f = z6;
        this.f43234m = new C3372e();
        this.f43235n = new C3372e();
        this.f43237p = z4 ? null : new byte[4];
        this.f43238q = z4 ? null : new C3372e.a();
    }

    private final void J() {
        int i4 = this.f43229h;
        if (i4 != 1 && i4 != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.Q(i4));
        }
        p();
        if (this.f43233l) {
            MessageInflater messageInflater = this.f43236o;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.f43227f);
                this.f43236o = messageInflater;
            }
            messageInflater.a(this.f43235n);
        }
        if (i4 == 1) {
            this.f43225d.b(this.f43235n.i0());
        } else {
            this.f43225d.a(this.f43235n.e0());
        }
    }

    private final void N() {
        while (!this.f43228g) {
            o();
            if (!this.f43232k) {
                return;
            } else {
                n();
            }
        }
    }

    private final void n() {
        short s4;
        String str;
        long j4 = this.f43230i;
        if (j4 > 0) {
            this.f43224c.x(this.f43234m, j4);
            if (!this.f43223b) {
                C3372e c3372e = this.f43234m;
                C3372e.a aVar = this.f43238q;
                Intrinsics.checkNotNull(aVar);
                c3372e.c0(aVar);
                this.f43238q.p(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.f43222a;
                C3372e.a aVar2 = this.f43238q;
                byte[] bArr = this.f43237p;
                Intrinsics.checkNotNull(bArr);
                webSocketProtocol.b(aVar2, bArr);
                this.f43238q.close();
            }
        }
        switch (this.f43229h) {
            case 8:
                long l02 = this.f43234m.l0();
                if (l02 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (l02 != 0) {
                    s4 = this.f43234m.readShort();
                    str = this.f43234m.i0();
                    String a4 = WebSocketProtocol.f43222a.a(s4);
                    if (a4 != null) {
                        throw new ProtocolException(a4);
                    }
                } else {
                    s4 = 1005;
                    str = "";
                }
                this.f43225d.e(s4, str);
                this.f43228g = true;
                return;
            case 9:
                this.f43225d.c(this.f43234m.e0());
                return;
            case 10:
                this.f43225d.d(this.f43234m.e0());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.Q(this.f43229h));
        }
    }

    private final void o() {
        boolean z4;
        if (this.f43228g) {
            throw new IOException("closed");
        }
        long timeoutNanos = this.f43224c.timeout().timeoutNanos();
        this.f43224c.timeout().clearTimeout();
        try {
            int d4 = Util.d(this.f43224c.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            this.f43224c.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            int i4 = d4 & 15;
            this.f43229h = i4;
            boolean z5 = (d4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
            this.f43231j = z5;
            boolean z6 = (d4 & 8) != 0;
            this.f43232k = z6;
            if (z6 && !z5) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z7 = (d4 & 64) != 0;
            if (i4 == 1 || i4 == 2) {
                if (!z7) {
                    z4 = false;
                } else {
                    if (!this.f43226e) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z4 = true;
                }
                this.f43233l = z4;
            } else if (z7) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((d4 & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((d4 & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int d5 = Util.d(this.f43224c.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            boolean z8 = (d5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
            if (z8 == this.f43223b) {
                throw new ProtocolException(this.f43223b ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j4 = d5 & 127;
            this.f43230i = j4;
            if (j4 == 126) {
                this.f43230i = Util.e(this.f43224c.readShort(), 65535);
            } else if (j4 == 127) {
                long readLong = this.f43224c.readLong();
                this.f43230i = readLong;
                if (readLong < 0) {
                    throw new ProtocolException("Frame length 0x" + Util.R(this.f43230i) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f43232k && this.f43230i > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z8) {
                g gVar = this.f43224c;
                byte[] bArr = this.f43237p;
                Intrinsics.checkNotNull(bArr);
                gVar.readFully(bArr);
            }
        } catch (Throwable th) {
            this.f43224c.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void p() {
        while (!this.f43228g) {
            long j4 = this.f43230i;
            if (j4 > 0) {
                this.f43224c.x(this.f43235n, j4);
                if (!this.f43223b) {
                    C3372e c3372e = this.f43235n;
                    C3372e.a aVar = this.f43238q;
                    Intrinsics.checkNotNull(aVar);
                    c3372e.c0(aVar);
                    this.f43238q.p(this.f43235n.l0() - this.f43230i);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.f43222a;
                    C3372e.a aVar2 = this.f43238q;
                    byte[] bArr = this.f43237p;
                    Intrinsics.checkNotNull(bArr);
                    webSocketProtocol.b(aVar2, bArr);
                    this.f43238q.close();
                }
            }
            if (this.f43231j) {
                return;
            }
            N();
            if (this.f43229h != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Util.Q(this.f43229h));
            }
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageInflater messageInflater = this.f43236o;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    public final void m() {
        o();
        if (this.f43232k) {
            n();
        } else {
            J();
        }
    }
}
